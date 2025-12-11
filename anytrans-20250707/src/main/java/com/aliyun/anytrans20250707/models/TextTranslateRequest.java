// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.anytrans20250707.models;

import com.aliyun.tea.*;

public class TextTranslateRequest extends TeaModel {
    @NameInMap("ext")
    public TextTranslateRequestExt ext;

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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("sourceLanguage")
    public String sourceLanguage;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("targetLanguage")
    public String targetLanguage;

    /**
     * <p>This parameter is required.</p>
     */
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

    public static TextTranslateRequest build(java.util.Map<String, ?> map) throws Exception {
        TextTranslateRequest self = new TextTranslateRequest();
        return TeaModel.build(map, self);
    }

    public TextTranslateRequest setExt(TextTranslateRequestExt ext) {
        this.ext = ext;
        return this;
    }
    public TextTranslateRequestExt getExt() {
        return this.ext;
    }

    public TextTranslateRequest setFormat(String format) {
        this.format = format;
        return this;
    }
    public String getFormat() {
        return this.format;
    }

    public TextTranslateRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public TextTranslateRequest setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
        return this;
    }
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public TextTranslateRequest setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
        return this;
    }
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

    public TextTranslateRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public TextTranslateRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class TextTranslateRequestExtConfig extends TeaModel {
        @NameInMap("skipCsiCheck")
        public Boolean skipCsiCheck;

        public static TextTranslateRequestExtConfig build(java.util.Map<String, ?> map) throws Exception {
            TextTranslateRequestExtConfig self = new TextTranslateRequestExtConfig();
            return TeaModel.build(map, self);
        }

        public TextTranslateRequestExtConfig setSkipCsiCheck(Boolean skipCsiCheck) {
            this.skipCsiCheck = skipCsiCheck;
            return this;
        }
        public Boolean getSkipCsiCheck() {
            return this.skipCsiCheck;
        }

    }

    public static class TextTranslateRequestExtExamples extends TeaModel {
        @NameInMap("src")
        public String src;

        /**
         * <strong>example:</strong>
         * <p>hello</p>
         */
        @NameInMap("tgt")
        public String tgt;

        public static TextTranslateRequestExtExamples build(java.util.Map<String, ?> map) throws Exception {
            TextTranslateRequestExtExamples self = new TextTranslateRequestExtExamples();
            return TeaModel.build(map, self);
        }

        public TextTranslateRequestExtExamples setSrc(String src) {
            this.src = src;
            return this;
        }
        public String getSrc() {
            return this.src;
        }

        public TextTranslateRequestExtExamples setTgt(String tgt) {
            this.tgt = tgt;
            return this;
        }
        public String getTgt() {
            return this.tgt;
        }

    }

    public static class TextTranslateRequestExtTerminologies extends TeaModel {
        @NameInMap("src")
        public String src;

        /**
         * <strong>example:</strong>
         * <p>ML</p>
         */
        @NameInMap("tgt")
        public String tgt;

        public static TextTranslateRequestExtTerminologies build(java.util.Map<String, ?> map) throws Exception {
            TextTranslateRequestExtTerminologies self = new TextTranslateRequestExtTerminologies();
            return TeaModel.build(map, self);
        }

        public TextTranslateRequestExtTerminologies setSrc(String src) {
            this.src = src;
            return this;
        }
        public String getSrc() {
            return this.src;
        }

        public TextTranslateRequestExtTerminologies setTgt(String tgt) {
            this.tgt = tgt;
            return this;
        }
        public String getTgt() {
            return this.tgt;
        }

    }

    public static class TextTranslateRequestExtTextTransform extends TeaModel {
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

        public static TextTranslateRequestExtTextTransform build(java.util.Map<String, ?> map) throws Exception {
            TextTranslateRequestExtTextTransform self = new TextTranslateRequestExtTextTransform();
            return TeaModel.build(map, self);
        }

        public TextTranslateRequestExtTextTransform setToLower(Boolean toLower) {
            this.toLower = toLower;
            return this;
        }
        public Boolean getToLower() {
            return this.toLower;
        }

        public TextTranslateRequestExtTextTransform setToTitle(Boolean toTitle) {
            this.toTitle = toTitle;
            return this;
        }
        public Boolean getToTitle() {
            return this.toTitle;
        }

        public TextTranslateRequestExtTextTransform setToUpper(Boolean toUpper) {
            this.toUpper = toUpper;
            return this;
        }
        public Boolean getToUpper() {
            return this.toUpper;
        }

    }

    public static class TextTranslateRequestExt extends TeaModel {
        @NameInMap("agent")
        public String agent;

        @NameInMap("config")
        public TextTranslateRequestExtConfig config;

        /**
         * <strong>example:</strong>
         * <p>technology</p>
         */
        @NameInMap("domainHint")
        public String domainHint;

        @NameInMap("examples")
        public java.util.List<TextTranslateRequestExtExamples> examples;

        @NameInMap("prefix")
        public String prefix;

        @NameInMap("sensitives")
        public java.util.List<String> sensitives;

        @NameInMap("terminologies")
        public java.util.List<TextTranslateRequestExtTerminologies> terminologies;

        @NameInMap("textTransform")
        public TextTranslateRequestExtTextTransform textTransform;

        public static TextTranslateRequestExt build(java.util.Map<String, ?> map) throws Exception {
            TextTranslateRequestExt self = new TextTranslateRequestExt();
            return TeaModel.build(map, self);
        }

        public TextTranslateRequestExt setAgent(String agent) {
            this.agent = agent;
            return this;
        }
        public String getAgent() {
            return this.agent;
        }

        public TextTranslateRequestExt setConfig(TextTranslateRequestExtConfig config) {
            this.config = config;
            return this;
        }
        public TextTranslateRequestExtConfig getConfig() {
            return this.config;
        }

        public TextTranslateRequestExt setDomainHint(String domainHint) {
            this.domainHint = domainHint;
            return this;
        }
        public String getDomainHint() {
            return this.domainHint;
        }

        public TextTranslateRequestExt setExamples(java.util.List<TextTranslateRequestExtExamples> examples) {
            this.examples = examples;
            return this;
        }
        public java.util.List<TextTranslateRequestExtExamples> getExamples() {
            return this.examples;
        }

        public TextTranslateRequestExt setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public TextTranslateRequestExt setSensitives(java.util.List<String> sensitives) {
            this.sensitives = sensitives;
            return this;
        }
        public java.util.List<String> getSensitives() {
            return this.sensitives;
        }

        public TextTranslateRequestExt setTerminologies(java.util.List<TextTranslateRequestExtTerminologies> terminologies) {
            this.terminologies = terminologies;
            return this;
        }
        public java.util.List<TextTranslateRequestExtTerminologies> getTerminologies() {
            return this.terminologies;
        }

        public TextTranslateRequestExt setTextTransform(TextTranslateRequestExtTextTransform textTransform) {
            this.textTransform = textTransform;
            return this;
        }
        public TextTranslateRequestExtTextTransform getTextTransform() {
            return this.textTransform;
        }

    }

}
