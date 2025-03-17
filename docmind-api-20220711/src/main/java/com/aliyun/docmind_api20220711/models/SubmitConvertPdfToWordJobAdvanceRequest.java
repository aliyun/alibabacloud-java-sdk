// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class SubmitConvertPdfToWordJobAdvanceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>covertPdfToWord.pdf</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <strong>example:</strong>
     * <p><a href="https://gw.alipayobjects.com/os/basement_prod/598b9edf-5287-4065-9e36-464305c60698.pdf">https://gw.alipayobjects.com/os/basement_prod/598b9edf-5287-4065-9e36-464305c60698.pdf</a></p>
     */
    @NameInMap("FileUrl")
    public java.io.InputStream fileUrlObject;

    @NameInMap("ForceExportInnerImage")
    public Boolean forceExportInnerImage;

    @NameInMap("FormulaEnhancement")
    public Boolean formulaEnhancement;

    @NameInMap("Option")
    public String option;

    @NameInMap("OssBucket")
    public String ossBucket;

    @NameInMap("OssEndpoint")
    public String ossEndpoint;

    public static SubmitConvertPdfToWordJobAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitConvertPdfToWordJobAdvanceRequest self = new SubmitConvertPdfToWordJobAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public SubmitConvertPdfToWordJobAdvanceRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public SubmitConvertPdfToWordJobAdvanceRequest setFileUrlObject(java.io.InputStream fileUrlObject) {
        this.fileUrlObject = fileUrlObject;
        return this;
    }
    public java.io.InputStream getFileUrlObject() {
        return this.fileUrlObject;
    }

    public SubmitConvertPdfToWordJobAdvanceRequest setForceExportInnerImage(Boolean forceExportInnerImage) {
        this.forceExportInnerImage = forceExportInnerImage;
        return this;
    }
    public Boolean getForceExportInnerImage() {
        return this.forceExportInnerImage;
    }

    public SubmitConvertPdfToWordJobAdvanceRequest setFormulaEnhancement(Boolean formulaEnhancement) {
        this.formulaEnhancement = formulaEnhancement;
        return this;
    }
    public Boolean getFormulaEnhancement() {
        return this.formulaEnhancement;
    }

    public SubmitConvertPdfToWordJobAdvanceRequest setOption(String option) {
        this.option = option;
        return this;
    }
    public String getOption() {
        return this.option;
    }

    public SubmitConvertPdfToWordJobAdvanceRequest setOssBucket(String ossBucket) {
        this.ossBucket = ossBucket;
        return this;
    }
    public String getOssBucket() {
        return this.ossBucket;
    }

    public SubmitConvertPdfToWordJobAdvanceRequest setOssEndpoint(String ossEndpoint) {
        this.ossEndpoint = ossEndpoint;
        return this;
    }
    public String getOssEndpoint() {
        return this.ossEndpoint;
    }

}
