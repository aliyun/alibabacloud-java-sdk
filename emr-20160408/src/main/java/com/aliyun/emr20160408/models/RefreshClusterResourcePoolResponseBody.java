// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class RefreshClusterResourcePoolResponseBody extends TeaModel {
    @NameInMap("WorkFlowInstanceId")
    public String workFlowInstanceId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OperationId")
    public String operationId;

    public static RefreshClusterResourcePoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshClusterResourcePoolResponseBody self = new RefreshClusterResourcePoolResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshClusterResourcePoolResponseBody setWorkFlowInstanceId(String workFlowInstanceId) {
        this.workFlowInstanceId = workFlowInstanceId;
        return this;
    }
    public String getWorkFlowInstanceId() {
        return this.workFlowInstanceId;
    }

    public RefreshClusterResourcePoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RefreshClusterResourcePoolResponseBody setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

}
