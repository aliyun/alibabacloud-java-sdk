// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.anytrans20250707.models;

import com.aliyun.tea.*;

public class SubmitHtmlTranslateTaskShrinkRequest extends TeaModel {
    @NameInMap("ext")
    public String extShrink;

    /**
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("format")
    public String format;

    /**
     * <strong>example:</strong>
     * <p>mt-turbo</p>
     */
    @NameInMap("scene")
    public String scene;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("sourceLanguage")
    public String sourceLanguage;

    /**
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("targetLanguage")
    public String targetLanguage;

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

    public static SubmitHtmlTranslateTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitHtmlTranslateTaskShrinkRequest self = new SubmitHtmlTranslateTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitHtmlTranslateTaskShrinkRequest setExtShrink(String extShrink) {
        this.extShrink = extShrink;
        return this;
    }
    public String getExtShrink() {
        return this.extShrink;
    }

    public SubmitHtmlTranslateTaskShrinkRequest setFormat(String format) {
        this.format = format;
        return this;
    }
    public String getFormat() {
        return this.format;
    }

    public SubmitHtmlTranslateTaskShrinkRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public SubmitHtmlTranslateTaskShrinkRequest setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
        return this;
    }
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public SubmitHtmlTranslateTaskShrinkRequest setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
        return this;
    }
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

    public SubmitHtmlTranslateTaskShrinkRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public SubmitHtmlTranslateTaskShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
