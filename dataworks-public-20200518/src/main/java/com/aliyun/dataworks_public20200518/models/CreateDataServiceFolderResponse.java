// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateDataServiceFolderResponse extends TeaModel {
    @NameInMap("FolderId")
    @Validation(required = true)
    public Long folderId;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CreateDataServiceFolderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataServiceFolderResponse self = new CreateDataServiceFolderResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataServiceFolderResponse setFolderId(Long folderId) {
        this.folderId = folderId;
        return this;
    }
    public Long getFolderId() {
        return this.folderId;
    }

    public CreateDataServiceFolderResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
