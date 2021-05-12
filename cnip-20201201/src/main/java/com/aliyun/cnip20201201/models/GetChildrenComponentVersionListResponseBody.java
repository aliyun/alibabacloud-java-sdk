// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetChildrenComponentVersionListResponseBody extends TeaModel {
    @NameInMap("data")
    public GetChildrenComponentVersionListResponseBodyData data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("success")
    public Boolean success;

    public static GetChildrenComponentVersionListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetChildrenComponentVersionListResponseBody self = new GetChildrenComponentVersionListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetChildrenComponentVersionListResponseBody setData(GetChildrenComponentVersionListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetChildrenComponentVersionListResponseBodyData getData() {
        return this.data;
    }

    public GetChildrenComponentVersionListResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetChildrenComponentVersionListResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public GetChildrenComponentVersionListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetChildrenComponentVersionListResponseBodyData extends TeaModel {
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

        public static GetChildrenComponentVersionListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetChildrenComponentVersionListResponseBodyData self = new GetChildrenComponentVersionListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetChildrenComponentVersionListResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetChildrenComponentVersionListResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetChildrenComponentVersionListResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetChildrenComponentVersionListResponseBodyData setInstanceList(String instanceList) {
            this.instanceList = instanceList;
            return this;
        }
        public String getInstanceList() {
            return this.instanceList;
        }

        public GetChildrenComponentVersionListResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetChildrenComponentVersionListResponseBodyData setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public GetChildrenComponentVersionListResponseBodyData setProductVersion(String productVersion) {
            this.productVersion = productVersion;
            return this;
        }
        public String getProductVersion() {
            return this.productVersion;
        }

        public GetChildrenComponentVersionListResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public GetChildrenComponentVersionListResponseBodyData setVendorConfig(String vendorConfig) {
            this.vendorConfig = vendorConfig;
            return this;
        }
        public String getVendorConfig() {
            return this.vendorConfig;
        }

        public GetChildrenComponentVersionListResponseBodyData setVendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }
        public String getVendorType() {
            return this.vendorType;
        }

    }

}
