// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class CreateFolderResponseBody extends TeaModel {
    @NameInMap("FolderId")
    public Long folderId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateFolderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFolderResponseBody self = new CreateFolderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFolderResponseBody setFolderId(Long folderId) {
        this.folderId = folderId;
        return this;
    }
    public Long getFolderId() {
        return this.folderId;
    }

    public CreateFolderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
