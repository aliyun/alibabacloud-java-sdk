// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class CreateNetworkServiceResponseBody extends TeaModel {
    /**
     * <p>Workspace Id。</p>
     * 
     * <strong>example:</strong>
     * <p>w-******</p>
     */
    @NameInMap("operationId")
    public String operationId;

    /**
     * <p>请求ID。</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateNetworkServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkServiceResponseBody self = new CreateNetworkServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNetworkServiceResponseBody setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public CreateNetworkServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
