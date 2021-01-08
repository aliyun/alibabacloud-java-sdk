// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class DescribeSyncReportDetailRequest extends TeaModel {
    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Type")
    public String type;

    @NameInMap("LevelType")
    public String levelType;

    public static DescribeSyncReportDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSyncReportDetailRequest self = new DescribeSyncReportDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSyncReportDetailRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeSyncReportDetailRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeSyncReportDetailRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeSyncReportDetailRequest setLevelType(String levelType) {
        this.levelType = levelType;
        return this;
    }
    public String getLevelType() {
        return this.levelType;
    }

}
