// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnErUsageDataRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("RoutineID")
    public String routineID;

    @NameInMap("Spec")
    public String spec;

    @NameInMap("SplitBy")
    public String splitBy;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDcdnErUsageDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnErUsageDataRequest self = new DescribeDcdnErUsageDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnErUsageDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDcdnErUsageDataRequest setRoutineID(String routineID) {
        this.routineID = routineID;
        return this;
    }
    public String getRoutineID() {
        return this.routineID;
    }

    public DescribeDcdnErUsageDataRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

    public DescribeDcdnErUsageDataRequest setSplitBy(String splitBy) {
        this.splitBy = splitBy;
        return this;
    }
    public String getSplitBy() {
        return this.splitBy;
    }

    public DescribeDcdnErUsageDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
