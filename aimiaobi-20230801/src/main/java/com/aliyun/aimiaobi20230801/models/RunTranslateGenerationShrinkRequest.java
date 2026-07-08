// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunTranslateGenerationShrinkRequest extends TeaModel {
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
    public String referenceDataShrink;

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

    public static RunTranslateGenerationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RunTranslateGenerationShrinkRequest self = new RunTranslateGenerationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RunTranslateGenerationShrinkRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public RunTranslateGenerationShrinkRequest setReferenceDataShrink(String referenceDataShrink) {
        this.referenceDataShrink = referenceDataShrink;
        return this;
    }
    public String getReferenceDataShrink() {
        return this.referenceDataShrink;
    }

    public RunTranslateGenerationShrinkRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public RunTranslateGenerationShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
