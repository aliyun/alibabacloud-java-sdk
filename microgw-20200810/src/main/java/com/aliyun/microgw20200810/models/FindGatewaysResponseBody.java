// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class FindGatewaysResponseBody extends TeaModel {
    // code
    @NameInMap("code")
    public Long code;

    // data
    @NameInMap("data")
    public FindGatewaysResponseBodyData data;

    // message
    @NameInMap("message")
    public String message;

    public static FindGatewaysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FindGatewaysResponseBody self = new FindGatewaysResponseBody();
        return TeaModel.build(map, self);
    }

    public FindGatewaysResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public FindGatewaysResponseBody setData(FindGatewaysResponseBodyData data) {
        this.data = data;
        return this;
    }
    public FindGatewaysResponseBodyData getData() {
        return this.data;
    }

    public FindGatewaysResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public static class FindGatewaysResponseBodyDataListArmsInfo extends TeaModel {
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

        public static FindGatewaysResponseBodyDataListArmsInfo build(java.util.Map<String, ?> map) throws Exception {
            FindGatewaysResponseBodyDataListArmsInfo self = new FindGatewaysResponseBodyDataListArmsInfo();
            return TeaModel.build(map, self);
        }

        public FindGatewaysResponseBodyDataListArmsInfo setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public FindGatewaysResponseBodyDataListArmsInfo setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public FindGatewaysResponseBodyDataListArmsInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public FindGatewaysResponseBodyDataListArmsInfo setLicenseKey(String licenseKey) {
            this.licenseKey = licenseKey;
            return this;
        }
        public String getLicenseKey() {
            return this.licenseKey;
        }

    }

    public static class FindGatewaysResponseBodyDataList extends TeaModel {
        // armsInfo
        @NameInMap("armsInfo")
        public FindGatewaysResponseBodyDataListArmsInfo armsInfo;

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

        public static FindGatewaysResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            FindGatewaysResponseBodyDataList self = new FindGatewaysResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public FindGatewaysResponseBodyDataList setArmsInfo(FindGatewaysResponseBodyDataListArmsInfo armsInfo) {
            this.armsInfo = armsInfo;
            return this;
        }
        public FindGatewaysResponseBodyDataListArmsInfo getArmsInfo() {
            return this.armsInfo;
        }

        public FindGatewaysResponseBodyDataList setAutoCreateSlb(Boolean autoCreateSlb) {
            this.autoCreateSlb = autoCreateSlb;
            return this;
        }
        public Boolean getAutoCreateSlb() {
            return this.autoCreateSlb;
        }

        public FindGatewaysResponseBodyDataList setBasePath(String basePath) {
            this.basePath = basePath;
            return this;
        }
        public String getBasePath() {
            return this.basePath;
        }

        public FindGatewaysResponseBodyDataList setCreationDateTime(String creationDateTime) {
            this.creationDateTime = creationDateTime;
            return this;
        }
        public String getCreationDateTime() {
            return this.creationDateTime;
        }

        public FindGatewaysResponseBodyDataList setEdasNamespaceId(String edasNamespaceId) {
            this.edasNamespaceId = edasNamespaceId;
            return this;
        }
        public String getEdasNamespaceId() {
            return this.edasNamespaceId;
        }

        public FindGatewaysResponseBodyDataList setGatewayType(String gatewayType) {
            this.gatewayType = gatewayType;
            return this;
        }
        public String getGatewayType() {
            return this.gatewayType;
        }

        public FindGatewaysResponseBodyDataList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public FindGatewaysResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public FindGatewaysResponseBodyDataList setPodCidr(String podCidr) {
            this.podCidr = podCidr;
            return this;
        }
        public String getPodCidr() {
            return this.podCidr;
        }

        public FindGatewaysResponseBodyDataList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public FindGatewaysResponseBodyDataList setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public FindGatewaysResponseBodyDataList setReplica(Long replica) {
            this.replica = replica;
            return this;
        }
        public Long getReplica() {
            return this.replica;
        }

        public FindGatewaysResponseBodyDataList setRuntimeOn(String runtimeOn) {
            this.runtimeOn = runtimeOn;
            return this;
        }
        public String getRuntimeOn() {
            return this.runtimeOn;
        }

        public FindGatewaysResponseBodyDataList setSecurityGroup(String securityGroup) {
            this.securityGroup = securityGroup;
            return this;
        }
        public String getSecurityGroup() {
            return this.securityGroup;
        }

        public FindGatewaysResponseBodyDataList setSlb(String slb) {
            this.slb = slb;
            return this;
        }
        public String getSlb() {
            return this.slb;
        }

        public FindGatewaysResponseBodyDataList setSlbAccessAddr(String slbAccessAddr) {
            this.slbAccessAddr = slbAccessAddr;
            return this;
        }
        public String getSlbAccessAddr() {
            return this.slbAccessAddr;
        }

        public FindGatewaysResponseBodyDataList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public FindGatewaysResponseBodyDataList setVpc(String vpc) {
            this.vpc = vpc;
            return this;
        }
        public String getVpc() {
            return this.vpc;
        }

        public FindGatewaysResponseBodyDataList setVswitch(String vswitch) {
            this.vswitch = vswitch;
            return this;
        }
        public String getVswitch() {
            return this.vswitch;
        }

    }

    public static class FindGatewaysResponseBodyData extends TeaModel {
        // list
        @NameInMap("list")
        public java.util.List<FindGatewaysResponseBodyDataList> list;

        // totalCount
        @NameInMap("totalCount")
        public Long totalCount;

        public static FindGatewaysResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            FindGatewaysResponseBodyData self = new FindGatewaysResponseBodyData();
            return TeaModel.build(map, self);
        }

        public FindGatewaysResponseBodyData setList(java.util.List<FindGatewaysResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<FindGatewaysResponseBodyDataList> getList() {
            return this.list;
        }

        public FindGatewaysResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
