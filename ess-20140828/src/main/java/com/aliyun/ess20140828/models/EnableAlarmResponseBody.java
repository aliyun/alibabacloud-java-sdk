// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class EnableAlarmResponseBody extends TeaModel {
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
