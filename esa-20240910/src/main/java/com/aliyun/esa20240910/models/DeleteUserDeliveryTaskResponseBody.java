// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteUserDeliveryTaskResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>952ea16b-1f05-4a76-bb32-420282d8aeb9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteUserDeliveryTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserDeliveryTaskResponseBody self = new DeleteUserDeliveryTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteUserDeliveryTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
