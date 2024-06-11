// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ModifyPolicyGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyPolicyGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyPolicyGroupResponseBody self = new ModifyPolicyGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyPolicyGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
