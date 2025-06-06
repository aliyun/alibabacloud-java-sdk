// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteEnterpriseAccelerateTargetResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>655CE28F-2C0C-5801-A31E-C16BF54BD225</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteEnterpriseAccelerateTargetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEnterpriseAccelerateTargetResponseBody self = new DeleteEnterpriseAccelerateTargetResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEnterpriseAccelerateTargetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
