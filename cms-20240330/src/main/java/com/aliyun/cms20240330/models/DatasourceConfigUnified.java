// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DatasourceConfigUnified extends TeaModel {
    /**
     * <p>The Prometheus instance ID. Used when type is set to PROMETHEUS.</p>
     * 
     * <strong>example:</strong>
     * <p>rw-xxx</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>The raw V1 datasource JSON string returned as a read-path fallback when type is set to UNKNOWN and parsing fails. The frontend displays this field as read-only when the value is not empty.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;type&quot;:&quot;SLS&quot;}</p>
     */
    @NameInMap("legacyRaw")
    public String legacyRaw;

    /**
     * <p>Returned when type is set to UNKNOWN. Indicates that the rule cannot be edited through the new API. Submit a ticket to contact the CloudMonitor team.</p>
     * 
     * <strong>example:</strong>
     * <p>SLS</p>
     */
    @NameInMap("legacyType")
    public String legacyType;

    /**
     * <p>The namespace. Optional when type is set to VIRTUAL_PROMETHEUS. Identifies the namespace to which the virtual Prometheus instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>selectdb</p>
     */
    @NameInMap("namespace")
    public String namespace;

    /**
     * <p>The Alibaba Cloud service category. Optional when type is set to CLOUD_MONITORING. Returns unknown when the source does not contain this information.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("productCategory")
    public String productCategory;

    /**
     * <p>The Simple Log Service (SLS) project name. Required when type is set to SLS. All stores share the same project.</p>
     * 
     * <strong>example:</strong>
     * <p>my-project</p>
     */
    @NameInMap("project")
    public String project;

    /**
     * <p>The region ID. Optional for all types. Defaults to the region of the rule or gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The list of SLS stores. Used when type is set to SLS. At least one store is required. Each store contains store and storeType fields. The project and regionId fields have been moved to the top level. The deprecated fields with the same names that remain in stores return a 400 error if used in write paths.</p>
     */
    @NameInMap("stores")
    public java.util.List<Stores> stores;

    /**
     * <p>The tenant ID. Optional when type is set to VIRTUAL_PROMETHEUS. Identifies the tenant to which the virtual Prometheus instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>t-xxxxxxx</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The datasource type.</p>
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
