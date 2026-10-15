// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class UpdateProcessDefinitionWithScheduleRequest extends TeaModel {
    /**
     * <p>The alert email address.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:foo_bar@spark.alert.invalid.com">foo_bar@spark.alert.invalid.com</a></p>
     */
    @NameInMap("alertEmailAddress")
    public String alertEmailAddress;

    /**
     * <p>The workflow description.</p>
     * 
     * <strong>example:</strong>
     * <p>ods batch workflow</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The execution policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PARALLEL</p>
     */
    @NameInMap("executionType")
    public String executionType;

    @NameInMap("globalParams")
    public java.util.List<UpdateProcessDefinitionWithScheduleRequestGlobalParams> globalParams;

    /**
     * <p>The workflow name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ods_batch_workflow</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The product code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SS</p>
     */
    @NameInMap("productNamespace")
    public String productNamespace;

    /**
     * <p>Specifies whether to publish the workflow.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("publish")
    public Boolean publish;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The online status of the workflow.</p>
     * 
     * <strong>example:</strong>
     * <p>ONLINE</p>
     */
    @NameInMap("releaseState")
    public String releaseState;

    /**
     * <p>The resource queue.</p>
     * 
     * <strong>example:</strong>
     * <p>root_queue</p>
     */
    @NameInMap("resourceQueue")
    public String resourceQueue;

    /**
     * <p>The number of retries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("retryTimes")
    public Integer retryTimes;

    /**
     * <p>The execution user.</p>
     * 
     * <strong>example:</strong>
     * <p>113***************</p>
     */
    @NameInMap("runAs")
    public String runAs;

    /**
     * <p>The scheduling structure.</p>
     */
    @NameInMap("schedule")
    public UpdateProcessDefinitionWithScheduleRequestSchedule schedule;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("tags")
    public java.util.Map<String, String> tags;

    /**
     * <p>The JSON array of node definitions, which contains the description information of all nodes in the workflow.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("taskDefinitionJson")
    public java.util.List<UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJson> taskDefinitionJson;

    /**
     * <p>The concurrency of workflow node execution.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("taskParallelism")
    public Integer taskParallelism;

    /**
     * <p>The JSON array of node dependencies, which contains the dependencies among all nodes in the workflow. preTaskCode is the upstream node ID, and postTaskCode is the downstream node ID. Each node must have a unique ID. If a node does not have an upstream node, you must add a dependency with preTaskCode set to 0.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("taskRelationJson")
    public java.util.List<UpdateProcessDefinitionWithScheduleRequestTaskRelationJson> taskRelationJson;

    /**
     * <p>The default timeout for workflow execution.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("timeout")
    public Integer timeout;

    public static UpdateProcessDefinitionWithScheduleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProcessDefinitionWithScheduleRequest self = new UpdateProcessDefinitionWithScheduleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProcessDefinitionWithScheduleRequest setAlertEmailAddress(String alertEmailAddress) {
        this.alertEmailAddress = alertEmailAddress;
        return this;
    }
    public String getAlertEmailAddress() {
        return this.alertEmailAddress;
    }

    public UpdateProcessDefinitionWithScheduleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateProcessDefinitionWithScheduleRequest setExecutionType(String executionType) {
        this.executionType = executionType;
        return this;
    }
    public String getExecutionType() {
        return this.executionType;
    }

    public UpdateProcessDefinitionWithScheduleRequest setGlobalParams(java.util.List<UpdateProcessDefinitionWithScheduleRequestGlobalParams> globalParams) {
        this.globalParams = globalParams;
        return this;
    }
    public java.util.List<UpdateProcessDefinitionWithScheduleRequestGlobalParams> getGlobalParams() {
        return this.globalParams;
    }

    public UpdateProcessDefinitionWithScheduleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateProcessDefinitionWithScheduleRequest setProductNamespace(String productNamespace) {
        this.productNamespace = productNamespace;
        return this;
    }
    public String getProductNamespace() {
        return this.productNamespace;
    }

    public UpdateProcessDefinitionWithScheduleRequest setPublish(Boolean publish) {
        this.publish = publish;
        return this;
    }
    public Boolean getPublish() {
        return this.publish;
    }

    public UpdateProcessDefinitionWithScheduleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateProcessDefinitionWithScheduleRequest setReleaseState(String releaseState) {
        this.releaseState = releaseState;
        return this;
    }
    public String getReleaseState() {
        return this.releaseState;
    }

    public UpdateProcessDefinitionWithScheduleRequest setResourceQueue(String resourceQueue) {
        this.resourceQueue = resourceQueue;
        return this;
    }
    public String getResourceQueue() {
        return this.resourceQueue;
    }

    public UpdateProcessDefinitionWithScheduleRequest setRetryTimes(Integer retryTimes) {
        this.retryTimes = retryTimes;
        return this;
    }
    public Integer getRetryTimes() {
        return this.retryTimes;
    }

    public UpdateProcessDefinitionWithScheduleRequest setRunAs(String runAs) {
        this.runAs = runAs;
        return this;
    }
    public String getRunAs() {
        return this.runAs;
    }

    public UpdateProcessDefinitionWithScheduleRequest setSchedule(UpdateProcessDefinitionWithScheduleRequestSchedule schedule) {
        this.schedule = schedule;
        return this;
    }
    public UpdateProcessDefinitionWithScheduleRequestSchedule getSchedule() {
        return this.schedule;
    }

    public UpdateProcessDefinitionWithScheduleRequest setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, String> getTags() {
        return this.tags;
    }

    public UpdateProcessDefinitionWithScheduleRequest setTaskDefinitionJson(java.util.List<UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJson> taskDefinitionJson) {
        this.taskDefinitionJson = taskDefinitionJson;
        return this;
    }
    public java.util.List<UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJson> getTaskDefinitionJson() {
        return this.taskDefinitionJson;
    }

    public UpdateProcessDefinitionWithScheduleRequest setTaskParallelism(Integer taskParallelism) {
        this.taskParallelism = taskParallelism;
        return this;
    }
    public Integer getTaskParallelism() {
        return this.taskParallelism;
    }

    public UpdateProcessDefinitionWithScheduleRequest setTaskRelationJson(java.util.List<UpdateProcessDefinitionWithScheduleRequestTaskRelationJson> taskRelationJson) {
        this.taskRelationJson = taskRelationJson;
        return this;
    }
    public java.util.List<UpdateProcessDefinitionWithScheduleRequestTaskRelationJson> getTaskRelationJson() {
        return this.taskRelationJson;
    }

    public UpdateProcessDefinitionWithScheduleRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public static class UpdateProcessDefinitionWithScheduleRequestGlobalParams extends TeaModel {
        @NameInMap("direct")
        public String direct;

        @NameInMap("prop")
        public String prop;

        @NameInMap("type")
        public String type;

        @NameInMap("value")
        public String value;

        public static UpdateProcessDefinitionWithScheduleRequestGlobalParams build(java.util.Map<String, ?> map) throws Exception {
            UpdateProcessDefinitionWithScheduleRequestGlobalParams self = new UpdateProcessDefinitionWithScheduleRequestGlobalParams();
            return TeaModel.build(map, self);
        }

        public UpdateProcessDefinitionWithScheduleRequestGlobalParams setDirect(String direct) {
            this.direct = direct;
            return this;
        }
        public String getDirect() {
            return this.direct;
        }

        public UpdateProcessDefinitionWithScheduleRequestGlobalParams setProp(String prop) {
            this.prop = prop;
            return this;
        }
        public String getProp() {
            return this.prop;
        }

        public UpdateProcessDefinitionWithScheduleRequestGlobalParams setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateProcessDefinitionWithScheduleRequestGlobalParams setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateProcessDefinitionWithScheduleRequestSchedule extends TeaModel {
        /**
         * <p>The cron expression for scheduling.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 0 * * ?</p>
         */
        @NameInMap("crontab")
        public String crontab;

        /**
         * <p>The end time of the schedule. Format: YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-12-23 16:13:27</p>
         */
        @NameInMap("endTime")
        public String endTime;

        /**
         * <p>The start time. Format: YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-23 16:13:27</p>
         */
        @NameInMap("startTime")
        public String startTime;

        /**
         * <p>The time zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("timezoneId")
        public String timezoneId;

        public static UpdateProcessDefinitionWithScheduleRequestSchedule build(java.util.Map<String, ?> map) throws Exception {
            UpdateProcessDefinitionWithScheduleRequestSchedule self = new UpdateProcessDefinitionWithScheduleRequestSchedule();
            return TeaModel.build(map, self);
        }

        public UpdateProcessDefinitionWithScheduleRequestSchedule setCrontab(String crontab) {
            this.crontab = crontab;
            return this;
        }
        public String getCrontab() {
            return this.crontab;
        }

        public UpdateProcessDefinitionWithScheduleRequestSchedule setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public UpdateProcessDefinitionWithScheduleRequestSchedule setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public UpdateProcessDefinitionWithScheduleRequestSchedule setTimezoneId(String timezoneId) {
            this.timezoneId = timezoneId;
            return this;
        }
        public String getTimezoneId() {
            return this.timezoneId;
        }

    }

    public static class UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJsonTaskParamsLocalParams extends TeaModel {
        @NameInMap("direct")
        public String direct;

        @NameInMap("prop")
        public String prop;

        @NameInMap("type")
        public String type;

        @NameInMap("value")
        public String value;

        public static UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJsonTaskParamsLocalParams build(java.util.Map<String, ?> map) throws Exception {
            UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJsonTaskParamsLocalParams self = new UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJsonTaskParamsLocalParams();
            return TeaModel.build(map, self);
        }

        public UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJsonTaskParamsLocalParams setDirect(String direct) {
            this.direct = direct;
            return this;
        }
        public String getDirect() {
            return this.direct;
        }

        public UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJsonTaskParamsLocalParams setProp(String prop) {
            this.prop = prop;
            return this;
        }
        public String getProp() {
            return this.prop;
        }

        public UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJsonTaskParamsLocalParams setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJsonTaskParamsLocalParams setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJsonTaskParamsSparkConf extends TeaModel {
        /**
         * <p>The key of the Spark configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>spark.dynamicAllocation.enabled</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The value of the Spark configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("value")
        public String value;

        public static UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJsonTaskParamsSparkConf build(java.util.Map<String, ?> map) throws Exception {
            UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJsonTaskParamsSparkConf self = new UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJsonTaskParamsSparkConf();
            return TeaModel.build(map, self);
        }

        public UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJsonTaskParamsSparkConf setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJsonTaskParamsSparkConf setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJsonTaskParams extends TeaModel {
        /**
         * <p>The display version of the Spark engine.</p>
         * 
         * <strong>example:</strong>
         * <p>esr-4.0.0 (Spark 3.5.2, Scala 2.12)</p>
         */
        @NameInMap("displaySparkVersion")
        public String displaySparkVersion;

        /**
         * <p>The environment ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ev-h*************</p>
         */
        @NameInMap("environmentId")
        public String environmentId;

        /**
         * <p>Specifies whether to enable Fusion engine acceleration.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("fusion")
        public Boolean fusion;

        @NameInMap("localParams")
        public java.util.List<UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJsonTaskParamsLocalParams> localParams;

        /**
         * <p>The name of the queue for running the node.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>root_queue</p>
         */
        @NameInMap("resourceQueueId")
        public String resourceQueueId;

        /**
         * <p>The Spark node configuration.</p>
         */
        @NameInMap("sparkConf")
        public java.util.List<UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJsonTaskParamsSparkConf> sparkConf;

        /**
         * <p>The number of cores for the Spark driver.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("sparkDriverCores")
        public Integer sparkDriverCores;

        /**
         * <p>The memory for the Spark driver.</p>
         * 
         * <strong>example:</strong>
         * <p>4g</p>
         */
        @NameInMap("sparkDriverMemory")
        public Long sparkDriverMemory;

        /**
         * <p>The number of cores for the Spark executor.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("sparkExecutorCores")
        public Integer sparkExecutorCores;

        /**
         * <p>The memory for the Spark executor.</p>
         * 
         * <strong>example:</strong>
         * <p>4g</p>
         */
        @NameInMap("sparkExecutorMemory")
        public Long sparkExecutorMemory;

        /**
         * <p>The Spark log level.</p>
         * 
         * <strong>example:</strong>
         * <p>INFO</p>
         */
        @NameInMap("sparkLogLevel")
        public String sparkLogLevel;

        /**
         * <p>The log path of the Spark node.</p>
         */
        @NameInMap("sparkLogPath")
        public String sparkLogPath;

        /**
         * <p>The Spark engine version.</p>
         * 
         * <strong>example:</strong>
         * <p>esr-4.0.0 (Spark 3.5.2, Scala 2.12)</p>
         */
        @NameInMap("sparkVersion")
        public String sparkVersion;

        /**
         * <p>The data development node ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TSK-d87******************</p>
         */
        @NameInMap("taskBizId")
        public String taskBizId;

        /**
         * <p>The Spark job type.</p>
         * 
         * <strong>example:</strong>
         * <p>SQL</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>w-d8********</p>
         */
        @NameInMap("workspaceBizId")
        public String workspaceBizId;

        public static UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJsonTaskParams build(java.util.Map<String, ?> map) throws Exception {
            UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJsonTaskParams self = new UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJsonTaskParams();
            return TeaModel.build(map, self);
        }

        public UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJsonTaskParams setDisplaySparkVersion(String displaySparkVersion) {
            this.displaySparkVersion = displaySparkVersion;
            return this;
        }
        public String getDisplaySparkVersion() {
            return this.displaySparkVersion;
        }

        public UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJsonTaskParams setEnvironmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public String getEnvironmentId() {
            return this.environmentId;
        }

        public UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJsonTaskParams setFusion(Boolean fusion) {
            this.fusion = fusion;
            return this;
        }
        public Boolean getFusion() {
            return this.fusion;
        }

        public UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJsonTaskParams setLocalParams(java.util.List<UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJsonTaskParamsLocalParams> localParams) {
            this.localParams = localParams;
            return this;
        }
        public java.util.List<UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJsonTaskParamsLocalParams> getLocalParams() {
            return this.localParams;
        }

        public UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJsonTaskParams setResourceQueueId(String resourceQueueId) {
            this.resourceQueueId = resourceQueueId;
            return this;
        }
        public String getResourceQueueId() {
            return this.resourceQueueId;
        }

        public UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJsonTaskParams setSparkConf(java.util.List<UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJsonTaskParamsSparkConf> sparkConf) {
            this.sparkConf = sparkConf;
            return this;
        }
        public java.util.List<UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJsonTaskParamsSparkConf> getSparkConf() {
            return this.sparkConf;
        }

        public UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJsonTaskParams setSparkDriverCores(Integer sparkDriverCores) {
            this.sparkDriverCores = sparkDriverCores;
            return this;
        }
        public Integer getSparkDriverCores() {
            return this.sparkDriverCores;
        }

        public UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJsonTaskParams setSparkDriverMemory(Long sparkDriverMemory) {
            this.sparkDriverMemory = sparkDriverMemory;
            return this;
        }
        public Long getSparkDriverMemory() {
            return this.sparkDriverMemory;
        }

        public UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJsonTaskParams setSparkExecutorCores(Integer sparkExecutorCores) {
            this.sparkExecutorCores = sparkExecutorCores;
            return this;
        }
        public Integer getSparkExecutorCores() {
            return this.sparkExecutorCores;
        }

        public UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJsonTaskParams setSparkExecutorMemory(Long sparkExecutorMemory) {
            this.sparkExecutorMemory = sparkExecutorMemory;
            return this;
        }
        public Long getSparkExecutorMemory() {
            return this.sparkExecutorMemory;
        }

        public UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJsonTaskParams setSparkLogLevel(String sparkLogLevel) {
            this.sparkLogLevel = sparkLogLevel;
            return this;
        }
        public String getSparkLogLevel() {
            return this.sparkLogLevel;
        }

        public UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJsonTaskParams setSparkLogPath(String sparkLogPath) {
            this.sparkLogPath = sparkLogPath;
            return this;
        }
        public String getSparkLogPath() {
            return this.sparkLogPath;
        }

        public UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJsonTaskParams setSparkVersion(String sparkVersion) {
            this.sparkVersion = sparkVersion;
            return this;
        }
        public String getSparkVersion() {
            return this.sparkVersion;
        }

        public UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJsonTaskParams setTaskBizId(String taskBizId) {
            this.taskBizId = taskBizId;
            return this;
        }
        public String getTaskBizId() {
            return this.taskBizId;
        }

        public UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJsonTaskParams setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJsonTaskParams setWorkspaceBizId(String workspaceBizId) {
            this.workspaceBizId = workspaceBizId;
            return this;
        }
        public String getWorkspaceBizId() {
            return this.workspaceBizId;
        }

    }

    public static class UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJson extends TeaModel {
        /**
         * <p>The alert email address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:foo_bar@spark.alert.invalid.com">foo_bar@spark.alert.invalid.com</a></p>
         */
        @NameInMap("alertEmailAddress")
        public String alertEmailAddress;

        /**
         * <p>The node definition ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>23************</p>
         */
        @NameInMap("code")
        public Long code;

        /**
         * <p>The node definition description.</p>
         * 
         * <strong>example:</strong>
         * <p>ods transform task</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Specifies whether to enable alerts for node failures.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("failAlertEnable")
        public Boolean failAlertEnable;

        /**
         * <p>The number of retries after a node fails.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("failRetryTimes")
        public Integer failRetryTimes;

        /**
         * <p>The node name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ods_transform_task</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Specifies whether to enable alerts for node startup.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("startAlertEnable")
        public Boolean startAlertEnable;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("tags")
        public java.util.Map<String, String> tags;

        /**
         * <p>The node definition parameters.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("taskParams")
        public UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJsonTaskParams taskParams;

        /**
         * <p>The workflow node type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>EMR-SERVERLESS-SPARK</p>
         */
        @NameInMap("taskType")
        public String taskType;

        /**
         * <p>The default timeout for node execution.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("timeout")
        public Integer timeout;

        public static UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJson build(java.util.Map<String, ?> map) throws Exception {
            UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJson self = new UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJson();
            return TeaModel.build(map, self);
        }

        public UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJson setAlertEmailAddress(String alertEmailAddress) {
            this.alertEmailAddress = alertEmailAddress;
            return this;
        }
        public String getAlertEmailAddress() {
            return this.alertEmailAddress;
        }

        public UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJson setCode(Long code) {
            this.code = code;
            return this;
        }
        public Long getCode() {
            return this.code;
        }

        public UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJson setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJson setFailAlertEnable(Boolean failAlertEnable) {
            this.failAlertEnable = failAlertEnable;
            return this;
        }
        public Boolean getFailAlertEnable() {
            return this.failAlertEnable;
        }

        public UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJson setFailRetryTimes(Integer failRetryTimes) {
            this.failRetryTimes = failRetryTimes;
            return this;
        }
        public Integer getFailRetryTimes() {
            return this.failRetryTimes;
        }

        public UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJson setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJson setStartAlertEnable(Boolean startAlertEnable) {
            this.startAlertEnable = startAlertEnable;
            return this;
        }
        public Boolean getStartAlertEnable() {
            return this.startAlertEnable;
        }

        public UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJson setTags(java.util.Map<String, String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, String> getTags() {
            return this.tags;
        }

        public UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJson setTaskParams(UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJsonTaskParams taskParams) {
            this.taskParams = taskParams;
            return this;
        }
        public UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJsonTaskParams getTaskParams() {
            return this.taskParams;
        }

        public UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJson setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJson setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

    }

    public static class UpdateProcessDefinitionWithScheduleRequestTaskRelationJson extends TeaModel {
        /**
         * <p>The name of the node topology relationship. Set this parameter to the workflow name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ods batch workflow</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The downstream node ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>19************</p>
         */
        @NameInMap("postTaskCode")
        public Long postTaskCode;

        /**
         * <p>The downstream node version.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("postTaskVersion")
        public Integer postTaskVersion;

        /**
         * <p>The upstream node ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>16************</p>
         */
        @NameInMap("preTaskCode")
        public Long preTaskCode;

        /**
         * <p>The upstream node version.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("preTaskVersion")
        public Integer preTaskVersion;

        public static UpdateProcessDefinitionWithScheduleRequestTaskRelationJson build(java.util.Map<String, ?> map) throws Exception {
            UpdateProcessDefinitionWithScheduleRequestTaskRelationJson self = new UpdateProcessDefinitionWithScheduleRequestTaskRelationJson();
            return TeaModel.build(map, self);
        }

        public UpdateProcessDefinitionWithScheduleRequestTaskRelationJson setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateProcessDefinitionWithScheduleRequestTaskRelationJson setPostTaskCode(Long postTaskCode) {
            this.postTaskCode = postTaskCode;
            return this;
        }
        public Long getPostTaskCode() {
            return this.postTaskCode;
        }

        public UpdateProcessDefinitionWithScheduleRequestTaskRelationJson setPostTaskVersion(Integer postTaskVersion) {
            this.postTaskVersion = postTaskVersion;
            return this;
        }
        public Integer getPostTaskVersion() {
            return this.postTaskVersion;
        }

        public UpdateProcessDefinitionWithScheduleRequestTaskRelationJson setPreTaskCode(Long preTaskCode) {
            this.preTaskCode = preTaskCode;
            return this;
        }
        public Long getPreTaskCode() {
            return this.preTaskCode;
        }

        public UpdateProcessDefinitionWithScheduleRequestTaskRelationJson setPreTaskVersion(Integer preTaskVersion) {
            this.preTaskVersion = preTaskVersion;
            return this;
        }
        public Integer getPreTaskVersion() {
            return this.preTaskVersion;
        }

    }

}
