// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeSlsOpenStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SlsOpenStatus")
    @Validation(required = true)
    public Boolean slsOpenStatus;

    public static DescribeSlsOpenStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlsOpenStatusResponse self = new DescribeSlsOpenStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSlsOpenStatusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSlsOpenStatusResponse setSlsOpenStatus(Boolean slsOpenStatus) {
        this.slsOpenStatus = slsOpenStatus;
        return this;
    }
    public Boolean getSlsOpenStatus() {
        return this.slsOpenStatus;
    }

}
