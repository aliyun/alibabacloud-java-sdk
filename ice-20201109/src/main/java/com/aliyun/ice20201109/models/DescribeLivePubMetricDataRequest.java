// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeLivePubMetricDataRequest extends TeaModel {
    @NameInMap("BeginTs")
    public Long beginTs;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("EndTs")
    public Long endTs;

    @NameInMap("ExperienceLevel")
    public String experienceLevel;

    @NameInMap("MetricType")
    public String metricType;

    @NameInMap("Os")
    public String os;

    @NameInMap("PubProtocol")
    public String pubProtocol;

    @NameInMap("SdkVersion")
    public String sdkVersion;

    @NameInMap("StreamName")
    public String streamName;

    @NameInMap("TerminalType")
    public String terminalType;

    public static DescribeLivePubMetricDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLivePubMetricDataRequest self = new DescribeLivePubMetricDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLivePubMetricDataRequest setBeginTs(Long beginTs) {
        this.beginTs = beginTs;
        return this;
    }
    public Long getBeginTs() {
        return this.beginTs;
    }

    public DescribeLivePubMetricDataRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeLivePubMetricDataRequest setEndTs(Long endTs) {
        this.endTs = endTs;
        return this;
    }
    public Long getEndTs() {
        return this.endTs;
    }

    public DescribeLivePubMetricDataRequest setExperienceLevel(String experienceLevel) {
        this.experienceLevel = experienceLevel;
        return this;
    }
    public String getExperienceLevel() {
        return this.experienceLevel;
    }

    public DescribeLivePubMetricDataRequest setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public DescribeLivePubMetricDataRequest setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public DescribeLivePubMetricDataRequest setPubProtocol(String pubProtocol) {
        this.pubProtocol = pubProtocol;
        return this;
    }
    public String getPubProtocol() {
        return this.pubProtocol;
    }

    public DescribeLivePubMetricDataRequest setSdkVersion(String sdkVersion) {
        this.sdkVersion = sdkVersion;
        return this;
    }
    public String getSdkVersion() {
        return this.sdkVersion;
    }

    public DescribeLivePubMetricDataRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

    public DescribeLivePubMetricDataRequest setTerminalType(String terminalType) {
        this.terminalType = terminalType;
        return this;
    }
    public String getTerminalType() {
        return this.terminalType;
    }

}
