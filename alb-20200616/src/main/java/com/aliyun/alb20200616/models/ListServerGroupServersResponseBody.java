// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListServerGroupServersResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries returned.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results. Valid values:</p>
     * <br>
     * <p>*   If **NextToken** is empty, no next page exists.</p>
     * <p>*   If **NextToken** is not empty, the value of NextToken can be used in the next request to retrieve a new page of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
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
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The port used by the backend server. Valid values: **1** to **65535**.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>Indicates whether the remote IP address feature is enabled. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("RemoteIpEnabled")
        public Boolean remoteIpEnabled;

        /**
         * <p>The ID of the server group.</p>
         */
        @NameInMap("ServerGroupId")
        public String serverGroupId;

        /**
         * <p>The ID of the backend server.</p>
         * <br>
         * <p>> If **ServerType** is set to **Fc**, **ServerId** is the ARN of a function.</p>
         */
        @NameInMap("ServerId")
        public String serverId;

        /**
         * <p>The IP address in inclusive ENI mode.</p>
         */
        @NameInMap("ServerIp")
        public String serverIp;

        /**
         * <p>The type of the backend server.</p>
         */
        @NameInMap("ServerType")
        public String serverType;

        /**
         * <p>The status of the backend server. Valid values:</p>
         * <br>
         * <p>*   **Adding**</p>
         * <p>*   **Available**</p>
         * <p>*   **Configuring**</p>
         * <p>*   **Removing**</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The weight of the backend server. An ECS instance with a higher weight receives more requests.</p>
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
