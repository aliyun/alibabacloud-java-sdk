// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeAlarmEventStackInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("StackInfo")
    @Validation(required = true)
    public String stackInfo;

    public static DescribeAlarmEventStackInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlarmEventStackInfoResponse self = new DescribeAlarmEventStackInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAlarmEventStackInfoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAlarmEventStackInfoResponse setStackInfo(String stackInfo) {
        this.stackInfo = stackInfo;
        return this;
    }
    public String getStackInfo() {
        return this.stackInfo;
    }

}
