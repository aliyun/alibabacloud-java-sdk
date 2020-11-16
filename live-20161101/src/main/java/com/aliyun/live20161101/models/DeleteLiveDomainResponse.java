// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveDomainResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteLiveDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveDomainResponse self = new DeleteLiveDomainResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveDomainResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
