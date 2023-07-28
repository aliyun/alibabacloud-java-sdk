// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class KillProcessResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static KillProcessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        KillProcessResponseBody self = new KillProcessResponseBody();
        return TeaModel.build(map, self);
    }

    public KillProcessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
