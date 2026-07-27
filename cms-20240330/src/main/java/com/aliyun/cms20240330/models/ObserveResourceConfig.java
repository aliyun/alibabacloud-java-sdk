// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ObserveResourceConfig extends TeaModel {
    @NameInMap("entityDomain")
    public String entityDomain;

    @NameInMap("entityType")
    public String entityType;

    @NameInMap("namespace")
    public String namespace;

    @NameInMap("productCategory")
    public String productCategory;

    @NameInMap("relationType")
    public String relationType;

    @NameInMap("resources")
    public java.util.List<String> resources;

    public static ObserveResourceConfig build(java.util.Map<String, ?> map) throws Exception {
        ObserveResourceConfig self = new ObserveResourceConfig();
        return TeaModel.build(map, self);
    }

    public ObserveResourceConfig setEntityDomain(String entityDomain) {
        this.entityDomain = entityDomain;
        return this;
    }
    public String getEntityDomain() {
        return this.entityDomain;
    }

    public ObserveResourceConfig setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public ObserveResourceConfig setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ObserveResourceConfig setProductCategory(String productCategory) {
        this.productCategory = productCategory;
        return this;
    }
    public String getProductCategory() {
        return this.productCategory;
    }

    public ObserveResourceConfig setRelationType(String relationType) {
        this.relationType = relationType;
        return this;
    }
    public String getRelationType() {
        return this.relationType;
    }

    public ObserveResourceConfig setResources(java.util.List<String> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<String> getResources() {
        return this.resources;
    }

}
