// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class QueryHostBaseInfoByInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HostInstanceConsoleInfos")
    public java.util.List<QueryHostBaseInfoByInstanceResponseBodyHostInstanceConsoleInfos> hostInstanceConsoleInfos;

    public static QueryHostBaseInfoByInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHostBaseInfoByInstanceResponseBody self = new QueryHostBaseInfoByInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHostBaseInfoByInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHostBaseInfoByInstanceResponseBody setHostInstanceConsoleInfos(java.util.List<QueryHostBaseInfoByInstanceResponseBodyHostInstanceConsoleInfos> hostInstanceConsoleInfos) {
        this.hostInstanceConsoleInfos = hostInstanceConsoleInfos;
        return this;
    }
    public java.util.List<QueryHostBaseInfoByInstanceResponseBodyHostInstanceConsoleInfos> getHostInstanceConsoleInfos() {
        return this.hostInstanceConsoleInfos;
    }

    public static class QueryHostBaseInfoByInstanceResponseBodyHostInstanceConsoleInfos extends TeaModel {
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("Status")
        public String status;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("Role")
        public String role;

        @NameInMap("Port")
        public String port;

        @NameInMap("EngineVersion")
        public String engineVersion;

        public static QueryHostBaseInfoByInstanceResponseBodyHostInstanceConsoleInfos build(java.util.Map<String, ?> map) throws Exception {
            QueryHostBaseInfoByInstanceResponseBodyHostInstanceConsoleInfos self = new QueryHostBaseInfoByInstanceResponseBodyHostInstanceConsoleInfos();
            return TeaModel.build(map, self);
        }

        public QueryHostBaseInfoByInstanceResponseBodyHostInstanceConsoleInfos setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public QueryHostBaseInfoByInstanceResponseBodyHostInstanceConsoleInfos setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryHostBaseInfoByInstanceResponseBodyHostInstanceConsoleInfos setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public QueryHostBaseInfoByInstanceResponseBodyHostInstanceConsoleInfos setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public QueryHostBaseInfoByInstanceResponseBodyHostInstanceConsoleInfos setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public QueryHostBaseInfoByInstanceResponseBodyHostInstanceConsoleInfos setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public QueryHostBaseInfoByInstanceResponseBodyHostInstanceConsoleInfos setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public QueryHostBaseInfoByInstanceResponseBodyHostInstanceConsoleInfos setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public QueryHostBaseInfoByInstanceResponseBodyHostInstanceConsoleInfos setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public QueryHostBaseInfoByInstanceResponseBodyHostInstanceConsoleInfos setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

    }

}
