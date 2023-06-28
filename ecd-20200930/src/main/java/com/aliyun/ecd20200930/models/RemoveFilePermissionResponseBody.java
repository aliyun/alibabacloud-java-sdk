// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RemoveFilePermissionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveFilePermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveFilePermissionResponseBody self = new RemoveFilePermissionResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveFilePermissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
