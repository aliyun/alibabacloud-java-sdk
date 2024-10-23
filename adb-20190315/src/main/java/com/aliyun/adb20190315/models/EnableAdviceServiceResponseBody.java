// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class EnableAdviceServiceResponseBody extends TeaModel {
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
     * <p>E1745C03-7CCE-55CF-932E-08121AAFA6AF</p>
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
