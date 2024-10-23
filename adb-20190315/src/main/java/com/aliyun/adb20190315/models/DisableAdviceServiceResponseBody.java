// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DisableAdviceServiceResponseBody extends TeaModel {
    /**
     * <p>The message returned for the operation. Valid values:</p>
     * <ul>
     * <li><strong>Success</strong> is returned if the operation is successful.</li>
     * <li>An error message is returned if the operation fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
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
