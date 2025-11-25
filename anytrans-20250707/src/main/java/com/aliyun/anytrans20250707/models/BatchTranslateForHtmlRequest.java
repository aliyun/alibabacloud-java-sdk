// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.anytrans20250707.models;

import com.aliyun.tea.*;

public class BatchTranslateForHtmlRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>baidufanyi</p>
     */
    @NameInMap("appName")
    public String appName;

    @NameInMap("ext")
    public BatchTranslateForHtmlRequestExt ext;

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
    public java.util.Map<String, ?> text;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-kqtrcpdee4xm29xx</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static BatchTranslateForHtmlRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchTranslateForHtmlRequest self = new BatchTranslateForHtmlRequest();
        return TeaModel.build(map, self);
    }

    public BatchTranslateForHtmlRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public BatchTranslateForHtmlRequest setExt(BatchTranslateForHtmlRequestExt ext) {
        this.ext = ext;
        return this;
    }
    public BatchTranslateForHtmlRequestExt getExt() {
        return this.ext;
    }

    public BatchTranslateForHtmlRequest setFormat(String format) {
        this.format = format;
        return this;
    }
    public String getFormat() {
        return this.format;
    }

    public BatchTranslateForHtmlRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public BatchTranslateForHtmlRequest setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
        return this;
    }
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public BatchTranslateForHtmlRequest setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
        return this;
    }
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

    public BatchTranslateForHtmlRequest setText(java.util.Map<String, ?> text) {
        this.text = text;
        return this;
    }
    public java.util.Map<String, ?> getText() {
        return this.text;
    }

    public BatchTranslateForHtmlRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class BatchTranslateForHtmlRequestExtConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>fasle</p>
         */
        @NameInMap("skipCsiCheck")
        public Boolean skipCsiCheck;

        public static BatchTranslateForHtmlRequestExtConfig build(java.util.Map<String, ?> map) throws Exception {
            BatchTranslateForHtmlRequestExtConfig self = new BatchTranslateForHtmlRequestExtConfig();
            return TeaModel.build(map, self);
        }

        public BatchTranslateForHtmlRequestExtConfig setSkipCsiCheck(Boolean skipCsiCheck) {
            this.skipCsiCheck = skipCsiCheck;
            return this;
        }
        public Boolean getSkipCsiCheck() {
            return this.skipCsiCheck;
        }

    }

    public static class BatchTranslateForHtmlRequestExtExamples extends TeaModel {
        @NameInMap("src")
        public String src;

        /**
         * <strong>example:</strong>
         * <p>hello</p>
         */
        @NameInMap("tgt")
        public String tgt;

        public static BatchTranslateForHtmlRequestExtExamples build(java.util.Map<String, ?> map) throws Exception {
            BatchTranslateForHtmlRequestExtExamples self = new BatchTranslateForHtmlRequestExtExamples();
            return TeaModel.build(map, self);
        }

        public BatchTranslateForHtmlRequestExtExamples setSrc(String src) {
            this.src = src;
            return this;
        }
        public String getSrc() {
            return this.src;
        }

        public BatchTranslateForHtmlRequestExtExamples setTgt(String tgt) {
            this.tgt = tgt;
            return this;
        }
        public String getTgt() {
            return this.tgt;
        }

    }

    public static class BatchTranslateForHtmlRequestExtTerminologies extends TeaModel {
        @NameInMap("src")
        public String src;

        /**
         * <strong>example:</strong>
         * <p>API</p>
         */
        @NameInMap("tgt")
        public String tgt;

        public static BatchTranslateForHtmlRequestExtTerminologies build(java.util.Map<String, ?> map) throws Exception {
            BatchTranslateForHtmlRequestExtTerminologies self = new BatchTranslateForHtmlRequestExtTerminologies();
            return TeaModel.build(map, self);
        }

        public BatchTranslateForHtmlRequestExtTerminologies setSrc(String src) {
            this.src = src;
            return this;
        }
        public String getSrc() {
            return this.src;
        }

        public BatchTranslateForHtmlRequestExtTerminologies setTgt(String tgt) {
            this.tgt = tgt;
            return this;
        }
        public String getTgt() {
            return this.tgt;
        }

    }

    public static class BatchTranslateForHtmlRequestExtTextTransform extends TeaModel {
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

        public static BatchTranslateForHtmlRequestExtTextTransform build(java.util.Map<String, ?> map) throws Exception {
            BatchTranslateForHtmlRequestExtTextTransform self = new BatchTranslateForHtmlRequestExtTextTransform();
            return TeaModel.build(map, self);
        }

        public BatchTranslateForHtmlRequestExtTextTransform setToLower(Boolean toLower) {
            this.toLower = toLower;
            return this;
        }
        public Boolean getToLower() {
            return this.toLower;
        }

        public BatchTranslateForHtmlRequestExtTextTransform setToTitle(Boolean toTitle) {
            this.toTitle = toTitle;
            return this;
        }
        public Boolean getToTitle() {
            return this.toTitle;
        }

        public BatchTranslateForHtmlRequestExtTextTransform setToUpper(Boolean toUpper) {
            this.toUpper = toUpper;
            return this;
        }
        public Boolean getToUpper() {
            return this.toUpper;
        }

    }

    public static class BatchTranslateForHtmlRequestExt extends TeaModel {
        @NameInMap("config")
        public BatchTranslateForHtmlRequestExtConfig config;

        /**
         * <strong>example:</strong>
         * <p>this sentence from an e-commerce product image, please provide a translation that is both highly concise and no more than 1.2 times the length of the original.</p>
         */
        @NameInMap("domainHint")
        public String domainHint;

        @NameInMap("examples")
        public java.util.List<BatchTranslateForHtmlRequestExtExamples> examples;

        @NameInMap("sensitives")
        public java.util.List<String> sensitives;

        @NameInMap("terminologies")
        public java.util.List<BatchTranslateForHtmlRequestExtTerminologies> terminologies;

        @NameInMap("textTransform")
        public BatchTranslateForHtmlRequestExtTextTransform textTransform;

        public static BatchTranslateForHtmlRequestExt build(java.util.Map<String, ?> map) throws Exception {
            BatchTranslateForHtmlRequestExt self = new BatchTranslateForHtmlRequestExt();
            return TeaModel.build(map, self);
        }

        public BatchTranslateForHtmlRequestExt setConfig(BatchTranslateForHtmlRequestExtConfig config) {
            this.config = config;
            return this;
        }
        public BatchTranslateForHtmlRequestExtConfig getConfig() {
            return this.config;
        }

        public BatchTranslateForHtmlRequestExt setDomainHint(String domainHint) {
            this.domainHint = domainHint;
            return this;
        }
        public String getDomainHint() {
            return this.domainHint;
        }

        public BatchTranslateForHtmlRequestExt setExamples(java.util.List<BatchTranslateForHtmlRequestExtExamples> examples) {
            this.examples = examples;
            return this;
        }
        public java.util.List<BatchTranslateForHtmlRequestExtExamples> getExamples() {
            return this.examples;
        }

        public BatchTranslateForHtmlRequestExt setSensitives(java.util.List<String> sensitives) {
            this.sensitives = sensitives;
            return this;
        }
        public java.util.List<String> getSensitives() {
            return this.sensitives;
        }

        public BatchTranslateForHtmlRequestExt setTerminologies(java.util.List<BatchTranslateForHtmlRequestExtTerminologies> terminologies) {
            this.terminologies = terminologies;
            return this;
        }
        public java.util.List<BatchTranslateForHtmlRequestExtTerminologies> getTerminologies() {
            return this.terminologies;
        }

        public BatchTranslateForHtmlRequestExt setTextTransform(BatchTranslateForHtmlRequestExtTextTransform textTransform) {
            this.textTransform = textTransform;
            return this;
        }
        public BatchTranslateForHtmlRequestExtTextTransform getTextTransform() {
            return this.textTransform;
        }

    }

}
