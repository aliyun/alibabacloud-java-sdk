// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetEnvironmentResponseBody extends TeaModel {
    @NameInMap("data")
    public GetEnvironmentResponseBodyData data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("success")
    public Boolean success;

    public static GetEnvironmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEnvironmentResponseBody self = new GetEnvironmentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEnvironmentResponseBody setData(GetEnvironmentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetEnvironmentResponseBodyData getData() {
        return this.data;
    }

    public GetEnvironmentResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetEnvironmentResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public GetEnvironmentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
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

        @NameInMap("instanceList")
        public String instanceList;

        @NameInMap("location")
        public String location;

        @NameInMap("name")
        public String name;

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

        @NameInMap("instanceStatus")
        public String instanceStatus;

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

        public GetEnvironmentResponseBodyData setInstanceList(String instanceList) {
            this.instanceList = instanceList;
            return this;
        }
        public String getInstanceList() {
            return this.instanceList;
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

        public GetEnvironmentResponseBodyData setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

    }

}
