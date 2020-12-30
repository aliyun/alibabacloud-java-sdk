// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class UpdateDomainToDomainGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDomainToDomainGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDomainToDomainGroupResponseBody self = new UpdateDomainToDomainGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDomainToDomainGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
