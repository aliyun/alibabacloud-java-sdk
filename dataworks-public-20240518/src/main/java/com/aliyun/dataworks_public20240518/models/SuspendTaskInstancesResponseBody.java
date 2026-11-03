// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class SuspendTaskInstancesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request. You can use the ID to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>22C97E95-F023-56B5-8852-B1A77A17****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result information of the batch operation. The structure is a map, where the key is the task instance ID and the value is the result information.</p>
     */
    @NameInMap("SuccessInfo")
    public java.util.Map<String, SuccessInfoValue> successInfo;

    public static SuspendTaskInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SuspendTaskInstancesResponseBody self = new SuspendTaskInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public SuspendTaskInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SuspendTaskInstancesResponseBody setSuccessInfo(java.util.Map<String, SuccessInfoValue> successInfo) {
        this.successInfo = successInfo;
        return this;
    }
    public java.util.Map<String, SuccessInfoValue> getSuccessInfo() {
        return this.successInfo;
    }

}
