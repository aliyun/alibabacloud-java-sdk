// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteDcdnWafPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDcdnWafPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDcdnWafPolicyResponseBody self = new DeleteDcdnWafPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDcdnWafPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
