// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsDetectCountsNewResponseBody extends TeaModel {
    @NameInMap("DetectedTimes")
    public Integer detectedTimes;

    @NameInMap("LeftTimes")
    public Integer leftTimes;

    @NameInMap("RequestId")
    public String requestId;

    public static QuerySmsDetectCountsNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsDetectCountsNewResponseBody self = new QuerySmsDetectCountsNewResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySmsDetectCountsNewResponseBody setDetectedTimes(Integer detectedTimes) {
        this.detectedTimes = detectedTimes;
        return this;
    }
    public Integer getDetectedTimes() {
        return this.detectedTimes;
    }

    public QuerySmsDetectCountsNewResponseBody setLeftTimes(Integer leftTimes) {
        this.leftTimes = leftTimes;
        return this;
    }
    public Integer getLeftTimes() {
        return this.leftTimes;
    }

    public QuerySmsDetectCountsNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
