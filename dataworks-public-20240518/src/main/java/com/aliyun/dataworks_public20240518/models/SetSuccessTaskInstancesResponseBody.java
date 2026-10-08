// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class SetSuccessTaskInstancesResponseBody extends TeaModel {
    /**
     * <p>The request ID. You can locate logs and troubleshoot issues based on the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>22C97E95-F023-56B5-8852-B1A77A17XXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the batch operation, which is in the MAP structure. The instance ID serves as a key, and the result serves as a value.</p>
     */
    @NameInMap("SuccessInfo")
    public java.util.Map<String, SuccessInfoValue> successInfo;

    public static SetSuccessTaskInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetSuccessTaskInstancesResponseBody self = new SetSuccessTaskInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public SetSuccessTaskInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetSuccessTaskInstancesResponseBody setSuccessInfo(java.util.Map<String, SuccessInfoValue> successInfo) {
        this.successInfo = successInfo;
        return this;
    }
    public java.util.Map<String, SuccessInfoValue> getSuccessInfo() {
        return this.successInfo;
    }

}
