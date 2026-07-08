// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunQuickWritingShrinkRequest extends TeaModel {
    /**
     * <p>Referenced articles</p>
     * 
     * <strong>example:</strong>
     * <p>集合</p>
     */
    @NameInMap("Articles")
    public String articlesShrink;

    /**
     * <p>Other writing parameters. Choose either prompt or writingParams.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>请按英文输出</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <p>Use the specified search source list.</p>
     */
    @NameInMap("SearchSources")
    public String searchSourcesShrink;

    /**
     * <p>Task ID. Reuse the same task ID for multi-turn conversations.</p>
     * 
     * <strong>example:</strong>
     * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p><a href="https://help.aliyun.com/document_detail/2782167.html">Workspace ID</a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static RunQuickWritingShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RunQuickWritingShrinkRequest self = new RunQuickWritingShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RunQuickWritingShrinkRequest setArticlesShrink(String articlesShrink) {
        this.articlesShrink = articlesShrink;
        return this;
    }
    public String getArticlesShrink() {
        return this.articlesShrink;
    }

    public RunQuickWritingShrinkRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public RunQuickWritingShrinkRequest setSearchSourcesShrink(String searchSourcesShrink) {
        this.searchSourcesShrink = searchSourcesShrink;
        return this;
    }
    public String getSearchSourcesShrink() {
        return this.searchSourcesShrink;
    }

    public RunQuickWritingShrinkRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public RunQuickWritingShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
