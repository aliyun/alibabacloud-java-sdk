// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetEnvironmentResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetEnvironmentResponseBodyData data;

    @NameInMap("msg")
    public String msg;

    public static GetEnvironmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEnvironmentResponseBody self = new GetEnvironmentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEnvironmentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetEnvironmentResponseBody setData(GetEnvironmentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetEnvironmentResponseBodyData getData() {
        return this.data;
    }

    public GetEnvironmentResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public static class GetEnvironmentResponseBodyDataPlatform extends TeaModel {
        @NameInMap("architecture")
        public String architecture;

        @NameInMap("os")
        public String os;

        public static GetEnvironmentResponseBodyDataPlatform build(java.util.Map<String, ?> map) throws Exception {
            GetEnvironmentResponseBodyDataPlatform self = new GetEnvironmentResponseBodyDataPlatform();
            return TeaModel.build(map, self);
        }

        public GetEnvironmentResponseBodyDataPlatform setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

        public GetEnvironmentResponseBodyDataPlatform setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

    }

    public static class GetEnvironmentResponseBodyData extends TeaModel {
        @NameInMap("clusterId")
        public String clusterId;

        @NameInMap("createdAt")
        public String createdAt;

        @NameInMap("description")
        public String description;

        @NameInMap("foundationVersion")
        public String foundationVersion;

        @NameInMap("foundationVersionUID")
        public String foundationVersionUID;

        @NameInMap("instanceList")
        public java.util.List<InstanceInfo> instanceList;

        @NameInMap("instanceStatus")
        public String instanceStatus;

        @NameInMap("location")
        public String location;

        @NameInMap("name")
        public String name;

        @NameInMap("oldProductVersion")
        public String oldProductVersion;

        @NameInMap("oldProductVersionUID")
        public String oldProductVersionUID;

        @NameInMap("platform")
        public GetEnvironmentResponseBodyDataPlatform platform;

        @NameInMap("productName")
        public String productName;

        @NameInMap("productVersion")
        public String productVersion;

        @NameInMap("uid")
        public String uid;

        @NameInMap("vendorConfig")
        public String vendorConfig;

        @NameInMap("vendorType")
        public String vendorType;

        public static GetEnvironmentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetEnvironmentResponseBodyData self = new GetEnvironmentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetEnvironmentResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetEnvironmentResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetEnvironmentResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetEnvironmentResponseBodyData setFoundationVersion(String foundationVersion) {
            this.foundationVersion = foundationVersion;
            return this;
        }
        public String getFoundationVersion() {
            return this.foundationVersion;
        }

        public GetEnvironmentResponseBodyData setFoundationVersionUID(String foundationVersionUID) {
            this.foundationVersionUID = foundationVersionUID;
            return this;
        }
        public String getFoundationVersionUID() {
            return this.foundationVersionUID;
        }

        public GetEnvironmentResponseBodyData setInstanceList(java.util.List<InstanceInfo> instanceList) {
            this.instanceList = instanceList;
            return this;
        }
        public java.util.List<InstanceInfo> getInstanceList() {
            return this.instanceList;
        }

        public GetEnvironmentResponseBodyData setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public GetEnvironmentResponseBodyData setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public GetEnvironmentResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetEnvironmentResponseBodyData setOldProductVersion(String oldProductVersion) {
            this.oldProductVersion = oldProductVersion;
            return this;
        }
        public String getOldProductVersion() {
            return this.oldProductVersion;
        }

        public GetEnvironmentResponseBodyData setOldProductVersionUID(String oldProductVersionUID) {
            this.oldProductVersionUID = oldProductVersionUID;
            return this;
        }
        public String getOldProductVersionUID() {
            return this.oldProductVersionUID;
        }

        public GetEnvironmentResponseBodyData setPlatform(GetEnvironmentResponseBodyDataPlatform platform) {
            this.platform = platform;
            return this;
        }
        public GetEnvironmentResponseBodyDataPlatform getPlatform() {
            return this.platform;
        }

        public GetEnvironmentResponseBodyData setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public GetEnvironmentResponseBodyData setProductVersion(String productVersion) {
            this.productVersion = productVersion;
            return this;
        }
        public String getProductVersion() {
            return this.productVersion;
        }

        public GetEnvironmentResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public GetEnvironmentResponseBodyData setVendorConfig(String vendorConfig) {
            this.vendorConfig = vendorConfig;
            return this;
        }
        public String getVendorConfig() {
            return this.vendorConfig;
        }

        public GetEnvironmentResponseBodyData setVendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }
        public String getVendorType() {
            return this.vendorType;
        }

    }

}
