// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeRangeDataByLocateAndIspServiceResponseBody extends TeaModel {
    /**
     * <p>The response parameters in the JSON format. These parameters indicate the following information in sequence: UNIX time, region, ISP, distribution of HTTP status codes, response time, bandwidth (bit/s), average response rate, page views, cache hit ratio, and request hit ratio.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;1472659200&quot;:{&quot;Tianjin&quot;:{&quot;China Telecom&quot;:{&quot;http_codes&quot;:{&quot;000&quot;:0,&quot;200&quot;:6,&quot;400&quot;:0},&quot;rt&quot;:4183,&quot;bandwidth&quot;:46639,&quot;avg_speed&quot;:7773,&quot;pv&quot;:6,&quot;hit_rate&quot;:0.93,&quot;request_hit_rate&quot;:0.66}}}}</p>
     */
    @NameInMap("JsonResult")
    public String jsonResult;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
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
