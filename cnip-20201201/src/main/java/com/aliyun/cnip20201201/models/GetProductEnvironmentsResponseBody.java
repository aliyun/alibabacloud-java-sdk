// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetProductEnvironmentsResponseBody extends TeaModel {
    @NameInMap("data")
    public GetProductEnvironmentsResponseBodyData data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("success")
    public Boolean success;

    public static GetProductEnvironmentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProductEnvironmentsResponseBody self = new GetProductEnvironmentsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProductEnvironmentsResponseBody setData(GetProductEnvironmentsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetProductEnvironmentsResponseBodyData getData() {
        return this.data;
    }

    public GetProductEnvironmentsResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetProductEnvironmentsResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public GetProductEnvironmentsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetProductEnvironmentsResponseBodyData extends TeaModel {
        @NameInMap("clusterId")
        public String clusterId;

        @NameInMap("createdAt")
        public String createdAt;

        @NameInMap("description")
        public String description;

        @NameInMap("instanceList")
        public String instanceList;

        @NameInMap("name")
        public String name;

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

        public static GetProductEnvironmentsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetProductEnvironmentsResponseBodyData self = new GetProductEnvironmentsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetProductEnvironmentsResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetProductEnvironmentsResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetProductEnvironmentsResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetProductEnvironmentsResponseBodyData setInstanceList(String instanceList) {
            this.instanceList = instanceList;
            return this;
        }
        public String getInstanceList() {
            return this.instanceList;
        }

        public GetProductEnvironmentsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetProductEnvironmentsResponseBodyData setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public GetProductEnvironmentsResponseBodyData setProductVersion(String productVersion) {
            this.productVersion = productVersion;
            return this;
        }
        public String getProductVersion() {
            return this.productVersion;
        }

        public GetProductEnvironmentsResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public GetProductEnvironmentsResponseBodyData setVendorConfig(String vendorConfig) {
            this.vendorConfig = vendorConfig;
            return this;
        }
        public String getVendorConfig() {
            return this.vendorConfig;
        }

        public GetProductEnvironmentsResponseBodyData setVendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }
        public String getVendorType() {
            return this.vendorType;
        }

    }

}
