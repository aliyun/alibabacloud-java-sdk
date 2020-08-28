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

}
