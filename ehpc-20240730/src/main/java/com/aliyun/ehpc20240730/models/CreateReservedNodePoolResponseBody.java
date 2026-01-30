// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class CreateReservedNodePoolResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>rnp-cdx****</p>
     */
    @NameInMap("ReservedNodePoolId")
    public String reservedNodePoolId;

    public static CreateReservedNodePoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateReservedNodePoolResponseBody self = new CreateReservedNodePoolResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateReservedNodePoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateReservedNodePoolResponseBody setReservedNodePoolId(String reservedNodePoolId) {
        this.reservedNodePoolId = reservedNodePoolId;
        return this;
    }
    public String getReservedNodePoolId() {
        return this.reservedNodePoolId;
    }

}
