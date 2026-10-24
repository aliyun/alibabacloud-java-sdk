// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csasedr20241122.models;

import com.aliyun.tea.*;

public class OperateTargetConfigResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E34B1849-64AA-5F2D-85A1-77F3B8E6BC90</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OperateTargetConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OperateTargetConfigResponseBody self = new OperateTargetConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public OperateTargetConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
