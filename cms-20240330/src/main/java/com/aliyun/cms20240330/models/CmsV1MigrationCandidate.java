// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CmsV1MigrationCandidate extends TeaModel {
    /**
     * <p>The name of the source application group.</p>
     * 
     * <strong>example:</strong>
     * <p>order-service</p>
     */
    @NameInMap("groupName")
    public String groupName;

    /**
     * <p>The current migration or takeover status of the source group. Valid values: NOT_MIGRATED: Not migrated. PROCESSING: In progress. MIGRATED: Migrated. If a historical task lacks proof of source read-only status, NEEDS_REVIEW is returned through rejectionReason.</p>
     * 
     * <strong>example:</strong>
     * <p>PROCESSING</p>
     */
    @NameInMap("migrationStatus")
    public String migrationStatus;

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
     * <p>The reason why the group cannot be selected.</p>
     * 
     * <strong>example:</strong>
     * <p>NEEDS_REVIEW</p>
     */
    @NameInMap("rejectionReason")
    public String rejectionReason;

    /**
     * <p>Specifies whether the group can be selected for migration.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("selectable")
    public Boolean selectable;

    /**
     * <p>Specifies whether the source 1.0 group is persistently read-only.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("sourceReadOnly")
    public Boolean sourceReadOnly;

    /**
     * <p>The type of the source application group. Valid values: custom: Custom group. tag: Tag-based group. regMgr: Resource group-based group.</p>
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

    public static CmsV1MigrationCandidate build(java.util.Map<String, ?> map) throws Exception {
        CmsV1MigrationCandidate self = new CmsV1MigrationCandidate();
        return TeaModel.build(map, self);
    }

    public CmsV1MigrationCandidate setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CmsV1MigrationCandidate setMigrationStatus(String migrationStatus) {
        this.migrationStatus = migrationStatus;
        return this;
    }
    public String getMigrationStatus() {
        return this.migrationStatus;
    }

    public CmsV1MigrationCandidate setObserveGroupId(String observeGroupId) {
        this.observeGroupId = observeGroupId;
        return this;
    }
    public String getObserveGroupId() {
        return this.observeGroupId;
    }

    public CmsV1MigrationCandidate setOriginGroupId(String originGroupId) {
        this.originGroupId = originGroupId;
        return this;
    }
    public String getOriginGroupId() {
        return this.originGroupId;
    }

    public CmsV1MigrationCandidate setRejectionReason(String rejectionReason) {
        this.rejectionReason = rejectionReason;
        return this;
    }
    public String getRejectionReason() {
        return this.rejectionReason;
    }

    public CmsV1MigrationCandidate setSelectable(Boolean selectable) {
        this.selectable = selectable;
        return this;
    }
    public Boolean getSelectable() {
        return this.selectable;
    }

    public CmsV1MigrationCandidate setSourceReadOnly(Boolean sourceReadOnly) {
        this.sourceReadOnly = sourceReadOnly;
        return this;
    }
    public Boolean getSourceReadOnly() {
        return this.sourceReadOnly;
    }

    public CmsV1MigrationCandidate setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public CmsV1MigrationCandidate setTargetGroupName(String targetGroupName) {
        this.targetGroupName = targetGroupName;
        return this;
    }
    public String getTargetGroupName() {
        return this.targetGroupName;
    }

}
