// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserBillTypeRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDcdnUserBillTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnUserBillTypeRequest self = new DescribeDcdnUserBillTypeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnUserBillTypeRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDcdnUserBillTypeRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
