// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class SubmitDocParserJobRequest extends TeaModel {
    @NameInMap("CustomOssConfig")
    public SubmitDocParserJobRequestCustomOssConfig customOssConfig;

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
    public String fileUrl;

    @NameInMap("FormulaEnhancement")
    public Boolean formulaEnhancement;

    @NameInMap("LLMParam")
    public SubmitDocParserJobRequestLLMParam LLMParam;

    @NameInMap("LlmEnhancement")
    public Boolean llmEnhancement;

    @NameInMap("MultimediaParameters")
    public SubmitDocParserJobRequestMultimediaParameters multimediaParameters;

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

    public static SubmitDocParserJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitDocParserJobRequest self = new SubmitDocParserJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitDocParserJobRequest setCustomOssConfig(SubmitDocParserJobRequestCustomOssConfig customOssConfig) {
        this.customOssConfig = customOssConfig;
        return this;
    }
    public SubmitDocParserJobRequestCustomOssConfig getCustomOssConfig() {
        return this.customOssConfig;
    }

    public SubmitDocParserJobRequest setEnhancementMode(String enhancementMode) {
        this.enhancementMode = enhancementMode;
        return this;
    }
    public String getEnhancementMode() {
        return this.enhancementMode;
    }

    public SubmitDocParserJobRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public SubmitDocParserJobRequest setFileNameExtension(String fileNameExtension) {
        this.fileNameExtension = fileNameExtension;
        return this;
    }
    public String getFileNameExtension() {
        return this.fileNameExtension;
    }

    public SubmitDocParserJobRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public SubmitDocParserJobRequest setFormulaEnhancement(Boolean formulaEnhancement) {
        this.formulaEnhancement = formulaEnhancement;
        return this;
    }
    public Boolean getFormulaEnhancement() {
        return this.formulaEnhancement;
    }

    public SubmitDocParserJobRequest setLLMParam(SubmitDocParserJobRequestLLMParam LLMParam) {
        this.LLMParam = LLMParam;
        return this;
    }
    public SubmitDocParserJobRequestLLMParam getLLMParam() {
        return this.LLMParam;
    }

    public SubmitDocParserJobRequest setLlmEnhancement(Boolean llmEnhancement) {
        this.llmEnhancement = llmEnhancement;
        return this;
    }
    public Boolean getLlmEnhancement() {
        return this.llmEnhancement;
    }

    public SubmitDocParserJobRequest setMultimediaParameters(SubmitDocParserJobRequestMultimediaParameters multimediaParameters) {
        this.multimediaParameters = multimediaParameters;
        return this;
    }
    public SubmitDocParserJobRequestMultimediaParameters getMultimediaParameters() {
        return this.multimediaParameters;
    }

    public SubmitDocParserJobRequest setOption(String option) {
        this.option = option;
        return this;
    }
    public String getOption() {
        return this.option;
    }

    public SubmitDocParserJobRequest setOssBucket(String ossBucket) {
        this.ossBucket = ossBucket;
        return this;
    }
    public String getOssBucket() {
        return this.ossBucket;
    }

    public SubmitDocParserJobRequest setOssEndpoint(String ossEndpoint) {
        this.ossEndpoint = ossEndpoint;
        return this;
    }
    public String getOssEndpoint() {
        return this.ossEndpoint;
    }

    public SubmitDocParserJobRequest setOutputHtmlTable(Boolean outputHtmlTable) {
        this.outputHtmlTable = outputHtmlTable;
        return this;
    }
    public Boolean getOutputHtmlTable() {
        return this.outputHtmlTable;
    }

    public SubmitDocParserJobRequest setPageIndex(String pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public String getPageIndex() {
        return this.pageIndex;
    }

    public static class SubmitDocParserJobRequestCustomOssConfig extends TeaModel {
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

        public static SubmitDocParserJobRequestCustomOssConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitDocParserJobRequestCustomOssConfig self = new SubmitDocParserJobRequestCustomOssConfig();
            return TeaModel.build(map, self);
        }

        public SubmitDocParserJobRequestCustomOssConfig setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public SubmitDocParserJobRequestCustomOssConfig setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public SubmitDocParserJobRequestCustomOssConfig setStsToken(String stsToken) {
            this.stsToken = stsToken;
            return this;
        }
        public String getStsToken() {
            return this.stsToken;
        }

    }

    public static class SubmitDocParserJobRequestLLMParam extends TeaModel {
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

        public static SubmitDocParserJobRequestLLMParam build(java.util.Map<String, ?> map) throws Exception {
            SubmitDocParserJobRequestLLMParam self = new SubmitDocParserJobRequestLLMParam();
            return TeaModel.build(map, self);
        }

        public SubmitDocParserJobRequestLLMParam setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public SubmitDocParserJobRequestLLMParam setPrompt(String prompt) {
            this.prompt = prompt;
            return this;
        }
        public String getPrompt() {
            return this.prompt;
        }

    }

    public static class SubmitDocParserJobRequestMultimediaParameters extends TeaModel {
        @NameInMap("EnableSynopsisParse")
        public Boolean enableSynopsisParse;

        @NameInMap("VlParsePrompt")
        public String vlParsePrompt;

        public static SubmitDocParserJobRequestMultimediaParameters build(java.util.Map<String, ?> map) throws Exception {
            SubmitDocParserJobRequestMultimediaParameters self = new SubmitDocParserJobRequestMultimediaParameters();
            return TeaModel.build(map, self);
        }

        public SubmitDocParserJobRequestMultimediaParameters setEnableSynopsisParse(Boolean enableSynopsisParse) {
            this.enableSynopsisParse = enableSynopsisParse;
            return this;
        }
        public Boolean getEnableSynopsisParse() {
            return this.enableSynopsisParse;
        }

        public SubmitDocParserJobRequestMultimediaParameters setVlParsePrompt(String vlParsePrompt) {
            this.vlParsePrompt = vlParsePrompt;
            return this;
        }
        public String getVlParsePrompt() {
            return this.vlParsePrompt;
        }

    }

}
