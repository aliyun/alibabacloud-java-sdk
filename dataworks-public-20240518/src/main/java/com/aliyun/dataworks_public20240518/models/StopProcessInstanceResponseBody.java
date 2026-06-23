// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class StopProcessInstanceResponseBody extends TeaModel {
    /**
     * <p>The request ID. Use this ID to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>0bc5df3a17****903790e8e8a</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StopProcessInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopProcessInstanceResponseBody self = new StopProcessInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public StopProcessInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
