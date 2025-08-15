// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class StartLoggingResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>145318BE-DEE1-4C57-AA7C-5BE7D34A6AE0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StartLoggingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartLoggingResponseBody self = new StartLoggingResponseBody();
        return TeaModel.build(map, self);
    }

    public StartLoggingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
