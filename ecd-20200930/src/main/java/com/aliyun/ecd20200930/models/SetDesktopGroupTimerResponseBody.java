// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class SetDesktopGroupTimerResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>388CF76E-FFB3-5174-9F91-CDD****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetDesktopGroupTimerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetDesktopGroupTimerResponseBody self = new SetDesktopGroupTimerResponseBody();
        return TeaModel.build(map, self);
    }

    public SetDesktopGroupTimerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
