// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunTitleGenerationShrinkRequest extends TeaModel {
    /**
     * <p>A collection of titles to deduplicate against the newly generated titles. The total character count for all titles must not exceed 5K.</p>
     */
    @NameInMap("DeduplicatedTitles")
    public String deduplicatedTitlesShrink;

    /**
     * <p>Data for title generation.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ReferenceData")
    public String referenceDataShrink;

    /**
     * <p>The unique identifier for the associated creative article.</p>
     * <blockquote>
     * <p>The system automatically generates the TaskId by default. You do not need to specify it. If subsequent tasks use the same TaskId, they belong to the same conversation group.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>Number of titles to generate, maximum 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TitleCount")
    public String titleCount;

    /**
     * <p>The unique identifier for the Alibaba Cloud Model Studio workspace. For more information, see <a href="https://help.aliyun.com/document_detail/2782167.html">Get the workspace ID</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-xxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static RunTitleGenerationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RunTitleGenerationShrinkRequest self = new RunTitleGenerationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RunTitleGenerationShrinkRequest setDeduplicatedTitlesShrink(String deduplicatedTitlesShrink) {
        this.deduplicatedTitlesShrink = deduplicatedTitlesShrink;
        return this;
    }
    public String getDeduplicatedTitlesShrink() {
        return this.deduplicatedTitlesShrink;
    }

    public RunTitleGenerationShrinkRequest setReferenceDataShrink(String referenceDataShrink) {
        this.referenceDataShrink = referenceDataShrink;
        return this;
    }
    public String getReferenceDataShrink() {
        return this.referenceDataShrink;
    }

    public RunTitleGenerationShrinkRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public RunTitleGenerationShrinkRequest setTitleCount(String titleCount) {
        this.titleCount = titleCount;
        return this;
    }
    public String getTitleCount() {
        return this.titleCount;
    }

    public RunTitleGenerationShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
