// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetEnvironmentNodeResponseBody extends TeaModel {
    @NameInMap("data")
    public GetEnvironmentNodeResponseBodyData data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("success")
    public Boolean success;

    public static GetEnvironmentNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEnvironmentNodeResponseBody self = new GetEnvironmentNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEnvironmentNodeResponseBody setData(GetEnvironmentNodeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetEnvironmentNodeResponseBodyData getData() {
        return this.data;
    }

    public GetEnvironmentNodeResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetEnvironmentNodeResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public GetEnvironmentNodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetEnvironmentNodeResponseBodyData extends TeaModel {
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

        public static GetEnvironmentNodeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetEnvironmentNodeResponseBodyData self = new GetEnvironmentNodeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetEnvironmentNodeResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetEnvironmentNodeResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetEnvironmentNodeResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetEnvironmentNodeResponseBodyData setInstanceList(String instanceList) {
            this.instanceList = instanceList;
            return this;
        }
        public String getInstanceList() {
            return this.instanceList;
        }

        public GetEnvironmentNodeResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetEnvironmentNodeResponseBodyData setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public GetEnvironmentNodeResponseBodyData setProductVersion(String productVersion) {
            this.productVersion = productVersion;
            return this;
        }
        public String getProductVersion() {
            return this.productVersion;
        }

        public GetEnvironmentNodeResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public GetEnvironmentNodeResponseBodyData setVendorConfig(String vendorConfig) {
            this.vendorConfig = vendorConfig;
            return this;
        }
        public String getVendorConfig() {
            return this.vendorConfig;
        }

        public GetEnvironmentNodeResponseBodyData setVendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }
        public String getVendorType() {
            return this.vendorType;
        }

    }

}
