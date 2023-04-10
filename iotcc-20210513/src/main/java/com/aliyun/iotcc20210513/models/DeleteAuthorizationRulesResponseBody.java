// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class DeleteAuthorizationRulesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAuthorizationRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAuthorizationRulesResponseBody self = new DeleteAuthorizationRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAuthorizationRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
