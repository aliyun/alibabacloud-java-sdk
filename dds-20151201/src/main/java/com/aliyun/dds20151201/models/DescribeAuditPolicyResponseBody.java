// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeAuditPolicyResponseBody extends TeaModel {
    /**
     * <p>The status of the audit log.</p>
     * <ul>
     * <li><p>Enable: The audit log is enabled.</p>
     * </li>
     * <li><p>Disabled: The audit log is disabled.</p>
     * </li>
     * </ul>
     * <p>The default value is Disabled.</p>
     * 
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("LogAuditStatus")
    public String logAuditStatus;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>111E7B16-0A87-4CBA-B271-F34AD61E099F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAuditPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuditPolicyResponseBody self = new DescribeAuditPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAuditPolicyResponseBody setLogAuditStatus(String logAuditStatus) {
        this.logAuditStatus = logAuditStatus;
        return this;
    }
    public String getLogAuditStatus() {
        return this.logAuditStatus;
    }

    public DescribeAuditPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
