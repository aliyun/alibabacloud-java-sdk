// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DisableAlarmResponseBody extends TeaModel {
    /**
     * <p>auditing</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DisableAlarmResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableAlarmResponseBody self = new DisableAlarmResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableAlarmResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
