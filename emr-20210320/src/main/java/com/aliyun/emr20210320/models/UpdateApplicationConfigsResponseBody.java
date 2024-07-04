// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class UpdateApplicationConfigsResponseBody extends TeaModel {
    /**
     * <p>The operation ID.</p>
     * 
     * <strong>example:</strong>
     * <p>op-13c37a77c505****</p>
     */
    @NameInMap("OperationId")
    public String operationId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9E3A7161-EB7B-172B-8D18-FFB06BA3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateApplicationConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationConfigsResponseBody self = new UpdateApplicationConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationConfigsResponseBody setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public UpdateApplicationConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
