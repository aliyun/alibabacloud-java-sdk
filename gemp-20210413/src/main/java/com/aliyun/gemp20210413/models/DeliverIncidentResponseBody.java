// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DeliverIncidentResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>FD200FAE-E98F-496E-BFE6-4CE61E59A2FS</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeliverIncidentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeliverIncidentResponseBody self = new DeliverIncidentResponseBody();
        return TeaModel.build(map, self);
    }

    public DeliverIncidentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
