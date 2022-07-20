// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeLiveSubMetricDataRequest extends TeaModel {
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

    @NameInMap("StreamName")
    public String streamName;

    @NameInMap("SubProtocol")
    public String subProtocol;

    @NameInMap("TerminalType")
    public String terminalType;

    public static DescribeLiveSubMetricDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveSubMetricDataRequest self = new DescribeLiveSubMetricDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveSubMetricDataRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DescribeLiveSubMetricDataRequest setBeginTs(Long beginTs) {
        this.beginTs = beginTs;
        return this;
    }
    public Long getBeginTs() {
        return this.beginTs;
    }

    public DescribeLiveSubMetricDataRequest setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public DescribeLiveSubMetricDataRequest setEndTs(Long endTs) {
        this.endTs = endTs;
        return this;
    }
    public Long getEndTs() {
        return this.endTs;
    }

    public DescribeLiveSubMetricDataRequest setExperienceLevel(String experienceLevel) {
        this.experienceLevel = experienceLevel;
        return this;
    }
    public String getExperienceLevel() {
        return this.experienceLevel;
    }

    public DescribeLiveSubMetricDataRequest setItemConfigs(String itemConfigs) {
        this.itemConfigs = itemConfigs;
        return this;
    }
    public String getItemConfigs() {
        return this.itemConfigs;
    }

    public DescribeLiveSubMetricDataRequest setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public DescribeLiveSubMetricDataRequest setNetwork(String network) {
        this.network = network;
        return this;
    }
    public String getNetwork() {
        return this.network;
    }

    public DescribeLiveSubMetricDataRequest setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public DescribeLiveSubMetricDataRequest setSdkVersion(String sdkVersion) {
        this.sdkVersion = sdkVersion;
        return this;
    }
    public String getSdkVersion() {
        return this.sdkVersion;
    }

    public DescribeLiveSubMetricDataRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

    public DescribeLiveSubMetricDataRequest setSubProtocol(String subProtocol) {
        this.subProtocol = subProtocol;
        return this;
    }
    public String getSubProtocol() {
        return this.subProtocol;
    }

    public DescribeLiveSubMetricDataRequest setTerminalType(String terminalType) {
        this.terminalType = terminalType;
        return this;
    }
    public String getTerminalType() {
        return this.terminalType;
    }

}
