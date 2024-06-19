// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DeleteContainerGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>45D5B0AD-3B00-4A9B-9911-6D5303B06712</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteContainerGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteContainerGroupResponseBody self = new DeleteContainerGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteContainerGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
