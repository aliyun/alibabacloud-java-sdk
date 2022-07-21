// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SubmitOperationAuditInfoResponseBody extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitOperationAuditInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitOperationAuditInfoResponseBody self = new SubmitOperationAuditInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitOperationAuditInfoResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public SubmitOperationAuditInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
