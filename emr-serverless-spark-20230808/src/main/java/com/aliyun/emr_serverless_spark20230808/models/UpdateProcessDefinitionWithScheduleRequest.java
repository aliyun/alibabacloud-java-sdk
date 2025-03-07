// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class UpdateProcessDefinitionWithScheduleRequest extends TeaModel {
    /**
     * <p>The email address to receive alerts.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:foo_bar@spark.alert.invalid.com">foo_bar@spark.alert.invalid.com</a></p>
     */
    @NameInMap("alertEmailAddress")
    public String alertEmailAddress;

    /**
     * <p>The description of the workflow.</p>
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

    /**
     * <p>The name of the workflow.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ods_batch_workflow</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The code of the service.</p>
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
     * <p>The status of the workflow.</p>
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
     * <p>The scheduling settings.</p>
     */
    @NameInMap("schedule")
    public UpdateProcessDefinitionWithScheduleRequestSchedule schedule;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("tags")
    public java.util.Map<String, String> tags;

    /**
     * <p>The descriptions of all nodes in the workflow.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("taskDefinitionJson")
    public java.util.List<UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJson> taskDefinitionJson;

    /**
     * <p>The node parallelism.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("taskParallelism")
    public Integer taskParallelism;

    /**
     * <p>The dependencies of all nodes in the workflow. preTaskCode specifies the ID of an upstream node, and postTaskCode specifies the ID of a downstream node. The ID of each node is unique. If a node does not have an upstream node, set preTaskCode to 0.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("taskRelationJson")
    public java.util.List<UpdateProcessDefinitionWithScheduleRequestTaskRelationJson> taskRelationJson;

    /**
     * <p>The default timeout period of the workflow.</p>
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

    public static class UpdateProcessDefinitionWithScheduleRequestSchedule extends TeaModel {
        /**
         * <p>The CRON expression that is used for scheduling.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 0 * * ?</p>
         */
        @NameInMap("crontab")
        public String crontab;

        /**
         * <p>The end time of the scheduling.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-12-23 16:13:27</p>
         */
        @NameInMap("endTime")
        public String endTime;

        /**
         * <p>The start time of the scheduling.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-23 16:13:27</p>
         */
        @NameInMap("startTime")
        public String startTime;

        /**
         * <p>The ID of the time zone.</p>
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

    public static class UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJsonTaskParamsSparkConf extends TeaModel {
        /**
         * <p>The key of the SparkConf object.</p>
         * 
         * <strong>example:</strong>
         * <p>spark.dynamicAllocation.enabled</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The value of the SparkConf object.</p>
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
         * <p>The displayed version of the Spark engine.</p>
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
         * <p>Specifies whether to enable Fusion engine for acceleration.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("fusion")
        public Boolean fusion;

        /**
         * <p>The name of the queue on which the job runs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>root_queue</p>
         */
        @NameInMap("resourceQueueId")
        public String resourceQueueId;

        /**
         * <p>The configurations of the Spark jobs.</p>
         */
        @NameInMap("sparkConf")
        public java.util.List<UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJsonTaskParamsSparkConf> sparkConf;

        /**
         * <p>The number of driver cores of the Spark job.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("sparkDriverCores")
        public Integer sparkDriverCores;

        /**
         * <p>The size of driver memory of the Spark job.</p>
         * 
         * <strong>example:</strong>
         * <p>4g</p>
         */
        @NameInMap("sparkDriverMemory")
        public Long sparkDriverMemory;

        /**
         * <p>The number of executor cores of the Spark job.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("sparkExecutorCores")
        public Integer sparkExecutorCores;

        /**
         * <p>The size of executor memory of the Spark job.</p>
         * 
         * <strong>example:</strong>
         * <p>4g</p>
         */
        @NameInMap("sparkExecutorMemory")
        public Long sparkExecutorMemory;

        /**
         * <p>The level of the Spark log.</p>
         * 
         * <strong>example:</strong>
         * <p>INFO</p>
         */
        @NameInMap("sparkLogLevel")
        public String sparkLogLevel;

        /**
         * <p>The path where the operational logs of the Spark job are stored.</p>
         */
        @NameInMap("sparkLogPath")
        public String sparkLogPath;

        /**
         * <p>The version of the Spark engine.</p>
         * 
         * <strong>example:</strong>
         * <p>esr-4.0.0 (Spark 3.5.2, Scala 2.12)</p>
         */
        @NameInMap("sparkVersion")
        public String sparkVersion;

        /**
         * <p>The ID of the data development job.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TSK-d87******************</p>
         */
        @NameInMap("taskBizId")
        public String taskBizId;

        /**
         * <p>The type of the Spark job.</p>
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
         * <p>The email address to receive alerts.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:foo_bar@spark.alert.invalid.com">foo_bar@spark.alert.invalid.com</a></p>
         */
        @NameInMap("alertEmailAddress")
        public String alertEmailAddress;

        /**
         * <p>The node ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>23************</p>
         */
        @NameInMap("code")
        public Long code;

        /**
         * <p>The node description.</p>
         * 
         * <strong>example:</strong>
         * <p>ods transform task</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Specifies whether to send alerts when the node fails.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("failAlertEnable")
        public Boolean failAlertEnable;

        /**
         * <p>The number of retries when the node fails.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("failRetryTimes")
        public Integer failRetryTimes;

        /**
         * <p>The name of the node.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ods_transform_task</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Specifies whether to send alerts when the node is started.</p>
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
         * <p>The job parameters.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("taskParams")
        public UpdateProcessDefinitionWithScheduleRequestTaskDefinitionJsonTaskParams taskParams;

        /**
         * <p>The type of the node.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>EMR-SERVERLESS-SPARK</p>
         */
        @NameInMap("taskType")
        public String taskType;

        /**
         * <p>The default timeout period of the node.</p>
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
         * <p>The name of the node topology. You can enter a workflow name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ods batch workflow</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The ID of the downstream node.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>19************</p>
         */
        @NameInMap("postTaskCode")
        public Long postTaskCode;

        /**
         * <p>The version of the downstream node.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("postTaskVersion")
        public Integer postTaskVersion;

        /**
         * <p>The ID of the upstream node.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>16************</p>
         */
        @NameInMap("preTaskCode")
        public Long preTaskCode;

        /**
         * <p>The version of the upstream node.</p>
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
