// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateAggTaskGroupRequest extends TeaModel {
    /**
     * <p>The configuration of the aggregation task group.
     * Only the \<code>RecordingRuleYaml\\</code> format is supported. The configuration must follow the format of RecordingRule for open source Prometheus.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>groups:</p>
     * <ul>
     * <li>name: &quot;node.rules&quot;
     * interval: &quot;60s&quot;
     * rules:<ul>
     * <li>record: &quot;node_namespace_pod:kube_pod_info:&quot;
     * expr: &quot;max(label_replace(kube_pod_info{job=\&quot;kubernetes-pods-kube-state-metrics\&quot;\
     *   }, \&quot;pod\&quot;, \&quot;$1\&quot;, \&quot;pod\&quot;, \&quot;(.*)\&quot;)) by (node, namespace, pod, cluster)&quot;</li>
     * </ul>
     * </li>
     * </ul>
     */
    @NameInMap("aggTaskGroupConfig")
    public String aggTaskGroupConfig;

    /**
     * <p>The type of the aggregation task group configuration. The default value is \<code>RecordingRuleYaml\\</code>. This is the format of RecordingRule for open source Prometheus.</p>
     * 
     * <strong>example:</strong>
     * <p>RecordingRuleYaml</p>
     */
    @NameInMap("aggTaskGroupConfigType")
    public String aggTaskGroupConfigType;

    /**
     * <p>The name of the aggregation task group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-group</p>
     */
    @NameInMap("aggTaskGroupName")
    public String aggTaskGroupName;

    /**
     * <p>The cron expression for scheduling when \<code>scheduleMode\\</code> is set to \<code>Cron\\</code>. For example, \<code>0/1 \\* \\* \\* \\*\\</code> indicates that the task is scheduled every minute, starting from minute 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0/1 * * * *</p>
     */
    @NameInMap("cronExpr")
    public String cronExpr;

    /**
     * <p>The fixed delay for scheduling. Unit: seconds. The default value is 30.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("delay")
    public Integer delay;

    /**
     * <p>The description of the aggregation task group.</p>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The UNIX timestamp for the scheduling start time. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1724996015</p>
     */
    @NameInMap("fromTime")
    public Long fromTime;

    /**
     * <p>The maximum number of retries for an aggregation task. The default value is 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxRetries")
    public Integer maxRetries;

    /**
     * <p>The maximum retry time for an aggregation task. Unit: seconds. The default value is 600.</p>
     * 
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("maxRunTimeInSeconds")
    public Integer maxRunTimeInSeconds;

    /**
     * <p>The dry run configuration. This parameter is not configured by default. The input string must be a parsable JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;policy&quot;:&quot;skip&quot;,&quot;prometheusId&quot;:&quot;xxx&quot;,&quot;query&quot;:&quot;scalar(sum(count_over_time(up{job=\&quot;_arms/kubelet/cadvisor\&quot;}[15s])) / 21)&quot;,&quot;threshold&quot;:0.5,&quot;timeout&quot;:15,&quot;type&quot;:&quot;promql&quot;}</p>
     */
    @NameInMap("precheckString")
    public String precheckString;

    /**
     * <p>The scheduling mode. Valid values: \<code>Cron\\</code> and \<code>FixedRate\\</code>. The default value is \<code>FixedRate\\</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>FixedRate</p>
     */
    @NameInMap("scheduleMode")
    public String scheduleMode;

    /**
     * <p>The scheduling time expression. The recommended values are \<code>@s\\</code> and \<code>@m\\</code>. This expression specifies the granularity to which the time window is snapped. The default value is \<code>@m\\</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>@m</p>
     */
    @NameInMap("scheduleTimeExpr")
    public String scheduleTimeExpr;

    /**
     * <p>The status of the aggregation task group. Valid values: \<code>Running\\</code> and \<code>Stopped\\</code>. The default value is \<code>Running\\</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The tags of the resource group.</p>
     */
    @NameInMap("tags")
    public java.util.List<CreateAggTaskGroupRequestTags> tags;

    /**
     * <p>The ID of the target Prometheus instance for the aggregation task group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rw-pq4apob9jm</p>
     */
    @NameInMap("targetPrometheusId")
    public String targetPrometheusId;

    /**
     * <p>The UNIX timestamp for the scheduling end time. Unit: seconds. A value of 0 means that scheduling does not stop.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("toTime")
    public Long toTime;

    /**
     * <p>Specifies whether to overwrite an existing resource with the same name.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("overrideIfExists")
    public Boolean overrideIfExists;

    public static CreateAggTaskGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAggTaskGroupRequest self = new CreateAggTaskGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateAggTaskGroupRequest setAggTaskGroupConfig(String aggTaskGroupConfig) {
        this.aggTaskGroupConfig = aggTaskGroupConfig;
        return this;
    }
    public String getAggTaskGroupConfig() {
        return this.aggTaskGroupConfig;
    }

    public CreateAggTaskGroupRequest setAggTaskGroupConfigType(String aggTaskGroupConfigType) {
        this.aggTaskGroupConfigType = aggTaskGroupConfigType;
        return this;
    }
    public String getAggTaskGroupConfigType() {
        return this.aggTaskGroupConfigType;
    }

    public CreateAggTaskGroupRequest setAggTaskGroupName(String aggTaskGroupName) {
        this.aggTaskGroupName = aggTaskGroupName;
        return this;
    }
    public String getAggTaskGroupName() {
        return this.aggTaskGroupName;
    }

    public CreateAggTaskGroupRequest setCronExpr(String cronExpr) {
        this.cronExpr = cronExpr;
        return this;
    }
    public String getCronExpr() {
        return this.cronExpr;
    }

    public CreateAggTaskGroupRequest setDelay(Integer delay) {
        this.delay = delay;
        return this;
    }
    public Integer getDelay() {
        return this.delay;
    }

    public CreateAggTaskGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAggTaskGroupRequest setFromTime(Long fromTime) {
        this.fromTime = fromTime;
        return this;
    }
    public Long getFromTime() {
        return this.fromTime;
    }

    public CreateAggTaskGroupRequest setMaxRetries(Integer maxRetries) {
        this.maxRetries = maxRetries;
        return this;
    }
    public Integer getMaxRetries() {
        return this.maxRetries;
    }

    public CreateAggTaskGroupRequest setMaxRunTimeInSeconds(Integer maxRunTimeInSeconds) {
        this.maxRunTimeInSeconds = maxRunTimeInSeconds;
        return this;
    }
    public Integer getMaxRunTimeInSeconds() {
        return this.maxRunTimeInSeconds;
    }

    public CreateAggTaskGroupRequest setPrecheckString(String precheckString) {
        this.precheckString = precheckString;
        return this;
    }
    public String getPrecheckString() {
        return this.precheckString;
    }

    public CreateAggTaskGroupRequest setScheduleMode(String scheduleMode) {
        this.scheduleMode = scheduleMode;
        return this;
    }
    public String getScheduleMode() {
        return this.scheduleMode;
    }

    public CreateAggTaskGroupRequest setScheduleTimeExpr(String scheduleTimeExpr) {
        this.scheduleTimeExpr = scheduleTimeExpr;
        return this;
    }
    public String getScheduleTimeExpr() {
        return this.scheduleTimeExpr;
    }

    public CreateAggTaskGroupRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateAggTaskGroupRequest setTags(java.util.List<CreateAggTaskGroupRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateAggTaskGroupRequestTags> getTags() {
        return this.tags;
    }

    public CreateAggTaskGroupRequest setTargetPrometheusId(String targetPrometheusId) {
        this.targetPrometheusId = targetPrometheusId;
        return this;
    }
    public String getTargetPrometheusId() {
        return this.targetPrometheusId;
    }

    public CreateAggTaskGroupRequest setToTime(Long toTime) {
        this.toTime = toTime;
        return this;
    }
    public Long getToTime() {
        return this.toTime;
    }

    public CreateAggTaskGroupRequest setOverrideIfExists(Boolean overrideIfExists) {
        this.overrideIfExists = overrideIfExists;
        return this;
    }
    public Boolean getOverrideIfExists() {
        return this.overrideIfExists;
    }

    public static class CreateAggTaskGroupRequestTags extends TeaModel {
        /**
         * <p>The key of the resource group tag.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The value of the resource group tag.</p>
         * 
         * <strong>example:</strong>
         * <p>value1</p>
         */
        @NameInMap("value")
        public String value;

        public static CreateAggTaskGroupRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateAggTaskGroupRequestTags self = new CreateAggTaskGroupRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateAggTaskGroupRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAggTaskGroupRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
