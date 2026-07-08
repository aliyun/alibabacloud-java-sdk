// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.anytrans20250707.models;

import com.aliyun.tea.*;

public class SubmitHtmlTranslateTaskShrinkRequest extends TeaModel {
    /**
     * <p>Extended parameters to control translation behavior.</p>
     */
    @NameInMap("ext")
    public String extShrink;

    /**
     * <p>The format of the input text.</p>
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
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("sourceLanguage")
    public String sourceLanguage;

    /**
     * <p>The target language.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("targetLanguage")
    public String targetLanguage;

    /**
     * <p>The HTML content to be translated.</p>
     * 
     * <strong>example:</strong>
     * <!DOCTYPE html>
     * <html lang="zh-CN">
     * <head>
     *     <meta charset="UTF-8">
     *     <meta name="viewport" content="width=device-width, initial-scale=1.0">
     *     <title>我的第一个网页</title>
     * </head>
     * <body>
     *     <h1>欢迎来到我的网页！</h1>
     *     <p>这是一个简单的 HTML 页面。</p>
     *     <p>学习 HTML 是进入网页开发的第一步。</p>
     *     <a href="https://www.example.com">点击这里访问示例网站</a>
     * </body>
     * </html>
     */
    @NameInMap("text")
    public String text;

    /**
     * <p>The ID of the Model Studio workspace used for this request.</p>
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
