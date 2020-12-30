// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class DeleteDomainGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDomainGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDomainGroupResponseBody self = new DeleteDomainGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDomainGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
