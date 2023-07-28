// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeAuditLogConfigResponseBody extends TeaModel {
    /**
     * <p>The status of SQL audit. Valid values:</p>
     * <br>
     * <p>*   **on**: SQL audit is enabled.</p>
     * <p>*   **off**: SQL audit is disabled.</p>
     */
    @NameInMap("AuditLogStatus")
    public String auditLogStatus;

    /**
     * <p>The ID of the cluster.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAuditLogConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuditLogConfigResponseBody self = new DescribeAuditLogConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAuditLogConfigResponseBody setAuditLogStatus(String auditLogStatus) {
        this.auditLogStatus = auditLogStatus;
        return this;
    }
    public String getAuditLogStatus() {
        return this.auditLogStatus;
    }

    public DescribeAuditLogConfigResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeAuditLogConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
