// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class SubmitConvertPdfToMarkdownJobRequest extends TeaModel {
    @NameInMap("FileName")
    public String fileName;

    @NameInMap("FileUrl")
    public String fileUrl;

    public static SubmitConvertPdfToMarkdownJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitConvertPdfToMarkdownJobRequest self = new SubmitConvertPdfToMarkdownJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitConvertPdfToMarkdownJobRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public SubmitConvertPdfToMarkdownJobRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

}
