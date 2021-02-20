// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeInstanceVncUrlResponseBody extends TeaModel {
    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    // 管理终端Url。
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
