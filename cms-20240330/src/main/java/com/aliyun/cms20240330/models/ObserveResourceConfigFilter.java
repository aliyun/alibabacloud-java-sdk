// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ObserveResourceConfigFilter extends TeaModel {
    @NameInMap("entityDomain")
    public QueryAlertRulesEntityDomainFilter entityDomain;

    @NameInMap("entityType")
    public QueryAlertRulesEntityTypeFilter entityType;

    @NameInMap("namespace")
    public QueryAlertRulesNamespaceFilter namespace;

    @NameInMap("productCategory")
    public QueryAlertRulesProductCategoryFilter productCategory;

    @NameInMap("relationType")
    public QueryAlertRulesRelationTypeFilter relationType;

    @NameInMap("resources")
    public QueryAlertRulesResourcesFilter resources;

    public static ObserveResourceConfigFilter build(java.util.Map<String, ?> map) throws Exception {
        ObserveResourceConfigFilter self = new ObserveResourceConfigFilter();
        return TeaModel.build(map, self);
    }

    public ObserveResourceConfigFilter setEntityDomain(QueryAlertRulesEntityDomainFilter entityDomain) {
        this.entityDomain = entityDomain;
        return this;
    }
    public QueryAlertRulesEntityDomainFilter getEntityDomain() {
        return this.entityDomain;
    }

    public ObserveResourceConfigFilter setEntityType(QueryAlertRulesEntityTypeFilter entityType) {
        this.entityType = entityType;
        return this;
    }
    public QueryAlertRulesEntityTypeFilter getEntityType() {
        return this.entityType;
    }

    public ObserveResourceConfigFilter setNamespace(QueryAlertRulesNamespaceFilter namespace) {
        this.namespace = namespace;
        return this;
    }
    public QueryAlertRulesNamespaceFilter getNamespace() {
        return this.namespace;
    }

    public ObserveResourceConfigFilter setProductCategory(QueryAlertRulesProductCategoryFilter productCategory) {
        this.productCategory = productCategory;
        return this;
    }
    public QueryAlertRulesProductCategoryFilter getProductCategory() {
        return this.productCategory;
    }

    public ObserveResourceConfigFilter setRelationType(QueryAlertRulesRelationTypeFilter relationType) {
        this.relationType = relationType;
        return this;
    }
    public QueryAlertRulesRelationTypeFilter getRelationType() {
        return this.relationType;
    }

    public ObserveResourceConfigFilter setResources(QueryAlertRulesResourcesFilter resources) {
        this.resources = resources;
        return this;
    }
    public QueryAlertRulesResourcesFilter getResources() {
        return this.resources;
    }

}
