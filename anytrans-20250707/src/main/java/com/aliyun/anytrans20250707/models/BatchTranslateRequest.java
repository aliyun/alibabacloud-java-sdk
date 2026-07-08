// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.anytrans20250707.models;

import com.aliyun.tea.*;

public class BatchTranslateRequest extends TeaModel {
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
    public BatchTranslateRequestExt ext;

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
    public java.util.Map<String, ?> text;

    /**
     * <p>The ID of the Model Studio workspace used for this request.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-kqtrcpdee4xm29xx</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static BatchTranslateRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchTranslateRequest self = new BatchTranslateRequest();
        return TeaModel.build(map, self);
    }

    public BatchTranslateRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public BatchTranslateRequest setExt(BatchTranslateRequestExt ext) {
        this.ext = ext;
        return this;
    }
    public BatchTranslateRequestExt getExt() {
        return this.ext;
    }

    public BatchTranslateRequest setFormat(String format) {
        this.format = format;
        return this;
    }
    public String getFormat() {
        return this.format;
    }

    public BatchTranslateRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public BatchTranslateRequest setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
        return this;
    }
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public BatchTranslateRequest setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
        return this;
    }
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

    public BatchTranslateRequest setText(java.util.Map<String, ?> text) {
        this.text = text;
        return this;
    }
    public java.util.Map<String, ?> getText() {
        return this.text;
    }

    public BatchTranslateRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class BatchTranslateRequestExtConfig extends TeaModel {
        /**
         * <p>Specifies whether to skip the Content Moderation check. To set this to true, you must first complete the required process to disable Content Moderation.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("skipCsiCheck")
        public Boolean skipCsiCheck;

        public static BatchTranslateRequestExtConfig build(java.util.Map<String, ?> map) throws Exception {
            BatchTranslateRequestExtConfig self = new BatchTranslateRequestExtConfig();
            return TeaModel.build(map, self);
        }

        public BatchTranslateRequestExtConfig setSkipCsiCheck(Boolean skipCsiCheck) {
            this.skipCsiCheck = skipCsiCheck;
            return this;
        }
        public Boolean getSkipCsiCheck() {
            return this.skipCsiCheck;
        }

    }

    public static class BatchTranslateRequestExtExamples extends TeaModel {
        /**
         * <p>The source text.</p>
         * 
         * <strong>example:</strong>
         * <p>你好</p>
         */
        @NameInMap("src")
        public String src;

        /**
         * <p>The target text.</p>
         * 
         * <strong>example:</strong>
         * <p>hello</p>
         */
        @NameInMap("tgt")
        public String tgt;

        public static BatchTranslateRequestExtExamples build(java.util.Map<String, ?> map) throws Exception {
            BatchTranslateRequestExtExamples self = new BatchTranslateRequestExtExamples();
            return TeaModel.build(map, self);
        }

        public BatchTranslateRequestExtExamples setSrc(String src) {
            this.src = src;
            return this;
        }
        public String getSrc() {
            return this.src;
        }

