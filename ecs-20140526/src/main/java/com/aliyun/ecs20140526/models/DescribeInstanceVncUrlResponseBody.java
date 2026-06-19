// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceVncUrlResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The VNC logon URL.</p>
     * <blockquote>
     * <p>Notice: <strong>The VNC logon URL is time-sensitive and valid for 15 seconds. If you do not use the URL within 15 seconds after a successful call, the URL expires and you must call this operation again to obtain a new one.</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>wss%3A%2F%2Fhz01-vncproxy.aliyun.com%2Fwebsockify%2F%3Fs%3DDvh%252FIA%252BYc73gWO48cBx2gBxUDVzaAnSKr74pq30mzqUYgeUMcB%252FbkNixDxdEA996</p>
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
