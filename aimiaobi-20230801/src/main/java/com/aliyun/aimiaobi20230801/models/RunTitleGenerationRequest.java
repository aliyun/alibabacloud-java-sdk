// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunTitleGenerationRequest extends TeaModel {
    /**
     * <p>A collection of titles to deduplicate against the newly generated titles. The total character count for all titles must not exceed 5K.</p>
     */
    @NameInMap("DeduplicatedTitles")
    public java.util.List<String> deduplicatedTitles;

    /**
     * <p>Data for title generation.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ReferenceData")
    public RunTitleGenerationRequestReferenceData referenceData;

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

    public static RunTitleGenerationRequest build(java.util.Map<String, ?> map) throws Exception {
        RunTitleGenerationRequest self = new RunTitleGenerationRequest();
        return TeaModel.build(map, self);
    }

    public RunTitleGenerationRequest setDeduplicatedTitles(java.util.List<String> deduplicatedTitles) {
        this.deduplicatedTitles = deduplicatedTitles;
        return this;
    }
    public java.util.List<String> getDeduplicatedTitles() {
        return this.deduplicatedTitles;
    }

    public RunTitleGenerationRequest setReferenceData(RunTitleGenerationRequestReferenceData referenceData) {
        this.referenceData = referenceData;
        return this;
    }
    public RunTitleGenerationRequestReferenceData getReferenceData() {
        return this.referenceData;
    }

    public RunTitleGenerationRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public RunTitleGenerationRequest setTitleCount(String titleCount) {
        this.titleCount = titleCount;
        return this;
    }
    public String getTitleCount() {
        return this.titleCount;
    }

    public RunTitleGenerationRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class RunTitleGenerationRequestReferenceData extends TeaModel {
        /**
         * <p>List of main content.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Contents")
        public java.util.List<String> contents;

        public static RunTitleGenerationRequestReferenceData build(java.util.Map<String, ?> map) throws Exception {
            RunTitleGenerationRequestReferenceData self = new RunTitleGenerationRequestReferenceData();
            return TeaModel.build(map, self);
        }

        public RunTitleGenerationRequestReferenceData setContents(java.util.List<String> contents) {
            this.contents = contents;
            return this;
        }
        public java.util.List<String> getContents() {
            return this.contents;
        }

    }

}
