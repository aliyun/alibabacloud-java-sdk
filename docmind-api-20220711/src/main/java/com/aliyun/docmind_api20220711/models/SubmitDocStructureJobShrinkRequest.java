// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class SubmitDocStructureJobShrinkRequest extends TeaModel {
    @NameInMap("AllowPptFormat")
    public Boolean allowPptFormat;

    @NameInMap("EnableEventCallback")
    public Boolean enableEventCallback;

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

    @NameInMap("OssBucket")
    public String ossBucket;

    @NameInMap("OssEndpoint")
    public String ossEndpoint;

    @NameInMap("OutputFormat")
    public String outputFormatShrink;

    @NameInMap("PageIndex")
    public String pageIndex;

    @NameInMap("StructureType")
    public String structureType;

    public static SubmitDocStructureJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitDocStructureJobShrinkRequest self = new SubmitDocStructureJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitDocStructureJobShrinkRequest setAllowPptFormat(Boolean allowPptFormat) {
        this.allowPptFormat = allowPptFormat;
        return this;
    }
    public Boolean getAllowPptFormat() {
        return this.allowPptFormat;
    }

    public SubmitDocStructureJobShrinkRequest setEnableEventCallback(Boolean enableEventCallback) {
        this.enableEventCallback = enableEventCallback;
        return this;
    }
    public Boolean getEnableEventCallback() {
        return this.enableEventCallback;
    }

    public SubmitDocStructureJobShrinkRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public SubmitDocStructureJobShrinkRequest setFileNameExtension(String fileNameExtension) {
        this.fileNameExtension = fileNameExtension;
        return this;
    }
    public String getFileNameExtension() {
        return this.fileNameExtension;
    }

    public SubmitDocStructureJobShrinkRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public SubmitDocStructureJobShrinkRequest setFormulaEnhancement(Boolean formulaEnhancement) {
        this.formulaEnhancement = formulaEnhancement;
        return this;
    }
    public Boolean getFormulaEnhancement() {
        return this.formulaEnhancement;
    }

    public SubmitDocStructureJobShrinkRequest setOssBucket(String ossBucket) {
        this.ossBucket = ossBucket;
        return this;
    }
    public String getOssBucket() {
        return this.ossBucket;
    }

    public SubmitDocStructureJobShrinkRequest setOssEndpoint(String ossEndpoint) {
        this.ossEndpoint = ossEndpoint;
        return this;
    }
    public String getOssEndpoint() {
        return this.ossEndpoint;
    }

    public SubmitDocStructureJobShrinkRequest setOutputFormatShrink(String outputFormatShrink) {
        this.outputFormatShrink = outputFormatShrink;
        return this;
    }
    public String getOutputFormatShrink() {
        return this.outputFormatShrink;
    }

    public SubmitDocStructureJobShrinkRequest setPageIndex(String pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public String getPageIndex() {
        return this.pageIndex;
    }

    public SubmitDocStructureJobShrinkRequest setStructureType(String structureType) {
        this.structureType = structureType;
        return this;
    }
    public String getStructureType() {
        return this.structureType;
    }

}
