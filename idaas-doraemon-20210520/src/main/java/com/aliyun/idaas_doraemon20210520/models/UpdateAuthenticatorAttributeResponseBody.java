// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class UpdateAuthenticatorAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAuthenticatorAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuthenticatorAttributeResponseBody self = new UpdateAuthenticatorAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAuthenticatorAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
