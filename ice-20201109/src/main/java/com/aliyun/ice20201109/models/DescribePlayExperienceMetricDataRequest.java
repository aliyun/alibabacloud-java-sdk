// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribePlayExperienceMetricDataRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("BeginTs")
    public String beginTs;

    @NameInMap("EndTs")
    public String endTs;

    @NameInMap("ExperienceLevel")
    public String experienceLevel;

    @NameInMap("Os")
    public String os;

    @NameInMap("TerminalType")
    public String terminalType;

    public static DescribePlayExperienceMetricDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePlayExperienceMetricDataRequest self = new DescribePlayExperienceMetricDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribePlayExperienceMetricDataRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DescribePlayExperienceMetricDataRequest setBeginTs(String beginTs) {
        this.beginTs = beginTs;
        return this;
    }
    public String getBeginTs() {
        return this.beginTs;
    }

    public DescribePlayExperienceMetricDataRequest setEndTs(String endTs) {
        this.endTs = endTs;
        return this;
    }
    public String getEndTs() {
        return this.endTs;
    }

    public DescribePlayExperienceMetricDataRequest setExperienceLevel(String experienceLevel) {
        this.experienceLevel = experienceLevel;
        return this;
    }
    public String getExperienceLevel() {
        return this.experienceLevel;
    }

    public DescribePlayExperienceMetricDataRequest setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public DescribePlayExperienceMetricDataRequest setTerminalType(String terminalType) {
        this.terminalType = terminalType;
        return this;
    }
    public String getTerminalType() {
        return this.terminalType;
    }

}
