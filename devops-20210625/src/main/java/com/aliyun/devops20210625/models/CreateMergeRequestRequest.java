// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateMergeRequestRequest extends TeaModel {
    @NameInMap("accessToken")
    public String accessToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("createFrom")
    public String createFrom;

    @NameInMap("description")
    public String description;

    @NameInMap("reviewerIds")
    public java.util.List<String> reviewerIds;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("sourceBranch")
    public String sourceBranch;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("sourceProjectId")
    public Long sourceProjectId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("targetBranch")
    public String targetBranch;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("targetProjectId")
    public Long targetProjectId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("title")
    public String title;

    @NameInMap("workItemIds")
    public String workItemIds;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("organizationId")
    public String organizationId;

    public static CreateMergeRequestRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMergeRequestRequest self = new CreateMergeRequestRequest();
        return TeaModel.build(map, self);
    }

    public CreateMergeRequestRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public CreateMergeRequestRequest setCreateFrom(String createFrom) {
        this.createFrom = createFrom;
        return this;
    }
    public String getCreateFrom() {
        return this.createFrom;
    }

    public CreateMergeRequestRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateMergeRequestRequest setReviewerIds(java.util.List<String> reviewerIds) {
        this.reviewerIds = reviewerIds;
        return this;
    }
    public java.util.List<String> getReviewerIds() {
        return this.reviewerIds;
    }

    public CreateMergeRequestRequest setSourceBranch(String sourceBranch) {
        this.sourceBranch = sourceBranch;
        return this;
    }
    public String getSourceBranch() {
        return this.sourceBranch;
    }

    public CreateMergeRequestRequest setSourceProjectId(Long sourceProjectId) {
        this.sourceProjectId = sourceProjectId;
        return this;
    }
    public Long getSourceProjectId() {
        return this.sourceProjectId;
    }

    public CreateMergeRequestRequest setTargetBranch(String targetBranch) {
        this.targetBranch = targetBranch;
        return this;
    }
    public String getTargetBranch() {
        return this.targetBranch;
    }

    public CreateMergeRequestRequest setTargetProjectId(Long targetProjectId) {
        this.targetProjectId = targetProjectId;
        return this;
    }
    public Long getTargetProjectId() {
        return this.targetProjectId;
    }

    public CreateMergeRequestRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateMergeRequestRequest setWorkItemIds(String workItemIds) {
        this.workItemIds = workItemIds;
        return this;
    }
    public String getWorkItemIds() {
        return this.workItemIds;
    }

    public CreateMergeRequestRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
