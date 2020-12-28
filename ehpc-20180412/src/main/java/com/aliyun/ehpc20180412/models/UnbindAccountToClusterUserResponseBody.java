// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class UnbindAccountToClusterUserResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UnbindAccountToClusterUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnbindAccountToClusterUserResponseBody self = new UnbindAccountToClusterUserResponseBody();
        return TeaModel.build(map, self);
    }

    public UnbindAccountToClusterUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
