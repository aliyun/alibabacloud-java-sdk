// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class UpdateApplicationConfigsResponseBody extends TeaModel {
    /**
     * <p>操作ID。</p>
     */
    @NameInMap("OperationId")
    public String operationId;

    /**
     * <p>请求ID。</p>
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
