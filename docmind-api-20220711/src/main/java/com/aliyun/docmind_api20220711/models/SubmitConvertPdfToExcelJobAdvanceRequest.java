// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class SubmitConvertPdfToExcelJobAdvanceRequest extends TeaModel {
    @NameInMap("FileName")
    public String fileName;

    @NameInMap("FileUrl")
    public java.io.InputStream fileUrlObject;

    @NameInMap("ForceExportInnerImage")
    public Boolean forceExportInnerImage;

    @NameInMap("ForceMergeExcel")
    public Boolean forceMergeExcel;

    public static SubmitConvertPdfToExcelJobAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitConvertPdfToExcelJobAdvanceRequest self = new SubmitConvertPdfToExcelJobAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public SubmitConvertPdfToExcelJobAdvanceRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public SubmitConvertPdfToExcelJobAdvanceRequest setFileUrlObject(java.io.InputStream fileUrlObject) {
        this.fileUrlObject = fileUrlObject;
        return this;
    }
    public java.io.InputStream getFileUrlObject() {
        return this.fileUrlObject;
    }

    public SubmitConvertPdfToExcelJobAdvanceRequest setForceExportInnerImage(Boolean forceExportInnerImage) {
        this.forceExportInnerImage = forceExportInnerImage;
        return this;
    }
    public Boolean getForceExportInnerImage() {
        return this.forceExportInnerImage;
    }

    public SubmitConvertPdfToExcelJobAdvanceRequest setForceMergeExcel(Boolean forceMergeExcel) {
        this.forceMergeExcel = forceMergeExcel;
        return this;
    }
    public Boolean getForceMergeExcel() {
        return this.forceMergeExcel;
    }

}
