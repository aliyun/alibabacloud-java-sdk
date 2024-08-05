// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class BatchDeployApisResponseBody extends TeaModel {
    /**
     * <p>The ID of the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>2a322599-8e38-428a-a306-9b21ea2129bf</p>
     */
    @NameInMap("OperationId")
    public String operationId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E7FE7172-AA75-5880-B6F7-C00893E9BC06</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BatchDeployApisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchDeployApisResponseBody self = new BatchDeployApisResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchDeployApisResponseBody setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public BatchDeployApisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
