// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceVncPasswdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VncPasswd")
    public String vncPasswd;

    public static DescribeInstanceVncPasswdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceVncPasswdResponseBody self = new DescribeInstanceVncPasswdResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceVncPasswdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceVncPasswdResponseBody setVncPasswd(String vncPasswd) {
        this.vncPasswd = vncPasswd;
        return this;
    }
    public String getVncPasswd() {
        return this.vncPasswd;
    }

}
