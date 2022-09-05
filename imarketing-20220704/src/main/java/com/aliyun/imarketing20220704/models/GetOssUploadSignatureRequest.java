// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class GetOssUploadSignatureRequest extends TeaModel {
    @NameInMap("FileName")
    public String fileName;

    @NameInMap("FileType")
    public String fileType;

    public static GetOssUploadSignatureRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOssUploadSignatureRequest self = new GetOssUploadSignatureRequest();
        return TeaModel.build(map, self);
    }

    public GetOssUploadSignatureRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public GetOssUploadSignatureRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

}
