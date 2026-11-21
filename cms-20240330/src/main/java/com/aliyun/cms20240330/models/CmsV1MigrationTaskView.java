// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CmsV1MigrationTaskView extends TeaModel {
    /**
     * <p>The migration batch ID.</p>
     * 
     * <strong>example:</strong>
     * <p>00112233-4455-4677-8899-aabbccddeeff</p>
     */
    @NameInMap("batchId")
    public String batchId;

    /**
     * <p>Indicates whether to provide a recovery prompt for existing frozen tasks. This field does not grant authorization. Each recovery re-verifies the original bindings. Tasks with the SUCCESS status are not retried.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("canRecover")
    public Boolean canRecover;

    /**
     * <p>The task failure description.</p>
     * 
     * <strong>example:</strong>
     * <p>UNSUPPORTED_RESOURCE: source members cannot be translated without loss</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>The source application group name.</p>
     * 
     * <strong>example:</strong>
     * <p>order-service</p>
     */
    @NameInMap("groupName")
    public String groupName;

    /**
     * <p>The target observation group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>og-0123456789abcdef</p>
     */
    @NameInMap("observeGroupId")
    public String observeGroupId;

    /**
     * <p>The source CloudMonitor 1.0 application group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>247675311</p>
     */
    @NameInMap("originGroupId")
    public String originGroupId;

    /**
     * <p>Indicates whether the source 1.0 group is persistently set to read-only.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("sourceReadOnly")
    public Boolean sourceReadOnly;

    /**
     * <p>The migration task status. Valid values: PENDING, RUNNING, SUCCESS, SKIPPED, and FAILED.</p>
     * 
     * <strong>example:</strong>
     * <p>FAILED</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The takeover stage. Valid values: PENDING, SOURCE_LOCKED, TARGET_CREATED, READ_ONLY, and NEEDS_REVIEW.</p>
     * 
     * <strong>example:</strong>
     * <p>SOURCE_LOCKED</p>
     */
    @NameInMap("takeoverStage")
    public String takeoverStage;

    /**
     * <p>The target observation group name.</p>
     * 
     * <strong>example:</strong>
     * <p>order-service</p>
     */
    @NameInMap("targetGroupName")
    public String targetGroupName;

    /**
     * <p>The migration task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("taskId")
    public Long taskId;

    public static CmsV1MigrationTaskView build(java.util.Map<String, ?> map) throws Exception {
        CmsV1MigrationTaskView self = new CmsV1MigrationTaskView();
        return TeaModel.build(map, self);
    }

    public CmsV1MigrationTaskView setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public CmsV1MigrationTaskView setCanRecover(Boolean canRecover) {
        this.canRecover = canRecover;
        return this;
    }
    public Boolean getCanRecover() {
        return this.canRecover;
    }

    public CmsV1MigrationTaskView setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CmsV1MigrationTaskView setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CmsV1MigrationTaskView setObserveGroupId(String observeGroupId) {
        this.observeGroupId = observeGroupId;
        return this;
    }
    public String getObserveGroupId() {
        return this.observeGroupId;
    }

    public CmsV1MigrationTaskView setOriginGroupId(String originGroupId) {
        this.originGroupId = originGroupId;
        return this;
    }
    public String getOriginGroupId() {
        return this.originGroupId;
    }

    public CmsV1MigrationTaskView setSourceReadOnly(Boolean sourceReadOnly) {
        this.sourceReadOnly = sourceReadOnly;
        return this;
    }
    public Boolean getSourceReadOnly() {
        return this.sourceReadOnly;
    }

    public CmsV1MigrationTaskView setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CmsV1MigrationTaskView setTakeoverStage(String takeoverStage) {
        this.takeoverStage = takeoverStage;
        return this;
    }
    public String getTakeoverStage() {
        return this.takeoverStage;
    }

    public CmsV1MigrationTaskView setTargetGroupName(String targetGroupName) {
        this.targetGroupName = targetGroupName;
        return this;
    }
    public String getTargetGroupName() {
        return this.targetGroupName;
    }

    public CmsV1MigrationTaskView setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
