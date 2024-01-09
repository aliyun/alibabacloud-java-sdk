// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeSummaryResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    /**
     * <p>-</p>
     */
    @NameInMap("DbServerCount")
    public Long dbServerCount;

    @NameInMap("Message")
    public String message;

    @NameInMap("ReplicationDetails")
    public DescribeSummaryResponseBodyReplicationDetails replicationDetails;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServerCount")
    public Long serverCount;

    @NameInMap("SiteCount")
    public Long siteCount;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalSize")
    public Long totalSize;

    public static DescribeSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSummaryResponseBody self = new DescribeSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSummaryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSummaryResponseBody setDbServerCount(Long dbServerCount) {
        this.dbServerCount = dbServerCount;
        return this;
    }
    public Long getDbServerCount() {
        return this.dbServerCount;
    }

    public DescribeSummaryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSummaryResponseBody setReplicationDetails(DescribeSummaryResponseBodyReplicationDetails replicationDetails) {
        this.replicationDetails = replicationDetails;
        return this;
    }
    public DescribeSummaryResponseBodyReplicationDetails getReplicationDetails() {
        return this.replicationDetails;
    }

    public DescribeSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSummaryResponseBody setServerCount(Long serverCount) {
        this.serverCount = serverCount;
        return this;
    }
    public Long getServerCount() {
        return this.serverCount;
    }

    public DescribeSummaryResponseBody setSiteCount(Long siteCount) {
        this.siteCount = siteCount;
        return this;
    }
    public Long getSiteCount() {
        return this.siteCount;
    }

    public DescribeSummaryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeSummaryResponseBody setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public static class DescribeSummaryResponseBodyReplicationDetailsCriticalServersCriticalServer extends TeaModel {
        @NameInMap("ConnectionStatus")
        public String connectionStatus;

        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>RPO</p>
         */
        @NameInMap("Rpo")
        public Long rpo;

        @NameInMap("ServerId")
        public String serverId;

        @NameInMap("SitePairId")
        public String sitePairId;

        @NameInMap("Status")
        public String status;

        public static DescribeSummaryResponseBodyReplicationDetailsCriticalServersCriticalServer build(java.util.Map<String, ?> map) throws Exception {
            DescribeSummaryResponseBodyReplicationDetailsCriticalServersCriticalServer self = new DescribeSummaryResponseBodyReplicationDetailsCriticalServersCriticalServer();
            return TeaModel.build(map, self);
        }

        public DescribeSummaryResponseBodyReplicationDetailsCriticalServersCriticalServer setConnectionStatus(String connectionStatus) {
            this.connectionStatus = connectionStatus;
            return this;
        }
        public String getConnectionStatus() {
            return this.connectionStatus;
        }

        public DescribeSummaryResponseBodyReplicationDetailsCriticalServersCriticalServer setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeSummaryResponseBodyReplicationDetailsCriticalServersCriticalServer setRpo(Long rpo) {
            this.rpo = rpo;
            return this;
        }
        public Long getRpo() {
            return this.rpo;
        }

        public DescribeSummaryResponseBodyReplicationDetailsCriticalServersCriticalServer setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public DescribeSummaryResponseBodyReplicationDetailsCriticalServersCriticalServer setSitePairId(String sitePairId) {
            this.sitePairId = sitePairId;
            return this;
        }
        public String getSitePairId() {
            return this.sitePairId;
        }

        public DescribeSummaryResponseBodyReplicationDetailsCriticalServersCriticalServer setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeSummaryResponseBodyReplicationDetailsCriticalServers extends TeaModel {
        @NameInMap("criticalServer")
        public java.util.List<DescribeSummaryResponseBodyReplicationDetailsCriticalServersCriticalServer> criticalServer;

        public static DescribeSummaryResponseBodyReplicationDetailsCriticalServers build(java.util.Map<String, ?> map) throws Exception {
            DescribeSummaryResponseBodyReplicationDetailsCriticalServers self = new DescribeSummaryResponseBodyReplicationDetailsCriticalServers();
            return TeaModel.build(map, self);
        }

        public DescribeSummaryResponseBodyReplicationDetailsCriticalServers setCriticalServer(java.util.List<DescribeSummaryResponseBodyReplicationDetailsCriticalServersCriticalServer> criticalServer) {
            this.criticalServer = criticalServer;
            return this;
        }
        public java.util.List<DescribeSummaryResponseBodyReplicationDetailsCriticalServersCriticalServer> getCriticalServer() {
            return this.criticalServer;
        }

    }

    public static class DescribeSummaryResponseBodyReplicationDetailsNotApplicableServersNotApplicableServer extends TeaModel {
        @NameInMap("ConnectionStatus")
        public String connectionStatus;

        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>RPO</p>
         */
        @NameInMap("Rpo")
        public Long rpo;

        @NameInMap("ServerId")
        public String serverId;

        @NameInMap("SitePairId")
        public String sitePairId;

        @NameInMap("Status")
        public String status;

        public static DescribeSummaryResponseBodyReplicationDetailsNotApplicableServersNotApplicableServer build(java.util.Map<String, ?> map) throws Exception {
            DescribeSummaryResponseBodyReplicationDetailsNotApplicableServersNotApplicableServer self = new DescribeSummaryResponseBodyReplicationDetailsNotApplicableServersNotApplicableServer();
            return TeaModel.build(map, self);
        }

        public DescribeSummaryResponseBodyReplicationDetailsNotApplicableServersNotApplicableServer setConnectionStatus(String connectionStatus) {
            this.connectionStatus = connectionStatus;
            return this;
        }
        public String getConnectionStatus() {
            return this.connectionStatus;
        }

        public DescribeSummaryResponseBodyReplicationDetailsNotApplicableServersNotApplicableServer setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeSummaryResponseBodyReplicationDetailsNotApplicableServersNotApplicableServer setRpo(Long rpo) {
            this.rpo = rpo;
            return this;
        }
        public Long getRpo() {
            return this.rpo;
        }

        public DescribeSummaryResponseBodyReplicationDetailsNotApplicableServersNotApplicableServer setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public DescribeSummaryResponseBodyReplicationDetailsNotApplicableServersNotApplicableServer setSitePairId(String sitePairId) {
            this.sitePairId = sitePairId;
            return this;
        }
        public String getSitePairId() {
            return this.sitePairId;
        }

        public DescribeSummaryResponseBodyReplicationDetailsNotApplicableServersNotApplicableServer setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeSummaryResponseBodyReplicationDetailsNotApplicableServers extends TeaModel {
        @NameInMap("notApplicableServer")
        public java.util.List<DescribeSummaryResponseBodyReplicationDetailsNotApplicableServersNotApplicableServer> notApplicableServer;

        public static DescribeSummaryResponseBodyReplicationDetailsNotApplicableServers build(java.util.Map<String, ?> map) throws Exception {
            DescribeSummaryResponseBodyReplicationDetailsNotApplicableServers self = new DescribeSummaryResponseBodyReplicationDetailsNotApplicableServers();
            return TeaModel.build(map, self);
        }

        public DescribeSummaryResponseBodyReplicationDetailsNotApplicableServers setNotApplicableServer(java.util.List<DescribeSummaryResponseBodyReplicationDetailsNotApplicableServersNotApplicableServer> notApplicableServer) {
            this.notApplicableServer = notApplicableServer;
            return this;
        }
        public java.util.List<DescribeSummaryResponseBodyReplicationDetailsNotApplicableServersNotApplicableServer> getNotApplicableServer() {
            return this.notApplicableServer;
        }

    }

    public static class DescribeSummaryResponseBodyReplicationDetailsWarningServersWarningServer extends TeaModel {
        @NameInMap("ConnectionStatus")
        public String connectionStatus;

        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>RPO</p>
         */
        @NameInMap("Rpo")
        public Long rpo;

        @NameInMap("ServerId")
        public String serverId;

        @NameInMap("SitePairId")
        public String sitePairId;

        @NameInMap("Status")
        public String status;

        public static DescribeSummaryResponseBodyReplicationDetailsWarningServersWarningServer build(java.util.Map<String, ?> map) throws Exception {
            DescribeSummaryResponseBodyReplicationDetailsWarningServersWarningServer self = new DescribeSummaryResponseBodyReplicationDetailsWarningServersWarningServer();
            return TeaModel.build(map, self);
        }

        public DescribeSummaryResponseBodyReplicationDetailsWarningServersWarningServer setConnectionStatus(String connectionStatus) {
            this.connectionStatus = connectionStatus;
            return this;
        }
        public String getConnectionStatus() {
            return this.connectionStatus;
        }

        public DescribeSummaryResponseBodyReplicationDetailsWarningServersWarningServer setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeSummaryResponseBodyReplicationDetailsWarningServersWarningServer setRpo(Long rpo) {
            this.rpo = rpo;
            return this;
        }
        public Long getRpo() {
            return this.rpo;
        }

        public DescribeSummaryResponseBodyReplicationDetailsWarningServersWarningServer setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public DescribeSummaryResponseBodyReplicationDetailsWarningServersWarningServer setSitePairId(String sitePairId) {
            this.sitePairId = sitePairId;
            return this;
        }
        public String getSitePairId() {
            return this.sitePairId;
        }

        public DescribeSummaryResponseBodyReplicationDetailsWarningServersWarningServer setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeSummaryResponseBodyReplicationDetailsWarningServers extends TeaModel {
        @NameInMap("warningServer")
        public java.util.List<DescribeSummaryResponseBodyReplicationDetailsWarningServersWarningServer> warningServer;

        public static DescribeSummaryResponseBodyReplicationDetailsWarningServers build(java.util.Map<String, ?> map) throws Exception {
            DescribeSummaryResponseBodyReplicationDetailsWarningServers self = new DescribeSummaryResponseBodyReplicationDetailsWarningServers();
            return TeaModel.build(map, self);
        }

        public DescribeSummaryResponseBodyReplicationDetailsWarningServers setWarningServer(java.util.List<DescribeSummaryResponseBodyReplicationDetailsWarningServersWarningServer> warningServer) {
            this.warningServer = warningServer;
            return this;
        }
        public java.util.List<DescribeSummaryResponseBodyReplicationDetailsWarningServersWarningServer> getWarningServer() {
            return this.warningServer;
        }

    }

    public static class DescribeSummaryResponseBodyReplicationDetails extends TeaModel {
        @NameInMap("CriticalServers")
        public DescribeSummaryResponseBodyReplicationDetailsCriticalServers criticalServers;

        @NameInMap("NotApplicableServers")
        public DescribeSummaryResponseBodyReplicationDetailsNotApplicableServers notApplicableServers;

        @NameInMap("WarningServers")
        public DescribeSummaryResponseBodyReplicationDetailsWarningServers warningServers;

        public static DescribeSummaryResponseBodyReplicationDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeSummaryResponseBodyReplicationDetails self = new DescribeSummaryResponseBodyReplicationDetails();
            return TeaModel.build(map, self);
        }

        public DescribeSummaryResponseBodyReplicationDetails setCriticalServers(DescribeSummaryResponseBodyReplicationDetailsCriticalServers criticalServers) {
            this.criticalServers = criticalServers;
            return this;
        }
        public DescribeSummaryResponseBodyReplicationDetailsCriticalServers getCriticalServers() {
            return this.criticalServers;
        }

        public DescribeSummaryResponseBodyReplicationDetails setNotApplicableServers(DescribeSummaryResponseBodyReplicationDetailsNotApplicableServers notApplicableServers) {
            this.notApplicableServers = notApplicableServers;
            return this;
        }
        public DescribeSummaryResponseBodyReplicationDetailsNotApplicableServers getNotApplicableServers() {
            return this.notApplicableServers;
        }

        public DescribeSummaryResponseBodyReplicationDetails setWarningServers(DescribeSummaryResponseBodyReplicationDetailsWarningServers warningServers) {
            this.warningServers = warningServers;
            return this;
        }
        public DescribeSummaryResponseBodyReplicationDetailsWarningServers getWarningServers() {
            return this.warningServers;
        }

    }

}
