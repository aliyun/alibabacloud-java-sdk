// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetDeliverableResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetDeliverableResponseBodyData data;

    @NameInMap("msg")
    public String msg;

    public static GetDeliverableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeliverableResponseBody self = new GetDeliverableResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeliverableResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDeliverableResponseBody setData(GetDeliverableResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDeliverableResponseBodyData getData() {
        return this.data;
    }

    public GetDeliverableResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public static class GetDeliverableResponseBodyDataFoundation extends TeaModel {
        @NameInMap("clusterConfig")
        public String clusterConfig;

        @NameInMap("foundationReferenceUID")
        public String foundationReferenceUID;

        @NameInMap("foundationVersion")
        public String foundationVersion;

        @NameInMap("foundationVersionUID")
        public String foundationVersionUID;

        public static GetDeliverableResponseBodyDataFoundation build(java.util.Map<String, ?> map) throws Exception {
            GetDeliverableResponseBodyDataFoundation self = new GetDeliverableResponseBodyDataFoundation();
            return TeaModel.build(map, self);
        }

        public GetDeliverableResponseBodyDataFoundation setClusterConfig(String clusterConfig) {
            this.clusterConfig = clusterConfig;
            return this;
        }
        public String getClusterConfig() {
            return this.clusterConfig;
        }

        public GetDeliverableResponseBodyDataFoundation setFoundationReferenceUID(String foundationReferenceUID) {
            this.foundationReferenceUID = foundationReferenceUID;
            return this;
        }
        public String getFoundationReferenceUID() {
            return this.foundationReferenceUID;
        }

        public GetDeliverableResponseBodyDataFoundation setFoundationVersion(String foundationVersion) {
            this.foundationVersion = foundationVersion;
            return this;
        }
        public String getFoundationVersion() {
            return this.foundationVersion;
        }

        public GetDeliverableResponseBodyDataFoundation setFoundationVersionUID(String foundationVersionUID) {
            this.foundationVersionUID = foundationVersionUID;
            return this;
        }
        public String getFoundationVersionUID() {
            return this.foundationVersionUID;
        }

    }

    public static class GetDeliverableResponseBodyDataProducts extends TeaModel {
        @NameInMap("namespace")
        public String namespace;

        @NameInMap("productName")
        public String productName;

        @NameInMap("productType")
        public String productType;

        @NameInMap("productUID")
        public String productUID;

        @NameInMap("productVersion")
        public String productVersion;

        @NameInMap("productVersionSpecName")
        public String productVersionSpecName;

        @NameInMap("productVersionSpecUID")
        public String productVersionSpecUID;

        @NameInMap("productVersionUID")
        public String productVersionUID;

        public static GetDeliverableResponseBodyDataProducts build(java.util.Map<String, ?> map) throws Exception {
            GetDeliverableResponseBodyDataProducts self = new GetDeliverableResponseBodyDataProducts();
            return TeaModel.build(map, self);
        }

        public GetDeliverableResponseBodyDataProducts setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public GetDeliverableResponseBodyDataProducts setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public GetDeliverableResponseBodyDataProducts setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public GetDeliverableResponseBodyDataProducts setProductUID(String productUID) {
            this.productUID = productUID;
            return this;
        }
        public String getProductUID() {
            return this.productUID;
        }

        public GetDeliverableResponseBodyDataProducts setProductVersion(String productVersion) {
            this.productVersion = productVersion;
            return this;
        }
        public String getProductVersion() {
            return this.productVersion;
        }

        public GetDeliverableResponseBodyDataProducts setProductVersionSpecName(String productVersionSpecName) {
            this.productVersionSpecName = productVersionSpecName;
            return this;
        }
        public String getProductVersionSpecName() {
            return this.productVersionSpecName;
        }

        public GetDeliverableResponseBodyDataProducts setProductVersionSpecUID(String productVersionSpecUID) {
            this.productVersionSpecUID = productVersionSpecUID;
            return this;
        }
        public String getProductVersionSpecUID() {
            return this.productVersionSpecUID;
        }

        public GetDeliverableResponseBodyDataProducts setProductVersionUID(String productVersionUID) {
            this.productVersionUID = productVersionUID;
            return this;
        }
        public String getProductVersionUID() {
            return this.productVersionUID;
        }

    }

    public static class GetDeliverableResponseBodyData extends TeaModel {
        @NameInMap("foundation")
        public GetDeliverableResponseBodyDataFoundation foundation;

        @NameInMap("products")
        public java.util.List<GetDeliverableResponseBodyDataProducts> products;

        @NameInMap("uid")
        public String uid;

        public static GetDeliverableResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDeliverableResponseBodyData self = new GetDeliverableResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDeliverableResponseBodyData setFoundation(GetDeliverableResponseBodyDataFoundation foundation) {
            this.foundation = foundation;
            return this;
        }
        public GetDeliverableResponseBodyDataFoundation getFoundation() {
            return this.foundation;
        }

        public GetDeliverableResponseBodyData setProducts(java.util.List<GetDeliverableResponseBodyDataProducts> products) {
            this.products = products;
            return this;
        }
        public java.util.List<GetDeliverableResponseBodyDataProducts> getProducts() {
            return this.products;
        }

        public GetDeliverableResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
