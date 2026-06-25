// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateServiceRolloutResponseBody extends TeaModel {
    /**
     * <p>A message that indicates the result of the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>Rollout created successfully</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique request ID. Use this ID for troubleshooting and traceability.</p>
     * 
     * <strong>example:</strong>
     * <p>40325405-579C-4D82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateServiceRolloutResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceRolloutResponseBody self = new CreateServiceRolloutResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateServiceRolloutResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateServiceRolloutResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
