// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateServiceRolloutResponseBody extends TeaModel {
    /**
     * <p>The response message. Describes the request processing result. Valid values:</p>
     * <ul>
     * <li>&quot;Rollout updated successfully&quot;: The policy is updated successfully.</li>
     * <li>&quot;Rollout paused successfully&quot;: The rollout is paused successfully.</li>
     * <li>&quot;Rollout resumed successfully&quot;: The rollout is resumed successfully.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Rollout updated successfully</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID. The unique identifier returned for each request, used for troubleshooting and tracking.</p>
     * 
     * <strong>example:</strong>
     * <p>40325405-579C-4D82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateServiceRolloutResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceRolloutResponseBody self = new UpdateServiceRolloutResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateServiceRolloutResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateServiceRolloutResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
