// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeAuditPolicyResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the log audit feature is enabled. Valid values:</p>
     * <br>
     * <p>*   Enable</p>
     * <p>*   Disabled</p>
     * <br>
     * <p>Default value: Disabled.</p>
     */
    @NameInMap("LogAuditStatus")
    public String logAuditStatus;

    /**
     * <p>The request ID.</p>
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
