// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class EnableSqlAuditResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indices whether the SQL audit feature is enabled.</p>
     */
    @NameInMap("Result")
    public Boolean result;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static EnableSqlAuditResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableSqlAuditResponseBody self = new EnableSqlAuditResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableSqlAuditResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnableSqlAuditResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public EnableSqlAuditResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
