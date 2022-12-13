// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class SetDesktopGroupScaleTimerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetDesktopGroupScaleTimerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetDesktopGroupScaleTimerResponseBody self = new SetDesktopGroupScaleTimerResponseBody();
        return TeaModel.build(map, self);
    }

    public SetDesktopGroupScaleTimerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
