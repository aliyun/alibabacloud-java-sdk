// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateEventStreamingRequest extends TeaModel {
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
    public CreateEventStreamingRequestRunOptions runOptions;

    /**
     * <p>The event target. You must and can specify only one event target.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Sink")
    public CreateEventStreamingRequestSink sink;

    /**
     * <p>The event provider, which is also known as the event source. You must and can specify only one event source.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Source")
    public CreateEventStreamingRequestSource source;

    @NameInMap("Transforms")
    public java.util.List<CreateEventStreamingRequestTransforms> transforms;

    public static CreateEventStreamingRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEventStreamingRequest self = new CreateEventStreamingRequest();
        return TeaModel.build(map, self);
    }

    public CreateEventStreamingRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateEventStreamingRequest setEventStreamingName(String eventStreamingName) {
        this.eventStreamingName = eventStreamingName;
        return this;
    }
    public String getEventStreamingName() {
        return this.eventStreamingName;
    }

    public CreateEventStreamingRequest setFilterPattern(String filterPattern) {
        this.filterPattern = filterPattern;
        return this;
    }
    public String getFilterPattern() {
        return this.filterPattern;
    }

    public CreateEventStreamingRequest setRunOptions(CreateEventStreamingRequestRunOptions runOptions) {
        this.runOptions = runOptions;
        return this;
    }
    public CreateEventStreamingRequestRunOptions getRunOptions() {
        return this.runOptions;
    }

    public CreateEventStreamingRequest setSink(CreateEventStreamingRequestSink sink) {
        this.sink = sink;
        return this;
    }
    public CreateEventStreamingRequestSink getSink() {
        return this.sink;
    }

    public CreateEventStreamingRequest setSource(CreateEventStreamingRequestSource source) {
        this.source = source;
        return this;
    }
    public CreateEventStreamingRequestSource getSource() {
        return this.source;
    }

    public CreateEventStreamingRequest setTransforms(java.util.List<CreateEventStreamingRequestTransforms> transforms) {
        this.transforms = transforms;
        return this;
    }
    public java.util.List<CreateEventStreamingRequestTransforms> getTransforms() {
        return this.transforms;
    }

    public static class CreateEventStreamingRequestRunOptionsBatchWindow extends TeaModel {
        /**
         * <p>The maximum number of events that is allowed in the batch window. When this threshold is reached, data in the window is pushed to the downstream service. If multiple batch windows exist, data is pushed if triggering conditions are met in one of the windows.</p>
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

        public static CreateEventStreamingRequestRunOptionsBatchWindow build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestRunOptionsBatchWindow self = new CreateEventStreamingRequestRunOptionsBatchWindow();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestRunOptionsBatchWindow setCountBasedWindow(Integer countBasedWindow) {
            this.countBasedWindow = countBasedWindow;
            return this;
        }
        public Integer getCountBasedWindow() {
            return this.countBasedWindow;
        }

        public CreateEventStreamingRequestRunOptionsBatchWindow setTimeBasedWindow(Integer timeBasedWindow) {
            this.timeBasedWindow = timeBasedWindow;
            return this;
        }
        public Integer getTimeBasedWindow() {
            return this.timeBasedWindow;
        }

    }

    public static class CreateEventStreamingRequestRunOptionsDeadLetterQueue extends TeaModel {
        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the dead-letter queue.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::1317334647812936:role/rdstoecsassumekms</p>
         */
        @NameInMap("Arn")
        public String arn;

        public static CreateEventStreamingRequestRunOptionsDeadLetterQueue build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestRunOptionsDeadLetterQueue self = new CreateEventStreamingRequestRunOptionsDeadLetterQueue();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestRunOptionsDeadLetterQueue setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

    }

    public static class CreateEventStreamingRequestRunOptionsLogDeliveryKafkaLogParameters extends TeaModel {
        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Topic")
        public String topic;

        public static CreateEventStreamingRequestRunOptionsLogDeliveryKafkaLogParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestRunOptionsLogDeliveryKafkaLogParameters self = new CreateEventStreamingRequestRunOptionsLogDeliveryKafkaLogParameters();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestRunOptionsLogDeliveryKafkaLogParameters setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public CreateEventStreamingRequestRunOptionsLogDeliveryKafkaLogParameters setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateEventStreamingRequestRunOptionsLogDeliveryKafkaLogParameters setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class CreateEventStreamingRequestRunOptionsLogDeliverySLSLogParameters extends TeaModel {
        @NameInMap("LogstoreName")
        public String logstoreName;

        @NameInMap("ProjectName")
        public String projectName;

        public static CreateEventStreamingRequestRunOptionsLogDeliverySLSLogParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestRunOptionsLogDeliverySLSLogParameters self = new CreateEventStreamingRequestRunOptionsLogDeliverySLSLogParameters();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestRunOptionsLogDeliverySLSLogParameters setLogstoreName(String logstoreName) {
            this.logstoreName = logstoreName;
            return this;
        }
        public String getLogstoreName() {
            return this.logstoreName;
        }

        public CreateEventStreamingRequestRunOptionsLogDeliverySLSLogParameters setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

    }

    public static class CreateEventStreamingRequestRunOptionsLogDelivery extends TeaModel {
        @NameInMap("KafkaLogParameters")
        public java.util.List<CreateEventStreamingRequestRunOptionsLogDeliveryKafkaLogParameters> kafkaLogParameters;

        @NameInMap("SLSLogParameters")
        public java.util.List<CreateEventStreamingRequestRunOptionsLogDeliverySLSLogParameters> SLSLogParameters;

        public static CreateEventStreamingRequestRunOptionsLogDelivery build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestRunOptionsLogDelivery self = new CreateEventStreamingRequestRunOptionsLogDelivery();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestRunOptionsLogDelivery setKafkaLogParameters(java.util.List<CreateEventStreamingRequestRunOptionsLogDeliveryKafkaLogParameters> kafkaLogParameters) {
            this.kafkaLogParameters = kafkaLogParameters;
            return this;
        }
        public java.util.List<CreateEventStreamingRequestRunOptionsLogDeliveryKafkaLogParameters> getKafkaLogParameters() {
            return this.kafkaLogParameters;
        }

        public CreateEventStreamingRequestRunOptionsLogDelivery setSLSLogParameters(java.util.List<CreateEventStreamingRequestRunOptionsLogDeliverySLSLogParameters> SLSLogParameters) {
            this.SLSLogParameters = SLSLogParameters;
            return this;
        }
        public java.util.List<CreateEventStreamingRequestRunOptionsLogDeliverySLSLogParameters> getSLSLogParameters() {
            return this.SLSLogParameters;
        }

    }

    public static class CreateEventStreamingRequestRunOptionsNetwork extends TeaModel {
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        @NameInMap("VpcId")
        public String vpcId;

        public static CreateEventStreamingRequestRunOptionsNetwork build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestRunOptionsNetwork self = new CreateEventStreamingRequestRunOptionsNetwork();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestRunOptionsNetwork setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public CreateEventStreamingRequestRunOptionsNetwork setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public CreateEventStreamingRequestRunOptionsNetwork setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class CreateEventStreamingRequestRunOptionsResourceSpecResources extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public Integer value;

        public static CreateEventStreamingRequestRunOptionsResourceSpecResources build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestRunOptionsResourceSpecResources self = new CreateEventStreamingRequestRunOptionsResourceSpecResources();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestRunOptionsResourceSpecResources setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateEventStreamingRequestRunOptionsResourceSpecResources setValue(Integer value) {
            this.value = value;
            return this;
        }
        public Integer getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestRunOptionsResourceSpec extends TeaModel {
        @NameInMap("Resources")
        public java.util.List<CreateEventStreamingRequestRunOptionsResourceSpecResources> resources;

        public static CreateEventStreamingRequestRunOptionsResourceSpec build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestRunOptionsResourceSpec self = new CreateEventStreamingRequestRunOptionsResourceSpec();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestRunOptionsResourceSpec setResources(java.util.List<CreateEventStreamingRequestRunOptionsResourceSpecResources> resources) {
            this.resources = resources;
            return this;
        }
        public java.util.List<CreateEventStreamingRequestRunOptionsResourceSpecResources> getResources() {
            return this.resources;
        }

    }

    public static class CreateEventStreamingRequestRunOptionsRetryStrategy extends TeaModel {
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
         * <p>The retry policy. Valid values:</p>
         * <ul>
         * <li>BACKOFF_RETRY</li>
         * <li>EXPONENTIAL_DECAY_RETRY</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BACKOFFRETRY</p>
         */
        @NameInMap("PushRetryStrategy")
        public String pushRetryStrategy;

        public static CreateEventStreamingRequestRunOptionsRetryStrategy build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestRunOptionsRetryStrategy self = new CreateEventStreamingRequestRunOptionsRetryStrategy();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestRunOptionsRetryStrategy setMaximumEventAgeInSeconds(Long maximumEventAgeInSeconds) {
            this.maximumEventAgeInSeconds = maximumEventAgeInSeconds;
            return this;
        }
        public Long getMaximumEventAgeInSeconds() {
            return this.maximumEventAgeInSeconds;
        }

        public CreateEventStreamingRequestRunOptionsRetryStrategy setMaximumRetryAttempts(Long maximumRetryAttempts) {
            this.maximumRetryAttempts = maximumRetryAttempts;
            return this;
        }
        public Long getMaximumRetryAttempts() {
            return this.maximumRetryAttempts;
        }

        public CreateEventStreamingRequestRunOptionsRetryStrategy setPushRetryStrategy(String pushRetryStrategy) {
            this.pushRetryStrategy = pushRetryStrategy;
            return this;
        }
        public String getPushRetryStrategy() {
            return this.pushRetryStrategy;
        }

    }

    public static class CreateEventStreamingRequestRunOptionsScaledObjectTriggersMetadata extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public Integer value;

        public static CreateEventStreamingRequestRunOptionsScaledObjectTriggersMetadata build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestRunOptionsScaledObjectTriggersMetadata self = new CreateEventStreamingRequestRunOptionsScaledObjectTriggersMetadata();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestRunOptionsScaledObjectTriggersMetadata setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateEventStreamingRequestRunOptionsScaledObjectTriggersMetadata setValue(Integer value) {
            this.value = value;
            return this;
        }
        public Integer getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestRunOptionsScaledObjectTriggers extends TeaModel {
        @NameInMap("Metadata")
        public CreateEventStreamingRequestRunOptionsScaledObjectTriggersMetadata metadata;

        @NameInMap("Type")
        public String type;

        public static CreateEventStreamingRequestRunOptionsScaledObjectTriggers build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestRunOptionsScaledObjectTriggers self = new CreateEventStreamingRequestRunOptionsScaledObjectTriggers();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestRunOptionsScaledObjectTriggers setMetadata(CreateEventStreamingRequestRunOptionsScaledObjectTriggersMetadata metadata) {
            this.metadata = metadata;
            return this;
        }
        public CreateEventStreamingRequestRunOptionsScaledObjectTriggersMetadata getMetadata() {
            return this.metadata;
        }

        public CreateEventStreamingRequestRunOptionsScaledObjectTriggers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateEventStreamingRequestRunOptionsScaledObject extends TeaModel {
        @NameInMap("MaxReplicaCount")
        public Integer maxReplicaCount;

        @NameInMap("MinReplicaCount")
        public Integer minReplicaCount;

        @NameInMap("Triggers")
        public java.util.List<CreateEventStreamingRequestRunOptionsScaledObjectTriggers> triggers;

        public static CreateEventStreamingRequestRunOptionsScaledObject build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestRunOptionsScaledObject self = new CreateEventStreamingRequestRunOptionsScaledObject();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestRunOptionsScaledObject setMaxReplicaCount(Integer maxReplicaCount) {
            this.maxReplicaCount = maxReplicaCount;
            return this;
        }
        public Integer getMaxReplicaCount() {
            return this.maxReplicaCount;
        }

        public CreateEventStreamingRequestRunOptionsScaledObject setMinReplicaCount(Integer minReplicaCount) {
            this.minReplicaCount = minReplicaCount;
            return this;
        }
        public Integer getMinReplicaCount() {
            return this.minReplicaCount;
        }

        public CreateEventStreamingRequestRunOptionsScaledObject setTriggers(java.util.List<CreateEventStreamingRequestRunOptionsScaledObjectTriggers> triggers) {
            this.triggers = triggers;
            return this;
        }
        public java.util.List<CreateEventStreamingRequestRunOptionsScaledObjectTriggers> getTriggers() {
            return this.triggers;
        }

    }

    public static class CreateEventStreamingRequestRunOptions extends TeaModel {
        /**
         * <p>The batch window.</p>
         */
        @NameInMap("BatchWindow")
        public CreateEventStreamingRequestRunOptionsBatchWindow batchWindow;

        /**
         * <p>Specifies whether to enable dead-letter queues. By default, dead-letter queues are disabled. Messages that fail to be pushed are discarded after the maximum number of retries that is specified by the retry policy is reached.</p>
         */
        @NameInMap("DeadLetterQueue")
        public CreateEventStreamingRequestRunOptionsDeadLetterQueue deadLetterQueue;

        /**
         * <p>The exception tolerance policy. Valid values:</p>
         * <ul>
         * <li>NONE: does not tolerate exceptions.</li>
         * <li>ALL: tolerates all exceptions.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("ErrorsTolerance")
        public String errorsTolerance;

        @NameInMap("LogDelivery")
        public CreateEventStreamingRequestRunOptionsLogDelivery logDelivery;

        /**
         * <p>The maximum number of concurrent threads.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MaximumTasks")
        public Long maximumTasks;

        @NameInMap("Network")
        public CreateEventStreamingRequestRunOptionsNetwork network;

        @NameInMap("ResourceSpec")
        public CreateEventStreamingRequestRunOptionsResourceSpec resourceSpec;

        /**
         * <p>The retry policy that you want to use if events fail to be pushed.</p>
         */
        @NameInMap("RetryStrategy")
        public CreateEventStreamingRequestRunOptionsRetryStrategy retryStrategy;

        @NameInMap("RoleName")
        public String roleName;

        @NameInMap("ScaledObject")
        public CreateEventStreamingRequestRunOptionsScaledObject scaledObject;

        public static CreateEventStreamingRequestRunOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestRunOptions self = new CreateEventStreamingRequestRunOptions();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestRunOptions setBatchWindow(CreateEventStreamingRequestRunOptionsBatchWindow batchWindow) {
            this.batchWindow = batchWindow;
            return this;
        }
        public CreateEventStreamingRequestRunOptionsBatchWindow getBatchWindow() {
            return this.batchWindow;
        }

        public CreateEventStreamingRequestRunOptions setDeadLetterQueue(CreateEventStreamingRequestRunOptionsDeadLetterQueue deadLetterQueue) {
            this.deadLetterQueue = deadLetterQueue;
            return this;
        }
        public CreateEventStreamingRequestRunOptionsDeadLetterQueue getDeadLetterQueue() {
            return this.deadLetterQueue;
        }

        public CreateEventStreamingRequestRunOptions setErrorsTolerance(String errorsTolerance) {
            this.errorsTolerance = errorsTolerance;
            return this;
        }
        public String getErrorsTolerance() {
            return this.errorsTolerance;
        }

        public CreateEventStreamingRequestRunOptions setLogDelivery(CreateEventStreamingRequestRunOptionsLogDelivery logDelivery) {
            this.logDelivery = logDelivery;
            return this;
        }
        public CreateEventStreamingRequestRunOptionsLogDelivery getLogDelivery() {
            return this.logDelivery;
        }

        public CreateEventStreamingRequestRunOptions setMaximumTasks(Long maximumTasks) {
            this.maximumTasks = maximumTasks;
            return this;
        }
        public Long getMaximumTasks() {
            return this.maximumTasks;
        }

        public CreateEventStreamingRequestRunOptions setNetwork(CreateEventStreamingRequestRunOptionsNetwork network) {
            this.network = network;
            return this;
        }
        public CreateEventStreamingRequestRunOptionsNetwork getNetwork() {
            return this.network;
        }

        public CreateEventStreamingRequestRunOptions setResourceSpec(CreateEventStreamingRequestRunOptionsResourceSpec resourceSpec) {
            this.resourceSpec = resourceSpec;
            return this;
        }
        public CreateEventStreamingRequestRunOptionsResourceSpec getResourceSpec() {
            return this.resourceSpec;
        }

        public CreateEventStreamingRequestRunOptions setRetryStrategy(CreateEventStreamingRequestRunOptionsRetryStrategy retryStrategy) {
            this.retryStrategy = retryStrategy;
            return this;
        }
        public CreateEventStreamingRequestRunOptionsRetryStrategy getRetryStrategy() {
            return this.retryStrategy;
        }

        public CreateEventStreamingRequestRunOptions setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public CreateEventStreamingRequestRunOptions setScaledObject(CreateEventStreamingRequestRunOptionsScaledObject scaledObject) {
            this.scaledObject = scaledObject;
            return this;
        }
        public CreateEventStreamingRequestRunOptionsScaledObject getScaledObject() {
            return this.scaledObject;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkCustomizedKafkaConnectorParametersConnectorParameters extends TeaModel {
        @NameInMap("Config")
        public java.util.Map<String, ?> config;

        @NameInMap("Name")
        public String name;

        public static CreateEventStreamingRequestSinkSinkCustomizedKafkaConnectorParametersConnectorParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkCustomizedKafkaConnectorParametersConnectorParameters self = new CreateEventStreamingRequestSinkSinkCustomizedKafkaConnectorParametersConnectorParameters();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkCustomizedKafkaConnectorParametersConnectorParameters setConfig(java.util.Map<String, ?> config) {
            this.config = config;
            return this;
        }
        public java.util.Map<String, ?> getConfig() {
            return this.config;
        }

        public CreateEventStreamingRequestSinkSinkCustomizedKafkaConnectorParametersConnectorParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkCustomizedKafkaConnectorParameters extends TeaModel {
        @NameInMap("ConnectorPackageUrl")
        public String connectorPackageUrl;

        @NameInMap("ConnectorParameters")
        public CreateEventStreamingRequestSinkSinkCustomizedKafkaConnectorParametersConnectorParameters connectorParameters;

        @NameInMap("WorkerParameters")
        public java.util.Map<String, ?> workerParameters;

        public static CreateEventStreamingRequestSinkSinkCustomizedKafkaConnectorParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkCustomizedKafkaConnectorParameters self = new CreateEventStreamingRequestSinkSinkCustomizedKafkaConnectorParameters();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkCustomizedKafkaConnectorParameters setConnectorPackageUrl(String connectorPackageUrl) {
            this.connectorPackageUrl = connectorPackageUrl;
            return this;
        }
        public String getConnectorPackageUrl() {
            return this.connectorPackageUrl;
        }

        public CreateEventStreamingRequestSinkSinkCustomizedKafkaConnectorParameters setConnectorParameters(CreateEventStreamingRequestSinkSinkCustomizedKafkaConnectorParametersConnectorParameters connectorParameters) {
            this.connectorParameters = connectorParameters;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkCustomizedKafkaConnectorParametersConnectorParameters getConnectorParameters() {
            return this.connectorParameters;
        }

        public CreateEventStreamingRequestSinkSinkCustomizedKafkaConnectorParameters setWorkerParameters(java.util.Map<String, ?> workerParameters) {
            this.workerParameters = workerParameters;
            return this;
        }
        public java.util.Map<String, ?> getWorkerParameters() {
            return this.workerParameters;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkCustomizedKafkaParameters extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        public static CreateEventStreamingRequestSinkSinkCustomizedKafkaParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkCustomizedKafkaParameters self = new CreateEventStreamingRequestSinkSinkCustomizedKafkaParameters();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkCustomizedKafkaParameters setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkDataHubParametersBody extends TeaModel {
        /**
         * <p>The method that you want to use to transform events.</p>
         * 
         * <strong>example:</strong>
         * <p>ORIGINAL</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>None.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The BLOB topic.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateEventStreamingRequestSinkSinkDataHubParametersBody build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkDataHubParametersBody self = new CreateEventStreamingRequestSinkSinkDataHubParametersBody();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkDataHubParametersBody setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkDataHubParametersBody setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkDataHubParametersBody setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkDataHubParametersProject extends TeaModel {
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
         * <p>The name of the DataHub project.</p>
         * 
         * <strong>example:</strong>
         * <p>demo-project</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateEventStreamingRequestSinkSinkDataHubParametersProject build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkDataHubParametersProject self = new CreateEventStreamingRequestSinkSinkDataHubParametersProject();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkDataHubParametersProject setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkDataHubParametersProject setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkDataHubParametersProject setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkDataHubParametersRoleName extends TeaModel {
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
         * <p>The role name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-role</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateEventStreamingRequestSinkSinkDataHubParametersRoleName build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkDataHubParametersRoleName self = new CreateEventStreamingRequestSinkSinkDataHubParametersRoleName();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkDataHubParametersRoleName setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkDataHubParametersRoleName setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkDataHubParametersRoleName setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkDataHubParametersTopic extends TeaModel {
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
         * <p>The name of the DataHub topic.</p>
         * 
         * <strong>example:</strong>
         * <p>demo-topic</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateEventStreamingRequestSinkSinkDataHubParametersTopic build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkDataHubParametersTopic self = new CreateEventStreamingRequestSinkSinkDataHubParametersTopic();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkDataHubParametersTopic setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkDataHubParametersTopic setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkDataHubParametersTopic setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkDataHubParametersTopicSchema extends TeaModel {
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
         * <p>{&quot;k1&quot;:&quot;${k1}&quot;,&quot;k2&quot;:&quot;${k2}&quot;}</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The TUBLE topic.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;k1&quot;:&quot;value1&quot;,&quot;k2&quot;:&quot;value2&quot;}</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateEventStreamingRequestSinkSinkDataHubParametersTopicSchema build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkDataHubParametersTopicSchema self = new CreateEventStreamingRequestSinkSinkDataHubParametersTopicSchema();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkDataHubParametersTopicSchema setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkDataHubParametersTopicSchema setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkDataHubParametersTopicSchema setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkDataHubParametersTopicType extends TeaModel {
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
         * <p>The topic type. Valid values:</p>
         * <ul>
         * <li>TUPLE</li>
         * <li>BLOB</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TUPLE</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateEventStreamingRequestSinkSinkDataHubParametersTopicType build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkDataHubParametersTopicType self = new CreateEventStreamingRequestSinkSinkDataHubParametersTopicType();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkDataHubParametersTopicType setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkDataHubParametersTopicType setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkDataHubParametersTopicType setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkDataHubParameters extends TeaModel {
        /**
         * <p>The BLOB topic.</p>
         */
        @NameInMap("Body")
        public CreateEventStreamingRequestSinkSinkDataHubParametersBody body;

        /**
         * <p>The name of the DataHub project.</p>
         */
        @NameInMap("Project")
        public CreateEventStreamingRequestSinkSinkDataHubParametersProject project;

        /**
         * <p>The role name.</p>
         */
        @NameInMap("RoleName")
        public CreateEventStreamingRequestSinkSinkDataHubParametersRoleName roleName;

        /**
         * <p>The name of the DataHub topic.</p>
         */
        @NameInMap("Topic")
        public CreateEventStreamingRequestSinkSinkDataHubParametersTopic topic;

        /**
         * <p>The TUBLE topic.</p>
         */
        @NameInMap("TopicSchema")
        public CreateEventStreamingRequestSinkSinkDataHubParametersTopicSchema topicSchema;

        /**
         * <p>The topic type. Valid values:</p>
         * <ul>
         * <li>TUPLE</li>
         * <li>BLOB</li>
         * </ul>
         */
        @NameInMap("TopicType")
        public CreateEventStreamingRequestSinkSinkDataHubParametersTopicType topicType;

        public static CreateEventStreamingRequestSinkSinkDataHubParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkDataHubParameters self = new CreateEventStreamingRequestSinkSinkDataHubParameters();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkDataHubParameters setBody(CreateEventStreamingRequestSinkSinkDataHubParametersBody body) {
            this.body = body;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkDataHubParametersBody getBody() {
            return this.body;
        }

        public CreateEventStreamingRequestSinkSinkDataHubParameters setProject(CreateEventStreamingRequestSinkSinkDataHubParametersProject project) {
            this.project = project;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkDataHubParametersProject getProject() {
            return this.project;
        }

        public CreateEventStreamingRequestSinkSinkDataHubParameters setRoleName(CreateEventStreamingRequestSinkSinkDataHubParametersRoleName roleName) {
            this.roleName = roleName;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkDataHubParametersRoleName getRoleName() {
            return this.roleName;
        }

        public CreateEventStreamingRequestSinkSinkDataHubParameters setTopic(CreateEventStreamingRequestSinkSinkDataHubParametersTopic topic) {
            this.topic = topic;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkDataHubParametersTopic getTopic() {
            return this.topic;
        }

        public CreateEventStreamingRequestSinkSinkDataHubParameters setTopicSchema(CreateEventStreamingRequestSinkSinkDataHubParametersTopicSchema topicSchema) {
            this.topicSchema = topicSchema;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkDataHubParametersTopicSchema getTopicSchema() {
            return this.topicSchema;
        }

        public CreateEventStreamingRequestSinkSinkDataHubParameters setTopicType(CreateEventStreamingRequestSinkSinkDataHubParametersTopicType topicType) {
            this.topicType = topicType;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkDataHubParametersTopicType getTopicType() {
            return this.topicType;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkFcParametersBody extends TeaModel {
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

        public static CreateEventStreamingRequestSinkSinkFcParametersBody build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkFcParametersBody self = new CreateEventStreamingRequestSinkSinkFcParametersBody();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkFcParametersBody setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkFcParametersBody setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkFcParametersBody setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkFcParametersConcurrency extends TeaModel {
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

        public static CreateEventStreamingRequestSinkSinkFcParametersConcurrency build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkFcParametersConcurrency self = new CreateEventStreamingRequestSinkSinkFcParametersConcurrency();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkFcParametersConcurrency setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkFcParametersConcurrency setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkFcParametersConcurrency setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkFcParametersFunctionName extends TeaModel {
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
         * 
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The function name.</p>
         * 
         * <strong>example:</strong>
         * <p>myFunction</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateEventStreamingRequestSinkSinkFcParametersFunctionName build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkFcParametersFunctionName self = new CreateEventStreamingRequestSinkSinkFcParametersFunctionName();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkFcParametersFunctionName setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkFcParametersFunctionName setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkFcParametersFunctionName setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkFcParametersInvocationType extends TeaModel {
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
         * 
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The invocation mode. Valid values: Sync and Async.</p>
         * 
         * <strong>example:</strong>
         * <p>Async</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateEventStreamingRequestSinkSinkFcParametersInvocationType build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkFcParametersInvocationType self = new CreateEventStreamingRequestSinkSinkFcParametersInvocationType();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkFcParametersInvocationType setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkFcParametersInvocationType setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkFcParametersInvocationType setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkFcParametersQualifier extends TeaModel {
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
         * 
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The service version.</p>
         * 
         * <strong>example:</strong>
         * <p>LATEST</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateEventStreamingRequestSinkSinkFcParametersQualifier build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkFcParametersQualifier self = new CreateEventStreamingRequestSinkSinkFcParametersQualifier();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkFcParametersQualifier setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkFcParametersQualifier setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkFcParametersQualifier setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkFcParametersServiceName extends TeaModel {
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
         * 
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
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

        public static CreateEventStreamingRequestSinkSinkFcParametersServiceName build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkFcParametersServiceName self = new CreateEventStreamingRequestSinkSinkFcParametersServiceName();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkFcParametersServiceName setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkFcParametersServiceName setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkFcParametersServiceName setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkFcParameters extends TeaModel {
        /**
         * <p>The message body that you want to deliver to Function Compute.</p>
         */
        @NameInMap("Body")
        public CreateEventStreamingRequestSinkSinkFcParametersBody body;

        /**
         * <p>The delivery concurrency. Minimum value: 1.</p>
         */
        @NameInMap("Concurrency")
        public CreateEventStreamingRequestSinkSinkFcParametersConcurrency concurrency;

        /**
         * <p>The function name.</p>
         */
        @NameInMap("FunctionName")
        public CreateEventStreamingRequestSinkSinkFcParametersFunctionName functionName;

        /**
         * <p>The invocation mode. Valid values: Sync and Async.</p>
         */
        @NameInMap("InvocationType")
        public CreateEventStreamingRequestSinkSinkFcParametersInvocationType invocationType;

        /**
         * <p>The service version.</p>
         */
        @NameInMap("Qualifier")
        public CreateEventStreamingRequestSinkSinkFcParametersQualifier qualifier;

        /**
         * <p>The service name.</p>
         */
        @NameInMap("ServiceName")
        public CreateEventStreamingRequestSinkSinkFcParametersServiceName serviceName;

        public static CreateEventStreamingRequestSinkSinkFcParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkFcParameters self = new CreateEventStreamingRequestSinkSinkFcParameters();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkFcParameters setBody(CreateEventStreamingRequestSinkSinkFcParametersBody body) {
            this.body = body;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkFcParametersBody getBody() {
            return this.body;
        }

        public CreateEventStreamingRequestSinkSinkFcParameters setConcurrency(CreateEventStreamingRequestSinkSinkFcParametersConcurrency concurrency) {
            this.concurrency = concurrency;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkFcParametersConcurrency getConcurrency() {
            return this.concurrency;
        }

        public CreateEventStreamingRequestSinkSinkFcParameters setFunctionName(CreateEventStreamingRequestSinkSinkFcParametersFunctionName functionName) {
            this.functionName = functionName;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkFcParametersFunctionName getFunctionName() {
            return this.functionName;
        }

        public CreateEventStreamingRequestSinkSinkFcParameters setInvocationType(CreateEventStreamingRequestSinkSinkFcParametersInvocationType invocationType) {
            this.invocationType = invocationType;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkFcParametersInvocationType getInvocationType() {
            return this.invocationType;
        }

        public CreateEventStreamingRequestSinkSinkFcParameters setQualifier(CreateEventStreamingRequestSinkSinkFcParametersQualifier qualifier) {
            this.qualifier = qualifier;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkFcParametersQualifier getQualifier() {
            return this.qualifier;
        }

        public CreateEventStreamingRequestSinkSinkFcParameters setServiceName(CreateEventStreamingRequestSinkSinkFcParametersServiceName serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkFcParametersServiceName getServiceName() {
            return this.serviceName;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkFnfParametersExecutionName extends TeaModel {
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

        public static CreateEventStreamingRequestSinkSinkFnfParametersExecutionName build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkFnfParametersExecutionName self = new CreateEventStreamingRequestSinkSinkFnfParametersExecutionName();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkFnfParametersExecutionName setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkFnfParametersExecutionName setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkFnfParametersExecutionName setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkFnfParametersFlowName extends TeaModel {
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

        public static CreateEventStreamingRequestSinkSinkFnfParametersFlowName build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkFnfParametersFlowName self = new CreateEventStreamingRequestSinkSinkFnfParametersFlowName();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkFnfParametersFlowName setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkFnfParametersFlowName setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkFnfParametersFlowName setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkFnfParametersInput extends TeaModel {
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

        public static CreateEventStreamingRequestSinkSinkFnfParametersInput build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkFnfParametersInput self = new CreateEventStreamingRequestSinkSinkFnfParametersInput();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkFnfParametersInput setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkFnfParametersInput setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkFnfParametersInput setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkFnfParametersRoleName extends TeaModel {
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

        public static CreateEventStreamingRequestSinkSinkFnfParametersRoleName build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkFnfParametersRoleName self = new CreateEventStreamingRequestSinkSinkFnfParametersRoleName();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkFnfParametersRoleName setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkFnfParametersRoleName setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkFnfParametersRoleName setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkFnfParameters extends TeaModel {
        /**
         * <p>The execution name.</p>
         */
        @NameInMap("ExecutionName")
        public CreateEventStreamingRequestSinkSinkFnfParametersExecutionName executionName;

        /**
         * <p>The flow name.</p>
         */
        @NameInMap("FlowName")
        public CreateEventStreamingRequestSinkSinkFnfParametersFlowName flowName;

        /**
         * <p>The input information of the execution.</p>
         */
        @NameInMap("Input")
        public CreateEventStreamingRequestSinkSinkFnfParametersInput input;

        /**
         * <p>The role name.</p>
         */
        @NameInMap("RoleName")
        public CreateEventStreamingRequestSinkSinkFnfParametersRoleName roleName;

        public static CreateEventStreamingRequestSinkSinkFnfParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkFnfParameters self = new CreateEventStreamingRequestSinkSinkFnfParameters();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkFnfParameters setExecutionName(CreateEventStreamingRequestSinkSinkFnfParametersExecutionName executionName) {
            this.executionName = executionName;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkFnfParametersExecutionName getExecutionName() {
            return this.executionName;
        }

        public CreateEventStreamingRequestSinkSinkFnfParameters setFlowName(CreateEventStreamingRequestSinkSinkFnfParametersFlowName flowName) {
            this.flowName = flowName;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkFnfParametersFlowName getFlowName() {
            return this.flowName;
        }

        public CreateEventStreamingRequestSinkSinkFnfParameters setInput(CreateEventStreamingRequestSinkSinkFnfParametersInput input) {
            this.input = input;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkFnfParametersInput getInput() {
            return this.input;
        }

        public CreateEventStreamingRequestSinkSinkFnfParameters setRoleName(CreateEventStreamingRequestSinkSinkFnfParametersRoleName roleName) {
            this.roleName = roleName;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkFnfParametersRoleName getRoleName() {
            return this.roleName;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkKafkaParametersAcks extends TeaModel {
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
         * 
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
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

        public static CreateEventStreamingRequestSinkSinkKafkaParametersAcks build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkKafkaParametersAcks self = new CreateEventStreamingRequestSinkSinkKafkaParametersAcks();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkKafkaParametersAcks setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkKafkaParametersAcks setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkKafkaParametersAcks setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkKafkaParametersInstanceId extends TeaModel {
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
         * 
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
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

        public static CreateEventStreamingRequestSinkSinkKafkaParametersInstanceId build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkKafkaParametersInstanceId self = new CreateEventStreamingRequestSinkSinkKafkaParametersInstanceId();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkKafkaParametersInstanceId setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkKafkaParametersInstanceId setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkKafkaParametersInstanceId setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkKafkaParametersKey extends TeaModel {
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
         * 
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
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

        public static CreateEventStreamingRequestSinkSinkKafkaParametersKey build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkKafkaParametersKey self = new CreateEventStreamingRequestSinkSinkKafkaParametersKey();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkKafkaParametersKey setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkKafkaParametersKey setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkKafkaParametersKey setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkKafkaParametersTopic extends TeaModel {
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
         * 
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
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

        public static CreateEventStreamingRequestSinkSinkKafkaParametersTopic build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkKafkaParametersTopic self = new CreateEventStreamingRequestSinkSinkKafkaParametersTopic();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkKafkaParametersTopic setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkKafkaParametersTopic setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkKafkaParametersTopic setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkKafkaParametersValue extends TeaModel {
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

        public static CreateEventStreamingRequestSinkSinkKafkaParametersValue build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkKafkaParametersValue self = new CreateEventStreamingRequestSinkSinkKafkaParametersValue();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkKafkaParametersValue setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkKafkaParametersValue setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkKafkaParametersValue setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkKafkaParameters extends TeaModel {
        /**
         * <p>The acknowledgment (ACK) mode.</p>
         * <ul>
         * <li>If you set this parameter to 0, no response is returned from the broker. In this mode, the performance is high, but the risk of data loss is also high.</li>
         * <li>If you set this parameter to 1, a response is returned when data is written to the leader. In this mode, the performance and the risk of data loss are moderate. Data loss may occur if a failure occurs on the leader.</li>
         * <li>If you set this parameter to all, a response is returned when data is written to the leader and synchronized to the followers. In this mode, the performance is low, but the risk of data loss is also low. Data loss occurs if the leader and the followers fail at the same time.</li>
         * </ul>
         */
        @NameInMap("Acks")
        public CreateEventStreamingRequestSinkSinkKafkaParametersAcks acks;

        /**
         * <p>The ID of the ApsaraMQ for Kafka instance.</p>
         */
        @NameInMap("InstanceId")
        public CreateEventStreamingRequestSinkSinkKafkaParametersInstanceId instanceId;

        /**
         * <p>The message key.</p>
         */
        @NameInMap("Key")
        public CreateEventStreamingRequestSinkSinkKafkaParametersKey key;

        /**
         * <p>The name of the topic on the ApsaraMQ for Kafka instance.</p>
         */
        @NameInMap("Topic")
        public CreateEventStreamingRequestSinkSinkKafkaParametersTopic topic;

        /**
         * <p>The message body.</p>
         */
        @NameInMap("Value")
        public CreateEventStreamingRequestSinkSinkKafkaParametersValue value;

        public static CreateEventStreamingRequestSinkSinkKafkaParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkKafkaParameters self = new CreateEventStreamingRequestSinkSinkKafkaParameters();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkKafkaParameters setAcks(CreateEventStreamingRequestSinkSinkKafkaParametersAcks acks) {
            this.acks = acks;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkKafkaParametersAcks getAcks() {
            return this.acks;
        }

        public CreateEventStreamingRequestSinkSinkKafkaParameters setInstanceId(CreateEventStreamingRequestSinkSinkKafkaParametersInstanceId instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkKafkaParametersInstanceId getInstanceId() {
            return this.instanceId;
        }

        public CreateEventStreamingRequestSinkSinkKafkaParameters setKey(CreateEventStreamingRequestSinkSinkKafkaParametersKey key) {
            this.key = key;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkKafkaParametersKey getKey() {
            return this.key;
        }

        public CreateEventStreamingRequestSinkSinkKafkaParameters setTopic(CreateEventStreamingRequestSinkSinkKafkaParametersTopic topic) {
            this.topic = topic;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkKafkaParametersTopic getTopic() {
            return this.topic;
        }

        public CreateEventStreamingRequestSinkSinkKafkaParameters setValue(CreateEventStreamingRequestSinkSinkKafkaParametersValue value) {
            this.value = value;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkKafkaParametersValue getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkMNSParametersBody extends TeaModel {
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
         *   &quot;key&quot;: &quot;value&quot;
         * }</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateEventStreamingRequestSinkSinkMNSParametersBody build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkMNSParametersBody self = new CreateEventStreamingRequestSinkSinkMNSParametersBody();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkMNSParametersBody setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkMNSParametersBody setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkMNSParametersBody setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkMNSParametersIsBase64Encode extends TeaModel {
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
         * 
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
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

        public static CreateEventStreamingRequestSinkSinkMNSParametersIsBase64Encode build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkMNSParametersIsBase64Encode self = new CreateEventStreamingRequestSinkSinkMNSParametersIsBase64Encode();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkMNSParametersIsBase64Encode setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkMNSParametersIsBase64Encode setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkMNSParametersIsBase64Encode setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkMNSParametersQueueName extends TeaModel {
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
         * 
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
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

        public static CreateEventStreamingRequestSinkSinkMNSParametersQueueName build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkMNSParametersQueueName self = new CreateEventStreamingRequestSinkSinkMNSParametersQueueName();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkMNSParametersQueueName setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkMNSParametersQueueName setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkMNSParametersQueueName setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkMNSParameters extends TeaModel {
        /**
         * <p>The message content.</p>
         */
        @NameInMap("Body")
        public CreateEventStreamingRequestSinkSinkMNSParametersBody body;

        /**
         * <p>Specifies whether to enable Base64 encoding.</p>
         */
        @NameInMap("IsBase64Encode")
        public CreateEventStreamingRequestSinkSinkMNSParametersIsBase64Encode isBase64Encode;

        /**
         * <p>The name of the MNS queue.</p>
         */
        @NameInMap("QueueName")
        public CreateEventStreamingRequestSinkSinkMNSParametersQueueName queueName;

        public static CreateEventStreamingRequestSinkSinkMNSParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkMNSParameters self = new CreateEventStreamingRequestSinkSinkMNSParameters();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkMNSParameters setBody(CreateEventStreamingRequestSinkSinkMNSParametersBody body) {
            this.body = body;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkMNSParametersBody getBody() {
            return this.body;
        }

        public CreateEventStreamingRequestSinkSinkMNSParameters setIsBase64Encode(CreateEventStreamingRequestSinkSinkMNSParametersIsBase64Encode isBase64Encode) {
            this.isBase64Encode = isBase64Encode;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkMNSParametersIsBase64Encode getIsBase64Encode() {
            return this.isBase64Encode;
        }

        public CreateEventStreamingRequestSinkSinkMNSParameters setQueueName(CreateEventStreamingRequestSinkSinkMNSParametersQueueName queueName) {
            this.queueName = queueName;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkMNSParametersQueueName getQueueName() {
            return this.queueName;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkPrometheusParametersAuthorizationType extends TeaModel {
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

        public static CreateEventStreamingRequestSinkSinkPrometheusParametersAuthorizationType build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkPrometheusParametersAuthorizationType self = new CreateEventStreamingRequestSinkSinkPrometheusParametersAuthorizationType();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkPrometheusParametersAuthorizationType setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkPrometheusParametersAuthorizationType setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkPrometheusParametersAuthorizationType setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkPrometheusParametersData extends TeaModel {
        /**
         * <p>The method that you want to use to transform events. Default value: JSAONPATH.</p>
         * 
         * <strong>example:</strong>
         * <p>JSAONPATH</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which you want to transform events.</p>
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

        public static CreateEventStreamingRequestSinkSinkPrometheusParametersData build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkPrometheusParametersData self = new CreateEventStreamingRequestSinkSinkPrometheusParametersData();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkPrometheusParametersData setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkPrometheusParametersData setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkPrometheusParametersData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkPrometheusParametersNetworkType extends TeaModel {
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

        public static CreateEventStreamingRequestSinkSinkPrometheusParametersNetworkType build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkPrometheusParametersNetworkType self = new CreateEventStreamingRequestSinkSinkPrometheusParametersNetworkType();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkPrometheusParametersNetworkType setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkPrometheusParametersNetworkType setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkPrometheusParametersNetworkType setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkPrometheusParametersPassword extends TeaModel {
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
         * <hr>
         */
        @NameInMap("Value")
        public String value;

        public static CreateEventStreamingRequestSinkSinkPrometheusParametersPassword build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkPrometheusParametersPassword self = new CreateEventStreamingRequestSinkSinkPrometheusParametersPassword();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkPrometheusParametersPassword setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkPrometheusParametersPassword setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkPrometheusParametersPassword setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkPrometheusParametersSecurityGroupId extends TeaModel {
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

        public static CreateEventStreamingRequestSinkSinkPrometheusParametersSecurityGroupId build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkPrometheusParametersSecurityGroupId self = new CreateEventStreamingRequestSinkSinkPrometheusParametersSecurityGroupId();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkPrometheusParametersSecurityGroupId setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkPrometheusParametersSecurityGroupId setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkPrometheusParametersSecurityGroupId setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkPrometheusParametersURL extends TeaModel {
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

        public static CreateEventStreamingRequestSinkSinkPrometheusParametersURL build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkPrometheusParametersURL self = new CreateEventStreamingRequestSinkSinkPrometheusParametersURL();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkPrometheusParametersURL setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkPrometheusParametersURL setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkPrometheusParametersURL setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkPrometheusParametersUsername extends TeaModel {
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
         * <p>****admin</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateEventStreamingRequestSinkSinkPrometheusParametersUsername build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkPrometheusParametersUsername self = new CreateEventStreamingRequestSinkSinkPrometheusParametersUsername();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkPrometheusParametersUsername setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkPrometheusParametersUsername setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkPrometheusParametersUsername setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkPrometheusParametersVSwitchId extends TeaModel {
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

        public static CreateEventStreamingRequestSinkSinkPrometheusParametersVSwitchId build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkPrometheusParametersVSwitchId self = new CreateEventStreamingRequestSinkSinkPrometheusParametersVSwitchId();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkPrometheusParametersVSwitchId setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkPrometheusParametersVSwitchId setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkPrometheusParametersVSwitchId setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkPrometheusParametersVpcId extends TeaModel {
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
         * <p>i-2ze7u5i17mbqtx1p****</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateEventStreamingRequestSinkSinkPrometheusParametersVpcId build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkPrometheusParametersVpcId self = new CreateEventStreamingRequestSinkSinkPrometheusParametersVpcId();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkPrometheusParametersVpcId setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkPrometheusParametersVpcId setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkPrometheusParametersVpcId setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkPrometheusParameters extends TeaModel {
        /**
         * <p>The authentication method.</p>
         */
        @NameInMap("AuthorizationType")
        public CreateEventStreamingRequestSinkSinkPrometheusParametersAuthorizationType authorizationType;

        /**
         * <p>The metric data.</p>
         */
        @NameInMap("Data")
        public CreateEventStreamingRequestSinkSinkPrometheusParametersData data;

        /**
         * <p>The network type.</p>
         */
        @NameInMap("NetworkType")
        public CreateEventStreamingRequestSinkSinkPrometheusParametersNetworkType networkType;

        /**
         * <p>The password.</p>
         */
        @NameInMap("Password")
        public CreateEventStreamingRequestSinkSinkPrometheusParametersPassword password;

        /**
         * <p>The ID of the security group to which the Managed Service for Prometheus instance belongs.</p>
         */
        @NameInMap("SecurityGroupId")
        public CreateEventStreamingRequestSinkSinkPrometheusParametersSecurityGroupId securityGroupId;

        /**
         * <p>The URL for the remote write configuration item of the Managed Service for Prometheus instance.</p>
         */
        @NameInMap("URL")
        public CreateEventStreamingRequestSinkSinkPrometheusParametersURL URL;

        /**
         * <p>The username.</p>
         */
        @NameInMap("Username")
        public CreateEventStreamingRequestSinkSinkPrometheusParametersUsername username;

        /**
         * <p>The ID of the vSwitch with which the Managed Service for Prometheus instance is associated.</p>
         */
        @NameInMap("VSwitchId")
        public CreateEventStreamingRequestSinkSinkPrometheusParametersVSwitchId vSwitchId;

        /**
         * <p>The ID of the VPC to which the Managed Service for Prometheus instance belongs.</p>
         */
        @NameInMap("VpcId")
        public CreateEventStreamingRequestSinkSinkPrometheusParametersVpcId vpcId;

        public static CreateEventStreamingRequestSinkSinkPrometheusParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkPrometheusParameters self = new CreateEventStreamingRequestSinkSinkPrometheusParameters();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkPrometheusParameters setAuthorizationType(CreateEventStreamingRequestSinkSinkPrometheusParametersAuthorizationType authorizationType) {
            this.authorizationType = authorizationType;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkPrometheusParametersAuthorizationType getAuthorizationType() {
            return this.authorizationType;
        }

        public CreateEventStreamingRequestSinkSinkPrometheusParameters setData(CreateEventStreamingRequestSinkSinkPrometheusParametersData data) {
            this.data = data;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkPrometheusParametersData getData() {
            return this.data;
        }

        public CreateEventStreamingRequestSinkSinkPrometheusParameters setNetworkType(CreateEventStreamingRequestSinkSinkPrometheusParametersNetworkType networkType) {
            this.networkType = networkType;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkPrometheusParametersNetworkType getNetworkType() {
            return this.networkType;
        }

        public CreateEventStreamingRequestSinkSinkPrometheusParameters setPassword(CreateEventStreamingRequestSinkSinkPrometheusParametersPassword password) {
            this.password = password;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkPrometheusParametersPassword getPassword() {
            return this.password;
        }

        public CreateEventStreamingRequestSinkSinkPrometheusParameters setSecurityGroupId(CreateEventStreamingRequestSinkSinkPrometheusParametersSecurityGroupId securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkPrometheusParametersSecurityGroupId getSecurityGroupId() {
            return this.securityGroupId;
        }

        public CreateEventStreamingRequestSinkSinkPrometheusParameters setURL(CreateEventStreamingRequestSinkSinkPrometheusParametersURL URL) {
            this.URL = URL;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkPrometheusParametersURL getURL() {
            return this.URL;
        }

        public CreateEventStreamingRequestSinkSinkPrometheusParameters setUsername(CreateEventStreamingRequestSinkSinkPrometheusParametersUsername username) {
            this.username = username;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkPrometheusParametersUsername getUsername() {
            return this.username;
        }

        public CreateEventStreamingRequestSinkSinkPrometheusParameters setVSwitchId(CreateEventStreamingRequestSinkSinkPrometheusParametersVSwitchId vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkPrometheusParametersVSwitchId getVSwitchId() {
            return this.vSwitchId;
        }

        public CreateEventStreamingRequestSinkSinkPrometheusParameters setVpcId(CreateEventStreamingRequestSinkSinkPrometheusParametersVpcId vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkPrometheusParametersVpcId getVpcId() {
            return this.vpcId;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkRabbitMQParametersBody extends TeaModel {
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
         *   &quot;key&quot;: &quot;value&quot;
         * }</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateEventStreamingRequestSinkSinkRabbitMQParametersBody build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkRabbitMQParametersBody self = new CreateEventStreamingRequestSinkSinkRabbitMQParametersBody();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkRabbitMQParametersBody setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkRabbitMQParametersBody setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkRabbitMQParametersBody setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkRabbitMQParametersExchange extends TeaModel {
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
         * 
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
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

        public static CreateEventStreamingRequestSinkSinkRabbitMQParametersExchange build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkRabbitMQParametersExchange self = new CreateEventStreamingRequestSinkSinkRabbitMQParametersExchange();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkRabbitMQParametersExchange setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkRabbitMQParametersExchange setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkRabbitMQParametersExchange setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkRabbitMQParametersInstanceId extends TeaModel {
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
         * 
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The ID of the ApsaraMQ for RabbitMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>a5ff91ad4f3f24947887fe184fc20d07</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateEventStreamingRequestSinkSinkRabbitMQParametersInstanceId build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkRabbitMQParametersInstanceId self = new CreateEventStreamingRequestSinkSinkRabbitMQParametersInstanceId();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkRabbitMQParametersInstanceId setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkRabbitMQParametersInstanceId setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkRabbitMQParametersInstanceId setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkRabbitMQParametersMessageId extends TeaModel {
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
         *   &quot;key&quot;: &quot;value&quot;
         * }</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateEventStreamingRequestSinkSinkRabbitMQParametersMessageId build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkRabbitMQParametersMessageId self = new CreateEventStreamingRequestSinkSinkRabbitMQParametersMessageId();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkRabbitMQParametersMessageId setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkRabbitMQParametersMessageId setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkRabbitMQParametersMessageId setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkRabbitMQParametersProperties extends TeaModel {
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
         *   &quot;key&quot;: &quot;value&quot;
         * }</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateEventStreamingRequestSinkSinkRabbitMQParametersProperties build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkRabbitMQParametersProperties self = new CreateEventStreamingRequestSinkSinkRabbitMQParametersProperties();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkRabbitMQParametersProperties setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkRabbitMQParametersProperties setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkRabbitMQParametersProperties setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkRabbitMQParametersQueueName extends TeaModel {
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
         * 
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
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

        public static CreateEventStreamingRequestSinkSinkRabbitMQParametersQueueName build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkRabbitMQParametersQueueName self = new CreateEventStreamingRequestSinkSinkRabbitMQParametersQueueName();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkRabbitMQParametersQueueName setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkRabbitMQParametersQueueName setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkRabbitMQParametersQueueName setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkRabbitMQParametersRoutingKey extends TeaModel {
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
         * 
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
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

        public static CreateEventStreamingRequestSinkSinkRabbitMQParametersRoutingKey build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkRabbitMQParametersRoutingKey self = new CreateEventStreamingRequestSinkSinkRabbitMQParametersRoutingKey();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkRabbitMQParametersRoutingKey setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkRabbitMQParametersRoutingKey setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkRabbitMQParametersRoutingKey setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkRabbitMQParametersTargetType extends TeaModel {
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
         * 
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
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

        public static CreateEventStreamingRequestSinkSinkRabbitMQParametersTargetType build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkRabbitMQParametersTargetType self = new CreateEventStreamingRequestSinkSinkRabbitMQParametersTargetType();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkRabbitMQParametersTargetType setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkRabbitMQParametersTargetType setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkRabbitMQParametersTargetType setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkRabbitMQParametersVirtualHostName extends TeaModel {
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
         * 
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
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

        public static CreateEventStreamingRequestSinkSinkRabbitMQParametersVirtualHostName build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkRabbitMQParametersVirtualHostName self = new CreateEventStreamingRequestSinkSinkRabbitMQParametersVirtualHostName();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkRabbitMQParametersVirtualHostName setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkRabbitMQParametersVirtualHostName setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkRabbitMQParametersVirtualHostName setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkRabbitMQParameters extends TeaModel {
        /**
         * <p>The message content.</p>
         */
        @NameInMap("Body")
        public CreateEventStreamingRequestSinkSinkRabbitMQParametersBody body;

        /**
         * <p>The exchange mode. This parameter is required only if you set TargetType to Exchange.</p>
         */
        @NameInMap("Exchange")
        public CreateEventStreamingRequestSinkSinkRabbitMQParametersExchange exchange;

        /**
         * <p>The ID of the ApsaraMQ for RabbitMQ instance.</p>
         */
        @NameInMap("InstanceId")
        public CreateEventStreamingRequestSinkSinkRabbitMQParametersInstanceId instanceId;

        /**
         * <p>The message ID.</p>
         */
        @NameInMap("MessageId")
        public CreateEventStreamingRequestSinkSinkRabbitMQParametersMessageId messageId;

        /**
         * <p>The properties that you want to use to filter messages.</p>
         */
        @NameInMap("Properties")
        public CreateEventStreamingRequestSinkSinkRabbitMQParametersProperties properties;

        /**
         * <p>The queue mode. This parameter is required only if you set TargetType to Queue.</p>
         */
        @NameInMap("QueueName")
        public CreateEventStreamingRequestSinkSinkRabbitMQParametersQueueName queueName;

        /**
         * <p>The rule that you want to use to route messages. This parameter is required only if you set TargetType to Exchange.</p>
         */
        @NameInMap("RoutingKey")
        public CreateEventStreamingRequestSinkSinkRabbitMQParametersRoutingKey routingKey;

        /**
         * <p>The type of the resource to which you want to deliver events.</p>
         */
        @NameInMap("TargetType")
        public CreateEventStreamingRequestSinkSinkRabbitMQParametersTargetType targetType;

        /**
         * <p>The name of the vhost to which the ApsaraMQ for RabbitMQ instance belongs.</p>
         */
        @NameInMap("VirtualHostName")
        public CreateEventStreamingRequestSinkSinkRabbitMQParametersVirtualHostName virtualHostName;

        public static CreateEventStreamingRequestSinkSinkRabbitMQParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkRabbitMQParameters self = new CreateEventStreamingRequestSinkSinkRabbitMQParameters();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkRabbitMQParameters setBody(CreateEventStreamingRequestSinkSinkRabbitMQParametersBody body) {
            this.body = body;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkRabbitMQParametersBody getBody() {
            return this.body;
        }

        public CreateEventStreamingRequestSinkSinkRabbitMQParameters setExchange(CreateEventStreamingRequestSinkSinkRabbitMQParametersExchange exchange) {
            this.exchange = exchange;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkRabbitMQParametersExchange getExchange() {
            return this.exchange;
        }

        public CreateEventStreamingRequestSinkSinkRabbitMQParameters setInstanceId(CreateEventStreamingRequestSinkSinkRabbitMQParametersInstanceId instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkRabbitMQParametersInstanceId getInstanceId() {
            return this.instanceId;
        }

        public CreateEventStreamingRequestSinkSinkRabbitMQParameters setMessageId(CreateEventStreamingRequestSinkSinkRabbitMQParametersMessageId messageId) {
            this.messageId = messageId;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkRabbitMQParametersMessageId getMessageId() {
            return this.messageId;
        }

        public CreateEventStreamingRequestSinkSinkRabbitMQParameters setProperties(CreateEventStreamingRequestSinkSinkRabbitMQParametersProperties properties) {
            this.properties = properties;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkRabbitMQParametersProperties getProperties() {
            return this.properties;
        }

        public CreateEventStreamingRequestSinkSinkRabbitMQParameters setQueueName(CreateEventStreamingRequestSinkSinkRabbitMQParametersQueueName queueName) {
            this.queueName = queueName;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkRabbitMQParametersQueueName getQueueName() {
            return this.queueName;
        }

        public CreateEventStreamingRequestSinkSinkRabbitMQParameters setRoutingKey(CreateEventStreamingRequestSinkSinkRabbitMQParametersRoutingKey routingKey) {
            this.routingKey = routingKey;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkRabbitMQParametersRoutingKey getRoutingKey() {
            return this.routingKey;
        }

        public CreateEventStreamingRequestSinkSinkRabbitMQParameters setTargetType(CreateEventStreamingRequestSinkSinkRabbitMQParametersTargetType targetType) {
            this.targetType = targetType;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkRabbitMQParametersTargetType getTargetType() {
            return this.targetType;
        }

        public CreateEventStreamingRequestSinkSinkRabbitMQParameters setVirtualHostName(CreateEventStreamingRequestSinkSinkRabbitMQParametersVirtualHostName virtualHostName) {
            this.virtualHostName = virtualHostName;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkRabbitMQParametersVirtualHostName getVirtualHostName() {
            return this.virtualHostName;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkRocketMQParametersBody extends TeaModel {
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
         *   &quot;key&quot;: &quot;value&quot;
         * }</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateEventStreamingRequestSinkSinkRocketMQParametersBody build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkRocketMQParametersBody self = new CreateEventStreamingRequestSinkSinkRocketMQParametersBody();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkRocketMQParametersBody setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkRocketMQParametersBody setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkRocketMQParametersBody setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkRocketMQParametersInstanceEndpoint extends TeaModel {
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
         * <p>The endpoint that is used to access the ApsaraMQ for RocketMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vbr-8vbsvkkbpf3vb0zefs7ex</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateEventStreamingRequestSinkSinkRocketMQParametersInstanceEndpoint build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkRocketMQParametersInstanceEndpoint self = new CreateEventStreamingRequestSinkSinkRocketMQParametersInstanceEndpoint();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkRocketMQParametersInstanceEndpoint setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkRocketMQParametersInstanceEndpoint setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkRocketMQParametersInstanceEndpoint setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkRocketMQParametersInstanceId extends TeaModel {
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
         * 
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
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

        public static CreateEventStreamingRequestSinkSinkRocketMQParametersInstanceId build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkRocketMQParametersInstanceId self = new CreateEventStreamingRequestSinkSinkRocketMQParametersInstanceId();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkRocketMQParametersInstanceId setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkRocketMQParametersInstanceId setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkRocketMQParametersInstanceId setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkRocketMQParametersInstancePassword extends TeaModel {
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
         * <p>The password that is used to access the ApsaraMQ for RocketMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateEventStreamingRequestSinkSinkRocketMQParametersInstancePassword build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkRocketMQParametersInstancePassword self = new CreateEventStreamingRequestSinkSinkRocketMQParametersInstancePassword();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkRocketMQParametersInstancePassword setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkRocketMQParametersInstancePassword setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkRocketMQParametersInstancePassword setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkRocketMQParametersInstanceType extends TeaModel {
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
         * <p>The type of the ApsaraMQ for RocketMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateEventStreamingRequestSinkSinkRocketMQParametersInstanceType build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkRocketMQParametersInstanceType self = new CreateEventStreamingRequestSinkSinkRocketMQParametersInstanceType();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkRocketMQParametersInstanceType setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkRocketMQParametersInstanceType setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkRocketMQParametersInstanceType setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkRocketMQParametersInstanceUsername extends TeaModel {
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
         * <p>The username that is used to access the ApsaraMQ for RocketMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateEventStreamingRequestSinkSinkRocketMQParametersInstanceUsername build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkRocketMQParametersInstanceUsername self = new CreateEventStreamingRequestSinkSinkRocketMQParametersInstanceUsername();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkRocketMQParametersInstanceUsername setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkRocketMQParametersInstanceUsername setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkRocketMQParametersInstanceUsername setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkRocketMQParametersKeys extends TeaModel {
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
         *   &quot;key&quot;: &quot;value&quot;
         * }</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateEventStreamingRequestSinkSinkRocketMQParametersKeys build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkRocketMQParametersKeys self = new CreateEventStreamingRequestSinkSinkRocketMQParametersKeys();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkRocketMQParametersKeys setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkRocketMQParametersKeys setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkRocketMQParametersKeys setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkRocketMQParametersNetwork extends TeaModel {
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
         * <p>The network type. Valid values:</p>
         * <ul>
         * <li>PublicNetwork and</li>
         * <li>PrivateNetwork.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PublicNetwork</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateEventStreamingRequestSinkSinkRocketMQParametersNetwork build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkRocketMQParametersNetwork self = new CreateEventStreamingRequestSinkSinkRocketMQParametersNetwork();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkRocketMQParametersNetwork setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkRocketMQParametersNetwork setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkRocketMQParametersNetwork setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkRocketMQParametersProperties extends TeaModel {
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
         *   &quot;key&quot;: &quot;value&quot;
         * }</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateEventStreamingRequestSinkSinkRocketMQParametersProperties build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkRocketMQParametersProperties self = new CreateEventStreamingRequestSinkSinkRocketMQParametersProperties();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkRocketMQParametersProperties setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkRocketMQParametersProperties setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkRocketMQParametersProperties setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkRocketMQParametersSecurityGroupId extends TeaModel {
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
         * <p>The ID of the security group to which the ApsaraMQ for RocketMQ instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>b4bf375515f6440f942e3a20c33d5b9c</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateEventStreamingRequestSinkSinkRocketMQParametersSecurityGroupId build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkRocketMQParametersSecurityGroupId self = new CreateEventStreamingRequestSinkSinkRocketMQParametersSecurityGroupId();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkRocketMQParametersSecurityGroupId setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkRocketMQParametersSecurityGroupId setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkRocketMQParametersSecurityGroupId setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkRocketMQParametersTags extends TeaModel {
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
         *   &quot;key&quot;: &quot;value&quot;
         * }</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateEventStreamingRequestSinkSinkRocketMQParametersTags build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkRocketMQParametersTags self = new CreateEventStreamingRequestSinkSinkRocketMQParametersTags();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkRocketMQParametersTags setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkRocketMQParametersTags setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkRocketMQParametersTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkRocketMQParametersTopic extends TeaModel {
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
         * 
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The name of the topic on the ApsaraMQ for RocketMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Mytopic</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateEventStreamingRequestSinkSinkRocketMQParametersTopic build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkRocketMQParametersTopic self = new CreateEventStreamingRequestSinkSinkRocketMQParametersTopic();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkRocketMQParametersTopic setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkRocketMQParametersTopic setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkRocketMQParametersTopic setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkRocketMQParametersVSwitchIds extends TeaModel {
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
         * <p>The ID of the vSwitch with which the ApsaraMQ for RocketMQ instance is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>vbr-8vb835n3zf9shwlvbwlmp</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateEventStreamingRequestSinkSinkRocketMQParametersVSwitchIds build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkRocketMQParametersVSwitchIds self = new CreateEventStreamingRequestSinkSinkRocketMQParametersVSwitchIds();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkRocketMQParametersVSwitchIds setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkRocketMQParametersVSwitchIds setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkRocketMQParametersVSwitchIds setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkRocketMQParametersVpcId extends TeaModel {
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
         * <p>The ID of the VPC to which the ApsaraMQ for RocketMQ instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vbr-8vb835n3zf9shwlvbwlmp</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateEventStreamingRequestSinkSinkRocketMQParametersVpcId build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkRocketMQParametersVpcId self = new CreateEventStreamingRequestSinkSinkRocketMQParametersVpcId();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkRocketMQParametersVpcId setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkRocketMQParametersVpcId setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkRocketMQParametersVpcId setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkRocketMQParameters extends TeaModel {
        /**
         * <p>The message content.</p>
         */
        @NameInMap("Body")
        public CreateEventStreamingRequestSinkSinkRocketMQParametersBody body;

        /**
         * <p>The endpoint that is used to access the ApsaraMQ for RocketMQ instance.</p>
         */
        @NameInMap("InstanceEndpoint")
        public CreateEventStreamingRequestSinkSinkRocketMQParametersInstanceEndpoint instanceEndpoint;

        /**
         * <p>The ID of the ApsaraMQ for RocketMQ instance.</p>
         */
        @NameInMap("InstanceId")
        public CreateEventStreamingRequestSinkSinkRocketMQParametersInstanceId instanceId;

        /**
         * <p>The password that is used to access the ApsaraMQ for RocketMQ instance.</p>
         */
        @NameInMap("InstancePassword")
        public CreateEventStreamingRequestSinkSinkRocketMQParametersInstancePassword instancePassword;

        /**
         * <p>The type of the ApsaraMQ for RocketMQ instance.</p>
         */
        @NameInMap("InstanceType")
        public CreateEventStreamingRequestSinkSinkRocketMQParametersInstanceType instanceType;

        /**
         * <p>The username that is used to access the ApsaraMQ for RocketMQ instance.</p>
         */
        @NameInMap("InstanceUsername")
        public CreateEventStreamingRequestSinkSinkRocketMQParametersInstanceUsername instanceUsername;

        /**
         * <p>The keys that you want to use to filter messages.</p>
         */
        @NameInMap("Keys")
        public CreateEventStreamingRequestSinkSinkRocketMQParametersKeys keys;

        /**
         * <p>The network type. Valid values:</p>
         * <ul>
         * <li>PublicNetwork and</li>
         * <li>PrivateNetwork.</li>
         * </ul>
         */
        @NameInMap("Network")
        public CreateEventStreamingRequestSinkSinkRocketMQParametersNetwork network;

        /**
         * <p>The properties that you want to use to filter messages.</p>
         */
        @NameInMap("Properties")
        public CreateEventStreamingRequestSinkSinkRocketMQParametersProperties properties;

        /**
         * <p>The ID of the security group to which the ApsaraMQ for RocketMQ instance belongs.</p>
         */
        @NameInMap("SecurityGroupId")
        public CreateEventStreamingRequestSinkSinkRocketMQParametersSecurityGroupId securityGroupId;

        /**
         * <p>The tags that you want to use to filter messages.</p>
         */
        @NameInMap("Tags")
        public CreateEventStreamingRequestSinkSinkRocketMQParametersTags tags;

        /**
         * <p>The name of the topic on the ApsaraMQ for RocketMQ instance.</p>
         */
        @NameInMap("Topic")
        public CreateEventStreamingRequestSinkSinkRocketMQParametersTopic topic;

        /**
         * <p>The ID of the vSwitch with which the ApsaraMQ for RocketMQ instance is associated.</p>
         */
        @NameInMap("VSwitchIds")
        public CreateEventStreamingRequestSinkSinkRocketMQParametersVSwitchIds vSwitchIds;

        /**
         * <p>The ID of the VPC to which the ApsaraMQ for RocketMQ instance belongs.</p>
         */
        @NameInMap("VpcId")
        public CreateEventStreamingRequestSinkSinkRocketMQParametersVpcId vpcId;

        public static CreateEventStreamingRequestSinkSinkRocketMQParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkRocketMQParameters self = new CreateEventStreamingRequestSinkSinkRocketMQParameters();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkRocketMQParameters setBody(CreateEventStreamingRequestSinkSinkRocketMQParametersBody body) {
            this.body = body;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkRocketMQParametersBody getBody() {
            return this.body;
        }

        public CreateEventStreamingRequestSinkSinkRocketMQParameters setInstanceEndpoint(CreateEventStreamingRequestSinkSinkRocketMQParametersInstanceEndpoint instanceEndpoint) {
            this.instanceEndpoint = instanceEndpoint;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkRocketMQParametersInstanceEndpoint getInstanceEndpoint() {
            return this.instanceEndpoint;
        }

        public CreateEventStreamingRequestSinkSinkRocketMQParameters setInstanceId(CreateEventStreamingRequestSinkSinkRocketMQParametersInstanceId instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkRocketMQParametersInstanceId getInstanceId() {
            return this.instanceId;
        }

        public CreateEventStreamingRequestSinkSinkRocketMQParameters setInstancePassword(CreateEventStreamingRequestSinkSinkRocketMQParametersInstancePassword instancePassword) {
            this.instancePassword = instancePassword;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkRocketMQParametersInstancePassword getInstancePassword() {
            return this.instancePassword;
        }

        public CreateEventStreamingRequestSinkSinkRocketMQParameters setInstanceType(CreateEventStreamingRequestSinkSinkRocketMQParametersInstanceType instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkRocketMQParametersInstanceType getInstanceType() {
            return this.instanceType;
        }

        public CreateEventStreamingRequestSinkSinkRocketMQParameters setInstanceUsername(CreateEventStreamingRequestSinkSinkRocketMQParametersInstanceUsername instanceUsername) {
            this.instanceUsername = instanceUsername;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkRocketMQParametersInstanceUsername getInstanceUsername() {
            return this.instanceUsername;
        }

        public CreateEventStreamingRequestSinkSinkRocketMQParameters setKeys(CreateEventStreamingRequestSinkSinkRocketMQParametersKeys keys) {
            this.keys = keys;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkRocketMQParametersKeys getKeys() {
            return this.keys;
        }

        public CreateEventStreamingRequestSinkSinkRocketMQParameters setNetwork(CreateEventStreamingRequestSinkSinkRocketMQParametersNetwork network) {
            this.network = network;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkRocketMQParametersNetwork getNetwork() {
            return this.network;
        }

        public CreateEventStreamingRequestSinkSinkRocketMQParameters setProperties(CreateEventStreamingRequestSinkSinkRocketMQParametersProperties properties) {
            this.properties = properties;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkRocketMQParametersProperties getProperties() {
            return this.properties;
        }

        public CreateEventStreamingRequestSinkSinkRocketMQParameters setSecurityGroupId(CreateEventStreamingRequestSinkSinkRocketMQParametersSecurityGroupId securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkRocketMQParametersSecurityGroupId getSecurityGroupId() {
            return this.securityGroupId;
        }

        public CreateEventStreamingRequestSinkSinkRocketMQParameters setTags(CreateEventStreamingRequestSinkSinkRocketMQParametersTags tags) {
            this.tags = tags;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkRocketMQParametersTags getTags() {
            return this.tags;
        }

        public CreateEventStreamingRequestSinkSinkRocketMQParameters setTopic(CreateEventStreamingRequestSinkSinkRocketMQParametersTopic topic) {
            this.topic = topic;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkRocketMQParametersTopic getTopic() {
            return this.topic;
        }

        public CreateEventStreamingRequestSinkSinkRocketMQParameters setVSwitchIds(CreateEventStreamingRequestSinkSinkRocketMQParametersVSwitchIds vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkRocketMQParametersVSwitchIds getVSwitchIds() {
            return this.vSwitchIds;
        }

        public CreateEventStreamingRequestSinkSinkRocketMQParameters setVpcId(CreateEventStreamingRequestSinkSinkRocketMQParametersVpcId vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkRocketMQParametersVpcId getVpcId() {
            return this.vpcId;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkSLSParametersBody extends TeaModel {
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

        public static CreateEventStreamingRequestSinkSinkSLSParametersBody build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkSLSParametersBody self = new CreateEventStreamingRequestSinkSinkSLSParametersBody();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkSLSParametersBody setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkSLSParametersBody setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkSLSParametersBody setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkSLSParametersContentSchema extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static CreateEventStreamingRequestSinkSinkSLSParametersContentSchema build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkSLSParametersContentSchema self = new CreateEventStreamingRequestSinkSinkSLSParametersContentSchema();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkSLSParametersContentSchema setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkSLSParametersContentSchema setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkSLSParametersContentSchema setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkSLSParametersContentType extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static CreateEventStreamingRequestSinkSinkSLSParametersContentType build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkSLSParametersContentType self = new CreateEventStreamingRequestSinkSinkSLSParametersContentType();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkSLSParametersContentType setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkSLSParametersContentType setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkSLSParametersContentType setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkSLSParametersLogStore extends TeaModel {
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

        public static CreateEventStreamingRequestSinkSinkSLSParametersLogStore build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkSLSParametersLogStore self = new CreateEventStreamingRequestSinkSinkSLSParametersLogStore();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkSLSParametersLogStore setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkSLSParametersLogStore setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkSLSParametersLogStore setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkSLSParametersProject extends TeaModel {
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

        public static CreateEventStreamingRequestSinkSinkSLSParametersProject build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkSLSParametersProject self = new CreateEventStreamingRequestSinkSinkSLSParametersProject();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkSLSParametersProject setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkSLSParametersProject setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkSLSParametersProject setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkSLSParametersRoleName extends TeaModel {
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

        public static CreateEventStreamingRequestSinkSinkSLSParametersRoleName build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkSLSParametersRoleName self = new CreateEventStreamingRequestSinkSinkSLSParametersRoleName();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkSLSParametersRoleName setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkSLSParametersRoleName setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkSLSParametersRoleName setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkSLSParametersTopic extends TeaModel {
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
         * <p>The topic that you want to use to store logs. This parameter corresponds to the reserved field <strong>topic</strong> in Simple Log Service.</p>
         * 
         * <strong>example:</strong>
         * <p>testTopic</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateEventStreamingRequestSinkSinkSLSParametersTopic build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkSLSParametersTopic self = new CreateEventStreamingRequestSinkSinkSLSParametersTopic();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkSLSParametersTopic setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateEventStreamingRequestSinkSinkSLSParametersTopic setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateEventStreamingRequestSinkSinkSLSParametersTopic setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkSLSParameters extends TeaModel {
        /**
         * <p>The message body that you want to deliver to Simple Log Service.</p>
         */
        @NameInMap("Body")
        public CreateEventStreamingRequestSinkSinkSLSParametersBody body;

        @NameInMap("ContentSchema")
        public CreateEventStreamingRequestSinkSinkSLSParametersContentSchema contentSchema;

        @NameInMap("ContentType")
        public CreateEventStreamingRequestSinkSinkSLSParametersContentType contentType;

        /**
         * <p>The Simple Log Service Logstore.</p>
         */
        @NameInMap("LogStore")
        public CreateEventStreamingRequestSinkSinkSLSParametersLogStore logStore;

        /**
         * <p>The Simple Log Service project.</p>
         */
        @NameInMap("Project")
        public CreateEventStreamingRequestSinkSinkSLSParametersProject project;

        /**
         * <p>The role name. If you want to authorize EventBridge to use this role to read logs in Simple Log Service, you must select Alibaba Cloud Service for Selected Trusted Entity and EventBridge for Select Trusted Service when you create the role in the RAM console.</p>
         */
        @NameInMap("RoleName")
        public CreateEventStreamingRequestSinkSinkSLSParametersRoleName roleName;

        /**
         * <p>The topic that you want to use to store logs. This parameter corresponds to the reserved field <strong>topic</strong> in Simple Log Service.</p>
         */
        @NameInMap("Topic")
        public CreateEventStreamingRequestSinkSinkSLSParametersTopic topic;

        public static CreateEventStreamingRequestSinkSinkSLSParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSinkSinkSLSParameters self = new CreateEventStreamingRequestSinkSinkSLSParameters();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSinkSinkSLSParameters setBody(CreateEventStreamingRequestSinkSinkSLSParametersBody body) {
            this.body = body;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkSLSParametersBody getBody() {
            return this.body;
        }

        public CreateEventStreamingRequestSinkSinkSLSParameters setContentSchema(CreateEventStreamingRequestSinkSinkSLSParametersContentSchema contentSchema) {
            this.contentSchema = contentSchema;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkSLSParametersContentSchema getContentSchema() {
            return this.contentSchema;
        }

        public CreateEventStreamingRequestSinkSinkSLSParameters setContentType(CreateEventStreamingRequestSinkSinkSLSParametersContentType contentType) {
            this.contentType = contentType;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkSLSParametersContentType getContentType() {
            return this.contentType;
        }

        public CreateEventStreamingRequestSinkSinkSLSParameters setLogStore(CreateEventStreamingRequestSinkSinkSLSParametersLogStore logStore) {
            this.logStore = logStore;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkSLSParametersLogStore getLogStore() {
            return this.logStore;
        }

        public CreateEventStreamingRequestSinkSinkSLSParameters setProject(CreateEventStreamingRequestSinkSinkSLSParametersProject project) {
            this.project = project;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkSLSParametersProject getProject() {
            return this.project;
        }

        public CreateEventStreamingRequestSinkSinkSLSParameters setRoleName(CreateEventStreamingRequestSinkSinkSLSParametersRoleName roleName) {
            this.roleName = roleName;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkSLSParametersRoleName getRoleName() {
            return this.roleName;
        }

        public CreateEventStreamingRequestSinkSinkSLSParameters setTopic(CreateEventStreamingRequestSinkSinkSLSParametersTopic topic) {
            this.topic = topic;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkSLSParametersTopic getTopic() {
            return this.topic;
        }

    }

    public static class CreateEventStreamingRequestSink extends TeaModel {
        @NameInMap("SinkCustomizedKafkaConnectorParameters")
        public CreateEventStreamingRequestSinkSinkCustomizedKafkaConnectorParameters sinkCustomizedKafkaConnectorParameters;

        @NameInMap("SinkCustomizedKafkaParameters")
        public CreateEventStreamingRequestSinkSinkCustomizedKafkaParameters sinkCustomizedKafkaParameters;

        /**
         * <p>The parameters that are configured if you specify DataHub as the event target.</p>
         */
        @NameInMap("SinkDataHubParameters")
        public CreateEventStreamingRequestSinkSinkDataHubParameters sinkDataHubParameters;

        /**
         * <p>The parameters that are configured if you specify Function Compute as the event target.</p>
         */
        @NameInMap("SinkFcParameters")
        public CreateEventStreamingRequestSinkSinkFcParameters sinkFcParameters;

        /**
         * <p>The parameters that are configured if you specify CloudFlow as the event target.</p>
         */
        @NameInMap("SinkFnfParameters")
        public CreateEventStreamingRequestSinkSinkFnfParameters sinkFnfParameters;

        /**
         * <p>The parameters that are configured if you specify ApsaraMQ for Kafka as the event target.</p>
         */
        @NameInMap("SinkKafkaParameters")
        public CreateEventStreamingRequestSinkSinkKafkaParameters sinkKafkaParameters;

        /**
         * <p>The parameters that are configured if you specify MNS as the event target.</p>
         */
        @NameInMap("SinkMNSParameters")
        public CreateEventStreamingRequestSinkSinkMNSParameters sinkMNSParameters;

        /**
         * <p>The parameters that are configured if you specify Managed Service for Prometheus as the event target.</p>
         */
        @NameInMap("SinkPrometheusParameters")
        public CreateEventStreamingRequestSinkSinkPrometheusParameters sinkPrometheusParameters;

        /**
         * <p>The parameters that are configured if you specify ApsaraMQ for RabbitMQ as the event target.</p>
         */
        @NameInMap("SinkRabbitMQParameters")
        public CreateEventStreamingRequestSinkSinkRabbitMQParameters sinkRabbitMQParameters;

        /**
         * <p>The parameters that are configured if you specify ApsaraMQ for RocketMQ as the event target.</p>
         */
        @NameInMap("SinkRocketMQParameters")
        public CreateEventStreamingRequestSinkSinkRocketMQParameters sinkRocketMQParameters;

        /**
         * <p>The parameters that are configured if you specify Simple Log Service as the event target.</p>
         */
        @NameInMap("SinkSLSParameters")
        public CreateEventStreamingRequestSinkSinkSLSParameters sinkSLSParameters;

        public static CreateEventStreamingRequestSink build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSink self = new CreateEventStreamingRequestSink();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSink setSinkCustomizedKafkaConnectorParameters(CreateEventStreamingRequestSinkSinkCustomizedKafkaConnectorParameters sinkCustomizedKafkaConnectorParameters) {
            this.sinkCustomizedKafkaConnectorParameters = sinkCustomizedKafkaConnectorParameters;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkCustomizedKafkaConnectorParameters getSinkCustomizedKafkaConnectorParameters() {
            return this.sinkCustomizedKafkaConnectorParameters;
        }

        public CreateEventStreamingRequestSink setSinkCustomizedKafkaParameters(CreateEventStreamingRequestSinkSinkCustomizedKafkaParameters sinkCustomizedKafkaParameters) {
            this.sinkCustomizedKafkaParameters = sinkCustomizedKafkaParameters;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkCustomizedKafkaParameters getSinkCustomizedKafkaParameters() {
            return this.sinkCustomizedKafkaParameters;
        }

        public CreateEventStreamingRequestSink setSinkDataHubParameters(CreateEventStreamingRequestSinkSinkDataHubParameters sinkDataHubParameters) {
            this.sinkDataHubParameters = sinkDataHubParameters;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkDataHubParameters getSinkDataHubParameters() {
            return this.sinkDataHubParameters;
        }

        public CreateEventStreamingRequestSink setSinkFcParameters(CreateEventStreamingRequestSinkSinkFcParameters sinkFcParameters) {
            this.sinkFcParameters = sinkFcParameters;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkFcParameters getSinkFcParameters() {
            return this.sinkFcParameters;
        }

        public CreateEventStreamingRequestSink setSinkFnfParameters(CreateEventStreamingRequestSinkSinkFnfParameters sinkFnfParameters) {
            this.sinkFnfParameters = sinkFnfParameters;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkFnfParameters getSinkFnfParameters() {
            return this.sinkFnfParameters;
        }

        public CreateEventStreamingRequestSink setSinkKafkaParameters(CreateEventStreamingRequestSinkSinkKafkaParameters sinkKafkaParameters) {
            this.sinkKafkaParameters = sinkKafkaParameters;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkKafkaParameters getSinkKafkaParameters() {
            return this.sinkKafkaParameters;
        }

        public CreateEventStreamingRequestSink setSinkMNSParameters(CreateEventStreamingRequestSinkSinkMNSParameters sinkMNSParameters) {
            this.sinkMNSParameters = sinkMNSParameters;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkMNSParameters getSinkMNSParameters() {
            return this.sinkMNSParameters;
        }

        public CreateEventStreamingRequestSink setSinkPrometheusParameters(CreateEventStreamingRequestSinkSinkPrometheusParameters sinkPrometheusParameters) {
            this.sinkPrometheusParameters = sinkPrometheusParameters;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkPrometheusParameters getSinkPrometheusParameters() {
            return this.sinkPrometheusParameters;
        }

        public CreateEventStreamingRequestSink setSinkRabbitMQParameters(CreateEventStreamingRequestSinkSinkRabbitMQParameters sinkRabbitMQParameters) {
            this.sinkRabbitMQParameters = sinkRabbitMQParameters;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkRabbitMQParameters getSinkRabbitMQParameters() {
            return this.sinkRabbitMQParameters;
        }

        public CreateEventStreamingRequestSink setSinkRocketMQParameters(CreateEventStreamingRequestSinkSinkRocketMQParameters sinkRocketMQParameters) {
            this.sinkRocketMQParameters = sinkRocketMQParameters;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkRocketMQParameters getSinkRocketMQParameters() {
            return this.sinkRocketMQParameters;
        }

        public CreateEventStreamingRequestSink setSinkSLSParameters(CreateEventStreamingRequestSinkSinkSLSParameters sinkSLSParameters) {
            this.sinkSLSParameters = sinkSLSParameters;
            return this;
        }
        public CreateEventStreamingRequestSinkSinkSLSParameters getSinkSLSParameters() {
            return this.sinkSLSParameters;
        }

    }

    public static class CreateEventStreamingRequestSourceSourceApacheKafkaParameters extends TeaModel {
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

        public static CreateEventStreamingRequestSourceSourceApacheKafkaParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSourceSourceApacheKafkaParameters self = new CreateEventStreamingRequestSourceSourceApacheKafkaParameters();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSourceSourceApacheKafkaParameters setBootstraps(String bootstraps) {
            this.bootstraps = bootstraps;
            return this;
        }
        public String getBootstraps() {
            return this.bootstraps;
        }

        public CreateEventStreamingRequestSourceSourceApacheKafkaParameters setConsumerGroup(String consumerGroup) {
            this.consumerGroup = consumerGroup;
            return this;
        }
        public String getConsumerGroup() {
            return this.consumerGroup;
        }

        public CreateEventStreamingRequestSourceSourceApacheKafkaParameters setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public CreateEventStreamingRequestSourceSourceApacheKafkaParameters setOffsetReset(String offsetReset) {
            this.offsetReset = offsetReset;
            return this;
        }
        public String getOffsetReset() {
            return this.offsetReset;
        }

        public CreateEventStreamingRequestSourceSourceApacheKafkaParameters setSaslMechanism(String saslMechanism) {
            this.saslMechanism = saslMechanism;
            return this;
        }
        public String getSaslMechanism() {
            return this.saslMechanism;
        }

        public CreateEventStreamingRequestSourceSourceApacheKafkaParameters setSaslPassword(String saslPassword) {
            this.saslPassword = saslPassword;
            return this;
        }
        public String getSaslPassword() {
            return this.saslPassword;
        }

        public CreateEventStreamingRequestSourceSourceApacheKafkaParameters setSaslUser(String saslUser) {
            this.saslUser = saslUser;
            return this;
        }
        public String getSaslUser() {
            return this.saslUser;
        }

        public CreateEventStreamingRequestSourceSourceApacheKafkaParameters setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public CreateEventStreamingRequestSourceSourceApacheKafkaParameters setSecurityProtocol(String securityProtocol) {
            this.securityProtocol = securityProtocol;
            return this;
        }
        public String getSecurityProtocol() {
            return this.securityProtocol;
        }

        public CreateEventStreamingRequestSourceSourceApacheKafkaParameters setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public CreateEventStreamingRequestSourceSourceApacheKafkaParameters setVSwitchIds(String vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public String getVSwitchIds() {
            return this.vSwitchIds;
        }

        public CreateEventStreamingRequestSourceSourceApacheKafkaParameters setValueDataType(String valueDataType) {
            this.valueDataType = valueDataType;
            return this;
        }
        public String getValueDataType() {
            return this.valueDataType;
        }

        public CreateEventStreamingRequestSourceSourceApacheKafkaParameters setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class CreateEventStreamingRequestSourceSourceCustomizedKafkaConnectorParametersConnectorParameters extends TeaModel {
        @NameInMap("Config")
        public java.util.Map<String, ?> config;

        @NameInMap("Name")
        public String name;

        public static CreateEventStreamingRequestSourceSourceCustomizedKafkaConnectorParametersConnectorParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSourceSourceCustomizedKafkaConnectorParametersConnectorParameters self = new CreateEventStreamingRequestSourceSourceCustomizedKafkaConnectorParametersConnectorParameters();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSourceSourceCustomizedKafkaConnectorParametersConnectorParameters setConfig(java.util.Map<String, ?> config) {
            this.config = config;
            return this;
        }
        public java.util.Map<String, ?> getConfig() {
            return this.config;
        }

        public CreateEventStreamingRequestSourceSourceCustomizedKafkaConnectorParametersConnectorParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateEventStreamingRequestSourceSourceCustomizedKafkaConnectorParameters extends TeaModel {
        @NameInMap("ConnectorPackageUrl")
        public String connectorPackageUrl;

        @NameInMap("ConnectorParameters")
        public CreateEventStreamingRequestSourceSourceCustomizedKafkaConnectorParametersConnectorParameters connectorParameters;

        @NameInMap("WorkerParameters")
        public java.util.Map<String, ?> workerParameters;

        public static CreateEventStreamingRequestSourceSourceCustomizedKafkaConnectorParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSourceSourceCustomizedKafkaConnectorParameters self = new CreateEventStreamingRequestSourceSourceCustomizedKafkaConnectorParameters();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSourceSourceCustomizedKafkaConnectorParameters setConnectorPackageUrl(String connectorPackageUrl) {
            this.connectorPackageUrl = connectorPackageUrl;
            return this;
        }
        public String getConnectorPackageUrl() {
            return this.connectorPackageUrl;
        }

        public CreateEventStreamingRequestSourceSourceCustomizedKafkaConnectorParameters setConnectorParameters(CreateEventStreamingRequestSourceSourceCustomizedKafkaConnectorParametersConnectorParameters connectorParameters) {
            this.connectorParameters = connectorParameters;
            return this;
        }
        public CreateEventStreamingRequestSourceSourceCustomizedKafkaConnectorParametersConnectorParameters getConnectorParameters() {
            return this.connectorParameters;
        }

        public CreateEventStreamingRequestSourceSourceCustomizedKafkaConnectorParameters setWorkerParameters(java.util.Map<String, ?> workerParameters) {
            this.workerParameters = workerParameters;
            return this;
        }
        public java.util.Map<String, ?> getWorkerParameters() {
            return this.workerParameters;
        }

    }

    public static class CreateEventStreamingRequestSourceSourceCustomizedKafkaParameters extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        public static CreateEventStreamingRequestSourceSourceCustomizedKafkaParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSourceSourceCustomizedKafkaParameters self = new CreateEventStreamingRequestSourceSourceCustomizedKafkaParameters();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSourceSourceCustomizedKafkaParameters setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class CreateEventStreamingRequestSourceSourceDTSParameters extends TeaModel {
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
         * <p>HD3</p>
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

        public static CreateEventStreamingRequestSourceSourceDTSParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSourceSourceDTSParameters self = new CreateEventStreamingRequestSourceSourceDTSParameters();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSourceSourceDTSParameters setBrokerUrl(String brokerUrl) {
            this.brokerUrl = brokerUrl;
            return this;
        }
        public String getBrokerUrl() {
            return this.brokerUrl;
        }

        public CreateEventStreamingRequestSourceSourceDTSParameters setInitCheckPoint(Long initCheckPoint) {
            this.initCheckPoint = initCheckPoint;
            return this;
        }
        public Long getInitCheckPoint() {
            return this.initCheckPoint;
        }

        public CreateEventStreamingRequestSourceSourceDTSParameters setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public CreateEventStreamingRequestSourceSourceDTSParameters setSid(String sid) {
            this.sid = sid;
            return this;
        }
        public String getSid() {
            return this.sid;
        }

        public CreateEventStreamingRequestSourceSourceDTSParameters setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public CreateEventStreamingRequestSourceSourceDTSParameters setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public CreateEventStreamingRequestSourceSourceDTSParameters setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class CreateEventStreamingRequestSourceSourceKafkaParameters extends TeaModel {
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
         * <p>r-8vb64581862cd814</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The network type. Default value: Default. The value PublicNetwork specifies a virtual private cloud (VPC).</p>
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
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the security group to which the ApsaraMQ for Kafka instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp1iv19sp1msc7zot4wr</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The name of the topic on the ApsaraMQ for Kafka instance.</p>
         * 
         * <strong>example:</strong>
         * <p>popvip_center_robot_order</p>
         */
        @NameInMap("Topic")
        public String topic;

        /**
         * <p>The ID of the vSwitch with which the ApsaraMQ for Kafka instance is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp179l3llg3jjxwrq72hh</p>
         */
        @NameInMap("VSwitchIds")
        public String vSwitchIds;

        @NameInMap("ValueDataType")
        public String valueDataType;

        /**
         * <p>The ID of the VPC to which the ApsaraMQ for Kafka instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-8vblalsi0vbhizr77cbhu</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static CreateEventStreamingRequestSourceSourceKafkaParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSourceSourceKafkaParameters self = new CreateEventStreamingRequestSourceSourceKafkaParameters();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSourceSourceKafkaParameters setConsumerGroup(String consumerGroup) {
            this.consumerGroup = consumerGroup;
            return this;
        }
        public String getConsumerGroup() {
            return this.consumerGroup;
        }

        public CreateEventStreamingRequestSourceSourceKafkaParameters setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateEventStreamingRequestSourceSourceKafkaParameters setNetwork(String network) {
            this.network = network;
            return this;
        }
        public String getNetwork() {
            return this.network;
        }

        public CreateEventStreamingRequestSourceSourceKafkaParameters setOffsetReset(String offsetReset) {
            this.offsetReset = offsetReset;
            return this;
        }
        public String getOffsetReset() {
            return this.offsetReset;
        }

        public CreateEventStreamingRequestSourceSourceKafkaParameters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateEventStreamingRequestSourceSourceKafkaParameters setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public CreateEventStreamingRequestSourceSourceKafkaParameters setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public CreateEventStreamingRequestSourceSourceKafkaParameters setVSwitchIds(String vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public String getVSwitchIds() {
            return this.vSwitchIds;
        }

        public CreateEventStreamingRequestSourceSourceKafkaParameters setValueDataType(String valueDataType) {
            this.valueDataType = valueDataType;
            return this;
        }
        public String getValueDataType() {
            return this.valueDataType;
        }

        public CreateEventStreamingRequestSourceSourceKafkaParameters setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class CreateEventStreamingRequestSourceSourceMNSParameters extends TeaModel {
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
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static CreateEventStreamingRequestSourceSourceMNSParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSourceSourceMNSParameters self = new CreateEventStreamingRequestSourceSourceMNSParameters();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSourceSourceMNSParameters setIsBase64Decode(Boolean isBase64Decode) {
            this.isBase64Decode = isBase64Decode;
            return this;
        }
        public Boolean getIsBase64Decode() {
            return this.isBase64Decode;
        }

        public CreateEventStreamingRequestSourceSourceMNSParameters setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public CreateEventStreamingRequestSourceSourceMNSParameters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class CreateEventStreamingRequestSourceSourceMQTTParameters extends TeaModel {
        @NameInMap("BodyDataType")
        public String bodyDataType;

        /**
         * <p>The ID of the ApsaraMQ for MQTT instance.</p>
         * 
         * <strong>example:</strong>
         * <p>r-bp1b5ncun5lqerzg4r</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The ID of the region where the ApsaraMQ for MQTT instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The topic from which messages are sent.</p>
         * 
         * <strong>example:</strong>
         * <p>CANAL_VICUTU_UAT</p>
         */
        @NameInMap("Topic")
        public String topic;

        public static CreateEventStreamingRequestSourceSourceMQTTParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSourceSourceMQTTParameters self = new CreateEventStreamingRequestSourceSourceMQTTParameters();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSourceSourceMQTTParameters setBodyDataType(String bodyDataType) {
            this.bodyDataType = bodyDataType;
            return this;
        }
        public String getBodyDataType() {
            return this.bodyDataType;
        }

        public CreateEventStreamingRequestSourceSourceMQTTParameters setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateEventStreamingRequestSourceSourceMQTTParameters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateEventStreamingRequestSourceSourceMQTTParameters setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class CreateEventStreamingRequestSourceSourcePrometheusParameters extends TeaModel {
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

        public static CreateEventStreamingRequestSourceSourcePrometheusParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSourceSourcePrometheusParameters self = new CreateEventStreamingRequestSourceSourcePrometheusParameters();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSourceSourcePrometheusParameters setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public CreateEventStreamingRequestSourceSourcePrometheusParameters setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public CreateEventStreamingRequestSourceSourcePrometheusParameters setLabels(String labels) {
            this.labels = labels;
            return this;
        }
        public String getLabels() {
            return this.labels;
        }

        public CreateEventStreamingRequestSourceSourcePrometheusParameters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class CreateEventStreamingRequestSourceSourceRabbitMQParameters extends TeaModel {
        /**
         * <p>The ID of the ApsaraMQ for RabbitMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>gtm-cn-k2c2yfgzt02</p>
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
         * <p>The ID of the region where the ApsaraMQ for RabbitMQ instance resides. You can call the <a href="https://help.aliyun.com/document_detail/62010.html">DescribeRegions</a> operation to query the most recent region list.</p>
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

        public static CreateEventStreamingRequestSourceSourceRabbitMQParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSourceSourceRabbitMQParameters self = new CreateEventStreamingRequestSourceSourceRabbitMQParameters();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSourceSourceRabbitMQParameters setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateEventStreamingRequestSourceSourceRabbitMQParameters setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public CreateEventStreamingRequestSourceSourceRabbitMQParameters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateEventStreamingRequestSourceSourceRabbitMQParameters setVirtualHostName(String virtualHostName) {
            this.virtualHostName = virtualHostName;
            return this;
        }
        public String getVirtualHostName() {
            return this.virtualHostName;
        }

    }

    public static class CreateEventStreamingRequestSourceSourceRocketMQParameters extends TeaModel {
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

        /**
         * <p>The SQL statement that you want to use to filter messages.</p>
         * 
         * <strong>example:</strong>
         * <p>index &gt; 10</p>
         */
        @NameInMap("FilterSql")
        public String filterSql;

        /**
         * <p>The method that you want to use to filter messages.</p>
         * 
         * <strong>example:</strong>
         * <p>Tag</p>
         */
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
         * <p>registry-vpc.cn-zhangjiakou.aliyuncs.com</p>
         */
        @NameInMap("InstanceEndpoint")
        public String instanceEndpoint;

        /**
         * <p>The ID of the ApsaraMQ for RocketMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>default_C56C360261515</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The network type. Valid values:</p>
         * <ul>
         * <li>PublicNetwork and</li>
         * <li>PrivateNetwork.</li>
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
         * <p>admin</p>
         */
        @NameInMap("InstancePassword")
        public String instancePassword;

        /**
         * <p>The ID of the security group to which the ApsaraMQ for RocketMQ instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-m5edtu24f123456789</p>
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
         * <p>vsw-m5ev8asdc6h123456789</p>
         */
        @NameInMap("InstanceVSwitchIds")
        public String instanceVSwitchIds;

        /**
         * <p>The ID of the VPC to which the ApsaraMQ for RocketMQ instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-m5e3sv4b123456789</p>
         */
        @NameInMap("InstanceVpcId")
        public String instanceVpcId;

        /**
         * <p>The network type. Valid values: PublicNetwork and PrivateNetwork.</p>
         * 
         * <strong>example:</strong>
         * <p>PrivateNetwork</p>
         */
        @NameInMap("Network")
        public String network;

        /**
         * <p>The offset from which messages are consumed. Valid values:</p>
         * <ul>
         * <li>CONSUME_FROM_LAST_OFFSET: Messages are consumed from the latest offset.</li>
         * <li>CONSUME_FROM_FIRST_OFFSET: Messages are consumed from the earliest offset.</li>
         * <li>CONSUME_FROM_TIMESTAMP: Messages are consumed from the offset at the specified point in time.</li>
         * </ul>
         * <p>Default value: CONSUME_FROM_LAST_OFFSET.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSUMEFROMLAST_OFFSET</p>
         */
        @NameInMap("Offset")
        public String offset;

        /**
         * <p>The ID of the region where the ApsaraMQ for RocketMQ instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-qingdao</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The security group ID of the cross-border task.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-m5edtu24f123456789</p>
         */
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
         * <p>The timestamp that specifies the time from which messages are consumed. This parameter is valid only if you set Offset to CONSUME_FROM_TIMESTAMP.</p>
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
         * <p>Topic_publicRule_api_1667273421288</p>
         */
        @NameInMap("Topic")
        public String topic;

        /**
         * <p>The vSwitch ID of the cross-border task.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-m5ev8asdc6h123456789</p>
         */
        @NameInMap("VSwitchIds")
        public String vSwitchIds;

        /**
         * <p>The VPC ID of the cross-border task.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-m5e3sv4b123456789</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static CreateEventStreamingRequestSourceSourceRocketMQParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSourceSourceRocketMQParameters self = new CreateEventStreamingRequestSourceSourceRocketMQParameters();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSourceSourceRocketMQParameters setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public CreateEventStreamingRequestSourceSourceRocketMQParameters setBodyDataType(String bodyDataType) {
            this.bodyDataType = bodyDataType;
            return this;
        }
        public String getBodyDataType() {
            return this.bodyDataType;
        }

        public CreateEventStreamingRequestSourceSourceRocketMQParameters setFilterSql(String filterSql) {
            this.filterSql = filterSql;
            return this;
        }
        public String getFilterSql() {
            return this.filterSql;
        }

        public CreateEventStreamingRequestSourceSourceRocketMQParameters setFilterType(String filterType) {
            this.filterType = filterType;
            return this;
        }
        public String getFilterType() {
            return this.filterType;
        }

        public CreateEventStreamingRequestSourceSourceRocketMQParameters setGroupID(String groupID) {
            this.groupID = groupID;
            return this;
        }
        public String getGroupID() {
            return this.groupID;
        }

        public CreateEventStreamingRequestSourceSourceRocketMQParameters setInstanceEndpoint(String instanceEndpoint) {
            this.instanceEndpoint = instanceEndpoint;
            return this;
        }
        public String getInstanceEndpoint() {
            return this.instanceEndpoint;
        }

        public CreateEventStreamingRequestSourceSourceRocketMQParameters setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateEventStreamingRequestSourceSourceRocketMQParameters setInstanceNetwork(String instanceNetwork) {
            this.instanceNetwork = instanceNetwork;
            return this;
        }
        public String getInstanceNetwork() {
            return this.instanceNetwork;
        }

        public CreateEventStreamingRequestSourceSourceRocketMQParameters setInstancePassword(String instancePassword) {
            this.instancePassword = instancePassword;
            return this;
        }
        public String getInstancePassword() {
            return this.instancePassword;
        }

        public CreateEventStreamingRequestSourceSourceRocketMQParameters setInstanceSecurityGroupId(String instanceSecurityGroupId) {
            this.instanceSecurityGroupId = instanceSecurityGroupId;
            return this;
        }
        public String getInstanceSecurityGroupId() {
            return this.instanceSecurityGroupId;
        }

        public CreateEventStreamingRequestSourceSourceRocketMQParameters setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public CreateEventStreamingRequestSourceSourceRocketMQParameters setInstanceUsername(String instanceUsername) {
            this.instanceUsername = instanceUsername;
            return this;
        }
        public String getInstanceUsername() {
            return this.instanceUsername;
        }

        public CreateEventStreamingRequestSourceSourceRocketMQParameters setInstanceVSwitchIds(String instanceVSwitchIds) {
            this.instanceVSwitchIds = instanceVSwitchIds;
            return this;
        }
        public String getInstanceVSwitchIds() {
            return this.instanceVSwitchIds;
        }

        public CreateEventStreamingRequestSourceSourceRocketMQParameters setInstanceVpcId(String instanceVpcId) {
            this.instanceVpcId = instanceVpcId;
            return this;
        }
        public String getInstanceVpcId() {
            return this.instanceVpcId;
        }

        public CreateEventStreamingRequestSourceSourceRocketMQParameters setNetwork(String network) {
            this.network = network;
            return this;
        }
        public String getNetwork() {
            return this.network;
        }

        public CreateEventStreamingRequestSourceSourceRocketMQParameters setOffset(String offset) {
            this.offset = offset;
            return this;
        }
        public String getOffset() {
            return this.offset;
        }

        public CreateEventStreamingRequestSourceSourceRocketMQParameters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateEventStreamingRequestSourceSourceRocketMQParameters setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public CreateEventStreamingRequestSourceSourceRocketMQParameters setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public CreateEventStreamingRequestSourceSourceRocketMQParameters setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public CreateEventStreamingRequestSourceSourceRocketMQParameters setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public CreateEventStreamingRequestSourceSourceRocketMQParameters setVSwitchIds(String vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public String getVSwitchIds() {
            return this.vSwitchIds;
        }

        public CreateEventStreamingRequestSourceSourceRocketMQParameters setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class CreateEventStreamingRequestSourceSourceSLSParameters extends TeaModel {
        /**
         * <p>The consumer offset. The value begin specifies the earliest offset. The value end specifies the latest offset. You can also specify a time in seconds to start consumption.</p>
         * 
         * <strong>example:</strong>
         * <p>end</p>
         */
        @NameInMap("ConsumePosition")
        public String consumePosition;

        /**
         * <p>The Simple Log Service Logstore.</p>
         * 
         * <strong>example:</strong>
         * <p>sas-log</p>
         */
        @NameInMap("LogStore")
        public String logStore;

        /**
         * <p>The Simple Log Service project.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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

        public static CreateEventStreamingRequestSourceSourceSLSParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSourceSourceSLSParameters self = new CreateEventStreamingRequestSourceSourceSLSParameters();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSourceSourceSLSParameters setConsumePosition(String consumePosition) {
            this.consumePosition = consumePosition;
            return this;
        }
        public String getConsumePosition() {
            return this.consumePosition;
        }

        public CreateEventStreamingRequestSourceSourceSLSParameters setLogStore(String logStore) {
            this.logStore = logStore;
            return this;
        }
        public String getLogStore() {
            return this.logStore;
        }

        public CreateEventStreamingRequestSourceSourceSLSParameters setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public CreateEventStreamingRequestSourceSourceSLSParameters setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

    }

    public static class CreateEventStreamingRequestSource extends TeaModel {
        @NameInMap("SourceApacheKafkaParameters")
        public CreateEventStreamingRequestSourceSourceApacheKafkaParameters sourceApacheKafkaParameters;

        @NameInMap("SourceCustomizedKafkaConnectorParameters")
        public CreateEventStreamingRequestSourceSourceCustomizedKafkaConnectorParameters sourceCustomizedKafkaConnectorParameters;

        @NameInMap("SourceCustomizedKafkaParameters")
        public CreateEventStreamingRequestSourceSourceCustomizedKafkaParameters sourceCustomizedKafkaParameters;

        /**
         * <p>The parameters that are configured if you specify Data Transmission Service (DTS) as the event source.</p>
         */
        @NameInMap("SourceDTSParameters")
        public CreateEventStreamingRequestSourceSourceDTSParameters sourceDTSParameters;

        /**
         * <p>The parameters that are configured if you specify ApsaraMQ for Kafka as the event source.</p>
         */
        @NameInMap("SourceKafkaParameters")
        public CreateEventStreamingRequestSourceSourceKafkaParameters sourceKafkaParameters;

        /**
         * <p>The parameters that are configured if you specify Message Service (MNS) as the event source.</p>
         */
        @NameInMap("SourceMNSParameters")
        public CreateEventStreamingRequestSourceSourceMNSParameters sourceMNSParameters;

        /**
         * <p>The parameters that are configured if you specify ApsaraMQ for MQTT as the event source.</p>
         */
        @NameInMap("SourceMQTTParameters")
        public CreateEventStreamingRequestSourceSourceMQTTParameters sourceMQTTParameters;

        /**
         * <p>Parameters that are configured if you specify Managed Service for Prometheus as the event source.</p>
         */
        @NameInMap("SourcePrometheusParameters")
        public CreateEventStreamingRequestSourceSourcePrometheusParameters sourcePrometheusParameters;

        /**
         * <p>The parameters that are configured if you specify ApsaraMQ for RabbitMQ as the event source.</p>
         */
        @NameInMap("SourceRabbitMQParameters")
        public CreateEventStreamingRequestSourceSourceRabbitMQParameters sourceRabbitMQParameters;

        /**
         * <p>The parameters that are configured if you specify ApsaraMQ for RocketMQ as the event source.</p>
         */
        @NameInMap("SourceRocketMQParameters")
        public CreateEventStreamingRequestSourceSourceRocketMQParameters sourceRocketMQParameters;

        /**
         * <p>The parameters that are configured if you specify Simple Log Service as the event source.</p>
         */
        @NameInMap("SourceSLSParameters")
        public CreateEventStreamingRequestSourceSourceSLSParameters sourceSLSParameters;

        public static CreateEventStreamingRequestSource build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSource self = new CreateEventStreamingRequestSource();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestSource setSourceApacheKafkaParameters(CreateEventStreamingRequestSourceSourceApacheKafkaParameters sourceApacheKafkaParameters) {
            this.sourceApacheKafkaParameters = sourceApacheKafkaParameters;
            return this;
        }
        public CreateEventStreamingRequestSourceSourceApacheKafkaParameters getSourceApacheKafkaParameters() {
            return this.sourceApacheKafkaParameters;
        }

        public CreateEventStreamingRequestSource setSourceCustomizedKafkaConnectorParameters(CreateEventStreamingRequestSourceSourceCustomizedKafkaConnectorParameters sourceCustomizedKafkaConnectorParameters) {
            this.sourceCustomizedKafkaConnectorParameters = sourceCustomizedKafkaConnectorParameters;
            return this;
        }
        public CreateEventStreamingRequestSourceSourceCustomizedKafkaConnectorParameters getSourceCustomizedKafkaConnectorParameters() {
            return this.sourceCustomizedKafkaConnectorParameters;
        }

        public CreateEventStreamingRequestSource setSourceCustomizedKafkaParameters(CreateEventStreamingRequestSourceSourceCustomizedKafkaParameters sourceCustomizedKafkaParameters) {
            this.sourceCustomizedKafkaParameters = sourceCustomizedKafkaParameters;
            return this;
        }
        public CreateEventStreamingRequestSourceSourceCustomizedKafkaParameters getSourceCustomizedKafkaParameters() {
            return this.sourceCustomizedKafkaParameters;
        }

        public CreateEventStreamingRequestSource setSourceDTSParameters(CreateEventStreamingRequestSourceSourceDTSParameters sourceDTSParameters) {
            this.sourceDTSParameters = sourceDTSParameters;
            return this;
        }
        public CreateEventStreamingRequestSourceSourceDTSParameters getSourceDTSParameters() {
            return this.sourceDTSParameters;
        }

        public CreateEventStreamingRequestSource setSourceKafkaParameters(CreateEventStreamingRequestSourceSourceKafkaParameters sourceKafkaParameters) {
            this.sourceKafkaParameters = sourceKafkaParameters;
            return this;
        }
        public CreateEventStreamingRequestSourceSourceKafkaParameters getSourceKafkaParameters() {
            return this.sourceKafkaParameters;
        }

        public CreateEventStreamingRequestSource setSourceMNSParameters(CreateEventStreamingRequestSourceSourceMNSParameters sourceMNSParameters) {
            this.sourceMNSParameters = sourceMNSParameters;
            return this;
        }
        public CreateEventStreamingRequestSourceSourceMNSParameters getSourceMNSParameters() {
            return this.sourceMNSParameters;
        }

        public CreateEventStreamingRequestSource setSourceMQTTParameters(CreateEventStreamingRequestSourceSourceMQTTParameters sourceMQTTParameters) {
            this.sourceMQTTParameters = sourceMQTTParameters;
            return this;
        }
        public CreateEventStreamingRequestSourceSourceMQTTParameters getSourceMQTTParameters() {
            return this.sourceMQTTParameters;
        }

        public CreateEventStreamingRequestSource setSourcePrometheusParameters(CreateEventStreamingRequestSourceSourcePrometheusParameters sourcePrometheusParameters) {
            this.sourcePrometheusParameters = sourcePrometheusParameters;
            return this;
        }
        public CreateEventStreamingRequestSourceSourcePrometheusParameters getSourcePrometheusParameters() {
            return this.sourcePrometheusParameters;
        }

        public CreateEventStreamingRequestSource setSourceRabbitMQParameters(CreateEventStreamingRequestSourceSourceRabbitMQParameters sourceRabbitMQParameters) {
            this.sourceRabbitMQParameters = sourceRabbitMQParameters;
            return this;
        }
        public CreateEventStreamingRequestSourceSourceRabbitMQParameters getSourceRabbitMQParameters() {
            return this.sourceRabbitMQParameters;
        }

        public CreateEventStreamingRequestSource setSourceRocketMQParameters(CreateEventStreamingRequestSourceSourceRocketMQParameters sourceRocketMQParameters) {
            this.sourceRocketMQParameters = sourceRocketMQParameters;
            return this;
        }
        public CreateEventStreamingRequestSourceSourceRocketMQParameters getSourceRocketMQParameters() {
            return this.sourceRocketMQParameters;
        }

        public CreateEventStreamingRequestSource setSourceSLSParameters(CreateEventStreamingRequestSourceSourceSLSParameters sourceSLSParameters) {
            this.sourceSLSParameters = sourceSLSParameters;
            return this;
        }
        public CreateEventStreamingRequestSourceSourceSLSParameters getSourceSLSParameters() {
            return this.sourceSLSParameters;
        }

    }

    public static class CreateEventStreamingRequestTransforms extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>acs:fc:cn-hangzhou:*****:services/demo-service.LATEST/functions/demo-func</p>
         */
        @NameInMap("Arn")
        public String arn;

        public static CreateEventStreamingRequestTransforms build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestTransforms self = new CreateEventStreamingRequestTransforms();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingRequestTransforms setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

    }

}
