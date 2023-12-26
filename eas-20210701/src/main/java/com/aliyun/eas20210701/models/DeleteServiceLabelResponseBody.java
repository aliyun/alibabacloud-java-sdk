// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteServiceLabelResponseBody extends TeaModel {
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

    public static DeleteServiceLabelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceLabelResponseBody self = new DeleteServiceLabelResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteServiceLabelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteServiceLabelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
