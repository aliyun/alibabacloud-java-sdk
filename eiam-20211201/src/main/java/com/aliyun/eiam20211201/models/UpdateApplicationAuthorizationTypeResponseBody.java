// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateApplicationAuthorizationTypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateApplicationAuthorizationTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationAuthorizationTypeResponseBody self = new UpdateApplicationAuthorizationTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationAuthorizationTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
