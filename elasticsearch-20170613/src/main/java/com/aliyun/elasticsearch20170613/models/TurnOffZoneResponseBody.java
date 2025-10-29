// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class TurnOffZoneResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>F99407AB-2FA9-489E-A259-40CF6DCC47D9</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static TurnOffZoneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TurnOffZoneResponseBody self = new TurnOffZoneResponseBody();
        return TeaModel.build(map, self);
    }

    public TurnOffZoneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
