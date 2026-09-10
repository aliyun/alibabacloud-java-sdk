// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ObserveResourceConfig extends TeaModel {
    /**
     * <p>The UModel entity domain.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_monitor</p>
     */
    @NameInMap("entityDomain")
    public String entityDomain;

    /**
     * <p>The UModel entity type.</p>
     * 
     * <strong>example:</strong>
     * <p>ACS::ECS::Instance</p>
     */
    @NameInMap("entityType")
    public String entityType;

    /**
     * <p>The CloudMonitor namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>acs_ecs_dashboard</p>
     */
    @NameInMap("namespace")
    public String namespace;

    /**
     * <p>The CloudMonitor product category.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("productCategory")
    public String productCategory;

    /**
     * <p>The relation type. TAG is supported only for alert rules where datasourceConfig.type is set to APM and queryConfig.type is set to APM_MULTI_QUERY. UMODEL_ENTITY does not support writes and is used only for reading existing data.</p>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("relationType")
    public String relationType;

    /**
     * <p>The list of resources. If relationType is set to ALL, this parameter can be left empty, which indicates all resources. If relationType is set to TAG, this parameter is a list of labels in key=value format (such as [&quot;env=prod&quot;, &quot;app=foo&quot;]). This is supported only for APM data sources with APM_MULTI_QUERY.</p>
     */
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
