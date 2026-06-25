// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteServiceRolloutResponseBody extends TeaModel {
    /**
     * <p>A message indicating the result of the request.</p>
     * <ul>
     * <li><p>Type: <code>string</code></p>
     * </li>
     * <li><p>Description: The message that describes the result of the request.</p>
     * </li>
     * <li><p>Example value: <code>Rollout deleted successfully</code></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Rollout deleted successfully</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique ID of the request. Use this ID for troubleshooting.</p>
     * <ul>
     * <li><p>Type: <code>string</code></p>
     * </li>
     * <li><p>Description: The unique identifier for the request. Use this ID to troubleshoot and track issues.</p>
     * </li>
     * <li><p>Example: <code>40325405-579C-4D82-9B4F-8A7C6D5E4F3A</code></p>
     * </li>
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
