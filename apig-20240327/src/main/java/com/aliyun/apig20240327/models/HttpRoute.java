// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HttpRoute extends TeaModel {
    @NameInMap("backend")
    public Backend backend;

    @NameInMap("createTimestamp")
    public Long createTimestamp;

    @NameInMap("deployStatus")
    public String deployStatus;

    @NameInMap("description")
    public String description;

    @NameInMap("domainInfos")
    public java.util.List<HttpRouteDomainInfos> domainInfos;

    @NameInMap("environmentInfo")
    public HttpRouteEnvironmentInfo environmentInfo;

    @NameInMap("gatewayStatus")
    public java.util.Map<String, String> gatewayStatus;

    @NameInMap("match")
    public HttpRouteMatch match;

    @NameInMap("name")
    public String name;

    @NameInMap("routeId")
    public String routeId;

    @NameInMap("updateTimestamp")
    public Long updateTimestamp;

    public static HttpRoute build(java.util.Map<String, ?> map) throws Exception {
        HttpRoute self = new HttpRoute();
        return TeaModel.build(map, self);
    }

    public HttpRoute setBackend(Backend backend) {
        this.backend = backend;
        return this;
    }
    public Backend getBackend() {
        return this.backend;
    }

    public HttpRoute setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public HttpRoute setDeployStatus(String deployStatus) {
        this.deployStatus = deployStatus;
        return this;
    }
    public String getDeployStatus() {
        return this.deployStatus;
    }

    public HttpRoute setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public HttpRoute setDomainInfos(java.util.List<HttpRouteDomainInfos> domainInfos) {
        this.domainInfos = domainInfos;
        return this;
    }
    public java.util.List<HttpRouteDomainInfos> getDomainInfos() {
        return this.domainInfos;
    }

    public HttpRoute setEnvironmentInfo(HttpRouteEnvironmentInfo environmentInfo) {
        this.environmentInfo = environmentInfo;
        return this;
    }
    public HttpRouteEnvironmentInfo getEnvironmentInfo() {
        return this.environmentInfo;
    }

    public HttpRoute setGatewayStatus(java.util.Map<String, String> gatewayStatus) {
        this.gatewayStatus = gatewayStatus;
        return this;
    }
    public java.util.Map<String, String> getGatewayStatus() {
        return this.gatewayStatus;
    }

    public HttpRoute setMatch(HttpRouteMatch match) {
        this.match = match;
        return this;
    }
    public HttpRouteMatch getMatch() {
        return this.match;
    }

    public HttpRoute setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public HttpRoute setRouteId(String routeId) {
        this.routeId = routeId;
        return this;
    }
    public String getRouteId() {
        return this.routeId;
    }

    public HttpRoute setUpdateTimestamp(Long updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public static class HttpRouteDomainInfos extends TeaModel {
        @NameInMap("domainId")
        public String domainId;

        @NameInMap("name")
        public String name;

        @NameInMap("protocol")
        public String protocol;

        public static HttpRouteDomainInfos build(java.util.Map<String, ?> map) throws Exception {
            HttpRouteDomainInfos self = new HttpRouteDomainInfos();
            return TeaModel.build(map, self);
        }

        public HttpRouteDomainInfos setDomainId(String domainId) {
            this.domainId = domainId;
            return this;
        }
        public String getDomainId() {
            return this.domainId;
        }

        public HttpRouteDomainInfos setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public HttpRouteDomainInfos setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class HttpRouteEnvironmentInfoGatewayInfo extends TeaModel {
        @NameInMap("gatewayId")
        public String gatewayId;

        @NameInMap("name")
        public String name;

        public static HttpRouteEnvironmentInfoGatewayInfo build(java.util.Map<String, ?> map) throws Exception {
            HttpRouteEnvironmentInfoGatewayInfo self = new HttpRouteEnvironmentInfoGatewayInfo();
            return TeaModel.build(map, self);
        }

        public HttpRouteEnvironmentInfoGatewayInfo setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public HttpRouteEnvironmentInfoGatewayInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class HttpRouteEnvironmentInfoSubDomains extends TeaModel {
        @NameInMap("domainId")
        public String domainId;

        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>Internet</p>
         */
        @NameInMap("networkType")
        public String networkType;

        @NameInMap("protocol")
        public String protocol;

        public static HttpRouteEnvironmentInfoSubDomains build(java.util.Map<String, ?> map) throws Exception {
            HttpRouteEnvironmentInfoSubDomains self = new HttpRouteEnvironmentInfoSubDomains();
            return TeaModel.build(map, self);
        }

        public HttpRouteEnvironmentInfoSubDomains setDomainId(String domainId) {
            this.domainId = domainId;
            return this;
        }
        public String getDomainId() {
            return this.domainId;
        }

        public HttpRouteEnvironmentInfoSubDomains setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public HttpRouteEnvironmentInfoSubDomains setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public HttpRouteEnvironmentInfoSubDomains setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class HttpRouteEnvironmentInfo extends TeaModel {
        @NameInMap("alias")
        public String alias;

        @NameInMap("environmentId")
        public String environmentId;

        @NameInMap("gatewayInfo")
        public HttpRouteEnvironmentInfoGatewayInfo gatewayInfo;

        @NameInMap("name")
        public String name;

        @NameInMap("subDomains")
        public java.util.List<HttpRouteEnvironmentInfoSubDomains> subDomains;

        public static HttpRouteEnvironmentInfo build(java.util.Map<String, ?> map) throws Exception {
            HttpRouteEnvironmentInfo self = new HttpRouteEnvironmentInfo();
            return TeaModel.build(map, self);
        }

        public HttpRouteEnvironmentInfo setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public HttpRouteEnvironmentInfo setEnvironmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public String getEnvironmentId() {
            return this.environmentId;
        }

        public HttpRouteEnvironmentInfo setGatewayInfo(HttpRouteEnvironmentInfoGatewayInfo gatewayInfo) {
            this.gatewayInfo = gatewayInfo;
            return this;
        }
        public HttpRouteEnvironmentInfoGatewayInfo getGatewayInfo() {
            return this.gatewayInfo;
        }

        public HttpRouteEnvironmentInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public HttpRouteEnvironmentInfo setSubDomains(java.util.List<HttpRouteEnvironmentInfoSubDomains> subDomains) {
            this.subDomains = subDomains;
            return this;
        }
        public java.util.List<HttpRouteEnvironmentInfoSubDomains> getSubDomains() {
            return this.subDomains;
        }

    }

}
