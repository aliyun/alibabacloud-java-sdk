// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeRangeDataByLocateAndIspServiceResponseBody extends TeaModel {
    /**
     * <p>The response parameters in the JSON format.</p>
     * <br>
     * <p>These parameters indicate the following information in sequence: UNIX time, region, ISP, distribution of HTTP status codes, response time, bandwidth (bit/s), average response rate, page views, cache hit ratio, and request hit ratio.</p>
     */
    @NameInMap("JsonResult")
    public String jsonResult;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRangeDataByLocateAndIspServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRangeDataByLocateAndIspServiceResponseBody self = new DescribeRangeDataByLocateAndIspServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRangeDataByLocateAndIspServiceResponseBody setJsonResult(String jsonResult) {
        this.jsonResult = jsonResult;
        return this;
    }
    public String getJsonResult() {
        return this.jsonResult;
    }

    public DescribeRangeDataByLocateAndIspServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
