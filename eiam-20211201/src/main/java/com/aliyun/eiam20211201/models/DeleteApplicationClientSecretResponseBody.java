// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DeleteApplicationClientSecretResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteApplicationClientSecretResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteApplicationClientSecretResponseBody self = new DeleteApplicationClientSecretResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteApplicationClientSecretResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
