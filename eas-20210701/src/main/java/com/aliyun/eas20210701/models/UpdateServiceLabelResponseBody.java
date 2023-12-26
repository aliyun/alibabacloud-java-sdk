// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateServiceLabelResponseBody extends TeaModel {
    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateServiceLabelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceLabelResponseBody self = new UpdateServiceLabelResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateServiceLabelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateServiceLabelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
