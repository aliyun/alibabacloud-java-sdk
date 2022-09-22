// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class SubmitTableUnderstandingJobRequest extends TeaModel {
    @NameInMap("FileName")
    public String fileName;

    @NameInMap("FileNameExtension")
    public String fileNameExtension;

    @NameInMap("FileUrl")
    public String fileUrl;

    public static SubmitTableUnderstandingJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitTableUnderstandingJobRequest self = new SubmitTableUnderstandingJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitTableUnderstandingJobRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public SubmitTableUnderstandingJobRequest setFileNameExtension(String fileNameExtension) {
        this.fileNameExtension = fileNameExtension;
        return this;
    }
    public String getFileNameExtension() {
        return this.fileNameExtension;
    }

    public SubmitTableUnderstandingJobRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

}
