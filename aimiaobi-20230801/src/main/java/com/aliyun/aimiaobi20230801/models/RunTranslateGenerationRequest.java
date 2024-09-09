// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunTranslateGenerationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>toEnglish</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ReferenceData")
    public RunTranslateGenerationRequestReferenceData referenceData;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-xxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static RunTranslateGenerationRequest build(java.util.Map<String, ?> map) throws Exception {
        RunTranslateGenerationRequest self = new RunTranslateGenerationRequest();
        return TeaModel.build(map, self);
    }

    public RunTranslateGenerationRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public RunTranslateGenerationRequest setReferenceData(RunTranslateGenerationRequestReferenceData referenceData) {
        this.referenceData = referenceData;
        return this;
    }
    public RunTranslateGenerationRequestReferenceData getReferenceData() {
        return this.referenceData;
    }

    public RunTranslateGenerationRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public RunTranslateGenerationRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class RunTranslateGenerationRequestReferenceData extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Contents")
        public java.util.List<String> contents;

        public static RunTranslateGenerationRequestReferenceData build(java.util.Map<String, ?> map) throws Exception {
            RunTranslateGenerationRequestReferenceData self = new RunTranslateGenerationRequestReferenceData();
            return TeaModel.build(map, self);
        }

        public RunTranslateGenerationRequestReferenceData setContents(java.util.List<String> contents) {
            this.contents = contents;
            return this;
        }
        public java.util.List<String> getContents() {
            return this.contents;
        }

    }

}
