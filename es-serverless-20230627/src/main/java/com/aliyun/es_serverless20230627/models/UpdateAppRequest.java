// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20230627.models;

import com.aliyun.tea.*;

public class UpdateAppRequest extends TeaModel {
    @NameInMap("authentication")
    public UpdateAppRequestAuthentication authentication;

    /**
     * <p>应用备注</p>
     */
    @NameInMap("description")
    public String description;

    @NameInMap("network")
    public java.util.List<UpdateAppRequestNetwork> network;

    public static UpdateAppRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppRequest self = new UpdateAppRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAppRequest setAuthentication(UpdateAppRequestAuthentication authentication) {
        this.authentication = authentication;
        return this;
    }
    public UpdateAppRequestAuthentication getAuthentication() {
        return this.authentication;
    }

    public UpdateAppRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateAppRequest setNetwork(java.util.List<UpdateAppRequestNetwork> network) {
        this.network = network;
        return this;
    }
    public java.util.List<UpdateAppRequestNetwork> getNetwork() {
        return this.network;
    }

    public static class UpdateAppRequestAuthenticationBasicAuth extends TeaModel {
        @NameInMap("password")
        public String password;

        @NameInMap("username")
        public String username;

        public static UpdateAppRequestAuthenticationBasicAuth build(java.util.Map<String, ?> map) throws Exception {
            UpdateAppRequestAuthenticationBasicAuth self = new UpdateAppRequestAuthenticationBasicAuth();
            return TeaModel.build(map, self);
        }

        public UpdateAppRequestAuthenticationBasicAuth setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public UpdateAppRequestAuthenticationBasicAuth setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class UpdateAppRequestAuthentication extends TeaModel {
        @NameInMap("basicAuth")
        public java.util.List<UpdateAppRequestAuthenticationBasicAuth> basicAuth;

        public static UpdateAppRequestAuthentication build(java.util.Map<String, ?> map) throws Exception {
            UpdateAppRequestAuthentication self = new UpdateAppRequestAuthentication();
            return TeaModel.build(map, self);
        }

        public UpdateAppRequestAuthentication setBasicAuth(java.util.List<UpdateAppRequestAuthenticationBasicAuth> basicAuth) {
            this.basicAuth = basicAuth;
            return this;
        }
        public java.util.List<UpdateAppRequestAuthenticationBasicAuth> getBasicAuth() {
            return this.basicAuth;
        }

    }

    public static class UpdateAppRequestNetworkWhiteIpGroup extends TeaModel {
        @NameInMap("groupName")
        public String groupName;

        @NameInMap("ips")
        public java.util.List<String> ips;

        public static UpdateAppRequestNetworkWhiteIpGroup build(java.util.Map<String, ?> map) throws Exception {
            UpdateAppRequestNetworkWhiteIpGroup self = new UpdateAppRequestNetworkWhiteIpGroup();
            return TeaModel.build(map, self);
        }

        public UpdateAppRequestNetworkWhiteIpGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public UpdateAppRequestNetworkWhiteIpGroup setIps(java.util.List<String> ips) {
            this.ips = ips;
            return this;
        }
        public java.util.List<String> getIps() {
            return this.ips;
        }

    }

    public static class UpdateAppRequestNetwork extends TeaModel {
        @NameInMap("domain")
        public String domain;

        @NameInMap("enabled")
        public Boolean enabled;

        @NameInMap("port")
        public Integer port;

        @NameInMap("type")
        public String type;

        @NameInMap("whiteIpGroup")
        public java.util.List<UpdateAppRequestNetworkWhiteIpGroup> whiteIpGroup;

        public static UpdateAppRequestNetwork build(java.util.Map<String, ?> map) throws Exception {
            UpdateAppRequestNetwork self = new UpdateAppRequestNetwork();
            return TeaModel.build(map, self);
        }

        public UpdateAppRequestNetwork setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public UpdateAppRequestNetwork setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateAppRequestNetwork setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public UpdateAppRequestNetwork setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateAppRequestNetwork setWhiteIpGroup(java.util.List<UpdateAppRequestNetworkWhiteIpGroup> whiteIpGroup) {
            this.whiteIpGroup = whiteIpGroup;
            return this;
        }
        public java.util.List<UpdateAppRequestNetworkWhiteIpGroup> getWhiteIpGroup() {
            return this.whiteIpGroup;
        }

    }

}
