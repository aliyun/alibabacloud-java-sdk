// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunTitleGenerationShrinkRequest extends TeaModel {
    @NameInMap("DeduplicatedTitles")
    public String deduplicatedTitlesShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ReferenceData")
    public String referenceDataShrink;

    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TitleCount")
    public String titleCount;

    /**
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
