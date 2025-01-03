// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateMergeRequestRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>f0b1e61db5961df5975a93f9129d2513</p>
     */
    @NameInMap("accessToken")
    public String accessToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WEB</p>
     */
    @NameInMap("createFrom")
    public String createFrom;

    @NameInMap("description")
    public String description;

    @NameInMap("reviewerIds")
    public java.util.List<String> reviewerIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sourceBranch</p>
     */
    @NameInMap("sourceBranch")
    public String sourceBranch;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2369234</p>
     */
    @NameInMap("sourceProjectId")
    public Long sourceProjectId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>targetBranch</p>
     */
    @NameInMap("targetBranch")
    public String targetBranch;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2369234</p>
     */
    @NameInMap("targetProjectId")
    public Long targetProjectId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("title")
    public String title;

    /**
     * <strong>example:</strong>
     * <p>722200214032b6b31e6f1434ab</p>
     */
    @NameInMap("workItemIds")
    public String workItemIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6270e731cfea268afc21ccac</p>
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
