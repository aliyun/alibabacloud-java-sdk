// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteBackendModelResponseBody extends TeaModel {
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
     * <p>D1B18FFE-4A81-59D8-AA02-1817098977CD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteBackendModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteBackendModelResponseBody self = new DeleteBackendModelResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteBackendModelResponseBody setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public DeleteBackendModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
