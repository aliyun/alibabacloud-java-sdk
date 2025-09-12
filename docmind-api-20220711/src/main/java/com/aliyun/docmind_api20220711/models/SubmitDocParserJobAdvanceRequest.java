// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class SubmitDocParserJobAdvanceRequest extends TeaModel {
    @NameInMap("CustomOssConfig")
    public SubmitDocParserJobAdvanceRequestCustomOssConfig customOssConfig;

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

    @NameInMap("Option")
    public String option;

    @NameInMap("OssBucket")
    public String ossBucket;

    @NameInMap("OssEndpoint")
    public String ossEndpoint;

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

    public static class SubmitDocParserJobAdvanceRequestMultimediaParameters extends TeaModel {
        @NameInMap("EnableSynopsisParse")
        public Boolean enableSynopsisParse;

        @NameInMap("VlParsePrompt")
        public String vlParsePrompt;

        public static SubmitDocParserJobAdvanceRequestMultimediaParameters build(java.util.Map<String, ?> map) throws Exception {
            SubmitDocParserJobAdvanceRequestMultimediaParameters self = new SubmitDocParserJobAdvanceRequestMultimediaParameters();
            return TeaModel.build(map, self);
        }

        public SubmitDocParserJobAdvanceRequestMultimediaParameters setEnableSynopsisParse(Boolean enableSynopsisParse) {
            this.enableSynopsisParse = enableSynopsisParse;
            return this;
        }
        public Boolean getEnableSynopsisParse() {
            return this.enableSynopsisParse;
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
