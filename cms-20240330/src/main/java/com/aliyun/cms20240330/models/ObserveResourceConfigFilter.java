// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ObserveResourceConfigFilter extends TeaModel {
    /**
     * <p>The UModel resource domain filter (exact match).</p>
     */
    @NameInMap("entityDomain")
    public QueryAlertRulesEntityDomainFilter entityDomain;

    /**
     * <p>The UModel entity type filter (set inclusion/exclusion).</p>
     */
    @NameInMap("entityType")
    public QueryAlertRulesEntityTypeFilter entityType;

    /**
     * <p>The CloudMonitor namespace filter (exact match).</p>
     */
    @NameInMap("namespace")
    public QueryAlertRulesNamespaceFilter namespace;

    /**
     * <p>The CloudMonitor product category filter (exact match).</p>
     */
    @NameInMap("productCategory")
    public QueryAlertRulesProductCategoryFilter productCategory;

    /**
     * <p>The relationship type filter (set inclusion/exclusion): ALL/UMODEL_ENTITY/CLOUD_INSTANCE/GROUP_V1/GROUP_V2/TAG.</p>
     */
    @NameInMap("relationType")
    public QueryAlertRulesRelationTypeFilter relationType;

    /**
     * <p>The resources filter (contains uses OR matching; notContains excludes all).</p>
     */
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
