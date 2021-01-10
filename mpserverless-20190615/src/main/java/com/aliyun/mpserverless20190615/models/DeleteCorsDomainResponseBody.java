// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DeleteCorsDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCorsDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCorsDomainResponseBody self = new DeleteCorsDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCorsDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
