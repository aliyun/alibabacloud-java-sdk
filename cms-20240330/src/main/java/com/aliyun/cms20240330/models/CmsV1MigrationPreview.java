// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CmsV1MigrationPreview extends TeaModel {
    /**
     * <p>The itemized check results for name and resource support.</p>
     */
    @NameInMap("checks")
    public java.util.List<CmsV1MigrationCheck> checks;

    /**
     * <p>The name of the source application group.</p>
     * 
     * <strong>example:</strong>
     * <p>order-service</p>
     */
    @NameInMap("groupName")
    public String groupName;

    /**
     * <p>Indicates whether the dry run is passed.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("migratable")
    public Boolean migratable;

    /**
     * <p>The ID of the target observation group.</p>
     * 
     * <strong>example:</strong>
     * <p>og-0123456789abcdef</p>
     */
    @NameInMap("observeGroupId")
    public String observeGroupId;

    /**
     * <p>The ID of the source CloudMonitor 1.0 application group.</p>
     * 
     * <strong>example:</strong>
     * <p>247675311</p>
     */
    @NameInMap("originGroupId")
    public String originGroupId;

    /**
     * <p>The reason for the dry run failure.</p>
     * 
     * <strong>example:</strong>
     * <p>NAME_INVALID</p>
     */
    @NameInMap("reason")
    public String reason;

    /**
     * <p>Indicates whether the source 1.0 group is persistently read-only.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("sourceReadOnly")
    public Boolean sourceReadOnly;

    /**
     * <p>The type of the source application group. custom indicates a custom group, tag indicates a tag-based group, and regMgr indicates a resource group-based group.</p>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("sourceType")
    public String sourceType;

    /**
     * <p>The name of the target observation group.</p>
     * 
     * <strong>example:</strong>
     * <p>order-service</p>
     */
    @NameInMap("targetGroupName")
    public String targetGroupName;

    public static CmsV1MigrationPreview build(java.util.Map<String, ?> map) throws Exception {
        CmsV1MigrationPreview self = new CmsV1MigrationPreview();
        return TeaModel.build(map, self);
    }

    public CmsV1MigrationPreview setChecks(java.util.List<CmsV1MigrationCheck> checks) {
        this.checks = checks;
        return this;
    }
    public java.util.List<CmsV1MigrationCheck> getChecks() {
        return this.checks;
    }

    public CmsV1MigrationPreview setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CmsV1MigrationPreview setMigratable(Boolean migratable) {
        this.migratable = migratable;
        return this;
    }
    public Boolean getMigratable() {
        return this.migratable;
    }

    public CmsV1MigrationPreview setObserveGroupId(String observeGroupId) {
        this.observeGroupId = observeGroupId;
        return this;
    }
    public String getObserveGroupId() {
        return this.observeGroupId;
    }

    public CmsV1MigrationPreview setOriginGroupId(String originGroupId) {
        this.originGroupId = originGroupId;
        return this;
    }
    public String getOriginGroupId() {
        return this.originGroupId;
    }

    public CmsV1MigrationPreview setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public CmsV1MigrationPreview setSourceReadOnly(Boolean sourceReadOnly) {
        this.sourceReadOnly = sourceReadOnly;
        return this;
    }
    public Boolean getSourceReadOnly() {
        return this.sourceReadOnly;
    }

    public CmsV1MigrationPreview setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public CmsV1MigrationPreview setTargetGroupName(String targetGroupName) {
        this.targetGroupName = targetGroupName;
        return this;
    }
    public String getTargetGroupName() {
        return this.targetGroupName;
    }

}
