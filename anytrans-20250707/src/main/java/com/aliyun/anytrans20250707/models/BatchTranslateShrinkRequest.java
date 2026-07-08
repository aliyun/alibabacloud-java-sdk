// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.anytrans20250707.models;

import com.aliyun.tea.*;

public class BatchTranslateShrinkRequest extends TeaModel {
    /**
     * <p>The name of the calling application.</p>
     * 
     * <strong>example:</strong>
     * <p>baidufanyi</p>
     */
    @NameInMap("appName")
    public String appName;

    /**
     * <p>The extended parameters that control translation features.</p>
     */
    @NameInMap("ext")
    public String extShrink;

    /**
     * <p>The translation format.</p>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("format")
    public String format;

    /**
     * <p>The translation model.</p>
     * 
     * <strong>example:</strong>
     * <p>mt-turbo</p>
     */
    @NameInMap("scene")
    public String scene;

    /**
     * <p>The source language.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("sourceLanguage")
    public String sourceLanguage;

    /**
     * <p>The target language.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("targetLanguage")
    public String targetLanguage;

    /**
     * <p>A map of texts to translate, in which the key is a custom identifier and the value is the source text.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;0&quot;:&quot;明天天气怎么样？&quot;,&quot;1&quot;:&quot;你中午吃饭了吗&quot;}</p>
     */
    @NameInMap("text")
    public String textShrink;

    /**
     * <p>The ID of the Model Studio workspace used for this request.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-kqtrcpdee4xm29xx</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static BatchTranslateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchTranslateShrinkRequest self = new BatchTranslateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchTranslateShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public BatchTranslateShrinkRequest setExtShrink(String extShrink) {
        this.extShrink = extShrink;
        return this;
    }
    public String getExtShrink() {
        return this.extShrink;
    }

    public BatchTranslateShrinkRequest setFormat(String format) {
        this.format = format;
        return this;
    }
    public String getFormat() {
        return this.format;
    }

    public BatchTranslateShrinkRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public BatchTranslateShrinkRequest setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
        return this;
    }
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public BatchTranslateShrinkRequest setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
        return this;
    }
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

    public BatchTranslateShrinkRequest setTextShrink(String textShrink) {
        this.textShrink = textShrink;
        return this;
    }
    public String getTextShrink() {
        return this.textShrink;
    }

    public BatchTranslateShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
