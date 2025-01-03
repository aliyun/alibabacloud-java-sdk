// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class DeleteFileSystemResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>55C5FFD6-BF99-41BD-9C66-FFF39189****</p>
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
