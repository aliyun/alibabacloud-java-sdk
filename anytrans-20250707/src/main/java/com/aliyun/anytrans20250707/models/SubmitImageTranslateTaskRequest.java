// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.anytrans20250707.models;

import com.aliyun.tea.*;

public class SubmitImageTranslateTaskRequest extends TeaModel {
    /**
     * <p>Extended parameters to control translation features.</p>
     */
    @NameInMap("ext")
    public SubmitImageTranslateTaskRequestExt ext;

    /**
     * <p>The translation format.</p>
     * 
     * <strong>example:</strong>
     * <p>image</p>
     */
    @NameInMap("format")
    public String format;

    /**
     * <p>Specifies the translation model.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>flash</p>
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
     * <p>A list of target languages.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("targetLanguage")
    public java.util.List<String> targetLanguage;

    /**
     * <p>The URL of the image to translate.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://img.alicdn.com/imgextra/i3/2214557014466/O1CN0174Thmb1irTsyTXYFO_!!4611686018427386306-0-item_pic.jpg">https://img.alicdn.com/imgextra/i3/2214557014466/O1CN0174Thmb1irTsyTXYFO_!!4611686018427386306-0-item_pic.jpg</a></p>
     */
    @NameInMap("text")
    public String text;

    /**
     * <p>The ID of the Model Studio workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-kqtrcpdee4xm29xx</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static SubmitImageTranslateTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitImageTranslateTaskRequest self = new SubmitImageTranslateTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitImageTranslateTaskRequest setExt(SubmitImageTranslateTaskRequestExt ext) {
        this.ext = ext;
        return this;
    }
    public SubmitImageTranslateTaskRequestExt getExt() {
        return this.ext;
    }

    public SubmitImageTranslateTaskRequest setFormat(String format) {
        this.format = format;
        return this;
    }
    public String getFormat() {
        return this.format;
    }

    public SubmitImageTranslateTaskRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public SubmitImageTranslateTaskRequest setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
        return this;
    }
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public SubmitImageTranslateTaskRequest setTargetLanguage(java.util.List<String> targetLanguage) {
        this.targetLanguage = targetLanguage;
        return this;
    }
    public java.util.List<String> getTargetLanguage() {
        return this.targetLanguage;
    }

    public SubmitImageTranslateTaskRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public SubmitImageTranslateTaskRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class SubmitImageTranslateTaskRequestExtExamples extends TeaModel {
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

        public static SubmitImageTranslateTaskRequestExtExamples build(java.util.Map<String, ?> map) throws Exception {
            SubmitImageTranslateTaskRequestExtExamples self = new SubmitImageTranslateTaskRequestExtExamples();
            return TeaModel.build(map, self);
        }

        public SubmitImageTranslateTaskRequestExtExamples setSrc(String src) {
            this.src = src;
            return this;
        }
        public String getSrc() {
            return this.src;
        }

        public SubmitImageTranslateTaskRequestExtExamples setTgt(String tgt) {
            this.tgt = tgt;
            return this;
        }
        public String getTgt() {
            return this.tgt;
        }

    }

    public static class SubmitImageTranslateTaskRequestExtTerminologies extends TeaModel {
        /**
         * <p>The source text.</p>
         * 
         * <strong>example:</strong>
         * <p>机器学习</p>
         */
        @NameInMap("src")
        public String src;

        /**
         * <p>The custom translation for the source text.</p>
         * 
         * <strong>example:</strong>
         * <p>ML</p>
         */
        @NameInMap("tgt")
        public String tgt;

        public static SubmitImageTranslateTaskRequestExtTerminologies build(java.util.Map<String, ?> map) throws Exception {
            SubmitImageTranslateTaskRequestExtTerminologies self = new SubmitImageTranslateTaskRequestExtTerminologies();
            return TeaModel.build(map, self);
        }

        public SubmitImageTranslateTaskRequestExtTerminologies setSrc(String src) {
            this.src = src;
            return this;
        }
        public String getSrc() {
            return this.src;
        }

