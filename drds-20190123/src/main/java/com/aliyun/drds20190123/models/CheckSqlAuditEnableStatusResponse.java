// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CheckSqlAuditEnableStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Status")
    @Validation(required = true)
    public String status;

    public static CheckSqlAuditEnableStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckSqlAuditEnableStatusResponse self = new CheckSqlAuditEnableStatusResponse();
        return TeaModel.build(map, self);
    }

    public CheckSqlAuditEnableStatusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckSqlAuditEnableStatusResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CheckSqlAuditEnableStatusResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
