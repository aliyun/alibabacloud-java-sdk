// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeUserBusinessBehaviorResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StatusValue")
    public String statusValue;

    public static DescribeUserBusinessBehaviorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserBusinessBehaviorResponseBody self = new DescribeUserBusinessBehaviorResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserBusinessBehaviorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserBusinessBehaviorResponseBody setStatusValue(String statusValue) {
        this.statusValue = statusValue;
        return this;
    }
    public String getStatusValue() {
        return this.statusValue;
    }

}
