// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebAccessLogEmptyCountResponseBody extends TeaModel {
    /**
     * <p>The remaining quota that you can clear the Logstore.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("AvailableCount")
    public Integer availableCount;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CF33B4C3-196E-4015-AADD-5CAD00057B80</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeWebAccessLogEmptyCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebAccessLogEmptyCountResponseBody self = new DescribeWebAccessLogEmptyCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWebAccessLogEmptyCountResponseBody setAvailableCount(Integer availableCount) {
        this.availableCount = availableCount;
        return this;
    }
    public Integer getAvailableCount() {
        return this.availableCount;
    }

    public DescribeWebAccessLogEmptyCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
