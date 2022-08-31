// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeRealtimeLogAuthorizedResponseBody extends TeaModel {
    @NameInMap("AuthorizedStatus")
    public String authorizedStatus;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRealtimeLogAuthorizedResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRealtimeLogAuthorizedResponseBody self = new DescribeRealtimeLogAuthorizedResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRealtimeLogAuthorizedResponseBody setAuthorizedStatus(String authorizedStatus) {
        this.authorizedStatus = authorizedStatus;
        return this;
    }
    public String getAuthorizedStatus() {
        return this.authorizedStatus;
    }

    public DescribeRealtimeLogAuthorizedResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
