// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateAggTaskGroupRequest extends TeaModel {
    /**
     * <p>The configuration of the aggregation task group. Currently, only the RecordingRuleYaml format is supported. The configuration must comply with the RecordingRule format of open source Prometheus.</p>
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
     * <p>The type of the aggregation task group configuration. The default value is RecordingRuleYaml, which is the RecordingRule format of open source Prometheus.</p>
     * 
     * <strong>example:</strong>
     * <p>RecordingRuleYaml</p>
     */
    @NameInMap("aggTaskGroupConfigType")
    public String aggTaskGroupConfigType;

    /**
     * <p>The name of the aggregation task group.</p>
     * 
     * <strong>example:</strong>
     * <p>test-group</p>
     */
    @NameInMap("aggTaskGroupName")
    public String aggTaskGroupName;

    /**
     * <p>The cron expression for scheduling when the scheduling mode is set to Cron. For example, \<code>0/1 \\* \\* \\* \\*\\</code> indicates that the task is scheduled every 1 minute, starting from the 0th minute.</p>
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
     * <p>The UNIX timestamp in seconds that indicates the start time of the scheduling.</p>
     * 
     * <strong>example:</strong>
     * <p>1724996015</p>
     */
    @NameInMap("fromTime")
    public Long fromTime;

    /**
     * <p>The maximum number of retries to execute the aggregation task. The default value is 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxRetries")
    public Integer maxRetries;

    /**
     * <p>The maximum retry time to execute the aggregation task. Unit: seconds. The default value is 600.</p>
     * 
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("maxRunTimeInSeconds")
    public Integer maxRunTimeInSeconds;

    /**
     * <p>The dry run configuration. This parameter is not configured by default. The input string must be a valid JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;policy&quot;:&quot;skip&quot;,&quot;prometheusId&quot;:&quot;xxx&quot;,&quot;query&quot;:&quot;scalar(sum(count_over_time(up{job=\&quot;_arms/kubelet/cadvisor\&quot;}[15s])) / 21)&quot;,&quot;threshold&quot;:0.5,&quot;timeout&quot;:15,&quot;type&quot;:&quot;promql&quot;}</p>
     */
    @NameInMap("precheckString")
    public String precheckString;

    /**
     * <p>The scheduling mode. Valid values: Cron and FixedRate. The default value is FixedRate.</p>
     * 
     * <strong>example:</strong>
     * <p>FixedRate</p>
     */
    @NameInMap("scheduleMode")
    public String scheduleMode;

    /**
     * <p>The scheduling time expression. Recommended values are \<code>@s\\</code> and \<code>@m\\</code>. This expression indicates the granularity at which the scheduling time window is snapped. The default value is \<code>@m\\</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>@m</p>
     */
    @NameInMap("scheduleTimeExpr")
    public String scheduleTimeExpr;

    /**
     * <p>The status of the aggregation task group. Valid values: Running and Stopped. The default value is Running.</p>
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
    public java.util.List<UpdateAggTaskGroupRequestTags> tags;

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
     * <p>The UNIX timestamp in seconds that indicates the end time of the scheduling. A value of 0 indicates that the scheduling does not stop.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("toTime")
    public Long toTime;

    public static UpdateAggTaskGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAggTaskGroupRequest self = new UpdateAggTaskGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAggTaskGroupRequest setAggTaskGroupConfig(String aggTaskGroupConfig) {
        this.aggTaskGroupConfig = aggTaskGroupConfig;
        return this;
    }
    public String getAggTaskGroupConfig() {
        return this.aggTaskGroupConfig;
    }

    public UpdateAggTaskGroupRequest setAggTaskGroupConfigType(String aggTaskGroupConfigType) {
        this.aggTaskGroupConfigType = aggTaskGroupConfigType;
        return this;
    }
    public String getAggTaskGroupConfigType() {
        return this.aggTaskGroupConfigType;
    }

    public UpdateAggTaskGroupRequest setAggTaskGroupName(String aggTaskGroupName) {
        this.aggTaskGroupName = aggTaskGroupName;
        return this;
    }
    public String getAggTaskGroupName() {
        return this.aggTaskGroupName;
    }

    public UpdateAggTaskGroupRequest setCronExpr(String cronExpr) {
        this.cronExpr = cronExpr;
        return this;
    }
    public String getCronExpr() {
        return this.cronExpr;
    }

    public UpdateAggTaskGroupRequest setDelay(Integer delay) {
        this.delay = delay;
        return this;
    }
    public Integer getDelay() {
        return this.delay;
    }

    public UpdateAggTaskGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateAggTaskGroupRequest setFromTime(Long fromTime) {
        this.fromTime = fromTime;
        return this;
    }
    public Long getFromTime() {
        return this.fromTime;
    }

    public UpdateAggTaskGroupRequest setMaxRetries(Integer maxRetries) {
        this.maxRetries = maxRetries;
        return this;
    }
    public Integer getMaxRetries() {
        return this.maxRetries;
    }

    public UpdateAggTaskGroupRequest setMaxRunTimeInSeconds(Integer maxRunTimeInSeconds) {
        this.maxRunTimeInSeconds = maxRunTimeInSeconds;
        return this;
    }
    public Integer getMaxRunTimeInSeconds() {
        return this.maxRunTimeInSeconds;
    }

    public UpdateAggTaskGroupRequest setPrecheckString(String precheckString) {
        this.precheckString = precheckString;
        return this;
    }
    public String getPrecheckString() {
        return this.precheckString;
    }

    public UpdateAggTaskGroupRequest setScheduleMode(String scheduleMode) {
        this.scheduleMode = scheduleMode;
        return this;
    }
    public String getScheduleMode() {
        return this.scheduleMode;
    }

    public UpdateAggTaskGroupRequest setScheduleTimeExpr(String scheduleTimeExpr) {
        this.scheduleTimeExpr = scheduleTimeExpr;
        return this;
    }
    public String getScheduleTimeExpr() {
        return this.scheduleTimeExpr;
    }

    public UpdateAggTaskGroupRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateAggTaskGroupRequest setTags(java.util.List<UpdateAggTaskGroupRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<UpdateAggTaskGroupRequestTags> getTags() {
        return this.tags;
    }

    public UpdateAggTaskGroupRequest setTargetPrometheusId(String targetPrometheusId) {
        this.targetPrometheusId = targetPrometheusId;
        return this;
    }
    public String getTargetPrometheusId() {
        return this.targetPrometheusId;
    }

    public UpdateAggTaskGroupRequest setToTime(Long toTime) {
        this.toTime = toTime;
        return this;
    }
    public Long getToTime() {
        return this.toTime;
    }

    public static class UpdateAggTaskGroupRequestTags extends TeaModel {
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

        public static UpdateAggTaskGroupRequestTags build(java.util.Map<String, ?> map) throws Exception {
            UpdateAggTaskGroupRequestTags self = new UpdateAggTaskGroupRequestTags();
            return TeaModel.build(map, self);
        }

        public UpdateAggTaskGroupRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateAggTaskGroupRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
