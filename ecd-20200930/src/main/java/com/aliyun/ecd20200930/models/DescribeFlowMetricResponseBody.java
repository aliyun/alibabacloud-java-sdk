// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeFlowMetricResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{\&quot;instanceId\&quot;: \&quot;np-4wrye3ishxi47****\&quot;, \&quot;requestId\&quot;: \&quot;4F0CD5B6-70D6-5115-A2F7-7EAC3981****\&quot;, \&quot;dataPoints\&quot;: [{\&quot;timeStamp\&quot;: 1636510320000, \&quot;Average\&quot;: 293752.0}]}</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>6857EDCB-631F-5405-BE95-45CBB4C3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeFlowMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowMetricResponseBody self = new DescribeFlowMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFlowMetricResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DescribeFlowMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
