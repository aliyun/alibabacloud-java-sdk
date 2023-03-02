// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class FinishIncidentResponseBody extends TeaModel {
    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static FinishIncidentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FinishIncidentResponseBody self = new FinishIncidentResponseBody();
        return TeaModel.build(map, self);
    }

    public FinishIncidentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
