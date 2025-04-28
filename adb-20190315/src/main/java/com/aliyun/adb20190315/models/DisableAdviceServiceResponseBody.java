// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DisableAdviceServiceResponseBody extends TeaModel {
    /**
     * <p>The returned message. Valid values:</p>
     * <ul>
     * <li>If the request was successful, a <strong>success</strong> message is returned.</li>
     * <li>If the request failed, an error message is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>57EC6CCA-A582-572C-A33D-F61845CBC03C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DisableAdviceServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableAdviceServiceResponseBody self = new DisableAdviceServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableAdviceServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DisableAdviceServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
