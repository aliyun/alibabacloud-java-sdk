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
     * <p><a href="https://xxx-hangzhou.aliyuncs.com/docs/tmp/%E6%A0%B7%E4%BE%8B_%E6%97%A0%E5%9B%BE.pdf?OSSAccessKeyId=LTAI5tBVMtznbk7xyCa56gof&Expires=1755883153&Signature=H23MpMZqFVPGTPCU2GtFqOFfmII%3D">https://xxx-hangzhou.aliyuncs.com/docs/tmp/%E6%A0%B7%E4%BE%8B_%E6%97%A0%E5%9B%BE.pdf?OSSAccessKeyId=LTAI5tBVMtznbk7xyCa56gof&amp;Expires=1755883153&amp;Signature=H23MpMZqFVPGTPCU2GtFqOFfmII%3D</a></p>
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

    public static class SubmitDocTranslateTaskRequestExtExamples extends TeaModel {
        @NameInMap("src")
        public String src;

        /**
         * <strong>example:</strong>
         * <p>llm</p>
         */
        @NameInMap("tgt")
        public String tgt;

        public static SubmitDocTranslateTaskRequestExtExamples build(java.util.Map<String, ?> map) throws Exception {
            SubmitDocTranslateTaskRequestExtExamples self = new SubmitDocTranslateTaskRequestExtExamples();
            return TeaModel.build(map, self);
        }

        public SubmitDocTranslateTaskRequestExtExamples setSrc(String src) {
            this.src = src;
            return this;
        }
        public String getSrc() {
            return this.src;
        }

        public SubmitDocTranslateTaskRequestExtExamples setTgt(String tgt) {
            this.tgt = tgt;
            return this;
        }
        public String getTgt() {
            return this.tgt;
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

    public static class SubmitDocTranslateTaskRequestExtTextTransform extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
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
         * <p>true</p>
         */
        @NameInMap("toUpper")
        public Boolean toUpper;

        public static SubmitDocTranslateTaskRequestExtTextTransform build(java.util.Map<String, ?> map) throws Exception {
            SubmitDocTranslateTaskRequestExtTextTransform self = new SubmitDocTranslateTaskRequestExtTextTransform();
            return TeaModel.build(map, self);
        }

        public SubmitDocTranslateTaskRequestExtTextTransform setToLower(Boolean toLower) {
            this.toLower = toLower;
            return this;
        }
        public Boolean getToLower() {
            return this.toLower;
        }

        public SubmitDocTranslateTaskRequestExtTextTransform setToTitle(Boolean toTitle) {
            this.toTitle = toTitle;
            return this;
        }
        public Boolean getToTitle() {
            return this.toTitle;
        }

        public SubmitDocTranslateTaskRequestExtTextTransform setToUpper(Boolean toUpper) {
            this.toUpper = toUpper;
            return this;
        }
        public Boolean getToUpper() {
            return this.toUpper;
        }

    }

    public static class SubmitDocTranslateTaskRequestExt extends TeaModel {
        @NameInMap("domainHint")
        public String domainHint;

        @NameInMap("examples")
        public java.util.List<SubmitDocTranslateTaskRequestExtExamples> examples;

        @NameInMap("sensitives")
        public java.util.List<String> sensitives;

        @NameInMap("terminologies")
        public java.util.List<SubmitDocTranslateTaskRequestExtTerminologies> terminologies;

        @NameInMap("textTransform")
        public SubmitDocTranslateTaskRequestExtTextTransform textTransform;

        public static SubmitDocTranslateTaskRequestExt build(java.util.Map<String, ?> map) throws Exception {
            SubmitDocTranslateTaskRequestExt self = new SubmitDocTranslateTaskRequestExt();
            return TeaModel.build(map, self);
        }

        public SubmitDocTranslateTaskRequestExt setDomainHint(String domainHint) {
            this.domainHint = domainHint;
            return this;
        }
        public String getDomainHint() {
            return this.domainHint;
        }

        public SubmitDocTranslateTaskRequestExt setExamples(java.util.List<SubmitDocTranslateTaskRequestExtExamples> examples) {
            this.examples = examples;
            return this;
        }
        public java.util.List<SubmitDocTranslateTaskRequestExtExamples> getExamples() {
            return this.examples;
        }

        public SubmitDocTranslateTaskRequestExt setSensitives(java.util.List<String> sensitives) {
            this.sensitives = sensitives;
            return this;
        }
        public java.util.List<String> getSensitives() {
            return this.sensitives;
        }

        public SubmitDocTranslateTaskRequestExt setTerminologies(java.util.List<SubmitDocTranslateTaskRequestExtTerminologies> terminologies) {
            this.terminologies = terminologies;
            return this;
        }
        public java.util.List<SubmitDocTranslateTaskRequestExtTerminologies> getTerminologies() {
            return this.terminologies;
        }

        public SubmitDocTranslateTaskRequestExt setTextTransform(SubmitDocTranslateTaskRequestExtTextTransform textTransform) {
            this.textTransform = textTransform;
            return this;
        }
        public SubmitDocTranslateTaskRequestExtTextTransform getTextTransform() {
            return this.textTransform;
        }

    }

}
