// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class StopInstanceAdbResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StopInstanceAdbResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopInstanceAdbResponseBody self = new StopInstanceAdbResponseBody();
        return TeaModel.build(map, self);
    }

    public StopInstanceAdbResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
