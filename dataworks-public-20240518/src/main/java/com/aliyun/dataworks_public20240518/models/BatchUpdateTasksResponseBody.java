// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class BatchUpdateTasksResponseBody extends TeaModel {
    /**
     * <p>The ID of the request. You can use the ID to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>22C97E95-F023-56B5-8852-B1A77A17XXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result information of the batch operation. The structure is a map, where the key is the task ID and the value is the result information.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;10001&quot;: {&quot;Success&quot;: false, &quot;Message&quot;: &quot;The task does not exist.&quot;}}</p>
     */
    @NameInMap("SuccessInfo")
    public java.util.Map<String, SuccessInfoValue> successInfo;

    public static BatchUpdateTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateTasksResponseBody self = new BatchUpdateTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchUpdateTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchUpdateTasksResponseBody setSuccessInfo(java.util.Map<String, SuccessInfoValue> successInfo) {
        this.successInfo = successInfo;
        return this;
    }
    public java.util.Map<String, SuccessInfoValue> getSuccessInfo() {
        return this.successInfo;
    }

}
