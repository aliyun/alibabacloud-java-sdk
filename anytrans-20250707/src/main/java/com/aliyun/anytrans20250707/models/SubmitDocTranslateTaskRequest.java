// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.anytrans20250707.models;

import com.aliyun.tea.*;

public class SubmitDocTranslateTaskRequest extends TeaModel {
    /**
     * <p>Extension parameters that control translation features.</p>
     */
    @NameInMap("ext")
    public SubmitDocTranslateTaskRequestExt ext;

    /**
     * <p>The format for the translation.</p>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("format")
    public String format;

    /**
     * <p>The translation model.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mt-turbo</p>
     */
    @NameInMap("scene")
    public String scene;

    /**
     * <p>The source language code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("sourceLanguage")
    public String sourceLanguage;

    /**
     * <p>The target language code.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("targetLanguage")
    public String targetLanguage;

    /**
     * <p>The URL of the document to translate.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxx-hangzhou.aliyuncs.com/docs/tmp/%E6%A0%B7%E4%BE%8B_%E6%97%A0%E5%9B%BE.pdf">https://xxx-hangzhou.aliyuncs.com/docs/tmp/%E6%A0%B7%E4%BE%8B_%E6%97%A0%E5%9B%BE.pdf</a></p>
     */
    @NameInMap("text")
    public String text;

    /**
     * <p>The ID of the Model Studio workspace for the current request.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-kqtrcpdee4xm29xc</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static SubmitDocTranslateTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitDocTranslateTaskRequest self = new SubmitDocTranslateTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitDocTranslateTaskRequest setExt(SubmitDocTranslateTaskRequestExt ext) {
        this.ext = ext;
        return this;
    }
    public SubmitDocTranslateTaskRequestExt getExt() {
        return this.ext;
    }

    public SubmitDocTranslateTaskRequest setFormat(String format) {
        this.format = format;
        return this;
    }
    public String getFormat() {
        return this.format;
    }

    public SubmitDocTranslateTaskRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public SubmitDocTranslateTaskRequest setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
        return this;
    }
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public SubmitDocTranslateTaskRequest setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
        return this;
    }
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

    public SubmitDocTranslateTaskRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public SubmitDocTranslateTaskRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class SubmitDocTranslateTaskRequestExtConfig extends TeaModel {
        /**
         * <p>Specifies whether to generate a bilingual document containing both the source and target text.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("isBilingual")
        public Boolean isBilingual;

        /**
         * <p>Specifies whether to translate images in PDF documents.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("skipImgTrans")
        public Boolean skipImgTrans;

        public static SubmitDocTranslateTaskRequestExtConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitDocTranslateTaskRequestExtConfig self = new SubmitDocTranslateTaskRequestExtConfig();
            return TeaModel.build(map, self);
        }

        public SubmitDocTranslateTaskRequestExtConfig setIsBilingual(Boolean isBilingual) {
            this.isBilingual = isBilingual;
            return this;
        }
        public Boolean getIsBilingual() {
            return this.isBilingual;
        }

        public SubmitDocTranslateTaskRequestExtConfig setSkipImgTrans(Boolean skipImgTrans) {
            this.skipImgTrans = skipImgTrans;
            return this;
        }
        public Boolean getSkipImgTrans() {
            return this.skipImgTrans;
        }

    }

    public static class SubmitDocTranslateTaskRequestExtTerminologies extends TeaModel {
        /**
         * <p>The source text that the custom translation will replace.</p>
         * 
         * <strong>example:</strong>
         * <p>机器学习</p>
         */
        @NameInMap("src")
        public String src;

        /**
         * <p>The custom translation for the corresponding source term.</p>
         * 
         * <strong>example:</strong>
         * <p>ML</p>
         */
        @NameInMap("tgt")
        public String tgt;

        public static SubmitDocTranslateTaskRequestExtTerminologies build(java.util.Map<String, ?> map) throws Exception {
            SubmitDocTranslateTaskRequestExtTerminologies self = new SubmitDocTranslateTaskRequestExtTerminologies();
            return TeaModel.build(map, self);
        }

        public SubmitDocTranslateTaskRequestExtTerminologies setSrc(String src) {
            this.src = src;
            return this;
        }
        public String getSrc() {
            return this.src;
        }

        public SubmitDocTranslateTaskRequestExtTerminologies setTgt(String tgt) {
            this.tgt = tgt;
            return this;
        }
        public String getTgt() {
            return this.tgt;
        }

    }

    public static class SubmitDocTranslateTaskRequestExt extends TeaModel {
        /**
         * <p>Configuration settings for the translation job.</p>
         */
        @NameInMap("config")
        public SubmitDocTranslateTaskRequestExtConfig config;

        /**
         * <p>A prompt that tailors the translation style to a specific domain.</p>
         * 
         * <strong>example:</strong>
         * <p>This text comes from a rigorous academic paper. Please provide a translation that complies with academic standards.</p>
         */
        @NameInMap("domainHint")
        public String domainHint;

        /**
         * <p>A map for advanced configuration. Use <code>bizUserId</code> to apply terminologies on a per-user basis and <code>bizType</code> to apply them on a per-scenario basis. This prevents terminology conflicts between different users or scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;bizUserld&quot;:&quot;123456&quot;,&quot;bizType&quot;:session&quot;}</p>
         */
        @NameInMap("paramMap")
        public Object paramMap;

        /**
         * <p>The glossary to apply to the translation.</p>
         */
        @NameInMap("terminologies")
        public java.util.List<SubmitDocTranslateTaskRequestExtTerminologies> terminologies;

        /**
         * <p>User-defined pass-through data. The service does not process this data and returns it as-is in the response. This is useful for scenarios such as tracking.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;traceId&quot;:&quot;trace_123456&quot;}</p>
         */
        @NameInMap("trackingData")
        public String trackingData;

        public static SubmitDocTranslateTaskRequestExt build(java.util.Map<String, ?> map) throws Exception {
            SubmitDocTranslateTaskRequestExt self = new SubmitDocTranslateTaskRequestExt();
            return TeaModel.build(map, self);
        }

        public SubmitDocTranslateTaskRequestExt setConfig(SubmitDocTranslateTaskRequestExtConfig config) {
            this.config = config;
            return this;
        }
        public SubmitDocTranslateTaskRequestExtConfig getConfig() {
            return this.config;
        }

        public SubmitDocTranslateTaskRequestExt setDomainHint(String domainHint) {
            this.domainHint = domainHint;
            return this;
        }
        public String getDomainHint() {
            return this.domainHint;
        }

        public SubmitDocTranslateTaskRequestExt setParamMap(Object paramMap) {
            this.paramMap = paramMap;
            return this;
        }
        public Object getParamMap() {
            return this.paramMap;
        }

        public SubmitDocTranslateTaskRequestExt setTerminologies(java.util.List<SubmitDocTranslateTaskRequestExtTerminologies> terminologies) {
            this.terminologies = terminologies;
            return this;
        }
        public java.util.List<SubmitDocTranslateTaskRequestExtTerminologies> getTerminologies() {
            return this.terminologies;
        }

        public SubmitDocTranslateTaskRequestExt setTrackingData(String trackingData) {
            this.trackingData = trackingData;
            return this;
        }
        public String getTrackingData() {
            return this.trackingData;
        }

    }

}
