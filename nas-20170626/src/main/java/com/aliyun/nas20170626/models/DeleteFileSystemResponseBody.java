// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DeleteFileSystemResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteFileSystemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFileSystemResponseBody self = new DeleteFileSystemResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFileSystemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
