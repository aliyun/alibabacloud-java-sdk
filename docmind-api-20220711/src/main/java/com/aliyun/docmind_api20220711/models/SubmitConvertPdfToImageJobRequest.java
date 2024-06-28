// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class SubmitConvertPdfToImageJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>convertPdfToImage.pdf</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <strong>example:</strong>
     * <p><a href="https://gw.alipayobjects.com/os/basement_prod/598b9edf-5287-4065-9e36-464305c60698.pdf">https://gw.alipayobjects.com/os/basement_prod/598b9edf-5287-4065-9e36-464305c60698.pdf</a></p>
     */
    @NameInMap("FileUrl")
    public String fileUrl;

    public static SubmitConvertPdfToImageJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitConvertPdfToImageJobRequest self = new SubmitConvertPdfToImageJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitConvertPdfToImageJobRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public SubmitConvertPdfToImageJobRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

}
