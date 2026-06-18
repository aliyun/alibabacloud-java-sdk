// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeKvAccountStatusResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EEEBE525-F576-1196-8DAF-2D70CA3F4D2F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Account status.</p>
     * <ul>
     * <li><p><strong>online</strong>: Enabled.</p>
     * </li>
     * <li><p><strong>offline</strong>: Disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>online</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeKvAccountStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeKvAccountStatusResponseBody self = new DescribeKvAccountStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeKvAccountStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeKvAccountStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
