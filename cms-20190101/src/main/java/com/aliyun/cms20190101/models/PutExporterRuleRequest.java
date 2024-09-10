// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutExporterRuleRequest extends TeaModel {
    /**
     * <p>The description of the data export rule.</p>
     * 
     * <strong>example:</strong>
     * <p>Export CPU metrics</p>
     */
    @NameInMap("Describe")
    public String describe;

    /**
     * <p>The destination to which the data is exported. Valid values of N: 1 to 20.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>distName1</p>
     */
    @NameInMap("DstNames")
    public java.util.List<String> dstNames;

    /**
     * <p>The name of the metric.</p>
     * <blockquote>
     * </blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cpu_total</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>The namespace of the cloud service.</p>
     * <blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>acs_ecs_dashboard</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the rule.</p>
     * <blockquote>
     * <p>If the specified rule exists, the existing rule is modified. Otherwise, a rule is created.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>MyRuleName</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The time window of the exported data. Unit: seconds.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>Separate multiple time windows with commas (,).</p>
     * </li>
     * <li><p>Data in a time window of less than 60 seconds cannot be exported.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>60,300</p>
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
