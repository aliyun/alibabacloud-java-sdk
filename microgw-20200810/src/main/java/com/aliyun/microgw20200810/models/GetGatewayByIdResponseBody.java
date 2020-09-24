// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class GetGatewayByIdResponseBody extends TeaModel {
    // code
    @NameInMap("code")
    public Long code;

    // data
    @NameInMap("data")
    public java.util.List<GetGatewayByIdResponseBodyData> data;

    // message
    @NameInMap("message")
    public String message;

    public static GetGatewayByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGatewayByIdResponseBody self = new GetGatewayByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGatewayByIdResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetGatewayByIdResponseBody setData(java.util.List<GetGatewayByIdResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetGatewayByIdResponseBodyData> getData() {
        return this.data;
    }

    public GetGatewayByIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public static class GetGatewayByIdResponseBodyDataArmsInfo extends TeaModel {
        // appId
        @NameInMap("appId")
        public String appId;

        // appName
        @NameInMap("appName")
        public String appName;

        // description
        @NameInMap("description")
        public String description;

        // licenseKey
        @NameInMap("licenseKey")
        public String licenseKey;

        public static GetGatewayByIdResponseBodyDataArmsInfo build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayByIdResponseBodyDataArmsInfo self = new GetGatewayByIdResponseBodyDataArmsInfo();
            return TeaModel.build(map, self);
        }

        public GetGatewayByIdResponseBodyDataArmsInfo setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetGatewayByIdResponseBodyDataArmsInfo setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetGatewayByIdResponseBodyDataArmsInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetGatewayByIdResponseBodyDataArmsInfo setLicenseKey(String licenseKey) {
            this.licenseKey = licenseKey;
            return this;
        }
        public String getLicenseKey() {
            return this.licenseKey;
        }

    }

    public static class GetGatewayByIdResponseBodyData extends TeaModel {
        // armsInfo
        @NameInMap("armsInfo")
        public GetGatewayByIdResponseBodyDataArmsInfo armsInfo;

        // autoCreateSlb
        @NameInMap("autoCreateSlb")
        public Boolean autoCreateSlb;

        // basePath
        @NameInMap("basePath")
        public String basePath;

        // creationDateTime
        @NameInMap("creationDateTime")
        public String creationDateTime;

        // edasNamespaceId
        @NameInMap("edasNamespaceId")
        public String edasNamespaceId;

        // gatewayType
        @NameInMap("gatewayType")
        public String gatewayType;

        // id
        @NameInMap("id")
        public Long id;

        // name
        @NameInMap("name")
        public String name;

        // podCidr
        @NameInMap("podCidr")
        public String podCidr;

        // region
        @NameInMap("region")
        public String region;

        // regionName
        @NameInMap("regionName")
        public String regionName;

        // replica
        @NameInMap("replica")
        public Long replica;

        // runtimeOn
        @NameInMap("runtimeOn")
        public String runtimeOn;

        // securityGroup
        @NameInMap("securityGroup")
        public String securityGroup;

        // slb
        @NameInMap("slb")
        public String slb;

        // slbAccessAddr
        @NameInMap("slbAccessAddr")
        public String slbAccessAddr;

        // status
        @NameInMap("status")
        public String status;

        // vpc
        @NameInMap("vpc")
        public String vpc;

        // vswitch
        @NameInMap("vswitch")
        public String vswitch;

        public static GetGatewayByIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayByIdResponseBodyData self = new GetGatewayByIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetGatewayByIdResponseBodyData setArmsInfo(GetGatewayByIdResponseBodyDataArmsInfo armsInfo) {
            this.armsInfo = armsInfo;
            return this;
        }
        public GetGatewayByIdResponseBodyDataArmsInfo getArmsInfo() {
            return this.armsInfo;
        }

        public GetGatewayByIdResponseBodyData setAutoCreateSlb(Boolean autoCreateSlb) {
            this.autoCreateSlb = autoCreateSlb;
            return this;
        }
        public Boolean getAutoCreateSlb() {
            return this.autoCreateSlb;
        }

        public GetGatewayByIdResponseBodyData setBasePath(String basePath) {
            this.basePath = basePath;
            return this;
        }
        public String getBasePath() {
            return this.basePath;
        }

        public GetGatewayByIdResponseBodyData setCreationDateTime(String creationDateTime) {
            this.creationDateTime = creationDateTime;
            return this;
        }
        public String getCreationDateTime() {
            return this.creationDateTime;
        }

        public GetGatewayByIdResponseBodyData setEdasNamespaceId(String edasNamespaceId) {
            this.edasNamespaceId = edasNamespaceId;
            return this;
        }
        public String getEdasNamespaceId() {
            return this.edasNamespaceId;
        }

        public GetGatewayByIdResponseBodyData setGatewayType(String gatewayType) {
            this.gatewayType = gatewayType;
            return this;
        }
        public String getGatewayType() {
            return this.gatewayType;
        }

        public GetGatewayByIdResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetGatewayByIdResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetGatewayByIdResponseBodyData setPodCidr(String podCidr) {
            this.podCidr = podCidr;
            return this;
        }
        public String getPodCidr() {
            return this.podCidr;
        }

        public GetGatewayByIdResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetGatewayByIdResponseBodyData setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public GetGatewayByIdResponseBodyData setReplica(Long replica) {
            this.replica = replica;
            return this;
        }
        public Long getReplica() {
            return this.replica;
        }

        public GetGatewayByIdResponseBodyData setRuntimeOn(String runtimeOn) {
            this.runtimeOn = runtimeOn;
            return this;
        }
        public String getRuntimeOn() {
            return this.runtimeOn;
        }

        public GetGatewayByIdResponseBodyData setSecurityGroup(String securityGroup) {
            this.securityGroup = securityGroup;
            return this;
        }
        public String getSecurityGroup() {
            return this.securityGroup;
        }

        public GetGatewayByIdResponseBodyData setSlb(String slb) {
            this.slb = slb;
            return this;
        }
        public String getSlb() {
            return this.slb;
        }

        public GetGatewayByIdResponseBodyData setSlbAccessAddr(String slbAccessAddr) {
            this.slbAccessAddr = slbAccessAddr;
            return this;
        }
        public String getSlbAccessAddr() {
            return this.slbAccessAddr;
        }

        public GetGatewayByIdResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetGatewayByIdResponseBodyData setVpc(String vpc) {
            this.vpc = vpc;
            return this;
        }
        public String getVpc() {
            return this.vpc;
        }

        public GetGatewayByIdResponseBodyData setVswitch(String vswitch) {
            this.vswitch = vswitch;
            return this;
        }
        public String getVswitch() {
            return this.vswitch;
        }

    }

}
