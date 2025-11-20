// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class DeleteValidateFileRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xxxx-xxxx-xxxx-xxxx</p>
     */
    @NameInMap("FileId")
    public String fileId;

    public static DeleteValidateFileRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteValidateFileRequest self = new DeleteValidateFileRequest();
        return TeaModel.build(map, self);
    }

    public DeleteValidateFileRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

}
