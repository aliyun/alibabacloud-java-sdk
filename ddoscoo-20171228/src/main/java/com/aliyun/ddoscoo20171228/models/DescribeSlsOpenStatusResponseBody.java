// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeSlsOpenStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SlsOpenStatus")
    public Boolean slsOpenStatus;

    public static DescribeSlsOpenStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlsOpenStatusResponseBody self = new DescribeSlsOpenStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSlsOpenStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSlsOpenStatusResponseBody setSlsOpenStatus(Boolean slsOpenStatus) {
        this.slsOpenStatus = slsOpenStatus;
        return this;
    }
    public Boolean getSlsOpenStatus() {
        return this.slsOpenStatus;
    }

}
