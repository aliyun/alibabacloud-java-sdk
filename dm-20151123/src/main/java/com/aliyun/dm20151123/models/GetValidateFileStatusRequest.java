// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class GetValidateFileStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx-xxxx-xxxx-xxxx</p>
     */
    @NameInMap("FileId")
    public String fileId;

    public static GetValidateFileStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetValidateFileStatusRequest self = new GetValidateFileStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetValidateFileStatusRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

}
