// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class RespondIncidentResponseBody extends TeaModel {
    // requestId
    @NameInMap("requestId")
    public String requestId;

    public static RespondIncidentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RespondIncidentResponseBody self = new RespondIncidentResponseBody();
        return TeaModel.build(map, self);
    }

    public RespondIncidentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
