// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class PushMonitorResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("data")
    public Object data;

    /**
     * <strong>example:</strong>
     * <p>5A30D240-1821-0246-B580-AB1468657AD2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static PushMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PushMonitorResponseBody self = new PushMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public PushMonitorResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public PushMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
