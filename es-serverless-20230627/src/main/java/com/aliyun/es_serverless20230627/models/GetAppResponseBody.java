// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20230627.models;

import com.aliyun.tea.*;

public class GetAppResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2C5DAA30-****-5181-9B87-9D6181016197</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public GetAppResponseBodyResult result;

    public static GetAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppResponseBody self = new GetAppResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAppResponseBody setResult(GetAppResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetAppResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetAppResponseBodyResultNetworkWhiteIpGroup extends TeaModel {
        @NameInMap("groupName")
        public String groupName;

        @NameInMap("ips")
        public java.util.List<String> ips;

        public static GetAppResponseBodyResultNetworkWhiteIpGroup build(java.util.Map<String, ?> map) throws Exception {
            GetAppResponseBodyResultNetworkWhiteIpGroup self = new GetAppResponseBodyResultNetworkWhiteIpGroup();
            return TeaModel.build(map, self);
        }

        public GetAppResponseBodyResultNetworkWhiteIpGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GetAppResponseBodyResultNetworkWhiteIpGroup setIps(java.util.List<String> ips) {
            this.ips = ips;
            return this;
        }
        public java.util.List<String> getIps() {
            return this.ips;
        }

    }

    public static class GetAppResponseBodyResultNetwork extends TeaModel {
        @NameInMap("domain")
        public String domain;

        @NameInMap("enabled")
        public Boolean enabled;

        @NameInMap("port")
        public Integer port;

        @NameInMap("type")
        public String type;

        @NameInMap("whiteIpGroup")
        public java.util.List<GetAppResponseBodyResultNetworkWhiteIpGroup> whiteIpGroup;

        public static GetAppResponseBodyResultNetwork build(java.util.Map<String, ?> map) throws Exception {
            GetAppResponseBodyResultNetwork self = new GetAppResponseBodyResultNetwork();
            return TeaModel.build(map, self);
        }

        public GetAppResponseBodyResultNetwork setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public GetAppResponseBodyResultNetwork setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetAppResponseBodyResultNetwork setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public GetAppResponseBodyResultNetwork setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetAppResponseBodyResultNetwork setWhiteIpGroup(java.util.List<GetAppResponseBodyResultNetworkWhiteIpGroup> whiteIpGroup) {
            this.whiteIpGroup = whiteIpGroup;
            return this;
        }
        public java.util.List<GetAppResponseBodyResultNetworkWhiteIpGroup> getWhiteIpGroup() {
            return this.whiteIpGroup;
        }

    }

    public static class GetAppResponseBodyResultPrivateNetworkWhiteIpGroup extends TeaModel {
        @NameInMap("groupName")
        public String groupName;

        @NameInMap("ips")
        public java.util.List<String> ips;

        public static GetAppResponseBodyResultPrivateNetworkWhiteIpGroup build(java.util.Map<String, ?> map) throws Exception {
            GetAppResponseBodyResultPrivateNetworkWhiteIpGroup self = new GetAppResponseBodyResultPrivateNetworkWhiteIpGroup();
            return TeaModel.build(map, self);
        }

        public GetAppResponseBodyResultPrivateNetworkWhiteIpGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GetAppResponseBodyResultPrivateNetworkWhiteIpGroup setIps(java.util.List<String> ips) {
            this.ips = ips;
            return this;
        }
        public java.util.List<String> getIps() {
            return this.ips;
        }

    }

    public static class GetAppResponseBodyResultPrivateNetwork extends TeaModel {
        @NameInMap("domain")
        public String domain;

        @NameInMap("enabled")
        public Boolean enabled;

        @NameInMap("port")
        public Integer port;

        @NameInMap("pvlEndpointId")
        public String pvlEndpointId;

        @NameInMap("type")
        public String type;

        @NameInMap("vpcId")
        public String vpcId;

        @NameInMap("whiteIpGroup")
        public java.util.List<GetAppResponseBodyResultPrivateNetworkWhiteIpGroup> whiteIpGroup;

        public static GetAppResponseBodyResultPrivateNetwork build(java.util.Map<String, ?> map) throws Exception {
            GetAppResponseBodyResultPrivateNetwork self = new GetAppResponseBodyResultPrivateNetwork();
            return TeaModel.build(map, self);
        }

        public GetAppResponseBodyResultPrivateNetwork setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public GetAppResponseBodyResultPrivateNetwork setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetAppResponseBodyResultPrivateNetwork setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public GetAppResponseBodyResultPrivateNetwork setPvlEndpointId(String pvlEndpointId) {
            this.pvlEndpointId = pvlEndpointId;
            return this;
        }
        public String getPvlEndpointId() {
            return this.pvlEndpointId;
        }

        public GetAppResponseBodyResultPrivateNetwork setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetAppResponseBodyResultPrivateNetwork setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public GetAppResponseBodyResultPrivateNetwork setWhiteIpGroup(java.util.List<GetAppResponseBodyResultPrivateNetworkWhiteIpGroup> whiteIpGroup) {
            this.whiteIpGroup = whiteIpGroup;
            return this;
        }
        public java.util.List<GetAppResponseBodyResultPrivateNetworkWhiteIpGroup> getWhiteIpGroup() {
            return this.whiteIpGroup;
        }

    }

    public static class GetAppResponseBodyResultTags extends TeaModel {
        @NameInMap("key")
        public String key;

        @NameInMap("value")
        public String value;

        public static GetAppResponseBodyResultTags build(java.util.Map<String, ?> map) throws Exception {
            GetAppResponseBodyResultTags self = new GetAppResponseBodyResultTags();
            return TeaModel.build(map, self);
        }

        public GetAppResponseBodyResultTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetAppResponseBodyResultTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetAppResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test-app-abc</p>
         */
        @NameInMap("appId")
        public String appId;

        /**
         * <strong>example:</strong>
         * <p>es-severless-test-app</p>
         */
        @NameInMap("appName")
        public String appName;

        @NameInMap("appType")
        public String appType;

        @NameInMap("chargeType")
        public String chargeType;

        /**
         * <strong>example:</strong>
         * <p>2022-08-15T11:20:52.370Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        @NameInMap("description")
        public String description;

        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>2022-08-15T11:21:50.000Z</p>
         */
        @NameInMap("modifiedTime")
        public String modifiedTime;

        @NameInMap("network")
        public java.util.List<GetAppResponseBodyResultNetwork> network;

        /**
         * <strong>example:</strong>
         * <p>*******7595</p>
         */
        @NameInMap("ownerId")
        public String ownerId;

        @NameInMap("privateNetwork")
        public java.util.List<GetAppResponseBodyResultPrivateNetwork> privateNetwork;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        @NameInMap("scenario")
        public String scenario;

        /**
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("status")
        public String status;

        @NameInMap("tags")
        public java.util.List<GetAppResponseBodyResultTags> tags;

        /**
         * <strong>example:</strong>
         * <p>7.10</p>
         */
        @NameInMap("version")
        public String version;

        public static GetAppResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetAppResponseBodyResult self = new GetAppResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetAppResponseBodyResult setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetAppResponseBodyResult setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetAppResponseBodyResult setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public GetAppResponseBodyResult setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public GetAppResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetAppResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAppResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetAppResponseBodyResult setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetAppResponseBodyResult setNetwork(java.util.List<GetAppResponseBodyResultNetwork> network) {
            this.network = network;
            return this;
        }
        public java.util.List<GetAppResponseBodyResultNetwork> getNetwork() {
            return this.network;
        }

        public GetAppResponseBodyResult setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public GetAppResponseBodyResult setPrivateNetwork(java.util.List<GetAppResponseBodyResultPrivateNetwork> privateNetwork) {
            this.privateNetwork = privateNetwork;
            return this;
        }
        public java.util.List<GetAppResponseBodyResultPrivateNetwork> getPrivateNetwork() {
            return this.privateNetwork;
        }

        public GetAppResponseBodyResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetAppResponseBodyResult setScenario(String scenario) {
            this.scenario = scenario;
            return this;
        }
        public String getScenario() {
            return this.scenario;
        }

        public GetAppResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAppResponseBodyResult setTags(java.util.List<GetAppResponseBodyResultTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetAppResponseBodyResultTags> getTags() {
            return this.tags;
        }

        public GetAppResponseBodyResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
