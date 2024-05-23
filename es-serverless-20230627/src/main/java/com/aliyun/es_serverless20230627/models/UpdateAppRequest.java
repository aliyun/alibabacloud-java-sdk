// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20230627.models;

import com.aliyun.tea.*;

public class UpdateAppRequest extends TeaModel {
    @NameInMap("applyReason")
    public String applyReason;

    @NameInMap("authentication")
    public UpdateAppRequestAuthentication authentication;

    @NameInMap("contactInfo")
    public String contactInfo;

    /**
     * <p>应用备注</p>
     */
    @NameInMap("description")
    public String description;

    @NameInMap("limiterInfo")
    public UpdateAppRequestLimiterInfo limiterInfo;

    @NameInMap("network")
    public java.util.List<UpdateAppRequestNetwork> network;

    @NameInMap("privateNetwork")
    public java.util.List<UpdateAppRequestPrivateNetwork> privateNetwork;

    public static UpdateAppRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppRequest self = new UpdateAppRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAppRequest setApplyReason(String applyReason) {
        this.applyReason = applyReason;
        return this;
    }
    public String getApplyReason() {
        return this.applyReason;
    }

    public UpdateAppRequest setAuthentication(UpdateAppRequestAuthentication authentication) {
        this.authentication = authentication;
        return this;
    }
    public UpdateAppRequestAuthentication getAuthentication() {
        return this.authentication;
    }

    public UpdateAppRequest setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
        return this;
    }
    public String getContactInfo() {
        return this.contactInfo;
    }

    public UpdateAppRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateAppRequest setLimiterInfo(UpdateAppRequestLimiterInfo limiterInfo) {
        this.limiterInfo = limiterInfo;
        return this;
    }
    public UpdateAppRequestLimiterInfo getLimiterInfo() {
        return this.limiterInfo;
    }

    public UpdateAppRequest setNetwork(java.util.List<UpdateAppRequestNetwork> network) {
        this.network = network;
        return this;
    }
    public java.util.List<UpdateAppRequestNetwork> getNetwork() {
        return this.network;
    }

    public UpdateAppRequest setPrivateNetwork(java.util.List<UpdateAppRequestPrivateNetwork> privateNetwork) {
        this.privateNetwork = privateNetwork;
        return this;
    }
    public java.util.List<UpdateAppRequestPrivateNetwork> getPrivateNetwork() {
        return this.privateNetwork;
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

    public static class UpdateAppRequestLimiterInfoLimiters extends TeaModel {
        @NameInMap("maxValue")
        public Integer maxValue;

        @NameInMap("minValue")
        public Integer minValue;

        @NameInMap("type")
        public String type;

        @NameInMap("values")
        public java.util.List<String> values;

        public static UpdateAppRequestLimiterInfoLimiters build(java.util.Map<String, ?> map) throws Exception {
            UpdateAppRequestLimiterInfoLimiters self = new UpdateAppRequestLimiterInfoLimiters();
            return TeaModel.build(map, self);
        }

        public UpdateAppRequestLimiterInfoLimiters setMaxValue(Integer maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public Integer getMaxValue() {
            return this.maxValue;
        }

        public UpdateAppRequestLimiterInfoLimiters setMinValue(Integer minValue) {
            this.minValue = minValue;
            return this;
        }
        public Integer getMinValue() {
            return this.minValue;
        }

        public UpdateAppRequestLimiterInfoLimiters setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateAppRequestLimiterInfoLimiters setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class UpdateAppRequestLimiterInfo extends TeaModel {
        @NameInMap("limiters")
        public java.util.List<UpdateAppRequestLimiterInfoLimiters> limiters;

        public static UpdateAppRequestLimiterInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdateAppRequestLimiterInfo self = new UpdateAppRequestLimiterInfo();
            return TeaModel.build(map, self);
        }

        public UpdateAppRequestLimiterInfo setLimiters(java.util.List<UpdateAppRequestLimiterInfoLimiters> limiters) {
            this.limiters = limiters;
            return this;
        }
        public java.util.List<UpdateAppRequestLimiterInfoLimiters> getLimiters() {
            return this.limiters;
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

    public static class UpdateAppRequestPrivateNetworkWhiteIpGroup extends TeaModel {
        @NameInMap("groupName")
        public String groupName;

        @NameInMap("ips")
        public java.util.List<String> ips;

        public static UpdateAppRequestPrivateNetworkWhiteIpGroup build(java.util.Map<String, ?> map) throws Exception {
            UpdateAppRequestPrivateNetworkWhiteIpGroup self = new UpdateAppRequestPrivateNetworkWhiteIpGroup();
            return TeaModel.build(map, self);
        }

        public UpdateAppRequestPrivateNetworkWhiteIpGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public UpdateAppRequestPrivateNetworkWhiteIpGroup setIps(java.util.List<String> ips) {
            this.ips = ips;
            return this;
        }
        public java.util.List<String> getIps() {
            return this.ips;
        }

    }

    public static class UpdateAppRequestPrivateNetwork extends TeaModel {
        @NameInMap("enabled")
        public Boolean enabled;

        @NameInMap("pvlEndpointId")
        public String pvlEndpointId;

        @NameInMap("type")
        public String type;

        @NameInMap("vpcId")
        public String vpcId;

        @NameInMap("whiteIpGroup")
        public java.util.List<UpdateAppRequestPrivateNetworkWhiteIpGroup> whiteIpGroup;

        public static UpdateAppRequestPrivateNetwork build(java.util.Map<String, ?> map) throws Exception {
            UpdateAppRequestPrivateNetwork self = new UpdateAppRequestPrivateNetwork();
            return TeaModel.build(map, self);
        }

        public UpdateAppRequestPrivateNetwork setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateAppRequestPrivateNetwork setPvlEndpointId(String pvlEndpointId) {
            this.pvlEndpointId = pvlEndpointId;
            return this;
        }
        public String getPvlEndpointId() {
            return this.pvlEndpointId;
        }

        public UpdateAppRequestPrivateNetwork setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateAppRequestPrivateNetwork setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public UpdateAppRequestPrivateNetwork setWhiteIpGroup(java.util.List<UpdateAppRequestPrivateNetworkWhiteIpGroup> whiteIpGroup) {
            this.whiteIpGroup = whiteIpGroup;
            return this;
        }
        public java.util.List<UpdateAppRequestPrivateNetworkWhiteIpGroup> getWhiteIpGroup() {
            return this.whiteIpGroup;
        }

    }

}
