// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunAiHelperWritingRequest extends TeaModel {
    /**
     * <p>Specifies whether to generate the text step by step.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DistributeWriting")
    public Boolean distributeWriting;

    /**
     * <p>The prompt, which specifies the subject for the AI to write about.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>请帮我写一篇关于人工智能发展趋势的文章</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <p>The prompt pattern. For example, PE indicates the advanced pattern and Template indicates the template pattern.</p>
     * 
     * <strong>example:</strong>
     * <p>Template</p>
     */
    @NameInMap("PromptMode")
    public String promptMode;

    /**
     * <p>The <a href="https://help.aliyun.com/document_detail/2782167.html">workspace</a> ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-xxxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    /**
     * <p>The writing parameters from the previous form, specified as key-value pairs.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;wordCount&quot;: &quot;1000&quot;, &quot;tone&quot;: &quot;formal&quot;}</p>
     */
    @NameInMap("WritingParams")
    public java.util.Map<String, String> writingParams;

    /**
     * <p>The writing scenario. Valid values: government, media, market, office, and custom.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>media</p>
     */
    @NameInMap("WritingScene")
    public String writingScene;

    /**
     * <p>The unique key for the writing style. Call the <a href="https://help.aliyun.com/document_detail/2922609.html">ListWritingStyles</a> operation to get a list of styles for the specified scenario.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>通知</p>
     */
    @NameInMap("WritingStyle")
    public String writingStyle;

    public static RunAiHelperWritingRequest build(java.util.Map<String, ?> map) throws Exception {
        RunAiHelperWritingRequest self = new RunAiHelperWritingRequest();
        return TeaModel.build(map, self);
    }

    public RunAiHelperWritingRequest setDistributeWriting(Boolean distributeWriting) {
        this.distributeWriting = distributeWriting;
        return this;
    }
    public Boolean getDistributeWriting() {
        return this.distributeWriting;
    }

    public RunAiHelperWritingRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public RunAiHelperWritingRequest setPromptMode(String promptMode) {
        this.promptMode = promptMode;
        return this;
    }
    public String getPromptMode() {
        return this.promptMode;
    }

    public RunAiHelperWritingRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public RunAiHelperWritingRequest setWritingParams(java.util.Map<String, String> writingParams) {
        this.writingParams = writingParams;
        return this;
    }
    public java.util.Map<String, String> getWritingParams() {
        return this.writingParams;
    }

    public RunAiHelperWritingRequest setWritingScene(String writingScene) {
        this.writingScene = writingScene;
        return this;
    }
    public String getWritingScene() {
        return this.writingScene;
    }

    public RunAiHelperWritingRequest setWritingStyle(String writingStyle) {
        this.writingStyle = writingStyle;
        return this;
    }
    public String getWritingStyle() {
        return this.writingStyle;
    }

}
