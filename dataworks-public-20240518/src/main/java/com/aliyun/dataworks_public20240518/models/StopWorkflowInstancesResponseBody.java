// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class StopWorkflowInstancesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request. You can use this ID to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>22C97E95-F023-56B5-8852-B1A77A17****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result information of the batch operation. The structure is a map, where the key is the workflow instance ID and the value is the result information.</p>
     */
    @NameInMap("SuccessInfo")
    public java.util.Map<String, SuccessInfoValue> successInfo;

    public static StopWorkflowInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopWorkflowInstancesResponseBody self = new StopWorkflowInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public StopWorkflowInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopWorkflowInstancesResponseBody setSuccessInfo(java.util.Map<String, SuccessInfoValue> successInfo) {
        this.successInfo = successInfo;
        return this;
    }
    public java.util.Map<String, SuccessInfoValue> getSuccessInfo() {
        return this.successInfo;
    }

}
