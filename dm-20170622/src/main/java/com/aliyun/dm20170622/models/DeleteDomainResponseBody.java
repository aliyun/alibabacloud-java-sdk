// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20170622.models;

import com.aliyun.tea.*;

public class DeleteDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDomainResponseBody self = new DeleteDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
