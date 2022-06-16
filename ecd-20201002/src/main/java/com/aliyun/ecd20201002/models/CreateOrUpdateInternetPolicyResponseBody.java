// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class CreateOrUpdateInternetPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateOrUpdateInternetPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateInternetPolicyResponseBody self = new CreateOrUpdateInternetPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateInternetPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
