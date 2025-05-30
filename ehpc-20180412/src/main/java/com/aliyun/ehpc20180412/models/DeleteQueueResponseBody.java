// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DeleteQueueResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>464E9919-D04F-4D1D-B375-15989492****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteQueueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteQueueResponseBody self = new DeleteQueueResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteQueueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
