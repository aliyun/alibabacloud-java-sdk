// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ApplyAdviceByIdResponseBody extends TeaModel {
    /**
     * <p>The message returned for the operation. Valid values:</p>
     * <ul>
     * <li><strong>SUCCESS</strong> is returned if the operation is successful.</li>
     * <li>An error message is returned if the operation fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5DC10091-348D-12B1-906D-AB49D658012E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ApplyAdviceByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyAdviceByIdResponseBody self = new ApplyAdviceByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyAdviceByIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ApplyAdviceByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
