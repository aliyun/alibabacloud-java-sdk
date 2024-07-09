// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class SetDesktopGroupTimerStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>AC7912E7-8BDF-547F-BCAC****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetDesktopGroupTimerStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetDesktopGroupTimerStatusResponseBody self = new SetDesktopGroupTimerStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public SetDesktopGroupTimerStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
