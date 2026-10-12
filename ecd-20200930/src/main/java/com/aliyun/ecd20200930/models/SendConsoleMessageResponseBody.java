// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class SendConsoleMessageResponseBody extends TeaModel {
    /**
     * <p>The ID of the request. You can use the ID to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>9F1D7E42-06A8-4B50-9A21-6E0C8D3F5B72</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is accepted. A value of true indicates success, and a value of false indicates failure. For asynchronous pushes, a successful acceptance does not mean that all targets have received the message.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SendConsoleMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendConsoleMessageResponseBody self = new SendConsoleMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public SendConsoleMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendConsoleMessageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
