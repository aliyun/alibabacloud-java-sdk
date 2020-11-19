// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DisableSqlAuditResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Result")
    @Validation(required = true)
    public Boolean result;

    public static DisableSqlAuditResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableSqlAuditResponse self = new DisableSqlAuditResponse();
        return TeaModel.build(map, self);
    }

    public DisableSqlAuditResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DisableSqlAuditResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DisableSqlAuditResponse setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
