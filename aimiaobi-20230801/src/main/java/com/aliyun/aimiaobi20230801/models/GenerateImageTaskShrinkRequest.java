// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GenerateImageTaskShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e1be065b-adc3-435e-bd01-1c18c5ed75d3</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e1be065b-adc3-435e-bd01-1c18c5ed75d3</p>
     */
    @NameInMap("ArticleTaskId")
    public String articleTaskId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ParagraphList")
    public String paragraphListShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1024*1024</p>
     */
    @NameInMap("Size")
    public String size;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <auto>
     */
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
