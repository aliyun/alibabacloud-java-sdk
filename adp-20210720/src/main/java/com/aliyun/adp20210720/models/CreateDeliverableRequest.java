// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class CreateDeliverableRequest extends TeaModel {
    @NameInMap("foundation")
    public CreateDeliverableRequestFoundation foundation;

    @NameInMap("products")
    public java.util.List<CreateDeliverableRequestProducts> products;

    public static CreateDeliverableRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDeliverableRequest self = new CreateDeliverableRequest();
        return TeaModel.build(map, self);
    }

    public CreateDeliverableRequest setFoundation(CreateDeliverableRequestFoundation foundation) {
        this.foundation = foundation;
        return this;
    }
    public CreateDeliverableRequestFoundation getFoundation() {
        return this.foundation;
    }

    public CreateDeliverableRequest setProducts(java.util.List<CreateDeliverableRequestProducts> products) {
        this.products = products;
        return this;
    }
    public java.util.List<CreateDeliverableRequestProducts> getProducts() {
        return this.products;
    }

    public static class CreateDeliverableRequestFoundation extends TeaModel {
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

        public static CreateDeliverableRequestFoundation build(java.util.Map<String, ?> map) throws Exception {
            CreateDeliverableRequestFoundation self = new CreateDeliverableRequestFoundation();
            return TeaModel.build(map, self);
        }

        public CreateDeliverableRequestFoundation setClusterConfig(String clusterConfig) {
            this.clusterConfig = clusterConfig;
            return this;
        }
        public String getClusterConfig() {
            return this.clusterConfig;
        }

        public CreateDeliverableRequestFoundation setFoundationReferenceUID(String foundationReferenceUID) {
            this.foundationReferenceUID = foundationReferenceUID;
            return this;
        }
        public String getFoundationReferenceUID() {
            return this.foundationReferenceUID;
        }

        public CreateDeliverableRequestFoundation setFoundationVersion(String foundationVersion) {
            this.foundationVersion = foundationVersion;
            return this;
        }
        public String getFoundationVersion() {
            return this.foundationVersion;
        }

        public CreateDeliverableRequestFoundation setFoundationVersionUID(String foundationVersionUID) {
            this.foundationVersionUID = foundationVersionUID;
            return this;
        }
        public String getFoundationVersionUID() {
            return this.foundationVersionUID;
        }

        public CreateDeliverableRequestFoundation setReusable(Boolean reusable) {
            this.reusable = reusable;
            return this;
        }
        public Boolean getReusable() {
            return this.reusable;
        }

    }

    public static class CreateDeliverableRequestProducts extends TeaModel {
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

        public static CreateDeliverableRequestProducts build(java.util.Map<String, ?> map) throws Exception {
            CreateDeliverableRequestProducts self = new CreateDeliverableRequestProducts();
            return TeaModel.build(map, self);
        }

        public CreateDeliverableRequestProducts setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public CreateDeliverableRequestProducts setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public CreateDeliverableRequestProducts setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public CreateDeliverableRequestProducts setProductUID(String productUID) {
            this.productUID = productUID;
            return this;
        }
        public String getProductUID() {
            return this.productUID;
        }

        public CreateDeliverableRequestProducts setProductVersion(String productVersion) {
            this.productVersion = productVersion;
            return this;
        }
        public String getProductVersion() {
            return this.productVersion;
        }

        public CreateDeliverableRequestProducts setProductVersionSpecName(String productVersionSpecName) {
            this.productVersionSpecName = productVersionSpecName;
            return this;
        }
        public String getProductVersionSpecName() {
            return this.productVersionSpecName;
        }

        public CreateDeliverableRequestProducts setProductVersionSpecUID(String productVersionSpecUID) {
            this.productVersionSpecUID = productVersionSpecUID;
            return this;
        }
        public String getProductVersionSpecUID() {
            return this.productVersionSpecUID;
        }

        public CreateDeliverableRequestProducts setProductVersionUID(String productVersionUID) {
            this.productVersionUID = productVersionUID;
            return this;
        }
        public String getProductVersionUID() {
            return this.productVersionUID;
        }

    }

}
