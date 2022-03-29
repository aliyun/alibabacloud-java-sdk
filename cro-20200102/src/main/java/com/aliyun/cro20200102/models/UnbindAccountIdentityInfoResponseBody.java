// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class UnbindAccountIdentityInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UnbindAccountIdentityInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnbindAccountIdentityInfoResponseBody self = new UnbindAccountIdentityInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public UnbindAccountIdentityInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
