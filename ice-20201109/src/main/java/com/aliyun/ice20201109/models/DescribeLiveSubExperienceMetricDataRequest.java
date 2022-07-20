// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeLiveSubExperienceMetricDataRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("BeginTs")
    public String beginTs;

    @NameInMap("EndTs")
    public String endTs;

    @NameInMap("ExperienceLevel")
    public String experienceLevel;

    @NameInMap("MetricType")
    public String metricType;

    @NameInMap("Os")
    public String os;

    @NameInMap("SubProtocol")
    public String subProtocol;

    @NameInMap("TerminalType")
    public String terminalType;

    public static DescribeLiveSubExperienceMetricDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveSubExperienceMetricDataRequest self = new DescribeLiveSubExperienceMetricDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveSubExperienceMetricDataRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DescribeLiveSubExperienceMetricDataRequest setBeginTs(String beginTs) {
        this.beginTs = beginTs;
        return this;
    }
    public String getBeginTs() {
        return this.beginTs;
    }

    public DescribeLiveSubExperienceMetricDataRequest setEndTs(String endTs) {
        this.endTs = endTs;
        return this;
    }
    public String getEndTs() {
        return this.endTs;
    }

    public DescribeLiveSubExperienceMetricDataRequest setExperienceLevel(String experienceLevel) {
        this.experienceLevel = experienceLevel;
        return this;
    }
    public String getExperienceLevel() {
        return this.experienceLevel;
    }

    public DescribeLiveSubExperienceMetricDataRequest setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public DescribeLiveSubExperienceMetricDataRequest setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public DescribeLiveSubExperienceMetricDataRequest setSubProtocol(String subProtocol) {
        this.subProtocol = subProtocol;
        return this;
    }
    public String getSubProtocol() {
        return this.subProtocol;
    }

    public DescribeLiveSubExperienceMetricDataRequest setTerminalType(String terminalType) {
        this.terminalType = terminalType;
        return this;
    }
    public String getTerminalType() {
        return this.terminalType;
    }

}
