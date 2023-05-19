// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeRangeDataByLocateAndIspServiceResponseBody extends TeaModel {
    @NameInMap("JsonResult")
    public String jsonResult;

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
