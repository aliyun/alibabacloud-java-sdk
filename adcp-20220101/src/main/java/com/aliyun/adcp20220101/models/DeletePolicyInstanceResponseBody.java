// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DeletePolicyInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeletePolicyInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePolicyInstanceResponseBody self = new DeletePolicyInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePolicyInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
