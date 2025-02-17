// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunCommentGenerationRequest extends TeaModel {
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
    public java.util.Map<String, ?> lengthRange;

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
    public java.util.Map<String, ?> sentiment;

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
    public java.util.Map<String, ?> type;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-3kcs1w3lltrtbfkr</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static RunCommentGenerationRequest build(java.util.Map<String, ?> map) throws Exception {
        RunCommentGenerationRequest self = new RunCommentGenerationRequest();
        return TeaModel.build(map, self);
    }

    public RunCommentGenerationRequest setAllowEmoji(Boolean allowEmoji) {
        this.allowEmoji = allowEmoji;
        return this;
    }
    public Boolean getAllowEmoji() {
        return this.allowEmoji;
    }

    public RunCommentGenerationRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public RunCommentGenerationRequest setLength(String length) {
        this.length = length;
        return this;
    }
    public String getLength() {
        return this.length;
    }

    public RunCommentGenerationRequest setLengthRange(java.util.Map<String, ?> lengthRange) {
        this.lengthRange = lengthRange;
        return this;
    }
    public java.util.Map<String, ?> getLengthRange() {
        return this.lengthRange;
    }

    public RunCommentGenerationRequest setNumComments(String numComments) {
        this.numComments = numComments;
        return this;
    }
    public String getNumComments() {
        return this.numComments;
    }

    public RunCommentGenerationRequest setSentiment(java.util.Map<String, ?> sentiment) {
        this.sentiment = sentiment;
        return this;
    }
    public java.util.Map<String, ?> getSentiment() {
        return this.sentiment;
    }

    public RunCommentGenerationRequest setSourceMaterial(String sourceMaterial) {
        this.sourceMaterial = sourceMaterial;
        return this;
    }
    public String getSourceMaterial() {
        return this.sourceMaterial;
    }

    public RunCommentGenerationRequest setStyle(String style) {
        this.style = style;
        return this;
    }
    public String getStyle() {
        return this.style;
    }

    public RunCommentGenerationRequest setType(java.util.Map<String, ?> type) {
        this.type = type;
        return this;
    }
    public java.util.Map<String, ?> getType() {
        return this.type;
    }

    public RunCommentGenerationRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
