// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceVncUrlResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The VNC logon address.</p>
     * <br>
     * <p>>  **The address returned is valid only for 15 seconds. If a connection is not established within 15 seconds after a successful call, the address expires and you must recall the operation to obtain a new address.</p>
     */
    @NameInMap("VncUrl")
    public String vncUrl;

    public static DescribeInstanceVncUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceVncUrlResponseBody self = new DescribeInstanceVncUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceVncUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceVncUrlResponseBody setVncUrl(String vncUrl) {
        this.vncUrl = vncUrl;
        return this;
    }
    public String getVncUrl() {
        return this.vncUrl;
    }

}
