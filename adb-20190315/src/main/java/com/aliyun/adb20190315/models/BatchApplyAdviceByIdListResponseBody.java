// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class BatchApplyAdviceByIdListResponseBody extends TeaModel {
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
     * <p>86F92D26-B774-5FA1-8E53-82CBEEEBB012</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BatchApplyAdviceByIdListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchApplyAdviceByIdListResponseBody self = new BatchApplyAdviceByIdListResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchApplyAdviceByIdListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchApplyAdviceByIdListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