        public BatchTranslateRequestExtExamples setTgt(String tgt) {
            this.tgt = tgt;
            return this;
        }
        public String getTgt() {
            return this.tgt;
        }

    }

    public static class BatchTranslateRequestExtTerminologies extends TeaModel {
        /**
         * <p>The source text to be overridden.</p>
         * 
         * <strong>example:</strong>
         * <p>应用接口</p>
         */
        @NameInMap("src")
        public String src;

        /**
         * <p>The target text to use for the override.</p>
         * 
         * <strong>example:</strong>
         * <p>API</p>
         */
        @NameInMap("tgt")
        public String tgt;

        public static BatchTranslateRequestExtTerminologies build(java.util.Map<String, ?> map) throws Exception {
            BatchTranslateRequestExtTerminologies self = new BatchTranslateRequestExtTerminologies();
            return TeaModel.build(map, self);
        }

        public BatchTranslateRequestExtTerminologies setSrc(String src) {
            this.src = src;
            return this;
        }
        public String getSrc() {
            return this.src;
        }

        public BatchTranslateRequestExtTerminologies setTgt(String tgt) {
            this.tgt = tgt;
            return this;
        }
        public String getTgt() {
            return this.tgt;
        }

    }

    public static class BatchTranslateRequestExtTextTransform extends TeaModel {
        /**
         * <p>Specifies whether to convert the entire translated text to lowercase.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("toLower")
        public Boolean toLower;

        /**
         * <p>Specifies whether to convert the entire translated text to title case.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("toTitle")
        public Boolean toTitle;

        /**
         * <p>Specifies whether to convert the entire translated text to uppercase.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("toUpper")
        public Boolean toUpper;

        public static BatchTranslateRequestExtTextTransform build(java.util.Map<String, ?> map) throws Exception {
            BatchTranslateRequestExtTextTransform self = new BatchTranslateRequestExtTextTransform();
            return TeaModel.build(map, self);
        }

        public BatchTranslateRequestExtTextTransform setToLower(Boolean toLower) {
            this.toLower = toLower;
            return this;
        }
        public Boolean getToLower() {
            return this.toLower;
        }

        public BatchTranslateRequestExtTextTransform setToTitle(Boolean toTitle) {
            this.toTitle = toTitle;
            return this;
        }
        public Boolean getToTitle() {
            return this.toTitle;
        }

        public BatchTranslateRequestExtTextTransform setToUpper(Boolean toUpper) {
            this.toUpper = toUpper;
            return this;
        }
        public Boolean getToUpper() {
            return this.toUpper;
        }

    }

    public static class BatchTranslateRequestExt extends TeaModel {
        /**
         * <p>Controls the translation behavior.</p>
         */
        @NameInMap("config")
        public BatchTranslateRequestExtConfig config;

        /**
         * <p>A natural language instruction in English that guides the model\&quot;s translation style.</p>
         * 
         * <strong>example:</strong>
         * <p>this sentence from an e-commerce product image, please provide a translation that is both highly concise and no more than 1.2 times the length of the original.</p>
         */
        @NameInMap("domainHint")
        public String domainHint;

        /**
         * <p>A list of translation examples.</p>
         */
        @NameInMap("examples")
        public java.util.List<BatchTranslateRequestExtExamples> examples;

        /**
         * <p>Specifies whether to enable automatic detection of the source language. If set to true, the <code>sourceLanguage</code> parameter is ignored.</p>
         */
        @NameInMap("langDetect")
        public Boolean langDetect;

        /**
         * <p>Extended parameters for applying custom terminology that is isolated by user or business scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;bizUserld&quot;:&quot;123456&quot;,&quot;bizType&quot;:session&quot;}</p>
         */
        @NameInMap("paramMap")
        public Object paramMap;

        /**
         * <p>A list of sensitive terms.</p>
         */
        @NameInMap("sensitives")
        public java.util.List<String> sensitives;

        /**
         * <p>A list of custom terminology for overriding translations.</p>
         */
        @NameInMap("terminologies")
        public java.util.List<BatchTranslateRequestExtTerminologies> terminologies;

        /**
         * <p>Specifies case transformations for the translated text.</p>
         */
        @NameInMap("textTransform")
        public BatchTranslateRequestExtTextTransform textTransform;

        public static BatchTranslateRequestExt build(java.util.Map<String, ?> map) throws Exception {
            BatchTranslateRequestExt self = new BatchTranslateRequestExt();
            return TeaModel.build(map, self);
        }

        public BatchTranslateRequestExt setConfig(BatchTranslateRequestExtConfig config) {
            this.config = config;
            return this;
        }
        public BatchTranslateRequestExtConfig getConfig() {
            return this.config;
        }

        public BatchTranslateRequestExt setDomainHint(String domainHint) {
            this.domainHint = domainHint;
            return this;
        }
        public String getDomainHint() {
            return this.domainHint;
        }

        public BatchTranslateRequestExt setExamples(java.util.List<BatchTranslateRequestExtExamples> examples) {
            this.examples = examples;
            return this;
        }
        public java.util.List<BatchTranslateRequestExtExamples> getExamples() {
            return this.examples;
        }

        public BatchTranslateRequestExt setLangDetect(Boolean langDetect) {
            this.langDetect = langDetect;
            return this;
        }
        public Boolean getLangDetect() {
            return this.langDetect;
        }

        public BatchTranslateRequestExt setParamMap(Object paramMap) {
            this.paramMap = paramMap;
            return this;
        }
        public Object getParamMap() {
            return this.paramMap;
        }

        public BatchTranslateRequestExt setSensitives(java.util.List<String> sensitives) {
            this.sensitives = sensitives;
            return this;
        }
        public java.util.List<String> getSensitives() {
            return this.sensitives;
        }

        public BatchTranslateRequestExt setTerminologies(java.util.List<BatchTranslateRequestExtTerminologies> terminologies) {
            this.terminologies = terminologies;
            return this;
        }
        public java.util.List<BatchTranslateRequestExtTerminologies> getTerminologies() {
            return this.terminologies;
        }

        public BatchTranslateRequestExt setTextTransform(BatchTranslateRequestExtTextTransform textTransform) {
            this.textTransform = textTransform;
            return this;
        }
        public BatchTranslateRequestExtTextTransform getTextTransform() {
            return this.textTransform;
        }

    }

}
