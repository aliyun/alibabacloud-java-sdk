// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GenerateImageTaskShrinkRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("ArticleTaskId")
    public String articleTaskId;

    @NameInMap("ParagraphList")
    public String paragraphListShrink;

    @NameInMap("Size")
    public String size;

    @NameInMap("Style")
    public String style;

    public static GenerateImageTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateImageTaskShrinkRequest self = new GenerateImageTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GenerateImageTaskShrinkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public GenerateImageTaskShrinkRequest setArticleTaskId(String articleTaskId) {
        this.articleTaskId = articleTaskId;
        return this;
    }
    public String getArticleTaskId() {
        return this.articleTaskId;
    }

    public GenerateImageTaskShrinkRequest setParagraphListShrink(String paragraphListShrink) {
        this.paragraphListShrink = paragraphListShrink;
        return this;
    }
    public String getParagraphListShrink() {
        return this.paragraphListShrink;
    }

    public GenerateImageTaskShrinkRequest setSize(String size) {
        this.size = size;
        return this;
    }
    public String getSize() {
        return this.size;
    }

    public GenerateImageTaskShrinkRequest setStyle(String style) {
        this.style = style;
        return this;
    }
    public String getStyle() {
        return this.style;
    }

}
