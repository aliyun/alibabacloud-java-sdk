// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteServiceRolloutResponseBody extends TeaModel {
    /**
     * <p><strong>Message</strong>  </p>
     * <ul>
     * <li>Type: <code>string</code>  </li>
     * <li>Description: The returned message. Describes the request processing result.  </li>
     * <li>Example: <code>Rollout deleted successfully</code></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Rollout deleted successfully</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p><strong>RequestId</strong>  </p>
     * <ul>
     * <li>Type: <code>string</code>  </li>
     * <li>Description: The request ID. The unique identifier returned for each request, used for troubleshooting and tracking.  </li>
     * <li>Example: <code>40325405-579C-4D82-9B4F-8A7C6D5E4F3A</code></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>40325405-579C-4D82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteServiceRolloutResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceRolloutResponseBody self = new DeleteServiceRolloutResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteServiceRolloutResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteServiceRolloutResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
