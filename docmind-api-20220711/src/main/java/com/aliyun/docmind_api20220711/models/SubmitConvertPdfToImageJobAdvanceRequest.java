// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class SubmitConvertPdfToImageJobAdvanceRequest extends TeaModel {
    @NameInMap("FileName")
    public String fileName;

    @NameInMap("FileUrl")
    public java.io.InputStream fileUrlObject;

    public static SubmitConvertPdfToImageJobAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitConvertPdfToImageJobAdvanceRequest self = new SubmitConvertPdfToImageJobAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public SubmitConvertPdfToImageJobAdvanceRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public SubmitConvertPdfToImageJobAdvanceRequest setFileUrlObject(java.io.InputStream fileUrlObject) {
        this.fileUrlObject = fileUrlObject;
        return this;
    }
    public java.io.InputStream getFileUrlObject() {
        return this.fileUrlObject;
    }

}
