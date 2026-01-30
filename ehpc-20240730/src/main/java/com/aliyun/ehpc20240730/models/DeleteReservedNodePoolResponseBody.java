// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class DeleteReservedNodePoolResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteReservedNodePoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteReservedNodePoolResponseBody self = new DeleteReservedNodePoolResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteReservedNodePoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
