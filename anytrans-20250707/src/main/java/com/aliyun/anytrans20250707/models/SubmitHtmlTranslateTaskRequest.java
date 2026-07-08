// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.anytrans20250707.models;

import com.aliyun.tea.*;

public class SubmitHtmlTranslateTaskRequest extends TeaModel {
    /**
     * <p>Extended parameters to control translation behavior.</p>
     */
    @NameInMap("ext")
    public SubmitHtmlTranslateTaskRequestExt ext;

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

    public static SubmitHtmlTranslateTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitHtmlTranslateTaskRequest self = new SubmitHtmlTranslateTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitHtmlTranslateTaskRequest setExt(SubmitHtmlTranslateTaskRequestExt ext) {
        this.ext = ext;
        return this;
    }
    public SubmitHtmlTranslateTaskRequestExt getExt() {
        return this.ext;
    }

    public SubmitHtmlTranslateTaskRequest setFormat(String format) {
        this.format = format;
        return this;
    }
    public String getFormat() {
        return this.format;
    }

    public SubmitHtmlTranslateTaskRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public SubmitHtmlTranslateTaskRequest setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
        return this;
    }
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public SubmitHtmlTranslateTaskRequest setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
        return this;
    }
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

    public SubmitHtmlTranslateTaskRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public SubmitHtmlTranslateTaskRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class SubmitHtmlTranslateTaskRequestExtConfig extends TeaModel {
        /**
         * <p>The callback URL for receiving translation results.</p>
         */
        @NameInMap("callbackUrl")
        public String callbackUrl;

        /**
         * <p>Specifies whether to skip the Content Moderation check. To skip this check, you must first complete the Content Moderation disablement process before calling the API.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("skipCsiCheck")
        public Boolean skipCsiCheck;

        public static SubmitHtmlTranslateTaskRequestExtConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitHtmlTranslateTaskRequestExtConfig self = new SubmitHtmlTranslateTaskRequestExtConfig();
            return TeaModel.build(map, self);
        }

        public SubmitHtmlTranslateTaskRequestExtConfig setCallbackUrl(String callbackUrl) {
            this.callbackUrl = callbackUrl;
            return this;
        }
        public String getCallbackUrl() {
            return this.callbackUrl;
        }

        public SubmitHtmlTranslateTaskRequestExtConfig setSkipCsiCheck(Boolean skipCsiCheck) {
            this.skipCsiCheck = skipCsiCheck;
            return this;
        }
        public Boolean getSkipCsiCheck() {
            return this.skipCsiCheck;
        }

    }

    public static class SubmitHtmlTranslateTaskRequestExtExamples extends TeaModel {
        /**
         * <p>The source text in the example.</p>
         * 
         * <strong>example:</strong>
         * <p>你好</p>
         */
        @NameInMap("src")
        public String src;

        /**
         * <p>The target text in the example.</p>
         * 
         * <strong>example:</strong>
         * <p>hello</p>
         */
        @NameInMap("tgt")
        public String tgt;

        public static SubmitHtmlTranslateTaskRequestExtExamples build(java.util.Map<String, ?> map) throws Exception {
            SubmitHtmlTranslateTaskRequestExtExamples self = new SubmitHtmlTranslateTaskRequestExtExamples();
            return TeaModel.build(map, self);
        }

        public SubmitHtmlTranslateTaskRequestExtExamples setSrc(String src) {
            this.src = src;
            return this;
        }
        public String getSrc() {
            return this.src;
        }

        public SubmitHtmlTranslateTaskRequestExtExamples setTgt(String tgt) {
            this.tgt = tgt;
            return this;
        }
        public String getTgt() {
            return this.tgt;
        }

    }

    public static class SubmitHtmlTranslateTaskRequestExtTerminologies extends TeaModel {
        /**
         * <p>The source text for the terminology pair.</p>
         * 
         * <strong>example:</strong>
         * <p>机器学习</p>
         */
        @NameInMap("src")
        public String src;

        /**
         * <p>The target text for the terminology pair.</p>
         * 
         * <strong>example:</strong>
         * <p>ML</p>
         */
        @NameInMap("tgt")
        public String tgt;

        public static SubmitHtmlTranslateTaskRequestExtTerminologies build(java.util.Map<String, ?> map) throws Exception {
            SubmitHtmlTranslateTaskRequestExtTerminologies self = new SubmitHtmlTranslateTaskRequestExtTerminologies();
            return TeaModel.build(map, self);
        }

        public SubmitHtmlTranslateTaskRequestExtTerminologies setSrc(String src) {
            this.src = src;
            return this;
        }
        public String getSrc() {
            return this.src;
        }

        public SubmitHtmlTranslateTaskRequestExtTerminologies setTgt(String tgt) {
            this.tgt = tgt;
            return this;
        }
        public String getTgt() {
            return this.tgt;
        }

    }

    public static class SubmitHtmlTranslateTaskRequestExtTextTransform extends TeaModel {
        /**
         * <p>Converts the entire translated text to lowercase.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("toLower")
        public Boolean toLower;

        /**
         * <p>Converts the translated text to title case.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("toTitle")
        public Boolean toTitle;

        /**
         * <p>Converts the entire translated text to uppercase.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("toUpper")
        public Boolean toUpper;

        public static SubmitHtmlTranslateTaskRequestExtTextTransform build(java.util.Map<String, ?> map) throws Exception {
            SubmitHtmlTranslateTaskRequestExtTextTransform self = new SubmitHtmlTranslateTaskRequestExtTextTransform();
            return TeaModel.build(map, self);
        }

        public SubmitHtmlTranslateTaskRequestExtTextTransform setToLower(Boolean toLower) {
            this.toLower = toLower;
            return this;
        }
        public Boolean getToLower() {
            return this.toLower;
        }

        public SubmitHtmlTranslateTaskRequestExtTextTransform setToTitle(Boolean toTitle) {
            this.toTitle = toTitle;
            return this;
        }
        public Boolean getToTitle() {
            return this.toTitle;
        }

        public SubmitHtmlTranslateTaskRequestExtTextTransform setToUpper(Boolean toUpper) {
            this.toUpper = toUpper;
            return this;
        }
        public Boolean getToUpper() {
            return this.toUpper;
        }

    }

    public static class SubmitHtmlTranslateTaskRequestExt extends TeaModel {
        /**
         * <p>Provides specific configuration settings for the translation task.</p>
         */
        @NameInMap("config")
        public SubmitHtmlTranslateTaskRequestExtConfig config;

        /**
         * <p>A natural language prompt in English to guide the model\&quot;s translation style.</p>
         * 
         * <strong>example:</strong>
         * <p>his sentence from an e-commerce product image, please provide a translation that is both highly concise and no more than 1.2 times the length of the original.</p>
         */
        @NameInMap("domainHint")
        public String domainHint;

        /**
         * <p>A list of translation examples.</p>
         */
        @NameInMap("examples")
        public java.util.List<SubmitHtmlTranslateTaskRequestExtExamples> examples;

        /**
         * <p>Provides extended parameter configuration. The <code>bizUserId</code> key specifies the business user ID to isolate custom terminology enforcement by user. The <code>bizType</code> key specifies the business scenario type to isolate custom terminology enforcement by scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;bizUserld&quot;:&quot;123456&quot;,&quot;bizType&quot;:session&quot;}</p>
         */
        @NameInMap("paramMap")
        public Object paramMap;

        /**
         * <p>A list of sensitive words to filter from the translation.</p>
         */
        @NameInMap("sensitives")
        public java.util.List<String> sensitives;

        /**
         * <p>A list of custom terminology pairs to apply to the translation.</p>
         */
        @NameInMap("terminologies")
        public java.util.List<SubmitHtmlTranslateTaskRequestExtTerminologies> terminologies;

        /**
         * <p>Specifies case transformations for the translated text.</p>
         */
        @NameInMap("textTransform")
        public SubmitHtmlTranslateTaskRequestExtTextTransform textTransform;

        /**
         * <p>Custom passthrough data that the service returns unprocessed in the response. Useful for tasks such as event tracking.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;traceId&quot;:&quot;trace_123456&quot;}</p>
         */
        @NameInMap("trackingData")
        public String trackingData;

        public static SubmitHtmlTranslateTaskRequestExt build(java.util.Map<String, ?> map) throws Exception {
            SubmitHtmlTranslateTaskRequestExt self = new SubmitHtmlTranslateTaskRequestExt();
            return TeaModel.build(map, self);
        }

        public SubmitHtmlTranslateTaskRequestExt setConfig(SubmitHtmlTranslateTaskRequestExtConfig config) {
            this.config = config;
            return this;
        }
        public SubmitHtmlTranslateTaskRequestExtConfig getConfig() {
            return this.config;
        }

        public SubmitHtmlTranslateTaskRequestExt setDomainHint(String domainHint) {
            this.domainHint = domainHint;
            return this;
        }
        public String getDomainHint() {
            return this.domainHint;
        }

        public SubmitHtmlTranslateTaskRequestExt setExamples(java.util.List<SubmitHtmlTranslateTaskRequestExtExamples> examples) {
            this.examples = examples;
            return this;
        }
        public java.util.List<SubmitHtmlTranslateTaskRequestExtExamples> getExamples() {
            return this.examples;
        }

        public SubmitHtmlTranslateTaskRequestExt setParamMap(Object paramMap) {
            this.paramMap = paramMap;
            return this;
        }
        public Object getParamMap() {
            return this.paramMap;
        }

        public SubmitHtmlTranslateTaskRequestExt setSensitives(java.util.List<String> sensitives) {
            this.sensitives = sensitives;
            return this;
        }
        public java.util.List<String> getSensitives() {
            return this.sensitives;
        }

        public SubmitHtmlTranslateTaskRequestExt setTerminologies(java.util.List<SubmitHtmlTranslateTaskRequestExtTerminologies> terminologies) {
            this.terminologies = terminologies;
            return this;
        }
        public java.util.List<SubmitHtmlTranslateTaskRequestExtTerminologies> getTerminologies() {
            return this.terminologies;
        }

        public SubmitHtmlTranslateTaskRequestExt setTextTransform(SubmitHtmlTranslateTaskRequestExtTextTransform textTransform) {
            this.textTransform = textTransform;
            return this;
        }
        public SubmitHtmlTranslateTaskRequestExtTextTransform getTextTransform() {
            return this.textTransform;
        }

        public SubmitHtmlTranslateTaskRequestExt setTrackingData(String trackingData) {
            this.trackingData = trackingData;
            return this;
        }
        public String getTrackingData() {
            return this.trackingData;
        }

    }

}
