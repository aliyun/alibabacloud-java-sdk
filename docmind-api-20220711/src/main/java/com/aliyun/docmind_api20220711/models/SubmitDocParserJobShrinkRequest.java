// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class SubmitDocParserJobShrinkRequest extends TeaModel {
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

    @NameInMap("LlmEnhancement")
    public Boolean llmEnhancement;

    @NameInMap("MultimediaParameters")
    public String multimediaParametersShrink;

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

    public static SubmitDocParserJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitDocParserJobShrinkRequest self = new SubmitDocParserJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitDocParserJobShrinkRequest setEnhancementMode(String enhancementMode) {
        this.enhancementMode = enhancementMode;
        return this;
    }
    public String getEnhancementMode() {
        return this.enhancementMode;
    }

    public SubmitDocParserJobShrinkRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public SubmitDocParserJobShrinkRequest setFileNameExtension(String fileNameExtension) {
        this.fileNameExtension = fileNameExtension;
        return this;
    }
    public String getFileNameExtension() {
        return this.fileNameExtension;
    }

    public SubmitDocParserJobShrinkRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public SubmitDocParserJobShrinkRequest setFormulaEnhancement(Boolean formulaEnhancement) {
        this.formulaEnhancement = formulaEnhancement;
        return this;
    }
    public Boolean getFormulaEnhancement() {
        return this.formulaEnhancement;
    }

    public SubmitDocParserJobShrinkRequest setLlmEnhancement(Boolean llmEnhancement) {
        this.llmEnhancement = llmEnhancement;
        return this;
    }
    public Boolean getLlmEnhancement() {
        return this.llmEnhancement;
    }

    public SubmitDocParserJobShrinkRequest setMultimediaParametersShrink(String multimediaParametersShrink) {
        this.multimediaParametersShrink = multimediaParametersShrink;
        return this;
    }
    public String getMultimediaParametersShrink() {
        return this.multimediaParametersShrink;
    }

    public SubmitDocParserJobShrinkRequest setOption(String option) {
        this.option = option;
        return this;
    }
    public String getOption() {
        return this.option;
    }

    public SubmitDocParserJobShrinkRequest setOssBucket(String ossBucket) {
        this.ossBucket = ossBucket;
        return this;
    }
    public String getOssBucket() {
        return this.ossBucket;
    }

    public SubmitDocParserJobShrinkRequest setOssEndpoint(String ossEndpoint) {
        this.ossEndpoint = ossEndpoint;
        return this;
    }
    public String getOssEndpoint() {
        return this.ossEndpoint;
    }

    public SubmitDocParserJobShrinkRequest setOutputHtmlTable(Boolean outputHtmlTable) {
        this.outputHtmlTable = outputHtmlTable;
        return this;
    }
    public Boolean getOutputHtmlTable() {
        return this.outputHtmlTable;
    }

    public SubmitDocParserJobShrinkRequest setPageIndex(String pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public String getPageIndex() {
        return this.pageIndex;
    }

}
