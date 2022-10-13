// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopMetricListResponseBody extends TeaModel {
    @NameInMap("Datapoints")
    public String datapoints;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDesktopMetricListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopMetricListResponseBody self = new DescribeDesktopMetricListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDesktopMetricListResponseBody setDatapoints(String datapoints) {
        this.datapoints = datapoints;
        return this;
    }
    public String getDatapoints() {
        return this.datapoints;
    }

    public DescribeDesktopMetricListResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDesktopMetricListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
