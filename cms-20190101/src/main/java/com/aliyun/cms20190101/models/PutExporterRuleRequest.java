// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutExporterRuleRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("MetricName")
    public String metricName;

    @NameInMap("TargetWindows")
    public String targetWindows;

    @NameInMap("Describe")
    public String describe;

    @NameInMap("DstNames")
    public java.util.List<String> dstNames;

    public static PutExporterRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        PutExporterRuleRequest self = new PutExporterRuleRequest();
        return TeaModel.build(map, self);
    }

    public PutExporterRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public PutExporterRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public PutExporterRuleRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public PutExporterRuleRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public PutExporterRuleRequest setTargetWindows(String targetWindows) {
        this.targetWindows = targetWindows;
        return this;
    }
    public String getTargetWindows() {
        return this.targetWindows;
    }

    public PutExporterRuleRequest setDescribe(String describe) {
        this.describe = describe;
        return this;
    }
    public String getDescribe() {
        return this.describe;
    }

    public PutExporterRuleRequest setDstNames(java.util.List<String> dstNames) {
        this.dstNames = dstNames;
        return this;
    }
    public java.util.List<String> getDstNames() {
        return this.dstNames;
    }

}
