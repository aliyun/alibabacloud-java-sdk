// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateDataServiceFolderResponseBody extends TeaModel {
    /**
     * <p>The ID of the created folder.</p>
     */
    @NameInMap("FolderId")
    public Long folderId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDataServiceFolderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDataServiceFolderResponseBody self = new CreateDataServiceFolderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDataServiceFolderResponseBody setFolderId(Long folderId) {
        this.folderId = folderId;
        return this;
    }
    public Long getFolderId() {
        return this.folderId;
    }

    public CreateDataServiceFolderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
