// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CheckSqlAuditEnableStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>FF13E47D-4E38-4A5A-BA68-32A554******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the SQL audit feature. Valid values:</p>
     * <ul>
     * <li>enabled: The SQL audit feature is enabled.</li>
     * <li>disabled: The SQL audit feature is disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CheckSqlAuditEnableStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckSqlAuditEnableStatusResponseBody self = new CheckSqlAuditEnableStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckSqlAuditEnableStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckSqlAuditEnableStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CheckSqlAuditEnableStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
