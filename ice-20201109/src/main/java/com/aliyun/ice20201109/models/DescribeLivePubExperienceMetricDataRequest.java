// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeLivePubExperienceMetricDataRequest extends TeaModel {
    @NameInMap("BeginTs")
    public String beginTs;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("EndTs")
    public String endTs;

    @NameInMap("MetricType")
    public String metricType;

    @NameInMap("Os")
    public String os;

    @NameInMap("PubProtocol")
    public String pubProtocol;

    @NameInMap("TerminalType")
    public String terminalType;

    public static DescribeLivePubExperienceMetricDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLivePubExperienceMetricDataRequest self = new DescribeLivePubExperienceMetricDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLivePubExperienceMetricDataRequest setBeginTs(String beginTs) {
        this.beginTs = beginTs;
        return this;
    }
    public String getBeginTs() {
        return this.beginTs;
    }

    public DescribeLivePubExperienceMetricDataRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeLivePubExperienceMetricDataRequest setEndTs(String endTs) {
        this.endTs = endTs;
        return this;
    }
    public String getEndTs() {
        return this.endTs;
    }

    public DescribeLivePubExperienceMetricDataRequest setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public DescribeLivePubExperienceMetricDataRequest setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public DescribeLivePubExperienceMetricDataRequest setPubProtocol(String pubProtocol) {
        this.pubProtocol = pubProtocol;
        return this;
    }
    public String getPubProtocol() {
        return this.pubProtocol;
    }

    public DescribeLivePubExperienceMetricDataRequest setTerminalType(String terminalType) {
        this.terminalType = terminalType;
        return this;
    }
    public String getTerminalType() {
        return this.terminalType;
    }

}
