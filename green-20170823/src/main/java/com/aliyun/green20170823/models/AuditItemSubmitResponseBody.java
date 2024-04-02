// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class AuditItemSubmitResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static AuditItemSubmitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AuditItemSubmitResponseBody self = new AuditItemSubmitResponseBody();
        return TeaModel.build(map, self);
    }

    public AuditItemSubmitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AuditItemSubmitResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
