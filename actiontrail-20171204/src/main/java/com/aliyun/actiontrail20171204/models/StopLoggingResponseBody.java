// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20171204.models;

import com.aliyun.tea.*;

public class StopLoggingResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StopLoggingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopLoggingResponseBody self = new StopLoggingResponseBody();
        return TeaModel.build(map, self);
    }

    public StopLoggingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
