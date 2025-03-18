// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunCommentGenerationShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AllowEmoji")
    public Boolean allowEmoji;

    @NameInMap("ExtraInfo")
    public String extraInfo;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Length")
    public String length;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;short&quot;:&quot;50&quot;,&quot;long&quot;:“50”}</p>
     */
    @NameInMap("LengthRange")
    public String lengthRangeShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("NumComments")
    public String numComments;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;positive&quot;:&quot;50&quot;,&quot;negative&quot;:&quot;50&quot;}</p>
     */
    @NameInMap("Sentiment")
    public String sentimentShrink;

    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceMaterial")
    public String sourceMaterial;

    @NameInMap("Style")
    public String style;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;emotion&quot;:&quot;50&quot;,&quot;opinion&quot;:&quot;50&quot;}</p>
     */
    @NameInMap("Type")
    public String typeShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-3kcs1w3lltrtbfkr</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static RunCommentGenerationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RunCommentGenerationShrinkRequest self = new RunCommentGenerationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RunCommentGenerationShrinkRequest setAllowEmoji(Boolean allowEmoji) {
        this.allowEmoji = allowEmoji;
        return this;
    }
    public Boolean getAllowEmoji() {
        return this.allowEmoji;
    }

    public RunCommentGenerationShrinkRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public RunCommentGenerationShrinkRequest setLength(String length) {
        this.length = length;
        return this;
    }
    public String getLength() {
        return this.length;
    }

    public RunCommentGenerationShrinkRequest setLengthRangeShrink(String lengthRangeShrink) {
        this.lengthRangeShrink = lengthRangeShrink;
        return this;
    }
    public String getLengthRangeShrink() {
        return this.lengthRangeShrink;
    }

    public RunCommentGenerationShrinkRequest setNumComments(String numComments) {
        this.numComments = numComments;
        return this;
    }
    public String getNumComments() {
        return this.numComments;
    }

    public RunCommentGenerationShrinkRequest setSentimentShrink(String sentimentShrink) {
        this.sentimentShrink = sentimentShrink;
        return this;
    }
    public String getSentimentShrink() {
        return this.sentimentShrink;
    }

    public RunCommentGenerationShrinkRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public RunCommentGenerationShrinkRequest setSourceMaterial(String sourceMaterial) {
        this.sourceMaterial = sourceMaterial;
        return this;
    }
    public String getSourceMaterial() {
        return this.sourceMaterial;
    }

    public RunCommentGenerationShrinkRequest setStyle(String style) {
        this.style = style;
        return this;
    }
    public String getStyle() {
        return this.style;
    }

    public RunCommentGenerationShrinkRequest setTypeShrink(String typeShrink) {
        this.typeShrink = typeShrink;
        return this;
    }
    public String getTypeShrink() {
        return this.typeShrink;
    }

    public RunCommentGenerationShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
