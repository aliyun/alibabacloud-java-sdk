// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class UpdateEventStreamingRequest extends TeaModel {
    /**
     * <p>The description of the event stream.</p>
     * 
     * <strong>example:</strong>
     * <p>rocketmq2mns</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the event stream.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>myeventstreaming</p>
     */
    @NameInMap("EventStreamingName")
    public String eventStreamingName;

    /**
     * <p>The rule that is used to filter events. If you leave this parameter empty, all events are matched.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FilterPattern")
    public String filterPattern;

    /**
     * <p>The parameters that are configured for the runtime environment.</p>
     */
    @NameInMap("RunOptions")
    public UpdateEventStreamingRequestRunOptions runOptions;

    /**
     * <p>The event target. You must and can specify only one event target.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Sink")
    public UpdateEventStreamingRequestSink sink;

    /**
     * <p>The event provider, which is also known as the event source. You must and can specify only one event source.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Source")
    public UpdateEventStreamingRequestSource source;

    @NameInMap("Transforms")
    public java.util.List<UpdateEventStreamingRequestTransforms> transforms;

    public static UpdateEventStreamingRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEventStreamingRequest self = new UpdateEventStreamingRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEventStreamingRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateEventStreamingRequest setEventStreamingName(String eventStreamingName) {
        this.eventStreamingName = eventStreamingName;
        return this;
    }
    public String getEventStreamingName() {
        return this.eventStreamingName;
    }

    public UpdateEventStreamingRequest setFilterPattern(String filterPattern) {
        this.filterPattern = filterPattern;
        return this;
    }
    public String getFilterPattern() {
        return this.filterPattern;
    }

    public UpdateEventStreamingRequest setRunOptions(UpdateEventStreamingRequestRunOptions runOptions) {
        this.runOptions = runOptions;
        return this;
    }
    public UpdateEventStreamingRequestRunOptions getRunOptions() {
        return this.runOptions;
    }

    public UpdateEventStreamingRequest setSink(UpdateEventStreamingRequestSink sink) {
        this.sink = sink;
        return this;
    }
    public UpdateEventStreamingRequestSink getSink() {
        return this.sink;
    }

    public UpdateEventStreamingRequest setSource(UpdateEventStreamingRequestSource source) {
        this.source = source;
        return this;
    }
    public UpdateEventStreamingRequestSource getSource() {
        return this.source;
    }

    public UpdateEventStreamingRequest setTransforms(java.util.List<UpdateEventStreamingRequestTransforms> transforms) {
        this.transforms = transforms;
        return this;
    }
    public java.util.List<UpdateEventStreamingRequestTransforms> getTransforms() {
        return this.transforms;
    }

    public static class UpdateEventStreamingRequestRunOptionsBatchWindow extends TeaModel {
        /**
         * <p>The maximum number of events that are allowed in the batch window. When this threshold is reached, data in the window is pushed to the downstream service. If multiple batch windows exist, data is pushed if triggering conditions are met in one of the windows.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CountBasedWindow")
        public Integer countBasedWindow;

        /**
         * <p>The maximum period of time during which events are allowed in the batch window. Unit: seconds. When this threshold is reached, data in the window is pushed to the downstream service. If multiple batch windows exist, data is pushed if triggering conditions are met in one of the windows.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TimeBasedWindow")
        public Integer timeBasedWindow;

        public static UpdateEventStreamingRequestRunOptionsBatchWindow build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestRunOptionsBatchWindow self = new UpdateEventStreamingRequestRunOptionsBatchWindow();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestRunOptionsBatchWindow setCountBasedWindow(Integer countBasedWindow) {
            this.countBasedWindow = countBasedWindow;
            return this;
        }
        public Integer getCountBasedWindow() {
            return this.countBasedWindow;
        }

        public UpdateEventStreamingRequestRunOptionsBatchWindow setTimeBasedWindow(Integer timeBasedWindow) {
            this.timeBasedWindow = timeBasedWindow;
            return this;
        }
        public Integer getTimeBasedWindow() {
            return this.timeBasedWindow;
        }

    }

    public static class UpdateEventStreamingRequestRunOptionsDeadLetterQueue extends TeaModel {
        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the dead-letter queue.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::1317334647812936:role/rdstoecsassumekms</p>
         */
        @NameInMap("Arn")
        public String arn;

        public static UpdateEventStreamingRequestRunOptionsDeadLetterQueue build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestRunOptionsDeadLetterQueue self = new UpdateEventStreamingRequestRunOptionsDeadLetterQueue();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestRunOptionsDeadLetterQueue setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

    }

    public static class UpdateEventStreamingRequestRunOptionsLogDeliveryKafkaLogParameters extends TeaModel {
        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Topic")
        public String topic;

        public static UpdateEventStreamingRequestRunOptionsLogDeliveryKafkaLogParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestRunOptionsLogDeliveryKafkaLogParameters self = new UpdateEventStreamingRequestRunOptionsLogDeliveryKafkaLogParameters();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestRunOptionsLogDeliveryKafkaLogParameters setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public UpdateEventStreamingRequestRunOptionsLogDeliveryKafkaLogParameters setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UpdateEventStreamingRequestRunOptionsLogDeliveryKafkaLogParameters setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class UpdateEventStreamingRequestRunOptionsLogDeliverySLSLogParameters extends TeaModel {
        @NameInMap("LogstoreName")
        public String logstoreName;

        @NameInMap("ProjectName")
        public String projectName;

        public static UpdateEventStreamingRequestRunOptionsLogDeliverySLSLogParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestRunOptionsLogDeliverySLSLogParameters self = new UpdateEventStreamingRequestRunOptionsLogDeliverySLSLogParameters();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestRunOptionsLogDeliverySLSLogParameters setLogstoreName(String logstoreName) {
            this.logstoreName = logstoreName;
            return this;
        }
        public String getLogstoreName() {
            return this.logstoreName;
        }

        public UpdateEventStreamingRequestRunOptionsLogDeliverySLSLogParameters setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

    }

    public static class UpdateEventStreamingRequestRunOptionsLogDelivery extends TeaModel {
        @NameInMap("KafkaLogParameters")
        public java.util.List<UpdateEventStreamingRequestRunOptionsLogDeliveryKafkaLogParameters> kafkaLogParameters;

        @NameInMap("SLSLogParameters")
        public java.util.List<UpdateEventStreamingRequestRunOptionsLogDeliverySLSLogParameters> SLSLogParameters;

        public static UpdateEventStreamingRequestRunOptionsLogDelivery build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestRunOptionsLogDelivery self = new UpdateEventStreamingRequestRunOptionsLogDelivery();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestRunOptionsLogDelivery setKafkaLogParameters(java.util.List<UpdateEventStreamingRequestRunOptionsLogDeliveryKafkaLogParameters> kafkaLogParameters) {
            this.kafkaLogParameters = kafkaLogParameters;
            return this;
        }
        public java.util.List<UpdateEventStreamingRequestRunOptionsLogDeliveryKafkaLogParameters> getKafkaLogParameters() {
            return this.kafkaLogParameters;
        }

        public UpdateEventStreamingRequestRunOptionsLogDelivery setSLSLogParameters(java.util.List<UpdateEventStreamingRequestRunOptionsLogDeliverySLSLogParameters> SLSLogParameters) {
            this.SLSLogParameters = SLSLogParameters;
            return this;
        }
        public java.util.List<UpdateEventStreamingRequestRunOptionsLogDeliverySLSLogParameters> getSLSLogParameters() {
            return this.SLSLogParameters;
        }

    }

    public static class UpdateEventStreamingRequestRunOptionsNetwork extends TeaModel {
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        @NameInMap("VpcId")
        public String vpcId;

        public static UpdateEventStreamingRequestRunOptionsNetwork build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestRunOptionsNetwork self = new UpdateEventStreamingRequestRunOptionsNetwork();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestRunOptionsNetwork setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public UpdateEventStreamingRequestRunOptionsNetwork setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public UpdateEventStreamingRequestRunOptionsNetwork setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class UpdateEventStreamingRequestRunOptionsResourceSpecResources extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public Integer value;

        public static UpdateEventStreamingRequestRunOptionsResourceSpecResources build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestRunOptionsResourceSpecResources self = new UpdateEventStreamingRequestRunOptionsResourceSpecResources();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestRunOptionsResourceSpecResources setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateEventStreamingRequestRunOptionsResourceSpecResources setValue(Integer value) {
            this.value = value;
            return this;
        }
        public Integer getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestRunOptionsResourceSpec extends TeaModel {
        @NameInMap("Resources")
        public java.util.List<UpdateEventStreamingRequestRunOptionsResourceSpecResources> resources;

        public static UpdateEventStreamingRequestRunOptionsResourceSpec build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestRunOptionsResourceSpec self = new UpdateEventStreamingRequestRunOptionsResourceSpec();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestRunOptionsResourceSpec setResources(java.util.List<UpdateEventStreamingRequestRunOptionsResourceSpecResources> resources) {
            this.resources = resources;
            return this;
        }
        public java.util.List<UpdateEventStreamingRequestRunOptionsResourceSpecResources> getResources() {
            return this.resources;
        }

    }

    public static class UpdateEventStreamingRequestRunOptionsRetryStrategy extends TeaModel {
        /**
         * <p>The maximum timeout period for a retry.</p>
         * 
         * <strong>example:</strong>
         * <p>512</p>
         */
        @NameInMap("MaximumEventAgeInSeconds")
        public Long maximumEventAgeInSeconds;

        /**
         * <p>The maximum number of retries.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MaximumRetryAttempts")
        public Long maximumRetryAttempts;

        /**
         * <p>The retry policy. Valid values: BACKOFF_RETRY and EXPONENTIAL_DECAY_RETRY.</p>
         * 
         * <strong>example:</strong>
         * <p>BACKOFFRETRY</p>
         */
        @NameInMap("PushRetryStrategy")
        public String pushRetryStrategy;

        public static UpdateEventStreamingRequestRunOptionsRetryStrategy build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestRunOptionsRetryStrategy self = new UpdateEventStreamingRequestRunOptionsRetryStrategy();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestRunOptionsRetryStrategy setMaximumEventAgeInSeconds(Long maximumEventAgeInSeconds) {
            this.maximumEventAgeInSeconds = maximumEventAgeInSeconds;
            return this;
        }
        public Long getMaximumEventAgeInSeconds() {
            return this.maximumEventAgeInSeconds;
        }

        public UpdateEventStreamingRequestRunOptionsRetryStrategy setMaximumRetryAttempts(Long maximumRetryAttempts) {
            this.maximumRetryAttempts = maximumRetryAttempts;
            return this;
        }
        public Long getMaximumRetryAttempts() {
            return this.maximumRetryAttempts;
        }

        public UpdateEventStreamingRequestRunOptionsRetryStrategy setPushRetryStrategy(String pushRetryStrategy) {
            this.pushRetryStrategy = pushRetryStrategy;
            return this;
        }
        public String getPushRetryStrategy() {
            return this.pushRetryStrategy;
        }

    }

    public static class UpdateEventStreamingRequestRunOptionsScaledObjectTriggersMetadata extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public Integer value;

        public static UpdateEventStreamingRequestRunOptionsScaledObjectTriggersMetadata build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestRunOptionsScaledObjectTriggersMetadata self = new UpdateEventStreamingRequestRunOptionsScaledObjectTriggersMetadata();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestRunOptionsScaledObjectTriggersMetadata setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateEventStreamingRequestRunOptionsScaledObjectTriggersMetadata setValue(Integer value) {
            this.value = value;
            return this;
        }
        public Integer getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestRunOptionsScaledObjectTriggers extends TeaModel {
        @NameInMap("Metadata")
        public UpdateEventStreamingRequestRunOptionsScaledObjectTriggersMetadata metadata;

        @NameInMap("Type")
        public String type;

        public static UpdateEventStreamingRequestRunOptionsScaledObjectTriggers build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestRunOptionsScaledObjectTriggers self = new UpdateEventStreamingRequestRunOptionsScaledObjectTriggers();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestRunOptionsScaledObjectTriggers setMetadata(UpdateEventStreamingRequestRunOptionsScaledObjectTriggersMetadata metadata) {
            this.metadata = metadata;
            return this;
        }
        public UpdateEventStreamingRequestRunOptionsScaledObjectTriggersMetadata getMetadata() {
            return this.metadata;
        }

        public UpdateEventStreamingRequestRunOptionsScaledObjectTriggers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateEventStreamingRequestRunOptionsScaledObject extends TeaModel {
        @NameInMap("MaxReplicaCount")
        public Integer maxReplicaCount;

        @NameInMap("MinReplicaCount")
        public Integer minReplicaCount;

        @NameInMap("Triggers")
        public java.util.List<UpdateEventStreamingRequestRunOptionsScaledObjectTriggers> triggers;

        public static UpdateEventStreamingRequestRunOptionsScaledObject build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestRunOptionsScaledObject self = new UpdateEventStreamingRequestRunOptionsScaledObject();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestRunOptionsScaledObject setMaxReplicaCount(Integer maxReplicaCount) {
            this.maxReplicaCount = maxReplicaCount;
            return this;
        }
        public Integer getMaxReplicaCount() {
            return this.maxReplicaCount;
        }

        public UpdateEventStreamingRequestRunOptionsScaledObject setMinReplicaCount(Integer minReplicaCount) {
            this.minReplicaCount = minReplicaCount;
            return this;
        }
        public Integer getMinReplicaCount() {
            return this.minReplicaCount;
        }

        public UpdateEventStreamingRequestRunOptionsScaledObject setTriggers(java.util.List<UpdateEventStreamingRequestRunOptionsScaledObjectTriggers> triggers) {
            this.triggers = triggers;
            return this;
        }
        public java.util.List<UpdateEventStreamingRequestRunOptionsScaledObjectTriggers> getTriggers() {
            return this.triggers;
        }

    }

    public static class UpdateEventStreamingRequestRunOptions extends TeaModel {
        /**
         * <p>The batch window.</p>
         */
        @NameInMap("BatchWindow")
        public UpdateEventStreamingRequestRunOptionsBatchWindow batchWindow;

        /**
         * <p>Specifies whether to enable dead-letter queues. By default, dead-letter queues are disabled. Events that fail to be pushed are discarded after the maximum number of retries that is specified by the retry policy is reached.</p>
         */
        @NameInMap("DeadLetterQueue")
        public UpdateEventStreamingRequestRunOptionsDeadLetterQueue deadLetterQueue;

        /**
         * <p>The exception tolerance policy. Valid values: NONE and ALL.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("ErrorsTolerance")
        public String errorsTolerance;

        @NameInMap("LogDelivery")
        public UpdateEventStreamingRequestRunOptionsLogDelivery logDelivery;

        /**
         * <p>The maximum number of concurrent tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MaximumTasks")
        public Long maximumTasks;

        @NameInMap("Network")
        public UpdateEventStreamingRequestRunOptionsNetwork network;

        @NameInMap("ResourceSpec")
        public UpdateEventStreamingRequestRunOptionsResourceSpec resourceSpec;

        /**
         * <p>The retry policy that you want to use if events fail to be pushed.</p>
         */
        @NameInMap("RetryStrategy")
        public UpdateEventStreamingRequestRunOptionsRetryStrategy retryStrategy;

        @NameInMap("RoleName")
        public String roleName;

        @NameInMap("ScaledObject")
        public UpdateEventStreamingRequestRunOptionsScaledObject scaledObject;

        public static UpdateEventStreamingRequestRunOptions build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestRunOptions self = new UpdateEventStreamingRequestRunOptions();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestRunOptions setBatchWindow(UpdateEventStreamingRequestRunOptionsBatchWindow batchWindow) {
            this.batchWindow = batchWindow;
            return this;
        }
        public UpdateEventStreamingRequestRunOptionsBatchWindow getBatchWindow() {
            return this.batchWindow;
        }

        public UpdateEventStreamingRequestRunOptions setDeadLetterQueue(UpdateEventStreamingRequestRunOptionsDeadLetterQueue deadLetterQueue) {
            this.deadLetterQueue = deadLetterQueue;
            return this;
        }
        public UpdateEventStreamingRequestRunOptionsDeadLetterQueue getDeadLetterQueue() {
            return this.deadLetterQueue;
        }

        public UpdateEventStreamingRequestRunOptions setErrorsTolerance(String errorsTolerance) {
            this.errorsTolerance = errorsTolerance;
            return this;
        }
        public String getErrorsTolerance() {
            return this.errorsTolerance;
        }

        public UpdateEventStreamingRequestRunOptions setLogDelivery(UpdateEventStreamingRequestRunOptionsLogDelivery logDelivery) {
            this.logDelivery = logDelivery;
            return this;
        }
        public UpdateEventStreamingRequestRunOptionsLogDelivery getLogDelivery() {
            return this.logDelivery;
        }

        public UpdateEventStreamingRequestRunOptions setMaximumTasks(Long maximumTasks) {
            this.maximumTasks = maximumTasks;
            return this;
        }
        public Long getMaximumTasks() {
            return this.maximumTasks;
        }

        public UpdateEventStreamingRequestRunOptions setNetwork(UpdateEventStreamingRequestRunOptionsNetwork network) {
            this.network = network;
            return this;
        }
        public UpdateEventStreamingRequestRunOptionsNetwork getNetwork() {
            return this.network;
        }

        public UpdateEventStreamingRequestRunOptions setResourceSpec(UpdateEventStreamingRequestRunOptionsResourceSpec resourceSpec) {
            this.resourceSpec = resourceSpec;
            return this;
        }
        public UpdateEventStreamingRequestRunOptionsResourceSpec getResourceSpec() {
            return this.resourceSpec;
        }

        public UpdateEventStreamingRequestRunOptions setRetryStrategy(UpdateEventStreamingRequestRunOptionsRetryStrategy retryStrategy) {
            this.retryStrategy = retryStrategy;
            return this;
        }
        public UpdateEventStreamingRequestRunOptionsRetryStrategy getRetryStrategy() {
            return this.retryStrategy;
        }

        public UpdateEventStreamingRequestRunOptions setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public UpdateEventStreamingRequestRunOptions setScaledObject(UpdateEventStreamingRequestRunOptionsScaledObject scaledObject) {
            this.scaledObject = scaledObject;
            return this;
        }
        public UpdateEventStreamingRequestRunOptionsScaledObject getScaledObject() {
            return this.scaledObject;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkCustomizedKafkaConnectorParametersConnectorParameters extends TeaModel {
        @NameInMap("Config")
        public java.util.Map<String, ?> config;

        @NameInMap("Name")
        public String name;

        public static UpdateEventStreamingRequestSinkSinkCustomizedKafkaConnectorParametersConnectorParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkCustomizedKafkaConnectorParametersConnectorParameters self = new UpdateEventStreamingRequestSinkSinkCustomizedKafkaConnectorParametersConnectorParameters();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkCustomizedKafkaConnectorParametersConnectorParameters setConfig(java.util.Map<String, ?> config) {
            this.config = config;
            return this;
        }
        public java.util.Map<String, ?> getConfig() {
            return this.config;
        }

        public UpdateEventStreamingRequestSinkSinkCustomizedKafkaConnectorParametersConnectorParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkCustomizedKafkaConnectorParameters extends TeaModel {
        @NameInMap("ConnectorPackageUrl")
        public String connectorPackageUrl;

        @NameInMap("ConnectorParameters")
        public UpdateEventStreamingRequestSinkSinkCustomizedKafkaConnectorParametersConnectorParameters connectorParameters;

        @NameInMap("WorkerParameters")
        public java.util.Map<String, ?> workerParameters;

        public static UpdateEventStreamingRequestSinkSinkCustomizedKafkaConnectorParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkCustomizedKafkaConnectorParameters self = new UpdateEventStreamingRequestSinkSinkCustomizedKafkaConnectorParameters();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkCustomizedKafkaConnectorParameters setConnectorPackageUrl(String connectorPackageUrl) {
            this.connectorPackageUrl = connectorPackageUrl;
            return this;
        }
        public String getConnectorPackageUrl() {
            return this.connectorPackageUrl;
        }

        public UpdateEventStreamingRequestSinkSinkCustomizedKafkaConnectorParameters setConnectorParameters(UpdateEventStreamingRequestSinkSinkCustomizedKafkaConnectorParametersConnectorParameters connectorParameters) {
            this.connectorParameters = connectorParameters;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkCustomizedKafkaConnectorParametersConnectorParameters getConnectorParameters() {
            return this.connectorParameters;
        }

        public UpdateEventStreamingRequestSinkSinkCustomizedKafkaConnectorParameters setWorkerParameters(java.util.Map<String, ?> workerParameters) {
            this.workerParameters = workerParameters;
            return this;
        }
        public java.util.Map<String, ?> getWorkerParameters() {
            return this.workerParameters;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkCustomizedKafkaParameters extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        public static UpdateEventStreamingRequestSinkSinkCustomizedKafkaParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkCustomizedKafkaParameters self = new UpdateEventStreamingRequestSinkSinkCustomizedKafkaParameters();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkCustomizedKafkaParameters setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkDataHubParametersBody extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkDataHubParametersBody build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkDataHubParametersBody self = new UpdateEventStreamingRequestSinkSinkDataHubParametersBody();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkDataHubParametersBody setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkDataHubParametersBody setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkDataHubParametersBody setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkDataHubParametersContentSchema extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkDataHubParametersContentSchema build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkDataHubParametersContentSchema self = new UpdateEventStreamingRequestSinkSinkDataHubParametersContentSchema();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkDataHubParametersContentSchema setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkDataHubParametersContentSchema setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkDataHubParametersContentSchema setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkDataHubParametersContentType extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkDataHubParametersContentType build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkDataHubParametersContentType self = new UpdateEventStreamingRequestSinkSinkDataHubParametersContentType();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkDataHubParametersContentType setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkDataHubParametersContentType setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkDataHubParametersContentType setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkDataHubParametersProject extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkDataHubParametersProject build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkDataHubParametersProject self = new UpdateEventStreamingRequestSinkSinkDataHubParametersProject();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkDataHubParametersProject setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkDataHubParametersProject setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkDataHubParametersProject setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkDataHubParametersRoleName extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkDataHubParametersRoleName build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkDataHubParametersRoleName self = new UpdateEventStreamingRequestSinkSinkDataHubParametersRoleName();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkDataHubParametersRoleName setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkDataHubParametersRoleName setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkDataHubParametersRoleName setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkDataHubParametersTopic extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkDataHubParametersTopic build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkDataHubParametersTopic self = new UpdateEventStreamingRequestSinkSinkDataHubParametersTopic();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkDataHubParametersTopic setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkDataHubParametersTopic setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkDataHubParametersTopic setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkDataHubParametersTopicSchema extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkDataHubParametersTopicSchema build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkDataHubParametersTopicSchema self = new UpdateEventStreamingRequestSinkSinkDataHubParametersTopicSchema();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkDataHubParametersTopicSchema setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkDataHubParametersTopicSchema setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkDataHubParametersTopicSchema setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkDataHubParametersTopicType extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkDataHubParametersTopicType build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkDataHubParametersTopicType self = new UpdateEventStreamingRequestSinkSinkDataHubParametersTopicType();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkDataHubParametersTopicType setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkDataHubParametersTopicType setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkDataHubParametersTopicType setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkDataHubParameters extends TeaModel {
        @NameInMap("Body")
        public UpdateEventStreamingRequestSinkSinkDataHubParametersBody body;

        @NameInMap("ContentSchema")
        public UpdateEventStreamingRequestSinkSinkDataHubParametersContentSchema contentSchema;

        @NameInMap("ContentType")
        public UpdateEventStreamingRequestSinkSinkDataHubParametersContentType contentType;

        @NameInMap("Project")
        public UpdateEventStreamingRequestSinkSinkDataHubParametersProject project;

        @NameInMap("RoleName")
        public UpdateEventStreamingRequestSinkSinkDataHubParametersRoleName roleName;

        @NameInMap("Topic")
        public UpdateEventStreamingRequestSinkSinkDataHubParametersTopic topic;

        @NameInMap("TopicSchema")
        public UpdateEventStreamingRequestSinkSinkDataHubParametersTopicSchema topicSchema;

        @NameInMap("TopicType")
        public UpdateEventStreamingRequestSinkSinkDataHubParametersTopicType topicType;

        public static UpdateEventStreamingRequestSinkSinkDataHubParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkDataHubParameters self = new UpdateEventStreamingRequestSinkSinkDataHubParameters();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkDataHubParameters setBody(UpdateEventStreamingRequestSinkSinkDataHubParametersBody body) {
            this.body = body;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkDataHubParametersBody getBody() {
            return this.body;
        }

        public UpdateEventStreamingRequestSinkSinkDataHubParameters setContentSchema(UpdateEventStreamingRequestSinkSinkDataHubParametersContentSchema contentSchema) {
            this.contentSchema = contentSchema;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkDataHubParametersContentSchema getContentSchema() {
            return this.contentSchema;
        }

        public UpdateEventStreamingRequestSinkSinkDataHubParameters setContentType(UpdateEventStreamingRequestSinkSinkDataHubParametersContentType contentType) {
            this.contentType = contentType;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkDataHubParametersContentType getContentType() {
            return this.contentType;
        }

        public UpdateEventStreamingRequestSinkSinkDataHubParameters setProject(UpdateEventStreamingRequestSinkSinkDataHubParametersProject project) {
            this.project = project;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkDataHubParametersProject getProject() {
            return this.project;
        }

        public UpdateEventStreamingRequestSinkSinkDataHubParameters setRoleName(UpdateEventStreamingRequestSinkSinkDataHubParametersRoleName roleName) {
            this.roleName = roleName;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkDataHubParametersRoleName getRoleName() {
            return this.roleName;
        }

        public UpdateEventStreamingRequestSinkSinkDataHubParameters setTopic(UpdateEventStreamingRequestSinkSinkDataHubParametersTopic topic) {
            this.topic = topic;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkDataHubParametersTopic getTopic() {
            return this.topic;
        }

        public UpdateEventStreamingRequestSinkSinkDataHubParameters setTopicSchema(UpdateEventStreamingRequestSinkSinkDataHubParametersTopicSchema topicSchema) {
            this.topicSchema = topicSchema;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkDataHubParametersTopicSchema getTopicSchema() {
            return this.topicSchema;
        }

        public UpdateEventStreamingRequestSinkSinkDataHubParameters setTopicType(UpdateEventStreamingRequestSinkSinkDataHubParametersTopicType topicType) {
            this.topicType = topicType;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkDataHubParametersTopicType getTopicType() {
            return this.topicType;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkFcParametersBody extends TeaModel {
        /**
         * <p>The method that you want to use to transform events.</p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which you want to transform events.</p>
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

        public static UpdateEventStreamingRequestSinkSinkFcParametersBody build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkFcParametersBody self = new UpdateEventStreamingRequestSinkSinkFcParametersBody();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkFcParametersBody setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkFcParametersBody setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkFcParametersBody setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkFcParametersConcurrency extends TeaModel {
        /**
         * <p>The method that you want to use to transform events. Default value: CONSTANT.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>None.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
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

        public static UpdateEventStreamingRequestSinkSinkFcParametersConcurrency build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkFcParametersConcurrency self = new UpdateEventStreamingRequestSinkSinkFcParametersConcurrency();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkFcParametersConcurrency setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkFcParametersConcurrency setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkFcParametersConcurrency setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkFcParametersFunctionName extends TeaModel {
        /**
         * <p>The method that you want to use to transform events. Default value: CONSTANT.</p>
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

        public static UpdateEventStreamingRequestSinkSinkFcParametersFunctionName build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkFcParametersFunctionName self = new UpdateEventStreamingRequestSinkSinkFcParametersFunctionName();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkFcParametersFunctionName setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkFcParametersFunctionName setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkFcParametersFunctionName setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkFcParametersInvocationType extends TeaModel {
        /**
         * <p>The method that you want to use to transform events. Default value: CONSTANT.</p>
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
         * <p>The invocation mode.</p>
         * 
         * <strong>example:</strong>
         * <p>Async</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkFcParametersInvocationType build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkFcParametersInvocationType self = new UpdateEventStreamingRequestSinkSinkFcParametersInvocationType();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkFcParametersInvocationType setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkFcParametersInvocationType setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkFcParametersInvocationType setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkFcParametersQualifier extends TeaModel {
        /**
         * <p>The method that you want to use to transform events. Default value: CONSTANT.</p>
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

        public static UpdateEventStreamingRequestSinkSinkFcParametersQualifier build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkFcParametersQualifier self = new UpdateEventStreamingRequestSinkSinkFcParametersQualifier();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkFcParametersQualifier setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkFcParametersQualifier setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkFcParametersQualifier setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkFcParametersServiceName extends TeaModel {
        /**
         * <p>The method that you want to use to transform events. Default value: CONSTANT.</p>
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

        public static UpdateEventStreamingRequestSinkSinkFcParametersServiceName build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkFcParametersServiceName self = new UpdateEventStreamingRequestSinkSinkFcParametersServiceName();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkFcParametersServiceName setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkFcParametersServiceName setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkFcParametersServiceName setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkFcParameters extends TeaModel {
        /**
         * <p>The message body that you want to deliver to the function.</p>
         */
        @NameInMap("Body")
        public UpdateEventStreamingRequestSinkSinkFcParametersBody body;

        /**
         * <p>The delivery concurrency. Minimum value: 1.</p>
         */
        @NameInMap("Concurrency")
        public UpdateEventStreamingRequestSinkSinkFcParametersConcurrency concurrency;

        /**
         * <p>The function name.</p>
         */
        @NameInMap("FunctionName")
        public UpdateEventStreamingRequestSinkSinkFcParametersFunctionName functionName;

        /**
         * <p>The invocation mode. Valid values: Sync and Async.</p>
         */
        @NameInMap("InvocationType")
        public UpdateEventStreamingRequestSinkSinkFcParametersInvocationType invocationType;

        /**
         * <p>The alias of the service to which the function belongs.</p>
         */
        @NameInMap("Qualifier")
        public UpdateEventStreamingRequestSinkSinkFcParametersQualifier qualifier;

        /**
         * <p>The service name.</p>
         */
        @NameInMap("ServiceName")
        public UpdateEventStreamingRequestSinkSinkFcParametersServiceName serviceName;

        public static UpdateEventStreamingRequestSinkSinkFcParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkFcParameters self = new UpdateEventStreamingRequestSinkSinkFcParameters();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkFcParameters setBody(UpdateEventStreamingRequestSinkSinkFcParametersBody body) {
            this.body = body;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkFcParametersBody getBody() {
            return this.body;
        }

        public UpdateEventStreamingRequestSinkSinkFcParameters setConcurrency(UpdateEventStreamingRequestSinkSinkFcParametersConcurrency concurrency) {
            this.concurrency = concurrency;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkFcParametersConcurrency getConcurrency() {
            return this.concurrency;
        }

        public UpdateEventStreamingRequestSinkSinkFcParameters setFunctionName(UpdateEventStreamingRequestSinkSinkFcParametersFunctionName functionName) {
            this.functionName = functionName;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkFcParametersFunctionName getFunctionName() {
            return this.functionName;
        }

        public UpdateEventStreamingRequestSinkSinkFcParameters setInvocationType(UpdateEventStreamingRequestSinkSinkFcParametersInvocationType invocationType) {
            this.invocationType = invocationType;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkFcParametersInvocationType getInvocationType() {
            return this.invocationType;
        }

        public UpdateEventStreamingRequestSinkSinkFcParameters setQualifier(UpdateEventStreamingRequestSinkSinkFcParametersQualifier qualifier) {
            this.qualifier = qualifier;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkFcParametersQualifier getQualifier() {
            return this.qualifier;
        }

        public UpdateEventStreamingRequestSinkSinkFcParameters setServiceName(UpdateEventStreamingRequestSinkSinkFcParametersServiceName serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkFcParametersServiceName getServiceName() {
            return this.serviceName;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkFnfParametersExecutionName extends TeaModel {
        /**
         * <p>The method that you want to use to transform events. Default value: CONSTANT.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which you want to transform events.</p>
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

        public static UpdateEventStreamingRequestSinkSinkFnfParametersExecutionName build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkFnfParametersExecutionName self = new UpdateEventStreamingRequestSinkSinkFnfParametersExecutionName();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkFnfParametersExecutionName setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkFnfParametersExecutionName setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkFnfParametersExecutionName setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkFnfParametersFlowName extends TeaModel {
        /**
         * <p>The method that you want to use to transform events. Default value: CONSTANT.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which you want to transform events.</p>
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

        public static UpdateEventStreamingRequestSinkSinkFnfParametersFlowName build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkFnfParametersFlowName self = new UpdateEventStreamingRequestSinkSinkFnfParametersFlowName();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkFnfParametersFlowName setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkFnfParametersFlowName setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkFnfParametersFlowName setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkFnfParametersInput extends TeaModel {
        /**
         * <p>The method that you want to use to transform events. Default value: CONSTANT.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which you want to transform events.</p>
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

        public static UpdateEventStreamingRequestSinkSinkFnfParametersInput build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkFnfParametersInput self = new UpdateEventStreamingRequestSinkSinkFnfParametersInput();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkFnfParametersInput setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkFnfParametersInput setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkFnfParametersInput setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkFnfParametersRoleName extends TeaModel {
        /**
         * <p>The method that you want to use to transform events. Default value: CONSTANT.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which you want to transform events.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The role name.</p>
         * 
         * <strong>example:</strong>
         * <p>Al<strong><strong>FNF-x</strong></strong></p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkFnfParametersRoleName build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkFnfParametersRoleName self = new UpdateEventStreamingRequestSinkSinkFnfParametersRoleName();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkFnfParametersRoleName setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkFnfParametersRoleName setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkFnfParametersRoleName setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkFnfParameters extends TeaModel {
        /**
         * <p>The execution name.</p>
         */
        @NameInMap("ExecutionName")
        public UpdateEventStreamingRequestSinkSinkFnfParametersExecutionName executionName;

        /**
         * <p>The flow name.</p>
         */
        @NameInMap("FlowName")
        public UpdateEventStreamingRequestSinkSinkFnfParametersFlowName flowName;

        /**
         * <p>The input information of the execution.</p>
         */
        @NameInMap("Input")
        public UpdateEventStreamingRequestSinkSinkFnfParametersInput input;

        /**
         * <p>The role name.</p>
         */
        @NameInMap("RoleName")
        public UpdateEventStreamingRequestSinkSinkFnfParametersRoleName roleName;

        public static UpdateEventStreamingRequestSinkSinkFnfParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkFnfParameters self = new UpdateEventStreamingRequestSinkSinkFnfParameters();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkFnfParameters setExecutionName(UpdateEventStreamingRequestSinkSinkFnfParametersExecutionName executionName) {
            this.executionName = executionName;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkFnfParametersExecutionName getExecutionName() {
            return this.executionName;
        }

        public UpdateEventStreamingRequestSinkSinkFnfParameters setFlowName(UpdateEventStreamingRequestSinkSinkFnfParametersFlowName flowName) {
            this.flowName = flowName;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkFnfParametersFlowName getFlowName() {
            return this.flowName;
        }

        public UpdateEventStreamingRequestSinkSinkFnfParameters setInput(UpdateEventStreamingRequestSinkSinkFnfParametersInput input) {
            this.input = input;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkFnfParametersInput getInput() {
            return this.input;
        }

        public UpdateEventStreamingRequestSinkSinkFnfParameters setRoleName(UpdateEventStreamingRequestSinkSinkFnfParametersRoleName roleName) {
            this.roleName = roleName;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkFnfParametersRoleName getRoleName() {
            return this.roleName;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkKafkaParametersAcks extends TeaModel {
        /**
         * <p>The method that you want to use to transform events. Default value: CONSTANT.</p>
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

        public static UpdateEventStreamingRequestSinkSinkKafkaParametersAcks build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkKafkaParametersAcks self = new UpdateEventStreamingRequestSinkSinkKafkaParametersAcks();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkKafkaParametersAcks setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkKafkaParametersAcks setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkKafkaParametersAcks setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkKafkaParametersInstanceId extends TeaModel {
        /**
         * <p>The method that you want to use to transform events. Default value: CONSTANT.</p>
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

        public static UpdateEventStreamingRequestSinkSinkKafkaParametersInstanceId build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkKafkaParametersInstanceId self = new UpdateEventStreamingRequestSinkSinkKafkaParametersInstanceId();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkKafkaParametersInstanceId setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkKafkaParametersInstanceId setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkKafkaParametersInstanceId setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkKafkaParametersKey extends TeaModel {
        /**
         * <p>The method that you want to use to transform events. Default value: CONSTANT.</p>
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

        public static UpdateEventStreamingRequestSinkSinkKafkaParametersKey build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkKafkaParametersKey self = new UpdateEventStreamingRequestSinkSinkKafkaParametersKey();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkKafkaParametersKey setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkKafkaParametersKey setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkKafkaParametersKey setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkKafkaParametersTopic extends TeaModel {
        /**
         * <p>The method that you want to use to transform events. Default value: CONSTANT.</p>
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
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkKafkaParametersTopic build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkKafkaParametersTopic self = new UpdateEventStreamingRequestSinkSinkKafkaParametersTopic();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkKafkaParametersTopic setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkKafkaParametersTopic setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkKafkaParametersTopic setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkKafkaParametersValue extends TeaModel {
        /**
         * <p>The method that you want to use to transform events.</p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which you want to transform events.</p>
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

        public static UpdateEventStreamingRequestSinkSinkKafkaParametersValue build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkKafkaParametersValue self = new UpdateEventStreamingRequestSinkSinkKafkaParametersValue();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkKafkaParametersValue setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkKafkaParametersValue setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkKafkaParametersValue setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkKafkaParameters extends TeaModel {
        /**
         * <p>The acknowledgment (ACK) mode.</p>
         * <ul>
         * <li>If you set this parameter to 0, no response is returned from the broker. In this mode, the performance is high, but the risk of data loss is also high.</li>
         * <li>If you set this parameter to 1, a response is returned when data is written to the leader. In this mode, the performance and the risk of data loss are moderate. Data loss may occur if a failure occurs on the leader.</li>
         * <li>If you set this parameter to all, a response is returned when data is written to the leader and synchronized to the followers. In this mode, the performance is low, but the risk of data loss is also low. Data loss occurs if the leader and the followers fail at the same time.</li>
         * </ul>
         */
        @NameInMap("Acks")
        public UpdateEventStreamingRequestSinkSinkKafkaParametersAcks acks;

        /**
         * <p>The ID of the ApsaraMQ for Kafka instance.</p>
         */
        @NameInMap("InstanceId")
        public UpdateEventStreamingRequestSinkSinkKafkaParametersInstanceId instanceId;

        /**
         * <p>The message key.</p>
         */
        @NameInMap("Key")
        public UpdateEventStreamingRequestSinkSinkKafkaParametersKey key;

        /**
         * <p>The name of the topic on the ApsaraMQ for Kafka instance.</p>
         */
        @NameInMap("Topic")
        public UpdateEventStreamingRequestSinkSinkKafkaParametersTopic topic;

        /**
         * <p>The message body.</p>
         */
        @NameInMap("Value")
        public UpdateEventStreamingRequestSinkSinkKafkaParametersValue value;

        public static UpdateEventStreamingRequestSinkSinkKafkaParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkKafkaParameters self = new UpdateEventStreamingRequestSinkSinkKafkaParameters();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkKafkaParameters setAcks(UpdateEventStreamingRequestSinkSinkKafkaParametersAcks acks) {
            this.acks = acks;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkKafkaParametersAcks getAcks() {
            return this.acks;
        }

        public UpdateEventStreamingRequestSinkSinkKafkaParameters setInstanceId(UpdateEventStreamingRequestSinkSinkKafkaParametersInstanceId instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkKafkaParametersInstanceId getInstanceId() {
            return this.instanceId;
        }

        public UpdateEventStreamingRequestSinkSinkKafkaParameters setKey(UpdateEventStreamingRequestSinkSinkKafkaParametersKey key) {
            this.key = key;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkKafkaParametersKey getKey() {
            return this.key;
        }

        public UpdateEventStreamingRequestSinkSinkKafkaParameters setTopic(UpdateEventStreamingRequestSinkSinkKafkaParametersTopic topic) {
            this.topic = topic;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkKafkaParametersTopic getTopic() {
            return this.topic;
        }

        public UpdateEventStreamingRequestSinkSinkKafkaParameters setValue(UpdateEventStreamingRequestSinkSinkKafkaParametersValue value) {
            this.value = value;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkKafkaParametersValue getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkMNSParametersBody extends TeaModel {
        /**
         * <p>The method that you want to use to transform events.</p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which you want to transform events.</p>
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

        public static UpdateEventStreamingRequestSinkSinkMNSParametersBody build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkMNSParametersBody self = new UpdateEventStreamingRequestSinkSinkMNSParametersBody();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkMNSParametersBody setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkMNSParametersBody setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkMNSParametersBody setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkMNSParametersIsBase64Encode extends TeaModel {
        /**
         * <p>The method that you want to use to transform events. Default value: CONSTANT.</p>
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
         * <p>Specifies whether to enable Base64 encoding.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkMNSParametersIsBase64Encode build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkMNSParametersIsBase64Encode self = new UpdateEventStreamingRequestSinkSinkMNSParametersIsBase64Encode();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkMNSParametersIsBase64Encode setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkMNSParametersIsBase64Encode setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkMNSParametersIsBase64Encode setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkMNSParametersQueueName extends TeaModel {
        /**
         * <p>The method that you want to use to transform events. Default value: CONSTANT.</p>
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

        public static UpdateEventStreamingRequestSinkSinkMNSParametersQueueName build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkMNSParametersQueueName self = new UpdateEventStreamingRequestSinkSinkMNSParametersQueueName();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkMNSParametersQueueName setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkMNSParametersQueueName setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkMNSParametersQueueName setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkMNSParameters extends TeaModel {
        /**
         * <p>The message content.</p>
         */
        @NameInMap("Body")
        public UpdateEventStreamingRequestSinkSinkMNSParametersBody body;

        /**
         * <p>Specifies whether to enable Base64 encoding.</p>
         */
        @NameInMap("IsBase64Encode")
        public UpdateEventStreamingRequestSinkSinkMNSParametersIsBase64Encode isBase64Encode;

        /**
         * <p>The name of the MNS queue.</p>
         */
        @NameInMap("QueueName")
        public UpdateEventStreamingRequestSinkSinkMNSParametersQueueName queueName;

        public static UpdateEventStreamingRequestSinkSinkMNSParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkMNSParameters self = new UpdateEventStreamingRequestSinkSinkMNSParameters();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkMNSParameters setBody(UpdateEventStreamingRequestSinkSinkMNSParametersBody body) {
            this.body = body;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkMNSParametersBody getBody() {
            return this.body;
        }

        public UpdateEventStreamingRequestSinkSinkMNSParameters setIsBase64Encode(UpdateEventStreamingRequestSinkSinkMNSParametersIsBase64Encode isBase64Encode) {
            this.isBase64Encode = isBase64Encode;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkMNSParametersIsBase64Encode getIsBase64Encode() {
            return this.isBase64Encode;
        }

        public UpdateEventStreamingRequestSinkSinkMNSParameters setQueueName(UpdateEventStreamingRequestSinkSinkMNSParametersQueueName queueName) {
            this.queueName = queueName;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkMNSParametersQueueName getQueueName() {
            return this.queueName;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkPrometheusParametersAuthorizationType extends TeaModel {
        /**
         * <p>The method that you want to use to transform events. Default value: CONSTANT.</p>
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
         * <p>The authentication method.</p>
         * 
         * <strong>example:</strong>
         * <p>BASIC_AUTH</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkPrometheusParametersAuthorizationType build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkPrometheusParametersAuthorizationType self = new UpdateEventStreamingRequestSinkSinkPrometheusParametersAuthorizationType();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkPrometheusParametersAuthorizationType setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkPrometheusParametersAuthorizationType setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkPrometheusParametersAuthorizationType setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkPrometheusParametersData extends TeaModel {
        /**
         * <p>The method that you want to use to transform events. Default value: JSONPATH.</p>
         * 
         * <strong>example:</strong>
         * <p>JSONPATH</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>None.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The metric data.</p>
         * 
         * <strong>example:</strong>
         * <p>$.data</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkPrometheusParametersData build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkPrometheusParametersData self = new UpdateEventStreamingRequestSinkSinkPrometheusParametersData();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkPrometheusParametersData setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkPrometheusParametersData setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkPrometheusParametersData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkPrometheusParametersNetworkType extends TeaModel {
        /**
         * <p>The method that you want to use to transform events. Default value: CONSTANT.</p>
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
         * <p>The network type.</p>
         * 
         * <strong>example:</strong>
         * <p>PrivateNetwork</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkPrometheusParametersNetworkType build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkPrometheusParametersNetworkType self = new UpdateEventStreamingRequestSinkSinkPrometheusParametersNetworkType();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkPrometheusParametersNetworkType setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkPrometheusParametersNetworkType setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkPrometheusParametersNetworkType setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkPrometheusParametersPassword extends TeaModel {
        /**
         * <p>The method that you want to use to transform events. Default value: CONSTANT.</p>
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
         * <p>The password.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkPrometheusParametersPassword build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkPrometheusParametersPassword self = new UpdateEventStreamingRequestSinkSinkPrometheusParametersPassword();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkPrometheusParametersPassword setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkPrometheusParametersPassword setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkPrometheusParametersPassword setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkPrometheusParametersSecurityGroupId extends TeaModel {
        /**
         * <p>The method that you want to use to transform events. Default value: CONSTANT.</p>
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
         * <p>The ID of the security group to which the Managed Service for Prometheus instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-mw43*****</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkPrometheusParametersSecurityGroupId build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkPrometheusParametersSecurityGroupId self = new UpdateEventStreamingRequestSinkSinkPrometheusParametersSecurityGroupId();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkPrometheusParametersSecurityGroupId setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkPrometheusParametersSecurityGroupId setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkPrometheusParametersSecurityGroupId setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkPrometheusParametersURL extends TeaModel {
        /**
         * <p>The method that you want to use to transform events. Default value: CONSTANT.</p>
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
         * <p>The URL for the remote write configuration item of the Managed Service for Prometheus instance.</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkPrometheusParametersURL build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkPrometheusParametersURL self = new UpdateEventStreamingRequestSinkSinkPrometheusParametersURL();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkPrometheusParametersURL setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkPrometheusParametersURL setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkPrometheusParametersURL setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkPrometheusParametersUsername extends TeaModel {
        /**
         * <p>The method that you want to use to transform events. Default value: CONSTANT.</p>
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
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>***admin</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkPrometheusParametersUsername build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkPrometheusParametersUsername self = new UpdateEventStreamingRequestSinkSinkPrometheusParametersUsername();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkPrometheusParametersUsername setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkPrometheusParametersUsername setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkPrometheusParametersUsername setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkPrometheusParametersVSwitchId extends TeaModel {
        /**
         * <p>The method that you want to use to transform events. Default value: CONSTANT.</p>
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
         * <p>The ID of the vSwitch with which the Managed Service for Prometheus instance is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-dwaafds****</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkPrometheusParametersVSwitchId build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkPrometheusParametersVSwitchId self = new UpdateEventStreamingRequestSinkSinkPrometheusParametersVSwitchId();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkPrometheusParametersVSwitchId setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkPrometheusParametersVSwitchId setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkPrometheusParametersVSwitchId setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkPrometheusParametersVpcId extends TeaModel {
        /**
         * <p>The method that you want to use to transform events. Default value: CONSTANT.</p>
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
         * <p>The ID of the VPC to which the Managed Service for Prometheus instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-adw1awdw*****</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkPrometheusParametersVpcId build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkPrometheusParametersVpcId self = new UpdateEventStreamingRequestSinkSinkPrometheusParametersVpcId();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkPrometheusParametersVpcId setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkPrometheusParametersVpcId setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkPrometheusParametersVpcId setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkPrometheusParameters extends TeaModel {
        /**
         * <p>The authentication method.</p>
         */
        @NameInMap("AuthorizationType")
        public UpdateEventStreamingRequestSinkSinkPrometheusParametersAuthorizationType authorizationType;

        /**
         * <p>The metric data.</p>
         */
        @NameInMap("Data")
        public UpdateEventStreamingRequestSinkSinkPrometheusParametersData data;

        /**
         * <p>The network type.</p>
         */
        @NameInMap("NetworkType")
        public UpdateEventStreamingRequestSinkSinkPrometheusParametersNetworkType networkType;

        /**
         * <p>The password.</p>
         */
        @NameInMap("Password")
        public UpdateEventStreamingRequestSinkSinkPrometheusParametersPassword password;

        /**
         * <p>The ID of the security group to which the Managed Service for Prometheus instance belongs.</p>
         */
        @NameInMap("SecurityGroupId")
        public UpdateEventStreamingRequestSinkSinkPrometheusParametersSecurityGroupId securityGroupId;

        /**
         * <p>The URL for the remote write configuration item of the Managed Service for Prometheus instance.</p>
         */
        @NameInMap("URL")
        public UpdateEventStreamingRequestSinkSinkPrometheusParametersURL URL;

        /**
         * <p>The username.</p>
         */
        @NameInMap("Username")
        public UpdateEventStreamingRequestSinkSinkPrometheusParametersUsername username;

        /**
         * <p>The ID of the vSwitch with which the Managed Service for Prometheus instance is associated.</p>
         */
        @NameInMap("VSwitchId")
        public UpdateEventStreamingRequestSinkSinkPrometheusParametersVSwitchId vSwitchId;

        /**
         * <p>The ID of the VPC to which the Managed Service for Prometheus instance belongs.</p>
         */
        @NameInMap("VpcId")
        public UpdateEventStreamingRequestSinkSinkPrometheusParametersVpcId vpcId;

        public static UpdateEventStreamingRequestSinkSinkPrometheusParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkPrometheusParameters self = new UpdateEventStreamingRequestSinkSinkPrometheusParameters();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkPrometheusParameters setAuthorizationType(UpdateEventStreamingRequestSinkSinkPrometheusParametersAuthorizationType authorizationType) {
            this.authorizationType = authorizationType;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkPrometheusParametersAuthorizationType getAuthorizationType() {
            return this.authorizationType;
        }

        public UpdateEventStreamingRequestSinkSinkPrometheusParameters setData(UpdateEventStreamingRequestSinkSinkPrometheusParametersData data) {
            this.data = data;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkPrometheusParametersData getData() {
            return this.data;
        }

        public UpdateEventStreamingRequestSinkSinkPrometheusParameters setNetworkType(UpdateEventStreamingRequestSinkSinkPrometheusParametersNetworkType networkType) {
            this.networkType = networkType;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkPrometheusParametersNetworkType getNetworkType() {
            return this.networkType;
        }

        public UpdateEventStreamingRequestSinkSinkPrometheusParameters setPassword(UpdateEventStreamingRequestSinkSinkPrometheusParametersPassword password) {
            this.password = password;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkPrometheusParametersPassword getPassword() {
            return this.password;
        }

        public UpdateEventStreamingRequestSinkSinkPrometheusParameters setSecurityGroupId(UpdateEventStreamingRequestSinkSinkPrometheusParametersSecurityGroupId securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkPrometheusParametersSecurityGroupId getSecurityGroupId() {
            return this.securityGroupId;
        }

        public UpdateEventStreamingRequestSinkSinkPrometheusParameters setURL(UpdateEventStreamingRequestSinkSinkPrometheusParametersURL URL) {
            this.URL = URL;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkPrometheusParametersURL getURL() {
            return this.URL;
        }

        public UpdateEventStreamingRequestSinkSinkPrometheusParameters setUsername(UpdateEventStreamingRequestSinkSinkPrometheusParametersUsername username) {
            this.username = username;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkPrometheusParametersUsername getUsername() {
            return this.username;
        }

        public UpdateEventStreamingRequestSinkSinkPrometheusParameters setVSwitchId(UpdateEventStreamingRequestSinkSinkPrometheusParametersVSwitchId vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkPrometheusParametersVSwitchId getVSwitchId() {
            return this.vSwitchId;
        }

        public UpdateEventStreamingRequestSinkSinkPrometheusParameters setVpcId(UpdateEventStreamingRequestSinkSinkPrometheusParametersVpcId vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkPrometheusParametersVpcId getVpcId() {
            return this.vpcId;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkRabbitMQParametersBody extends TeaModel {
        /**
         * <p>The method that you want to use to transform events.</p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which you want to transform events.</p>
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

        public static UpdateEventStreamingRequestSinkSinkRabbitMQParametersBody build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkRabbitMQParametersBody self = new UpdateEventStreamingRequestSinkSinkRabbitMQParametersBody();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkRabbitMQParametersBody setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkRabbitMQParametersBody setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkRabbitMQParametersBody setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkRabbitMQParametersExchange extends TeaModel {
        /**
         * <p>The method that you want to use to transform events. Default value: CONSTANT.</p>
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

        public static UpdateEventStreamingRequestSinkSinkRabbitMQParametersExchange build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkRabbitMQParametersExchange self = new UpdateEventStreamingRequestSinkSinkRabbitMQParametersExchange();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkRabbitMQParametersExchange setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkRabbitMQParametersExchange setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkRabbitMQParametersExchange setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkRabbitMQParametersInstanceId extends TeaModel {
        /**
         * <p>The method that you want to use to transform events. Default value: CONSTANT.</p>
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
         * <p>amqp-cn-2r42e73o****</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkRabbitMQParametersInstanceId build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkRabbitMQParametersInstanceId self = new UpdateEventStreamingRequestSinkSinkRabbitMQParametersInstanceId();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkRabbitMQParametersInstanceId setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkRabbitMQParametersInstanceId setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkRabbitMQParametersInstanceId setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkRabbitMQParametersMessageId extends TeaModel {
        /**
         * <p>The method that you want to use to transform events.</p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which you want to transform events.</p>
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

        public static UpdateEventStreamingRequestSinkSinkRabbitMQParametersMessageId build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkRabbitMQParametersMessageId self = new UpdateEventStreamingRequestSinkSinkRabbitMQParametersMessageId();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkRabbitMQParametersMessageId setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkRabbitMQParametersMessageId setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkRabbitMQParametersMessageId setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkRabbitMQParametersProperties extends TeaModel {
        /**
         * <p>The method that you want to use to transform events.</p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which you want to transform events.</p>
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

        public static UpdateEventStreamingRequestSinkSinkRabbitMQParametersProperties build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkRabbitMQParametersProperties self = new UpdateEventStreamingRequestSinkSinkRabbitMQParametersProperties();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkRabbitMQParametersProperties setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkRabbitMQParametersProperties setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkRabbitMQParametersProperties setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkRabbitMQParametersQueueName extends TeaModel {
        /**
         * <p>The method that you want to use to transform events. Default value: CONSTANT.</p>
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

        public static UpdateEventStreamingRequestSinkSinkRabbitMQParametersQueueName build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkRabbitMQParametersQueueName self = new UpdateEventStreamingRequestSinkSinkRabbitMQParametersQueueName();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkRabbitMQParametersQueueName setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkRabbitMQParametersQueueName setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkRabbitMQParametersQueueName setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkRabbitMQParametersRoutingKey extends TeaModel {
        /**
         * <p>The method that you want to use to transform events. Default value: CONSTANT.</p>
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
         * <p>The rule that you want to use to route messages.</p>
         * 
         * <strong>example:</strong>
         * <p>housekeeping</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkRabbitMQParametersRoutingKey build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkRabbitMQParametersRoutingKey self = new UpdateEventStreamingRequestSinkSinkRabbitMQParametersRoutingKey();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkRabbitMQParametersRoutingKey setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkRabbitMQParametersRoutingKey setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkRabbitMQParametersRoutingKey setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkRabbitMQParametersTargetType extends TeaModel {
        /**
         * <p>The method that you want to use to transform events. Default value: CONSTANT.</p>
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
         * <p>The type of the resource to which you want to deliver events. Valid values:</p>
         * <ul>
         * <li>Exchange</li>
         * <li>Queue</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Exchange/Queue</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkRabbitMQParametersTargetType build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkRabbitMQParametersTargetType self = new UpdateEventStreamingRequestSinkSinkRabbitMQParametersTargetType();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkRabbitMQParametersTargetType setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkRabbitMQParametersTargetType setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkRabbitMQParametersTargetType setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkRabbitMQParametersVirtualHostName extends TeaModel {
        /**
         * <p>The method that you want to use to transform events. Default value: CONSTANT.</p>
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

        public static UpdateEventStreamingRequestSinkSinkRabbitMQParametersVirtualHostName build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkRabbitMQParametersVirtualHostName self = new UpdateEventStreamingRequestSinkSinkRabbitMQParametersVirtualHostName();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkRabbitMQParametersVirtualHostName setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkRabbitMQParametersVirtualHostName setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkRabbitMQParametersVirtualHostName setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkRabbitMQParameters extends TeaModel {
        /**
         * <p>The message content.</p>
         */
        @NameInMap("Body")
        public UpdateEventStreamingRequestSinkSinkRabbitMQParametersBody body;

        /**
         * <p>The exchange mode. This parameter is required only if you set TargetType to Exchange.</p>
         */
        @NameInMap("Exchange")
        public UpdateEventStreamingRequestSinkSinkRabbitMQParametersExchange exchange;

        /**
         * <p>The ID of the ApsaraMQ for RabbitMQ instance.</p>
         */
        @NameInMap("InstanceId")
        public UpdateEventStreamingRequestSinkSinkRabbitMQParametersInstanceId instanceId;

        /**
         * <p>The message ID.</p>
         */
        @NameInMap("MessageId")
        public UpdateEventStreamingRequestSinkSinkRabbitMQParametersMessageId messageId;

        /**
         * <p>The attributes that you want to use to filter messages.</p>
         */
        @NameInMap("Properties")
        public UpdateEventStreamingRequestSinkSinkRabbitMQParametersProperties properties;

        /**
         * <p>The queue mode. This parameter is required only if you set TargetType to Queue.</p>
         */
        @NameInMap("QueueName")
        public UpdateEventStreamingRequestSinkSinkRabbitMQParametersQueueName queueName;

        /**
         * <p>The rule that you want to use to route messages. This parameter is required only if you set TargetType to Exchange.</p>
         */
        @NameInMap("RoutingKey")
        public UpdateEventStreamingRequestSinkSinkRabbitMQParametersRoutingKey routingKey;

        /**
         * <p>The type of the resource to which you want to deliver events.</p>
         */
        @NameInMap("TargetType")
        public UpdateEventStreamingRequestSinkSinkRabbitMQParametersTargetType targetType;

        /**
         * <p>The name of the vhost to which the ApsaraMQ for RabbitMQ instance belongs.</p>
         */
        @NameInMap("VirtualHostName")
        public UpdateEventStreamingRequestSinkSinkRabbitMQParametersVirtualHostName virtualHostName;

        public static UpdateEventStreamingRequestSinkSinkRabbitMQParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkRabbitMQParameters self = new UpdateEventStreamingRequestSinkSinkRabbitMQParameters();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkRabbitMQParameters setBody(UpdateEventStreamingRequestSinkSinkRabbitMQParametersBody body) {
            this.body = body;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkRabbitMQParametersBody getBody() {
            return this.body;
        }

        public UpdateEventStreamingRequestSinkSinkRabbitMQParameters setExchange(UpdateEventStreamingRequestSinkSinkRabbitMQParametersExchange exchange) {
            this.exchange = exchange;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkRabbitMQParametersExchange getExchange() {
            return this.exchange;
        }

        public UpdateEventStreamingRequestSinkSinkRabbitMQParameters setInstanceId(UpdateEventStreamingRequestSinkSinkRabbitMQParametersInstanceId instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkRabbitMQParametersInstanceId getInstanceId() {
            return this.instanceId;
        }

        public UpdateEventStreamingRequestSinkSinkRabbitMQParameters setMessageId(UpdateEventStreamingRequestSinkSinkRabbitMQParametersMessageId messageId) {
            this.messageId = messageId;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkRabbitMQParametersMessageId getMessageId() {
            return this.messageId;
        }

        public UpdateEventStreamingRequestSinkSinkRabbitMQParameters setProperties(UpdateEventStreamingRequestSinkSinkRabbitMQParametersProperties properties) {
            this.properties = properties;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkRabbitMQParametersProperties getProperties() {
            return this.properties;
        }

        public UpdateEventStreamingRequestSinkSinkRabbitMQParameters setQueueName(UpdateEventStreamingRequestSinkSinkRabbitMQParametersQueueName queueName) {
            this.queueName = queueName;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkRabbitMQParametersQueueName getQueueName() {
            return this.queueName;
        }

        public UpdateEventStreamingRequestSinkSinkRabbitMQParameters setRoutingKey(UpdateEventStreamingRequestSinkSinkRabbitMQParametersRoutingKey routingKey) {
            this.routingKey = routingKey;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkRabbitMQParametersRoutingKey getRoutingKey() {
            return this.routingKey;
        }

        public UpdateEventStreamingRequestSinkSinkRabbitMQParameters setTargetType(UpdateEventStreamingRequestSinkSinkRabbitMQParametersTargetType targetType) {
            this.targetType = targetType;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkRabbitMQParametersTargetType getTargetType() {
            return this.targetType;
        }

        public UpdateEventStreamingRequestSinkSinkRabbitMQParameters setVirtualHostName(UpdateEventStreamingRequestSinkSinkRabbitMQParametersVirtualHostName virtualHostName) {
            this.virtualHostName = virtualHostName;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkRabbitMQParametersVirtualHostName getVirtualHostName() {
            return this.virtualHostName;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkRocketMQParametersBody extends TeaModel {
        /**
         * <p>The method that you want to use to transform events.</p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which you want to transform events.</p>
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

        public static UpdateEventStreamingRequestSinkSinkRocketMQParametersBody build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkRocketMQParametersBody self = new UpdateEventStreamingRequestSinkSinkRocketMQParametersBody();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParametersBody setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParametersBody setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParametersBody setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkRocketMQParametersInstanceId extends TeaModel {
        /**
         * <p>The method that you want to use to transform events. Default value: CONSTANT.</p>
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

        public static UpdateEventStreamingRequestSinkSinkRocketMQParametersInstanceId build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkRocketMQParametersInstanceId self = new UpdateEventStreamingRequestSinkSinkRocketMQParametersInstanceId();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParametersInstanceId setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParametersInstanceId setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParametersInstanceId setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkRocketMQParametersKeys extends TeaModel {
        /**
         * <p>The method that you want to use to transform events.</p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which you want to transform events.</p>
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

        public static UpdateEventStreamingRequestSinkSinkRocketMQParametersKeys build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkRocketMQParametersKeys self = new UpdateEventStreamingRequestSinkSinkRocketMQParametersKeys();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParametersKeys setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParametersKeys setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParametersKeys setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkRocketMQParametersProperties extends TeaModel {
        /**
         * <p>The method that you want to use to transform events.</p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which you want to transform events.</p>
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

        public static UpdateEventStreamingRequestSinkSinkRocketMQParametersProperties build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkRocketMQParametersProperties self = new UpdateEventStreamingRequestSinkSinkRocketMQParametersProperties();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParametersProperties setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParametersProperties setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParametersProperties setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkRocketMQParametersTags extends TeaModel {
        /**
         * <p>The method that you want to use to transform events.</p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which you want to transform events.</p>
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

        public static UpdateEventStreamingRequestSinkSinkRocketMQParametersTags build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkRocketMQParametersTags self = new UpdateEventStreamingRequestSinkSinkRocketMQParametersTags();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParametersTags setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParametersTags setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParametersTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkRocketMQParametersTopic extends TeaModel {
        /**
         * <p>The method that you want to use to transform events. Default value: CONSTANT.</p>
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
         * <p>Mytopic</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkRocketMQParametersTopic build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkRocketMQParametersTopic self = new UpdateEventStreamingRequestSinkSinkRocketMQParametersTopic();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParametersTopic setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParametersTopic setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParametersTopic setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkRocketMQParameters extends TeaModel {
        /**
         * <p>The message content.</p>
         */
        @NameInMap("Body")
        public UpdateEventStreamingRequestSinkSinkRocketMQParametersBody body;

        /**
         * <p>The ID of the ApsaraMQ for RocketMQ instance.</p>
         */
        @NameInMap("InstanceId")
        public UpdateEventStreamingRequestSinkSinkRocketMQParametersInstanceId instanceId;

        /**
         * <p>The attributes that you want to use to filter messages.</p>
         */
        @NameInMap("Keys")
        public UpdateEventStreamingRequestSinkSinkRocketMQParametersKeys keys;

        /**
         * <p>The attributes that you want to use to filter messages.</p>
         */
        @NameInMap("Properties")
        public UpdateEventStreamingRequestSinkSinkRocketMQParametersProperties properties;

        /**
         * <p>The attributes that you want to use to filter messages.</p>
         */
        @NameInMap("Tags")
        public UpdateEventStreamingRequestSinkSinkRocketMQParametersTags tags;

        /**
         * <p>The topic on the ApsaraMQ for RocketMQ instance.</p>
         */
        @NameInMap("Topic")
        public UpdateEventStreamingRequestSinkSinkRocketMQParametersTopic topic;

        public static UpdateEventStreamingRequestSinkSinkRocketMQParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkRocketMQParameters self = new UpdateEventStreamingRequestSinkSinkRocketMQParameters();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParameters setBody(UpdateEventStreamingRequestSinkSinkRocketMQParametersBody body) {
            this.body = body;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkRocketMQParametersBody getBody() {
            return this.body;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParameters setInstanceId(UpdateEventStreamingRequestSinkSinkRocketMQParametersInstanceId instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkRocketMQParametersInstanceId getInstanceId() {
            return this.instanceId;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParameters setKeys(UpdateEventStreamingRequestSinkSinkRocketMQParametersKeys keys) {
            this.keys = keys;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkRocketMQParametersKeys getKeys() {
            return this.keys;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParameters setProperties(UpdateEventStreamingRequestSinkSinkRocketMQParametersProperties properties) {
            this.properties = properties;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkRocketMQParametersProperties getProperties() {
            return this.properties;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParameters setTags(UpdateEventStreamingRequestSinkSinkRocketMQParametersTags tags) {
            this.tags = tags;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkRocketMQParametersTags getTags() {
            return this.tags;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParameters setTopic(UpdateEventStreamingRequestSinkSinkRocketMQParametersTopic topic) {
            this.topic = topic;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkRocketMQParametersTopic getTopic() {
            return this.topic;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkSLSParametersBody extends TeaModel {
        /**
         * <p>The method that you want to use to transform events.</p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which you want to transform events.</p>
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

        public static UpdateEventStreamingRequestSinkSinkSLSParametersBody build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkSLSParametersBody self = new UpdateEventStreamingRequestSinkSinkSLSParametersBody();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkSLSParametersBody setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkSLSParametersBody setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkSLSParametersBody setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkSLSParametersLogStore extends TeaModel {
        /**
         * <p>The method that you want to use to transform events. Default value: CONSTANT.</p>
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

        public static UpdateEventStreamingRequestSinkSinkSLSParametersLogStore build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkSLSParametersLogStore self = new UpdateEventStreamingRequestSinkSinkSLSParametersLogStore();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkSLSParametersLogStore setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkSLSParametersLogStore setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkSLSParametersLogStore setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkSLSParametersProject extends TeaModel {
        /**
         * <p>The method that you want to use to transform events. Default value: CONSTANT.</p>
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

        public static UpdateEventStreamingRequestSinkSinkSLSParametersProject build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkSLSParametersProject self = new UpdateEventStreamingRequestSinkSinkSLSParametersProject();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkSLSParametersProject setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkSLSParametersProject setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkSLSParametersProject setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkSLSParametersRoleName extends TeaModel {
        /**
         * <p>The method that you want to use to transform events. Default value: CONSTANT.</p>
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
         * <p>The role name. If you want to authorize EventBridge to use this role to read logs in Simple Log Service, you must select Alibaba Cloud Service for Selected Trusted Entity and EventBridge for Select Trusted Service when you create the role in the RAM console.</p>
         * 
         * <strong>example:</strong>
         * <p>testRole</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkSLSParametersRoleName build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkSLSParametersRoleName self = new UpdateEventStreamingRequestSinkSinkSLSParametersRoleName();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkSLSParametersRoleName setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkSLSParametersRoleName setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkSLSParametersRoleName setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkSLSParametersTopic extends TeaModel {
        /**
         * <p>The method that you want to use to transform events. Default value: CONSTANT.</p>
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
         * <p>The topic that you want to use to store logs. This parameter corresponds to the reserved field topic in Simple Log Service.</p>
         * 
         * <strong>example:</strong>
         * <p>testTopic</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkSLSParametersTopic build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkSLSParametersTopic self = new UpdateEventStreamingRequestSinkSinkSLSParametersTopic();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkSLSParametersTopic setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkSLSParametersTopic setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkSLSParametersTopic setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkSLSParameters extends TeaModel {
        /**
         * <p>The message body that is sent to Log Service.</p>
         */
        @NameInMap("Body")
        public UpdateEventStreamingRequestSinkSinkSLSParametersBody body;

        /**
         * <p>The Simple Log Service Logstore.</p>
         */
        @NameInMap("LogStore")
        public UpdateEventStreamingRequestSinkSinkSLSParametersLogStore logStore;

        /**
         * <p>The Simple Log Service project.</p>
         */
        @NameInMap("Project")
        public UpdateEventStreamingRequestSinkSinkSLSParametersProject project;

        /**
         * <p>The role name. If you want to authorize EventBridge to use this role to read logs in Simple Log Service, you must select Alibaba Cloud Service for Selected Trusted Entity and EventBridge for Select Trusted Service when you create the role in the RAM console.</p>
         */
        @NameInMap("RoleName")
        public UpdateEventStreamingRequestSinkSinkSLSParametersRoleName roleName;

        /**
         * <p>The topic that you want to use to store logs. This parameter corresponds to the reserved field topic in Simple Log Service.</p>
         */
        @NameInMap("Topic")
        public UpdateEventStreamingRequestSinkSinkSLSParametersTopic topic;

        public static UpdateEventStreamingRequestSinkSinkSLSParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkSLSParameters self = new UpdateEventStreamingRequestSinkSinkSLSParameters();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkSLSParameters setBody(UpdateEventStreamingRequestSinkSinkSLSParametersBody body) {
            this.body = body;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkSLSParametersBody getBody() {
            return this.body;
        }

        public UpdateEventStreamingRequestSinkSinkSLSParameters setLogStore(UpdateEventStreamingRequestSinkSinkSLSParametersLogStore logStore) {
            this.logStore = logStore;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkSLSParametersLogStore getLogStore() {
            return this.logStore;
        }

        public UpdateEventStreamingRequestSinkSinkSLSParameters setProject(UpdateEventStreamingRequestSinkSinkSLSParametersProject project) {
            this.project = project;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkSLSParametersProject getProject() {
            return this.project;
        }

        public UpdateEventStreamingRequestSinkSinkSLSParameters setRoleName(UpdateEventStreamingRequestSinkSinkSLSParametersRoleName roleName) {
            this.roleName = roleName;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkSLSParametersRoleName getRoleName() {
            return this.roleName;
        }

        public UpdateEventStreamingRequestSinkSinkSLSParameters setTopic(UpdateEventStreamingRequestSinkSinkSLSParametersTopic topic) {
            this.topic = topic;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkSLSParametersTopic getTopic() {
            return this.topic;
        }

    }

    public static class UpdateEventStreamingRequestSink extends TeaModel {
        @NameInMap("SinkCustomizedKafkaConnectorParameters")
        public UpdateEventStreamingRequestSinkSinkCustomizedKafkaConnectorParameters sinkCustomizedKafkaConnectorParameters;

        @NameInMap("SinkCustomizedKafkaParameters")
        public UpdateEventStreamingRequestSinkSinkCustomizedKafkaParameters sinkCustomizedKafkaParameters;

        @NameInMap("SinkDataHubParameters")
        public UpdateEventStreamingRequestSinkSinkDataHubParameters sinkDataHubParameters;

        /**
         * <p>The parameters that are configured if you specify Function Compute as the event target.</p>
         */
        @NameInMap("SinkFcParameters")
        public UpdateEventStreamingRequestSinkSinkFcParameters sinkFcParameters;

        /**
         * <p>The parameters that are configured if you specify CloudFlow as the event target.</p>
         */
        @NameInMap("SinkFnfParameters")
        public UpdateEventStreamingRequestSinkSinkFnfParameters sinkFnfParameters;

        /**
         * <p>The parameters that are configured if you specify ApsaraMQ for Kafka as the event target.</p>
         */
        @NameInMap("SinkKafkaParameters")
        public UpdateEventStreamingRequestSinkSinkKafkaParameters sinkKafkaParameters;

        /**
         * <p>The parameters that are configured if you specify MNS as the event target.</p>
         */
        @NameInMap("SinkMNSParameters")
        public UpdateEventStreamingRequestSinkSinkMNSParameters sinkMNSParameters;

        /**
         * <p>The parameters that are configured if you specify Managed Service for Prometheus as the event target.</p>
         */
        @NameInMap("SinkPrometheusParameters")
        public UpdateEventStreamingRequestSinkSinkPrometheusParameters sinkPrometheusParameters;

        /**
         * <p>The parameters that are configured if you specify ApsaraMQ for RabbitMQ as the event target.</p>
         */
        @NameInMap("SinkRabbitMQParameters")
        public UpdateEventStreamingRequestSinkSinkRabbitMQParameters sinkRabbitMQParameters;

        /**
         * <p>The parameters that are configured if you specify ApsaraMQ for RocketMQ as the event target.</p>
         */
        @NameInMap("SinkRocketMQParameters")
        public UpdateEventStreamingRequestSinkSinkRocketMQParameters sinkRocketMQParameters;

        /**
         * <p>The parameters that are configured if you specify Simple Log Service as the event target.</p>
         */
        @NameInMap("SinkSLSParameters")
        public UpdateEventStreamingRequestSinkSinkSLSParameters sinkSLSParameters;

        public static UpdateEventStreamingRequestSink build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSink self = new UpdateEventStreamingRequestSink();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSink setSinkCustomizedKafkaConnectorParameters(UpdateEventStreamingRequestSinkSinkCustomizedKafkaConnectorParameters sinkCustomizedKafkaConnectorParameters) {
            this.sinkCustomizedKafkaConnectorParameters = sinkCustomizedKafkaConnectorParameters;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkCustomizedKafkaConnectorParameters getSinkCustomizedKafkaConnectorParameters() {
            return this.sinkCustomizedKafkaConnectorParameters;
        }

        public UpdateEventStreamingRequestSink setSinkCustomizedKafkaParameters(UpdateEventStreamingRequestSinkSinkCustomizedKafkaParameters sinkCustomizedKafkaParameters) {
            this.sinkCustomizedKafkaParameters = sinkCustomizedKafkaParameters;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkCustomizedKafkaParameters getSinkCustomizedKafkaParameters() {
            return this.sinkCustomizedKafkaParameters;
        }

        public UpdateEventStreamingRequestSink setSinkDataHubParameters(UpdateEventStreamingRequestSinkSinkDataHubParameters sinkDataHubParameters) {
            this.sinkDataHubParameters = sinkDataHubParameters;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkDataHubParameters getSinkDataHubParameters() {
            return this.sinkDataHubParameters;
        }

        public UpdateEventStreamingRequestSink setSinkFcParameters(UpdateEventStreamingRequestSinkSinkFcParameters sinkFcParameters) {
            this.sinkFcParameters = sinkFcParameters;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkFcParameters getSinkFcParameters() {
            return this.sinkFcParameters;
        }

        public UpdateEventStreamingRequestSink setSinkFnfParameters(UpdateEventStreamingRequestSinkSinkFnfParameters sinkFnfParameters) {
            this.sinkFnfParameters = sinkFnfParameters;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkFnfParameters getSinkFnfParameters() {
            return this.sinkFnfParameters;
        }

        public UpdateEventStreamingRequestSink setSinkKafkaParameters(UpdateEventStreamingRequestSinkSinkKafkaParameters sinkKafkaParameters) {
            this.sinkKafkaParameters = sinkKafkaParameters;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkKafkaParameters getSinkKafkaParameters() {
            return this.sinkKafkaParameters;
        }

        public UpdateEventStreamingRequestSink setSinkMNSParameters(UpdateEventStreamingRequestSinkSinkMNSParameters sinkMNSParameters) {
            this.sinkMNSParameters = sinkMNSParameters;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkMNSParameters getSinkMNSParameters() {
            return this.sinkMNSParameters;
        }

        public UpdateEventStreamingRequestSink setSinkPrometheusParameters(UpdateEventStreamingRequestSinkSinkPrometheusParameters sinkPrometheusParameters) {
            this.sinkPrometheusParameters = sinkPrometheusParameters;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkPrometheusParameters getSinkPrometheusParameters() {
            return this.sinkPrometheusParameters;
        }

        public UpdateEventStreamingRequestSink setSinkRabbitMQParameters(UpdateEventStreamingRequestSinkSinkRabbitMQParameters sinkRabbitMQParameters) {
            this.sinkRabbitMQParameters = sinkRabbitMQParameters;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkRabbitMQParameters getSinkRabbitMQParameters() {
            return this.sinkRabbitMQParameters;
        }

        public UpdateEventStreamingRequestSink setSinkRocketMQParameters(UpdateEventStreamingRequestSinkSinkRocketMQParameters sinkRocketMQParameters) {
            this.sinkRocketMQParameters = sinkRocketMQParameters;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkRocketMQParameters getSinkRocketMQParameters() {
            return this.sinkRocketMQParameters;
        }

        public UpdateEventStreamingRequestSink setSinkSLSParameters(UpdateEventStreamingRequestSinkSinkSLSParameters sinkSLSParameters) {
            this.sinkSLSParameters = sinkSLSParameters;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkSLSParameters getSinkSLSParameters() {
            return this.sinkSLSParameters;
        }

    }

    public static class UpdateEventStreamingRequestSourceSourceApacheKafkaParameters extends TeaModel {
        @NameInMap("Bootstraps")
        public String bootstraps;

        @NameInMap("ConsumerGroup")
        public String consumerGroup;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("OffsetReset")
        public String offsetReset;

        @NameInMap("SaslMechanism")
        public String saslMechanism;

        @NameInMap("SaslPassword")
        public String saslPassword;

        @NameInMap("SaslUser")
        public String saslUser;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("SecurityProtocol")
        public String securityProtocol;

        @NameInMap("Topic")
        public String topic;

        @NameInMap("VSwitchIds")
        public String vSwitchIds;

        @NameInMap("ValueDataType")
        public String valueDataType;

        @NameInMap("VpcId")
        public String vpcId;

        public static UpdateEventStreamingRequestSourceSourceApacheKafkaParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSourceSourceApacheKafkaParameters self = new UpdateEventStreamingRequestSourceSourceApacheKafkaParameters();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSourceSourceApacheKafkaParameters setBootstraps(String bootstraps) {
            this.bootstraps = bootstraps;
            return this;
        }
        public String getBootstraps() {
            return this.bootstraps;
        }

        public UpdateEventStreamingRequestSourceSourceApacheKafkaParameters setConsumerGroup(String consumerGroup) {
            this.consumerGroup = consumerGroup;
            return this;
        }
        public String getConsumerGroup() {
            return this.consumerGroup;
        }

        public UpdateEventStreamingRequestSourceSourceApacheKafkaParameters setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public UpdateEventStreamingRequestSourceSourceApacheKafkaParameters setOffsetReset(String offsetReset) {
            this.offsetReset = offsetReset;
            return this;
        }
        public String getOffsetReset() {
            return this.offsetReset;
        }

        public UpdateEventStreamingRequestSourceSourceApacheKafkaParameters setSaslMechanism(String saslMechanism) {
            this.saslMechanism = saslMechanism;
            return this;
        }
        public String getSaslMechanism() {
            return this.saslMechanism;
        }

        public UpdateEventStreamingRequestSourceSourceApacheKafkaParameters setSaslPassword(String saslPassword) {
            this.saslPassword = saslPassword;
            return this;
        }
        public String getSaslPassword() {
            return this.saslPassword;
        }

        public UpdateEventStreamingRequestSourceSourceApacheKafkaParameters setSaslUser(String saslUser) {
            this.saslUser = saslUser;
            return this;
        }
        public String getSaslUser() {
            return this.saslUser;
        }

        public UpdateEventStreamingRequestSourceSourceApacheKafkaParameters setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public UpdateEventStreamingRequestSourceSourceApacheKafkaParameters setSecurityProtocol(String securityProtocol) {
            this.securityProtocol = securityProtocol;
            return this;
        }
        public String getSecurityProtocol() {
            return this.securityProtocol;
        }

        public UpdateEventStreamingRequestSourceSourceApacheKafkaParameters setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public UpdateEventStreamingRequestSourceSourceApacheKafkaParameters setVSwitchIds(String vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public String getVSwitchIds() {
            return this.vSwitchIds;
        }

        public UpdateEventStreamingRequestSourceSourceApacheKafkaParameters setValueDataType(String valueDataType) {
            this.valueDataType = valueDataType;
            return this;
        }
        public String getValueDataType() {
            return this.valueDataType;
        }

        public UpdateEventStreamingRequestSourceSourceApacheKafkaParameters setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class UpdateEventStreamingRequestSourceSourceCustomizedKafkaConnectorParametersConnectorParameters extends TeaModel {
        @NameInMap("Config")
        public java.util.Map<String, ?> config;

        @NameInMap("Name")
        public String name;

        public static UpdateEventStreamingRequestSourceSourceCustomizedKafkaConnectorParametersConnectorParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSourceSourceCustomizedKafkaConnectorParametersConnectorParameters self = new UpdateEventStreamingRequestSourceSourceCustomizedKafkaConnectorParametersConnectorParameters();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSourceSourceCustomizedKafkaConnectorParametersConnectorParameters setConfig(java.util.Map<String, ?> config) {
            this.config = config;
            return this;
        }
        public java.util.Map<String, ?> getConfig() {
            return this.config;
        }

        public UpdateEventStreamingRequestSourceSourceCustomizedKafkaConnectorParametersConnectorParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateEventStreamingRequestSourceSourceCustomizedKafkaConnectorParameters extends TeaModel {
        @NameInMap("ConnectorPackageUrl")
        public String connectorPackageUrl;

        @NameInMap("ConnectorParameters")
        public UpdateEventStreamingRequestSourceSourceCustomizedKafkaConnectorParametersConnectorParameters connectorParameters;

        @NameInMap("WorkerParameters")
        public java.util.Map<String, ?> workerParameters;

        public static UpdateEventStreamingRequestSourceSourceCustomizedKafkaConnectorParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSourceSourceCustomizedKafkaConnectorParameters self = new UpdateEventStreamingRequestSourceSourceCustomizedKafkaConnectorParameters();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSourceSourceCustomizedKafkaConnectorParameters setConnectorPackageUrl(String connectorPackageUrl) {
            this.connectorPackageUrl = connectorPackageUrl;
            return this;
        }
        public String getConnectorPackageUrl() {
            return this.connectorPackageUrl;
        }

        public UpdateEventStreamingRequestSourceSourceCustomizedKafkaConnectorParameters setConnectorParameters(UpdateEventStreamingRequestSourceSourceCustomizedKafkaConnectorParametersConnectorParameters connectorParameters) {
            this.connectorParameters = connectorParameters;
            return this;
        }
        public UpdateEventStreamingRequestSourceSourceCustomizedKafkaConnectorParametersConnectorParameters getConnectorParameters() {
            return this.connectorParameters;
        }

        public UpdateEventStreamingRequestSourceSourceCustomizedKafkaConnectorParameters setWorkerParameters(java.util.Map<String, ?> workerParameters) {
            this.workerParameters = workerParameters;
            return this;
        }
        public java.util.Map<String, ?> getWorkerParameters() {
            return this.workerParameters;
        }

    }

    public static class UpdateEventStreamingRequestSourceSourceCustomizedKafkaParameters extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        public static UpdateEventStreamingRequestSourceSourceCustomizedKafkaParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSourceSourceCustomizedKafkaParameters self = new UpdateEventStreamingRequestSourceSourceCustomizedKafkaParameters();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSourceSourceCustomizedKafkaParameters setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class UpdateEventStreamingRequestSourceSourceDTSParameters extends TeaModel {
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
        public Long initCheckPoint;

        /**
         * <p>The consumer group password.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The consumer group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>hkprdb</p>
         */
        @NameInMap("Sid")
        public String sid;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>f86e5814-b223-482c-b768-3b873297dade</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The name of the tracked topic of the change tracking instance.</p>
         * 
         * <strong>example:</strong>
         * <p>LTC_CACHE_PRD</p>
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

        public static UpdateEventStreamingRequestSourceSourceDTSParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSourceSourceDTSParameters self = new UpdateEventStreamingRequestSourceSourceDTSParameters();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSourceSourceDTSParameters setBrokerUrl(String brokerUrl) {
            this.brokerUrl = brokerUrl;
            return this;
        }
        public String getBrokerUrl() {
            return this.brokerUrl;
        }

        public UpdateEventStreamingRequestSourceSourceDTSParameters setInitCheckPoint(Long initCheckPoint) {
            this.initCheckPoint = initCheckPoint;
            return this;
        }
        public Long getInitCheckPoint() {
            return this.initCheckPoint;
        }

        public UpdateEventStreamingRequestSourceSourceDTSParameters setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public UpdateEventStreamingRequestSourceSourceDTSParameters setSid(String sid) {
            this.sid = sid;
            return this;
        }
        public String getSid() {
            return this.sid;
        }

        public UpdateEventStreamingRequestSourceSourceDTSParameters setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public UpdateEventStreamingRequestSourceSourceDTSParameters setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public UpdateEventStreamingRequestSourceSourceDTSParameters setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class UpdateEventStreamingRequestSourceSourceKafkaParameters extends TeaModel {
        /**
         * <p>The group ID of the consumer that subscribes to the topic.</p>
         * 
         * <strong>example:</strong>
         * <p>DEFAULT_GROUP</p>
         */
        @NameInMap("ConsumerGroup")
        public String consumerGroup;

        /**
         * <p>The ID of the ApsaraMQ for Kafka instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-8vbh4a5b9yfhgkkzm98f</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The network setting. Default value: Default. The value PublicNetwork specifies a virtual private cloud (VPC).</p>
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
         * <p>cn-zhangjiakou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the security group to which the ApsaraMQ for Kafka instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-uf6jcm3y5hcs7hklytxh</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The name of the topic on the ApsaraMQ for Kafka instance.</p>
         * 
         * <strong>example:</strong>
         * <p>topic_empower_1641539400786</p>
         */
        @NameInMap("Topic")
        public String topic;

        /**
         * <p>The ID of the vSwitch with which the ApsaraMQ for Kafka instance is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-wz9t1l1e8eu2omwjazmtm</p>
         */
        @NameInMap("VSwitchIds")
        public String vSwitchIds;

        /**
         * <p>The encoding or decoding method. Valid values: Json, Text, and Binary. The value Json specifies that binary data is decoded into strings based on UTF-8 encoding and then parsed into the JSON format. The value Text specifies that binary data is decoded into strings based on UTF-8 encoding and then put into the payload. The value Binary specifies that binary data is encoded into strings based on Base64 encoding and then put into the payload.</p>
         * 
         * <strong>example:</strong>
         * <p>Text</p>
         */
        @NameInMap("ValueDataType")
        public String valueDataType;

        /**
         * <p>The ID of the VPC to which the ApsaraMQ for Kafka instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2ze6p0o345nykmekxtuop</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static UpdateEventStreamingRequestSourceSourceKafkaParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSourceSourceKafkaParameters self = new UpdateEventStreamingRequestSourceSourceKafkaParameters();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSourceSourceKafkaParameters setConsumerGroup(String consumerGroup) {
            this.consumerGroup = consumerGroup;
            return this;
        }
        public String getConsumerGroup() {
            return this.consumerGroup;
        }

        public UpdateEventStreamingRequestSourceSourceKafkaParameters setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UpdateEventStreamingRequestSourceSourceKafkaParameters setNetwork(String network) {
            this.network = network;
            return this;
        }
        public String getNetwork() {
            return this.network;
        }

        public UpdateEventStreamingRequestSourceSourceKafkaParameters setOffsetReset(String offsetReset) {
            this.offsetReset = offsetReset;
            return this;
        }
        public String getOffsetReset() {
            return this.offsetReset;
        }

        public UpdateEventStreamingRequestSourceSourceKafkaParameters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public UpdateEventStreamingRequestSourceSourceKafkaParameters setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public UpdateEventStreamingRequestSourceSourceKafkaParameters setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public UpdateEventStreamingRequestSourceSourceKafkaParameters setVSwitchIds(String vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public String getVSwitchIds() {
            return this.vSwitchIds;
        }

        public UpdateEventStreamingRequestSourceSourceKafkaParameters setValueDataType(String valueDataType) {
            this.valueDataType = valueDataType;
            return this;
        }
        public String getValueDataType() {
            return this.valueDataType;
        }

        public UpdateEventStreamingRequestSourceSourceKafkaParameters setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class UpdateEventStreamingRequestSourceSourceMNSParameters extends TeaModel {
        /**
         * <p>Specifies whether to enable Base64 encoding. Default value: true.</p>
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
         * <p>queue_api_1642474203601</p>
         */
        @NameInMap("QueueName")
        public String queueName;

        /**
         * <p>The ID of the region where the MNS queue resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static UpdateEventStreamingRequestSourceSourceMNSParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSourceSourceMNSParameters self = new UpdateEventStreamingRequestSourceSourceMNSParameters();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSourceSourceMNSParameters setIsBase64Decode(Boolean isBase64Decode) {
            this.isBase64Decode = isBase64Decode;
            return this;
        }
        public Boolean getIsBase64Decode() {
            return this.isBase64Decode;
        }

        public UpdateEventStreamingRequestSourceSourceMNSParameters setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public UpdateEventStreamingRequestSourceSourceMNSParameters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class UpdateEventStreamingRequestSourceSourceMQTTParameters extends TeaModel {
        /**
         * <p>The ID of the ApsaraMQ for MQTT instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1dsudbecqwt61jqswt</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The ID of the region where the ApsaraMQ for MQTT instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the topic on the ApsaraMQ for MQTT instance.</p>
         * 
         * <strong>example:</strong>
         * <p>topic_empower_1642400400779</p>
         */
        @NameInMap("Topic")
        public String topic;

        public static UpdateEventStreamingRequestSourceSourceMQTTParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSourceSourceMQTTParameters self = new UpdateEventStreamingRequestSourceSourceMQTTParameters();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSourceSourceMQTTParameters setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UpdateEventStreamingRequestSourceSourceMQTTParameters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public UpdateEventStreamingRequestSourceSourceMQTTParameters setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class UpdateEventStreamingRequestSourceSourcePrometheusParameters extends TeaModel {
        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c83555068b6******ad213f565f209</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The data type.</p>
         * 
         * <strong>example:</strong>
         * <p>json</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>The labels.</p>
         * 
         * <strong>example:</strong>
         * <p><strong>name</strong>=.*</p>
         */
        @NameInMap("Labels")
        public String labels;

        @NameInMap("RegionId")
        public String regionId;

        public static UpdateEventStreamingRequestSourceSourcePrometheusParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSourceSourcePrometheusParameters self = new UpdateEventStreamingRequestSourceSourcePrometheusParameters();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSourceSourcePrometheusParameters setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public UpdateEventStreamingRequestSourceSourcePrometheusParameters setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public UpdateEventStreamingRequestSourceSourcePrometheusParameters setLabels(String labels) {
            this.labels = labels;
            return this;
        }
        public String getLabels() {
            return this.labels;
        }

        public UpdateEventStreamingRequestSourceSourcePrometheusParameters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class UpdateEventStreamingRequestSourceSourceRabbitMQParameters extends TeaModel {
        /**
         * <p>The ID of the ApsaraMQ for RabbitMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-f8z9lqkldlb4oxsxwwub</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the queue on the ApsaraMQ for RabbitMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("QueueName")
        public String queueName;

        /**
         * <p>The ID of the region where the ApsaraMQ for RabbitMQ instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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

        public static UpdateEventStreamingRequestSourceSourceRabbitMQParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSourceSourceRabbitMQParameters self = new UpdateEventStreamingRequestSourceSourceRabbitMQParameters();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSourceSourceRabbitMQParameters setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UpdateEventStreamingRequestSourceSourceRabbitMQParameters setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public UpdateEventStreamingRequestSourceSourceRabbitMQParameters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public UpdateEventStreamingRequestSourceSourceRabbitMQParameters setVirtualHostName(String virtualHostName) {
            this.virtualHostName = virtualHostName;
            return this;
        }
        public String getVirtualHostName() {
            return this.virtualHostName;
        }

    }

    public static class UpdateEventStreamingRequestSourceSourceRocketMQParameters extends TeaModel {
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
         * <p>GID_test</p>
         */
        @NameInMap("GroupID")
        public String groupID;

        /**
         * <p>The endpoint that is used to access the ApsaraMQ for RocketMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>reg****-vpc.cn-zhangjiakou.aliyuncs.com</p>
         */
        @NameInMap("InstanceEndpoint")
        public String instanceEndpoint;

        /**
         * <p>The ID of the ApsaraMQ for RocketMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-f8z9a9mcgwri1c1idd0e</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The network type of the ApsaraMQ for RocketMQ instance. Valid values:</p>
         * <p>PublicNetwork and PrivateNetwork.</p>
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
         * <p>admin</p>
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
         * <p>admin</p>
         */
        @NameInMap("InstanceUsername")
        public String instanceUsername;

        /**
         * <p>The ID of the vSwitch with which the ApsaraMQ for RocketMQ instance is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-m5ev8asdc6h12****</p>
         */
        @NameInMap("InstanceVSwitchIds")
        public String instanceVSwitchIds;

        /**
         * <p>The ID of the VPC to which the ApsaraMQ for RocketMQ instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-m5e3sv4b12345****</p>
         */
        @NameInMap("InstanceVpcId")
        public String instanceVpcId;

        @NameInMap("Network")
        public String network;

        /**
         * <p>The offset from which messages are consumed. Valid values:</p>
         * <ul>
         * <li>CONSUMEFROMLASTOFFSET: Messages are consumed from the latest offset.</li>
         * <li>CONSUMEFROMFIRSTOFFSET: Messages are consumed from the earliest offset.</li>
         * <li>CONSUMEFROMTIMESTAMP: Messages are consumed from the offset at the specified point in time.</li>
         * </ul>
         * <p>Default value: CONSUMEFROMLASTOFFSET.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSUMEFROMLASTOFFSET</p>
         */
        @NameInMap("Offset")
        public String offset;

        /**
         * <p>The ID of the region where the ApsaraMQ for RocketMQ instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The tag that you want to use to filter messages.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The timestamp that specifies the time from which messages are consumed. This parameter is valid only if you set Offset to CONSUMEFROMTIMESTAMP.</p>
         * 
         * <strong>example:</strong>
         * <p>1670656652009</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <p>The name of the topic on the ApsaraMQ for RocketMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>TOPIC-cainiao-pcs-order-process-inBoundConditionCheck</p>
         */
        @NameInMap("Topic")
        public String topic;

        @NameInMap("VSwitchIds")
        public String vSwitchIds;

        @NameInMap("VpcId")
        public String vpcId;

        public static UpdateEventStreamingRequestSourceSourceRocketMQParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSourceSourceRocketMQParameters self = new UpdateEventStreamingRequestSourceSourceRocketMQParameters();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSourceSourceRocketMQParameters setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public UpdateEventStreamingRequestSourceSourceRocketMQParameters setBodyDataType(String bodyDataType) {
            this.bodyDataType = bodyDataType;
            return this;
        }
        public String getBodyDataType() {
            return this.bodyDataType;
        }

        public UpdateEventStreamingRequestSourceSourceRocketMQParameters setFilterSql(String filterSql) {
            this.filterSql = filterSql;
            return this;
        }
        public String getFilterSql() {
            return this.filterSql;
        }

        public UpdateEventStreamingRequestSourceSourceRocketMQParameters setFilterType(String filterType) {
            this.filterType = filterType;
            return this;
        }
        public String getFilterType() {
            return this.filterType;
        }

        public UpdateEventStreamingRequestSourceSourceRocketMQParameters setGroupID(String groupID) {
            this.groupID = groupID;
            return this;
        }
        public String getGroupID() {
            return this.groupID;
        }

        public UpdateEventStreamingRequestSourceSourceRocketMQParameters setInstanceEndpoint(String instanceEndpoint) {
            this.instanceEndpoint = instanceEndpoint;
            return this;
        }
        public String getInstanceEndpoint() {
            return this.instanceEndpoint;
        }

        public UpdateEventStreamingRequestSourceSourceRocketMQParameters setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UpdateEventStreamingRequestSourceSourceRocketMQParameters setInstanceNetwork(String instanceNetwork) {
            this.instanceNetwork = instanceNetwork;
            return this;
        }
        public String getInstanceNetwork() {
            return this.instanceNetwork;
        }

        public UpdateEventStreamingRequestSourceSourceRocketMQParameters setInstancePassword(String instancePassword) {
            this.instancePassword = instancePassword;
            return this;
        }
        public String getInstancePassword() {
            return this.instancePassword;
        }

        public UpdateEventStreamingRequestSourceSourceRocketMQParameters setInstanceSecurityGroupId(String instanceSecurityGroupId) {
            this.instanceSecurityGroupId = instanceSecurityGroupId;
            return this;
        }
        public String getInstanceSecurityGroupId() {
            return this.instanceSecurityGroupId;
        }

        public UpdateEventStreamingRequestSourceSourceRocketMQParameters setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public UpdateEventStreamingRequestSourceSourceRocketMQParameters setInstanceUsername(String instanceUsername) {
            this.instanceUsername = instanceUsername;
            return this;
        }
        public String getInstanceUsername() {
            return this.instanceUsername;
        }

        public UpdateEventStreamingRequestSourceSourceRocketMQParameters setInstanceVSwitchIds(String instanceVSwitchIds) {
            this.instanceVSwitchIds = instanceVSwitchIds;
            return this;
        }
        public String getInstanceVSwitchIds() {
            return this.instanceVSwitchIds;
        }

        public UpdateEventStreamingRequestSourceSourceRocketMQParameters setInstanceVpcId(String instanceVpcId) {
            this.instanceVpcId = instanceVpcId;
            return this;
        }
        public String getInstanceVpcId() {
            return this.instanceVpcId;
        }

        public UpdateEventStreamingRequestSourceSourceRocketMQParameters setNetwork(String network) {
            this.network = network;
            return this;
        }
        public String getNetwork() {
            return this.network;
        }

        public UpdateEventStreamingRequestSourceSourceRocketMQParameters setOffset(String offset) {
            this.offset = offset;
            return this;
        }
        public String getOffset() {
            return this.offset;
        }

        public UpdateEventStreamingRequestSourceSourceRocketMQParameters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public UpdateEventStreamingRequestSourceSourceRocketMQParameters setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public UpdateEventStreamingRequestSourceSourceRocketMQParameters setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public UpdateEventStreamingRequestSourceSourceRocketMQParameters setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public UpdateEventStreamingRequestSourceSourceRocketMQParameters setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public UpdateEventStreamingRequestSourceSourceRocketMQParameters setVSwitchIds(String vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public String getVSwitchIds() {
            return this.vSwitchIds;
        }

        public UpdateEventStreamingRequestSourceSourceRocketMQParameters setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class UpdateEventStreamingRequestSourceSourceSLSParameters extends TeaModel {
        /**
         * <p>The role name. If you want to authorize EventBridge to use this role to read logs in Simple Log Service, you must select Alibaba Cloud Service for Selected Trusted Entity and EventBridge for Select Trusted Service when you create the role in the Resource Access Management (RAM) console.</p>
         * 
         * <strong>example:</strong>
         * <p>testRole</p>
         */
        @NameInMap("RoleName")
        public String roleName;

        public static UpdateEventStreamingRequestSourceSourceSLSParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSourceSourceSLSParameters self = new UpdateEventStreamingRequestSourceSourceSLSParameters();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSourceSourceSLSParameters setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

    }

    public static class UpdateEventStreamingRequestSource extends TeaModel {
        @NameInMap("SourceApacheKafkaParameters")
        public UpdateEventStreamingRequestSourceSourceApacheKafkaParameters sourceApacheKafkaParameters;

        @NameInMap("SourceCustomizedKafkaConnectorParameters")
        public UpdateEventStreamingRequestSourceSourceCustomizedKafkaConnectorParameters sourceCustomizedKafkaConnectorParameters;

        @NameInMap("SourceCustomizedKafkaParameters")
        public UpdateEventStreamingRequestSourceSourceCustomizedKafkaParameters sourceCustomizedKafkaParameters;

        /**
         * <p>The parameters that are configured if you specify Data Transmission Service (DTS) as the event source.</p>
         */
        @NameInMap("SourceDTSParameters")
        public UpdateEventStreamingRequestSourceSourceDTSParameters sourceDTSParameters;

        /**
         * <p>The parameters that are configured if you specify ApsaraMQ for Kafka as the event source.</p>
         */
        @NameInMap("SourceKafkaParameters")
        public UpdateEventStreamingRequestSourceSourceKafkaParameters sourceKafkaParameters;

        /**
         * <p>The parameters that are configured if you specify Message Service (MNS) as the event source.</p>
         */
        @NameInMap("SourceMNSParameters")
        public UpdateEventStreamingRequestSourceSourceMNSParameters sourceMNSParameters;

        /**
         * <p>The parameters that are configured if you specify ApsaraMQ for MQTT as the event source.</p>
         */
        @NameInMap("SourceMQTTParameters")
        public UpdateEventStreamingRequestSourceSourceMQTTParameters sourceMQTTParameters;

        /**
         * <p>The parameters that are configured if you specify Managed Service for Prometheus as the event source.</p>
         */
        @NameInMap("SourcePrometheusParameters")
        public UpdateEventStreamingRequestSourceSourcePrometheusParameters sourcePrometheusParameters;

        /**
         * <p>The parameters that are configured if you specify ApsaraMQ for RabbitMQ as the event source.</p>
         */
        @NameInMap("SourceRabbitMQParameters")
        public UpdateEventStreamingRequestSourceSourceRabbitMQParameters sourceRabbitMQParameters;

        /**
         * <p>The parameters that are configured if you specify ApsaraMQ for RocketMQ as the event source.</p>
         */
        @NameInMap("SourceRocketMQParameters")
        public UpdateEventStreamingRequestSourceSourceRocketMQParameters sourceRocketMQParameters;

        /**
         * <p>The parameters that are configured if you specify Simple Log Service as the event source.</p>
         */
        @NameInMap("SourceSLSParameters")
        public UpdateEventStreamingRequestSourceSourceSLSParameters sourceSLSParameters;

        public static UpdateEventStreamingRequestSource build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSource self = new UpdateEventStreamingRequestSource();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSource setSourceApacheKafkaParameters(UpdateEventStreamingRequestSourceSourceApacheKafkaParameters sourceApacheKafkaParameters) {
            this.sourceApacheKafkaParameters = sourceApacheKafkaParameters;
            return this;
        }
        public UpdateEventStreamingRequestSourceSourceApacheKafkaParameters getSourceApacheKafkaParameters() {
            return this.sourceApacheKafkaParameters;
        }

        public UpdateEventStreamingRequestSource setSourceCustomizedKafkaConnectorParameters(UpdateEventStreamingRequestSourceSourceCustomizedKafkaConnectorParameters sourceCustomizedKafkaConnectorParameters) {
            this.sourceCustomizedKafkaConnectorParameters = sourceCustomizedKafkaConnectorParameters;
            return this;
        }
        public UpdateEventStreamingRequestSourceSourceCustomizedKafkaConnectorParameters getSourceCustomizedKafkaConnectorParameters() {
            return this.sourceCustomizedKafkaConnectorParameters;
        }

        public UpdateEventStreamingRequestSource setSourceCustomizedKafkaParameters(UpdateEventStreamingRequestSourceSourceCustomizedKafkaParameters sourceCustomizedKafkaParameters) {
            this.sourceCustomizedKafkaParameters = sourceCustomizedKafkaParameters;
            return this;
        }
        public UpdateEventStreamingRequestSourceSourceCustomizedKafkaParameters getSourceCustomizedKafkaParameters() {
            return this.sourceCustomizedKafkaParameters;
        }

        public UpdateEventStreamingRequestSource setSourceDTSParameters(UpdateEventStreamingRequestSourceSourceDTSParameters sourceDTSParameters) {
            this.sourceDTSParameters = sourceDTSParameters;
            return this;
        }
        public UpdateEventStreamingRequestSourceSourceDTSParameters getSourceDTSParameters() {
            return this.sourceDTSParameters;
        }

        public UpdateEventStreamingRequestSource setSourceKafkaParameters(UpdateEventStreamingRequestSourceSourceKafkaParameters sourceKafkaParameters) {
            this.sourceKafkaParameters = sourceKafkaParameters;
            return this;
        }
        public UpdateEventStreamingRequestSourceSourceKafkaParameters getSourceKafkaParameters() {
            return this.sourceKafkaParameters;
        }

        public UpdateEventStreamingRequestSource setSourceMNSParameters(UpdateEventStreamingRequestSourceSourceMNSParameters sourceMNSParameters) {
            this.sourceMNSParameters = sourceMNSParameters;
            return this;
        }
        public UpdateEventStreamingRequestSourceSourceMNSParameters getSourceMNSParameters() {
            return this.sourceMNSParameters;
        }

        public UpdateEventStreamingRequestSource setSourceMQTTParameters(UpdateEventStreamingRequestSourceSourceMQTTParameters sourceMQTTParameters) {
            this.sourceMQTTParameters = sourceMQTTParameters;
            return this;
        }
        public UpdateEventStreamingRequestSourceSourceMQTTParameters getSourceMQTTParameters() {
            return this.sourceMQTTParameters;
        }

        public UpdateEventStreamingRequestSource setSourcePrometheusParameters(UpdateEventStreamingRequestSourceSourcePrometheusParameters sourcePrometheusParameters) {
            this.sourcePrometheusParameters = sourcePrometheusParameters;
            return this;
        }
        public UpdateEventStreamingRequestSourceSourcePrometheusParameters getSourcePrometheusParameters() {
            return this.sourcePrometheusParameters;
        }

        public UpdateEventStreamingRequestSource setSourceRabbitMQParameters(UpdateEventStreamingRequestSourceSourceRabbitMQParameters sourceRabbitMQParameters) {
            this.sourceRabbitMQParameters = sourceRabbitMQParameters;
            return this;
        }
        public UpdateEventStreamingRequestSourceSourceRabbitMQParameters getSourceRabbitMQParameters() {
            return this.sourceRabbitMQParameters;
        }

        public UpdateEventStreamingRequestSource setSourceRocketMQParameters(UpdateEventStreamingRequestSourceSourceRocketMQParameters sourceRocketMQParameters) {
            this.sourceRocketMQParameters = sourceRocketMQParameters;
            return this;
        }
        public UpdateEventStreamingRequestSourceSourceRocketMQParameters getSourceRocketMQParameters() {
            return this.sourceRocketMQParameters;
        }

        public UpdateEventStreamingRequestSource setSourceSLSParameters(UpdateEventStreamingRequestSourceSourceSLSParameters sourceSLSParameters) {
            this.sourceSLSParameters = sourceSLSParameters;
            return this;
        }
        public UpdateEventStreamingRequestSourceSourceSLSParameters getSourceSLSParameters() {
            return this.sourceSLSParameters;
        }

    }

    public static class UpdateEventStreamingRequestTransforms extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>acs:fc:cn-hangzhou:*****:services/demo-service.LATEST/functions/demo-func</p>
         */
        @NameInMap("Arn")
        public String arn;

        public static UpdateEventStreamingRequestTransforms build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestTransforms self = new UpdateEventStreamingRequestTransforms();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestTransforms setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

    }

}
