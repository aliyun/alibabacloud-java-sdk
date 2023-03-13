// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class SubmitConvertPdfToWordJobAdvanceRequest extends TeaModel {
    @NameInMap("FileName")
    public String fileName;

    @NameInMap("FileUrl")
    public java.io.InputStream fileUrlObject;

    @NameInMap("ForceExportInnerImage")
    public Boolean forceExportInnerImage;

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

}
