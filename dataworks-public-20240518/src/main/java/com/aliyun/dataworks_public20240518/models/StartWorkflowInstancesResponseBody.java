// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class StartWorkflowInstancesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>22C97E95-F023-56B5-8852-B1A77A17****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the batch operation, which is in the MAP structure. The workflow instance ID serves as a key, and the result serves as a value.</p>
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
