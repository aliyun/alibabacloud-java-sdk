// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListChildrenComponentVersionResponseBody extends TeaModel {
    @NameInMap("data")
    public ListChildrenComponentVersionResponseBodyData data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("success")
    public Boolean success;

    public static ListChildrenComponentVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListChildrenComponentVersionResponseBody self = new ListChildrenComponentVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public ListChildrenComponentVersionResponseBody setData(ListChildrenComponentVersionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListChildrenComponentVersionResponseBodyData getData() {
        return this.data;
    }

    public ListChildrenComponentVersionResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ListChildrenComponentVersionResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public ListChildrenComponentVersionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListChildrenComponentVersionResponseBodyData extends TeaModel {
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

        @NameInMap("uid")
        public String uid;

        @NameInMap("vendorConfig")
        public String vendorConfig;

        @NameInMap("vendorType")
        public String vendorType;

        public static ListChildrenComponentVersionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListChildrenComponentVersionResponseBodyData self = new ListChildrenComponentVersionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListChildrenComponentVersionResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListChildrenComponentVersionResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListChildrenComponentVersionResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListChildrenComponentVersionResponseBodyData setInstanceList(String instanceList) {
            this.instanceList = instanceList;
            return this;
        }
        public String getInstanceList() {
            return this.instanceList;
        }

        public ListChildrenComponentVersionResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListChildrenComponentVersionResponseBodyData setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public ListChildrenComponentVersionResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public ListChildrenComponentVersionResponseBodyData setVendorConfig(String vendorConfig) {
            this.vendorConfig = vendorConfig;
            return this;
        }
        public String getVendorConfig() {
            return this.vendorConfig;
        }

        public ListChildrenComponentVersionResponseBodyData setVendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }
        public String getVendorType() {
            return this.vendorType;
        }

    }

}
