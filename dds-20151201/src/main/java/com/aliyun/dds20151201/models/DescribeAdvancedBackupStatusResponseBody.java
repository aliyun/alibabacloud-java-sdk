// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeAdvancedBackupStatusResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>55A2504F-xxxx-xxxx-xxxx-C7C5E57350A6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <ul>
     * <li><p>Enabled: Advanced backup is enabled.</p>
     * </li>
     * <li><p>Disabled: Advanced backup is not enabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeAdvancedBackupStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdvancedBackupStatusResponseBody self = new DescribeAdvancedBackupStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAdvancedBackupStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAdvancedBackupStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
