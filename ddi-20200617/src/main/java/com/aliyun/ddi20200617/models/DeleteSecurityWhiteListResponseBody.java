// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DeleteSecurityWhiteListResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSecurityWhiteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecurityWhiteListResponseBody self = new DeleteSecurityWhiteListResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSecurityWhiteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
