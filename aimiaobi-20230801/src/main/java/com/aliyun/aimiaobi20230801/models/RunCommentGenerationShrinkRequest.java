// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunCommentGenerationShrinkRequest extends TeaModel {
    /**
     * <p>Set to true to allow emoji in comments. Default is false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AllowEmoji")
    public Boolean allowEmoji;

    /**
     * <p>Additional instructions.</p>
     * 
     * <strong>example:</strong>
     * <p>不要输出额外其他信息</p>
     */
    @NameInMap("ExtraInfo")
    public String extraInfo;

    /**
     * <p>Length of each comment in characters.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Length")
    public String length;

    /**
     * <p>Length distribution.</p>
     * <p>Valid keys:</p>
     * <ul>
     * <li><p>short (up to 20 characters)</p>
     * </li>
     * <li><p>medium (20–50 characters)</p>
     * </li>
     * <li><p>long (50–100 characters)</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;short&quot;:&quot;50&quot;,&quot;long&quot;:“50”}</p>
     */
    @NameInMap("LengthRange")
    public String lengthRangeShrink;

    /**
     * <p>ID of the model to use.</p>
     * 
     * <strong>example:</strong>
     * <p>quanmiao-max、quanmiao-plus</p>
     */
    @NameInMap("ModelId")
    public String modelId;

    /**
     * <p>Number of comments to generate.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("NumComments")
    public String numComments;

    /**
     * <p>Sentiment distribution.</p>
     * <p>Valid keys:</p>
     * <ul>
     * <li><p>positive</p>
     * </li>
     * <li><p>neutral</p>
     * </li>
     * <li><p>negative</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;positive&quot;:&quot;50&quot;,&quot;negative&quot;:&quot;50&quot;}</p>
     */
    @NameInMap("Sentiment")
    public String sentimentShrink;

    /**
     * <p>Session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>Article to comment on.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ps5是sony新一代的游戏机，他创新性的...</p>
     */
    @NameInMap("SourceMaterial")
    public String sourceMaterial;

    /**
     * <p>Tone of the comments.</p>
     * 
     * <strong>example:</strong>
     * <p>积极正面</p>
     */
    @NameInMap("Style")
    public String style;

    /**
     * <p>Comment type.</p>
     * <p>Valid keys:</p>
     * <ul>
     * <li><p>emotion (expresses emotion)</p>
     * </li>
     * <li><p>opinion (states an opinion)</p>
     * </li>
     * <li><p>interaction (encourages interaction)</p>
     * </li>
     * <li><p>experience (shares experience)</p>
     * </li>
     * <li><p>humor (uses humor)</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;emotion&quot;:&quot;50&quot;,&quot;opinion&quot;:&quot;50&quot;}</p>
     */
    @NameInMap("Type")
    public String typeShrink;

    /**
     * <p>Path parameter. The unique identifier of your Alibaba Cloud Model Studio workspace. To get this ID, see <a href="https://help.aliyun.com/document_detail/2782167.html">Get the workspace ID</a>.</p>
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

    public RunCommentGenerationShrinkRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
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
