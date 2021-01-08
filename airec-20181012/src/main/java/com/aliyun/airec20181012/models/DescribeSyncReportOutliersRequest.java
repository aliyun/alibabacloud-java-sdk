// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class DescribeSyncReportOutliersRequest extends TeaModel {
    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("Key")
    public String key;

    @NameInMap("Type")
    public String type;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("LevelType")
    public String levelType;

    public static DescribeSyncReportOutliersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSyncReportOutliersRequest self = new DescribeSyncReportOutliersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSyncReportOutliersRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeSyncReportOutliersRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DescribeSyncReportOutliersRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeSyncReportOutliersRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeSyncReportOutliersRequest setLevelType(String levelType) {
        this.levelType = levelType;
        return this;
    }
    public String getLevelType() {
        return this.levelType;
    }

}
