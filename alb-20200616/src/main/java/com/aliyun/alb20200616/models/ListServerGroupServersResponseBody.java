// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListServerGroupServersResponseBody extends TeaModel {
    // 本次查询返回记录数量
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 分页查询标识
    @NameInMap("NextToken")
    public String nextToken;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 后端服务器
    @NameInMap("Servers")
    public java.util.List<ListServerGroupServersResponseBodyServers> servers;

    // 总记录数
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
        // 描述信息
        @NameInMap("Description")
        public String description;

        // 端口
        @NameInMap("Port")
        public Integer port;

        // 服务器id
        @NameInMap("ServerId")
        public String serverId;

        // 服务器ip
        @NameInMap("ServerIp")
        public String serverIp;

        // 后端服务器类型
        @NameInMap("ServerType")
        public String serverType;

        // 状态
        @NameInMap("Status")
        public String status;

        // 权重
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
