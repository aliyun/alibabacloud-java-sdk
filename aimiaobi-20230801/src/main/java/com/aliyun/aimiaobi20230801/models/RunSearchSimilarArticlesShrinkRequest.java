// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunSearchSimilarArticlesShrinkRequest extends TeaModel {
    @NameInMap("ChatConfig")
    public String chatConfigShrink;

    /**
     * <strong>example:</strong>
     * <p>html</p>
     */
    @NameInMap("DocType")
    public String docType;

    @NameInMap("Title")
    public String title;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxx/xxx">https://xxx/xxx</a></p>
     */
    @NameInMap("Url")
    public String url;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static RunSearchSimilarArticlesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RunSearchSimilarArticlesShrinkRequest self = new RunSearchSimilarArticlesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RunSearchSimilarArticlesShrinkRequest setChatConfigShrink(String chatConfigShrink) {
        this.chatConfigShrink = chatConfigShrink;
        return this;
    }
    public String getChatConfigShrink() {
        return this.chatConfigShrink;
    }

    public RunSearchSimilarArticlesShrinkRequest setDocType(String docType) {
        this.docType = docType;
        return this;
    }
    public String getDocType() {
        return this.docType;
    }

    public RunSearchSimilarArticlesShrinkRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public RunSearchSimilarArticlesShrinkRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RunSearchSimilarArticlesShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
