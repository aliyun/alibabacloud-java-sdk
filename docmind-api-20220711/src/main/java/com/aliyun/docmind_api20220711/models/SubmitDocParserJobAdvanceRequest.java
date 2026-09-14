// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class SubmitDocParserJobAdvanceRequest extends TeaModel {
    @NameInMap("CustomOssConfig")
    public SubmitDocParserJobAdvanceRequestCustomOssConfig customOssConfig;

    @NameInMap("EnableEventCallback")
    public Boolean enableEventCallback;

    @NameInMap("EnhancementMode")
    public String enhancementMode;

    /**
     * <strong>example:</strong>
     * <p>docStructure.pdf</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <strong>example:</strong>
     * <p>pdf</p>
     */
    @NameInMap("FileNameExtension")
    public String fileNameExtension;

    /**
     * <strong>example:</strong>
     * <p><a href="https://gw.alipayobjects.com/os/basement_prod/598b9edf-5287-4065-9e36-464305c60698.pdf">https://gw.alipayobjects.com/os/basement_prod/598b9edf-5287-4065-9e36-464305c60698.pdf</a></p>
     */
    @NameInMap("FileUrl")
    public java.io.InputStream fileUrlObject;

    @NameInMap("FormulaEnhancement")
    public Boolean formulaEnhancement;

    @NameInMap("LLMParam")
    public SubmitDocParserJobAdvanceRequestLLMParam LLMParam;

    @NameInMap("LlmEnhancement")
    public Boolean llmEnhancement;

    @NameInMap("MultimediaParameters")
    public SubmitDocParserJobAdvanceRequestMultimediaParameters multimediaParameters;

    @NameInMap("NeedHeaderFooter")
    public Boolean needHeaderFooter;

    @NameInMap("Option")
    public String option;

    @NameInMap("OssBucket")
    public String ossBucket;

    @NameInMap("OssEndpoint")
    public String ossEndpoint;

    @NameInMap("OutputFormat")
    public java.util.List<String> outputFormat;

    @NameInMap("OutputHtmlTable")
    public Boolean outputHtmlTable;

    @NameInMap("PageIndex")
    public String pageIndex;

    public static SubmitDocParserJobAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitDocParserJobAdvanceRequest self = new SubmitDocParserJobAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public SubmitDocParserJobAdvanceRequest setCustomOssConfig(SubmitDocParserJobAdvanceRequestCustomOssConfig customOssConfig) {
        this.customOssConfig = customOssConfig;
        return this;
    }
    public SubmitDocParserJobAdvanceRequestCustomOssConfig getCustomOssConfig() {
        return this.customOssConfig;
    }

    public SubmitDocParserJobAdvanceRequest setEnableEventCallback(Boolean enableEventCallback) {
        this.enableEventCallback = enableEventCallback;
        return this;
    }
    public Boolean getEnableEventCallback() {
        return this.enableEventCallback;
    }

    public SubmitDocParserJobAdvanceRequest setEnhancementMode(String enhancementMode) {
        this.enhancementMode = enhancementMode;
        return this;
    }
    public String getEnhancementMode() {
        return this.enhancementMode;
    }

    public SubmitDocParserJobAdvanceRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public SubmitDocParserJobAdvanceRequest setFileNameExtension(String fileNameExtension) {
        this.fileNameExtension = fileNameExtension;
        return this;
    }
    public String getFileNameExtension() {
        return this.fileNameExtension;
    }

    public SubmitDocParserJobAdvanceRequest setFileUrlObject(java.io.InputStream fileUrlObject) {
        this.fileUrlObject = fileUrlObject;
        return this;
    }
    public java.io.InputStream getFileUrlObject() {
        return this.fileUrlObject;
    }

    public SubmitDocParserJobAdvanceRequest setFormulaEnhancement(Boolean formulaEnhancement) {
        this.formulaEnhancement = formulaEnhancement;
        return this;
    }
    public Boolean getFormulaEnhancement() {
        return this.formulaEnhancement;
    }

    public SubmitDocParserJobAdvanceRequest setLLMParam(SubmitDocParserJobAdvanceRequestLLMParam LLMParam) {
        this.LLMParam = LLMParam;
        return this;
    }
    public SubmitDocParserJobAdvanceRequestLLMParam getLLMParam() {
        return this.LLMParam;
    }

    public SubmitDocParserJobAdvanceRequest setLlmEnhancement(Boolean llmEnhancement) {
        this.llmEnhancement = llmEnhancement;
        return this;
    }
    public Boolean getLlmEnhancement() {
        return this.llmEnhancement;
    }

    public SubmitDocParserJobAdvanceRequest setMultimediaParameters(SubmitDocParserJobAdvanceRequestMultimediaParameters multimediaParameters) {
        this.multimediaParameters = multimediaParameters;
        return this;
    }
    public SubmitDocParserJobAdvanceRequestMultimediaParameters getMultimediaParameters() {
        return this.multimediaParameters;
    }

    public SubmitDocParserJobAdvanceRequest setNeedHeaderFooter(Boolean needHeaderFooter) {
        this.needHeaderFooter = needHeaderFooter;
        return this;
    }
    public Boolean getNeedHeaderFooter() {
        return this.needHeaderFooter;
    }

    public SubmitDocParserJobAdvanceRequest setOption(String option) {
        this.option = option;
        return this;
    }
    public String getOption() {
        return this.option;
    }

    public SubmitDocParserJobAdvanceRequest setOssBucket(String ossBucket) {
        this.ossBucket = ossBucket;
        return this;
    }
    public String getOssBucket() {
        return this.ossBucket;
    }

    public SubmitDocParserJobAdvanceRequest setOssEndpoint(String ossEndpoint) {
        this.ossEndpoint = ossEndpoint;
        return this;
    }
    public String getOssEndpoint() {
        return this.ossEndpoint;
    }

    public SubmitDocParserJobAdvanceRequest setOutputFormat(java.util.List<String> outputFormat) {
        this.outputFormat = outputFormat;
        return this;
    }
    public java.util.List<String> getOutputFormat() {
        return this.outputFormat;
    }

    public SubmitDocParserJobAdvanceRequest setOutputHtmlTable(Boolean outputHtmlTable) {
        this.outputHtmlTable = outputHtmlTable;
        return this;
    }
    public Boolean getOutputHtmlTable() {
        return this.outputHtmlTable;
    }

    public SubmitDocParserJobAdvanceRequest setPageIndex(String pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public String getPageIndex() {
        return this.pageIndex;
    }

    public static class SubmitDocParserJobAdvanceRequestCustomOssConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>AccessId</p>
         */
        @NameInMap("AccessId")
        public String accessId;

        /**
         * <strong>example:</strong>
         * <p>AccessKeySecret</p>
         */
        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        /**
         * <strong>example:</strong>
         * <p>StsToken</p>
         */
        @NameInMap("StsToken")
        public String stsToken;

        public static SubmitDocParserJobAdvanceRequestCustomOssConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitDocParserJobAdvanceRequestCustomOssConfig self = new SubmitDocParserJobAdvanceRequestCustomOssConfig();
            return TeaModel.build(map, self);
        }

        public SubmitDocParserJobAdvanceRequestCustomOssConfig setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public SubmitDocParserJobAdvanceRequestCustomOssConfig setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public SubmitDocParserJobAdvanceRequestCustomOssConfig setStsToken(String stsToken) {
            this.stsToken = stsToken;
            return this;
        }
        public String getStsToken() {
            return this.stsToken;
        }

    }

    public static class SubmitDocParserJobAdvanceRequestLLMParam extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>qwen-vl-ocr-latest</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <strong>example:</strong>
         * <p>Read all the text from the image.</p>
         */
        @NameInMap("Prompt")
        public String prompt;

        public static SubmitDocParserJobAdvanceRequestLLMParam build(java.util.Map<String, ?> map) throws Exception {
            SubmitDocParserJobAdvanceRequestLLMParam self = new SubmitDocParserJobAdvanceRequestLLMParam();
            return TeaModel.build(map, self);
        }

        public SubmitDocParserJobAdvanceRequestLLMParam setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public SubmitDocParserJobAdvanceRequestLLMParam setPrompt(String prompt) {
            this.prompt = prompt;
            return this;
        }
        public String getPrompt() {
            return this.prompt;
        }

    }

    public static class SubmitDocParserJobAdvanceRequestMultimediaParametersFrameExtraction extends TeaModel {
        @NameInMap("FrameRate")
        public Float frameRate;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("OutputImageHeight")
        public Long outputImageHeight;

        @NameInMap("OutputImageWidth")
        public Long outputImageWidth;

        public static SubmitDocParserJobAdvanceRequestMultimediaParametersFrameExtraction build(java.util.Map<String, ?> map) throws Exception {
            SubmitDocParserJobAdvanceRequestMultimediaParametersFrameExtraction self = new SubmitDocParserJobAdvanceRequestMultimediaParametersFrameExtraction();
            return TeaModel.build(map, self);
        }

        public SubmitDocParserJobAdvanceRequestMultimediaParametersFrameExtraction setFrameRate(Float frameRate) {
            this.frameRate = frameRate;
            return this;
        }
        public Float getFrameRate() {
            return this.frameRate;
        }

        public SubmitDocParserJobAdvanceRequestMultimediaParametersFrameExtraction setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public SubmitDocParserJobAdvanceRequestMultimediaParametersFrameExtraction setOutputImageHeight(Long outputImageHeight) {
            this.outputImageHeight = outputImageHeight;
            return this;
        }
        public Long getOutputImageHeight() {
            return this.outputImageHeight;
        }

        public SubmitDocParserJobAdvanceRequestMultimediaParametersFrameExtraction setOutputImageWidth(Long outputImageWidth) {
            this.outputImageWidth = outputImageWidth;
            return this;
        }
        public Long getOutputImageWidth() {
            return this.outputImageWidth;
        }

    }

    public static class SubmitDocParserJobAdvanceRequestMultimediaParameters extends TeaModel {
        @NameInMap("EnableDiarization")
        public Boolean enableDiarization;

        @NameInMap("EnableSynopsisParse")
        public Boolean enableSynopsisParse;

        @NameInMap("EnableSynopsisSegments")
        public Boolean enableSynopsisSegments;

        @NameInMap("EnableSynopsisSummary")
        public Boolean enableSynopsisSummary;

        @NameInMap("FrameExtraction")
        public SubmitDocParserJobAdvanceRequestMultimediaParametersFrameExtraction frameExtraction;

        @NameInMap("VlParsePrompt")
        public String vlParsePrompt;

        public static SubmitDocParserJobAdvanceRequestMultimediaParameters build(java.util.Map<String, ?> map) throws Exception {
            SubmitDocParserJobAdvanceRequestMultimediaParameters self = new SubmitDocParserJobAdvanceRequestMultimediaParameters();
            return TeaModel.build(map, self);
        }

        public SubmitDocParserJobAdvanceRequestMultimediaParameters setEnableDiarization(Boolean enableDiarization) {
            this.enableDiarization = enableDiarization;
            return this;
        }
        public Boolean getEnableDiarization() {
            return this.enableDiarization;
        }

        public SubmitDocParserJobAdvanceRequestMultimediaParameters setEnableSynopsisParse(Boolean enableSynopsisParse) {
            this.enableSynopsisParse = enableSynopsisParse;
            return this;
        }
        public Boolean getEnableSynopsisParse() {
            return this.enableSynopsisParse;
        }

        public SubmitDocParserJobAdvanceRequestMultimediaParameters setEnableSynopsisSegments(Boolean enableSynopsisSegments) {
            this.enableSynopsisSegments = enableSynopsisSegments;
            return this;
        }
        public Boolean getEnableSynopsisSegments() {
            return this.enableSynopsisSegments;
        }

        public SubmitDocParserJobAdvanceRequestMultimediaParameters setEnableSynopsisSummary(Boolean enableSynopsisSummary) {
            this.enableSynopsisSummary = enableSynopsisSummary;
            return this;
        }
        public Boolean getEnableSynopsisSummary() {
            return this.enableSynopsisSummary;
        }

        public SubmitDocParserJobAdvanceRequestMultimediaParameters setFrameExtraction(SubmitDocParserJobAdvanceRequestMultimediaParametersFrameExtraction frameExtraction) {
            this.frameExtraction = frameExtraction;
            return this;
        }
        public SubmitDocParserJobAdvanceRequestMultimediaParametersFrameExtraction getFrameExtraction() {
            return this.frameExtraction;
        }

        public SubmitDocParserJobAdvanceRequestMultimediaParameters setVlParsePrompt(String vlParsePrompt) {
            this.vlParsePrompt = vlParsePrompt;
            return this;
        }
        public String getVlParsePrompt() {
            return this.vlParsePrompt;
        }

    }

}
