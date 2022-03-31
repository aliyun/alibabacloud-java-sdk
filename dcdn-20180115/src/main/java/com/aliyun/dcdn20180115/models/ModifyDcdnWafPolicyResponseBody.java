// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class ModifyDcdnWafPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDcdnWafPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDcdnWafPolicyResponseBody self = new ModifyDcdnWafPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDcdnWafPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
