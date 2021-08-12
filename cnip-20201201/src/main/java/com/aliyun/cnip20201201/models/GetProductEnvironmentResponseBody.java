// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetProductEnvironmentResponseBody extends TeaModel {
    @NameInMap("data")
    public GetProductEnvironmentResponseBodyData data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("success")
    public Boolean success;

    public static GetProductEnvironmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProductEnvironmentResponseBody self = new GetProductEnvironmentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProductEnvironmentResponseBody setData(GetProductEnvironmentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetProductEnvironmentResponseBodyData getData() {
        return this.data;
    }

    public GetProductEnvironmentResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetProductEnvironmentResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public GetProductEnvironmentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetProductEnvironmentResponseBodyData extends TeaModel {
        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("clusterUID")
        public String clusterUID;

        @NameInMap("description")
        public String description;

        @NameInMap("instanceList")
        public java.util.List<InstanceInfo> instanceList;

        @NameInMap("instanceStatus")
        public String instanceStatus;

        @NameInMap("name")
        public String name;

        @NameInMap("productName")
        public String productName;

        @NameInMap("productVersion")
        public String productVersion;

        @NameInMap("productUID")
        public String productUID;

        @NameInMap("productVersionUID")
        public String productVersionUID;

        @NameInMap("type")
        public String type;

        @NameInMap("uid")
        public String uid;

        @NameInMap("vendorConfig")
        public String vendorConfig;

        @NameInMap("vendorType")
        public String vendorType;

        @NameInMap("snapshotUID")
        public String snapshotUID;

        @NameInMap("platform")
        public Platform platform;

        @NameInMap("platformStatus")
        public String platformStatus;

        @NameInMap("location")
        public String location;

        @NameInMap("oldProductVersion")
        public String oldProductVersion;

        @NameInMap("oldProductVersionUID")
        public String oldProductVersionUID;

        public static GetProductEnvironmentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetProductEnvironmentResponseBodyData self = new GetProductEnvironmentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetProductEnvironmentResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetProductEnvironmentResponseBodyData setClusterUID(String clusterUID) {
            this.clusterUID = clusterUID;
            return this;
        }
        public String getClusterUID() {
            return this.clusterUID;
        }

        public GetProductEnvironmentResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetProductEnvironmentResponseBodyData setInstanceList(java.util.List<InstanceInfo> instanceList) {
            this.instanceList = instanceList;
            return this;
        }
        public java.util.List<InstanceInfo> getInstanceList() {
            return this.instanceList;
        }

        public GetProductEnvironmentResponseBodyData setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public GetProductEnvironmentResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetProductEnvironmentResponseBodyData setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public GetProductEnvironmentResponseBodyData setProductVersion(String productVersion) {
            this.productVersion = productVersion;
            return this;
        }
        public String getProductVersion() {
            return this.productVersion;
        }

        public GetProductEnvironmentResponseBodyData setProductUID(String productUID) {
            this.productUID = productUID;
            return this;
        }
        public String getProductUID() {
            return this.productUID;
        }

        public GetProductEnvironmentResponseBodyData setProductVersionUID(String productVersionUID) {
            this.productVersionUID = productVersionUID;
            return this;
        }
        public String getProductVersionUID() {
            return this.productVersionUID;
        }

        public GetProductEnvironmentResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetProductEnvironmentResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public GetProductEnvironmentResponseBodyData setVendorConfig(String vendorConfig) {
            this.vendorConfig = vendorConfig;
            return this;
        }
        public String getVendorConfig() {
            return this.vendorConfig;
        }

        public GetProductEnvironmentResponseBodyData setVendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }
        public String getVendorType() {
            return this.vendorType;
        }

        public GetProductEnvironmentResponseBodyData setSnapshotUID(String snapshotUID) {
            this.snapshotUID = snapshotUID;
            return this;
        }
        public String getSnapshotUID() {
            return this.snapshotUID;
        }

        public GetProductEnvironmentResponseBodyData setPlatform(Platform platform) {
            this.platform = platform;
            return this;
        }
        public Platform getPlatform() {
            return this.platform;
        }

        public GetProductEnvironmentResponseBodyData setPlatformStatus(String platformStatus) {
            this.platformStatus = platformStatus;
            return this;
        }
        public String getPlatformStatus() {
            return this.platformStatus;
        }

        public GetProductEnvironmentResponseBodyData setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public GetProductEnvironmentResponseBodyData setOldProductVersion(String oldProductVersion) {
            this.oldProductVersion = oldProductVersion;
            return this;
        }
        public String getOldProductVersion() {
            return this.oldProductVersion;
        }

        public GetProductEnvironmentResponseBodyData setOldProductVersionUID(String oldProductVersionUID) {
            this.oldProductVersionUID = oldProductVersionUID;
            return this;
        }
        public String getOldProductVersionUID() {
            return this.oldProductVersionUID;
        }

    }

}
