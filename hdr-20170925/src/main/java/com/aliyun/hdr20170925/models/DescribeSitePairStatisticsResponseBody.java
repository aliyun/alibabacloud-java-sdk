// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeSitePairStatisticsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("PrimarySiteGatewayInfo")
    public DescribeSitePairStatisticsResponseBodyPrimarySiteGatewayInfo primarySiteGatewayInfo;

    @NameInMap("PrimarySiteServers")
    public DescribeSitePairStatisticsResponseBodyPrimarySiteServers primarySiteServers;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecondarySiteGatewayInfo")
    public DescribeSitePairStatisticsResponseBodySecondarySiteGatewayInfo secondarySiteGatewayInfo;

    @NameInMap("SecondarySiteServers")
    public DescribeSitePairStatisticsResponseBodySecondarySiteServers secondarySiteServers;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeSitePairStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSitePairStatisticsResponseBody self = new DescribeSitePairStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSitePairStatisticsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSitePairStatisticsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSitePairStatisticsResponseBody setPrimarySiteGatewayInfo(DescribeSitePairStatisticsResponseBodyPrimarySiteGatewayInfo primarySiteGatewayInfo) {
        this.primarySiteGatewayInfo = primarySiteGatewayInfo;
        return this;
    }
    public DescribeSitePairStatisticsResponseBodyPrimarySiteGatewayInfo getPrimarySiteGatewayInfo() {
        return this.primarySiteGatewayInfo;
    }

    public DescribeSitePairStatisticsResponseBody setPrimarySiteServers(DescribeSitePairStatisticsResponseBodyPrimarySiteServers primarySiteServers) {
        this.primarySiteServers = primarySiteServers;
        return this;
    }
    public DescribeSitePairStatisticsResponseBodyPrimarySiteServers getPrimarySiteServers() {
        return this.primarySiteServers;
    }

    public DescribeSitePairStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSitePairStatisticsResponseBody setSecondarySiteGatewayInfo(DescribeSitePairStatisticsResponseBodySecondarySiteGatewayInfo secondarySiteGatewayInfo) {
        this.secondarySiteGatewayInfo = secondarySiteGatewayInfo;
        return this;
    }
    public DescribeSitePairStatisticsResponseBodySecondarySiteGatewayInfo getSecondarySiteGatewayInfo() {
        return this.secondarySiteGatewayInfo;
    }

    public DescribeSitePairStatisticsResponseBody setSecondarySiteServers(DescribeSitePairStatisticsResponseBodySecondarySiteServers secondarySiteServers) {
        this.secondarySiteServers = secondarySiteServers;
        return this;
    }
    public DescribeSitePairStatisticsResponseBodySecondarySiteServers getSecondarySiteServers() {
        return this.secondarySiteServers;
    }

    public DescribeSitePairStatisticsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeSitePairStatisticsResponseBodyPrimarySiteGatewayInfo extends TeaModel {
        @NameInMap("GatewayId")
        public String gatewayId;

        @NameInMap("HeartbeatedTime")
        public Long heartbeatedTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("Version")
        public String version;

        public static DescribeSitePairStatisticsResponseBodyPrimarySiteGatewayInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeSitePairStatisticsResponseBodyPrimarySiteGatewayInfo self = new DescribeSitePairStatisticsResponseBodyPrimarySiteGatewayInfo();
            return TeaModel.build(map, self);
        }

        public DescribeSitePairStatisticsResponseBodyPrimarySiteGatewayInfo setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public DescribeSitePairStatisticsResponseBodyPrimarySiteGatewayInfo setHeartbeatedTime(Long heartbeatedTime) {
            this.heartbeatedTime = heartbeatedTime;
            return this;
        }
        public Long getHeartbeatedTime() {
            return this.heartbeatedTime;
        }

        public DescribeSitePairStatisticsResponseBodyPrimarySiteGatewayInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSitePairStatisticsResponseBodyPrimarySiteGatewayInfo setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeSitePairStatisticsResponseBodyPrimarySiteServersServer extends TeaModel {
        @NameInMap("AgentVersion")
        public String agentVersion;

        @NameInMap("ConnectionStatus")
        public String connectionStatus;

        @NameInMap("IpAddress")
        public String ipAddress;

        @NameInMap("ServerId")
        public String serverId;

        public static DescribeSitePairStatisticsResponseBodyPrimarySiteServersServer build(java.util.Map<String, ?> map) throws Exception {
            DescribeSitePairStatisticsResponseBodyPrimarySiteServersServer self = new DescribeSitePairStatisticsResponseBodyPrimarySiteServersServer();
            return TeaModel.build(map, self);
        }

        public DescribeSitePairStatisticsResponseBodyPrimarySiteServersServer setAgentVersion(String agentVersion) {
            this.agentVersion = agentVersion;
            return this;
        }
        public String getAgentVersion() {
            return this.agentVersion;
        }

        public DescribeSitePairStatisticsResponseBodyPrimarySiteServersServer setConnectionStatus(String connectionStatus) {
            this.connectionStatus = connectionStatus;
            return this;
        }
        public String getConnectionStatus() {
            return this.connectionStatus;
        }

        public DescribeSitePairStatisticsResponseBodyPrimarySiteServersServer setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public DescribeSitePairStatisticsResponseBodyPrimarySiteServersServer setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

    }

    public static class DescribeSitePairStatisticsResponseBodyPrimarySiteServers extends TeaModel {
        @NameInMap("server")
        public java.util.List<DescribeSitePairStatisticsResponseBodyPrimarySiteServersServer> server;

        public static DescribeSitePairStatisticsResponseBodyPrimarySiteServers build(java.util.Map<String, ?> map) throws Exception {
            DescribeSitePairStatisticsResponseBodyPrimarySiteServers self = new DescribeSitePairStatisticsResponseBodyPrimarySiteServers();
            return TeaModel.build(map, self);
        }

        public DescribeSitePairStatisticsResponseBodyPrimarySiteServers setServer(java.util.List<DescribeSitePairStatisticsResponseBodyPrimarySiteServersServer> server) {
            this.server = server;
            return this;
        }
        public java.util.List<DescribeSitePairStatisticsResponseBodyPrimarySiteServersServer> getServer() {
            return this.server;
        }

    }

    public static class DescribeSitePairStatisticsResponseBodySecondarySiteGatewayInfo extends TeaModel {
        @NameInMap("GatewayId")
        public String gatewayId;

        @NameInMap("HeartbeatedTime")
        public Long heartbeatedTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("Version")
        public String version;

        public static DescribeSitePairStatisticsResponseBodySecondarySiteGatewayInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeSitePairStatisticsResponseBodySecondarySiteGatewayInfo self = new DescribeSitePairStatisticsResponseBodySecondarySiteGatewayInfo();
            return TeaModel.build(map, self);
        }

        public DescribeSitePairStatisticsResponseBodySecondarySiteGatewayInfo setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public DescribeSitePairStatisticsResponseBodySecondarySiteGatewayInfo setHeartbeatedTime(Long heartbeatedTime) {
            this.heartbeatedTime = heartbeatedTime;
            return this;
        }
        public Long getHeartbeatedTime() {
            return this.heartbeatedTime;
        }

        public DescribeSitePairStatisticsResponseBodySecondarySiteGatewayInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSitePairStatisticsResponseBodySecondarySiteGatewayInfo setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeSitePairStatisticsResponseBodySecondarySiteServersServer extends TeaModel {
        @NameInMap("AgentVersion")
        public String agentVersion;

        @NameInMap("ConnectionStatus")
        public String connectionStatus;

        @NameInMap("IpAddress")
        public String ipAddress;

        @NameInMap("ServerId")
        public String serverId;

        public static DescribeSitePairStatisticsResponseBodySecondarySiteServersServer build(java.util.Map<String, ?> map) throws Exception {
            DescribeSitePairStatisticsResponseBodySecondarySiteServersServer self = new DescribeSitePairStatisticsResponseBodySecondarySiteServersServer();
            return TeaModel.build(map, self);
        }

        public DescribeSitePairStatisticsResponseBodySecondarySiteServersServer setAgentVersion(String agentVersion) {
            this.agentVersion = agentVersion;
            return this;
        }
        public String getAgentVersion() {
            return this.agentVersion;
        }

        public DescribeSitePairStatisticsResponseBodySecondarySiteServersServer setConnectionStatus(String connectionStatus) {
            this.connectionStatus = connectionStatus;
            return this;
        }
        public String getConnectionStatus() {
            return this.connectionStatus;
        }

        public DescribeSitePairStatisticsResponseBodySecondarySiteServersServer setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public DescribeSitePairStatisticsResponseBodySecondarySiteServersServer setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

    }

    public static class DescribeSitePairStatisticsResponseBodySecondarySiteServers extends TeaModel {
        @NameInMap("server")
        public java.util.List<DescribeSitePairStatisticsResponseBodySecondarySiteServersServer> server;

        public static DescribeSitePairStatisticsResponseBodySecondarySiteServers build(java.util.Map<String, ?> map) throws Exception {
            DescribeSitePairStatisticsResponseBodySecondarySiteServers self = new DescribeSitePairStatisticsResponseBodySecondarySiteServers();
            return TeaModel.build(map, self);
        }

        public DescribeSitePairStatisticsResponseBodySecondarySiteServers setServer(java.util.List<DescribeSitePairStatisticsResponseBodySecondarySiteServersServer> server) {
            this.server = server;
            return this;
        }
        public java.util.List<DescribeSitePairStatisticsResponseBodySecondarySiteServersServer> getServer() {
            return this.server;
        }

    }

}
