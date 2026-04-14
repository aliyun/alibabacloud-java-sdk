// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class GetValidateFileRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xxxx-xxxx-xxxx-xxxx</p>
     */
    @NameInMap("FileId")
    public String fileId;

    public static GetValidateFileRequest build(java.util.Map<String, ?> map) throws Exception {
        GetValidateFileRequest self = new GetValidateFileRequest();
        return TeaModel.build(map, self);
    }

    public GetValidateFileRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

}
