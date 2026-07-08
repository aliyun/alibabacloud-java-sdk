// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunWriteToneGenerationRequest extends TeaModel {
    /**
     * <p>Tone. Examples include lyrical, bold, subtle, excited, friendly, and inspirational.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>励志</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <p>Data required for generation.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ReferenceData")
    public RunWriteToneGenerationRequestReferenceData referenceData;

    /**
     * <p>Unique identifier of the associated article.</p>
     * <blockquote>
     * <p>You do not need to specify TaskId. The system generates it automatically. If you use the same TaskId in later requests, those requests belong to the same conversation group.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>7AA2AE16-D873-5C5F-9708-15396C382EB1</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>Unique identifier of your Alibaba Cloud Model Studio workspace. To get this ID, see <a href="https://help.aliyun.com/document_detail/2782167.html">Workspace ID</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-xxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static RunWriteToneGenerationRequest build(java.util.Map<String, ?> map) throws Exception {
        RunWriteToneGenerationRequest self = new RunWriteToneGenerationRequest();
        return TeaModel.build(map, self);
    }

    public RunWriteToneGenerationRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public RunWriteToneGenerationRequest setReferenceData(RunWriteToneGenerationRequestReferenceData referenceData) {
        this.referenceData = referenceData;
        return this;
    }
    public RunWriteToneGenerationRequestReferenceData getReferenceData() {
        return this.referenceData;
    }

    public RunWriteToneGenerationRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public RunWriteToneGenerationRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class RunWriteToneGenerationRequestReferenceData extends TeaModel {
        /**
         * <p>List of main text blocks.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Contents")
        public java.util.List<String> contents;

        public static RunWriteToneGenerationRequestReferenceData build(java.util.Map<String, ?> map) throws Exception {
            RunWriteToneGenerationRequestReferenceData self = new RunWriteToneGenerationRequestReferenceData();
            return TeaModel.build(map, self);
        }

        public RunWriteToneGenerationRequestReferenceData setContents(java.util.List<String> contents) {
            this.contents = contents;
            return this;
        }
        public java.util.List<String> getContents() {
            return this.contents;
        }

    }

}
