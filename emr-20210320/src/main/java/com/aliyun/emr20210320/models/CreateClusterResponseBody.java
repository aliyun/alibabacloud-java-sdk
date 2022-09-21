// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class CreateClusterResponseBody extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("OperationId")
    public String operationId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterResponseBody self = new CreateClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateClusterResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateClusterResponseBody setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public CreateClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
