// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AcceptInquiredSystemEventResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AcceptInquiredSystemEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AcceptInquiredSystemEventResponseBody self = new AcceptInquiredSystemEventResponseBody();
        return TeaModel.build(map, self);
    }

    public AcceptInquiredSystemEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
