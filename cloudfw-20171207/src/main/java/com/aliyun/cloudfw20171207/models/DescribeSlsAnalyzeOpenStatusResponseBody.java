// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeSlsAnalyzeOpenStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("OpenStatus")
    public String openStatus;

    /**
     * <strong>example:</strong>
     * <p>6CC01A2B-92FB-535C-9415-9A951C20****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSlsAnalyzeOpenStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlsAnalyzeOpenStatusResponseBody self = new DescribeSlsAnalyzeOpenStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSlsAnalyzeOpenStatusResponseBody setOpenStatus(String openStatus) {
        this.openStatus = openStatus;
        return this;
    }
    public String getOpenStatus() {
        return this.openStatus;
    }

    public DescribeSlsAnalyzeOpenStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
