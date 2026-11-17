// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class StopTaskInstancesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request. You can use this ID to query logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>22C97E95-F023-56B5-8852-B1A77A17****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result information of the batch operation. The structure is a map with the task instance ID as the key and the result information as the value.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;10001&quot;: {&quot;Success&quot;: false, &quot;Message&quot;: &quot;The instance does not exist.&quot;}}</p>
     */
    @NameInMap("SuccessInfo")
    public java.util.Map<String, SuccessInfoValue> successInfo;

    public static StopTaskInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopTaskInstancesResponseBody self = new StopTaskInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public StopTaskInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopTaskInstancesResponseBody setSuccessInfo(java.util.Map<String, SuccessInfoValue> successInfo) {
        this.successInfo = successInfo;
        return this;
    }
    public java.util.Map<String, SuccessInfoValue> getSuccessInfo() {
        return this.successInfo;
    }

}
