// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DeleteAccessKeyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteAccessKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccessKeyResponse self = new DeleteAccessKeyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAccessKeyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
