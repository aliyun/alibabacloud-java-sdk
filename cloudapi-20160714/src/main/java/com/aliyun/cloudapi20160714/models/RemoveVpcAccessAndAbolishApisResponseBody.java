// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class RemoveVpcAccessAndAbolishApisResponseBody extends TeaModel {
    @NameInMap("OperationId")
    public String operationId;

    @NameInMap("RequestId")
    public String requestId;

    public static RemoveVpcAccessAndAbolishApisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveVpcAccessAndAbolishApisResponseBody self = new RemoveVpcAccessAndAbolishApisResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveVpcAccessAndAbolishApisResponseBody setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public RemoveVpcAccessAndAbolishApisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
