// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeInstanceMenuSwitchResponseBody extends TeaModel {
    @NameInMap("Config")
    public java.util.Map<String, ?> config;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeInstanceMenuSwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceMenuSwitchResponseBody self = new DescribeInstanceMenuSwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceMenuSwitchResponseBody setConfig(java.util.Map<String, ?> config) {
        this.config = config;
        return this;
    }
    public java.util.Map<String, ?> getConfig() {
        return this.config;
    }

    public DescribeInstanceMenuSwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceMenuSwitchResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
