// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.anytrans20250707.models;

import com.aliyun.tea.*;

public class SubmitDocTranslateTaskShrinkRequest extends TeaModel {
    @NameInMap("ext")
    public String extShrink;

    /**
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("format")
    public String format;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>spoke-llm</p>
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
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("targetLanguage")
    public String targetLanguage;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxx-hangzhou.aliyuncs.com/docs/tmp/%E6%A0%B7%E4%BE%8B_%E6%97%A0%E5%9B%BE.pdf">https://xxx-hangzhou.aliyuncs.com/docs/tmp/%E6%A0%B7%E4%BE%8B_%E6%97%A0%E5%9B%BE.pdf</a></p>
     */
    @NameInMap("text")
    public String text;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-kqtrcpdee4xm29xc</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static SubmitDocTranslateTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitDocTranslateTaskShrinkRequest self = new SubmitDocTranslateTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitDocTranslateTaskShrinkRequest setExtShrink(String extShrink) {
        this.extShrink = extShrink;
        return this;
    }
    public String getExtShrink() {
        return this.extShrink;
    }

    public SubmitDocTranslateTaskShrinkRequest setFormat(String format) {
        this.format = format;
        return this;
    }
    public String getFormat() {
        return this.format;
    }

    public SubmitDocTranslateTaskShrinkRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public SubmitDocTranslateTaskShrinkRequest setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
        return this;
    }
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public SubmitDocTranslateTaskShrinkRequest setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
        return this;
    }
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

    public SubmitDocTranslateTaskShrinkRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public SubmitDocTranslateTaskShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
