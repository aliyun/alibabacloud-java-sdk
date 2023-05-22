// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnErUsageDataRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <br>
     * <p>> The end time must be later than the start time.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the routine.</p>
     */
    @NameInMap("RoutineID")
    public String routineID;

    /**
     * <p>The specification of the routine. Valid values:</p>
     * <br>
     * <p>*   5ms</p>
     * <p>*   50ms</p>
     * <p>*   100ms</p>
     */
    @NameInMap("Spec")
    public String spec;

    /**
     * <p>Specifies how the results are grouped. If you set this parameter to routine, the returned results are grouped based on the routine ID. If you set this parameter to spec, the returned results are grouped based on the routine specification.</p>
     * <br>
     * <p>> If you leave this parameter empty, the returned results are not grouped.</p>
     */
    @NameInMap("SplitBy")
    public String splitBy;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     */
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
