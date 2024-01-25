// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class CreateDeliveryInstanceRequest extends TeaModel {
    @NameInMap("clusterUID")
    public String clusterUID;

    @NameInMap("deliverableConfigUID")
    public String deliverableConfigUID;

    @NameInMap("deliverableUID")
    public String deliverableUID;

    @NameInMap("envUID")
    public String envUID;

    @NameInMap("foundation")
    public CreateDeliveryInstanceRequestFoundation foundation;

    @NameInMap("products")
    public java.util.List<CreateDeliveryInstanceRequestProducts> products;

    @NameInMap("templateUID")
    public String templateUID;

    public static CreateDeliveryInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDeliveryInstanceRequest self = new CreateDeliveryInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateDeliveryInstanceRequest setClusterUID(String clusterUID) {
        this.clusterUID = clusterUID;
        return this;
    }
    public String getClusterUID() {
        return this.clusterUID;
    }

    public CreateDeliveryInstanceRequest setDeliverableConfigUID(String deliverableConfigUID) {
        this.deliverableConfigUID = deliverableConfigUID;
        return this;
    }
    public String getDeliverableConfigUID() {
        return this.deliverableConfigUID;
    }

    public CreateDeliveryInstanceRequest setDeliverableUID(String deliverableUID) {
        this.deliverableUID = deliverableUID;
        return this;
    }
    public String getDeliverableUID() {
        return this.deliverableUID;
    }

    public CreateDeliveryInstanceRequest setEnvUID(String envUID) {
        this.envUID = envUID;
        return this;
    }
    public String getEnvUID() {
        return this.envUID;
    }

    public CreateDeliveryInstanceRequest setFoundation(CreateDeliveryInstanceRequestFoundation foundation) {
        this.foundation = foundation;
        return this;
    }
    public CreateDeliveryInstanceRequestFoundation getFoundation() {
        return this.foundation;
    }

    public CreateDeliveryInstanceRequest setProducts(java.util.List<CreateDeliveryInstanceRequestProducts> products) {
        this.products = products;
        return this;
    }
    public java.util.List<CreateDeliveryInstanceRequestProducts> getProducts() {
        return this.products;
    }

    public CreateDeliveryInstanceRequest setTemplateUID(String templateUID) {
        this.templateUID = templateUID;
        return this;
    }
    public String getTemplateUID() {
        return this.templateUID;
    }

    public static class CreateDeliveryInstanceRequestFoundation extends TeaModel {
        @NameInMap("clusterConfig")
        public String clusterConfig;

        @NameInMap("foundationReferenceUID")
        public String foundationReferenceUID;

        @NameInMap("foundationVersion")
        public String foundationVersion;

        @NameInMap("foundationVersionUID")
        public String foundationVersionUID;

        @NameInMap("reusable")
        public String reusable;

        public static CreateDeliveryInstanceRequestFoundation build(java.util.Map<String, ?> map) throws Exception {
            CreateDeliveryInstanceRequestFoundation self = new CreateDeliveryInstanceRequestFoundation();
            return TeaModel.build(map, self);
        }

        public CreateDeliveryInstanceRequestFoundation setClusterConfig(String clusterConfig) {
            this.clusterConfig = clusterConfig;
            return this;
        }
        public String getClusterConfig() {
            return this.clusterConfig;
        }

        public CreateDeliveryInstanceRequestFoundation setFoundationReferenceUID(String foundationReferenceUID) {
            this.foundationReferenceUID = foundationReferenceUID;
            return this;
        }
        public String getFoundationReferenceUID() {
            return this.foundationReferenceUID;
        }

        public CreateDeliveryInstanceRequestFoundation setFoundationVersion(String foundationVersion) {
            this.foundationVersion = foundationVersion;
            return this;
        }
        public String getFoundationVersion() {
            return this.foundationVersion;
        }

        public CreateDeliveryInstanceRequestFoundation setFoundationVersionUID(String foundationVersionUID) {
            this.foundationVersionUID = foundationVersionUID;
            return this;
        }
        public String getFoundationVersionUID() {
            return this.foundationVersionUID;
        }

        public CreateDeliveryInstanceRequestFoundation setReusable(String reusable) {
            this.reusable = reusable;
            return this;
        }
        public String getReusable() {
            return this.reusable;
        }

    }

    public static class CreateDeliveryInstanceRequestProducts extends TeaModel {
        @NameInMap("namespace")
        public String namespace;

        @NameInMap("order")
        public String order;

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

        public static CreateDeliveryInstanceRequestProducts build(java.util.Map<String, ?> map) throws Exception {
            CreateDeliveryInstanceRequestProducts self = new CreateDeliveryInstanceRequestProducts();
            return TeaModel.build(map, self);
        }

        public CreateDeliveryInstanceRequestProducts setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public CreateDeliveryInstanceRequestProducts setOrder(String order) {
            this.order = order;
            return this;
        }
        public String getOrder() {
            return this.order;
        }

        public CreateDeliveryInstanceRequestProducts setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public CreateDeliveryInstanceRequestProducts setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public CreateDeliveryInstanceRequestProducts setProductUID(String productUID) {
            this.productUID = productUID;
            return this;
        }
        public String getProductUID() {
            return this.productUID;
        }

        public CreateDeliveryInstanceRequestProducts setProductVersion(String productVersion) {
            this.productVersion = productVersion;
            return this;
        }
        public String getProductVersion() {
            return this.productVersion;
        }

        public CreateDeliveryInstanceRequestProducts setProductVersionSpecName(String productVersionSpecName) {
            this.productVersionSpecName = productVersionSpecName;
            return this;
        }
        public String getProductVersionSpecName() {
            return this.productVersionSpecName;
        }

        public CreateDeliveryInstanceRequestProducts setProductVersionSpecUID(String productVersionSpecUID) {
            this.productVersionSpecUID = productVersionSpecUID;
            return this;
        }
        public String getProductVersionSpecUID() {
            return this.productVersionSpecUID;
        }

        public CreateDeliveryInstanceRequestProducts setProductVersionUID(String productVersionUID) {
            this.productVersionUID = productVersionUID;
            return this;
        }
        public String getProductVersionUID() {
            return this.productVersionUID;
        }

    }

}
