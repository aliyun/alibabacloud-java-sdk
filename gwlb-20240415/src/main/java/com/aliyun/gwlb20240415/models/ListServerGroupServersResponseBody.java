// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gwlb20240415.models;

import com.aliyun.tea.*;

public class ListServerGroupServersResponseBody extends TeaModel {
    /**
     * <p>The number of entries per page.</p>
     * <p>Valid values: 1 to 1000.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>If NextToken is empty, no next page exists.</li>
     * <li>You must specify the token that is obtained from the previous query as the value of NextToken.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>54B48E3D-DF70-471B-AA93-08E683A1B45</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The backend servers.</p>
     */
    @NameInMap("Servers")
    public java.util.List<ListServerGroupServersResponseBodyServers> servers;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * <p>The backend server port. Valid values:</p>
         * <ul>
         * <li><strong>6081</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>6081</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The server group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sgp-atstuj3rtoptyui****</p>
         */
        @NameInMap("ServerGroupId")
        public String serverGroupId;

        /**
         * <p>The backend server ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp67acfmxazb4p****</p>
         */
        @NameInMap("ServerId")
        public String serverId;

        /**
         * <p>The IP address of the backend server.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.xxx.xxx</p>
         */
        @NameInMap("ServerIp")
        public String serverIp;

        /**
         * <p>The type of the backend server. Valid values:</p>
         * <ul>
         * <li><strong>Ecs</strong>: Elastic Compute Service (ECS) instance</li>
         * <li><strong>Eni</strong>: elastic network interface (ENI)</li>
         * <li><strong>Eci</strong>: elastic container instance</li>
         * <li><strong>Ip</strong>: IP address</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Ecs</p>
         */
        @NameInMap("ServerType")
        public String serverType;

        /**
         * <p>Indicates the status of the backend server. Valid values:</p>
         * <ul>
         * <li><strong>Adding</strong>: The backend server is being added.</li>
         * <li><strong>Available</strong>: The backend server is available.</li>
         * <li><strong>Draining</strong>: The backend server is in connection draining.</li>
         * <li><strong>Removing</strong>: The backend server is being removed.</li>
         * <li><strong>Replacing</strong>: The backend server is being replaced.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListServerGroupServersResponseBodyServers build(java.util.Map<String, ?> map) throws Exception {
            ListServerGroupServersResponseBodyServers self = new ListServerGroupServersResponseBodyServers();
            return TeaModel.build(map, self);
        }

        public ListServerGroupServersResponseBodyServers setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
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

    }

}
