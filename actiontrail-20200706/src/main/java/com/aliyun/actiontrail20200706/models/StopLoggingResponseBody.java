// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class StopLoggingResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1C488B66-B819-4D14-8711-C4EAAA13AC01</p>
     */
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
