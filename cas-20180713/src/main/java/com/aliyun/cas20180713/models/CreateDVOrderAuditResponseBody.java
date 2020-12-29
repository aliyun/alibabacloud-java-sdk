// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20180713.models;

import com.aliyun.tea.*;

public class CreateDVOrderAuditResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDVOrderAuditResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDVOrderAuditResponseBody self = new CreateDVOrderAuditResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDVOrderAuditResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
