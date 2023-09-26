// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class DeleteSecretKeyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSecretKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecretKeyResponseBody self = new DeleteSecretKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSecretKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
