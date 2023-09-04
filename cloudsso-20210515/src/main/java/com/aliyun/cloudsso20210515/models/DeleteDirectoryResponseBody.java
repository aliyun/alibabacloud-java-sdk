// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class DeleteDirectoryResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDirectoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDirectoryResponseBody self = new DeleteDirectoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDirectoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
