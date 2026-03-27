// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetAggTaskGroupResponseBody extends TeaModel {
    /**
     * <p>Aggregation task group.</p>
     */
    @NameInMap("aggTaskGroup")
    public GetAggTaskGroupResponseBodyAggTaskGroup aggTaskGroup;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>68DAF543-35DF-5762-BE90-F5C00B5DC036</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Whether the request was successful</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetAggTaskGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAggTaskGroupResponseBody self = new GetAggTaskGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAggTaskGroupResponseBody setAggTaskGroup(GetAggTaskGroupResponseBodyAggTaskGroup aggTaskGroup) {
        this.aggTaskGroup = aggTaskGroup;
        return this;
    }
    public GetAggTaskGroupResponseBodyAggTaskGroup getAggTaskGroup() {
        return this.aggTaskGroup;
    }

    public GetAggTaskGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAggTaskGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAggTaskGroupResponseBodyAggTaskGroupTags extends TeaModel {
        /**
         * <p>Key of the resource group tag.</p>
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

        public static GetAggTaskGroupResponseBodyAggTaskGroupTags build(java.util.Map<String, ?> map) throws Exception {
            GetAggTaskGroupResponseBodyAggTaskGroupTags self = new GetAggTaskGroupResponseBodyAggTaskGroupTags();
            return TeaModel.build(map, self);
        }

        public GetAggTaskGroupResponseBodyAggTaskGroupTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetAggTaskGroupResponseBodyAggTaskGroupTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetAggTaskGroupResponseBodyAggTaskGroup extends TeaModel {
        /**
         * <p>Aggregation task group configuration.</p>
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
         * <p>Summary of the aggregation task group configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>a54136xxx</p>
         */
        @NameInMap("aggTaskGroupConfigHash")
        public String aggTaskGroupConfigHash;

        /**
         * <p>ID of the aggregation task group.</p>
         * 
         * <strong>example:</strong>
         * <p>aggTaskGroup-xx</p>
         */
        @NameInMap("aggTaskGroupId")
        public String aggTaskGroupId;

        /**
         * <p>Name of the aggregation task group.</p>
         * 
         * <strong>example:</strong>
         * <p>pipeline-aggtask-group</p>
         */
        @NameInMap("aggTaskGroupName")
        public String aggTaskGroupName;

        /**
         * <p>Scheduling expression for the aggregation task group when the scheduling mode is \&quot;Cron\&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>0 1 3 * * ? *</p>
         */
        @NameInMap("cronExpr")
        public String cronExpr;

        /**
         * <p>Fixed delay time (in seconds) for scheduling.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("delay")
        public Integer delay;

        /**
         * <p>Description of the aggregation task group.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Second-level timestamp corresponding to the start time of scheduling (not yet effective).</p>
         * 
         * <strong>example:</strong>
         * <p>1757409495</p>
         */
        @NameInMap("fromTime")
        public Long fromTime;

        /**
         * <p>Maximum number of retries for executing the aggregation task.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("maxRetries")
        public Integer maxRetries;

        /**
         * <p>Maximum retry time for executing the aggregation task.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("maxRunTimeInSeconds")
        public Integer maxRunTimeInSeconds;

        /**
         * <p>Pre-check configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;policy&quot;:&quot;skip&quot;,&quot;prometheusId&quot;:&quot;rw-xx&quot;,&quot;query&quot;:&quot;noPrecheck&quot;,&quot;threshold&quot;:0.5,&quot;timeout&quot;:15,&quot;type&quot;:&quot;none&quot;}</p>
         */
        @NameInMap("precheckString")
        public String precheckString;

        /**
         * <p>Region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-zhangjiakou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>Scheduling mode.</p>
         * 
         * <strong>example:</strong>
         * <p>FixedRate</p>
         */
        @NameInMap("scheduleMode")
        public String scheduleMode;

        /**
         * <p>Scheduling time expression.</p>
         * 
         * <strong>example:</strong>
         * <p>@m</p>
         */
        @NameInMap("scheduleTimeExpr")
        public String scheduleTimeExpr;

        /**
         * <p>ID of the source Prometheus instance for the aggregation task group.</p>
         * 
         * <strong>example:</strong>
         * <p>rw-xxx</p>
         */
        @NameInMap("sourcePrometheusId")
        public String sourcePrometheusId;

        /**
         * <p>Status of the aggregation task group.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>Resource group tags</p>
         */
        @NameInMap("tags")
        public java.util.List<GetAggTaskGroupResponseBodyAggTaskGroupTags> tags;

        /**
         * <p>The target Prometheus instance ID of the aggregation task group.</p>
         * 
         * <strong>example:</strong>
         * <p>rw-xxx</p>
         */
        @NameInMap("targetPrometheusId")
        public String targetPrometheusId;

        /**
         * <p>The second-level timestamp corresponding to the end time of the scheduling.</p>
         * 
         * <strong>example:</strong>
         * <p>1757409495</p>
         */
        @NameInMap("toTime")
        public Long toTime;

        /**
         * <p>The update time (timestamp) of the aggregation task group.</p>
         * 
         * <strong>example:</strong>
         * <p>1757409499000</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        /**
         * <p>The user to whom the aggregation task group belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>123xxx</p>
         */
        @NameInMap("userId")
        public String userId;

        public static GetAggTaskGroupResponseBodyAggTaskGroup build(java.util.Map<String, ?> map) throws Exception {
            GetAggTaskGroupResponseBodyAggTaskGroup self = new GetAggTaskGroupResponseBodyAggTaskGroup();
            return TeaModel.build(map, self);
        }

        public GetAggTaskGroupResponseBodyAggTaskGroup setAggTaskGroupConfig(String aggTaskGroupConfig) {
            this.aggTaskGroupConfig = aggTaskGroupConfig;
            return this;
        }
        public String getAggTaskGroupConfig() {
            return this.aggTaskGroupConfig;
        }

        public GetAggTaskGroupResponseBodyAggTaskGroup setAggTaskGroupConfigHash(String aggTaskGroupConfigHash) {
            this.aggTaskGroupConfigHash = aggTaskGroupConfigHash;
            return this;
        }
        public String getAggTaskGroupConfigHash() {
            return this.aggTaskGroupConfigHash;
        }

        public GetAggTaskGroupResponseBodyAggTaskGroup setAggTaskGroupId(String aggTaskGroupId) {
            this.aggTaskGroupId = aggTaskGroupId;
            return this;
        }
        public String getAggTaskGroupId() {
            return this.aggTaskGroupId;
        }

        public GetAggTaskGroupResponseBodyAggTaskGroup setAggTaskGroupName(String aggTaskGroupName) {
            this.aggTaskGroupName = aggTaskGroupName;
            return this;
        }
        public String getAggTaskGroupName() {
            return this.aggTaskGroupName;
        }

        public GetAggTaskGroupResponseBodyAggTaskGroup setCronExpr(String cronExpr) {
            this.cronExpr = cronExpr;
            return this;
        }
        public String getCronExpr() {
            return this.cronExpr;
        }

        public GetAggTaskGroupResponseBodyAggTaskGroup setDelay(Integer delay) {
            this.delay = delay;
            return this;
        }
        public Integer getDelay() {
            return this.delay;
        }

        public GetAggTaskGroupResponseBodyAggTaskGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAggTaskGroupResponseBodyAggTaskGroup setFromTime(Long fromTime) {
            this.fromTime = fromTime;
            return this;
        }
        public Long getFromTime() {
            return this.fromTime;
        }

        public GetAggTaskGroupResponseBodyAggTaskGroup setMaxRetries(Integer maxRetries) {
            this.maxRetries = maxRetries;
            return this;
        }
        public Integer getMaxRetries() {
            return this.maxRetries;
        }

        public GetAggTaskGroupResponseBodyAggTaskGroup setMaxRunTimeInSeconds(Integer maxRunTimeInSeconds) {
            this.maxRunTimeInSeconds = maxRunTimeInSeconds;
            return this;
        }
        public Integer getMaxRunTimeInSeconds() {
            return this.maxRunTimeInSeconds;
        }

        public GetAggTaskGroupResponseBodyAggTaskGroup setPrecheckString(String precheckString) {
            this.precheckString = precheckString;
            return this;
        }
        public String getPrecheckString() {
            return this.precheckString;
        }

        public GetAggTaskGroupResponseBodyAggTaskGroup setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetAggTaskGroupResponseBodyAggTaskGroup setScheduleMode(String scheduleMode) {
            this.scheduleMode = scheduleMode;
            return this;
        }
        public String getScheduleMode() {
            return this.scheduleMode;
        }

        public GetAggTaskGroupResponseBodyAggTaskGroup setScheduleTimeExpr(String scheduleTimeExpr) {
            this.scheduleTimeExpr = scheduleTimeExpr;
            return this;
        }
        public String getScheduleTimeExpr() {
            return this.scheduleTimeExpr;
        }

        public GetAggTaskGroupResponseBodyAggTaskGroup setSourcePrometheusId(String sourcePrometheusId) {
            this.sourcePrometheusId = sourcePrometheusId;
            return this;
        }
        public String getSourcePrometheusId() {
            return this.sourcePrometheusId;
        }

        public GetAggTaskGroupResponseBodyAggTaskGroup setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAggTaskGroupResponseBodyAggTaskGroup setTags(java.util.List<GetAggTaskGroupResponseBodyAggTaskGroupTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetAggTaskGroupResponseBodyAggTaskGroupTags> getTags() {
            return this.tags;
        }

        public GetAggTaskGroupResponseBodyAggTaskGroup setTargetPrometheusId(String targetPrometheusId) {
            this.targetPrometheusId = targetPrometheusId;
            return this;
        }
        public String getTargetPrometheusId() {
            return this.targetPrometheusId;
        }

        public GetAggTaskGroupResponseBodyAggTaskGroup setToTime(Long toTime) {
            this.toTime = toTime;
            return this;
        }
        public Long getToTime() {
            return this.toTime;
        }

        public GetAggTaskGroupResponseBodyAggTaskGroup setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public GetAggTaskGroupResponseBodyAggTaskGroup setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
