// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListServerGroupServersResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
     * <li>If <strong>NextToken</strong> is not empty, the value of NextToken can be used in the next request to retrieve a new page of results.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f8****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BA984</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>A list of backend servers.</p>
     */
    @NameInMap("Servers")
    public java.util.List<ListServerGroupServersResponseBodyServers> servers;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListServerGroupServersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServerGroupServersResponseBody self = new ListServerGroupServersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServerGroupServersResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServerGroupServersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServerGroupServersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServerGroupServersResponseBody setServers(java.util.List<ListServerGroupServersResponseBodyServers> servers) {
        this.servers = servers;
        return this;
    }
    public java.util.List<ListServerGroupServersResponseBodyServers> getServers() {
        return this.servers;
    }

    public ListServerGroupServersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListServerGroupServersResponseBodyServers extends TeaModel {
        /**
         * <p>The description of the backend server.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The port used by the backend server. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>Indicates whether the remote IP address feature is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("RemoteIpEnabled")
        public Boolean remoteIpEnabled;

        /**
         * <p>The ID of the server group.</p>
         * 
         * <strong>example:</strong>
         * <p>sgp-qy042e1jabmprh****</p>
         */
        @NameInMap("ServerGroupId")
        public String serverGroupId;

        /**
         * <p>The ID of the backend server.</p>
         * <blockquote>
         * <p>If <strong>ServerType</strong> is set to <strong>Fc</strong>, <strong>ServerId</strong> is the ARN of a function.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>i-bp1f9kdprbgy9uiu****</p>
         */
        @NameInMap("ServerId")
        public String serverId;

        /**
         * <p>The IP address in inclusive ENI mode.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("ServerIp")
        public String serverIp;

        /**
         * <p>The type of the backend server.</p>
         * 
         * <strong>example:</strong>
         * <p>Ecs</p>
         */
        @NameInMap("ServerType")
        public String serverType;

        /**
         * <p>The status of the backend server. Valid values:</p>
         * <ul>
         * <li><strong>Adding</strong></li>
         * <li><strong>Available</strong></li>
         * <li><strong>Configuring</strong></li>
         * <li><strong>Removing</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The weight of the backend server. An ECS instance with a higher weight receives more requests.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static ListServerGroupServersResponseBodyServers build(java.util.Map<String, ?> map) throws Exception {
            ListServerGroupServersResponseBodyServers self = new ListServerGroupServersResponseBodyServers();
            return TeaModel.build(map, self);
        }

        public ListServerGroupServersResponseBodyServers setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListServerGroupServersResponseBodyServers setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ListServerGroupServersResponseBodyServers setRemoteIpEnabled(Boolean remoteIpEnabled) {
            this.remoteIpEnabled = remoteIpEnabled;
            return this;
        }
        public Boolean getRemoteIpEnabled() {
            return this.remoteIpEnabled;
        }

        public ListServerGroupServersResponseBodyServers setServerGroupId(String serverGroupId) {
            this.serverGroupId = serverGroupId;
            return this;
        }
        public String getServerGroupId() {
            return this.serverGroupId;
        }

        public ListServerGroupServersResponseBodyServers setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public ListServerGroupServersResponseBodyServers setServerIp(String serverIp) {
            this.serverIp = serverIp;
            return this;
        }
        public String getServerIp() {
            return this.serverIp;
        }

        public ListServerGroupServersResponseBodyServers setServerType(String serverType) {
            this.serverType = serverType;
            return this;
        }
        public String getServerType() {
            return this.serverType;
        }

        public ListServerGroupServersResponseBodyServers setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListServerGroupServersResponseBodyServers setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

}
