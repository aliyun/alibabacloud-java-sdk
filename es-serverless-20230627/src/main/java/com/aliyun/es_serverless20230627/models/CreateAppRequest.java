// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20230627.models;

import com.aliyun.tea.*;

public class CreateAppRequest extends TeaModel {
    /**
     * <p>应用名</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("appName")
    public String appName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("authentication")
    public CreateAppRequestAuthentication authentication;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("chargeType")
    public String chargeType;

    /**
     * <p>应用备注</p>
     */
    @NameInMap("description")
    public String description;

    @NameInMap("network")
    public java.util.List<CreateAppRequestNetwork> network;

    @NameInMap("privateNetwork")
    public java.util.List<CreateAppRequestPrivateNetwork> privateNetwork;

    @NameInMap("quotaInfo")
    public CreateAppRequestQuotaInfo quotaInfo;

    @NameInMap("regionId")
    public String regionId;

    @NameInMap("scenario")
    public String scenario;

    @NameInMap("version")
    public String version;

    @NameInMap("dryRun")
    public Boolean dryRun;

    public static CreateAppRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppRequest self = new CreateAppRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateAppRequest setAuthentication(CreateAppRequestAuthentication authentication) {
        this.authentication = authentication;
        return this;
    }
    public CreateAppRequestAuthentication getAuthentication() {
        return this.authentication;
    }

    public CreateAppRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateAppRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAppRequest setNetwork(java.util.List<CreateAppRequestNetwork> network) {
        this.network = network;
        return this;
    }
    public java.util.List<CreateAppRequestNetwork> getNetwork() {
        return this.network;
    }

    public CreateAppRequest setPrivateNetwork(java.util.List<CreateAppRequestPrivateNetwork> privateNetwork) {
        this.privateNetwork = privateNetwork;
        return this;
    }
    public java.util.List<CreateAppRequestPrivateNetwork> getPrivateNetwork() {
        return this.privateNetwork;
    }

    public CreateAppRequest setQuotaInfo(CreateAppRequestQuotaInfo quotaInfo) {
        this.quotaInfo = quotaInfo;
        return this;
    }
    public CreateAppRequestQuotaInfo getQuotaInfo() {
        return this.quotaInfo;
    }

    public CreateAppRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateAppRequest setScenario(String scenario) {
        this.scenario = scenario;
        return this;
    }
    public String getScenario() {
        return this.scenario;
    }

