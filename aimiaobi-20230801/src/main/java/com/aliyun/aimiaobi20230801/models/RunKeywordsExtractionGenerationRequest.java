// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunKeywordsExtractionGenerationRequest extends TeaModel {
    /**
     * <p>Custom prompt.</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <p>Data required for generation.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ReferenceData")
    public RunKeywordsExtractionGenerationRequestReferenceData referenceData;

    /**
     * <p>The unique identifier for the associated creation article.</p>
     * <blockquote>
     * <p>TaskId is not required by default; the system automatically generates it. If subsequent tasks use the same TaskId, they belong to the same conversation group.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The unique identifier for the Alibaba Cloud Model Studio workspace. Obtain the <a href="https://help.aliyun.com/document_detail/2782167.html">Workspace ID</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-xxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static RunKeywordsExtractionGenerationRequest build(java.util.Map<String, ?> map) throws Exception {
        RunKeywordsExtractionGenerationRequest self = new RunKeywordsExtractionGenerationRequest();
        return TeaModel.build(map, self);
    }

    public RunKeywordsExtractionGenerationRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public RunKeywordsExtractionGenerationRequest setReferenceData(RunKeywordsExtractionGenerationRequestReferenceData referenceData) {
        this.referenceData = referenceData;
        return this;
    }
    public RunKeywordsExtractionGenerationRequestReferenceData getReferenceData() {
        return this.referenceData;
    }

    public RunKeywordsExtractionGenerationRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public RunKeywordsExtractionGenerationRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class RunKeywordsExtractionGenerationRequestReferenceData extends TeaModel {
        /**
         * <p>List of content.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Contents")
        public java.util.List<String> contents;

        public static RunKeywordsExtractionGenerationRequestReferenceData build(java.util.Map<String, ?> map) throws Exception {
            RunKeywordsExtractionGenerationRequestReferenceData self = new RunKeywordsExtractionGenerationRequestReferenceData();
            return TeaModel.build(map, self);
        }

        public RunKeywordsExtractionGenerationRequestReferenceData setContents(java.util.List<String> contents) {
            this.contents = contents;
            return this;
        }
        public java.util.List<String> getContents() {
            return this.contents;
        }

    }

}
