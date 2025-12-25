// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.anytrans20250707.models;

import com.aliyun.tea.*;

public class SubmitDocTranslateTaskRequest extends TeaModel {
    @NameInMap("ext")
    public SubmitDocTranslateTaskRequestExt ext;

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
        @NameInMap("skipImgTrans")
        public Boolean skipImgTrans;

        public static SubmitDocTranslateTaskRequestExtConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitDocTranslateTaskRequestExtConfig self = new SubmitDocTranslateTaskRequestExtConfig();
            return TeaModel.build(map, self);
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
        @NameInMap("src")
        public String src;

        /**
         * <strong>example:</strong>
         * <p>llm</p>
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
        @NameInMap("config")
        public SubmitDocTranslateTaskRequestExtConfig config;

        /**
         * <strong>example:</strong>
         * <p>This text comes from a rigorous academic paper. Please provide a translation that complies with academic standards.</p>
         */
        @NameInMap("domainHint")
        public String domainHint;

        @NameInMap("paramMap")
        public Object paramMap;

        @NameInMap("terminologies")
        public java.util.List<SubmitDocTranslateTaskRequestExtTerminologies> terminologies;

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

    }

}
