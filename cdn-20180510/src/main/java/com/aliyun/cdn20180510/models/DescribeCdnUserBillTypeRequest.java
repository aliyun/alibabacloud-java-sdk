// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnUserBillTypeRequest extends TeaModel {
    /**
     * <p>The end of the time range that was queried.</p>
     * <br>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <br>
     * <p>Example: 2016-10-20T04:00:00Z.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The start of the time range that was queried.</p>
     * <br>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <br>
     * <p>Example: 2016-10-20T04:00:00Z.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeCdnUserBillTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnUserBillTypeRequest self = new DescribeCdnUserBillTypeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCdnUserBillTypeRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeCdnUserBillTypeRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
