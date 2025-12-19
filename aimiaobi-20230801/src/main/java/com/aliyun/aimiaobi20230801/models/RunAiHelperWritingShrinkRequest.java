// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunAiHelperWritingShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DistributeWriting")
    public Boolean distributeWriting;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>请帮我写一篇关于人工智能发展趋势的文章</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <strong>example:</strong>
     * <p>Template</p>
     */
    @NameInMap("PromptMode")
    public String promptMode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-xxxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    /**
     * <strong>example:</strong>
     * <p>{&quot;wordCount&quot;: &quot;1000&quot;, &quot;tone&quot;: &quot;formal&quot;}</p>
     */
    @NameInMap("WritingParams")
    public String writingParamsShrink;

    /**
     * <p>写作场景：government(政务)、media(传媒)、market(营销)、office(办公)、custom(自定义)</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>media</p>
     */
    @NameInMap("WritingScene")
    public String writingScene;

    /**
     * <p>写作文体唯一标识KEY，可通过ListWritingStyles接口获取对应写作场景下的文体列表</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>news_article</p>
     */
    @NameInMap("WritingStyle")
    public String writingStyle;

    public static RunAiHelperWritingShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RunAiHelperWritingShrinkRequest self = new RunAiHelperWritingShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RunAiHelperWritingShrinkRequest setDistributeWriting(Boolean distributeWriting) {
        this.distributeWriting = distributeWriting;
        return this;
    }
    public Boolean getDistributeWriting() {
        return this.distributeWriting;
    }

    public RunAiHelperWritingShrinkRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public RunAiHelperWritingShrinkRequest setPromptMode(String promptMode) {
        this.promptMode = promptMode;
        return this;
    }
    public String getPromptMode() {
        return this.promptMode;
    }

    public RunAiHelperWritingShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public RunAiHelperWritingShrinkRequest setWritingParamsShrink(String writingParamsShrink) {
        this.writingParamsShrink = writingParamsShrink;
        return this;
    }
    public String getWritingParamsShrink() {
        return this.writingParamsShrink;
    }

    public RunAiHelperWritingShrinkRequest setWritingScene(String writingScene) {
        this.writingScene = writingScene;
        return this;
    }
    public String getWritingScene() {
        return this.writingScene;
    }

    public RunAiHelperWritingShrinkRequest setWritingStyle(String writingStyle) {
        this.writingStyle = writingStyle;
        return this;
    }
    public String getWritingStyle() {
        return this.writingStyle;
    }

}
