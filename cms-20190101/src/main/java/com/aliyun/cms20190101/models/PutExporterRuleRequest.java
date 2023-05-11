// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutExporterRuleRequest extends TeaModel {
    /**
     * <p>The description of the data export rule.</p>
     */
    @NameInMap("Describe")
    public String describe;

    /**
     * <p>The destination to which the data is exported. Valid values of N: 1 to 20.</p>
     */
    @NameInMap("DstNames")
    public java.util.List<String> dstNames;

    /**
     * <p>The name of the metric.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>For more information, see [Appendix 1: Metrics](~~163515~~).</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>The namespace of the cloud service.</p>
     * <br>
     * <p>> For more information, see [Appendix 1: Metrics](~~163515~~).</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the rule.</p>
     * <br>
     * <p>> If the specified rule exists, the existing rule is modified. Otherwise, a rule is created.</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The time window of the exported data. Unit: seconds.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   Separate multiple time windows with commas (,).</p>
     * <br>
     * <p>*   Data in a time window of less than 60 seconds cannot be exported.</p>
     */
    @NameInMap("TargetWindows")
    public String targetWindows;

    public static PutExporterRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        PutExporterRuleRequest self = new PutExporterRuleRequest();
        return TeaModel.build(map, self);
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

    public PutExporterRuleRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public PutExporterRuleRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
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

    public PutExporterRuleRequest setTargetWindows(String targetWindows) {
        this.targetWindows = targetWindows;
        return this;
    }
    public String getTargetWindows() {
        return this.targetWindows;
    }

}
