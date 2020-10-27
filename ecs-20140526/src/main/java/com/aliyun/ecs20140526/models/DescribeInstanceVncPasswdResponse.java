// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceVncPasswdResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("VncPasswd")
    @Validation(required = true)
    public String vncPasswd;

    public static DescribeInstanceVncPasswdResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceVncPasswdResponse self = new DescribeInstanceVncPasswdResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceVncPasswdResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceVncPasswdResponse setVncPasswd(String vncPasswd) {
        this.vncPasswd = vncPasswd;
        return this;
    }
    public String getVncPasswd() {
        return this.vncPasswd;
    }

}
