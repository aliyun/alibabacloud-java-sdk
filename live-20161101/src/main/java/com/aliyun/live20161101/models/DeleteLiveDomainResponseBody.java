// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLiveDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveDomainResponseBody self = new DeleteLiveDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLiveDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
