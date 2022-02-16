// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class MoveGroupAuthorizationRuleToDNSServiceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static MoveGroupAuthorizationRuleToDNSServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MoveGroupAuthorizationRuleToDNSServiceResponseBody self = new MoveGroupAuthorizationRuleToDNSServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public MoveGroupAuthorizationRuleToDNSServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
