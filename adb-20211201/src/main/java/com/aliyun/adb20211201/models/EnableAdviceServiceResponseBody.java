// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class EnableAdviceServiceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>E1745C03-7CCE-55CF-932E-08121AAFA6AF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnableAdviceServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableAdviceServiceResponseBody self = new EnableAdviceServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableAdviceServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
