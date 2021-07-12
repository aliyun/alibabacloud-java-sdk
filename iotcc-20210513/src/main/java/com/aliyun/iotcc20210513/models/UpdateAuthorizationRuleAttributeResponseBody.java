// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class UpdateAuthorizationRuleAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAuthorizationRuleAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuthorizationRuleAttributeResponseBody self = new UpdateAuthorizationRuleAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAuthorizationRuleAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
