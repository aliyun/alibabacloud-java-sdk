// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListEventStreamingsResponseBody extends TeaModel {
    /**
     * <p>The response code. Valid values:</p>
     * <p>Success: The request is successful.</p>
     * <p>Other codes: The request failed. For more information about error codes, see Error codes.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public ListEventStreamingsResponseBodyData data;

    /**
     * <p>The returned error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The event streaming [xxxx] not existed!</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>283FF852-C4B8-58C9-9777-F88A5A16A79F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. The value true indicates that the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListEventStreamingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEventStreamingsResponseBody self = new ListEventStreamingsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEventStreamingsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListEventStreamingsResponseBody setData(ListEventStreamingsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListEventStreamingsResponseBodyData getData() {
        return this.data;
    }

    public ListEventStreamingsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListEventStreamingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEventStreamingsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsRunOptionsBatchWindow extends TeaModel {
        /**
         * <p>The maximum number of events that are allowed in the batch window. When this threshold is reached, data in the window is pushed to the downstream service. When multiple batch windows exist, data is pushed if triggering conditions are met in one of the windows.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CountBasedWindow")
        public Integer countBasedWindow;

        /**
         * <p>The maximum period of time during which events are allowed in the batch window. Unit: seconds. When this threshold is reached, data in the window is pushed to the downstream service. When multiple batch windows exist, data is pushed if triggering conditions are met in one of the windows.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TimeBasedWindow")
        public Integer timeBasedWindow;

        public static ListEventStreamingsResponseBodyDataEventStreamingsRunOptionsBatchWindow build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsRunOptionsBatchWindow self = new ListEventStreamingsResponseBodyDataEventStreamingsRunOptionsBatchWindow();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsRunOptionsBatchWindow setCountBasedWindow(Integer countBasedWindow) {
            this.countBasedWindow = countBasedWindow;
            return this;
        }
        public Integer getCountBasedWindow() {
            return this.countBasedWindow;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsRunOptionsBatchWindow setTimeBasedWindow(Integer timeBasedWindow) {
            this.timeBasedWindow = timeBasedWindow;
            return this;
        }
        public Integer getTimeBasedWindow() {
            return this.timeBasedWindow;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsRunOptionsDeadLetterQueue extends TeaModel {
        /**
         * <p>The ARN of the dead-letter queue.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::1597871211794192:role/aliyunsaedefaultrole</p>
         */
        @NameInMap("Arn")
        public String arn;

        public static ListEventStreamingsResponseBodyDataEventStreamingsRunOptionsDeadLetterQueue build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsRunOptionsDeadLetterQueue self = new ListEventStreamingsResponseBodyDataEventStreamingsRunOptionsDeadLetterQueue();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsRunOptionsDeadLetterQueue setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsRunOptionsRetryStrategy extends TeaModel {
        /**
         * <p>The maximum timeout period for a retry.</p>
         * 
         * <strong>example:</strong>
         * <p>512</p>
         */
        @NameInMap("MaximumEventAgeInSeconds")
        public Float maximumEventAgeInSeconds;

        /**
         * <p>The maximum number of retries.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MaximumRetryAttempts")
        public Float maximumRetryAttempts;

        /**
         * <p>The retry policy. Valid values: BACKOFF_RETRY and EXPONENTIAL_DECAY_RETRY.</p>
         * 
         * <strong>example:</strong>
         * <p>EXPONENTIALDECAY_RETRY</p>
         */
        @NameInMap("PushRetryStrategy")
        public String pushRetryStrategy;

        public static ListEventStreamingsResponseBodyDataEventStreamingsRunOptionsRetryStrategy build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsRunOptionsRetryStrategy self = new ListEventStreamingsResponseBodyDataEventStreamingsRunOptionsRetryStrategy();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsRunOptionsRetryStrategy setMaximumEventAgeInSeconds(Float maximumEventAgeInSeconds) {
            this.maximumEventAgeInSeconds = maximumEventAgeInSeconds;
            return this;
        }
        public Float getMaximumEventAgeInSeconds() {
            return this.maximumEventAgeInSeconds;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsRunOptionsRetryStrategy setMaximumRetryAttempts(Float maximumRetryAttempts) {
            this.maximumRetryAttempts = maximumRetryAttempts;
            return this;
        }
        public Float getMaximumRetryAttempts() {
            return this.maximumRetryAttempts;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsRunOptionsRetryStrategy setPushRetryStrategy(String pushRetryStrategy) {
            this.pushRetryStrategy = pushRetryStrategy;
            return this;
        }
        public String getPushRetryStrategy() {
            return this.pushRetryStrategy;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsRunOptions extends TeaModel {
        /**
         * <p>The batch window.</p>
         */
        @NameInMap("BatchWindow")
        public ListEventStreamingsResponseBodyDataEventStreamingsRunOptionsBatchWindow batchWindow;

        /**
         * <p>Indicates whether dead-letter queues are enabled. By default, dead-letter queues are disabled. Events that fail to be pushed are discarded after the maximum number of retries that is specified by the retry policy is reached.</p>
         */
        @NameInMap("DeadLetterQueue")
        public ListEventStreamingsResponseBodyDataEventStreamingsRunOptionsDeadLetterQueue deadLetterQueue;

        /**
         * <p>The exception tolerance policy. Valid values: NONE and ALL.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("ErrorsTolerance")
        public String errorsTolerance;

        /**
         * <p>The maximum number of concurrent tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MaximumTasks")
        public Integer maximumTasks;

        /**
         * <p>The retry policy that is used if events fail to be pushed.</p>
         */
        @NameInMap("RetryStrategy")
        public ListEventStreamingsResponseBodyDataEventStreamingsRunOptionsRetryStrategy retryStrategy;

        public static ListEventStreamingsResponseBodyDataEventStreamingsRunOptions build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsRunOptions self = new ListEventStreamingsResponseBodyDataEventStreamingsRunOptions();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsRunOptions setBatchWindow(ListEventStreamingsResponseBodyDataEventStreamingsRunOptionsBatchWindow batchWindow) {
            this.batchWindow = batchWindow;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsRunOptionsBatchWindow getBatchWindow() {
            return this.batchWindow;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsRunOptions setDeadLetterQueue(ListEventStreamingsResponseBodyDataEventStreamingsRunOptionsDeadLetterQueue deadLetterQueue) {
            this.deadLetterQueue = deadLetterQueue;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsRunOptionsDeadLetterQueue getDeadLetterQueue() {
            return this.deadLetterQueue;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsRunOptions setErrorsTolerance(String errorsTolerance) {
            this.errorsTolerance = errorsTolerance;
            return this;
        }
        public String getErrorsTolerance() {
            return this.errorsTolerance;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsRunOptions setMaximumTasks(Integer maximumTasks) {
            this.maximumTasks = maximumTasks;
            return this;
        }
        public Integer getMaximumTasks() {
            return this.maximumTasks;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsRunOptions setRetryStrategy(ListEventStreamingsResponseBodyDataEventStreamingsRunOptionsRetryStrategy retryStrategy) {
            this.retryStrategy = retryStrategy;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsRunOptionsRetryStrategy getRetryStrategy() {
            return this.retryStrategy;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkApacheRocketMQCheckpointParametersConsumeTimestamp extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkApacheRocketMQCheckpointParametersConsumeTimestamp build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkApacheRocketMQCheckpointParametersConsumeTimestamp self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkApacheRocketMQCheckpointParametersConsumeTimestamp();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkApacheRocketMQCheckpointParametersConsumeTimestamp setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkApacheRocketMQCheckpointParametersConsumeTimestamp setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkApacheRocketMQCheckpointParametersConsumeTimestamp setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkApacheRocketMQCheckpointParametersGroup extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkApacheRocketMQCheckpointParametersGroup build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkApacheRocketMQCheckpointParametersGroup self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkApacheRocketMQCheckpointParametersGroup();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkApacheRocketMQCheckpointParametersGroup setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkApacheRocketMQCheckpointParametersGroup setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkApacheRocketMQCheckpointParametersGroup setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkApacheRocketMQCheckpointParametersTopic extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkApacheRocketMQCheckpointParametersTopic build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkApacheRocketMQCheckpointParametersTopic self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkApacheRocketMQCheckpointParametersTopic();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkApacheRocketMQCheckpointParametersTopic setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkApacheRocketMQCheckpointParametersTopic setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkApacheRocketMQCheckpointParametersTopic setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkApacheRocketMQCheckpointParameters extends TeaModel {
        @NameInMap("ConsumeTimestamp")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkApacheRocketMQCheckpointParametersConsumeTimestamp consumeTimestamp;

        @NameInMap("Group")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkApacheRocketMQCheckpointParametersGroup group;

        @NameInMap("InstanceEndpoint")
        public String instanceEndpoint;

        @NameInMap("InstancePassword")
        public String instancePassword;

        @NameInMap("InstanceUsername")
        public String instanceUsername;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("Topic")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkApacheRocketMQCheckpointParametersTopic topic;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("VpcId")
        public String vpcId;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkApacheRocketMQCheckpointParameters build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkApacheRocketMQCheckpointParameters self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkApacheRocketMQCheckpointParameters();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkApacheRocketMQCheckpointParameters setConsumeTimestamp(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkApacheRocketMQCheckpointParametersConsumeTimestamp consumeTimestamp) {
            this.consumeTimestamp = consumeTimestamp;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkApacheRocketMQCheckpointParametersConsumeTimestamp getConsumeTimestamp() {
            return this.consumeTimestamp;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkApacheRocketMQCheckpointParameters setGroup(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkApacheRocketMQCheckpointParametersGroup group) {
            this.group = group;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkApacheRocketMQCheckpointParametersGroup getGroup() {
            return this.group;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkApacheRocketMQCheckpointParameters setInstanceEndpoint(String instanceEndpoint) {
            this.instanceEndpoint = instanceEndpoint;
            return this;
        }
        public String getInstanceEndpoint() {
            return this.instanceEndpoint;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkApacheRocketMQCheckpointParameters setInstancePassword(String instancePassword) {
            this.instancePassword = instancePassword;
            return this;
        }
        public String getInstancePassword() {
            return this.instancePassword;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkApacheRocketMQCheckpointParameters setInstanceUsername(String instanceUsername) {
            this.instanceUsername = instanceUsername;
            return this;
        }
        public String getInstanceUsername() {
            return this.instanceUsername;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkApacheRocketMQCheckpointParameters setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkApacheRocketMQCheckpointParameters setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkApacheRocketMQCheckpointParameters setTopic(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkApacheRocketMQCheckpointParametersTopic topic) {
            this.topic = topic;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkApacheRocketMQCheckpointParametersTopic getTopic() {
            return this.topic;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkApacheRocketMQCheckpointParameters setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkApacheRocketMQCheckpointParameters setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkCustomizedKafkaConnectorParametersConnectorParameters extends TeaModel {
        @NameInMap("Config")
        public java.util.Map<String, ?> config;

        @NameInMap("Name")
        public String name;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkCustomizedKafkaConnectorParametersConnectorParameters build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkCustomizedKafkaConnectorParametersConnectorParameters self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkCustomizedKafkaConnectorParametersConnectorParameters();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkCustomizedKafkaConnectorParametersConnectorParameters setConfig(java.util.Map<String, ?> config) {
            this.config = config;
            return this;
        }
        public java.util.Map<String, ?> getConfig() {
            return this.config;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkCustomizedKafkaConnectorParametersConnectorParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkCustomizedKafkaConnectorParameters extends TeaModel {
        @NameInMap("ConnectorPackageUrl")
        public String connectorPackageUrl;

        @NameInMap("ConnectorParameters")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkCustomizedKafkaConnectorParametersConnectorParameters connectorParameters;

        @NameInMap("WorkerParameters")
        public java.util.Map<String, ?> workerParameters;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkCustomizedKafkaConnectorParameters build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkCustomizedKafkaConnectorParameters self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkCustomizedKafkaConnectorParameters();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkCustomizedKafkaConnectorParameters setConnectorPackageUrl(String connectorPackageUrl) {
            this.connectorPackageUrl = connectorPackageUrl;
            return this;
        }
        public String getConnectorPackageUrl() {
            return this.connectorPackageUrl;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkCustomizedKafkaConnectorParameters setConnectorParameters(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkCustomizedKafkaConnectorParametersConnectorParameters connectorParameters) {
            this.connectorParameters = connectorParameters;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkCustomizedKafkaConnectorParametersConnectorParameters getConnectorParameters() {
            return this.connectorParameters;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkCustomizedKafkaConnectorParameters setWorkerParameters(java.util.Map<String, ?> workerParameters) {
            this.workerParameters = workerParameters;
            return this;
        }
        public java.util.Map<String, ?> getWorkerParameters() {
            return this.workerParameters;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkCustomizedKafkaParameters extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkCustomizedKafkaParameters build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkCustomizedKafkaParameters self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkCustomizedKafkaParameters();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkCustomizedKafkaParameters setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDashVectorParametersDashVectorSchemaParameters extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDashVectorParametersDashVectorSchemaParameters build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDashVectorParametersDashVectorSchemaParameters self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDashVectorParametersDashVectorSchemaParameters();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDashVectorParametersDashVectorSchemaParameters setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDashVectorParametersDashVectorSchemaParameters setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDashVectorParametersDashVectorSchemaParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDashVectorParametersPartition extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDashVectorParametersPartition build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDashVectorParametersPartition self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDashVectorParametersPartition();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDashVectorParametersPartition setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDashVectorParametersPartition setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDashVectorParametersPartition setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDashVectorParametersPrimaryKeyId extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDashVectorParametersPrimaryKeyId build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDashVectorParametersPrimaryKeyId self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDashVectorParametersPrimaryKeyId();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDashVectorParametersPrimaryKeyId setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDashVectorParametersPrimaryKeyId setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDashVectorParametersPrimaryKeyId setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDashVectorParametersVector extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDashVectorParametersVector build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDashVectorParametersVector self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDashVectorParametersVector();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDashVectorParametersVector setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDashVectorParametersVector setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDashVectorParametersVector setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDashVectorParameters extends TeaModel {
        @NameInMap("ApiKey")
        public String apiKey;

        @NameInMap("Collection")
        public String collection;

        @NameInMap("DashVectorSchemaParameters")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDashVectorParametersDashVectorSchemaParameters dashVectorSchemaParameters;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Network")
        public String network;

        @NameInMap("Operation")
        public String operation;

        @NameInMap("Partition")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDashVectorParametersPartition partition;

        @NameInMap("PrimaryKeyId")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDashVectorParametersPrimaryKeyId primaryKeyId;

        @NameInMap("Vector")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDashVectorParametersVector vector;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDashVectorParameters build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDashVectorParameters self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDashVectorParameters();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDashVectorParameters setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDashVectorParameters setCollection(String collection) {
            this.collection = collection;
            return this;
        }
        public String getCollection() {
            return this.collection;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDashVectorParameters setDashVectorSchemaParameters(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDashVectorParametersDashVectorSchemaParameters dashVectorSchemaParameters) {
            this.dashVectorSchemaParameters = dashVectorSchemaParameters;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDashVectorParametersDashVectorSchemaParameters getDashVectorSchemaParameters() {
            return this.dashVectorSchemaParameters;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDashVectorParameters setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDashVectorParameters setNetwork(String network) {
            this.network = network;
            return this;
        }
        public String getNetwork() {
            return this.network;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDashVectorParameters setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDashVectorParameters setPartition(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDashVectorParametersPartition partition) {
            this.partition = partition;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDashVectorParametersPartition getPartition() {
            return this.partition;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDashVectorParameters setPrimaryKeyId(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDashVectorParametersPrimaryKeyId primaryKeyId) {
            this.primaryKeyId = primaryKeyId;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDashVectorParametersPrimaryKeyId getPrimaryKeyId() {
            return this.primaryKeyId;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDashVectorParameters setVector(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDashVectorParametersVector vector) {
            this.vector = vector;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDashVectorParametersVector getVector() {
            return this.vector;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersBody extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersBody build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersBody self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersBody();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersBody setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersBody setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersBody setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersProject extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersProject build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersProject self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersProject();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersProject setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersProject setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersProject setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersRoleName extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersRoleName build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersRoleName self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersRoleName();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersRoleName setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersRoleName setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersRoleName setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersTopic extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersTopic build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersTopic self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersTopic();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersTopic setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersTopic setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersTopic setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersTopicSchema extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersTopicSchema build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersTopicSchema self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersTopicSchema();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersTopicSchema setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersTopicSchema setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersTopicSchema setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersTopicType extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersTopicType build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersTopicType self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersTopicType();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersTopicType setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersTopicType setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersTopicType setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParameters extends TeaModel {
        @NameInMap("Body")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersBody body;

        @NameInMap("Project")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersProject project;

        @NameInMap("RoleName")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersRoleName roleName;

        @NameInMap("Topic")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersTopic topic;

        @NameInMap("TopicSchema")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersTopicSchema topicSchema;

        @NameInMap("TopicType")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersTopicType topicType;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParameters build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParameters self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParameters();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParameters setBody(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersBody body) {
            this.body = body;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersBody getBody() {
            return this.body;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParameters setProject(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersProject project) {
            this.project = project;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersProject getProject() {
            return this.project;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParameters setRoleName(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersRoleName roleName) {
            this.roleName = roleName;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersRoleName getRoleName() {
            return this.roleName;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParameters setTopic(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersTopic topic) {
            this.topic = topic;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersTopic getTopic() {
            return this.topic;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParameters setTopicSchema(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersTopicSchema topicSchema) {
            this.topicSchema = topicSchema;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersTopicSchema getTopicSchema() {
            return this.topicSchema;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParameters setTopicType(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersTopicType topicType) {
            this.topicType = topicType;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParametersTopicType getTopicType() {
            return this.topicType;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersBody extends TeaModel {
        /**
         * <p>The method that is used to transform events.</p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which events are transformed.</p>
         * 
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value before transformation.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;key&quot;: &quot;value&quot;
         * }</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersBody build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersBody self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersBody();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersBody setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersBody setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersBody setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersConcurrency extends TeaModel {
        /**
         * <p>The method that is used to transform events. Default value: CONSTANT.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>None.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The delivery concurrency. Minimum value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersConcurrency build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersConcurrency self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersConcurrency();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersConcurrency setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersConcurrency setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersConcurrency setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersDataFormat extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersDataFormat build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersDataFormat self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersDataFormat();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersDataFormat setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersDataFormat setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersDataFormat setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersFunctionName extends TeaModel {
        /**
         * <p>The method that is used to transform events. Default value: CONSTANT.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>None.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The function name.</p>
         * 
         * <strong>example:</strong>
         * <p>mFunction</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersFunctionName build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersFunctionName self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersFunctionName();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersFunctionName setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersFunctionName setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersFunctionName setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersInvocationType extends TeaModel {
        /**
         * <p>The method that is used to transform events. Default value: CONSTANT.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>None.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The invocation mode. Valid values:</p>
         * <ul>
         * <li>Sync</li>
         * <li>Async</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Async</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersInvocationType build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersInvocationType self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersInvocationType();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersInvocationType setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersInvocationType setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersInvocationType setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersQualifier extends TeaModel {
        /**
         * <p>The method that is used to transform events. Default value: CONSTANT.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>None.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The alias of the service to which the function belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>LATEST</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersQualifier build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersQualifier self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersQualifier();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersQualifier setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersQualifier setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersQualifier setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersServiceName extends TeaModel {
        /**
         * <p>The method that is used to transform events. Default value: CONSTANT.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>None.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The service name.</p>
         * 
         * <strong>example:</strong>
         * <p>myService</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersServiceName build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersServiceName self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersServiceName();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersServiceName setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersServiceName setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersServiceName setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParameters extends TeaModel {
        /**
         * <p>The message body that is delivered to Function Compute.</p>
         */
        @NameInMap("Body")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersBody body;

        /**
         * <p>The delivery concurrency. Minimum value: 1.</p>
         */
        @NameInMap("Concurrency")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersConcurrency concurrency;

        @NameInMap("DataFormat")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersDataFormat dataFormat;

        /**
         * <p>The function name.</p>
         */
        @NameInMap("FunctionName")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersFunctionName functionName;

        /**
         * <p>The invocation mode. Valid values:</p>
         * <ul>
         * <li>Sync</li>
         * <li>Async</li>
         * </ul>
         */
        @NameInMap("InvocationType")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersInvocationType invocationType;

        /**
         * <p>The alias of the service to which the function belongs.</p>
         */
        @NameInMap("Qualifier")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersQualifier qualifier;

        /**
         * <p>The service name.</p>
         */
        @NameInMap("ServiceName")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersServiceName serviceName;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParameters build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParameters self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParameters();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParameters setBody(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersBody body) {
            this.body = body;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersBody getBody() {
            return this.body;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParameters setConcurrency(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersConcurrency concurrency) {
            this.concurrency = concurrency;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersConcurrency getConcurrency() {
            return this.concurrency;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParameters setDataFormat(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersDataFormat dataFormat) {
            this.dataFormat = dataFormat;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersDataFormat getDataFormat() {
            return this.dataFormat;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParameters setFunctionName(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersFunctionName functionName) {
            this.functionName = functionName;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersFunctionName getFunctionName() {
            return this.functionName;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParameters setInvocationType(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersInvocationType invocationType) {
            this.invocationType = invocationType;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersInvocationType getInvocationType() {
            return this.invocationType;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParameters setQualifier(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersQualifier qualifier) {
            this.qualifier = qualifier;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersQualifier getQualifier() {
            return this.qualifier;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParameters setServiceName(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersServiceName serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersServiceName getServiceName() {
            return this.serviceName;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFnfParametersExecutionName extends TeaModel {
        /**
         * <p>The method that is used to transform events. Default value: CONSTANT.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which events are transformed.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The execution name.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFnfParametersExecutionName build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFnfParametersExecutionName self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFnfParametersExecutionName();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFnfParametersExecutionName setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFnfParametersExecutionName setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFnfParametersExecutionName setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFnfParametersFlowName extends TeaModel {
        /**
         * <p>The method that is used to transform events. Default value: CONSTANT.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which events are transformed.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The flow name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-streaming-fnf</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFnfParametersFlowName build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFnfParametersFlowName self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFnfParametersFlowName();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFnfParametersFlowName setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFnfParametersFlowName setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFnfParametersFlowName setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFnfParametersInput extends TeaModel {
        /**
         * <p>The method that is used to transform events. Default value: CONSTANT.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which events are transformed.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The input information of the execution.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFnfParametersInput build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFnfParametersInput self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFnfParametersInput();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFnfParametersInput setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFnfParametersInput setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFnfParametersInput setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFnfParametersRoleName extends TeaModel {
        /**
         * <p>The method that is used to transform events. Default value: CONSTANT.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which events are transformed.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The role configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>Al<strong><strong>FNF-x</strong></strong></p>
         */
        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFnfParametersRoleName build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFnfParametersRoleName self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFnfParametersRoleName();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFnfParametersRoleName setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFnfParametersRoleName setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFnfParametersRoleName setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFnfParameters extends TeaModel {
        /**
         * <p>The execution name.</p>
         */
        @NameInMap("ExecutionName")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFnfParametersExecutionName executionName;

        /**
         * <p>The flow name.</p>
         */
        @NameInMap("FlowName")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFnfParametersFlowName flowName;

        /**
         * <p>The input information of the execution.</p>
         */
        @NameInMap("Input")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFnfParametersInput input;

        /**
         * <p>The role name.</p>
         */
        @NameInMap("RoleName")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFnfParametersRoleName roleName;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFnfParameters build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFnfParameters self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFnfParameters();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFnfParameters setExecutionName(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFnfParametersExecutionName executionName) {
            this.executionName = executionName;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFnfParametersExecutionName getExecutionName() {
            return this.executionName;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFnfParameters setFlowName(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFnfParametersFlowName flowName) {
            this.flowName = flowName;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFnfParametersFlowName getFlowName() {
            return this.flowName;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFnfParameters setInput(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFnfParametersInput input) {
            this.input = input;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFnfParametersInput getInput() {
            return this.input;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFnfParameters setRoleName(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFnfParametersRoleName roleName) {
            this.roleName = roleName;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFnfParametersRoleName getRoleName() {
            return this.roleName;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParametersAcks extends TeaModel {
        /**
         * <p>The method that is used to transform events. Default value: CONSTANT.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>None.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The ACK mode.</p>
         * <ul>
         * <li>If you set this parameter to 0, no response is returned from the broker. In this mode, the performance is high, but the risk of data loss is also high.</li>
         * <li>If you set this parameter to 1, a response is returned when data is written to the leader. In this mode, the performance and the risk of data loss are moderate. Data loss may occur if a failure occurs on the leader.</li>
         * <li>If you set this parameter to all, a response is returned when data is written to the leader and synchronized to the followers. In this mode, the performance is low, but the risk of data loss is also low. Data loss occurs if the leader and the followers fail at the same time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParametersAcks build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParametersAcks self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParametersAcks();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParametersAcks setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParametersAcks setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParametersAcks setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParametersInstanceId extends TeaModel {
        /**
         * <p>The method that is used to transform events. Default value: CONSTANT.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>None.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The ID of the ApsaraMQ for Kafka instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Defaut_1283278472_sadkj</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParametersInstanceId build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParametersInstanceId self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParametersInstanceId();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParametersInstanceId setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParametersInstanceId setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParametersInstanceId setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParametersKey extends TeaModel {
        /**
         * <p>The method that is used to transform events. Default value: CONSTANT.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>None.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The message key.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParametersKey build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParametersKey self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParametersKey();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParametersKey setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParametersKey setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParametersKey setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParametersTopic extends TeaModel {
        /**
         * <p>The method that is used to transform events. Default value: CONSTANT.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>None.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The name of the topic on the ApsaraMQ for Kafka instance.</p>
         * 
         * <strong>example:</strong>
         * <p>topic</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParametersTopic build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParametersTopic self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParametersTopic();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParametersTopic setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParametersTopic setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParametersTopic setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParametersValue extends TeaModel {
        /**
         * <p>The method that is used to transform events.</p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which events are transformed.</p>
         * 
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value before transformation.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;key&quot;: &quot;value&quot;
         * }</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParametersValue build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParametersValue self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParametersValue();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParametersValue setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParametersValue setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParametersValue setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParameters extends TeaModel {
        /**
         * <p>The acknowledgment (ACK) mode.</p>
         * <ul>
         * <li>If you set this parameter to 0, no response is returned from the broker. In this mode, the performance is high, but the risk of data loss is also high.</li>
         * <li>If you set this parameter to 1, a response is returned when data is written to the leader. In this mode, the performance and the risk of data loss are moderate. Data loss may occur if a failure occurs on the leader.</li>
         * <li>If you set this parameter to all, a response is returned when data is written to the leader and synchronized to the followers. In this mode, the performance is low, but the risk of data loss is also low. Data loss occurs if the leader and the followers fail at the same time.</li>
         * </ul>
         */
        @NameInMap("Acks")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParametersAcks acks;

        /**
         * <p>The ID of the ApsaraMQ for Kafka instance.</p>
         */
        @NameInMap("InstanceId")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParametersInstanceId instanceId;

        /**
         * <p>The message key.</p>
         */
        @NameInMap("Key")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParametersKey key;

        /**
         * <p>The name of the topic on the ApsaraMQ for Kafka instance.</p>
         */
        @NameInMap("Topic")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParametersTopic topic;

        /**
         * <p>The message body.</p>
         */
        @NameInMap("Value")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParametersValue value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParameters build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParameters self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParameters();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParameters setAcks(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParametersAcks acks) {
            this.acks = acks;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParametersAcks getAcks() {
            return this.acks;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParameters setInstanceId(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParametersInstanceId instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParametersInstanceId getInstanceId() {
            return this.instanceId;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParameters setKey(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParametersKey key) {
            this.key = key;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParametersKey getKey() {
            return this.key;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParameters setTopic(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParametersTopic topic) {
            this.topic = topic;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParametersTopic getTopic() {
            return this.topic;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParameters setValue(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParametersValue value) {
            this.value = value;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParametersValue getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkMNSParametersBody extends TeaModel {
        /**
         * <p>The method that is used to transform events.</p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which events are transformed.</p>
         * 
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value before transformation.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;key&quot;: &quot;value&quot;
         * }</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkMNSParametersBody build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkMNSParametersBody self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkMNSParametersBody();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkMNSParametersBody setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkMNSParametersBody setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkMNSParametersBody setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkMNSParametersIsBase64Encode extends TeaModel {
        /**
         * <p>The method that is used to transform events. Default value: CONSTANT.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>None.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>Indicates that Base64 encoding is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkMNSParametersIsBase64Encode build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkMNSParametersIsBase64Encode self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkMNSParametersIsBase64Encode();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkMNSParametersIsBase64Encode setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkMNSParametersIsBase64Encode setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkMNSParametersIsBase64Encode setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkMNSParametersQueueName extends TeaModel {
        /**
         * <p>The method that is used to transform events. Default value: CONSTANT.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>None.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The name of the MNS queue.</p>
         * 
         * <strong>example:</strong>
         * <p>MyQueue</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkMNSParametersQueueName build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkMNSParametersQueueName self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkMNSParametersQueueName();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkMNSParametersQueueName setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkMNSParametersQueueName setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkMNSParametersQueueName setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkMNSParameters extends TeaModel {
        /**
         * <p>The message content.</p>
         */
        @NameInMap("Body")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkMNSParametersBody body;

        /**
         * <p>Indicates whether Base64 encoding is enabled.</p>
         */
        @NameInMap("IsBase64Encode")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkMNSParametersIsBase64Encode isBase64Encode;

        /**
         * <p>The name of the MNS queue.</p>
         */
        @NameInMap("QueueName")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkMNSParametersQueueName queueName;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkMNSParameters build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkMNSParameters self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkMNSParameters();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkMNSParameters setBody(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkMNSParametersBody body) {
            this.body = body;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkMNSParametersBody getBody() {
            return this.body;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkMNSParameters setIsBase64Encode(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkMNSParametersIsBase64Encode isBase64Encode) {
            this.isBase64Encode = isBase64Encode;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkMNSParametersIsBase64Encode getIsBase64Encode() {
            return this.isBase64Encode;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkMNSParameters setQueueName(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkMNSParametersQueueName queueName) {
            this.queueName = queueName;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkMNSParametersQueueName getQueueName() {
            return this.queueName;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersBody extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersBody build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersBody self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersBody();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersBody setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersBody setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersBody setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersExchange extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersExchange build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersExchange self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersExchange();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersExchange setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersExchange setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersExchange setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersMessageId extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersMessageId build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersMessageId self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersMessageId();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersMessageId setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersMessageId setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersMessageId setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersNetworkType extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersNetworkType build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersNetworkType self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersNetworkType();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersNetworkType setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersNetworkType setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersNetworkType setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersProperties extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersProperties build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersProperties self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersProperties();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersProperties setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersProperties setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersProperties setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersQueueName extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersQueueName build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersQueueName self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersQueueName();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersQueueName setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersQueueName setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersQueueName setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersRoutingKey extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersRoutingKey build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersRoutingKey self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersRoutingKey();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersRoutingKey setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersRoutingKey setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersRoutingKey setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersSecurityGroupId extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersSecurityGroupId build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersSecurityGroupId self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersSecurityGroupId();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersSecurityGroupId setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersSecurityGroupId setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersSecurityGroupId setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersVSwitchIds extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersVSwitchIds build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersVSwitchIds self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersVSwitchIds();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersVSwitchIds setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersVSwitchIds setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersVSwitchIds setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersVpcId extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersVpcId build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersVpcId self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersVpcId();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersVpcId setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersVpcId setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersVpcId setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParameters extends TeaModel {
        @NameInMap("Body")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersBody body;

        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("Exchange")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersExchange exchange;

        @NameInMap("MessageId")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersMessageId messageId;

        @NameInMap("NetworkType")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersNetworkType networkType;

        @NameInMap("Password")
        public String password;

        @NameInMap("Properties")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersProperties properties;

        @NameInMap("QueueName")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersQueueName queueName;

        @NameInMap("RoutingKey")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersRoutingKey routingKey;

        @NameInMap("SecurityGroupId")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersSecurityGroupId securityGroupId;

        @NameInMap("TargetType")
        public String targetType;

        @NameInMap("Username")
        public String username;

        @NameInMap("VSwitchIds")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersVSwitchIds vSwitchIds;

        @NameInMap("VirtualHostName")
        public String virtualHostName;

        @NameInMap("VpcId")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersVpcId vpcId;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParameters build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParameters self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParameters();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParameters setBody(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersBody body) {
            this.body = body;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersBody getBody() {
            return this.body;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParameters setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParameters setExchange(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersExchange exchange) {
            this.exchange = exchange;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersExchange getExchange() {
            return this.exchange;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParameters setMessageId(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersMessageId messageId) {
            this.messageId = messageId;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersMessageId getMessageId() {
            return this.messageId;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParameters setNetworkType(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersNetworkType networkType) {
            this.networkType = networkType;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersNetworkType getNetworkType() {
            return this.networkType;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParameters setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParameters setProperties(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersProperties properties) {
            this.properties = properties;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersProperties getProperties() {
            return this.properties;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParameters setQueueName(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersQueueName queueName) {
            this.queueName = queueName;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersQueueName getQueueName() {
            return this.queueName;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParameters setRoutingKey(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersRoutingKey routingKey) {
            this.routingKey = routingKey;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersRoutingKey getRoutingKey() {
            return this.routingKey;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParameters setSecurityGroupId(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersSecurityGroupId securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersSecurityGroupId getSecurityGroupId() {
            return this.securityGroupId;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParameters setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParameters setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParameters setVSwitchIds(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersVSwitchIds vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersVSwitchIds getVSwitchIds() {
            return this.vSwitchIds;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParameters setVirtualHostName(String virtualHostName) {
            this.virtualHostName = virtualHostName;
            return this;
        }
        public String getVirtualHostName() {
            return this.virtualHostName;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParameters setVpcId(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersVpcId vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParametersVpcId getVpcId() {
            return this.vpcId;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersBody extends TeaModel {
        /**
         * <p>The method that is used to transform events.</p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which events are transformed.</p>
         * 
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value before transformation.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;key&quot;: &quot;value&quot;
         * }</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersBody build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersBody self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersBody();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersBody setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersBody setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersBody setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersExchange extends TeaModel {
        /**
         * <p>The method that is used to transform events. Default value: CONSTANT.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>None.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The name of the exchange on the ApsaraMQ for RabbitMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>a_exchange</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersExchange build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersExchange self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersExchange();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersExchange setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersExchange setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersExchange setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersInstanceId extends TeaModel {
        /**
         * <p>The method that is used to transform events. Default value: CONSTANT.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>None.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The ID of the ApsaraMQ for RabbitMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>si-296cd57939a1421b94ec</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersInstanceId build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersInstanceId self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersInstanceId();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersInstanceId setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersInstanceId setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersInstanceId setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersMessageId extends TeaModel {
        /**
         * <p>The method that is used to transform events.</p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which events are transformed.</p>
         * 
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value before transformation.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;key&quot;: &quot;value&quot;
         * }</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersMessageId build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersMessageId self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersMessageId();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersMessageId setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersMessageId setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersMessageId setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersProperties extends TeaModel {
        /**
         * <p>The method that is used to transform events.</p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which events are transformed.</p>
         * 
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value before transformation.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;key&quot;: &quot;value&quot;
         * }</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersProperties build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersProperties self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersProperties();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersProperties setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersProperties setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersProperties setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersQueueName extends TeaModel {
        /**
         * <p>The method that is used to transform events. Default value: CONSTANT.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>None.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The name of the queue on the ApsaraMQ for RabbitMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>MyQueue</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersQueueName build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersQueueName self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersQueueName();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersQueueName setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersQueueName setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersQueueName setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersRoutingKey extends TeaModel {
        /**
         * <p>The method that is used to transform events. Default value: CONSTANT.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>None.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The rule that is used to route messages.</p>
         * 
         * <strong>example:</strong>
         * <p>housekeeping</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersRoutingKey build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersRoutingKey self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersRoutingKey();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersRoutingKey setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersRoutingKey setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersRoutingKey setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersTargetType extends TeaModel {
        /**
         * <p>The method that is used to transform events. Default value: CONSTANT.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>None.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The type of the resource to which events are delivered. Valid values: Exchange and Queue.</p>
         * 
         * <strong>example:</strong>
         * <p>Queue</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersTargetType build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersTargetType self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersTargetType();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersTargetType setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersTargetType setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersTargetType setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersVirtualHostName extends TeaModel {
        /**
         * <p>The method that is used to transform events. Default value: CONSTANT.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>None.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The name of the vhost to which the ApsaraMQ for RabbitMQ instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rabbit-host</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersVirtualHostName build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersVirtualHostName self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersVirtualHostName();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersVirtualHostName setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersVirtualHostName setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersVirtualHostName setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParameters extends TeaModel {
        /**
         * <p>The message content.</p>
         */
        @NameInMap("Body")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersBody body;

        /**
         * <p>The exchange mode. This parameter is required only if TargetType is set to Exchange.</p>
         */
        @NameInMap("Exchange")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersExchange exchange;

        /**
         * <p>The ID of the ApsaraMQ for RabbitMQ instance.</p>
         */
        @NameInMap("InstanceId")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersInstanceId instanceId;

        /**
         * <p>The message ID.</p>
         */
        @NameInMap("MessageId")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersMessageId messageId;

        /**
         * <p>The properties that are used to filter messages.</p>
         */
        @NameInMap("Properties")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersProperties properties;

        /**
         * <p>The queue mode. This parameter is required only if TargetType is set to Queue.</p>
         */
        @NameInMap("QueueName")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersQueueName queueName;

        /**
         * <p>The rule that is used to route messages. This parameter is required only if TargetType is set to Exchange.</p>
         */
        @NameInMap("RoutingKey")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersRoutingKey routingKey;

        /**
         * <p>The type of the resource to which events are delivered.</p>
         */
        @NameInMap("TargetType")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersTargetType targetType;

        /**
         * <p>The name of the vhost to which the ApsaraMQ for RabbitMQ instance belongs.</p>
         */
        @NameInMap("VirtualHostName")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersVirtualHostName virtualHostName;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParameters build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParameters self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParameters();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParameters setBody(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersBody body) {
            this.body = body;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersBody getBody() {
            return this.body;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParameters setExchange(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersExchange exchange) {
            this.exchange = exchange;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersExchange getExchange() {
            return this.exchange;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParameters setInstanceId(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersInstanceId instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersInstanceId getInstanceId() {
            return this.instanceId;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParameters setMessageId(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersMessageId messageId) {
            this.messageId = messageId;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersMessageId getMessageId() {
            return this.messageId;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParameters setProperties(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersProperties properties) {
            this.properties = properties;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersProperties getProperties() {
            return this.properties;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParameters setQueueName(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersQueueName queueName) {
            this.queueName = queueName;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersQueueName getQueueName() {
            return this.queueName;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParameters setRoutingKey(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersRoutingKey routingKey) {
            this.routingKey = routingKey;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersRoutingKey getRoutingKey() {
            return this.routingKey;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParameters setTargetType(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersTargetType targetType) {
            this.targetType = targetType;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersTargetType getTargetType() {
            return this.targetType;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParameters setVirtualHostName(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersVirtualHostName virtualHostName) {
            this.virtualHostName = virtualHostName;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersVirtualHostName getVirtualHostName() {
            return this.virtualHostName;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQCheckpointParametersConsumeTimestamp extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQCheckpointParametersConsumeTimestamp build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQCheckpointParametersConsumeTimestamp self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQCheckpointParametersConsumeTimestamp();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQCheckpointParametersConsumeTimestamp setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQCheckpointParametersConsumeTimestamp setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQCheckpointParametersConsumeTimestamp setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQCheckpointParametersGroup extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQCheckpointParametersGroup build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQCheckpointParametersGroup self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQCheckpointParametersGroup();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQCheckpointParametersGroup setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQCheckpointParametersGroup setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQCheckpointParametersGroup setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQCheckpointParametersTopic extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQCheckpointParametersTopic build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQCheckpointParametersTopic self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQCheckpointParametersTopic();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQCheckpointParametersTopic setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQCheckpointParametersTopic setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQCheckpointParametersTopic setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQCheckpointParameters extends TeaModel {
        @NameInMap("ConsumeTimestamp")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQCheckpointParametersConsumeTimestamp consumeTimestamp;

        @NameInMap("Group")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQCheckpointParametersGroup group;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("Topic")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQCheckpointParametersTopic topic;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQCheckpointParameters build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQCheckpointParameters self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQCheckpointParameters();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQCheckpointParameters setConsumeTimestamp(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQCheckpointParametersConsumeTimestamp consumeTimestamp) {
            this.consumeTimestamp = consumeTimestamp;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQCheckpointParametersConsumeTimestamp getConsumeTimestamp() {
            return this.consumeTimestamp;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQCheckpointParameters setGroup(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQCheckpointParametersGroup group) {
            this.group = group;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQCheckpointParametersGroup getGroup() {
            return this.group;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQCheckpointParameters setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQCheckpointParameters setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQCheckpointParameters setTopic(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQCheckpointParametersTopic topic) {
            this.topic = topic;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQCheckpointParametersTopic getTopic() {
            return this.topic;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersBody extends TeaModel {
        /**
         * <p>The method that is used to transform events.</p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which events are transformed.</p>
         * 
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value before transformation.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;key&quot;: &quot;value&quot;
         * }</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersBody build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersBody self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersBody();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersBody setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersBody setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersBody setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersDeliveryOrderType extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersDeliveryOrderType build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersDeliveryOrderType self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersDeliveryOrderType();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersDeliveryOrderType setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersDeliveryOrderType setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersDeliveryOrderType setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersInstanceEndpoint extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersInstanceEndpoint build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersInstanceEndpoint self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersInstanceEndpoint();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersInstanceEndpoint setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersInstanceEndpoint setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersInstanceEndpoint setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersInstanceId extends TeaModel {
        /**
         * <p>The method that is used to transform events. Default value: CONSTANT.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>None.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The ID of the ApsaraMQ for RocketMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>MQ_INST_164901546557****_BAAN****</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersInstanceId build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersInstanceId self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersInstanceId();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersInstanceId setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersInstanceId setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersInstanceId setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersInstancePassword extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersInstancePassword build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersInstancePassword self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersInstancePassword();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersInstancePassword setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersInstancePassword setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersInstancePassword setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersInstanceType extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersInstanceType build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersInstanceType self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersInstanceType();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersInstanceType setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersInstanceType setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersInstanceType setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersInstanceUsername extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersInstanceUsername build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersInstanceUsername self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersInstanceUsername();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersInstanceUsername setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersInstanceUsername setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersInstanceUsername setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersKeys extends TeaModel {
        /**
         * <p>The method that is used to transform events.</p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which events are transformed.</p>
         * 
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value before transformation.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;key&quot;: &quot;value&quot;
         * }</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersKeys build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersKeys self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersKeys();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersKeys setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersKeys setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersKeys setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersNetwork extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersNetwork build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersNetwork self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersNetwork();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersNetwork setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersNetwork setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersNetwork setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersProperties extends TeaModel {
        /**
         * <p>The method that is used to transform events.</p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which events are transformed.</p>
         * 
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value before transformation.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;key&quot;: &quot;value&quot;
         * }</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersProperties build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersProperties self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersProperties();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersProperties setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersProperties setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersProperties setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersSecurityGroupId extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersSecurityGroupId build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersSecurityGroupId self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersSecurityGroupId();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersSecurityGroupId setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersSecurityGroupId setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersSecurityGroupId setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersShardingKey extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersShardingKey build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersShardingKey self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersShardingKey();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersShardingKey setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersShardingKey setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersShardingKey setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersTags extends TeaModel {
        /**
         * <p>The method that is used to transform events.</p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which events are transformed.</p>
         * 
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value before transformation.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;key&quot;: &quot;value&quot;
         * }</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersTags build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersTags self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersTags();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersTags setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersTags setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersTopic extends TeaModel {
        /**
         * <p>The method that is used to transform events. Default value: CONSTANT.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>None.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The topic on the ApsaraMQ for RocketMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>topic</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersTopic build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersTopic self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersTopic();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersTopic setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersTopic setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersTopic setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersVSwitchIds extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersVSwitchIds build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersVSwitchIds self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersVSwitchIds();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersVSwitchIds setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersVSwitchIds setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersVSwitchIds setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersVpcId extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersVpcId build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersVpcId self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersVpcId();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersVpcId setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersVpcId setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersVpcId setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParameters extends TeaModel {
        /**
         * <p>The message content.</p>
         */
        @NameInMap("Body")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersBody body;

        @NameInMap("DeliveryOrderType")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersDeliveryOrderType deliveryOrderType;

        @NameInMap("InstanceEndpoint")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersInstanceEndpoint instanceEndpoint;

        /**
         * <p>The ID of the ApsaraMQ for RocketMQ instance.</p>
         */
        @NameInMap("InstanceId")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersInstanceId instanceId;

        @NameInMap("InstancePassword")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersInstancePassword instancePassword;

        @NameInMap("InstanceType")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersInstanceType instanceType;

        @NameInMap("InstanceUsername")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersInstanceUsername instanceUsername;

        /**
         * <p>The keys that are used to filter messages.</p>
         */
        @NameInMap("Keys")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersKeys keys;

        @NameInMap("Network")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersNetwork network;

        /**
         * <p>The properties that are used to filter messages.</p>
         */
        @NameInMap("Properties")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersProperties properties;

        @NameInMap("SecurityGroupId")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersSecurityGroupId securityGroupId;

        @NameInMap("ShardingKey")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersShardingKey shardingKey;

        /**
         * <p>The tags that are used to filter messages.</p>
         */
        @NameInMap("Tags")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersTags tags;

        /**
         * <p>The topic on the ApsaraMQ for RocketMQ instance.</p>
         */
        @NameInMap("Topic")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersTopic topic;

        @NameInMap("VSwitchIds")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersVSwitchIds vSwitchIds;

        @NameInMap("VpcId")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersVpcId vpcId;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParameters build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParameters self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParameters();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParameters setBody(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersBody body) {
            this.body = body;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersBody getBody() {
            return this.body;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParameters setDeliveryOrderType(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersDeliveryOrderType deliveryOrderType) {
            this.deliveryOrderType = deliveryOrderType;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersDeliveryOrderType getDeliveryOrderType() {
            return this.deliveryOrderType;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParameters setInstanceEndpoint(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersInstanceEndpoint instanceEndpoint) {
            this.instanceEndpoint = instanceEndpoint;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersInstanceEndpoint getInstanceEndpoint() {
            return this.instanceEndpoint;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParameters setInstanceId(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersInstanceId instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersInstanceId getInstanceId() {
            return this.instanceId;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParameters setInstancePassword(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersInstancePassword instancePassword) {
            this.instancePassword = instancePassword;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersInstancePassword getInstancePassword() {
            return this.instancePassword;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParameters setInstanceType(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersInstanceType instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersInstanceType getInstanceType() {
            return this.instanceType;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParameters setInstanceUsername(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersInstanceUsername instanceUsername) {
            this.instanceUsername = instanceUsername;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersInstanceUsername getInstanceUsername() {
            return this.instanceUsername;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParameters setKeys(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersKeys keys) {
            this.keys = keys;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersKeys getKeys() {
            return this.keys;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParameters setNetwork(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersNetwork network) {
            this.network = network;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersNetwork getNetwork() {
            return this.network;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParameters setProperties(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersProperties properties) {
            this.properties = properties;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersProperties getProperties() {
            return this.properties;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParameters setSecurityGroupId(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersSecurityGroupId securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersSecurityGroupId getSecurityGroupId() {
            return this.securityGroupId;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParameters setShardingKey(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersShardingKey shardingKey) {
            this.shardingKey = shardingKey;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersShardingKey getShardingKey() {
            return this.shardingKey;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParameters setTags(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersTags tags) {
            this.tags = tags;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersTags getTags() {
            return this.tags;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParameters setTopic(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersTopic topic) {
            this.topic = topic;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersTopic getTopic() {
            return this.topic;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParameters setVSwitchIds(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersVSwitchIds vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersVSwitchIds getVSwitchIds() {
            return this.vSwitchIds;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParameters setVpcId(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersVpcId vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersVpcId getVpcId() {
            return this.vpcId;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersBody extends TeaModel {
        /**
         * <p>The method that is used to transform events.</p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which events are transformed.</p>
         * 
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value before transformation.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;key&quot;: &quot;value&quot;
         * }</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersBody build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersBody self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersBody();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersBody setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersBody setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersBody setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersContentSchema extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersContentSchema build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersContentSchema self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersContentSchema();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersContentSchema setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersContentSchema setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersContentSchema setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersContentType extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersContentType build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersContentType self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersContentType();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersContentType setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersContentType setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersContentType setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersLogStore extends TeaModel {
        /**
         * <p>The method that is used to transform events. Default value: CONSTANT.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>None.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The Simple Log Service Logstore.</p>
         * 
         * <strong>example:</strong>
         * <p>test-logstore</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersLogStore build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersLogStore self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersLogStore();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersLogStore setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersLogStore setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersLogStore setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersProject extends TeaModel {
        /**
         * <p>The method that is used to transform events. Default value: CONSTANT.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>None.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The Simple Log Service project.</p>
         * 
         * <strong>example:</strong>
         * <p>test-project</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersProject build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersProject self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersProject();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersProject setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersProject setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersProject setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersRoleName extends TeaModel {
        /**
         * <p>The method that is used to transform events. Default value: CONSTANT.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>None.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The role name. If you want to authorize EventBridge to use this role to read logs in Log Service, you must select Alibaba Cloud Service for Selected Trusted Entity and EventBridge for Select Trusted Service when you create the role in the RAM console.</p>
         * 
         * <strong>example:</strong>
         * <p>test-role</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersRoleName build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersRoleName self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersRoleName();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersRoleName setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersRoleName setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersRoleName setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersTopic extends TeaModel {
        /**
         * <p>The method that is used to transform events. Default value: CONSTANT.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>None.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The name of the topic in which logs are stored. The topic corresponds to the topic reserved field in Simple Log Service.</p>
         * 
         * <strong>example:</strong>
         * <p>topic</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersTopic build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersTopic self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersTopic();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersTopic setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersTopic setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersTopic setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParameters extends TeaModel {
        /**
         * <p>The message body that is sent to Simple Log Service.</p>
         */
        @NameInMap("Body")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersBody body;

        @NameInMap("ContentSchema")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersContentSchema contentSchema;

        @NameInMap("ContentType")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersContentType contentType;

        /**
         * <p>The Simple Log Service Logstore.</p>
         */
        @NameInMap("LogStore")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersLogStore logStore;

        /**
         * <p>The Simple Log Service project.</p>
         */
        @NameInMap("Project")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersProject project;

        /**
         * <p>The role name. If you want to authorize EventBridge to use this role to read logs in Log Service, you must select Alibaba Cloud Service for Selected Trusted Entity and EventBridge for Select Trusted Service when you create the role in the RAM console.</p>
         */
        @NameInMap("RoleName")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersRoleName roleName;

        /**
         * <p>The name of the topic in which logs are stored. The topic corresponds to the topic reserved field in Simple Log Service.</p>
         */
        @NameInMap("Topic")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersTopic topic;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParameters build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParameters self = new ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParameters();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParameters setBody(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersBody body) {
            this.body = body;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersBody getBody() {
            return this.body;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParameters setContentSchema(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersContentSchema contentSchema) {
            this.contentSchema = contentSchema;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersContentSchema getContentSchema() {
            return this.contentSchema;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParameters setContentType(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersContentType contentType) {
            this.contentType = contentType;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersContentType getContentType() {
            return this.contentType;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParameters setLogStore(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersLogStore logStore) {
            this.logStore = logStore;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersLogStore getLogStore() {
            return this.logStore;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParameters setProject(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersProject project) {
            this.project = project;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersProject getProject() {
            return this.project;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParameters setRoleName(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersRoleName roleName) {
            this.roleName = roleName;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersRoleName getRoleName() {
            return this.roleName;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParameters setTopic(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersTopic topic) {
            this.topic = topic;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersTopic getTopic() {
            return this.topic;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSink extends TeaModel {
        @NameInMap("SinkApacheRocketMQCheckpointParameters")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkApacheRocketMQCheckpointParameters sinkApacheRocketMQCheckpointParameters;

        @NameInMap("SinkCustomizedKafkaConnectorParameters")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkCustomizedKafkaConnectorParameters sinkCustomizedKafkaConnectorParameters;

        @NameInMap("SinkCustomizedKafkaParameters")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkCustomizedKafkaParameters sinkCustomizedKafkaParameters;

        @NameInMap("SinkDashVectorParameters")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDashVectorParameters sinkDashVectorParameters;

        @NameInMap("SinkDataHubParameters")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParameters sinkDataHubParameters;

        /**
         * <p>The parameters that are returned if Function Compute is specified as the event target.</p>
         */
        @NameInMap("SinkFcParameters")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParameters sinkFcParameters;

        /**
         * <p>The parameters that are returned if CloudFlow is specified as the event target.</p>
         */
        @NameInMap("SinkFnfParameters")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFnfParameters sinkFnfParameters;

        /**
         * <p>The parameters that are returned if ApsaraMQ for Kafka is specified as the event target.</p>
         */
        @NameInMap("SinkKafkaParameters")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParameters sinkKafkaParameters;

        /**
         * <p>The parameters that are returned if MNS is specified as the event target.</p>
         */
        @NameInMap("SinkMNSParameters")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkMNSParameters sinkMNSParameters;

        @NameInMap("SinkOpenSourceRabbitMQParameters")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParameters sinkOpenSourceRabbitMQParameters;

        /**
         * <p>The parameters that are returned if ApsaraMQ for RabbitMQ is specified as the event target.</p>
         */
        @NameInMap("SinkRabbitMQParameters")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParameters sinkRabbitMQParameters;

        @NameInMap("SinkRocketMQCheckpointParameters")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQCheckpointParameters sinkRocketMQCheckpointParameters;

        /**
         * <p>The parameters that are returned if ApsaraMQ for RocketMQ is specified as the event target.</p>
         */
        @NameInMap("SinkRocketMQParameters")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParameters sinkRocketMQParameters;

        /**
         * <p>The parameters that are returned if Simple Log Service is specified as the event target.</p>
         */
        @NameInMap("SinkSLSParameters")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParameters sinkSLSParameters;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSink build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSink self = new ListEventStreamingsResponseBodyDataEventStreamingsSink();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSink setSinkApacheRocketMQCheckpointParameters(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkApacheRocketMQCheckpointParameters sinkApacheRocketMQCheckpointParameters) {
            this.sinkApacheRocketMQCheckpointParameters = sinkApacheRocketMQCheckpointParameters;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkApacheRocketMQCheckpointParameters getSinkApacheRocketMQCheckpointParameters() {
            return this.sinkApacheRocketMQCheckpointParameters;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSink setSinkCustomizedKafkaConnectorParameters(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkCustomizedKafkaConnectorParameters sinkCustomizedKafkaConnectorParameters) {
            this.sinkCustomizedKafkaConnectorParameters = sinkCustomizedKafkaConnectorParameters;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkCustomizedKafkaConnectorParameters getSinkCustomizedKafkaConnectorParameters() {
            return this.sinkCustomizedKafkaConnectorParameters;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSink setSinkCustomizedKafkaParameters(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkCustomizedKafkaParameters sinkCustomizedKafkaParameters) {
            this.sinkCustomizedKafkaParameters = sinkCustomizedKafkaParameters;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkCustomizedKafkaParameters getSinkCustomizedKafkaParameters() {
            return this.sinkCustomizedKafkaParameters;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSink setSinkDashVectorParameters(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDashVectorParameters sinkDashVectorParameters) {
            this.sinkDashVectorParameters = sinkDashVectorParameters;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDashVectorParameters getSinkDashVectorParameters() {
            return this.sinkDashVectorParameters;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSink setSinkDataHubParameters(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParameters sinkDataHubParameters) {
            this.sinkDataHubParameters = sinkDataHubParameters;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkDataHubParameters getSinkDataHubParameters() {
            return this.sinkDataHubParameters;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSink setSinkFcParameters(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParameters sinkFcParameters) {
            this.sinkFcParameters = sinkFcParameters;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParameters getSinkFcParameters() {
            return this.sinkFcParameters;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSink setSinkFnfParameters(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFnfParameters sinkFnfParameters) {
            this.sinkFnfParameters = sinkFnfParameters;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFnfParameters getSinkFnfParameters() {
            return this.sinkFnfParameters;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSink setSinkKafkaParameters(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParameters sinkKafkaParameters) {
            this.sinkKafkaParameters = sinkKafkaParameters;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParameters getSinkKafkaParameters() {
            return this.sinkKafkaParameters;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSink setSinkMNSParameters(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkMNSParameters sinkMNSParameters) {
            this.sinkMNSParameters = sinkMNSParameters;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkMNSParameters getSinkMNSParameters() {
            return this.sinkMNSParameters;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSink setSinkOpenSourceRabbitMQParameters(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParameters sinkOpenSourceRabbitMQParameters) {
            this.sinkOpenSourceRabbitMQParameters = sinkOpenSourceRabbitMQParameters;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkOpenSourceRabbitMQParameters getSinkOpenSourceRabbitMQParameters() {
            return this.sinkOpenSourceRabbitMQParameters;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSink setSinkRabbitMQParameters(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParameters sinkRabbitMQParameters) {
            this.sinkRabbitMQParameters = sinkRabbitMQParameters;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParameters getSinkRabbitMQParameters() {
            return this.sinkRabbitMQParameters;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSink setSinkRocketMQCheckpointParameters(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQCheckpointParameters sinkRocketMQCheckpointParameters) {
            this.sinkRocketMQCheckpointParameters = sinkRocketMQCheckpointParameters;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQCheckpointParameters getSinkRocketMQCheckpointParameters() {
            return this.sinkRocketMQCheckpointParameters;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSink setSinkRocketMQParameters(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParameters sinkRocketMQParameters) {
            this.sinkRocketMQParameters = sinkRocketMQParameters;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParameters getSinkRocketMQParameters() {
            return this.sinkRocketMQParameters;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSink setSinkSLSParameters(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParameters sinkSLSParameters) {
            this.sinkSLSParameters = sinkSLSParameters;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParameters getSinkSLSParameters() {
            return this.sinkSLSParameters;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceApacheRocketMQCheckpointParameters extends TeaModel {
        @NameInMap("InstanceEndpoint")
        public String instanceEndpoint;

        @NameInMap("InstancePassword")
        public String instancePassword;

        @NameInMap("InstanceUsername")
        public String instanceUsername;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("Topics")
        public java.util.List<String> topics;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("VpcId")
        public String vpcId;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceApacheRocketMQCheckpointParameters build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceApacheRocketMQCheckpointParameters self = new ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceApacheRocketMQCheckpointParameters();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceApacheRocketMQCheckpointParameters setInstanceEndpoint(String instanceEndpoint) {
            this.instanceEndpoint = instanceEndpoint;
            return this;
        }
        public String getInstanceEndpoint() {
            return this.instanceEndpoint;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceApacheRocketMQCheckpointParameters setInstancePassword(String instancePassword) {
            this.instancePassword = instancePassword;
            return this;
        }
        public String getInstancePassword() {
            return this.instancePassword;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceApacheRocketMQCheckpointParameters setInstanceUsername(String instanceUsername) {
            this.instanceUsername = instanceUsername;
            return this;
        }
        public String getInstanceUsername() {
            return this.instanceUsername;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceApacheRocketMQCheckpointParameters setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceApacheRocketMQCheckpointParameters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceApacheRocketMQCheckpointParameters setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceApacheRocketMQCheckpointParameters setTopics(java.util.List<String> topics) {
            this.topics = topics;
            return this;
        }
        public java.util.List<String> getTopics() {
            return this.topics;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceApacheRocketMQCheckpointParameters setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceApacheRocketMQCheckpointParameters setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceCustomizedKafkaConnectorParametersConnectorParameters extends TeaModel {
        @NameInMap("Config")
        public java.util.Map<String, ?> config;

        @NameInMap("Name")
        public String name;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceCustomizedKafkaConnectorParametersConnectorParameters build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceCustomizedKafkaConnectorParametersConnectorParameters self = new ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceCustomizedKafkaConnectorParametersConnectorParameters();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceCustomizedKafkaConnectorParametersConnectorParameters setConfig(java.util.Map<String, ?> config) {
            this.config = config;
            return this;
        }
        public java.util.Map<String, ?> getConfig() {
            return this.config;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceCustomizedKafkaConnectorParametersConnectorParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceCustomizedKafkaConnectorParameters extends TeaModel {
        @NameInMap("ConnectorPackageUrl")
        public String connectorPackageUrl;

        @NameInMap("ConnectorParameters")
        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceCustomizedKafkaConnectorParametersConnectorParameters connectorParameters;

        @NameInMap("WorkerParameters")
        public java.util.Map<String, ?> workerParameters;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceCustomizedKafkaConnectorParameters build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceCustomizedKafkaConnectorParameters self = new ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceCustomizedKafkaConnectorParameters();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceCustomizedKafkaConnectorParameters setConnectorPackageUrl(String connectorPackageUrl) {
            this.connectorPackageUrl = connectorPackageUrl;
            return this;
        }
        public String getConnectorPackageUrl() {
            return this.connectorPackageUrl;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceCustomizedKafkaConnectorParameters setConnectorParameters(ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceCustomizedKafkaConnectorParametersConnectorParameters connectorParameters) {
            this.connectorParameters = connectorParameters;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceCustomizedKafkaConnectorParametersConnectorParameters getConnectorParameters() {
            return this.connectorParameters;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceCustomizedKafkaConnectorParameters setWorkerParameters(java.util.Map<String, ?> workerParameters) {
            this.workerParameters = workerParameters;
            return this;
        }
        public java.util.Map<String, ?> getWorkerParameters() {
            return this.workerParameters;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceCustomizedKafkaParameters extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceCustomizedKafkaParameters build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceCustomizedKafkaParameters self = new ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceCustomizedKafkaParameters();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceCustomizedKafkaParameters setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceDTSParameters extends TeaModel {
        /**
         * <p>The URL and port number of the change tracking instance.</p>
         */
        @NameInMap("BrokerUrl")
        public String brokerUrl;

        /**
         * <p>The UNIX timestamp that is generated when the SDK client consumes the first data record.</p>
         * 
         * <strong>example:</strong>
         * <p>1620962769</p>
         */
        @NameInMap("InitCheckPoint")
        public String initCheckPoint;

        /**
         * <p>The consumer group password.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The consumer group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>HG9</p>
         */
        @NameInMap("Sid")
        public String sid;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1611b337285f44e2936a2c4170bbbb7f</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The name of the tracked topic of the change tracking instance.</p>
         * 
         * <strong>example:</strong>
         * <p>TP_TEST_UNDERWRITE_ISSUE</p>
         */
        @NameInMap("Topic")
        public String topic;

        /**
         * <p>The consumer group username.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("Username")
        public String username;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceDTSParameters build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceDTSParameters self = new ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceDTSParameters();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceDTSParameters setBrokerUrl(String brokerUrl) {
            this.brokerUrl = brokerUrl;
            return this;
        }
        public String getBrokerUrl() {
            return this.brokerUrl;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceDTSParameters setInitCheckPoint(String initCheckPoint) {
            this.initCheckPoint = initCheckPoint;
            return this;
        }
        public String getInitCheckPoint() {
            return this.initCheckPoint;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceDTSParameters setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceDTSParameters setSid(String sid) {
            this.sid = sid;
            return this;
        }
        public String getSid() {
            return this.sid;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceDTSParameters setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceDTSParameters setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceDTSParameters setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceEventBusParameters extends TeaModel {
        @NameInMap("EventBusName")
        public String eventBusName;

        @NameInMap("EventRuleName")
        public String eventRuleName;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceEventBusParameters build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceEventBusParameters self = new ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceEventBusParameters();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceEventBusParameters setEventBusName(String eventBusName) {
            this.eventBusName = eventBusName;
            return this;
        }
        public String getEventBusName() {
            return this.eventBusName;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceEventBusParameters setEventRuleName(String eventRuleName) {
            this.eventRuleName = eventRuleName;
            return this;
        }
        public String getEventRuleName() {
            return this.eventRuleName;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceKafkaParameters extends TeaModel {
        /**
         * <p>The group ID of the consumer that subscribes to the topic.</p>
         * 
         * <strong>example:</strong>
         * <p>GID_TEST</p>
         */
        @NameInMap("ConsumerGroup")
        public String consumerGroup;

        /**
         * <p>The ID of the ApsaraMQ for Kafka instance.</p>
         * 
         * <strong>example:</strong>
         * <p>bastionhost-cn-i7m2gwt7z1n</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The network type. Default value: Default. The value PublicNetwork indicates a VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>Default</p>
         */
        @NameInMap("Network")
        public String network;

        /**
         * <p>The offset from which messages are consumed.</p>
         * 
         * <strong>example:</strong>
         * <p>latest</p>
         */
        @NameInMap("OffsetReset")
        public String offsetReset;

        /**
         * <p>The ID of the region where the ApsaraMQ for Kafka instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-chengdu</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the security group to which the ApsaraMQ for Kafka instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-5ud5f3p0rqqis69tpp8eho7cp</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The name of the topic on the ApsaraMQ for Kafka instance.</p>
         * 
         * <strong>example:</strong>
         * <p>topic_empower_1642473600414</p>
         */
        @NameInMap("Topic")
        public String topic;

        /**
         * <p>The ID of the vSwitch with which the ApsaraMQ for Kafka instance is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1rmi8rind7eo50cbied</p>
         */
        @NameInMap("VSwitchIds")
        public String vSwitchIds;

        @NameInMap("ValueDataType")
        public String valueDataType;

        /**
         * <p>The ID of the VPC to which the ApsaraMQ for Kafka instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-wz9ki1qdlx3cx5cbbhowf</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceKafkaParameters build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceKafkaParameters self = new ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceKafkaParameters();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceKafkaParameters setConsumerGroup(String consumerGroup) {
            this.consumerGroup = consumerGroup;
            return this;
        }
        public String getConsumerGroup() {
            return this.consumerGroup;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceKafkaParameters setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceKafkaParameters setNetwork(String network) {
            this.network = network;
            return this;
        }
        public String getNetwork() {
            return this.network;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceKafkaParameters setOffsetReset(String offsetReset) {
            this.offsetReset = offsetReset;
            return this;
        }
        public String getOffsetReset() {
            return this.offsetReset;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceKafkaParameters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceKafkaParameters setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceKafkaParameters setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceKafkaParameters setVSwitchIds(String vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public String getVSwitchIds() {
            return this.vSwitchIds;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceKafkaParameters setValueDataType(String valueDataType) {
            this.valueDataType = valueDataType;
            return this;
        }
        public String getValueDataType() {
            return this.valueDataType;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceKafkaParameters setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceMNSParameters extends TeaModel {
        /**
         * <p>Indicates whether Base64 encoding is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsBase64Decode")
        public Boolean isBase64Decode;

        /**
         * <p>The name of the MNS queue.</p>
         * 
         * <strong>example:</strong>
         * <p>work4</p>
         */
        @NameInMap("QueueName")
        public String queueName;

        /**
         * <p>The ID of the region where the MNS queue resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-zhangjiakou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceMNSParameters build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceMNSParameters self = new ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceMNSParameters();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceMNSParameters setIsBase64Decode(Boolean isBase64Decode) {
            this.isBase64Decode = isBase64Decode;
            return this;
        }
        public Boolean getIsBase64Decode() {
            return this.isBase64Decode;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceMNSParameters setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceMNSParameters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceMQTTParameters extends TeaModel {
        @NameInMap("BodyDataType")
        public String bodyDataType;

        /**
         * <p>The ID of the ApsaraMQ for MQTT instance.</p>
         * 
         * <strong>example:</strong>
         * <p>bastionhost-cn-zvp27kcha1r</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The ID of the region where the ApsaraMQ for MQTT instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-qingdao</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the topic on the ApsaraMQ for MQTT instance.</p>
         * 
         * <strong>example:</strong>
         * <p>migration_instance</p>
         */
        @NameInMap("Topic")
        public String topic;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceMQTTParameters build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceMQTTParameters self = new ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceMQTTParameters();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceMQTTParameters setBodyDataType(String bodyDataType) {
            this.bodyDataType = bodyDataType;
            return this;
        }
        public String getBodyDataType() {
            return this.bodyDataType;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceMQTTParameters setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceMQTTParameters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceMQTTParameters setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceOSSParameters extends TeaModel {
        @NameInMap("BucketName")
        public String bucketName;

        @NameInMap("Delimiter")
        public String delimiter;

        @NameInMap("LoadFormat")
        public String loadFormat;

        @NameInMap("LoadMode")
        public String loadMode;

        @NameInMap("Prefix")
        public String prefix;

        @NameInMap("RoleName")
        public String roleName;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceOSSParameters build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceOSSParameters self = new ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceOSSParameters();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceOSSParameters setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceOSSParameters setDelimiter(String delimiter) {
            this.delimiter = delimiter;
            return this;
        }
        public String getDelimiter() {
            return this.delimiter;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceOSSParameters setLoadFormat(String loadFormat) {
            this.loadFormat = loadFormat;
            return this;
        }
        public String getLoadFormat() {
            return this.loadFormat;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceOSSParameters setLoadMode(String loadMode) {
            this.loadMode = loadMode;
            return this;
        }
        public String getLoadMode() {
            return this.loadMode;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceOSSParameters setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceOSSParameters setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceOpenSourceRabbitMQParameters extends TeaModel {
        @NameInMap("BodyDataType")
        public String bodyDataType;

        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("Password")
        public String password;

        @NameInMap("QueueName")
        public String queueName;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("Username")
        public String username;

        @NameInMap("VSwitchIds")
        public String vSwitchIds;

        @NameInMap("VirtualHostName")
        public String virtualHostName;

        @NameInMap("VpcId")
        public String vpcId;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceOpenSourceRabbitMQParameters build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceOpenSourceRabbitMQParameters self = new ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceOpenSourceRabbitMQParameters();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceOpenSourceRabbitMQParameters setBodyDataType(String bodyDataType) {
            this.bodyDataType = bodyDataType;
            return this;
        }
        public String getBodyDataType() {
            return this.bodyDataType;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceOpenSourceRabbitMQParameters setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceOpenSourceRabbitMQParameters setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceOpenSourceRabbitMQParameters setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceOpenSourceRabbitMQParameters setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceOpenSourceRabbitMQParameters setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceOpenSourceRabbitMQParameters setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceOpenSourceRabbitMQParameters setVSwitchIds(String vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public String getVSwitchIds() {
            return this.vSwitchIds;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceOpenSourceRabbitMQParameters setVirtualHostName(String virtualHostName) {
            this.virtualHostName = virtualHostName;
            return this;
        }
        public String getVirtualHostName() {
            return this.virtualHostName;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceOpenSourceRabbitMQParameters setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSourceSourcePrometheusParameters extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("DataType")
        public String dataType;

        @NameInMap("ExternalLabels")
        public String externalLabels;

        @NameInMap("Labels")
        public String labels;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RoleName")
        public String roleName;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSourceSourcePrometheusParameters build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSourceSourcePrometheusParameters self = new ListEventStreamingsResponseBodyDataEventStreamingsSourceSourcePrometheusParameters();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourcePrometheusParameters setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourcePrometheusParameters setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourcePrometheusParameters setExternalLabels(String externalLabels) {
            this.externalLabels = externalLabels;
            return this;
        }
        public String getExternalLabels() {
            return this.externalLabels;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourcePrometheusParameters setLabels(String labels) {
            this.labels = labels;
            return this;
        }
        public String getLabels() {
            return this.labels;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourcePrometheusParameters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourcePrometheusParameters setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRabbitMQParameters extends TeaModel {
        /**
         * <p>The ID of the ApsaraMQ for RabbitMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>dbaudit-cn-7mz2hqolc06</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the queue on the ApsaraMQ for RabbitMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>liuyang</p>
         */
        @NameInMap("QueueName")
        public String queueName;

        /**
         * <p>The ID of the region where the ApsaraMQ for RabbitMQ instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-zhangjiakou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the vhost to which the ApsaraMQ for RabbitMQ instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>eb-connect</p>
         */
        @NameInMap("VirtualHostName")
        public String virtualHostName;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRabbitMQParameters build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRabbitMQParameters self = new ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRabbitMQParameters();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRabbitMQParameters setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRabbitMQParameters setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRabbitMQParameters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRabbitMQParameters setVirtualHostName(String virtualHostName) {
            this.virtualHostName = virtualHostName;
            return this;
        }
        public String getVirtualHostName() {
            return this.virtualHostName;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRocketMQCheckpointParameters extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Topics")
        public java.util.List<String> topics;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRocketMQCheckpointParameters build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRocketMQCheckpointParameters self = new ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRocketMQCheckpointParameters();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRocketMQCheckpointParameters setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRocketMQCheckpointParameters setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRocketMQCheckpointParameters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRocketMQCheckpointParameters setTopics(java.util.List<String> topics) {
            this.topics = topics;
            return this;
        }
        public java.util.List<String> getTopics() {
            return this.topics;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRocketMQParameters extends TeaModel {
        /**
         * <p>The authentication method.</p>
         * 
         * <strong>example:</strong>
         * <p>ACL</p>
         */
        @NameInMap("AuthType")
        public String authType;

        @NameInMap("BodyDataType")
        public String bodyDataType;

        @NameInMap("FilterSql")
        public String filterSql;

        @NameInMap("FilterType")
        public String filterType;

        /**
         * <p>The ID of the consumer group on the ApsaraMQ for RocketMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>GID_group1</p>
         */
        @NameInMap("GroupID")
        public String groupID;

        /**
         * <p>The endpoint that is used to access the ApsaraMQ for RocketMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>registry-vpc.cn-hangzhou.aliyuncs.com</p>
         */
        @NameInMap("InstanceEndpoint")
        public String instanceEndpoint;

        /**
         * <p>The ID of the ApsaraMQ for RocketMQ instance</p>
         * 
         * <strong>example:</strong>
         * <p>i-f8zbher64dlm58plyfte</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The network type of the ApsaraMQ for RocketMQ instance. Valid values:</p>
         * <ul>
         * <li>PublicNetwork</li>
         * <li>PrivateNetwork</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PublicNetwork</p>
         */
        @NameInMap("InstanceNetwork")
        public String instanceNetwork;

        /**
         * <p>The password that is used to access the ApsaraMQ for RocketMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("InstancePassword")
        public String instancePassword;

        /**
         * <p>The ID of the security group to which the ApsaraMQ for RocketMQ instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-m5edtu24f12345****</p>
         */
        @NameInMap("InstanceSecurityGroupId")
        public String instanceSecurityGroupId;

        /**
         * <p>The type of the ApsaraMQ for RocketMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The username that is used to access the ApsaraMQ for RocketMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>admin**</p>
         */
        @NameInMap("InstanceUsername")
        public String instanceUsername;

        /**
         * <p>The ID of the vSwitch with which the ApsaraMQ for RocketMQ instance is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-m5ev8asdc6h123456****</p>
         */
        @NameInMap("InstanceVSwitchIds")
        public String instanceVSwitchIds;

        /**
         * <p>The ID of the virtual private cloud (VPC) to which the ApsaraMQ for RocketMQ instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1a4gmlk31hy***l3ss</p>
         */
        @NameInMap("InstanceVpcId")
        public String instanceVpcId;

        @NameInMap("Network")
        public String network;

        /**
         * <p>The offset from which messages are consumed. Valid values: CONSUMEFROMLASTOFFSET: Messages are consumed from the latest offset. CONSUMEFROMFIRSTOFFSET: Messages are consumed from the earliest offset. CONSUME_FROM_TIMESTAMP: Messages are consumed from the offset at the specified point in time.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSUMEFROMTIMESTAMP</p>
         */
        @NameInMap("Offset")
        public String offset;

        /**
         * <p>The ID of the region where the ApsaraMQ for RocketMQ instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-chengdu</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The tag that is used to filter messages.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The timestamp that indicates the time from which messages are consumed. This parameter is valid only if Offset is set to CONSUMEFROMTIMESTAMP.</p>
         * 
         * <strong>example:</strong>
         * <p>1670742074043</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <p>The topic from which messages are sent.</p>
         * 
         * <strong>example:</strong>
         * <p>topic_add_anima</p>
         */
        @NameInMap("Topic")
        public String topic;

        @NameInMap("VSwitchIds")
        public String vSwitchIds;

        @NameInMap("VpcId")
        public String vpcId;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRocketMQParameters build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRocketMQParameters self = new ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRocketMQParameters();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRocketMQParameters setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRocketMQParameters setBodyDataType(String bodyDataType) {
            this.bodyDataType = bodyDataType;
            return this;
        }
        public String getBodyDataType() {
            return this.bodyDataType;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRocketMQParameters setFilterSql(String filterSql) {
            this.filterSql = filterSql;
            return this;
        }
        public String getFilterSql() {
            return this.filterSql;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRocketMQParameters setFilterType(String filterType) {
            this.filterType = filterType;
            return this;
        }
        public String getFilterType() {
            return this.filterType;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRocketMQParameters setGroupID(String groupID) {
            this.groupID = groupID;
            return this;
        }
        public String getGroupID() {
            return this.groupID;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRocketMQParameters setInstanceEndpoint(String instanceEndpoint) {
            this.instanceEndpoint = instanceEndpoint;
            return this;
        }
        public String getInstanceEndpoint() {
            return this.instanceEndpoint;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRocketMQParameters setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRocketMQParameters setInstanceNetwork(String instanceNetwork) {
            this.instanceNetwork = instanceNetwork;
            return this;
        }
        public String getInstanceNetwork() {
            return this.instanceNetwork;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRocketMQParameters setInstancePassword(String instancePassword) {
            this.instancePassword = instancePassword;
            return this;
        }
        public String getInstancePassword() {
            return this.instancePassword;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRocketMQParameters setInstanceSecurityGroupId(String instanceSecurityGroupId) {
            this.instanceSecurityGroupId = instanceSecurityGroupId;
            return this;
        }
        public String getInstanceSecurityGroupId() {
            return this.instanceSecurityGroupId;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRocketMQParameters setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRocketMQParameters setInstanceUsername(String instanceUsername) {
            this.instanceUsername = instanceUsername;
            return this;
        }
        public String getInstanceUsername() {
            return this.instanceUsername;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRocketMQParameters setInstanceVSwitchIds(String instanceVSwitchIds) {
            this.instanceVSwitchIds = instanceVSwitchIds;
            return this;
        }
        public String getInstanceVSwitchIds() {
            return this.instanceVSwitchIds;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRocketMQParameters setInstanceVpcId(String instanceVpcId) {
            this.instanceVpcId = instanceVpcId;
            return this;
        }
        public String getInstanceVpcId() {
            return this.instanceVpcId;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRocketMQParameters setNetwork(String network) {
            this.network = network;
            return this;
        }
        public String getNetwork() {
            return this.network;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRocketMQParameters setOffset(String offset) {
            this.offset = offset;
            return this;
        }
        public String getOffset() {
            return this.offset;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRocketMQParameters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRocketMQParameters setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRocketMQParameters setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRocketMQParameters setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRocketMQParameters setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRocketMQParameters setVSwitchIds(String vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public String getVSwitchIds() {
            return this.vSwitchIds;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRocketMQParameters setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceSLSParameters extends TeaModel {
        /**
         * <p>The consumer offset. The value begin indicates the earliest offset. The value end indicates the latest offset. You can also specify a time in seconds to start message consumption.</p>
         * 
         * <strong>example:</strong>
         * <p>begin</p>
         */
        @NameInMap("ConsumePosition")
        public String consumePosition;

        /**
         * <p>The group ID of the consumer that subscribes to the topic.</p>
         * 
         * <strong>example:</strong>
         * <p>go-dts-shelf-group</p>
         */
        @NameInMap("ConsumerGroup")
        public String consumerGroup;

        /**
         * <p>The Simple Log Service Logstore.</p>
         * 
         * <strong>example:</strong>
         * <p>waf-logstore</p>
         */
        @NameInMap("LogStore")
        public String logStore;

        /**
         * <p>The Simple Log Service project.</p>
         * 
         * <strong>example:</strong>
         * <p>dmmzk</p>
         */
        @NameInMap("Project")
        public String project;

        /**
         * <p>The role name. If you want to authorize EventBridge to use this role to read logs in Simple Log Service, you must select Alibaba Cloud Service for Selected Trusted Entity and EventBridge for Select Trusted Service when you create the role in the Resource Access Management (RAM) console.</p>
         * 
         * <strong>example:</strong>
         * <p>testRole</p>
         */
        @NameInMap("RoleName")
        public String roleName;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceSLSParameters build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceSLSParameters self = new ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceSLSParameters();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceSLSParameters setConsumePosition(String consumePosition) {
            this.consumePosition = consumePosition;
            return this;
        }
        public String getConsumePosition() {
            return this.consumePosition;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceSLSParameters setConsumerGroup(String consumerGroup) {
            this.consumerGroup = consumerGroup;
            return this;
        }
        public String getConsumerGroup() {
            return this.consumerGroup;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceSLSParameters setLogStore(String logStore) {
            this.logStore = logStore;
            return this;
        }
        public String getLogStore() {
            return this.logStore;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceSLSParameters setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceSLSParameters setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSource extends TeaModel {
        @NameInMap("SourceApacheRocketMQCheckpointParameters")
        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceApacheRocketMQCheckpointParameters sourceApacheRocketMQCheckpointParameters;

        @NameInMap("SourceCustomizedKafkaConnectorParameters")
        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceCustomizedKafkaConnectorParameters sourceCustomizedKafkaConnectorParameters;

        @NameInMap("SourceCustomizedKafkaParameters")
        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceCustomizedKafkaParameters sourceCustomizedKafkaParameters;

        /**
         * <p>The parameters that are returned if Data Transmission Service (DTS) is specified as the event source.</p>
         */
        @NameInMap("SourceDTSParameters")
        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceDTSParameters sourceDTSParameters;

        @NameInMap("SourceEventBusParameters")
        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceEventBusParameters sourceEventBusParameters;

        /**
         * <p>The parameters that are returned if ApsaraMQ for Kafka is specified as the event source.</p>
         */
        @NameInMap("SourceKafkaParameters")
        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceKafkaParameters sourceKafkaParameters;

        /**
         * <p>The parameters that are returned if Message Queue (MNS) is specified as the event source.</p>
         */
        @NameInMap("SourceMNSParameters")
        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceMNSParameters sourceMNSParameters;

        /**
         * <p>The parameters that are returned if ApsaraMQ for MQTT is specified as the event source.</p>
         */
        @NameInMap("SourceMQTTParameters")
        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceMQTTParameters sourceMQTTParameters;

        @NameInMap("SourceOSSParameters")
        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceOSSParameters sourceOSSParameters;

        @NameInMap("SourceOpenSourceRabbitMQParameters")
        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceOpenSourceRabbitMQParameters sourceOpenSourceRabbitMQParameters;

        @NameInMap("SourcePrometheusParameters")
        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourcePrometheusParameters sourcePrometheusParameters;

        /**
         * <p>The parameters that are returned if ApsaraMQ for RabbitMQ is specified as the event source.</p>
         */
        @NameInMap("SourceRabbitMQParameters")
        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRabbitMQParameters sourceRabbitMQParameters;

        @NameInMap("SourceRocketMQCheckpointParameters")
        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRocketMQCheckpointParameters sourceRocketMQCheckpointParameters;

        /**
         * <p>The parameters that are returned if ApsaraMQ for RocketMQ is specified as the event source.</p>
         */
        @NameInMap("SourceRocketMQParameters")
        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRocketMQParameters sourceRocketMQParameters;

        /**
         * <p>The parameters that are returned if Simple Log Service is specified as the event source.</p>
         */
        @NameInMap("SourceSLSParameters")
        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceSLSParameters sourceSLSParameters;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSource build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSource self = new ListEventStreamingsResponseBodyDataEventStreamingsSource();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSource setSourceApacheRocketMQCheckpointParameters(ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceApacheRocketMQCheckpointParameters sourceApacheRocketMQCheckpointParameters) {
            this.sourceApacheRocketMQCheckpointParameters = sourceApacheRocketMQCheckpointParameters;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceApacheRocketMQCheckpointParameters getSourceApacheRocketMQCheckpointParameters() {
            return this.sourceApacheRocketMQCheckpointParameters;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSource setSourceCustomizedKafkaConnectorParameters(ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceCustomizedKafkaConnectorParameters sourceCustomizedKafkaConnectorParameters) {
            this.sourceCustomizedKafkaConnectorParameters = sourceCustomizedKafkaConnectorParameters;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceCustomizedKafkaConnectorParameters getSourceCustomizedKafkaConnectorParameters() {
            return this.sourceCustomizedKafkaConnectorParameters;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSource setSourceCustomizedKafkaParameters(ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceCustomizedKafkaParameters sourceCustomizedKafkaParameters) {
            this.sourceCustomizedKafkaParameters = sourceCustomizedKafkaParameters;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceCustomizedKafkaParameters getSourceCustomizedKafkaParameters() {
            return this.sourceCustomizedKafkaParameters;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSource setSourceDTSParameters(ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceDTSParameters sourceDTSParameters) {
            this.sourceDTSParameters = sourceDTSParameters;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceDTSParameters getSourceDTSParameters() {
            return this.sourceDTSParameters;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSource setSourceEventBusParameters(ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceEventBusParameters sourceEventBusParameters) {
            this.sourceEventBusParameters = sourceEventBusParameters;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceEventBusParameters getSourceEventBusParameters() {
            return this.sourceEventBusParameters;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSource setSourceKafkaParameters(ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceKafkaParameters sourceKafkaParameters) {
            this.sourceKafkaParameters = sourceKafkaParameters;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceKafkaParameters getSourceKafkaParameters() {
            return this.sourceKafkaParameters;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSource setSourceMNSParameters(ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceMNSParameters sourceMNSParameters) {
            this.sourceMNSParameters = sourceMNSParameters;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceMNSParameters getSourceMNSParameters() {
            return this.sourceMNSParameters;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSource setSourceMQTTParameters(ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceMQTTParameters sourceMQTTParameters) {
            this.sourceMQTTParameters = sourceMQTTParameters;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceMQTTParameters getSourceMQTTParameters() {
            return this.sourceMQTTParameters;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSource setSourceOSSParameters(ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceOSSParameters sourceOSSParameters) {
            this.sourceOSSParameters = sourceOSSParameters;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceOSSParameters getSourceOSSParameters() {
            return this.sourceOSSParameters;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSource setSourceOpenSourceRabbitMQParameters(ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceOpenSourceRabbitMQParameters sourceOpenSourceRabbitMQParameters) {
            this.sourceOpenSourceRabbitMQParameters = sourceOpenSourceRabbitMQParameters;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceOpenSourceRabbitMQParameters getSourceOpenSourceRabbitMQParameters() {
            return this.sourceOpenSourceRabbitMQParameters;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSource setSourcePrometheusParameters(ListEventStreamingsResponseBodyDataEventStreamingsSourceSourcePrometheusParameters sourcePrometheusParameters) {
            this.sourcePrometheusParameters = sourcePrometheusParameters;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourcePrometheusParameters getSourcePrometheusParameters() {
            return this.sourcePrometheusParameters;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSource setSourceRabbitMQParameters(ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRabbitMQParameters sourceRabbitMQParameters) {
            this.sourceRabbitMQParameters = sourceRabbitMQParameters;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRabbitMQParameters getSourceRabbitMQParameters() {
            return this.sourceRabbitMQParameters;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSource setSourceRocketMQCheckpointParameters(ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRocketMQCheckpointParameters sourceRocketMQCheckpointParameters) {
            this.sourceRocketMQCheckpointParameters = sourceRocketMQCheckpointParameters;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRocketMQCheckpointParameters getSourceRocketMQCheckpointParameters() {
            return this.sourceRocketMQCheckpointParameters;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSource setSourceRocketMQParameters(ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRocketMQParameters sourceRocketMQParameters) {
            this.sourceRocketMQParameters = sourceRocketMQParameters;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRocketMQParameters getSourceRocketMQParameters() {
            return this.sourceRocketMQParameters;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSource setSourceSLSParameters(ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceSLSParameters sourceSLSParameters) {
            this.sourceSLSParameters = sourceSLSParameters;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceSLSParameters getSourceSLSParameters() {
            return this.sourceSLSParameters;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsTransforms extends TeaModel {
        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the cloud service, such as the ARN of a Function Compute function.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:fc:cn-hangzhou:*****:services/demo-service.LATEST/functions/demo-func</p>
         */
        @NameInMap("Arn")
        public String arn;

        public static ListEventStreamingsResponseBodyDataEventStreamingsTransforms build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsTransforms self = new ListEventStreamingsResponseBodyDataEventStreamingsTransforms();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsTransforms setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamings extends TeaModel {
        /**
         * <p>The description of the event stream.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the event stream.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("EventStreamingName")
        public String eventStreamingName;

        /**
         * <p>The rule that is used to filter events. If you leave this parameter empty, all events are matched.</p>
         */
        @NameInMap("FilterPattern")
        public String filterPattern;

        /**
         * <p>The parameters that are returned for the runtime environment.</p>
         */
        @NameInMap("RunOptions")
        public ListEventStreamingsResponseBodyDataEventStreamingsRunOptions runOptions;

        /**
         * <p>The event target.</p>
         */
        @NameInMap("Sink")
        public ListEventStreamingsResponseBodyDataEventStreamingsSink sink;

        /**
         * <p>The event provider, which is also known as the event source.</p>
         */
        @NameInMap("Source")
        public ListEventStreamingsResponseBodyDataEventStreamingsSource source;

        /**
         * <p>The status of the event stream that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The transformation-related configurations.</p>
         */
        @NameInMap("Transforms")
        public java.util.List<ListEventStreamingsResponseBodyDataEventStreamingsTransforms> transforms;

        public static ListEventStreamingsResponseBodyDataEventStreamings build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamings self = new ListEventStreamingsResponseBodyDataEventStreamings();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamings setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListEventStreamingsResponseBodyDataEventStreamings setEventStreamingName(String eventStreamingName) {
            this.eventStreamingName = eventStreamingName;
            return this;
        }
        public String getEventStreamingName() {
            return this.eventStreamingName;
        }

        public ListEventStreamingsResponseBodyDataEventStreamings setFilterPattern(String filterPattern) {
            this.filterPattern = filterPattern;
            return this;
        }
        public String getFilterPattern() {
            return this.filterPattern;
        }

        public ListEventStreamingsResponseBodyDataEventStreamings setRunOptions(ListEventStreamingsResponseBodyDataEventStreamingsRunOptions runOptions) {
            this.runOptions = runOptions;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsRunOptions getRunOptions() {
            return this.runOptions;
        }

        public ListEventStreamingsResponseBodyDataEventStreamings setSink(ListEventStreamingsResponseBodyDataEventStreamingsSink sink) {
            this.sink = sink;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSink getSink() {
            return this.sink;
        }

        public ListEventStreamingsResponseBodyDataEventStreamings setSource(ListEventStreamingsResponseBodyDataEventStreamingsSource source) {
            this.source = source;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSource getSource() {
            return this.source;
        }

        public ListEventStreamingsResponseBodyDataEventStreamings setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListEventStreamingsResponseBodyDataEventStreamings setTransforms(java.util.List<ListEventStreamingsResponseBodyDataEventStreamingsTransforms> transforms) {
            this.transforms = transforms;
            return this;
        }
        public java.util.List<ListEventStreamingsResponseBodyDataEventStreamingsTransforms> getTransforms() {
            return this.transforms;
        }

    }

    public static class ListEventStreamingsResponseBodyData extends TeaModel {
        /**
         * <p>The event streams.</p>
         */
        @NameInMap("EventStreamings")
        public java.util.List<ListEventStreamingsResponseBodyDataEventStreamings> eventStreamings;

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists. You must specify the pagination token in the next request.</p>
         * 
         * <strong>example:</strong>
         * <p>177</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static ListEventStreamingsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyData self = new ListEventStreamingsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyData setEventStreamings(java.util.List<ListEventStreamingsResponseBodyDataEventStreamings> eventStreamings) {
            this.eventStreamings = eventStreamings;
            return this;
        }
        public java.util.List<ListEventStreamingsResponseBodyDataEventStreamings> getEventStreamings() {
            return this.eventStreamings;
        }

        public ListEventStreamingsResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListEventStreamingsResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
