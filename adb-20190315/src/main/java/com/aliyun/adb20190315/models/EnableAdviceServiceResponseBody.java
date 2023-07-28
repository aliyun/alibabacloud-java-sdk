// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class EnableAdviceServiceResponseBody extends TeaModel {
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

    public static EnableAdviceServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableAdviceServiceResponseBody self = new EnableAdviceServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableAdviceServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EnableAdviceServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
