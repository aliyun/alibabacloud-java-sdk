// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeSlsAuthStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SlsAuthStatus")
    @Validation(required = true)
    public Boolean slsAuthStatus;

    public static DescribeSlsAuthStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlsAuthStatusResponse self = new DescribeSlsAuthStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSlsAuthStatusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSlsAuthStatusResponse setSlsAuthStatus(Boolean slsAuthStatus) {
        this.slsAuthStatus = slsAuthStatus;
        return this;
    }
    public Boolean getSlsAuthStatus() {
        return this.slsAuthStatus;
    }

}
