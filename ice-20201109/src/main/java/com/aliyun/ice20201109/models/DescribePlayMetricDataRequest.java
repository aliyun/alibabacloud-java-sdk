// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribePlayMetricDataRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("BeginTs")
    public Long beginTs;

    @NameInMap("Definition")
    public String definition;

    @NameInMap("EndTs")
    public Long endTs;

    @NameInMap("ExperienceLevel")
    public String experienceLevel;

    @NameInMap("ItemConfigs")
    public String itemConfigs;

    @NameInMap("MetricType")
    public String metricType;

    @NameInMap("Network")
    public String network;

    @NameInMap("Os")
    public String os;

    @NameInMap("SdkVersion")
    public String sdkVersion;

    @NameInMap("TerminalType")
    public String terminalType;

    public static DescribePlayMetricDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePlayMetricDataRequest self = new DescribePlayMetricDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribePlayMetricDataRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DescribePlayMetricDataRequest setBeginTs(Long beginTs) {
        this.beginTs = beginTs;
        return this;
    }
    public Long getBeginTs() {
        return this.beginTs;
    }

    public DescribePlayMetricDataRequest setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public DescribePlayMetricDataRequest setEndTs(Long endTs) {
        this.endTs = endTs;
        return this;
    }
    public Long getEndTs() {
        return this.endTs;
    }

    public DescribePlayMetricDataRequest setExperienceLevel(String experienceLevel) {
        this.experienceLevel = experienceLevel;
        return this;
    }
    public String getExperienceLevel() {
        return this.experienceLevel;
    }

    public DescribePlayMetricDataRequest setItemConfigs(String itemConfigs) {
        this.itemConfigs = itemConfigs;
        return this;
    }
    public String getItemConfigs() {
        return this.itemConfigs;
    }

    public DescribePlayMetricDataRequest setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public DescribePlayMetricDataRequest setNetwork(String network) {
        this.network = network;
        return this;
    }
    public String getNetwork() {
        return this.network;
    }

    public DescribePlayMetricDataRequest setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public DescribePlayMetricDataRequest setSdkVersion(String sdkVersion) {
        this.sdkVersion = sdkVersion;
        return this;
    }
    public String getSdkVersion() {
        return this.sdkVersion;
    }

    public DescribePlayMetricDataRequest setTerminalType(String terminalType) {
        this.terminalType = terminalType;
        return this;
    }
    public String getTerminalType() {
        return this.terminalType;
    }

}
