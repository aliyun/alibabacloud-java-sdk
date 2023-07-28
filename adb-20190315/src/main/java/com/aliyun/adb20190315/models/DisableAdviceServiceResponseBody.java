// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DisableAdviceServiceResponseBody extends TeaModel {
    /**
     * <p>The message returned for the operation. Valid values:</p>
     * <br>
     * <p>*   **Success** is returned if the operation is successful.</p>
     * <p>*   An error message is returned if the operation fails.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
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
