// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class GenerateUploadFilePolicyRequest extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("FileType")
    public String fileType;

    public static GenerateUploadFilePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateUploadFilePolicyRequest self = new GenerateUploadFilePolicyRequest();
        return TeaModel.build(map, self);
    }

    public GenerateUploadFilePolicyRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public GenerateUploadFilePolicyRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public GenerateUploadFilePolicyRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

}
