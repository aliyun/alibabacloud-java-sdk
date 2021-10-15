// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class InitializeOperationRoleResponseBody extends TeaModel {
    @NameInMap("Result")
    public Boolean result;

    @NameInMap("RequestId")
    public String requestId;

    public static InitializeOperationRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InitializeOperationRoleResponseBody self = new InitializeOperationRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public InitializeOperationRoleResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public InitializeOperationRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
