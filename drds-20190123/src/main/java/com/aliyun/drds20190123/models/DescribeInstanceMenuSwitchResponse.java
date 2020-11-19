// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeInstanceMenuSwitchResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Config")
    @Validation(required = true)
    public java.util.Map<String, ?> config;

    public static DescribeInstanceMenuSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceMenuSwitchResponse self = new DescribeInstanceMenuSwitchResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceMenuSwitchResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceMenuSwitchResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeInstanceMenuSwitchResponse setConfig(java.util.Map<String, ?> config) {
        this.config = config;
        return this;
    }
    public java.util.Map<String, ?> getConfig() {
        return this.config;
    }

}
