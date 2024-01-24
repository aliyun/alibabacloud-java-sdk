// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DeleteFilesetResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteFilesetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFilesetResponseBody self = new DeleteFilesetResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFilesetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
