// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class StartWorkflowInstancesResponseBody extends TeaModel {
    /**
     * <p>The request ID, which is used to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>22C97E95-F023-56B5-8852-B1A77A17****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result information of the batch operation. The structure is a map in which the key is the workflow instance ID and the value is the result information.</p>
     */
    @NameInMap("SuccessInfo")
    public java.util.Map<String, SuccessInfoValue> successInfo;

    public static StartWorkflowInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartWorkflowInstancesResponseBody self = new StartWorkflowInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public StartWorkflowInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartWorkflowInstancesResponseBody setSuccessInfo(java.util.Map<String, SuccessInfoValue> successInfo) {
        this.successInfo = successInfo;
        return this;
    }
    public java.util.Map<String, SuccessInfoValue> getSuccessInfo() {
        return this.successInfo;
    }

}
