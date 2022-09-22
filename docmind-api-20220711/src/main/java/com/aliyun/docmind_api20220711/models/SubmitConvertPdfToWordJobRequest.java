// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class SubmitConvertPdfToWordJobRequest extends TeaModel {
    @NameInMap("FileName")
    public String fileName;

    @NameInMap("FileUrl")
    public String fileUrl;

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

}
