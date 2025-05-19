// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class UpdateAlarmRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <blockquote>
     * </blockquote>
     */
    @NameInMap("ComparisonOperator")
    public String comparisonOperator;

    @NameInMap("ContactGroups")
    public String contactGroups;

    /**
     * <strong>example:</strong>
     * <p>false</p>
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
     * <p>576fbae7-2fd1-411a-ae13-6f09f4fafdde</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>test_modify</p>
     */
    @NameInMap("Name")
    public String name;

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
     * <strong>example:</strong>
     * <p>Average</p>
     */
    @NameInMap("Statistics")
    public String statistics;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("Threshold")
    public String threshold;

    /**
     * <strong>example:</strong>
     * <p><a href="http://www.net.cn/example_callback.htm">http://www.net.cn/example_callback.htm</a></p>
     */
    @NameInMap("Webhook")
    public String webhook;

    public static UpdateAlarmRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlarmRequest self = new UpdateAlarmRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAlarmRequest setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
        return this;
    }
    public String getComparisonOperator() {
        return this.comparisonOperator;
    }

    public UpdateAlarmRequest setContactGroups(String contactGroups) {
        this.contactGroups = contactGroups;
        return this;
    }
    public String getContactGroups() {
        return this.contactGroups;
    }

    public UpdateAlarmRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateAlarmRequest setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }
    public Integer getEndTime() {
        return this.endTime;
    }

    public UpdateAlarmRequest setEvaluationCount(Integer evaluationCount) {
        this.evaluationCount = evaluationCount;
        return this;
    }
    public Integer getEvaluationCount() {
        return this.evaluationCount;
    }

    public UpdateAlarmRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateAlarmRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateAlarmRequest setNotifyType(Integer notifyType) {
        this.notifyType = notifyType;
        return this;
    }
    public Integer getNotifyType() {
        return this.notifyType;
    }

    public UpdateAlarmRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public UpdateAlarmRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateAlarmRequest setSilenceTime(Integer silenceTime) {
        this.silenceTime = silenceTime;
        return this;
    }
    public Integer getSilenceTime() {
        return this.silenceTime;
    }

    public UpdateAlarmRequest setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }
    public Integer getStartTime() {
        return this.startTime;
    }

    public UpdateAlarmRequest setStatistics(String statistics) {
        this.statistics = statistics;
        return this;
    }
    public String getStatistics() {
        return this.statistics;
    }

    public UpdateAlarmRequest setThreshold(String threshold) {
        this.threshold = threshold;
        return this;
    }
    public String getThreshold() {
        return this.threshold;
    }

    public UpdateAlarmRequest setWebhook(String webhook) {
        this.webhook = webhook;
        return this;
    }
    public String getWebhook() {
        return this.webhook;
    }

}
