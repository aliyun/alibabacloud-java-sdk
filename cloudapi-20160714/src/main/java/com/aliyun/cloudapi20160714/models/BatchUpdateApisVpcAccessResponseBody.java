// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class BatchUpdateApisVpcAccessResponseBody extends TeaModel {
    @NameInMap("OperationId")
    public String operationId;

    @NameInMap("RequestId")
    public String requestId;

    public static BatchUpdateApisVpcAccessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateApisVpcAccessResponseBody self = new BatchUpdateApisVpcAccessResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchUpdateApisVpcAccessResponseBody setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public BatchUpdateApisVpcAccessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
