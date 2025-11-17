// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class StartInstanceAdbResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>69BCBBE4-FCF2-59B8-AD9D-531EB422****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StartInstanceAdbResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartInstanceAdbResponseBody self = new StartInstanceAdbResponseBody();
        return TeaModel.build(map, self);
    }

    public StartInstanceAdbResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
