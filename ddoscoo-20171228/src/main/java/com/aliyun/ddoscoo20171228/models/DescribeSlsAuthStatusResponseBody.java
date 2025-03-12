// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeSlsAuthStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>CF33B4C3-196E-4015-AADD-5CAD00057B80</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SlsAuthStatus")
    public Boolean slsAuthStatus;

    public static DescribeSlsAuthStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlsAuthStatusResponseBody self = new DescribeSlsAuthStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSlsAuthStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSlsAuthStatusResponseBody setSlsAuthStatus(Boolean slsAuthStatus) {
        this.slsAuthStatus = slsAuthStatus;
        return this;
    }
    public Boolean getSlsAuthStatus() {
        return this.slsAuthStatus;
    }

}
