// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class BatchAbolishApisResponseBody extends TeaModel {
    /**
     * <p>The ID of the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>f7834d74be4e41aa8e607b0fafae9b33</p>
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

    public static BatchAbolishApisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchAbolishApisResponseBody self = new BatchAbolishApisResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchAbolishApisResponseBody setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public BatchAbolishApisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
