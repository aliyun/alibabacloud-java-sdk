// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnErUsageDataRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <blockquote>
     * <p>The end time must be later than the start time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2018-10-31T16:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the routine.</p>
     * 
     * <strong>example:</strong>
     * <p>routine1.test</p>
     */
    @NameInMap("RoutineID")
    public String routineID;

    /**
     * <p>The specification of the routine. Valid values:</p>
     * <ul>
     * <li>5ms</li>
     * <li>50ms</li>
     * <li>100ms</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>50ms</p>
     */
    @NameInMap("Spec")
    public String spec;

    /**
     * <p>Specifies how the results are grouped. If you set this parameter to routine, the returned results are grouped based on the routine ID. If you set this parameter to spec, the returned results are grouped based on the routine specification.</p>
     * <blockquote>
     * <p>If you leave this parameter empty, the returned results are not grouped.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>routine</p>
     */
    @NameInMap("SplitBy")
    public String splitBy;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-10-30T16:00:00Z</p>
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
