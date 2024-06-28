// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class SubmitConvertPdfToWordJobRequest extends TeaModel {
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
    public String fileUrl;

    @NameInMap("ForceExportInnerImage")
    public Boolean forceExportInnerImage;

    public static SubmitConvertPdfToWordJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitConvertPdfToWordJobRequest self = new SubmitConvertPdfToWordJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitConvertPdfToWordJobRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public SubmitConvertPdfToWordJobRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public SubmitConvertPdfToWordJobRequest setForceExportInnerImage(Boolean forceExportInnerImage) {
        this.forceExportInnerImage = forceExportInnerImage;
        return this;
    }
    public Boolean getForceExportInnerImage() {
        return this.forceExportInnerImage;
    }

}
