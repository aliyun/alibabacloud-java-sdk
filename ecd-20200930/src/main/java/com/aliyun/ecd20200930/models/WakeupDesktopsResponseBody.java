// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class WakeupDesktopsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6557DBA9-CF3E-5C1B-B1F1-68FDA599****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static WakeupDesktopsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        WakeupDesktopsResponseBody self = new WakeupDesktopsResponseBody();
        return TeaModel.build(map, self);
    }

    public WakeupDesktopsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