    public CreateAppRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public CreateAppRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public static class CreateAppRequestAuthenticationBasicAuth extends TeaModel {
        @NameInMap("password")
        public String password;

        @NameInMap("username")
        public String username;

        public static CreateAppRequestAuthenticationBasicAuth build(java.util.Map<String, ?> map) throws Exception {
            CreateAppRequestAuthenticationBasicAuth self = new CreateAppRequestAuthenticationBasicAuth();
            return TeaModel.build(map, self);
        }

        public CreateAppRequestAuthenticationBasicAuth setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public CreateAppRequestAuthenticationBasicAuth setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class CreateAppRequestAuthentication extends TeaModel {
        @NameInMap("basicAuth")
        public java.util.List<CreateAppRequestAuthenticationBasicAuth> basicAuth;

        public static CreateAppRequestAuthentication build(java.util.Map<String, ?> map) throws Exception {
            CreateAppRequestAuthentication self = new CreateAppRequestAuthentication();
            return TeaModel.build(map, self);
        }

        public CreateAppRequestAuthentication setBasicAuth(java.util.List<CreateAppRequestAuthenticationBasicAuth> basicAuth) {
            this.basicAuth = basicAuth;
            return this;
        }
        public java.util.List<CreateAppRequestAuthenticationBasicAuth> getBasicAuth() {
            return this.basicAuth;
        }

    }

    public static class CreateAppRequestNetworkWhiteIpGroup extends TeaModel {
        @NameInMap("groupName")
        public String groupName;

        @NameInMap("ips")
        public java.util.List<String> ips;

        public static CreateAppRequestNetworkWhiteIpGroup build(java.util.Map<String, ?> map) throws Exception {
            CreateAppRequestNetworkWhiteIpGroup self = new CreateAppRequestNetworkWhiteIpGroup();
            return TeaModel.build(map, self);
        }

        public CreateAppRequestNetworkWhiteIpGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public CreateAppRequestNetworkWhiteIpGroup setIps(java.util.List<String> ips) {
            this.ips = ips;
            return this;
        }
        public java.util.List<String> getIps() {
            return this.ips;
        }

    }

    public static class CreateAppRequestNetwork extends TeaModel {
        @NameInMap("domain")
        public String domain;

        @NameInMap("enabled")
        public Boolean enabled;

        @NameInMap("port")
        public Integer port;

        @NameInMap("type")
        public String type;

        @NameInMap("whiteIpGroup")
        public java.util.List<CreateAppRequestNetworkWhiteIpGroup> whiteIpGroup;

        public static CreateAppRequestNetwork build(java.util.Map<String, ?> map) throws Exception {
            CreateAppRequestNetwork self = new CreateAppRequestNetwork();
            return TeaModel.build(map, self);
        }

        public CreateAppRequestNetwork setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public CreateAppRequestNetwork setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateAppRequestNetwork setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public CreateAppRequestNetwork setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateAppRequestNetwork setWhiteIpGroup(java.util.List<CreateAppRequestNetworkWhiteIpGroup> whiteIpGroup) {
            this.whiteIpGroup = whiteIpGroup;
            return this;
        }
        public java.util.List<CreateAppRequestNetworkWhiteIpGroup> getWhiteIpGroup() {
            return this.whiteIpGroup;
        }

    }

    public static class CreateAppRequestPrivateNetworkWhiteIpGroup extends TeaModel {
        @NameInMap("groupName")
        public String groupName;

        @NameInMap("ips")
        public java.util.List<String> ips;

        public static CreateAppRequestPrivateNetworkWhiteIpGroup build(java.util.Map<String, ?> map) throws Exception {
            CreateAppRequestPrivateNetworkWhiteIpGroup self = new CreateAppRequestPrivateNetworkWhiteIpGroup();
            return TeaModel.build(map, self);
        }

        public CreateAppRequestPrivateNetworkWhiteIpGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public CreateAppRequestPrivateNetworkWhiteIpGroup setIps(java.util.List<String> ips) {
            this.ips = ips;
            return this;
        }
        public java.util.List<String> getIps() {
            return this.ips;
        }

    }

    public static class CreateAppRequestPrivateNetwork extends TeaModel {
        @NameInMap("enabled")
        public Boolean enabled;

        @NameInMap("pvlEndpointId")
        public String pvlEndpointId;

        @NameInMap("type")
        public String type;

        @NameInMap("vpcId")
        public String vpcId;

        @NameInMap("whiteIpGroup")
        public java.util.List<CreateAppRequestPrivateNetworkWhiteIpGroup> whiteIpGroup;

        public static CreateAppRequestPrivateNetwork build(java.util.Map<String, ?> map) throws Exception {
            CreateAppRequestPrivateNetwork self = new CreateAppRequestPrivateNetwork();
            return TeaModel.build(map, self);
        }

        public CreateAppRequestPrivateNetwork setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateAppRequestPrivateNetwork setPvlEndpointId(String pvlEndpointId) {
            this.pvlEndpointId = pvlEndpointId;
            return this;
        }
        public String getPvlEndpointId() {
            return this.pvlEndpointId;
        }

        public CreateAppRequestPrivateNetwork setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateAppRequestPrivateNetwork setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public CreateAppRequestPrivateNetwork setWhiteIpGroup(java.util.List<CreateAppRequestPrivateNetworkWhiteIpGroup> whiteIpGroup) {
            this.whiteIpGroup = whiteIpGroup;
            return this;
        }
        public java.util.List<CreateAppRequestPrivateNetworkWhiteIpGroup> getWhiteIpGroup() {
            return this.whiteIpGroup;
        }

    }

    public static class CreateAppRequestQuotaInfo extends TeaModel {
        @NameInMap("appType")
        public String appType;

        @NameInMap("cu")
        public Integer cu;

        @NameInMap("storage")
        public Integer storage;

        public static CreateAppRequestQuotaInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateAppRequestQuotaInfo self = new CreateAppRequestQuotaInfo();
            return TeaModel.build(map, self);
        }

        public CreateAppRequestQuotaInfo setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public CreateAppRequestQuotaInfo setCu(Integer cu) {
            this.cu = cu;
            return this;
        }
        public Integer getCu() {
            return this.cu;
        }

        public CreateAppRequestQuotaInfo setStorage(Integer storage) {
            this.storage = storage;
            return this;
        }
        public Integer getStorage() {
            return this.storage;
        }

    }

}