        public SubmitImageTranslateTaskRequestExtTerminologies setTgt(String tgt) {
            this.tgt = tgt;
            return this;
        }
        public String getTgt() {
            return this.tgt;
        }

    }

    public static class SubmitImageTranslateTaskRequestExtTextTransform extends TeaModel {
        /**
         * <p>Set to <code>true</code> to convert the entire translated text to lowercase.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("toLower")
        public Boolean toLower;

        /**
         * <p>Set to <code>true</code> to convert the entire translated text to title case.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("toTitle")
        public Boolean toTitle;

        /**
         * <p>Set to <code>true</code> to convert the entire translated text to uppercase.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("toUpper")
        public Boolean toUpper;

        public static SubmitImageTranslateTaskRequestExtTextTransform build(java.util.Map<String, ?> map) throws Exception {
            SubmitImageTranslateTaskRequestExtTextTransform self = new SubmitImageTranslateTaskRequestExtTextTransform();
            return TeaModel.build(map, self);
        }

        public SubmitImageTranslateTaskRequestExtTextTransform setToLower(Boolean toLower) {
            this.toLower = toLower;
            return this;
        }
        public Boolean getToLower() {
            return this.toLower;
        }

        public SubmitImageTranslateTaskRequestExtTextTransform setToTitle(Boolean toTitle) {
            this.toTitle = toTitle;
            return this;
        }
        public Boolean getToTitle() {
            return this.toTitle;
        }

        public SubmitImageTranslateTaskRequestExtTextTransform setToUpper(Boolean toUpper) {
            this.toUpper = toUpper;
            return this;
        }
        public Boolean getToUpper() {
            return this.toUpper;
        }

    }

    public static class SubmitImageTranslateTaskRequestExt extends TeaModel {
        /**
         * <p>An English string that guides the translation style of the large language model (LLM).</p>
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
        public java.util.List<SubmitImageTranslateTaskRequestExtExamples> examples;

        /**
         * <p>Parameters for isolating terminology to prevent interference between different users or business scenarios. Use <code>bizUserId</code> for user-level isolation and <code>bizType</code> for scenario-level isolation.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;bizUserld&quot;:&quot;123456&quot;,&quot;bizType&quot;:session&quot;}</p>
         */
        @NameInMap("paramMap")
        public Object paramMap;

        /**
         * <p>A list of sensitive words.</p>
         */
        @NameInMap("sensitives")
        public java.util.List<String> sensitives;

        /**
         * <p>A list of custom term pairs to apply to the translation.</p>
         */
        @NameInMap("terminologies")
        public java.util.List<SubmitImageTranslateTaskRequestExtTerminologies> terminologies;

        /**
         * <p>Specifies case conversion for the translated text.</p>
         */
        @NameInMap("textTransform")
        public SubmitImageTranslateTaskRequestExtTextTransform textTransform;

        /**
         * <p>User-defined pass-through data that the service returns unmodified in the response. This is typically used for analytics tracking.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;traceId&quot;:&quot;trace_123456&quot;}</p>
         */
        @NameInMap("trackingData")
        public String trackingData;

        public static SubmitImageTranslateTaskRequestExt build(java.util.Map<String, ?> map) throws Exception {
            SubmitImageTranslateTaskRequestExt self = new SubmitImageTranslateTaskRequestExt();
            return TeaModel.build(map, self);
        }

        public SubmitImageTranslateTaskRequestExt setDomainHint(String domainHint) {
            this.domainHint = domainHint;
            return this;
        }
        public String getDomainHint() {
            return this.domainHint;
        }

        public SubmitImageTranslateTaskRequestExt setExamples(java.util.List<SubmitImageTranslateTaskRequestExtExamples> examples) {
            this.examples = examples;
            return this;
        }
        public java.util.List<SubmitImageTranslateTaskRequestExtExamples> getExamples() {
            return this.examples;
        }

        public SubmitImageTranslateTaskRequestExt setParamMap(Object paramMap) {
            this.paramMap = paramMap;
            return this;
        }
        public Object getParamMap() {
            return this.paramMap;
        }

        public SubmitImageTranslateTaskRequestExt setSensitives(java.util.List<String> sensitives) {
            this.sensitives = sensitives;
            return this;
        }
        public java.util.List<String> getSensitives() {
            return this.sensitives;
        }

        public SubmitImageTranslateTaskRequestExt setTerminologies(java.util.List<SubmitImageTranslateTaskRequestExtTerminologies> terminologies) {
            this.terminologies = terminologies;
            return this;
        }
        public java.util.List<SubmitImageTranslateTaskRequestExtTerminologies> getTerminologies() {
            return this.terminologies;
        }

        public SubmitImageTranslateTaskRequestExt setTextTransform(SubmitImageTranslateTaskRequestExtTextTransform textTransform) {
            this.textTransform = textTransform;
            return this;
        }
        public SubmitImageTranslateTaskRequestExtTextTransform getTextTransform() {
            return this.textTransform;
        }

        public SubmitImageTranslateTaskRequestExt setTrackingData(String trackingData) {
            this.trackingData = trackingData;
            return this;
        }
        public String getTrackingData() {
            return this.trackingData;
        }

    }

}
