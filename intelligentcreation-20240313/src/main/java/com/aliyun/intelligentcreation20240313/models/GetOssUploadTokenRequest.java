// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class GetOssUploadTokenRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("fileName")
    public String fileName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("fileType")
    public String fileType;

    public static GetOssUploadTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOssUploadTokenRequest self = new GetOssUploadTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetOssUploadTokenRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public GetOssUploadTokenRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

}
