// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.anytrans20250707.models;

import com.aliyun.tea.*;

public class SubmitHtmlTranslateTaskRequest extends TeaModel {
    @NameInMap("ext")
    public SubmitHtmlTranslateTaskRequestExt ext;

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
        @NameInMap("callbackUrl")
        public String callbackUrl;

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
        @NameInMap("src")
        public String src;

        /**
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
        @NameInMap("src")
        public String src;

        /**
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
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("toLower")
        public Boolean toLower;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("toTitle")
        public Boolean toTitle;

        /**
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
        @NameInMap("config")
        public SubmitHtmlTranslateTaskRequestExtConfig config;

        /**
         * <strong>example:</strong>
         * <p>technology</p>
         */
        @NameInMap("domainHint")
        public String domainHint;

        @NameInMap("examples")
        public java.util.List<SubmitHtmlTranslateTaskRequestExtExamples> examples;

        @NameInMap("paramMap")
        public Object paramMap;

        @NameInMap("sensitives")
        public java.util.List<String> sensitives;

        @NameInMap("terminologies")
        public java.util.List<SubmitHtmlTranslateTaskRequestExtTerminologies> terminologies;

        @NameInMap("textTransform")
        public SubmitHtmlTranslateTaskRequestExtTextTransform textTransform;

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

    }

}
