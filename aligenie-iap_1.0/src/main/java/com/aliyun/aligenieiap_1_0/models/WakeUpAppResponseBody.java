// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class WakeUpAppResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static WakeUpAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        WakeUpAppResponseBody self = new WakeUpAppResponseBody();
        return TeaModel.build(map, self);
    }

    public WakeUpAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
