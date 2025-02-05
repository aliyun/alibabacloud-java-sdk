// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteResourceInstanceLabelResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>40325405-579C-4D82********</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteResourceInstanceLabelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceInstanceLabelResponseBody self = new DeleteResourceInstanceLabelResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteResourceInstanceLabelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteResourceInstanceLabelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
