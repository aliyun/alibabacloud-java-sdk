// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DatasourceConfigUnified extends TeaModel {
    /**
     * <p>The Prometheus instance ID. This field is used when type is PROMETHEUS.</p>
     * 
     * <strong>example:</strong>
     * <p>rw-xxx</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>The original V1 datasource JSON string returned as a fallback when type is UNKNOWN and read path parsing fails. The frontend displays this field as read-only when it is not empty.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;type&quot;:&quot;SLS&quot;}</p>
     */
    @NameInMap("legacyRaw")
    public String legacyRaw;

    /**
     * <p>The legacy type, which is returned when type is UNKNOWN to indicate that this rule cannot be edited by using the new API. Submit a ticket to contact the CloudMonitor team.</p>
     * 
     * <strong>example:</strong>
     * <p>SLS</p>
     */
    @NameInMap("legacyType")
    public String legacyType;

    /**
     * <p>The namespace. This field is optional when type is VIRTUAL_PROMETHEUS and identifies the namespace to which the virtual Prometheus instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>selectdb</p>
     */
    @NameInMap("namespace")
    public String namespace;

    /**
     * <p>The cloud service category. This field is optional when type is CLOUD_MONITORING. Outputs unknown when this information is missing from the source.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("productCategory")
    public String productCategory;

    /**
     * <p>The Simple Log Service project name. This field is required when type is SLS, and all stores share the same project.</p>
     * 
     * <strong>example:</strong>
     * <p>my-project</p>
     */
    @NameInMap("project")
    public String project;

    /**
     * <p>The region ID. This field is optional for all types and defaults to the rule or gateway region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The Simple Log Service store list. This field is used when type is SLS and requires at least one store. Each store includes store and storeType. The project and regionId fields are moved to the top level. The fields with the same names remaining in Stores are deprecated and return 400 in the write path.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;store&quot;:&quot;cms-alert-log&quot;,&quot;storeType&quot;:&quot;log&quot;}]</p>
     */
    @NameInMap("stores")
    public java.util.List<Stores> stores;

    /**
     * <p>The tenant ID. This field is optional when type is VIRTUAL_PROMETHEUS and identifies the tenant to which the virtual Prometheus instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>t-xxxxxxx</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The data source type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PROMETHEUS</p>
     */
    @NameInMap("type")
    public String type;

    public static DatasourceConfigUnified build(java.util.Map<String, ?> map) throws Exception {
        DatasourceConfigUnified self = new DatasourceConfigUnified();
        return TeaModel.build(map, self);
    }

    public DatasourceConfigUnified setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DatasourceConfigUnified setLegacyRaw(String legacyRaw) {
        this.legacyRaw = legacyRaw;
        return this;
    }
    public String getLegacyRaw() {
        return this.legacyRaw;
    }

    public DatasourceConfigUnified setLegacyType(String legacyType) {
        this.legacyType = legacyType;
        return this;
    }
    public String getLegacyType() {
        return this.legacyType;
    }

    public DatasourceConfigUnified setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DatasourceConfigUnified setProductCategory(String productCategory) {
        this.productCategory = productCategory;
        return this;
    }
    public String getProductCategory() {
        return this.productCategory;
    }

    public DatasourceConfigUnified setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public DatasourceConfigUnified setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DatasourceConfigUnified setStores(java.util.List<Stores> stores) {
        this.stores = stores;
        return this;
    }
    public java.util.List<Stores> getStores() {
        return this.stores;
    }

    public DatasourceConfigUnified setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DatasourceConfigUnified setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
