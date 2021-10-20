// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeSQLPatternAttributeRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("PatternId")
    public Long patternId;

    @NameInMap("Lang")
    public String lang;

    public static DescribeSQLPatternAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLPatternAttributeRequest self = new DescribeSQLPatternAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSQLPatternAttributeRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeSQLPatternAttributeRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeSQLPatternAttributeRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSQLPatternAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSQLPatternAttributeRequest setPatternId(Long patternId) {
        this.patternId = patternId;
        return this;
    }
    public Long getPatternId() {
        return this.patternId;
    }

    public DescribeSQLPatternAttributeRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
