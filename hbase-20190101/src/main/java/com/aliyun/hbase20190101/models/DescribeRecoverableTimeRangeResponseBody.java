// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeRecoverableTimeRangeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TimeBegin")
    public String timeBegin;

    @NameInMap("TimeEnd")
    public String timeEnd;

    public static DescribeRecoverableTimeRangeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecoverableTimeRangeResponseBody self = new DescribeRecoverableTimeRangeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRecoverableTimeRangeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRecoverableTimeRangeResponseBody setTimeBegin(String timeBegin) {
        this.timeBegin = timeBegin;
        return this;
    }
    public String getTimeBegin() {
        return this.timeBegin;
    }

    public DescribeRecoverableTimeRangeResponseBody setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
        return this;
    }
    public String getTimeEnd() {
        return this.timeEnd;
    }

}
