// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class MoveAuthorizationRuleToDNSServiceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static MoveAuthorizationRuleToDNSServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MoveAuthorizationRuleToDNSServiceResponseBody self = new MoveAuthorizationRuleToDNSServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public MoveAuthorizationRuleToDNSServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
