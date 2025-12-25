// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.anytrans20250707.models;

import com.aliyun.tea.*;

public class SubmitLongTextTranslateTaskRequest extends TeaModel {
    @NameInMap("ext")
    public SubmitLongTextTranslateTaskRequestExt ext;

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

    public static SubmitLongTextTranslateTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitLongTextTranslateTaskRequest self = new SubmitLongTextTranslateTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitLongTextTranslateTaskRequest setExt(SubmitLongTextTranslateTaskRequestExt ext) {
        this.ext = ext;
        return this;
    }
    public SubmitLongTextTranslateTaskRequestExt getExt() {
        return this.ext;
    }

    public SubmitLongTextTranslateTaskRequest setFormat(String format) {
        this.format = format;
        return this;
    }
    public String getFormat() {
        return this.format;
    }

    public SubmitLongTextTranslateTaskRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public SubmitLongTextTranslateTaskRequest setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
        return this;
    }
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public SubmitLongTextTranslateTaskRequest setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
        return this;
    }
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

    public SubmitLongTextTranslateTaskRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public SubmitLongTextTranslateTaskRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class SubmitLongTextTranslateTaskRequestExtConfig extends TeaModel {
        @NameInMap("skipCsiCheck")
        public Boolean skipCsiCheck;

        public static SubmitLongTextTranslateTaskRequestExtConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitLongTextTranslateTaskRequestExtConfig self = new SubmitLongTextTranslateTaskRequestExtConfig();
            return TeaModel.build(map, self);
        }

        public SubmitLongTextTranslateTaskRequestExtConfig setSkipCsiCheck(Boolean skipCsiCheck) {
            this.skipCsiCheck = skipCsiCheck;
            return this;
        }
        public Boolean getSkipCsiCheck() {
            return this.skipCsiCheck;
        }

    }

    public static class SubmitLongTextTranslateTaskRequestExtExamples extends TeaModel {
        @NameInMap("src")
        public String src;

        /**
         * <strong>example:</strong>
         * <p>hello</p>
         */
        @NameInMap("tgt")
        public String tgt;

        public static SubmitLongTextTranslateTaskRequestExtExamples build(java.util.Map<String, ?> map) throws Exception {
            SubmitLongTextTranslateTaskRequestExtExamples self = new SubmitLongTextTranslateTaskRequestExtExamples();
            return TeaModel.build(map, self);
        }

        public SubmitLongTextTranslateTaskRequestExtExamples setSrc(String src) {
            this.src = src;
            return this;
        }
        public String getSrc() {
            return this.src;
        }

        public SubmitLongTextTranslateTaskRequestExtExamples setTgt(String tgt) {
            this.tgt = tgt;
            return this;
        }
        public String getTgt() {
            return this.tgt;
        }

    }

    public static class SubmitLongTextTranslateTaskRequestExtTerminologies extends TeaModel {
        @NameInMap("src")
        public String src;

        /**
         * <strong>example:</strong>
         * <p>ML</p>
         */
        @NameInMap("tgt")
        public String tgt;

        public static SubmitLongTextTranslateTaskRequestExtTerminologies build(java.util.Map<String, ?> map) throws Exception {
            SubmitLongTextTranslateTaskRequestExtTerminologies self = new SubmitLongTextTranslateTaskRequestExtTerminologies();
            return TeaModel.build(map, self);
        }

        public SubmitLongTextTranslateTaskRequestExtTerminologies setSrc(String src) {
            this.src = src;
            return this;
        }
        public String getSrc() {
            return this.src;
        }

        public SubmitLongTextTranslateTaskRequestExtTerminologies setTgt(String tgt) {
            this.tgt = tgt;
            return this;
        }
        public String getTgt() {
            return this.tgt;
        }

    }

    public static class SubmitLongTextTranslateTaskRequestExtTextTransform extends TeaModel {
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

        public static SubmitLongTextTranslateTaskRequestExtTextTransform build(java.util.Map<String, ?> map) throws Exception {
            SubmitLongTextTranslateTaskRequestExtTextTransform self = new SubmitLongTextTranslateTaskRequestExtTextTransform();
            return TeaModel.build(map, self);
        }

        public SubmitLongTextTranslateTaskRequestExtTextTransform setToLower(Boolean toLower) {
            this.toLower = toLower;
            return this;
        }
        public Boolean getToLower() {
            return this.toLower;
        }

        public SubmitLongTextTranslateTaskRequestExtTextTransform setToTitle(Boolean toTitle) {
            this.toTitle = toTitle;
            return this;
        }
        public Boolean getToTitle() {
            return this.toTitle;
        }

        public SubmitLongTextTranslateTaskRequestExtTextTransform setToUpper(Boolean toUpper) {
            this.toUpper = toUpper;
            return this;
        }
        public Boolean getToUpper() {
            return this.toUpper;
        }

    }

    public static class SubmitLongTextTranslateTaskRequestExt extends TeaModel {
        @NameInMap("config")
        public SubmitLongTextTranslateTaskRequestExtConfig config;

        /**
         * <strong>example:</strong>
         * <p>technology</p>
         */
        @NameInMap("domainHint")
        public String domainHint;

        @NameInMap("examples")
        public java.util.List<SubmitLongTextTranslateTaskRequestExtExamples> examples;

        @NameInMap("paramMap")
        public Object paramMap;

        @NameInMap("sensitives")
        public java.util.List<String> sensitives;

        @NameInMap("terminologies")
        public java.util.List<SubmitLongTextTranslateTaskRequestExtTerminologies> terminologies;

        @NameInMap("textTransform")
        public SubmitLongTextTranslateTaskRequestExtTextTransform textTransform;

        public static SubmitLongTextTranslateTaskRequestExt build(java.util.Map<String, ?> map) throws Exception {
            SubmitLongTextTranslateTaskRequestExt self = new SubmitLongTextTranslateTaskRequestExt();
            return TeaModel.build(map, self);
        }

        public SubmitLongTextTranslateTaskRequestExt setConfig(SubmitLongTextTranslateTaskRequestExtConfig config) {
            this.config = config;
            return this;
        }
        public SubmitLongTextTranslateTaskRequestExtConfig getConfig() {
            return this.config;
        }

        public SubmitLongTextTranslateTaskRequestExt setDomainHint(String domainHint) {
            this.domainHint = domainHint;
            return this;
        }
        public String getDomainHint() {
            return this.domainHint;
        }

        public SubmitLongTextTranslateTaskRequestExt setExamples(java.util.List<SubmitLongTextTranslateTaskRequestExtExamples> examples) {
            this.examples = examples;
            return this;
        }
        public java.util.List<SubmitLongTextTranslateTaskRequestExtExamples> getExamples() {
            return this.examples;
        }

        public SubmitLongTextTranslateTaskRequestExt setParamMap(Object paramMap) {
            this.paramMap = paramMap;
            return this;
        }
        public Object getParamMap() {
            return this.paramMap;
        }

        public SubmitLongTextTranslateTaskRequestExt setSensitives(java.util.List<String> sensitives) {
            this.sensitives = sensitives;
            return this;
        }
        public java.util.List<String> getSensitives() {
            return this.sensitives;
        }

        public SubmitLongTextTranslateTaskRequestExt setTerminologies(java.util.List<SubmitLongTextTranslateTaskRequestExtTerminologies> terminologies) {
            this.terminologies = terminologies;
            return this;
        }
        public java.util.List<SubmitLongTextTranslateTaskRequestExtTerminologies> getTerminologies() {
            return this.terminologies;
        }

        public SubmitLongTextTranslateTaskRequestExt setTextTransform(SubmitLongTextTranslateTaskRequestExtTextTransform textTransform) {
            this.textTransform = textTransform;
            return this;
        }
        public SubmitLongTextTranslateTaskRequestExtTextTransform getTextTransform() {
            return this.textTransform;
        }

    }

}
