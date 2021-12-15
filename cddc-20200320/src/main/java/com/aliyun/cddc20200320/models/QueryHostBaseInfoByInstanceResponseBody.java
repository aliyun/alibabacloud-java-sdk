// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class QueryHostBaseInfoByInstanceResponseBody extends TeaModel {
    @NameInMap("HostInstanceConsoleInfos")
    public java.util.List<QueryHostBaseInfoByInstanceResponseBodyHostInstanceConsoleInfos> hostInstanceConsoleInfos;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryHostBaseInfoByInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHostBaseInfoByInstanceResponseBody self = new QueryHostBaseInfoByInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHostBaseInfoByInstanceResponseBody setHostInstanceConsoleInfos(java.util.List<QueryHostBaseInfoByInstanceResponseBodyHostInstanceConsoleInfos> hostInstanceConsoleInfos) {
        this.hostInstanceConsoleInfos = hostInstanceConsoleInfos;
        return this;
    }
    public java.util.List<QueryHostBaseInfoByInstanceResponseBodyHostInstanceConsoleInfos> getHostInstanceConsoleInfos() {
        return this.hostInstanceConsoleInfos;
    }

    public QueryHostBaseInfoByInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryHostBaseInfoByInstanceResponseBodyHostInstanceConsoleInfos extends TeaModel {
        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("Port")
        public String port;

        @NameInMap("Role")
        public String role;

        @NameInMap("Status")
        public String status;

        @NameInMap("VpcId")
        public String vpcId;

        public static QueryHostBaseInfoByInstanceResponseBodyHostInstanceConsoleInfos build(java.util.Map<String, ?> map) throws Exception {
            QueryHostBaseInfoByInstanceResponseBodyHostInstanceConsoleInfos self = new QueryHostBaseInfoByInstanceResponseBodyHostInstanceConsoleInfos();
            return TeaModel.build(map, self);
        }

        public QueryHostBaseInfoByInstanceResponseBodyHostInstanceConsoleInfos setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public QueryHostBaseInfoByInstanceResponseBodyHostInstanceConsoleInfos setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public QueryHostBaseInfoByInstanceResponseBodyHostInstanceConsoleInfos setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public QueryHostBaseInfoByInstanceResponseBodyHostInstanceConsoleInfos setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public QueryHostBaseInfoByInstanceResponseBodyHostInstanceConsoleInfos setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public QueryHostBaseInfoByInstanceResponseBodyHostInstanceConsoleInfos setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public QueryHostBaseInfoByInstanceResponseBodyHostInstanceConsoleInfos setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public QueryHostBaseInfoByInstanceResponseBodyHostInstanceConsoleInfos setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public QueryHostBaseInfoByInstanceResponseBodyHostInstanceConsoleInfos setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryHostBaseInfoByInstanceResponseBodyHostInstanceConsoleInfos setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
