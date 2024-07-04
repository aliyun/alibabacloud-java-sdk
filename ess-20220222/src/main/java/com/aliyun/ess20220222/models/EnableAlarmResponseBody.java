// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class EnableAlarmResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>688B18B8-FB1E-42EB-A1ED-7F55B090****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnableAlarmResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableAlarmResponseBody self = new EnableAlarmResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableAlarmResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
