// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DatasourceConfigUnified extends TeaModel {
    /**
     * <p>The Prometheus instance ID (required when type=PROMETHEUS; ignored for other types).</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>The original V1 datasource JSON string returned as a fallback when type=UNKNOWN and the read path fails to parse the datasource. If the frontend detects that this field is not empty, display it as read-only.</p>
     */
    @NameInMap("legacyRaw")
    public String legacyRaw;

    /**
     * <p>Returned when type=UNKNOWN, indicating that this rule cannot be edited through the new API. Submit a ticket to contact the CloudMonitor team.</p>
     */
    @NameInMap("legacyType")
    public String legacyType;

    /**
     * <p>The Alibaba Cloud service category (optional when type=CLOUD_MONITORING). If the source does not contain this information, the value unknown is returned.</p>
     */
    @NameInMap("productCategory")
    public String productCategory;

    /**
     * <p>The Simple Log Service project name (required when type=SLS; all stores share the same project).</p>
     */
    @NameInMap("project")
    public String project;

    /**
     * <p>The region ID (optional for PROMETHEUS / UMODEL / APM / SLS types; defaults to the same region as the rule or gateway. CLOUD_MONITORING does not use this field; use AlertRuleV2.regionId instead).</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The list of Simple Log Service stores (used when type=SLS; at least one store is required). Each store contains store and storeType fields. The project and regionId fields have been moved to the top level. The deprecated fields with the same names that remain in stores cause a 400 error if used in write paths.</p>
     */
    @NameInMap("stores")
    public java.util.List<Stores> stores;

    /**
     * <p>The datasource type. Valid values: PROMETHEUS (instanceId is required; regionId is optional). UMODEL (regionId is optional; other settings are carried in queryConfig/conditionConfig). APM (regionId is optional). CLOUD_MONITORING (regionId and productCategory are optional). UNKNOWN (read-only fallback; do not use in write paths). Do not use non-enumerated values (such as CMS_BASIC_DS or SLS_DS). The backend returns an Invalidtype 400 error.</p>
     * <p>This parameter is required.</p>
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

    public DatasourceConfigUnified setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
