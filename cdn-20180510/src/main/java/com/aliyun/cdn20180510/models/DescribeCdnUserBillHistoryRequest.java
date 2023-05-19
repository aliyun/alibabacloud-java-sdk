// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnUserBillHistoryRequest extends TeaModel {
    /**
     * <p>InvalidParameterAliUid</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>InvalidParameter.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeCdnUserBillHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnUserBillHistoryRequest self = new DescribeCdnUserBillHistoryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCdnUserBillHistoryRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeCdnUserBillHistoryRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
