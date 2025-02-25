// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateResourceInstanceLabelResponseBody extends TeaModel {
    /**
     * <p>The message.</p>
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
     * <p>40325405-579C-4D82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateResourceInstanceLabelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceInstanceLabelResponseBody self = new UpdateResourceInstanceLabelResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateResourceInstanceLabelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateResourceInstanceLabelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
