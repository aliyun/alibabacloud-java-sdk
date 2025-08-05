// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAITrafficAnalysisStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>4E7F94C7-781F-5192-86CF-DB085****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>open</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeAITrafficAnalysisStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAITrafficAnalysisStatusResponseBody self = new DescribeAITrafficAnalysisStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAITrafficAnalysisStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAITrafficAnalysisStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
