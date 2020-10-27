// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceVncUrlResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("VncUrl")
    @Validation(required = true)
    public String vncUrl;

    public static DescribeInstanceVncUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceVncUrlResponse self = new DescribeInstanceVncUrlResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceVncUrlResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceVncUrlResponse setVncUrl(String vncUrl) {
        this.vncUrl = vncUrl;
        return this;
    }
    public String getVncUrl() {
        return this.vncUrl;
    }

}
