// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class UpdateDeliverableRequest extends TeaModel {
    @NameInMap("foundation")
    public UpdateDeliverableRequestFoundation foundation;

    @NameInMap("products")
    public java.util.List<UpdateDeliverableRequestProducts> products;

    @NameInMap("status")
    public String status;

    public static UpdateDeliverableRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeliverableRequest self = new UpdateDeliverableRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDeliverableRequest setFoundation(UpdateDeliverableRequestFoundation foundation) {
        this.foundation = foundation;
        return this;
    }
    public UpdateDeliverableRequestFoundation getFoundation() {
        return this.foundation;
    }

    public UpdateDeliverableRequest setProducts(java.util.List<UpdateDeliverableRequestProducts> products) {
        this.products = products;
        return this;
    }
    public java.util.List<UpdateDeliverableRequestProducts> getProducts() {
        return this.products;
    }

    public UpdateDeliverableRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class UpdateDeliverableRequestFoundation extends TeaModel {
        @NameInMap("clusterConfig")
        public String clusterConfig;

        @NameInMap("foundationReferenceUID")
        public String foundationReferenceUID;

        @NameInMap("foundationVersion")
        public String foundationVersion;

        @NameInMap("foundationVersionUID")
        public String foundationVersionUID;

        @NameInMap("reusable")
        public Boolean reusable;

        public static UpdateDeliverableRequestFoundation build(java.util.Map<String, ?> map) throws Exception {
            UpdateDeliverableRequestFoundation self = new UpdateDeliverableRequestFoundation();
            return TeaModel.build(map, self);
        }

        public UpdateDeliverableRequestFoundation setClusterConfig(String clusterConfig) {
            this.clusterConfig = clusterConfig;
            return this;
        }
        public String getClusterConfig() {
            return this.clusterConfig;
        }

        public UpdateDeliverableRequestFoundation setFoundationReferenceUID(String foundationReferenceUID) {
            this.foundationReferenceUID = foundationReferenceUID;
            return this;
        }
        public String getFoundationReferenceUID() {
            return this.foundationReferenceUID;
        }

        public UpdateDeliverableRequestFoundation setFoundationVersion(String foundationVersion) {
            this.foundationVersion = foundationVersion;
            return this;
        }
        public String getFoundationVersion() {
            return this.foundationVersion;
        }

        public UpdateDeliverableRequestFoundation setFoundationVersionUID(String foundationVersionUID) {
            this.foundationVersionUID = foundationVersionUID;
            return this;
        }
        public String getFoundationVersionUID() {
            return this.foundationVersionUID;
        }

        public UpdateDeliverableRequestFoundation setReusable(Boolean reusable) {
            this.reusable = reusable;
            return this;
        }
        public Boolean getReusable() {
            return this.reusable;
        }

    }

    public static class UpdateDeliverableRequestProducts extends TeaModel {
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

        public static UpdateDeliverableRequestProducts build(java.util.Map<String, ?> map) throws Exception {
            UpdateDeliverableRequestProducts self = new UpdateDeliverableRequestProducts();
            return TeaModel.build(map, self);
        }

        public UpdateDeliverableRequestProducts setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public UpdateDeliverableRequestProducts setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public UpdateDeliverableRequestProducts setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public UpdateDeliverableRequestProducts setProductUID(String productUID) {
            this.productUID = productUID;
            return this;
        }
        public String getProductUID() {
            return this.productUID;
        }

        public UpdateDeliverableRequestProducts setProductVersion(String productVersion) {
            this.productVersion = productVersion;
            return this;
        }
        public String getProductVersion() {
            return this.productVersion;
        }

        public UpdateDeliverableRequestProducts setProductVersionSpecName(String productVersionSpecName) {
            this.productVersionSpecName = productVersionSpecName;
            return this;
        }
        public String getProductVersionSpecName() {
            return this.productVersionSpecName;
        }

        public UpdateDeliverableRequestProducts setProductVersionSpecUID(String productVersionSpecUID) {
            this.productVersionSpecUID = productVersionSpecUID;
            return this;
        }
        public String getProductVersionSpecUID() {
            return this.productVersionSpecUID;
        }

        public UpdateDeliverableRequestProducts setProductVersionUID(String productVersionUID) {
            this.productVersionUID = productVersionUID;
            return this;
        }
        public String getProductVersionUID() {
            return this.productVersionUID;
        }

    }

}
