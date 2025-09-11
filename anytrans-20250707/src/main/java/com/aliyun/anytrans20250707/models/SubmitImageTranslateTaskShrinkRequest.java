// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.anytrans20250707.models;

import com.aliyun.tea.*;

public class SubmitImageTranslateTaskShrinkRequest extends TeaModel {
    @NameInMap("ext")
    public String extShrink;

    /**
     * <strong>example:</strong>
     * <p>image</p>
     */
    @NameInMap("format")
    public String format;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>flash</p>
     */
    @NameInMap("scene")
    public String scene;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("sourceLanguage")
    public String sourceLanguage;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("targetLanguage")
    public String targetLanguageShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("text")
    public String text;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-kqtrcpdee4xm29xx</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static SubmitImageTranslateTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitImageTranslateTaskShrinkRequest self = new SubmitImageTranslateTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitImageTranslateTaskShrinkRequest setExtShrink(String extShrink) {
        this.extShrink = extShrink;
        return this;
    }
    public String getExtShrink() {
        return this.extShrink;
    }

    public SubmitImageTranslateTaskShrinkRequest setFormat(String format) {
        this.format = format;
        return this;
    }
    public String getFormat() {
        return this.format;
    }

    public SubmitImageTranslateTaskShrinkRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public SubmitImageTranslateTaskShrinkRequest setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
        return this;
    }
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public SubmitImageTranslateTaskShrinkRequest setTargetLanguageShrink(String targetLanguageShrink) {
        this.targetLanguageShrink = targetLanguageShrink;
        return this;
    }
    public String getTargetLanguageShrink() {
        return this.targetLanguageShrink;
    }

    public SubmitImageTranslateTaskShrinkRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public SubmitImageTranslateTaskShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
