// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateServiceRolloutResponseBody extends TeaModel {
    /**
     * <p>A message that indicates the result of the request. Possible values include:</p>
     * <ul>
     * <li><p>&quot;Rollout updated successfully&quot;</p>
     * </li>
     * <li><p>&quot;Rollout paused successfully&quot;</p>
     * </li>
     * <li><p>&quot;Rollout resumed successfully&quot;</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Rollout updated successfully</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>A unique identifier for the request. You can use this request ID for troubleshooting and tracking.</p>
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
