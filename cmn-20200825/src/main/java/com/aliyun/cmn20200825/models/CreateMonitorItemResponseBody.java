// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateMonitorItemResponseBody extends TeaModel {
    // 监控项ID
    @NameInMap("MonitorItemId")
    public String monitorItemId;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static CreateMonitorItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitorItemResponseBody self = new CreateMonitorItemResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMonitorItemResponseBody setMonitorItemId(String monitorItemId) {
        this.monitorItemId = monitorItemId;
        return this;
    }
    public String getMonitorItemId() {
        return this.monitorItemId;
    }

    public CreateMonitorItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
