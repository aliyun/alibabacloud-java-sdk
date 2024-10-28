// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eduinterpreting20240828.models;

import com.aliyun.tea.*;

public class SubmitEvaluationTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://xx.com/abc.mp3">http://xx.com/abc.mp3</a></p>
     */
    @NameInMap("AudioUrl")
    public String audioUrl;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://abc.edu.org.cn/en/callback">https://abc.edu.org.cn/en/callback</a></p>
     */
    @NameInMap("CallbackUrl")
    public String callbackUrl;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>As flame of fire we gather, as skyful of stars we scatter.</p>
     */
    @NameInMap("MaterialText")
    public String materialText;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>433c1361-0f6e-48fc-ad51</p>
     */
    @NameInMap("OuterBizId")
    public String outerBizId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SuggestedAnswer")
    public String suggestedAnswer;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Text")
    public String text;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>EN_TO_ZH</p>
     */
    @NameInMap("Type")
    public String type;

    public static SubmitEvaluationTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitEvaluationTaskRequest self = new SubmitEvaluationTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitEvaluationTaskRequest setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
        return this;
    }
    public String getAudioUrl() {
        return this.audioUrl;
    }

    public SubmitEvaluationTaskRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public SubmitEvaluationTaskRequest setMaterialText(String materialText) {
        this.materialText = materialText;
        return this;
    }
    public String getMaterialText() {
        return this.materialText;
    }

    public SubmitEvaluationTaskRequest setOuterBizId(String outerBizId) {
        this.outerBizId = outerBizId;
        return this;
    }
    public String getOuterBizId() {
        return this.outerBizId;
    }

    public SubmitEvaluationTaskRequest setSuggestedAnswer(String suggestedAnswer) {
        this.suggestedAnswer = suggestedAnswer;
        return this;
    }
    public String getSuggestedAnswer() {
        return this.suggestedAnswer;
    }

    public SubmitEvaluationTaskRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public SubmitEvaluationTaskRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
