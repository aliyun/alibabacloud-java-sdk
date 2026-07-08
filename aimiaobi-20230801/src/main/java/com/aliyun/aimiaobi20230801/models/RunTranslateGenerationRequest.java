// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunTranslateGenerationRequest extends TeaModel {
    /**
     * <p>The target language for translation. The source language is automatically detected.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Language</th>
     * <th>Prompt value</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>English</td>
     * <td>English</td>
     * </tr>
     * <tr>
     * <td>Simplified Chinese</td>
     * <td>Chinese</td>
     * </tr>
     * <tr>
     * <td>Japanese</td>
     * <td>Japanese</td>
     * </tr>
     * <tr>
     * <td>Korean</td>
     * <td>Korean</td>
     * </tr>
     * <tr>
     * <td>Spanish</td>
     * <td>Spanish</td>
     * </tr>
     * <tr>
     * <td>French</td>
     * <td>French</td>
     * </tr>
     * <tr>
     * <td>Portuguese</td>
     * <td>Portuguese</td>
     * </tr>
     * <tr>
     * <td>German</td>
     * <td>German</td>
     * </tr>
     * <tr>
     * <td>Italian</td>
     * <td>Italian</td>
     * </tr>
     * </tbody></table>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>English</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <p>The data required for generation.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ReferenceData")
    public RunTranslateGenerationRequestReferenceData referenceData;

    /**
     * <p>Optional. The unique ID of the associated creative article.</p>
     * <blockquote>
     * <p>You do not need to specify TaskId. The system generates one automatically. If subsequent tasks use the same TaskId, they belong to the same conversation group.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The unique ID of the Alibaba Cloud Model Studio workspace. For more information, see <a href="https://help.aliyun.com/document_detail/2782167.html">Get a Workspace ID</a>.</p>
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
         * <p>A list of content.</p>
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
