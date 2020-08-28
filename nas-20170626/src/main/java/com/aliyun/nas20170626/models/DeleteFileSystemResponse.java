// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DeleteFileSystemResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteFileSystemResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFileSystemResponse self = new DeleteFileSystemResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFileSystemResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
