// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class UpdateAuthorizationAttributeResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    public static UpdateAuthorizationAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuthorizationAttributeResponseBody self = new UpdateAuthorizationAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAuthorizationAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
