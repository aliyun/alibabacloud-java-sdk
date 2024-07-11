// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeRecoverableTimeRangeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>A1A51D18-96DC-465C-9F1B-47180CA22524</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2020-10-26T18:02:03Z</p>
     */
    @NameInMap("TimeBegin")
    public String timeBegin;

    /**
     * <strong>example:</strong>
     * <p>2020-11-05T01:20:31Z</p>
     */
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
