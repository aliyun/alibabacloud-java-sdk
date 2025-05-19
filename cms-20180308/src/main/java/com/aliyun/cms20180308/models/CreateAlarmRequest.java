// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class CreateAlarmRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <blockquote>
     * </blockquote>
     */
    @NameInMap("ComparisonOperator")
    public String comparisonOperator;

    @NameInMap("ContactGroups")
    public String contactGroups;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;instanceId&quot;:&quot;i-2zecrzcri3d6fhd2ff7j &quot;}]</p>
     */
    @NameInMap("Dimensions")
    public String dimensions;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <strong>example:</strong>
     * <p>24</p>
     */
    @NameInMap("EndTime")
    public Integer endTime;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("EvaluationCount")
    public Integer evaluationCount;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CPUUtilization</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acs_ecs_dashboard</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NotifyType")
    public Integer notifyType;

    /**
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Period")
    public Integer period;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>86400</p>
     */
    @NameInMap("SilenceTime")
    public Integer silenceTime;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("StartTime")
    public Integer startTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Average</p>
     */
    @NameInMap("Statistics")
    public String statistics;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>90</p>
     */
    @NameInMap("Threshold")
    public String threshold;

    /**
     * <strong>example:</strong>
     * <p><a href="http://www.net.cn/example_callback.htm">http://www.net.cn/example_callback.htm</a></p>
     */
    @NameInMap("Webhook")
    public String webhook;

    public static CreateAlarmRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAlarmRequest self = new CreateAlarmRequest();
        return TeaModel.build(map, self);
    }

    public CreateAlarmRequest setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
        return this;
    }
    public String getComparisonOperator() {
        return this.comparisonOperator;
    }

    public CreateAlarmRequest setContactGroups(String contactGroups) {
        this.contactGroups = contactGroups;
        return this;
    }
    public String getContactGroups() {
        return this.contactGroups;
    }

    public CreateAlarmRequest setDimensions(String dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public String getDimensions() {
        return this.dimensions;
    }

    public CreateAlarmRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateAlarmRequest setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }
    public Integer getEndTime() {
        return this.endTime;
    }

    public CreateAlarmRequest setEvaluationCount(Integer evaluationCount) {
        this.evaluationCount = evaluationCount;
        return this;
    }
    public Integer getEvaluationCount() {
        return this.evaluationCount;
    }

    public CreateAlarmRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public CreateAlarmRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAlarmRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateAlarmRequest setNotifyType(Integer notifyType) {
        this.notifyType = notifyType;
        return this;
    }
    public Integer getNotifyType() {
        return this.notifyType;
    }

    public CreateAlarmRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateAlarmRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateAlarmRequest setSilenceTime(Integer silenceTime) {
        this.silenceTime = silenceTime;
        return this;
    }
    public Integer getSilenceTime() {
        return this.silenceTime;
    }

    public CreateAlarmRequest setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }
    public Integer getStartTime() {
        return this.startTime;
    }

    public CreateAlarmRequest setStatistics(String statistics) {
        this.statistics = statistics;
        return this;
    }
    public String getStatistics() {
        return this.statistics;
    }

    public CreateAlarmRequest setThreshold(String threshold) {
        this.threshold = threshold;
        return this;
    }
    public String getThreshold() {
        return this.threshold;
    }

    public CreateAlarmRequest setWebhook(String webhook) {
        this.webhook = webhook;
        return this;
    }
    public String getWebhook() {
        return this.webhook;
    }

}
