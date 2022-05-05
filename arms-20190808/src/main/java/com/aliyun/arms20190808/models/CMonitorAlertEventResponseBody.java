// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CMonitorAlertEventResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static CMonitorAlertEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CMonitorAlertEventResponseBody self = new CMonitorAlertEventResponseBody();
        return TeaModel.build(map, self);
    }

    public CMonitorAlertEventResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CMonitorAlertEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
