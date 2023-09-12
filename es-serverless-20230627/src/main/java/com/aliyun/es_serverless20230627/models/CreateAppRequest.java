// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20230627.models;

import com.aliyun.tea.*;

public class CreateAppRequest extends TeaModel {
    /**
     * <p>应用名</p>
     */
    @NameInMap("appName")
    public String appName;

    @NameInMap("authentication")
    public CreateAppRequestAuthentication authentication;

    @NameInMap("chargeType")
    public String chargeType;

    /**
     * <p>应用备注</p>
     */
    @NameInMap("description")
    public String description;

    @NameInMap("network")
    public java.util.List<CreateAppRequestNetwork> network;

    @NameInMap("regionId")
    public String regionId;

    @NameInMap("version")
    public String version;

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

    public CreateAppRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateAppRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
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

}
