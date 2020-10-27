// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeUserBusinessBehaviorResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("StatusValue")
    @Validation(required = true)
    public String statusValue;

    public static DescribeUserBusinessBehaviorResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserBusinessBehaviorResponse self = new DescribeUserBusinessBehaviorResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserBusinessBehaviorResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserBusinessBehaviorResponse setStatusValue(String statusValue) {
        this.statusValue = statusValue;
        return this;
    }
    public String getStatusValue() {
        return this.statusValue;
    }

}
