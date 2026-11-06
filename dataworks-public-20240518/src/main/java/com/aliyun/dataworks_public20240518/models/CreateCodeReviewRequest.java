// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateCodeReviewRequest extends TeaModel {
    /**
     * <p>The description of the code review. The maximum length is 1,024 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>Code review</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of a single release pipeline.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pipeline-id</p>
     */
    @NameInMap("PipelineRunId")
    public String pipelineRunId;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>23620</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>Specifies the reviewers. Separate multiple accounts with commas (,). At least one reviewer is required, and the maximum length is 512 characters after deduplication.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123456,2345678901234567</p>
     */
    @NameInMap("Reviewers")
    public String reviewers;

    public static CreateCodeReviewRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCodeReviewRequest self = new CreateCodeReviewRequest();
        return TeaModel.build(map, self);
    }

    public CreateCodeReviewRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateCodeReviewRequest setPipelineRunId(String pipelineRunId) {
        this.pipelineRunId = pipelineRunId;
        return this;
    }
    public String getPipelineRunId() {
        return this.pipelineRunId;
    }

    public CreateCodeReviewRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateCodeReviewRequest setReviewers(String reviewers) {
        this.reviewers = reviewers;
        return this;
    }
    public String getReviewers() {
        return this.reviewers;
    }

}
