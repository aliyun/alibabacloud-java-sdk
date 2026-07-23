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
     * <p>The event filtering rule. If you do not specify this parameter, all events are matched. For more information, see <a href="https://www.alibabacloud.com/help/en/eventbridge/user-guide/event-patterns">https://www.alibabacloud.com/help/en/eventbridge/user-guide/event-patterns</a></p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;source&quot;: [
     *         {
     *             &quot;prefix&quot;: &quot;acs:mns&quot;
     *         }
     *     ],
     *     &quot;type&quot;: [
     *         {
     *             &quot;prefix&quot;: &quot;mns:Queue&quot;
     *         }
     *     ],
     *     &quot;subject&quot;: [
     *         {
     *             &quot;prefix&quot;: &quot;acs:mns:cn-hangzhou:123456789098****:queues/zeus&quot;
     *         }
     *     ]
     * }</p>
     */
    @NameInMap("FilterPattern")
    public String filterPattern;

    @NameInMap("Metadata")
    public String metadata;

    /**
     * <p>The runtime parameters.</p>
     */
    @NameInMap("RunOptions")
    public UpdateEventStreamingRequestRunOptions runOptions;

    /**
     * <p>The event target. You must select one and only one Sink type.</p>
     */
    @NameInMap("Sink")
    public UpdateEventStreamingRequestSink sink;

    /**
     * <p>The event provider. You must select one and only one Source type.</p>
     */
    @NameInMap("Source")
    public UpdateEventStreamingRequestSource source;

    /**
     * <p>The Transform-related configurations.</p>
     */
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

    public UpdateEventStreamingRequest setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }
    public String getMetadata() {
        return this.metadata;
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
         * <p>The maximum number of events that can be contained in the window. When this threshold is reached, the data in the window is pushed downstream. If multiple windows exist, a push is triggered when any window meets the threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CountBasedWindow")
        public Integer countBasedWindow;

        /**
         * <p>The maximum time range (in seconds) for events in the window. When this threshold is reached, the data in the window is pushed downstream. If multiple windows exist, a push is triggered when any window meets the threshold.</p>
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

    public static class UpdateEventStreamingRequestRunOptionsBusinessOption extends TeaModel {
        @NameInMap("BusinessMode")
        public String businessMode;

        @NameInMap("MaxCapacityUnitCount")
        public Long maxCapacityUnitCount;

        @NameInMap("MinCapacityUnitCount")
        public Long minCapacityUnitCount;

        public static UpdateEventStreamingRequestRunOptionsBusinessOption build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestRunOptionsBusinessOption self = new UpdateEventStreamingRequestRunOptionsBusinessOption();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestRunOptionsBusinessOption setBusinessMode(String businessMode) {
            this.businessMode = businessMode;
            return this;
        }
        public String getBusinessMode() {
            return this.businessMode;
        }

        public UpdateEventStreamingRequestRunOptionsBusinessOption setMaxCapacityUnitCount(Long maxCapacityUnitCount) {
            this.maxCapacityUnitCount = maxCapacityUnitCount;
            return this;
        }
        public Long getMaxCapacityUnitCount() {
            return this.maxCapacityUnitCount;
        }

        public UpdateEventStreamingRequestRunOptionsBusinessOption setMinCapacityUnitCount(Long minCapacityUnitCount) {
            this.minCapacityUnitCount = minCapacityUnitCount;
            return this;
        }
        public Long getMinCapacityUnitCount() {
            return this.minCapacityUnitCount;
        }

    }

    public static class UpdateEventStreamingRequestRunOptionsDeadLetterQueue extends TeaModel {
        /**
         * <p>The ARN of the dead-letter queue.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::131733464781****:role/rdstoecsassumekms</p>
         */
        @NameInMap("Arn")
        public String arn;

        /**
         * <p>The network type of the dead-letter queue. Valid values:</p>
         * <ul>
         * <li>PrivateNetwork</li>
         * <li>PublicNetwork</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PrivateNetwork</p>
         */
        @NameInMap("Network")
        public String network;

        /**
         * <p>The security group ID of the dead-letter queue instance.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-2vcgdxz7o1n9zapp****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The vSwitch ID of the dead-letter queue.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-m5ev8asdc6h12345****</p>
         */
        @NameInMap("VSwitchIds")
        public String vSwitchIds;

        /**
         * <p>The VPC ID of the dead-letter queue.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2zehizpoendb3****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

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

        public UpdateEventStreamingRequestRunOptionsDeadLetterQueue setNetwork(String network) {
            this.network = network;
            return this;
        }
        public String getNetwork() {
            return this.network;
        }

        public UpdateEventStreamingRequestRunOptionsDeadLetterQueue setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public UpdateEventStreamingRequestRunOptionsDeadLetterQueue setVSwitchIds(String vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public String getVSwitchIds() {
            return this.vSwitchIds;
        }

        public UpdateEventStreamingRequestRunOptionsDeadLetterQueue setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class UpdateEventStreamingRequestRunOptionsRetryStrategy extends TeaModel {
        /**
         * <p>The maximum retry time.</p>
         * 
         * <strong>example:</strong>
         * <p>512</p>
         */
        @NameInMap("MaximumEventAgeInSeconds")
        public Long maximumEventAgeInSeconds;

        /**
         * <p>The maximum number of retry attempts.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MaximumRetryAttempts")
        public Long maximumRetryAttempts;

        /**
         * <p>The retry strategy: BACKOFF_RETRY (backoff retry) or EXPONENTIAL_DECAY_RETRY (exponential decay retry).</p>
         * 
         * <strong>example:</strong>
         * <p>BACKOFF_RETRY</p>
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

    public static class UpdateEventStreamingRequestRunOptions extends TeaModel {
        /**
         * <p>The batching window.</p>
         */
        @NameInMap("BatchWindow")
        public UpdateEventStreamingRequestRunOptionsBatchWindow batchWindow;

        @NameInMap("BusinessOption")
        public UpdateEventStreamingRequestRunOptionsBusinessOption businessOption;

        /**
         * <p>Specifies whether to enable the dead-letter queue. The dead-letter queue is disabled by default. Messages that exceed the retry policy are discarded.</p>
         */
        @NameInMap("DeadLetterQueue")
        public UpdateEventStreamingRequestRunOptionsDeadLetterQueue deadLetterQueue;

        /**
         * <p>The error tolerance policy: NONE (no error tolerance) or ALL (tolerate all errors).</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("ErrorsTolerance")
        public String errorsTolerance;

        /**
         * <p>The concurrency.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MaximumTasks")
        public Long maximumTasks;

        /**
         * <p>The retry strategy when event push fails.</p>
         */
        @NameInMap("RetryStrategy")
        public UpdateEventStreamingRequestRunOptionsRetryStrategy retryStrategy;

        @NameInMap("Throttling")
        public Integer throttling;

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

        public UpdateEventStreamingRequestRunOptions setBusinessOption(UpdateEventStreamingRequestRunOptionsBusinessOption businessOption) {
            this.businessOption = businessOption;
            return this;
        }
        public UpdateEventStreamingRequestRunOptionsBusinessOption getBusinessOption() {
            return this.businessOption;
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

        public UpdateEventStreamingRequestRunOptions setMaximumTasks(Long maximumTasks) {
            this.maximumTasks = maximumTasks;
            return this;
        }
        public Long getMaximumTasks() {
            return this.maximumTasks;
        }

        public UpdateEventStreamingRequestRunOptions setRetryStrategy(UpdateEventStreamingRequestRunOptionsRetryStrategy retryStrategy) {
            this.retryStrategy = retryStrategy;
            return this;
        }
        public UpdateEventStreamingRequestRunOptionsRetryStrategy getRetryStrategy() {
            return this.retryStrategy;
        }

        public UpdateEventStreamingRequestRunOptions setThrottling(Integer throttling) {
            this.throttling = throttling;
            return this;
        }
        public Integer getThrottling() {
            return this.throttling;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkApacheKafkaParametersDynamicTopic extends TeaModel {
        /**
         * <p>The transformation type. Valid values:</p>
         * <ul>
         * <li>CONSTANT: fixed value</li>
         * <li>JSONPATH: extracted from upstream based on path</li>
         * </ul>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value.</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkApacheKafkaParametersDynamicTopic build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkApacheKafkaParametersDynamicTopic self = new UpdateEventStreamingRequestSinkSinkApacheKafkaParametersDynamicTopic();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkApacheKafkaParametersDynamicTopic setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkApacheKafkaParametersDynamicTopic setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkApacheKafkaParametersDynamicTopic setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkApacheKafkaParametersHeaders extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkApacheKafkaParametersHeaders build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkApacheKafkaParametersHeaders self = new UpdateEventStreamingRequestSinkSinkApacheKafkaParametersHeaders();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkApacheKafkaParametersHeaders setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkApacheKafkaParametersHeaders setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkApacheKafkaParametersHeaders setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkApacheKafkaParametersKey extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkApacheKafkaParametersKey build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkApacheKafkaParametersKey self = new UpdateEventStreamingRequestSinkSinkApacheKafkaParametersKey();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkApacheKafkaParametersKey setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkApacheKafkaParametersKey setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkApacheKafkaParametersKey setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkApacheKafkaParametersNetworkType extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkApacheKafkaParametersNetworkType build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkApacheKafkaParametersNetworkType self = new UpdateEventStreamingRequestSinkSinkApacheKafkaParametersNetworkType();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkApacheKafkaParametersNetworkType setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkApacheKafkaParametersNetworkType setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkApacheKafkaParametersNetworkType setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkApacheKafkaParametersSecurityGroupId extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkApacheKafkaParametersSecurityGroupId build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkApacheKafkaParametersSecurityGroupId self = new UpdateEventStreamingRequestSinkSinkApacheKafkaParametersSecurityGroupId();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkApacheKafkaParametersSecurityGroupId setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkApacheKafkaParametersSecurityGroupId setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkApacheKafkaParametersSecurityGroupId setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkApacheKafkaParametersSslKeystoreKey extends TeaModel {
        /**
         * <p>[Required] The KMS resource ARN that stores the SSL private key. Used to locate the Key Management Service instance that stores the client private key. Format example: \&quot;acs:kms:cn-hangzhou:123456789:secret/ssl-keystore-key-xxxx\&quot;. Obtain this value from the ARN information of the corresponding key in the KMS console.</p>
         */
        @NameInMap("KmsArn")
        public String kmsArn;

        /**
         * <p>[KMS KV mode] The key name in the KMS credential. When the KMS credential is stored as a key-value (KV) structure, specify this parameter to indicate the key corresponding to the SSL private key. Example: if the KMS credential is \&quot;{&quot;ssl_keystore_key&quot;:&quot;-----BEGIN PRIVATE KEY-----...&quot;,&quot;ssl_truststore_key&quot;:&quot;...&quot;}\&quot;, enter \&quot;ssl_keystore_key\&quot;. Leave empty if the KMS credential is in plain text mode (directly stores the PEM content of the private key).</p>
         */
        @NameInMap("KmsSecretValueKey")
        public String kmsSecretValueKey;

        public static UpdateEventStreamingRequestSinkSinkApacheKafkaParametersSslKeystoreKey build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkApacheKafkaParametersSslKeystoreKey self = new UpdateEventStreamingRequestSinkSinkApacheKafkaParametersSslKeystoreKey();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkApacheKafkaParametersSslKeystoreKey setKmsArn(String kmsArn) {
            this.kmsArn = kmsArn;
            return this;
        }
        public String getKmsArn() {
            return this.kmsArn;
        }

        public UpdateEventStreamingRequestSinkSinkApacheKafkaParametersSslKeystoreKey setKmsSecretValueKey(String kmsSecretValueKey) {
            this.kmsSecretValueKey = kmsSecretValueKey;
            return this;
        }
        public String getKmsSecretValueKey() {
            return this.kmsSecretValueKey;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkApacheKafkaParametersVSwitchIds extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkApacheKafkaParametersVSwitchIds build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkApacheKafkaParametersVSwitchIds self = new UpdateEventStreamingRequestSinkSinkApacheKafkaParametersVSwitchIds();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkApacheKafkaParametersVSwitchIds setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkApacheKafkaParametersVSwitchIds setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkApacheKafkaParametersVSwitchIds setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkApacheKafkaParametersValue extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkApacheKafkaParametersValue build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkApacheKafkaParametersValue self = new UpdateEventStreamingRequestSinkSinkApacheKafkaParametersValue();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkApacheKafkaParametersValue setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkApacheKafkaParametersValue setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkApacheKafkaParametersValue setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkApacheKafkaParametersVpcId extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkApacheKafkaParametersVpcId build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkApacheKafkaParametersVpcId self = new UpdateEventStreamingRequestSinkSinkApacheKafkaParametersVpcId();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkApacheKafkaParametersVpcId setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkApacheKafkaParametersVpcId setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkApacheKafkaParametersVpcId setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkApacheKafkaParameters extends TeaModel {
        @NameInMap("Acks")
        public String acks;

        @NameInMap("Bootstraps")
        public String bootstraps;

        @NameInMap("CompressionType")
        public String compressionType;

        /**
         * <p>Specifies the target Topic routing strategy for messages. If both the Topic parameter and the DynamicTopic parameter are specified, the DynamicTopic parameter takes precedence. Two configuration modes are supported:
         *     1. <strong>Static constant mode</strong>: Specify a fixed Topic name string (for example, &quot;order_created&quot;). All messages are sent to this Topic.
         *     2. <strong>Dynamic extraction mode</strong>: Specify a standard JSONPath expression (for example, &quot;$.user.id&quot; or &quot;$.metadata.category&quot;). The system parses the upstream message body and extracts the matching field value as the target Topic name.</p>
         */
        @NameInMap("DynamicTopic")
        public UpdateEventStreamingRequestSinkSinkApacheKafkaParametersDynamicTopic dynamicTopic;

        @NameInMap("Headers")
        public UpdateEventStreamingRequestSinkSinkApacheKafkaParametersHeaders headers;

        @NameInMap("Key")
        public UpdateEventStreamingRequestSinkSinkApacheKafkaParametersKey key;

        @NameInMap("NetworkType")
        public UpdateEventStreamingRequestSinkSinkApacheKafkaParametersNetworkType networkType;

        @NameInMap("SaslMechanism")
        public String saslMechanism;

        @NameInMap("SaslPassword")
        public String saslPassword;

        @NameInMap("SaslUser")
        public String saslUser;

        @NameInMap("SecurityGroupId")
        public UpdateEventStreamingRequestSinkSinkApacheKafkaParametersSecurityGroupId securityGroupId;

        @NameInMap("SecurityProtocol")
        public String securityProtocol;

        /**
         * <p>[Required for encrypted private key] The Kafka client private key password. This parameter is required when the client private key is password-protected (the PEM file contains \&quot;Proc-Type: 4,ENCRYPTED\&quot; or \&quot;ENCRYPTED\&quot; markers). Leave empty if the private key is not encrypted. Note: This password is only used to decrypt the private key and is unrelated to Kafka authentication.</p>
         */
        @NameInMap("SslKeyPassword")
        public String sslKeyPassword;

        /**
         * <p>[Required for mutual authentication] The Kafka client certificate chain. This parameter is required when the Kafka server enables mutual SSL authentication (ssl.client.auth=required). Format: Base64-encoded PEM format containing the client certificate and the complete certificate chain (client certificate first, intermediate CA certificate next, root CA certificate optional). Note: Ensure each PEM file content starts with \&quot;-----BEGIN CERTIFICATE-----\&quot; and ends with \&quot;-----END CERTIFICATE-----\&quot;, then Base64-encode the concatenated content.</p>
         */
        @NameInMap("SslKeystoreCertificateChain")
        public String sslKeystoreCertificateChain;

        /**
         * <p>[Required for mutual authentication] The SSL private key configuration object. This parameter is required when the Kafka server enables mutual SSL authentication. Only KMS mode is supported: specify the Key Management Service resource that stores the private key through KmsArn. The system retrieves the private key content from KMS only in memory for higher security. Configuration example: {\&quot;KmsArn\&quot;: \&quot;acs:kms:cn-hangzhou:123456789:secret/ssl-key-xxxx\&quot;, \&quot;KmsSecretValueKey\&quot;: \&quot;keystore_private_key\&quot;}</p>
         */
        @NameInMap("SslKeystoreKey")
        public UpdateEventStreamingRequestSinkSinkApacheKafkaParametersSslKeystoreKey sslKeystoreKey;

        /**
         * <p>[Required for SSL] The Kafka server trust certificate. Used to authenticate the SSL certificate of the Kafka Broker to prevent man-in-the-middle attacks. Format: Base64 encoding of PEM format, typically containing the CA certificate or the server certificate of the Kafka server. Example: Base64-encode the PEM file content of the CA certificate (ensure it starts with \&quot;-----BEGIN CERTIFICATE-----\&quot; and ends with \&quot;-----END CERTIFICATE-----\&quot;). If Kafka uses a self-signed certificate, provide the CA certificate that issued the certificate.</p>
         */
        @NameInMap("SslTruststoreCertificates")
        public String sslTruststoreCertificates;

        @NameInMap("Topic")
        public String topic;

        @NameInMap("VSwitchIds")
        public UpdateEventStreamingRequestSinkSinkApacheKafkaParametersVSwitchIds vSwitchIds;

        @NameInMap("Value")
        public UpdateEventStreamingRequestSinkSinkApacheKafkaParametersValue value;

        @NameInMap("VpcId")
        public UpdateEventStreamingRequestSinkSinkApacheKafkaParametersVpcId vpcId;

        public static UpdateEventStreamingRequestSinkSinkApacheKafkaParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkApacheKafkaParameters self = new UpdateEventStreamingRequestSinkSinkApacheKafkaParameters();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkApacheKafkaParameters setAcks(String acks) {
            this.acks = acks;
            return this;
        }
        public String getAcks() {
            return this.acks;
        }

        public UpdateEventStreamingRequestSinkSinkApacheKafkaParameters setBootstraps(String bootstraps) {
            this.bootstraps = bootstraps;
            return this;
        }
        public String getBootstraps() {
            return this.bootstraps;
        }

        public UpdateEventStreamingRequestSinkSinkApacheKafkaParameters setCompressionType(String compressionType) {
            this.compressionType = compressionType;
            return this;
        }
        public String getCompressionType() {
            return this.compressionType;
        }

        public UpdateEventStreamingRequestSinkSinkApacheKafkaParameters setDynamicTopic(UpdateEventStreamingRequestSinkSinkApacheKafkaParametersDynamicTopic dynamicTopic) {
            this.dynamicTopic = dynamicTopic;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkApacheKafkaParametersDynamicTopic getDynamicTopic() {
            return this.dynamicTopic;
        }

        public UpdateEventStreamingRequestSinkSinkApacheKafkaParameters setHeaders(UpdateEventStreamingRequestSinkSinkApacheKafkaParametersHeaders headers) {
            this.headers = headers;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkApacheKafkaParametersHeaders getHeaders() {
            return this.headers;
        }

        public UpdateEventStreamingRequestSinkSinkApacheKafkaParameters setKey(UpdateEventStreamingRequestSinkSinkApacheKafkaParametersKey key) {
            this.key = key;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkApacheKafkaParametersKey getKey() {
            return this.key;
        }

        public UpdateEventStreamingRequestSinkSinkApacheKafkaParameters setNetworkType(UpdateEventStreamingRequestSinkSinkApacheKafkaParametersNetworkType networkType) {
            this.networkType = networkType;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkApacheKafkaParametersNetworkType getNetworkType() {
            return this.networkType;
        }

        public UpdateEventStreamingRequestSinkSinkApacheKafkaParameters setSaslMechanism(String saslMechanism) {
            this.saslMechanism = saslMechanism;
            return this;
        }
        public String getSaslMechanism() {
            return this.saslMechanism;
        }

        public UpdateEventStreamingRequestSinkSinkApacheKafkaParameters setSaslPassword(String saslPassword) {
            this.saslPassword = saslPassword;
            return this;
        }
        public String getSaslPassword() {
            return this.saslPassword;
        }

        public UpdateEventStreamingRequestSinkSinkApacheKafkaParameters setSaslUser(String saslUser) {
            this.saslUser = saslUser;
            return this;
        }
        public String getSaslUser() {
            return this.saslUser;
        }

        public UpdateEventStreamingRequestSinkSinkApacheKafkaParameters setSecurityGroupId(UpdateEventStreamingRequestSinkSinkApacheKafkaParametersSecurityGroupId securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkApacheKafkaParametersSecurityGroupId getSecurityGroupId() {
            return this.securityGroupId;
        }

        public UpdateEventStreamingRequestSinkSinkApacheKafkaParameters setSecurityProtocol(String securityProtocol) {
            this.securityProtocol = securityProtocol;
            return this;
        }
        public String getSecurityProtocol() {
            return this.securityProtocol;
        }

        public UpdateEventStreamingRequestSinkSinkApacheKafkaParameters setSslKeyPassword(String sslKeyPassword) {
            this.sslKeyPassword = sslKeyPassword;
            return this;
        }
        public String getSslKeyPassword() {
            return this.sslKeyPassword;
        }

        public UpdateEventStreamingRequestSinkSinkApacheKafkaParameters setSslKeystoreCertificateChain(String sslKeystoreCertificateChain) {
            this.sslKeystoreCertificateChain = sslKeystoreCertificateChain;
            return this;
        }
        public String getSslKeystoreCertificateChain() {
            return this.sslKeystoreCertificateChain;
        }

        public UpdateEventStreamingRequestSinkSinkApacheKafkaParameters setSslKeystoreKey(UpdateEventStreamingRequestSinkSinkApacheKafkaParametersSslKeystoreKey sslKeystoreKey) {
            this.sslKeystoreKey = sslKeystoreKey;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkApacheKafkaParametersSslKeystoreKey getSslKeystoreKey() {
            return this.sslKeystoreKey;
        }

        public UpdateEventStreamingRequestSinkSinkApacheKafkaParameters setSslTruststoreCertificates(String sslTruststoreCertificates) {
            this.sslTruststoreCertificates = sslTruststoreCertificates;
            return this;
        }
        public String getSslTruststoreCertificates() {
            return this.sslTruststoreCertificates;
        }

        public UpdateEventStreamingRequestSinkSinkApacheKafkaParameters setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public UpdateEventStreamingRequestSinkSinkApacheKafkaParameters setVSwitchIds(UpdateEventStreamingRequestSinkSinkApacheKafkaParametersVSwitchIds vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkApacheKafkaParametersVSwitchIds getVSwitchIds() {
            return this.vSwitchIds;
        }

        public UpdateEventStreamingRequestSinkSinkApacheKafkaParameters setValue(UpdateEventStreamingRequestSinkSinkApacheKafkaParametersValue value) {
            this.value = value;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkApacheKafkaParametersValue getValue() {
            return this.value;
        }

        public UpdateEventStreamingRequestSinkSinkApacheKafkaParameters setVpcId(UpdateEventStreamingRequestSinkSinkApacheKafkaParametersVpcId vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkApacheKafkaParametersVpcId getVpcId() {
            return this.vpcId;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkApacheRocketMQCheckpointParametersConsumeTimestamp extends TeaModel {
        /**
         * <p>The transformation format. Default value: CONSTANT.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template style.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1570761026400</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkApacheRocketMQCheckpointParametersConsumeTimestamp build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkApacheRocketMQCheckpointParametersConsumeTimestamp self = new UpdateEventStreamingRequestSinkSinkApacheRocketMQCheckpointParametersConsumeTimestamp();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkApacheRocketMQCheckpointParametersConsumeTimestamp setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkApacheRocketMQCheckpointParametersConsumeTimestamp setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkApacheRocketMQCheckpointParametersConsumeTimestamp setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkApacheRocketMQCheckpointParametersGroup extends TeaModel {
        /**
         * <p>The transformation format. Default value: CONSTANT.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template style.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>Group ID</p>
         * 
         * <strong>example:</strong>
         * <p>GID_EVENTBRIDGE_1736234******</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkApacheRocketMQCheckpointParametersGroup build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkApacheRocketMQCheckpointParametersGroup self = new UpdateEventStreamingRequestSinkSinkApacheRocketMQCheckpointParametersGroup();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkApacheRocketMQCheckpointParametersGroup setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkApacheRocketMQCheckpointParametersGroup setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkApacheRocketMQCheckpointParametersGroup setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkApacheRocketMQCheckpointParametersTopic extends TeaModel {
        /**
         * <p>The transformation format. Default value: CONSTANT.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template style.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The topic name of the RocketMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Mytopic</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkApacheRocketMQCheckpointParametersTopic build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkApacheRocketMQCheckpointParametersTopic self = new UpdateEventStreamingRequestSinkSinkApacheRocketMQCheckpointParametersTopic();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkApacheRocketMQCheckpointParametersTopic setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkApacheRocketMQCheckpointParametersTopic setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkApacheRocketMQCheckpointParametersTopic setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkApacheRocketMQCheckpointParameters extends TeaModel {
        /**
         * <p>The timestamp of message consumption.</p>
         */
        @NameInMap("ConsumeTimestamp")
        public UpdateEventStreamingRequestSinkSinkApacheRocketMQCheckpointParametersConsumeTimestamp consumeTimestamp;

        /**
         * <p>The Group ID of the consumer group.</p>
         */
        @NameInMap("Group")
        public UpdateEventStreamingRequestSinkSinkApacheRocketMQCheckpointParametersGroup group;

        /**
         * <p>The instance endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.1:9876</p>
         */
        @NameInMap("InstanceEndpoint")
        public String instanceEndpoint;

        /**
         * <p>The password of the username.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("InstancePassword")
        public String instancePassword;

        /**
         * <p>The username required for authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("InstanceUsername")
        public String instanceUsername;

        /**
         * <p>The network type. Valid values:</p>
         * <ul>
         * <li>PublicNetwork</li>
         * <li>PrivateNetwork</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PrivateNetwork</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-2ze5bmpw6adn0q******</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The topic of the RocketMQ instance.</p>
         */
        @NameInMap("Topic")
        public UpdateEventStreamingRequestSinkSinkApacheRocketMQCheckpointParametersTopic topic;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf62oqt1twuevrt******</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2zeccak5pb0j3ay******</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static UpdateEventStreamingRequestSinkSinkApacheRocketMQCheckpointParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkApacheRocketMQCheckpointParameters self = new UpdateEventStreamingRequestSinkSinkApacheRocketMQCheckpointParameters();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkApacheRocketMQCheckpointParameters setConsumeTimestamp(UpdateEventStreamingRequestSinkSinkApacheRocketMQCheckpointParametersConsumeTimestamp consumeTimestamp) {
            this.consumeTimestamp = consumeTimestamp;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkApacheRocketMQCheckpointParametersConsumeTimestamp getConsumeTimestamp() {
            return this.consumeTimestamp;
        }

        public UpdateEventStreamingRequestSinkSinkApacheRocketMQCheckpointParameters setGroup(UpdateEventStreamingRequestSinkSinkApacheRocketMQCheckpointParametersGroup group) {
            this.group = group;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkApacheRocketMQCheckpointParametersGroup getGroup() {
            return this.group;
        }

        public UpdateEventStreamingRequestSinkSinkApacheRocketMQCheckpointParameters setInstanceEndpoint(String instanceEndpoint) {
            this.instanceEndpoint = instanceEndpoint;
            return this;
        }
        public String getInstanceEndpoint() {
            return this.instanceEndpoint;
        }

        public UpdateEventStreamingRequestSinkSinkApacheRocketMQCheckpointParameters setInstancePassword(String instancePassword) {
            this.instancePassword = instancePassword;
            return this;
        }
        public String getInstancePassword() {
            return this.instancePassword;
        }

        public UpdateEventStreamingRequestSinkSinkApacheRocketMQCheckpointParameters setInstanceUsername(String instanceUsername) {
            this.instanceUsername = instanceUsername;
            return this;
        }
        public String getInstanceUsername() {
            return this.instanceUsername;
        }

        public UpdateEventStreamingRequestSinkSinkApacheRocketMQCheckpointParameters setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public UpdateEventStreamingRequestSinkSinkApacheRocketMQCheckpointParameters setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public UpdateEventStreamingRequestSinkSinkApacheRocketMQCheckpointParameters setTopic(UpdateEventStreamingRequestSinkSinkApacheRocketMQCheckpointParametersTopic topic) {
            this.topic = topic;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkApacheRocketMQCheckpointParametersTopic getTopic() {
            return this.topic;
        }

        public UpdateEventStreamingRequestSinkSinkApacheRocketMQCheckpointParameters setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public UpdateEventStreamingRequestSinkSinkApacheRocketMQCheckpointParameters setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkCustomizedKafkaConnectorParametersConnectorParameters extends TeaModel {
        /**
         * <p>The connector configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *           &quot;connector.class&quot;: &quot;com.mongodb.kafka.connect.MongoSinkConnector&quot;,
         *           &quot;tasks.max&quot;: &quot;1&quot;,
         *           &quot;topics&quot;: &quot;sourceA,sourceB&quot;
         *         }</p>
         */
        @NameInMap("Config")
        public java.util.Map<String, ?> config;

        /**
         * <p>The connector name.</p>
         * 
         * <strong>example:</strong>
         * <p>mongo-sink</p>
         */
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
        /**
         * <p>The OSS file download URL.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;<a href="https://examplebucket.oss-cn-hangzhou.aliyuncs.com/testDoc/Old_Homebrew/2024-06-26%2022%3A34%3A08/opt/homebrew/homebrew/Library/Homebrew/test/support/fixtures/cask/AppWithBinary.zip?OSSAccessKeyId=ri&Expires=1725539627&Signature=rb8q3OpV2i3gZJ">https://examplebucket.oss-cn-hangzhou.aliyuncs.com/testDoc/Old_Homebrew/2024-06-26%2022%3A34%3A08/opt/homebrew/homebrew/Library/Homebrew/test/support/fixtures/cask/AppWithBinary.zip?OSSAccessKeyId=ri&amp;Expires=1725539627&amp;Signature=rb8q3OpV2i3gZJ</a>&quot;</p>
         */
        @NameInMap("ConnectorPackageUrl")
        public String connectorPackageUrl;

        /**
         * <p>Parses the properties file in the current ZIP package.</p>
         */
        @NameInMap("ConnectorParameters")
        public UpdateEventStreamingRequestSinkSinkCustomizedKafkaConnectorParametersConnectorParameters connectorParameters;

        /**
         * <p>The instance configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *         &quot;group.id&quot;: &quot;connect-eb-cluster-KAFKA_CONNECTORC&quot;,
         *         &quot;offset.storage.topic&quot;: &quot;connect-eb-offset-KAFKA_CONNECTOR_yjqC8K5ewC&quot;,
         *         &quot;config.storage.topic&quot;: &quot;connect-eb-config-KAFKA_CONNECTOR_yjqC8K5ewC&quot;,
         *         &quot;status.storage.topic&quot;: &quot;connect-eb-status-KAFKA_CONNECTOR_yjqC8K5ewC&quot;,
         *         &quot;consumer.group.id&quot;: &quot;connector-eb-cluster-KAFKA_CONNECTOR_yjqC8K5ewC-mongo-sink&quot;,
         *         &quot;bootstrap.servers&quot;: &quot;alikafka-post:9092&quot;
         *       }</p>
         */
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
        /**
         * <p>The instance ID of the ApsaraMQ for Kafka instance.</p>
         * 
         * <strong>example:</strong>
         * <p>90be1f96-4229-4535-bb76-34b4f6fb2b71</p>
         */
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

    public static class UpdateEventStreamingRequestSinkSinkDashVectorParametersDashVectorSchemaParametersName extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkDashVectorParametersDashVectorSchemaParametersName build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkDashVectorParametersDashVectorSchemaParametersName self = new UpdateEventStreamingRequestSinkSinkDashVectorParametersDashVectorSchemaParametersName();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkDashVectorParametersDashVectorSchemaParametersName setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkDashVectorParametersDashVectorSchemaParametersName setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkDashVectorParametersDashVectorSchemaParametersName setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkDashVectorParametersDashVectorSchemaParametersType extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkDashVectorParametersDashVectorSchemaParametersType build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkDashVectorParametersDashVectorSchemaParametersType self = new UpdateEventStreamingRequestSinkSinkDashVectorParametersDashVectorSchemaParametersType();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkDashVectorParametersDashVectorSchemaParametersType setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkDashVectorParametersDashVectorSchemaParametersType setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkDashVectorParametersDashVectorSchemaParametersType setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkDashVectorParametersDashVectorSchemaParametersValue extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkDashVectorParametersDashVectorSchemaParametersValue build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkDashVectorParametersDashVectorSchemaParametersValue self = new UpdateEventStreamingRequestSinkSinkDashVectorParametersDashVectorSchemaParametersValue();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkDashVectorParametersDashVectorSchemaParametersValue setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkDashVectorParametersDashVectorSchemaParametersValue setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkDashVectorParametersDashVectorSchemaParametersValue setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkDashVectorParametersDashVectorSchemaParameters extends TeaModel {
        @NameInMap("Name")
        public UpdateEventStreamingRequestSinkSinkDashVectorParametersDashVectorSchemaParametersName name;

        @NameInMap("Type")
        public UpdateEventStreamingRequestSinkSinkDashVectorParametersDashVectorSchemaParametersType type;

        @NameInMap("Value")
        public UpdateEventStreamingRequestSinkSinkDashVectorParametersDashVectorSchemaParametersValue value;

        public static UpdateEventStreamingRequestSinkSinkDashVectorParametersDashVectorSchemaParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkDashVectorParametersDashVectorSchemaParameters self = new UpdateEventStreamingRequestSinkSinkDashVectorParametersDashVectorSchemaParameters();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkDashVectorParametersDashVectorSchemaParameters setName(UpdateEventStreamingRequestSinkSinkDashVectorParametersDashVectorSchemaParametersName name) {
            this.name = name;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkDashVectorParametersDashVectorSchemaParametersName getName() {
            return this.name;
        }

        public UpdateEventStreamingRequestSinkSinkDashVectorParametersDashVectorSchemaParameters setType(UpdateEventStreamingRequestSinkSinkDashVectorParametersDashVectorSchemaParametersType type) {
            this.type = type;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkDashVectorParametersDashVectorSchemaParametersType getType() {
            return this.type;
        }

        public UpdateEventStreamingRequestSinkSinkDashVectorParametersDashVectorSchemaParameters setValue(UpdateEventStreamingRequestSinkSinkDashVectorParametersDashVectorSchemaParametersValue value) {
            this.value = value;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkDashVectorParametersDashVectorSchemaParametersValue getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkDashVectorParametersPartition extends TeaModel {
        /**
         * <p>The transformation format. Valid values:</p>
         * <ul>
         * <li>JSONPATH</li>
         * <li>CONSTANT</li>
         * </ul>
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
         * <p>The value. Valid values:</p>
         * <ul>
         * <li>If Form is CONSTANT: a constant value</li>
         * <li>If Form is JSONPATH: JSONPath extraction content</li>
         * </ul>
         * <blockquote>
         * <p>The Value field cannot exceed 10240 characters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkDashVectorParametersPartition build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkDashVectorParametersPartition self = new UpdateEventStreamingRequestSinkSinkDashVectorParametersPartition();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkDashVectorParametersPartition setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkDashVectorParametersPartition setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkDashVectorParametersPartition setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkDashVectorParametersPrimaryKeyId extends TeaModel {
        /**
         * <p>The transformation format. Valid values:</p>
         * <ul>
         * <li>JSONPATH</li>
         * <li>TEMPLATE</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>JSONPATH</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The primary key ID template. This parameter is required only when Form is set to TEMPLATE.</p>
         * 
         * <strong>example:</strong>
         * <p>${ID}</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value. Valid values:</p>
         * <ul>
         * <li>If Form is JSONPATH: JSONPath extraction content</li>
         * <li>If Form is TEMPLATE: a template variable<blockquote>
         * <p>The Value field cannot exceed 10240 characters.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>$.data.requestId</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkDashVectorParametersPrimaryKeyId build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkDashVectorParametersPrimaryKeyId self = new UpdateEventStreamingRequestSinkSinkDashVectorParametersPrimaryKeyId();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkDashVectorParametersPrimaryKeyId setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkDashVectorParametersPrimaryKeyId setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkDashVectorParametersPrimaryKeyId setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkDashVectorParametersVector extends TeaModel {
        /**
         * <p>The transformation format.</p>
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
         * <p>The JSONPath extraction content.</p>
         * <blockquote>
         * <p>The Value field cannot exceed 10240 characters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>$.data.messageBody</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkDashVectorParametersVector build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkDashVectorParametersVector self = new UpdateEventStreamingRequestSinkSinkDashVectorParametersVector();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkDashVectorParametersVector setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkDashVectorParametersVector setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkDashVectorParametersVector setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkDashVectorParameters extends TeaModel {
        /**
         * <p>The API key created in the DashVector console.</p>
         * 
         * <strong>example:</strong>
         * <p>Q34nExQH7sQ****</p>
         */
        @NameInMap("ApiKey")
        public String apiKey;

        /**
         * <p>The collection name.</p>
         * 
         * <strong>example:</strong>
         * <p>collection1</p>
         */
        @NameInMap("Collection")
        public String collection;

        /**
         * <p>The Schema field definition of the table entry when inserting into DashVector. The event content transformation result must be in JSON format.</p>
         */
        @NameInMap("DashVectorSchemaParameters")
        public java.util.List<UpdateEventStreamingRequestSinkSinkDashVectorParametersDashVectorSchemaParameters> dashVectorSchemaParameters;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vrs-cn-lbj3ru1***</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The network type. Valid values:</p>
         * <ul>
         * <li>PrivateNetwork</li>
         * <li>PublicNetwork</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PublicNetwork</p>
         */
        @NameInMap("Network")
        public String network;

        /**
         * <p>The DashVector database operation type. Valid values:</p>
         * <ul>
         * <li>Delete</li>
         * <li>Upsert</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Upsert</p>
         */
        @NameInMap("Operation")
        public String operation;

        /**
         * <p>The partition. Default value: default.</p>
         */
        @NameInMap("Partition")
        public UpdateEventStreamingRequestSinkSinkDashVectorParametersPartition partition;

        /**
         * <p>The primary key ID when inserting or deleting records. If this field is not specified, a random primary key ID is used.</p>
         */
        @NameInMap("PrimaryKeyId")
        public UpdateEventStreamingRequestSinkSinkDashVectorParametersPrimaryKeyId primaryKeyId;

        /**
         * <p>The vector of the record inserted into DashVector.</p>
         */
        @NameInMap("Vector")
        public UpdateEventStreamingRequestSinkSinkDashVectorParametersVector vector;

        public static UpdateEventStreamingRequestSinkSinkDashVectorParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkDashVectorParameters self = new UpdateEventStreamingRequestSinkSinkDashVectorParameters();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkDashVectorParameters setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public UpdateEventStreamingRequestSinkSinkDashVectorParameters setCollection(String collection) {
            this.collection = collection;
            return this;
        }
        public String getCollection() {
            return this.collection;
        }

        public UpdateEventStreamingRequestSinkSinkDashVectorParameters setDashVectorSchemaParameters(java.util.List<UpdateEventStreamingRequestSinkSinkDashVectorParametersDashVectorSchemaParameters> dashVectorSchemaParameters) {
            this.dashVectorSchemaParameters = dashVectorSchemaParameters;
            return this;
        }
        public java.util.List<UpdateEventStreamingRequestSinkSinkDashVectorParametersDashVectorSchemaParameters> getDashVectorSchemaParameters() {
            return this.dashVectorSchemaParameters;
        }

        public UpdateEventStreamingRequestSinkSinkDashVectorParameters setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UpdateEventStreamingRequestSinkSinkDashVectorParameters setNetwork(String network) {
            this.network = network;
            return this;
        }
        public String getNetwork() {
            return this.network;
        }

        public UpdateEventStreamingRequestSinkSinkDashVectorParameters setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public UpdateEventStreamingRequestSinkSinkDashVectorParameters setPartition(UpdateEventStreamingRequestSinkSinkDashVectorParametersPartition partition) {
            this.partition = partition;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkDashVectorParametersPartition getPartition() {
            return this.partition;
        }

        public UpdateEventStreamingRequestSinkSinkDashVectorParameters setPrimaryKeyId(UpdateEventStreamingRequestSinkSinkDashVectorParametersPrimaryKeyId primaryKeyId) {
            this.primaryKeyId = primaryKeyId;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkDashVectorParametersPrimaryKeyId getPrimaryKeyId() {
            return this.primaryKeyId;
        }

        public UpdateEventStreamingRequestSinkSinkDashVectorParameters setVector(UpdateEventStreamingRequestSinkSinkDashVectorParametersVector vector) {
            this.vector = vector;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkDashVectorParametersVector getVector() {
            return this.vector;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkDataHubParametersBody extends TeaModel {
        /**
         * <p>The transformation format.</p>
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
         * <p>The BLOB type Record content template.</p>
         */
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
        /**
         * <p>The template style.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template style.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value before transformation.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Key_1&quot;:{&quot;form&quot;:&quot;CONSTANT&quot;,&quot;value&quot;:&quot;demoKey&quot;},&quot;Value_1&quot;:{&quot;form&quot;:&quot;JSONPATH&quot;,&quot;value&quot;:&quot;$.data.value&quot;}}</p>
         */
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
        /**
         * <p>The transformation format.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template style.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value before transformation.</p>
         * 
         * <strong>example:</strong>
         * <p>JSON</p>
         */
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
        /**
         * <p>The transformation format. Default value: CONSTANT.</p>
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
         * <p>The DataHub project name.</p>
         * 
         * <strong>example:</strong>
         * <p>demo-project</p>
         */
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
        /**
         * <p>The transformation format. Default value: CONSTANT.</p>
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
         * <p>The task role name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-role</p>
         */
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
        /**
         * <p>The transformation format. Default value: CONSTANT.</p>
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
         * <p>The DataHub topic name.</p>
         * 
         * <strong>example:</strong>
         * <p>demo-topic</p>
         */
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
        /**
         * <p>The transformation format.</p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template style.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;k1&quot;:&quot;${k1}&quot;,&quot;k2&quot;:&quot;${k2}&quot;}</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The TUPLE type topic content schema.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;k1&quot;:&quot;value1&quot;,&quot;k2&quot;:&quot;value2&quot;}</p>
         */
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
        /**
         * <p>The transformation format. Default value: CONSTANT.</p>
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
        /**
         * <p>The BLOB type Record content template.</p>
         */
        @NameInMap("Body")
        public UpdateEventStreamingRequestSinkSinkDataHubParametersBody body;

        /**
         * <p>The custom log key-value pairs. This parameter takes effect only when ContentType is set to KeyValue. Each key-value pair is represented by Key_n and Value_n.</p>
         */
        @NameInMap("ContentSchema")
        public UpdateEventStreamingRequestSinkSinkDataHubParametersContentSchema contentSchema;

        /**
         * <p>The data format. You can select the default format or configure specified key-value pairs. Valid values:</p>
         * <ul>
         * <li>JSON</li>
         * <li>KeyValue</li>
         * </ul>
         */
        @NameInMap("ContentType")
        public UpdateEventStreamingRequestSinkSinkDataHubParametersContentType contentType;

        /**
         * <p>The DataHub project name.</p>
         */
        @NameInMap("Project")
        public UpdateEventStreamingRequestSinkSinkDataHubParametersProject project;

        /**
         * <p>The task role name.</p>
         */
        @NameInMap("RoleName")
        public UpdateEventStreamingRequestSinkSinkDataHubParametersRoleName roleName;

        /**
         * <p>The DataHub topic name.</p>
         */
        @NameInMap("Topic")
        public UpdateEventStreamingRequestSinkSinkDataHubParametersTopic topic;

        /**
         * <p>The TUPLE type topic content schema.</p>
         */
        @NameInMap("TopicSchema")
        public UpdateEventStreamingRequestSinkSinkDataHubParametersTopicSchema topicSchema;

        /**
         * <p>The topic type. Valid values:</p>
         * <ul>
         * <li>TUPLE</li>
         * <li>BLOB</li>
         * </ul>
         */
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

    public static class UpdateEventStreamingRequestSinkSinkDorisParametersBeHttpEndpoint extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkDorisParametersBeHttpEndpoint build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkDorisParametersBeHttpEndpoint self = new UpdateEventStreamingRequestSinkSinkDorisParametersBeHttpEndpoint();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkDorisParametersBeHttpEndpoint setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkDorisParametersBeHttpEndpoint setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkDorisParametersBeHttpEndpoint setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkDorisParametersBody extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkDorisParametersBody build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkDorisParametersBody self = new UpdateEventStreamingRequestSinkSinkDorisParametersBody();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkDorisParametersBody setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkDorisParametersBody setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkDorisParametersBody setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkDorisParametersDatabase extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkDorisParametersDatabase build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkDorisParametersDatabase self = new UpdateEventStreamingRequestSinkSinkDorisParametersDatabase();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkDorisParametersDatabase setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkDorisParametersDatabase setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkDorisParametersDatabase setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkDorisParametersFeHttpEndpoint extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkDorisParametersFeHttpEndpoint build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkDorisParametersFeHttpEndpoint self = new UpdateEventStreamingRequestSinkSinkDorisParametersFeHttpEndpoint();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkDorisParametersFeHttpEndpoint setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkDorisParametersFeHttpEndpoint setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkDorisParametersFeHttpEndpoint setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkDorisParametersNetworkType extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkDorisParametersNetworkType build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkDorisParametersNetworkType self = new UpdateEventStreamingRequestSinkSinkDorisParametersNetworkType();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkDorisParametersNetworkType setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkDorisParametersNetworkType setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkDorisParametersNetworkType setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkDorisParametersPassword extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkDorisParametersPassword build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkDorisParametersPassword self = new UpdateEventStreamingRequestSinkSinkDorisParametersPassword();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkDorisParametersPassword setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkDorisParametersPassword setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkDorisParametersPassword setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkDorisParametersQueryEndpoint extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkDorisParametersQueryEndpoint build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkDorisParametersQueryEndpoint self = new UpdateEventStreamingRequestSinkSinkDorisParametersQueryEndpoint();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkDorisParametersQueryEndpoint setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkDorisParametersQueryEndpoint setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkDorisParametersQueryEndpoint setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkDorisParametersSecurityGroupId extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkDorisParametersSecurityGroupId build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkDorisParametersSecurityGroupId self = new UpdateEventStreamingRequestSinkSinkDorisParametersSecurityGroupId();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkDorisParametersSecurityGroupId setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkDorisParametersSecurityGroupId setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkDorisParametersSecurityGroupId setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkDorisParametersTable extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkDorisParametersTable build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkDorisParametersTable self = new UpdateEventStreamingRequestSinkSinkDorisParametersTable();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkDorisParametersTable setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkDorisParametersTable setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkDorisParametersTable setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkDorisParametersUserName extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkDorisParametersUserName build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkDorisParametersUserName self = new UpdateEventStreamingRequestSinkSinkDorisParametersUserName();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkDorisParametersUserName setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkDorisParametersUserName setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkDorisParametersUserName setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkDorisParametersVSwitchIds extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkDorisParametersVSwitchIds build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkDorisParametersVSwitchIds self = new UpdateEventStreamingRequestSinkSinkDorisParametersVSwitchIds();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkDorisParametersVSwitchIds setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkDorisParametersVSwitchIds setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkDorisParametersVSwitchIds setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkDorisParametersVpcId extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkDorisParametersVpcId build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkDorisParametersVpcId self = new UpdateEventStreamingRequestSinkSinkDorisParametersVpcId();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkDorisParametersVpcId setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkDorisParametersVpcId setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkDorisParametersVpcId setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkDorisParameters extends TeaModel {
        @NameInMap("BeHttpEndpoint")
        public UpdateEventStreamingRequestSinkSinkDorisParametersBeHttpEndpoint beHttpEndpoint;

        @NameInMap("Body")
        public UpdateEventStreamingRequestSinkSinkDorisParametersBody body;

        @NameInMap("Database")
        public UpdateEventStreamingRequestSinkSinkDorisParametersDatabase database;

        @NameInMap("FeHttpEndpoint")
        public UpdateEventStreamingRequestSinkSinkDorisParametersFeHttpEndpoint feHttpEndpoint;

        @NameInMap("NetworkType")
        public UpdateEventStreamingRequestSinkSinkDorisParametersNetworkType networkType;

        @NameInMap("Password")
        public UpdateEventStreamingRequestSinkSinkDorisParametersPassword password;

        @NameInMap("QueryEndpoint")
        public UpdateEventStreamingRequestSinkSinkDorisParametersQueryEndpoint queryEndpoint;

        @NameInMap("SecurityGroupId")
        public UpdateEventStreamingRequestSinkSinkDorisParametersSecurityGroupId securityGroupId;

        @NameInMap("Table")
        public UpdateEventStreamingRequestSinkSinkDorisParametersTable table;

        @NameInMap("UserName")
        public UpdateEventStreamingRequestSinkSinkDorisParametersUserName userName;

        @NameInMap("VSwitchIds")
        public UpdateEventStreamingRequestSinkSinkDorisParametersVSwitchIds vSwitchIds;

        @NameInMap("VpcId")
        public UpdateEventStreamingRequestSinkSinkDorisParametersVpcId vpcId;

        public static UpdateEventStreamingRequestSinkSinkDorisParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkDorisParameters self = new UpdateEventStreamingRequestSinkSinkDorisParameters();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkDorisParameters setBeHttpEndpoint(UpdateEventStreamingRequestSinkSinkDorisParametersBeHttpEndpoint beHttpEndpoint) {
            this.beHttpEndpoint = beHttpEndpoint;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkDorisParametersBeHttpEndpoint getBeHttpEndpoint() {
            return this.beHttpEndpoint;
        }

        public UpdateEventStreamingRequestSinkSinkDorisParameters setBody(UpdateEventStreamingRequestSinkSinkDorisParametersBody body) {
            this.body = body;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkDorisParametersBody getBody() {
            return this.body;
        }

        public UpdateEventStreamingRequestSinkSinkDorisParameters setDatabase(UpdateEventStreamingRequestSinkSinkDorisParametersDatabase database) {
            this.database = database;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkDorisParametersDatabase getDatabase() {
            return this.database;
        }

        public UpdateEventStreamingRequestSinkSinkDorisParameters setFeHttpEndpoint(UpdateEventStreamingRequestSinkSinkDorisParametersFeHttpEndpoint feHttpEndpoint) {
            this.feHttpEndpoint = feHttpEndpoint;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkDorisParametersFeHttpEndpoint getFeHttpEndpoint() {
            return this.feHttpEndpoint;
        }

        public UpdateEventStreamingRequestSinkSinkDorisParameters setNetworkType(UpdateEventStreamingRequestSinkSinkDorisParametersNetworkType networkType) {
            this.networkType = networkType;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkDorisParametersNetworkType getNetworkType() {
            return this.networkType;
        }

        public UpdateEventStreamingRequestSinkSinkDorisParameters setPassword(UpdateEventStreamingRequestSinkSinkDorisParametersPassword password) {
            this.password = password;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkDorisParametersPassword getPassword() {
            return this.password;
        }

        public UpdateEventStreamingRequestSinkSinkDorisParameters setQueryEndpoint(UpdateEventStreamingRequestSinkSinkDorisParametersQueryEndpoint queryEndpoint) {
            this.queryEndpoint = queryEndpoint;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkDorisParametersQueryEndpoint getQueryEndpoint() {
            return this.queryEndpoint;
        }

        public UpdateEventStreamingRequestSinkSinkDorisParameters setSecurityGroupId(UpdateEventStreamingRequestSinkSinkDorisParametersSecurityGroupId securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkDorisParametersSecurityGroupId getSecurityGroupId() {
            return this.securityGroupId;
        }

        public UpdateEventStreamingRequestSinkSinkDorisParameters setTable(UpdateEventStreamingRequestSinkSinkDorisParametersTable table) {
            this.table = table;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkDorisParametersTable getTable() {
            return this.table;
        }

        public UpdateEventStreamingRequestSinkSinkDorisParameters setUserName(UpdateEventStreamingRequestSinkSinkDorisParametersUserName userName) {
            this.userName = userName;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkDorisParametersUserName getUserName() {
            return this.userName;
        }

        public UpdateEventStreamingRequestSinkSinkDorisParameters setVSwitchIds(UpdateEventStreamingRequestSinkSinkDorisParametersVSwitchIds vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkDorisParametersVSwitchIds getVSwitchIds() {
            return this.vSwitchIds;
        }

        public UpdateEventStreamingRequestSinkSinkDorisParameters setVpcId(UpdateEventStreamingRequestSinkSinkDorisParametersVpcId vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkDorisParametersVpcId getVpcId() {
            return this.vpcId;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkEventHouseParametersMappingRulesColumnValue extends TeaModel {
        /**
         * <p>The transformation method, such as JSONPATH.</p>
         * 
         * <strong>example:</strong>
         * <p>JSONPATH</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The extraction path, such as $.data.value.name.</p>
         * 
         * <strong>example:</strong>
         * <p>$.data.value</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkEventHouseParametersMappingRulesColumnValue build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkEventHouseParametersMappingRulesColumnValue self = new UpdateEventStreamingRequestSinkSinkEventHouseParametersMappingRulesColumnValue();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkEventHouseParametersMappingRulesColumnValue setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkEventHouseParametersMappingRulesColumnValue setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkEventHouseParametersMappingRulesColumnValue setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkEventHouseParametersMappingRules extends TeaModel {
        /**
         * <p>The column name.</p>
         * 
         * <strong>example:</strong>
         * <p>age</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <p>The column type.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("ColumnType")
        public String columnType;

        /**
         * <p>The column value extraction rule.</p>
         */
        @NameInMap("ColumnValue")
        public UpdateEventStreamingRequestSinkSinkEventHouseParametersMappingRulesColumnValue columnValue;

        public static UpdateEventStreamingRequestSinkSinkEventHouseParametersMappingRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkEventHouseParametersMappingRules self = new UpdateEventStreamingRequestSinkSinkEventHouseParametersMappingRules();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkEventHouseParametersMappingRules setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public UpdateEventStreamingRequestSinkSinkEventHouseParametersMappingRules setColumnType(String columnType) {
            this.columnType = columnType;
            return this;
        }
        public String getColumnType() {
            return this.columnType;
        }

        public UpdateEventStreamingRequestSinkSinkEventHouseParametersMappingRules setColumnValue(UpdateEventStreamingRequestSinkSinkEventHouseParametersMappingRulesColumnValue columnValue) {
            this.columnValue = columnValue;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkEventHouseParametersMappingRulesColumnValue getColumnValue() {
            return this.columnValue;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkEventHouseParameters extends TeaModel {
        /**
         * <p>The catalog name.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("CatalogName")
        public String catalogName;

        /**
         * <p>The name of the target table.</p>
         * 
         * <strong>example:</strong>
         * <p>demo-table</p>
         */
        @NameInMap("EventTableName")
        public String eventTableName;

        /**
         * <p>The field mapping rules.</p>
         */
        @NameInMap("MappingRules")
        public java.util.List<UpdateEventStreamingRequestSinkSinkEventHouseParametersMappingRules> mappingRules;

        /**
         * <p>The namespace of the target table.</p>
         * 
         * <strong>example:</strong>
         * <p>name1</p>
         */
        @NameInMap("NamespaceName")
        public String namespaceName;

        public static UpdateEventStreamingRequestSinkSinkEventHouseParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkEventHouseParameters self = new UpdateEventStreamingRequestSinkSinkEventHouseParameters();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkEventHouseParameters setCatalogName(String catalogName) {
            this.catalogName = catalogName;
            return this;
        }
        public String getCatalogName() {
            return this.catalogName;
        }

        public UpdateEventStreamingRequestSinkSinkEventHouseParameters setEventTableName(String eventTableName) {
            this.eventTableName = eventTableName;
            return this;
        }
        public String getEventTableName() {
            return this.eventTableName;
        }

        public UpdateEventStreamingRequestSinkSinkEventHouseParameters setMappingRules(java.util.List<UpdateEventStreamingRequestSinkSinkEventHouseParametersMappingRules> mappingRules) {
            this.mappingRules = mappingRules;
            return this;
        }
        public java.util.List<UpdateEventStreamingRequestSinkSinkEventHouseParametersMappingRules> getMappingRules() {
            return this.mappingRules;
        }

        public UpdateEventStreamingRequestSinkSinkEventHouseParameters setNamespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }
        public String getNamespaceName() {
            return this.namespaceName;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkFcParametersBody extends TeaModel {
        /**
         * <p>The transformation format.</p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template style.</p>
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
         * <p>The transformation format. Default value: CONSTANT.</p>
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

    public static class UpdateEventStreamingRequestSinkSinkFcParametersDataFormat extends TeaModel {
        /**
         * <p>The transformation format. Valid values:</p>
         * <ul>
         * <li>ORIGINAL: complete event</li>
         * <li>JSONPATH: partial event</li>
         * <li>CONSTANT: constant</li>
         * <li>TEMPLATE: template</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>JSONPATH</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template style.</p>
         * 
         * <strong>example:</strong>
         * <p>$.data.key</p>
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

        public static UpdateEventStreamingRequestSinkSinkFcParametersDataFormat build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkFcParametersDataFormat self = new UpdateEventStreamingRequestSinkSinkFcParametersDataFormat();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkFcParametersDataFormat setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkFcParametersDataFormat setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkFcParametersDataFormat setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkFcParametersFunctionName extends TeaModel {
        /**
         * <p>The transformation format. Default value: CONSTANT.</p>
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
         * <p>The transformation format. Default value: CONSTANT.</p>
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
         * <p>The invocation type.</p>
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
         * <p>The transformation format. Default value: CONSTANT.</p>
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
         * <p>The transformation format. Default value: CONSTANT.</p>
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
         * <p>The name of the service.</p>
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
         * <p>The content body sent to the function.</p>
         */
        @NameInMap("Body")
        public UpdateEventStreamingRequestSinkSinkFcParametersBody body;

        /**
         * <p>The delivery concurrency. Minimum value: 1.</p>
         */
        @NameInMap("Concurrency")
        public UpdateEventStreamingRequestSinkSinkFcParametersConcurrency concurrency;

        /**
         * <p>The format conversion rule for event content.</p>
         */
        @NameInMap("DataFormat")
        public UpdateEventStreamingRequestSinkSinkFcParametersDataFormat dataFormat;

        /**
         * <p>The function name.</p>
         */
        @NameInMap("FunctionName")
        public UpdateEventStreamingRequestSinkSinkFcParametersFunctionName functionName;

        /**
         * <p>The invocation type. Valid values:</p>
         * <ul>
         * <li>Sync: synchronous.</li>
         * <li>Async: asynchronous.</li>
         * </ul>
         */
        @NameInMap("InvocationType")
        public UpdateEventStreamingRequestSinkSinkFcParametersInvocationType invocationType;

        /**
         * <p>The alias of the service to which the function belongs.</p>
         */
        @NameInMap("Qualifier")
        public UpdateEventStreamingRequestSinkSinkFcParametersQualifier qualifier;

        /**
         * <p>The name of the service.</p>
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

        public UpdateEventStreamingRequestSinkSinkFcParameters setDataFormat(UpdateEventStreamingRequestSinkSinkFcParametersDataFormat dataFormat) {
            this.dataFormat = dataFormat;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkFcParametersDataFormat getDataFormat() {
            return this.dataFormat;
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
         * <p>The transformation format. Default value: CONSTANT.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template style.</p>
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
         * <p>The transformation format. Default value: CONSTANT.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template style.</p>
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
         * <p>The transformation format. Default value: CONSTANT.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template style.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The execution input information.</p>
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
         * <p>The transformation format. Default value: CONSTANT.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template style.</p>
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
         * <p>The execution input information.</p>
         */
        @NameInMap("Input")
        public UpdateEventStreamingRequestSinkSinkFnfParametersInput input;

        /**
         * <p>The role configuration.</p>
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
         * <p>The transformation format. Default value: CONSTANT.</p>
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
         * <p>The Kafka write acknowledgment mode. Valid values:</p>
         * <ul>
         * <li>acks=0: No response is required from the server. Performance is high, but the risk of data loss is high.</li>
         * <li>acks=1: A response is returned after the primary node writes successfully. Performance is moderate, and the risk of data loss is moderate. Data loss may occur if the primary node goes down.</li>
         * <li>acks=all: A response is returned after the primary node writes successfully and the secondary nodes synchronize successfully. Performance is low, but data is more secure. Data loss occurs only if both the primary and secondary nodes go down.</li>
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

    public static class UpdateEventStreamingRequestSinkSinkKafkaParametersDynamicTopic extends TeaModel {
        /**
         * <p>The transformation type. Valid values:</p>
         * <ul>
         * <li>CONSTANT: fixed value</li>
         * <li>JSONPATH: extracted from upstream based on path</li>
         * </ul>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value.</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkKafkaParametersDynamicTopic build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkKafkaParametersDynamicTopic self = new UpdateEventStreamingRequestSinkSinkKafkaParametersDynamicTopic();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkKafkaParametersDynamicTopic setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkKafkaParametersDynamicTopic setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkKafkaParametersDynamicTopic setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkKafkaParametersHeaders extends TeaModel {
        /**
         * <p>The transformation format. Valid values:</p>
         * <ul>
         * <li>ORIGINAL: complete event</li>
         * <li>JSONPATH: partial event</li>
         * <li>CONSTANT: constant</li>
         * <li>TEMPLATE: template</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template style.</p>
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

        public static UpdateEventStreamingRequestSinkSinkKafkaParametersHeaders build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkKafkaParametersHeaders self = new UpdateEventStreamingRequestSinkSinkKafkaParametersHeaders();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkKafkaParametersHeaders setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkKafkaParametersHeaders setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkKafkaParametersHeaders setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkKafkaParametersInstanceId extends TeaModel {
        /**
         * <p>The transformation format. Default value: CONSTANT.</p>
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
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>Defaut_1283278472_s****</p>
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
         * <p>The transformation format. Default value: CONSTANT.</p>
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
         * <p>The message identifier.</p>
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
         * <p>The transformation format. Default value: CONSTANT.</p>
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
         * <p>The topic name.</p>
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
         * <p>The transformation format.</p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template style.</p>
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
         * <p>The Kafka write acknowledgment mode. Valid values:</p>
         * <ul>
         * <li>acks=0: No response is required from the server. Performance is high, but the risk of data loss is high.</li>
         * <li>acks=1: A response is returned after the primary node writes successfully. Performance is moderate, and the risk of data loss is moderate. Data loss may occur if the primary node goes down.</li>
         * <li>acks=all: A response is returned after the primary node writes successfully and the secondary nodes synchronize successfully. Performance is low, but data is more secure. Data loss occurs only if both the primary and secondary nodes go down.</li>
         * </ul>
         */
        @NameInMap("Acks")
        public UpdateEventStreamingRequestSinkSinkKafkaParametersAcks acks;

        @NameInMap("CompressionType")
        public String compressionType;

        /**
         * <p>Specifies the target Topic routing strategy for messages. If both the Topic parameter and the DynamicTopic parameter are specified, the DynamicTopic parameter takes precedence. Two configuration modes are supported:
         *     1. <strong>Static constant mode</strong>: Specify a fixed Topic name string (for example, &quot;order_created&quot;). All messages are sent to this Topic.
         *     2. <strong>Dynamic extraction mode</strong>: Specify a standard JSONPath expression (for example, &quot;$.user.id&quot; or &quot;$.metadata.category&quot;). The system parses the upstream message body and extracts the matching field value as the target Topic name.</p>
         */
        @NameInMap("DynamicTopic")
        public UpdateEventStreamingRequestSinkSinkKafkaParametersDynamicTopic dynamicTopic;

        /**
         * <p>The additional metadata of the Kafka message.</p>
         */
        @NameInMap("Headers")
        public UpdateEventStreamingRequestSinkSinkKafkaParametersHeaders headers;

        /**
         * <p>The target service type is ApsaraMQ for Kafka.</p>
         */
        @NameInMap("InstanceId")
        public UpdateEventStreamingRequestSinkSinkKafkaParametersInstanceId instanceId;

        /**
         * <p>The message identifier.</p>
         */
        @NameInMap("Key")
        public UpdateEventStreamingRequestSinkSinkKafkaParametersKey key;

        /**
         * <p>The topic name.</p>
         */
        @NameInMap("Topic")
        public UpdateEventStreamingRequestSinkSinkKafkaParametersTopic topic;

        /**
         * <p>The message body content.</p>
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

        public UpdateEventStreamingRequestSinkSinkKafkaParameters setCompressionType(String compressionType) {
            this.compressionType = compressionType;
            return this;
        }
        public String getCompressionType() {
            return this.compressionType;
        }

        public UpdateEventStreamingRequestSinkSinkKafkaParameters setDynamicTopic(UpdateEventStreamingRequestSinkSinkKafkaParametersDynamicTopic dynamicTopic) {
            this.dynamicTopic = dynamicTopic;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkKafkaParametersDynamicTopic getDynamicTopic() {
            return this.dynamicTopic;
        }

        public UpdateEventStreamingRequestSinkSinkKafkaParameters setHeaders(UpdateEventStreamingRequestSinkSinkKafkaParametersHeaders headers) {
            this.headers = headers;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkKafkaParametersHeaders getHeaders() {
            return this.headers;
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
         * <p>The transformation format.</p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template style.</p>
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
         * <p>The event transformation format. Default value: CONSTANT.</p>
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
         * <p>The transformation format. Default value: CONSTANT.</p>
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
         * <p>The name of the queue in Simple Message Queue (formerly MNS).</p>
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
         * <p>The target service type is Simple Message Queue (formerly MNS).</p>
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

    public static class UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParametersBody extends TeaModel {
        /**
         * <p>The transformation format. Default value: CONSTANT.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template style.</p>
         * 
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The raw data value.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;key&quot;: &quot;value&quot;}</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParametersBody build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParametersBody self = new UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParametersBody();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParametersBody setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParametersBody setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParametersBody setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParametersMessageId extends TeaModel {
        /**
         * <p>The transformation format. Default value: CONSTANT.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template style.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The message ID value.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParametersMessageId build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParametersMessageId self = new UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParametersMessageId();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParametersMessageId setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParametersMessageId setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParametersMessageId setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParametersProperties extends TeaModel {
        /**
         * <p>The transformation format. Default value: CONSTANT.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template style.</p>
         * 
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The property content.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;env&quot;: &quot;prod&quot;}</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParametersProperties build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParametersProperties self = new UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParametersProperties();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParametersProperties setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParametersProperties setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParametersProperties setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParametersRoutingKey extends TeaModel {
        /**
         * <p>The transformation format. Default value: CONSTANT.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template style.</p>
         * 
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The routing key value.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Form&quot;: &quot;CONSTANT&quot;, &quot;Value&quot;: &quot;my-routing-key&quot;}</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParametersRoutingKey build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParametersRoutingKey self = new UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParametersRoutingKey();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParametersRoutingKey setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParametersRoutingKey setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParametersRoutingKey setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParameters extends TeaModel {
        /**
         * <p>The authentication type. Valid values:</p>
         * <ul>
         * <li>ACL</li>
         * <li>No configuration required</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACL</p>
         */
        @NameInMap("AuthType")
        public String authType;

        /**
         * <p>The message body content.</p>
         */
        @NameInMap("Body")
        public UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParametersBody body;

        /**
         * <p>The endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.1:9876</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The Exchange name in RabbitMQ. This parameter takes effect when TargetType is set to Exchange.</p>
         * 
         * <strong>example:</strong>
         * <p>my-exchange</p>
         */
        @NameInMap("Exchange")
        public String exchange;

        /**
         * <p>The unique identifier of the message.</p>
         */
        @NameInMap("MessageId")
        public UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParametersMessageId messageId;

        /**
         * <p>The network type. Valid values:</p>
         * <ul>
         * <li>PrivateNetwork</li>
         * <li>PublicNetwork</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PublicNetwork</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The password used to access the RabbitMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The additional properties of the message.</p>
         */
        @NameInMap("Properties")
        public UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParametersProperties properties;

        /**
         * <p>The queue name in RabbitMQ. This parameter takes effect only when TargetType is set to Queue.</p>
         * 
         * <strong>example:</strong>
         * <p>my-queue</p>
         */
        @NameInMap("QueueName")
        public String queueName;

        /**
         * <p>The message routing key.</p>
         */
        @NameInMap("RoutingKey")
        public UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParametersRoutingKey routingKey;

        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-uf6of9452b2pba82c ****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The target type for message delivery. Valid values:</p>
         * <ul>
         * <li><p><strong>Exchange:</strong> Messages are routed through an exchange.</p>
         * </li>
         * <li><p><strong>Queue:</strong> Messages are delivered directly to the specified queue.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Exchange</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        /**
         * <p>The username used to access the RabbitMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("Username")
        public String username;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf6of9452b2pba82c ****</p>
         */
        @NameInMap("VSwitchIds")
        public String vSwitchIds;

        /**
         * <p>The virtual host name of the RabbitMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Vhost1</p>
         */
        @NameInMap("VirtualHostName")
        public String virtualHostName;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf6of9452b2pba82c ****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParameters self = new UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParameters();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParameters setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParameters setBody(UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParametersBody body) {
            this.body = body;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParametersBody getBody() {
            return this.body;
        }

        public UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParameters setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParameters setExchange(String exchange) {
            this.exchange = exchange;
            return this;
        }
        public String getExchange() {
            return this.exchange;
        }

        public UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParameters setMessageId(UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParametersMessageId messageId) {
            this.messageId = messageId;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParametersMessageId getMessageId() {
            return this.messageId;
        }

        public UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParameters setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParameters setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParameters setProperties(UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParametersProperties properties) {
            this.properties = properties;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParametersProperties getProperties() {
            return this.properties;
        }

        public UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParameters setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParameters setRoutingKey(UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParametersRoutingKey routingKey) {
            this.routingKey = routingKey;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParametersRoutingKey getRoutingKey() {
            return this.routingKey;
        }

        public UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParameters setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParameters setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParameters setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParameters setVSwitchIds(String vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public String getVSwitchIds() {
            return this.vSwitchIds;
        }

        public UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParameters setVirtualHostName(String virtualHostName) {
            this.virtualHostName = virtualHostName;
            return this;
        }
        public String getVirtualHostName() {
            return this.virtualHostName;
        }

        public UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParameters setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkPrometheusParametersAuthorizationType extends TeaModel {
        /**
         * <p>The transformation format. Default value: CONSTANT.</p>
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
         * <p>The authorization type.</p>
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
         * <p>The transformation format. Default value: JSONPATH.</p>
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
         * <p>The metric content.</p>
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

    public static class UpdateEventStreamingRequestSinkSinkPrometheusParametersHeaderParameters extends TeaModel {
        /**
         * <p>The transformation format. Valid values:</p>
         * <ul>
         * <li>JSONPATH</li>
         * <li>CONSTANT</li>
         * <li>TEMPLATE</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The HTTP request header template style. This parameter is required when Form is set to TEMPLATE. The event content transformation result must be in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;user_name&quot;:&quot;${name}&quot;
         * }</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value. Valid values:</p>
         * <ul>
         * <li>If Form is CONSTANT: a constant value</li>
         * <li>If Form is JSONPATH: JSONPath extraction content</li>
         * <li>If Form is TEMPLATE: a template variable</li>
         * </ul>
         * <p>Note: The Value field cannot exceed 10240 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkPrometheusParametersHeaderParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkPrometheusParametersHeaderParameters self = new UpdateEventStreamingRequestSinkSinkPrometheusParametersHeaderParameters();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkPrometheusParametersHeaderParameters setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkPrometheusParametersHeaderParameters setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkPrometheusParametersHeaderParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkPrometheusParametersNetworkType extends TeaModel {
        /**
         * <p>The transformation format. Default value: CONSTANT.</p>
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
         * <li>PublicNetwork</li>
         * <li>PrivateNetwork</li>
         * </ul>
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
         * <p>The transformation format. Default value: CONSTANT.</p>
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
         * <p>The transformation format. Default value: CONSTANT.</p>
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
         * <p>The security group ID.</p>
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
         * <p>The transformation format. Default value: CONSTANT.</p>
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
         * <p>The Prometheus Remote Write URL.</p>
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
         * <p>The transformation format. Default value: CONSTANT.</p>
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
         * <p>The transformation format. Default value: CONSTANT.</p>
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
         * <p>The vSwitch ID.</p>
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
         * <p>The transformation format. Default value: CONSTANT.</p>
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
         * <p>VPC ID。</p>
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
         * <p>The authorization type.</p>
         */
        @NameInMap("AuthorizationType")
        public UpdateEventStreamingRequestSinkSinkPrometheusParametersAuthorizationType authorizationType;

        /**
         * <p>The metric content.</p>
         */
        @NameInMap("Data")
        public UpdateEventStreamingRequestSinkSinkPrometheusParametersData data;

        /**
         * <p>The data structure of the request header parameters.</p>
         */
        @NameInMap("HeaderParameters")
        public UpdateEventStreamingRequestSinkSinkPrometheusParametersHeaderParameters headerParameters;

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
         * <p>The security group ID.</p>
         */
        @NameInMap("SecurityGroupId")
        public UpdateEventStreamingRequestSinkSinkPrometheusParametersSecurityGroupId securityGroupId;

        /**
         * <p>The Prometheus Remote Write URL.</p>
         */
        @NameInMap("URL")
        public UpdateEventStreamingRequestSinkSinkPrometheusParametersURL URL;

        /**
         * <p>The username.</p>
         */
        @NameInMap("Username")
        public UpdateEventStreamingRequestSinkSinkPrometheusParametersUsername username;

        /**
         * <p>The vSwitch ID.</p>
         */
        @NameInMap("VSwitchId")
        public UpdateEventStreamingRequestSinkSinkPrometheusParametersVSwitchId vSwitchId;

        /**
         * <p>VPC ID。</p>
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

        public UpdateEventStreamingRequestSinkSinkPrometheusParameters setHeaderParameters(UpdateEventStreamingRequestSinkSinkPrometheusParametersHeaderParameters headerParameters) {
            this.headerParameters = headerParameters;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkPrometheusParametersHeaderParameters getHeaderParameters() {
            return this.headerParameters;
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
         * <p>The transformation format.</p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template style.</p>
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
         * <p>The transformation format. Default value: CONSTANT.</p>
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
         * <p>The name of the Exchange of the ApsaraMQ for RabbitMQ instance.</p>
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
         * <p>The transformation format. Default value: CONSTANT.</p>
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
         * <p>The instance ID of ApsaraMQ for RabbitMQ.</p>
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
         * <p>The transformation format.</p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template style.</p>
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
         * <p>The transformation format.</p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template style.</p>
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
         * <p>The transformation format. Default value: CONSTANT.</p>
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
         * <p>The name of the queue of the instance.</p>
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
         * <p>The transformation format. Default value: CONSTANT.</p>
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
         * <p>The routing rule of the message.</p>
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
         * <p>The transformation format. Default value: CONSTANT.</p>
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
         * <p>The target type. Valid values:</p>
         * <ul>
         * <li>Exchange: Exchange mode.</li>
         * <li>Queue: Queue mode.</li>
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
         * <p>The transformation format. Default value: CONSTANT.</p>
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
         * <p>The name of the vhost of the ApsaraMQ for RabbitMQ instance.</p>
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
         * <p>The Exchange mode. This parameter is required only when TargetType is set to Exchange.</p>
         */
        @NameInMap("Exchange")
        public UpdateEventStreamingRequestSinkSinkRabbitMQParametersExchange exchange;

        /**
         * <p>The target service type is ApsaraMQ for RabbitMQ.</p>
         */
        @NameInMap("InstanceId")
        public UpdateEventStreamingRequestSinkSinkRabbitMQParametersInstanceId instanceId;

        /**
         * <p>The message ID.</p>
         */
        @NameInMap("MessageId")
        public UpdateEventStreamingRequestSinkSinkRabbitMQParametersMessageId messageId;

        /**
         * <p>The filter properties.</p>
         */
        @NameInMap("Properties")
        public UpdateEventStreamingRequestSinkSinkRabbitMQParametersProperties properties;

        /**
         * <p>The Queue mode. This parameter is required only when TargetType is set to Queue.</p>
         */
        @NameInMap("QueueName")
        public UpdateEventStreamingRequestSinkSinkRabbitMQParametersQueueName queueName;

        /**
         * <p>The routing rule of the message. This parameter is required only when TargetType is set to Exchange.</p>
         */
        @NameInMap("RoutingKey")
        public UpdateEventStreamingRequestSinkSinkRabbitMQParametersRoutingKey routingKey;

        /**
         * <p>The target type.</p>
         */
        @NameInMap("TargetType")
        public UpdateEventStreamingRequestSinkSinkRabbitMQParametersTargetType targetType;

        /**
         * <p>The name of the vhost of the ApsaraMQ for RabbitMQ instance.</p>
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

    public static class UpdateEventStreamingRequestSinkSinkRocketMQCheckpointParametersConsumeTimestamp extends TeaModel {
        /**
         * <p>The transformation format. Default value: CONSTANT.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template style.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1570761026400</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkRocketMQCheckpointParametersConsumeTimestamp build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkRocketMQCheckpointParametersConsumeTimestamp self = new UpdateEventStreamingRequestSinkSinkRocketMQCheckpointParametersConsumeTimestamp();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQCheckpointParametersConsumeTimestamp setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQCheckpointParametersConsumeTimestamp setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQCheckpointParametersConsumeTimestamp setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkRocketMQCheckpointParametersGroup extends TeaModel {
        /**
         * <p>The transformation format. Default value: CONSTANT.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template style.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>Group ID</p>
         * 
         * <strong>example:</strong>
         * <p>GID_EVENTBRIDGE_1736234******</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkRocketMQCheckpointParametersGroup build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkRocketMQCheckpointParametersGroup self = new UpdateEventStreamingRequestSinkSinkRocketMQCheckpointParametersGroup();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQCheckpointParametersGroup setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQCheckpointParametersGroup setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQCheckpointParametersGroup setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkRocketMQCheckpointParametersTopic extends TeaModel {
        /**
         * <p>The transformation format. Default value: CONSTANT.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template style.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The topic name of the ApsaraMQ for RocketMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Mytopic</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkRocketMQCheckpointParametersTopic build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkRocketMQCheckpointParametersTopic self = new UpdateEventStreamingRequestSinkSinkRocketMQCheckpointParametersTopic();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQCheckpointParametersTopic setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQCheckpointParametersTopic setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQCheckpointParametersTopic setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkRocketMQCheckpointParameters extends TeaModel {
        /**
         * <p>The timestamp of message consumption.</p>
         */
        @NameInMap("ConsumeTimestamp")
        public UpdateEventStreamingRequestSinkSinkRocketMQCheckpointParametersConsumeTimestamp consumeTimestamp;

        /**
         * <p>The Group ID of the consumer group.</p>
         */
        @NameInMap("Group")
        public UpdateEventStreamingRequestSinkSinkRocketMQCheckpointParametersGroup group;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>MQ_INST_164901546557****_BAAN****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The instance type. Valid values:</p>
         * <ul>
         * <li>Cloud_4: Alibaba Cloud RocketMQ 4.0 instance</li>
         * <li>Cloud_5: Alibaba Cloud RocketMQ 5.0 instance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Cloud_4</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The topic of the ApsaraMQ for RocketMQ instance.</p>
         */
        @NameInMap("Topic")
        public UpdateEventStreamingRequestSinkSinkRocketMQCheckpointParametersTopic topic;

        public static UpdateEventStreamingRequestSinkSinkRocketMQCheckpointParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkRocketMQCheckpointParameters self = new UpdateEventStreamingRequestSinkSinkRocketMQCheckpointParameters();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQCheckpointParameters setConsumeTimestamp(UpdateEventStreamingRequestSinkSinkRocketMQCheckpointParametersConsumeTimestamp consumeTimestamp) {
            this.consumeTimestamp = consumeTimestamp;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkRocketMQCheckpointParametersConsumeTimestamp getConsumeTimestamp() {
            return this.consumeTimestamp;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQCheckpointParameters setGroup(UpdateEventStreamingRequestSinkSinkRocketMQCheckpointParametersGroup group) {
            this.group = group;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkRocketMQCheckpointParametersGroup getGroup() {
            return this.group;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQCheckpointParameters setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQCheckpointParameters setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQCheckpointParameters setTopic(UpdateEventStreamingRequestSinkSinkRocketMQCheckpointParametersTopic topic) {
            this.topic = topic;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkRocketMQCheckpointParametersTopic getTopic() {
            return this.topic;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkRocketMQParametersBody extends TeaModel {
        /**
         * <p>The transformation format.</p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template style.</p>
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

    public static class UpdateEventStreamingRequestSinkSinkRocketMQParametersDeliveryOrderType extends TeaModel {
        /**
         * <p>The transformation format. Default value: CONSTANT.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template style.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The delivery order type. Valid values:</p>
         * <ul>
         * <li><strong>Orderly:</strong> ordered delivery</li>
         * <li><strong>Concurrently:</strong> concurrent delivery</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Concurrently</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkRocketMQParametersDeliveryOrderType build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkRocketMQParametersDeliveryOrderType self = new UpdateEventStreamingRequestSinkSinkRocketMQParametersDeliveryOrderType();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParametersDeliveryOrderType setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParametersDeliveryOrderType setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParametersDeliveryOrderType setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkRocketMQParametersInstanceEndpoint extends TeaModel {
        /**
         * <p>The transformation format. Default value: CONSTANT.</p>
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
         * <p>The instance endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>vbr-8vbsvkkbpf3vb0zef****</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkRocketMQParametersInstanceEndpoint build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkRocketMQParametersInstanceEndpoint self = new UpdateEventStreamingRequestSinkSinkRocketMQParametersInstanceEndpoint();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParametersInstanceEndpoint setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParametersInstanceEndpoint setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParametersInstanceEndpoint setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkRocketMQParametersInstanceId extends TeaModel {
        /**
         * <p>The transformation format. Default value: CONSTANT.</p>
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
         * <p>The instance ID of ApsaraMQ for RocketMQ.</p>
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

    public static class UpdateEventStreamingRequestSinkSinkRocketMQParametersInstancePassword extends TeaModel {
        /**
         * <p>The transformation format. Default value: CONSTANT.</p>
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
         * <p>The instance password.</p>
         * 
         * <strong>example:</strong>
         * <p>admin****</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkRocketMQParametersInstancePassword build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkRocketMQParametersInstancePassword self = new UpdateEventStreamingRequestSinkSinkRocketMQParametersInstancePassword();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParametersInstancePassword setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParametersInstancePassword setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParametersInstancePassword setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkRocketMQParametersInstanceType extends TeaModel {
        /**
         * <p>The transformation format. Default value: CONSTANT.</p>
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
         * <p>The instance type. Valid values:</p>
         * <ul>
         * <li>Cloud_4: Alibaba Cloud RocketMQ 4.0 instance (default)</li>
         * <li>Cloud_5: Alibaba Cloud RocketMQ 5.0 instance</li>
         * <li>SelfBuilt: self-managed Apache RocketMQ cluster</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Cloud_4</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkRocketMQParametersInstanceType build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkRocketMQParametersInstanceType self = new UpdateEventStreamingRequestSinkSinkRocketMQParametersInstanceType();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParametersInstanceType setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParametersInstanceType setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParametersInstanceType setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkRocketMQParametersInstanceUsername extends TeaModel {
        /**
         * <p>The transformation format. Default value: CONSTANT.</p>
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
         * <p>The instance username.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkRocketMQParametersInstanceUsername build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkRocketMQParametersInstanceUsername self = new UpdateEventStreamingRequestSinkSinkRocketMQParametersInstanceUsername();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParametersInstanceUsername setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParametersInstanceUsername setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParametersInstanceUsername setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkRocketMQParametersKeys extends TeaModel {
        /**
         * <p>The transformation format.</p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template style.</p>
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

    public static class UpdateEventStreamingRequestSinkSinkRocketMQParametersNetwork extends TeaModel {
        /**
         * <p>The transformation format. Default value: CONSTANT.</p>
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
         * <li>PublicNetwork</li>
         * <li>PrivateNetwork</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PublicNetwork</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkRocketMQParametersNetwork build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkRocketMQParametersNetwork self = new UpdateEventStreamingRequestSinkSinkRocketMQParametersNetwork();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParametersNetwork setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParametersNetwork setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParametersNetwork setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkRocketMQParametersProperties extends TeaModel {
        /**
         * <p>The transformation format.</p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template style.</p>
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

    public static class UpdateEventStreamingRequestSinkSinkRocketMQParametersSecurityGroupId extends TeaModel {
        /**
         * <p>The transformation format. Default value: CONSTANT.</p>
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
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>b4bf375515f6440f942e3a20c33d****</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkRocketMQParametersSecurityGroupId build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkRocketMQParametersSecurityGroupId self = new UpdateEventStreamingRequestSinkSinkRocketMQParametersSecurityGroupId();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParametersSecurityGroupId setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParametersSecurityGroupId setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParametersSecurityGroupId setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkRocketMQParametersShardingKey extends TeaModel {
        /**
         * <p>The transformation format. Default value: CONSTANT.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template style.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The sharding key value.</p>
         * 
         * <strong>example:</strong>
         * <p>order_id</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkRocketMQParametersShardingKey build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkRocketMQParametersShardingKey self = new UpdateEventStreamingRequestSinkSinkRocketMQParametersShardingKey();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParametersShardingKey setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParametersShardingKey setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParametersShardingKey setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkRocketMQParametersTags extends TeaModel {
        /**
         * <p>The transformation format.</p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template style.</p>
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
         * <p>The transformation format. Default value: CONSTANT.</p>
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
         * <p>The topic of the ApsaraMQ for RocketMQ instance.</p>
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

    public static class UpdateEventStreamingRequestSinkSinkRocketMQParametersVSwitchIds extends TeaModel {
        /**
         * <p>The transformation format. Default value: CONSTANT.</p>
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
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vbr-8vb835n3zf9shwl****mp</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkRocketMQParametersVSwitchIds build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkRocketMQParametersVSwitchIds self = new UpdateEventStreamingRequestSinkSinkRocketMQParametersVSwitchIds();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParametersVSwitchIds setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParametersVSwitchIds setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParametersVSwitchIds setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkRocketMQParametersVpcId extends TeaModel {
        /**
         * <p>The event transformation format. Default value: CONSTANT.</p>
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
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vbr-8vb835n3zf9shwlvb****</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkRocketMQParametersVpcId build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkRocketMQParametersVpcId self = new UpdateEventStreamingRequestSinkSinkRocketMQParametersVpcId();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParametersVpcId setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParametersVpcId setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParametersVpcId setValue(String value) {
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
         * <p>The delivery order type of the message. This parameter is optional. Default value: concurrent delivery.</p>
         */
        @NameInMap("DeliveryOrderType")
        public UpdateEventStreamingRequestSinkSinkRocketMQParametersDeliveryOrderType deliveryOrderType;

        /**
         * <p>The instance endpoint.</p>
         */
        @NameInMap("InstanceEndpoint")
        public UpdateEventStreamingRequestSinkSinkRocketMQParametersInstanceEndpoint instanceEndpoint;

        /**
         * <p>The target service type is ApsaraMQ for RocketMQ.</p>
         */
        @NameInMap("InstanceId")
        public UpdateEventStreamingRequestSinkSinkRocketMQParametersInstanceId instanceId;

        /**
         * <p>The instance password.</p>
         */
        @NameInMap("InstancePassword")
        public UpdateEventStreamingRequestSinkSinkRocketMQParametersInstancePassword instancePassword;

        /**
         * <p>The instance type.</p>
         */
        @NameInMap("InstanceType")
        public UpdateEventStreamingRequestSinkSinkRocketMQParametersInstanceType instanceType;

        /**
         * <p>The instance username.</p>
         */
        @NameInMap("InstanceUsername")
        public UpdateEventStreamingRequestSinkSinkRocketMQParametersInstanceUsername instanceUsername;

        /**
         * <p>The filter properties.</p>
         */
        @NameInMap("Keys")
        public UpdateEventStreamingRequestSinkSinkRocketMQParametersKeys keys;

        /**
         * <p>The network type. Valid values:</p>
         * <ul>
         * <li>PublicNetwork</li>
         * <li>PrivateNetwork</li>
         * </ul>
         */
        @NameInMap("Network")
        public UpdateEventStreamingRequestSinkSinkRocketMQParametersNetwork network;

        /**
         * <p>The filter properties.</p>
         */
        @NameInMap("Properties")
        public UpdateEventStreamingRequestSinkSinkRocketMQParametersProperties properties;

        /**
         * <p>The security group ID.</p>
         */
        @NameInMap("SecurityGroupId")
        public UpdateEventStreamingRequestSinkSinkRocketMQParametersSecurityGroupId securityGroupId;

        /**
         * <p>The sharding key of the message.</p>
         * <blockquote>
         * <p>When DeliveryOrderType is set to Orderly, this parameter specifies the event content transformation rule for the ShardingKey property when writing messages downstream. When Source is RocketMQ, ShardingKey can be empty. In this case, the upstream BrokerName and QueueId are concatenated to generate the message ShardingKey.</p>
         * </blockquote>
         */
        @NameInMap("ShardingKey")
        public UpdateEventStreamingRequestSinkSinkRocketMQParametersShardingKey shardingKey;

        /**
         * <p>The filter properties.</p>
         */
        @NameInMap("Tags")
        public UpdateEventStreamingRequestSinkSinkRocketMQParametersTags tags;

        /**
         * <p>The topic of the ApsaraMQ for RocketMQ instance.</p>
         */
        @NameInMap("Topic")
        public UpdateEventStreamingRequestSinkSinkRocketMQParametersTopic topic;

        /**
         * <p>The vSwitch ID.</p>
         */
        @NameInMap("VSwitchIds")
        public UpdateEventStreamingRequestSinkSinkRocketMQParametersVSwitchIds vSwitchIds;

        /**
         * <p>The VPC ID.</p>
         */
        @NameInMap("VpcId")
        public UpdateEventStreamingRequestSinkSinkRocketMQParametersVpcId vpcId;

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

        public UpdateEventStreamingRequestSinkSinkRocketMQParameters setDeliveryOrderType(UpdateEventStreamingRequestSinkSinkRocketMQParametersDeliveryOrderType deliveryOrderType) {
            this.deliveryOrderType = deliveryOrderType;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkRocketMQParametersDeliveryOrderType getDeliveryOrderType() {
            return this.deliveryOrderType;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParameters setInstanceEndpoint(UpdateEventStreamingRequestSinkSinkRocketMQParametersInstanceEndpoint instanceEndpoint) {
            this.instanceEndpoint = instanceEndpoint;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkRocketMQParametersInstanceEndpoint getInstanceEndpoint() {
            return this.instanceEndpoint;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParameters setInstanceId(UpdateEventStreamingRequestSinkSinkRocketMQParametersInstanceId instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkRocketMQParametersInstanceId getInstanceId() {
            return this.instanceId;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParameters setInstancePassword(UpdateEventStreamingRequestSinkSinkRocketMQParametersInstancePassword instancePassword) {
            this.instancePassword = instancePassword;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkRocketMQParametersInstancePassword getInstancePassword() {
            return this.instancePassword;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParameters setInstanceType(UpdateEventStreamingRequestSinkSinkRocketMQParametersInstanceType instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkRocketMQParametersInstanceType getInstanceType() {
            return this.instanceType;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParameters setInstanceUsername(UpdateEventStreamingRequestSinkSinkRocketMQParametersInstanceUsername instanceUsername) {
            this.instanceUsername = instanceUsername;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkRocketMQParametersInstanceUsername getInstanceUsername() {
            return this.instanceUsername;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParameters setKeys(UpdateEventStreamingRequestSinkSinkRocketMQParametersKeys keys) {
            this.keys = keys;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkRocketMQParametersKeys getKeys() {
            return this.keys;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParameters setNetwork(UpdateEventStreamingRequestSinkSinkRocketMQParametersNetwork network) {
            this.network = network;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkRocketMQParametersNetwork getNetwork() {
            return this.network;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParameters setProperties(UpdateEventStreamingRequestSinkSinkRocketMQParametersProperties properties) {
            this.properties = properties;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkRocketMQParametersProperties getProperties() {
            return this.properties;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParameters setSecurityGroupId(UpdateEventStreamingRequestSinkSinkRocketMQParametersSecurityGroupId securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkRocketMQParametersSecurityGroupId getSecurityGroupId() {
            return this.securityGroupId;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParameters setShardingKey(UpdateEventStreamingRequestSinkSinkRocketMQParametersShardingKey shardingKey) {
            this.shardingKey = shardingKey;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkRocketMQParametersShardingKey getShardingKey() {
            return this.shardingKey;
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

        public UpdateEventStreamingRequestSinkSinkRocketMQParameters setVSwitchIds(UpdateEventStreamingRequestSinkSinkRocketMQParametersVSwitchIds vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkRocketMQParametersVSwitchIds getVSwitchIds() {
            return this.vSwitchIds;
        }

        public UpdateEventStreamingRequestSinkSinkRocketMQParameters setVpcId(UpdateEventStreamingRequestSinkSinkRocketMQParametersVpcId vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkRocketMQParametersVpcId getVpcId() {
            return this.vpcId;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkSLSParametersBody extends TeaModel {
        /**
         * <p>The transformation format.</p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template style.</p>
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

    public static class UpdateEventStreamingRequestSinkSinkSLSParametersContentSchema extends TeaModel {
        /**
         * <p>The transformation format.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template style.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The custom key-value pairs.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Key_1&quot;:{&quot;form&quot;:&quot;CONSTANT&quot;,&quot;value&quot;:&quot;demoKey&quot;},&quot;Value_1&quot;:{&quot;form&quot;:&quot;JSONPATH&quot;,&quot;value&quot;:&quot;$.data.value&quot;}}</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkSLSParametersContentSchema build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkSLSParametersContentSchema self = new UpdateEventStreamingRequestSinkSinkSLSParametersContentSchema();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkSLSParametersContentSchema setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkSLSParametersContentSchema setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkSLSParametersContentSchema setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkSLSParametersContentType extends TeaModel {
        /**
         * <p>The transformation format.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template style.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The SLS data format.</p>
         * 
         * <strong>example:</strong>
         * <p>JSON</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateEventStreamingRequestSinkSinkSLSParametersContentType build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSinkSinkSLSParametersContentType self = new UpdateEventStreamingRequestSinkSinkSLSParametersContentType();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSinkSinkSLSParametersContentType setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public UpdateEventStreamingRequestSinkSinkSLSParametersContentType setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateEventStreamingRequestSinkSinkSLSParametersContentType setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEventStreamingRequestSinkSinkSLSParametersLogStore extends TeaModel {
        /**
         * <p>The transformation format. Default value: CONSTANT.</p>
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
         * <p>The Logstore of Simple Log Service (SLS).</p>
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
         * <p>The transformation format. Default value: CONSTANT.</p>
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
         * <p>The log project of Simple Log Service (SLS).</p>
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
         * <p>The transformation format. Default value: CONSTANT.</p>
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
         * <p>The role name used to authorize the event bus EventBridge to read SLS log content. When creating the role in the Resource Access Management (RAM) console, select &quot;Alibaba Cloud Service&quot; and set &quot;Trusted Service&quot; to &quot;EventBridge&quot;.</p>
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
         * <p>The transformation format. Default value: CONSTANT.</p>
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
         * <p>The topic where the log resides, corresponding to the SLS reserved field &quot;topic&quot;.</p>
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
         * <p>The content sent to SLS.</p>
         */
        @NameInMap("Body")
        public UpdateEventStreamingRequestSinkSinkSLSParametersBody body;

        /**
         * <p>The custom log key-value pairs. This parameter takes effect only when ContentType is set to KeyValue. Each key-value pair is represented by Key_n and Value_n.</p>
         */
        @NameInMap("ContentSchema")
        public UpdateEventStreamingRequestSinkSinkSLSParametersContentSchema contentSchema;

        /**
         * <p>The SLS data format. You can select the default format or configure specified key-value pairs. Valid values:</p>
         * <ul>
         * <li>JSON</li>
         * <li>KeyValue</li>
         * </ul>
         */
        @NameInMap("ContentType")
        public UpdateEventStreamingRequestSinkSinkSLSParametersContentType contentType;

        /**
         * <p>The Logstore of Simple Log Service (SLS).</p>
         */
        @NameInMap("LogStore")
        public UpdateEventStreamingRequestSinkSinkSLSParametersLogStore logStore;

        /**
         * <p>The log project of Simple Log Service (SLS).</p>
         */
        @NameInMap("Project")
        public UpdateEventStreamingRequestSinkSinkSLSParametersProject project;

        /**
         * <p>The role name used to authorize the event bus EventBridge to read SLS log content. When creating the role in the Resource Access Management (RAM) console, select &quot;Alibaba Cloud Service&quot; and set &quot;Trusted Service&quot; to &quot;EventBridge&quot;.</p>
         */
        @NameInMap("RoleName")
        public UpdateEventStreamingRequestSinkSinkSLSParametersRoleName roleName;

        /**
         * <p>The topic where the log resides, corresponding to the SLS reserved field &quot;topic&quot;.</p>
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

        public UpdateEventStreamingRequestSinkSinkSLSParameters setContentSchema(UpdateEventStreamingRequestSinkSinkSLSParametersContentSchema contentSchema) {
            this.contentSchema = contentSchema;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkSLSParametersContentSchema getContentSchema() {
            return this.contentSchema;
        }

        public UpdateEventStreamingRequestSinkSinkSLSParameters setContentType(UpdateEventStreamingRequestSinkSinkSLSParametersContentType contentType) {
            this.contentType = contentType;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkSLSParametersContentType getContentType() {
            return this.contentType;
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
        @NameInMap("SinkAgentRunParameters")
        public SinkAgentRunParameters sinkAgentRunParameters;

        /**
         * <p>The description.</p>
         */
        @NameInMap("SinkApacheKafkaParameters")
        public UpdateEventStreamingRequestSinkSinkApacheKafkaParameters sinkApacheKafkaParameters;

        /**
         * <p>Sink Apache RocketMQ Checkpoint Parameters</p>
         */
        @NameInMap("SinkApacheRocketMQCheckpointParameters")
        public UpdateEventStreamingRequestSinkSinkApacheRocketMQCheckpointParameters sinkApacheRocketMQCheckpointParameters;

        /**
         * <p>The ApiDestination target parameters.</p>
         */
        @NameInMap("SinkApiDestinationParameters")
        public SinkApiDestinationParameters sinkApiDestinationParameters;

        /**
         * <p>Sink BaiLian Parameters</p>
         */
        @NameInMap("SinkBaiLianParameters")
        public SinkBaiLianParameters sinkBaiLianParameters;

        /**
         * <p>The Sink Kafka connector parameters.</p>
         */
        @NameInMap("SinkCustomizedKafkaConnectorParameters")
        public UpdateEventStreamingRequestSinkSinkCustomizedKafkaConnectorParameters sinkCustomizedKafkaConnectorParameters;

        /**
         * <p>The Sink Kafka parameters.</p>
         */
        @NameInMap("SinkCustomizedKafkaParameters")
        public UpdateEventStreamingRequestSinkSinkCustomizedKafkaParameters sinkCustomizedKafkaParameters;

        /**
         * <p>The Sink DashVector parameters.</p>
         */
        @NameInMap("SinkDashVectorParameters")
        public UpdateEventStreamingRequestSinkSinkDashVectorParameters sinkDashVectorParameters;

        /**
         * <p>The Sink DataHub parameters.</p>
         */
        @NameInMap("SinkDataHubParameters")
        public UpdateEventStreamingRequestSinkSinkDataHubParameters sinkDataHubParameters;

        @NameInMap("SinkDataWorksTriggerParameters")
        public SinkDataWorksTriggerParameters sinkDataWorksTriggerParameters;

        /**
         * <p>The event source type.</p>
         */
        @NameInMap("SinkDorisParameters")
        public UpdateEventStreamingRequestSinkSinkDorisParameters sinkDorisParameters;

        /**
         * <p>The event target name.</p>
         */
        @NameInMap("SinkEventHouseParameters")
        public UpdateEventStreamingRequestSinkSinkEventHouseParameters sinkEventHouseParameters;

        /**
         * <p>The function target.</p>
         */
        @NameInMap("SinkFcParameters")
        public UpdateEventStreamingRequestSinkSinkFcParameters sinkFcParameters;

        /**
         * <p>The Sink Fnf parameters.</p>
         */
        @NameInMap("SinkFnfParameters")
        public UpdateEventStreamingRequestSinkSinkFnfParameters sinkFnfParameters;

        /**
         * <p>The HTTPS target parameters.</p>
         */
        @NameInMap("SinkHttpsParameters")
        public SinkHttpsParameters sinkHttpsParameters;

        /**
         * <p>The Sink Kafka parameters.</p>
         */
        @NameInMap("SinkKafkaParameters")
        public UpdateEventStreamingRequestSinkSinkKafkaParameters sinkKafkaParameters;

        /**
         * <p>The Simple Message Queue (formerly MNS) event target.</p>
         */
        @NameInMap("SinkMNSParameters")
        public UpdateEventStreamingRequestSinkSinkMNSParameters sinkMNSParameters;

        @NameInMap("SinkMQTTParameters")
        public SinkMQTTParameters sinkMQTTParameters;

        @NameInMap("SinkOSSParameters")
        public SinkOSSParameters sinkOSSParameters;

        /**
         * <p>Sink Open Source RabbitMQ Parameters</p>
         */
        @NameInMap("SinkOpenSourceRabbitMQParameters")
        public UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParameters sinkOpenSourceRabbitMQParameters;

        /**
         * <p>The Sink Prometheus parameters.</p>
         */
        @NameInMap("SinkPrometheusParameters")
        public UpdateEventStreamingRequestSinkSinkPrometheusParameters sinkPrometheusParameters;

        @NameInMap("SinkRabbitMQMetaParameters")
        public SinkRabbitMQMetaParameters sinkRabbitMQMetaParameters;

        @NameInMap("SinkRabbitMQMsgSyncParameters")
        public SinkRabbitMQMsgSyncParameters sinkRabbitMQMsgSyncParameters;

        /**
         * <p>The Sink RabbitMQ parameters.</p>
         */
        @NameInMap("SinkRabbitMQParameters")
        public UpdateEventStreamingRequestSinkSinkRabbitMQParameters sinkRabbitMQParameters;

        /**
         * <p>Sink RocketMQ Checkpoint Parameters</p>
         */
        @NameInMap("SinkRocketMQCheckpointParameters")
        public UpdateEventStreamingRequestSinkSinkRocketMQCheckpointParameters sinkRocketMQCheckpointParameters;

        /**
         * <p>Sink RocketMQ Parameters</p>
         */
        @NameInMap("SinkRocketMQParameters")
        public UpdateEventStreamingRequestSinkSinkRocketMQParameters sinkRocketMQParameters;

        /**
         * <p>Sink SLS Parameters</p>
         */
        @NameInMap("SinkSLSParameters")
        public UpdateEventStreamingRequestSinkSinkSLSParameters sinkSLSParameters;

        public static UpdateEventStreamingRequestSink build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSink self = new UpdateEventStreamingRequestSink();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSink setSinkAgentRunParameters(SinkAgentRunParameters sinkAgentRunParameters) {
            this.sinkAgentRunParameters = sinkAgentRunParameters;
            return this;
        }
        public SinkAgentRunParameters getSinkAgentRunParameters() {
            return this.sinkAgentRunParameters;
        }

        public UpdateEventStreamingRequestSink setSinkApacheKafkaParameters(UpdateEventStreamingRequestSinkSinkApacheKafkaParameters sinkApacheKafkaParameters) {
            this.sinkApacheKafkaParameters = sinkApacheKafkaParameters;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkApacheKafkaParameters getSinkApacheKafkaParameters() {
            return this.sinkApacheKafkaParameters;
        }

        public UpdateEventStreamingRequestSink setSinkApacheRocketMQCheckpointParameters(UpdateEventStreamingRequestSinkSinkApacheRocketMQCheckpointParameters sinkApacheRocketMQCheckpointParameters) {
            this.sinkApacheRocketMQCheckpointParameters = sinkApacheRocketMQCheckpointParameters;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkApacheRocketMQCheckpointParameters getSinkApacheRocketMQCheckpointParameters() {
            return this.sinkApacheRocketMQCheckpointParameters;
        }

        public UpdateEventStreamingRequestSink setSinkApiDestinationParameters(SinkApiDestinationParameters sinkApiDestinationParameters) {
            this.sinkApiDestinationParameters = sinkApiDestinationParameters;
            return this;
        }
        public SinkApiDestinationParameters getSinkApiDestinationParameters() {
            return this.sinkApiDestinationParameters;
        }

        public UpdateEventStreamingRequestSink setSinkBaiLianParameters(SinkBaiLianParameters sinkBaiLianParameters) {
            this.sinkBaiLianParameters = sinkBaiLianParameters;
            return this;
        }
        public SinkBaiLianParameters getSinkBaiLianParameters() {
            return this.sinkBaiLianParameters;
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

        public UpdateEventStreamingRequestSink setSinkDashVectorParameters(UpdateEventStreamingRequestSinkSinkDashVectorParameters sinkDashVectorParameters) {
            this.sinkDashVectorParameters = sinkDashVectorParameters;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkDashVectorParameters getSinkDashVectorParameters() {
            return this.sinkDashVectorParameters;
        }

        public UpdateEventStreamingRequestSink setSinkDataHubParameters(UpdateEventStreamingRequestSinkSinkDataHubParameters sinkDataHubParameters) {
            this.sinkDataHubParameters = sinkDataHubParameters;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkDataHubParameters getSinkDataHubParameters() {
            return this.sinkDataHubParameters;
        }

        public UpdateEventStreamingRequestSink setSinkDataWorksTriggerParameters(SinkDataWorksTriggerParameters sinkDataWorksTriggerParameters) {
            this.sinkDataWorksTriggerParameters = sinkDataWorksTriggerParameters;
            return this;
        }
        public SinkDataWorksTriggerParameters getSinkDataWorksTriggerParameters() {
            return this.sinkDataWorksTriggerParameters;
        }

        public UpdateEventStreamingRequestSink setSinkDorisParameters(UpdateEventStreamingRequestSinkSinkDorisParameters sinkDorisParameters) {
            this.sinkDorisParameters = sinkDorisParameters;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkDorisParameters getSinkDorisParameters() {
            return this.sinkDorisParameters;
        }

        public UpdateEventStreamingRequestSink setSinkEventHouseParameters(UpdateEventStreamingRequestSinkSinkEventHouseParameters sinkEventHouseParameters) {
            this.sinkEventHouseParameters = sinkEventHouseParameters;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkEventHouseParameters getSinkEventHouseParameters() {
            return this.sinkEventHouseParameters;
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

        public UpdateEventStreamingRequestSink setSinkHttpsParameters(SinkHttpsParameters sinkHttpsParameters) {
            this.sinkHttpsParameters = sinkHttpsParameters;
            return this;
        }
        public SinkHttpsParameters getSinkHttpsParameters() {
            return this.sinkHttpsParameters;
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

        public UpdateEventStreamingRequestSink setSinkMQTTParameters(SinkMQTTParameters sinkMQTTParameters) {
            this.sinkMQTTParameters = sinkMQTTParameters;
            return this;
        }
        public SinkMQTTParameters getSinkMQTTParameters() {
            return this.sinkMQTTParameters;
        }

        public UpdateEventStreamingRequestSink setSinkOSSParameters(SinkOSSParameters sinkOSSParameters) {
            this.sinkOSSParameters = sinkOSSParameters;
            return this;
        }
        public SinkOSSParameters getSinkOSSParameters() {
            return this.sinkOSSParameters;
        }

        public UpdateEventStreamingRequestSink setSinkOpenSourceRabbitMQParameters(UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParameters sinkOpenSourceRabbitMQParameters) {
            this.sinkOpenSourceRabbitMQParameters = sinkOpenSourceRabbitMQParameters;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkOpenSourceRabbitMQParameters getSinkOpenSourceRabbitMQParameters() {
            return this.sinkOpenSourceRabbitMQParameters;
        }

        public UpdateEventStreamingRequestSink setSinkPrometheusParameters(UpdateEventStreamingRequestSinkSinkPrometheusParameters sinkPrometheusParameters) {
            this.sinkPrometheusParameters = sinkPrometheusParameters;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkPrometheusParameters getSinkPrometheusParameters() {
            return this.sinkPrometheusParameters;
        }

        public UpdateEventStreamingRequestSink setSinkRabbitMQMetaParameters(SinkRabbitMQMetaParameters sinkRabbitMQMetaParameters) {
            this.sinkRabbitMQMetaParameters = sinkRabbitMQMetaParameters;
            return this;
        }
        public SinkRabbitMQMetaParameters getSinkRabbitMQMetaParameters() {
            return this.sinkRabbitMQMetaParameters;
        }

        public UpdateEventStreamingRequestSink setSinkRabbitMQMsgSyncParameters(SinkRabbitMQMsgSyncParameters sinkRabbitMQMsgSyncParameters) {
            this.sinkRabbitMQMsgSyncParameters = sinkRabbitMQMsgSyncParameters;
            return this;
        }
        public SinkRabbitMQMsgSyncParameters getSinkRabbitMQMsgSyncParameters() {
            return this.sinkRabbitMQMsgSyncParameters;
        }

        public UpdateEventStreamingRequestSink setSinkRabbitMQParameters(UpdateEventStreamingRequestSinkSinkRabbitMQParameters sinkRabbitMQParameters) {
            this.sinkRabbitMQParameters = sinkRabbitMQParameters;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkRabbitMQParameters getSinkRabbitMQParameters() {
            return this.sinkRabbitMQParameters;
        }

        public UpdateEventStreamingRequestSink setSinkRocketMQCheckpointParameters(UpdateEventStreamingRequestSinkSinkRocketMQCheckpointParameters sinkRocketMQCheckpointParameters) {
            this.sinkRocketMQCheckpointParameters = sinkRocketMQCheckpointParameters;
            return this;
        }
        public UpdateEventStreamingRequestSinkSinkRocketMQCheckpointParameters getSinkRocketMQCheckpointParameters() {
            return this.sinkRocketMQCheckpointParameters;
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

    public static class UpdateEventStreamingRequestSourceSourceApacheKafkaParametersSslKeystoreKey extends TeaModel {
        /**
         * <p>[Required] The KMS resource ARN that stores the SSL private key. Used to locate the Key Management Service instance that stores the client private key. Format example: \&quot;acs:kms:cn-hangzhou:123456789:secret/ssl-keystore-key-xxxx\&quot;. Obtain this value from the ARN information of the corresponding key in the KMS console.</p>
         */
        @NameInMap("KmsArn")
        public String kmsArn;

        /**
         * <p>[KMS KV mode] The key name in the KMS credential. When the KMS credential is stored as a key-value (KV) structure, specify this parameter to indicate the key corresponding to the SSL private key. Example: if the KMS credential is \&quot;{&quot;ssl_keystore_key&quot;:&quot;-----BEGIN PRIVATE KEY-----...&quot;,&quot;ssl_truststore_key&quot;:&quot;...&quot;}\&quot;, enter \&quot;ssl_keystore_key\&quot;. Leave empty if the KMS credential is in plain text mode (directly stores the PEM content of the private key).</p>
         */
        @NameInMap("KmsSecretValueKey")
        public String kmsSecretValueKey;

        public static UpdateEventStreamingRequestSourceSourceApacheKafkaParametersSslKeystoreKey build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSourceSourceApacheKafkaParametersSslKeystoreKey self = new UpdateEventStreamingRequestSourceSourceApacheKafkaParametersSslKeystoreKey();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSourceSourceApacheKafkaParametersSslKeystoreKey setKmsArn(String kmsArn) {
            this.kmsArn = kmsArn;
            return this;
        }
        public String getKmsArn() {
            return this.kmsArn;
        }

        public UpdateEventStreamingRequestSourceSourceApacheKafkaParametersSslKeystoreKey setKmsSecretValueKey(String kmsSecretValueKey) {
            this.kmsSecretValueKey = kmsSecretValueKey;
            return this;
        }
        public String getKmsSecretValueKey() {
            return this.kmsSecretValueKey;
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

        /**
         * <p>[Required for encrypted private key] The Kafka client private key password. This parameter is required when the client private key is password-protected (the PEM file contains \&quot;Proc-Type: 4,ENCRYPTED\&quot; or \&quot;ENCRYPTED\&quot; markers). Leave empty if the private key is not encrypted. Note: This password is only used to decrypt the private key and is unrelated to Kafka authentication.</p>
         */
        @NameInMap("SslKeyPassword")
        public String sslKeyPassword;

        /**
         * <p>[Required for mutual authentication] The Kafka client certificate chain. This parameter is required when the Kafka server enables mutual SSL authentication (ssl.client.auth=required). Format: Base64-encoded PEM format containing the client certificate and the complete certificate chain (client certificate first, intermediate CA certificate next, root CA certificate optional). Note: Ensure each PEM file content starts with \&quot;-----BEGIN CERTIFICATE-----\&quot; and ends with \&quot;-----END CERTIFICATE-----\&quot;, then Base64-encode the concatenated content.</p>
         */
        @NameInMap("SslKeystoreCertificateChain")
        public String sslKeystoreCertificateChain;

        /**
         * <p>[Required for bidirectional authentication] The SSL private key configuration object. When the Kafka server enables bidirectional SSL authentication, you must provide the client private key. Only KMS pattern is supported for the key: specify the Key Management EPS resource that stores the private key by using KmsArn. The system retrieves the private key content from KMS only in memory, which provides higher security. Configuration example: {\&quot;KmsArn\&quot;: \&quot;acs:kms:ap-southeast-1:123456789:secret/ssl-key-xxxx\&quot;, \&quot;KmsSecretValueKey\&quot;: \&quot;keystore_private_key\&quot;}\n&quot;</p>
         */
        @NameInMap("SslKeystoreKey")
        public UpdateEventStreamingRequestSourceSourceApacheKafkaParametersSslKeystoreKey sslKeystoreKey;

        /**
         * <p>[Required for SSL] The Kafka server trusted certificate. Used to authenticate the validity of the Kafka Broker SSL certificate and prevent man-in-the-middle attacks. Format: Base64 encoding of PEM format, typically containing the CA certificate or the server certificate of the Kafka server. Example: Base64-encode the PEM file content of the CA certificate (ensure the content starts with \&quot;-----BEGIN CERTIFICATE-----\&quot; and ends with \&quot;-----END CERTIFICATE-----\&quot;). If Kafka uses a self-signed certificate, provide the CA certificate that issued the certificate.</p>
         */
        @NameInMap("SslTruststoreCertificates")
        public String sslTruststoreCertificates;

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

        public UpdateEventStreamingRequestSourceSourceApacheKafkaParameters setSslKeyPassword(String sslKeyPassword) {
            this.sslKeyPassword = sslKeyPassword;
            return this;
        }
        public String getSslKeyPassword() {
            return this.sslKeyPassword;
        }

        public UpdateEventStreamingRequestSourceSourceApacheKafkaParameters setSslKeystoreCertificateChain(String sslKeystoreCertificateChain) {
            this.sslKeystoreCertificateChain = sslKeystoreCertificateChain;
            return this;
        }
        public String getSslKeystoreCertificateChain() {
            return this.sslKeystoreCertificateChain;
        }

        public UpdateEventStreamingRequestSourceSourceApacheKafkaParameters setSslKeystoreKey(UpdateEventStreamingRequestSourceSourceApacheKafkaParametersSslKeystoreKey sslKeystoreKey) {
            this.sslKeystoreKey = sslKeystoreKey;
            return this;
        }
        public UpdateEventStreamingRequestSourceSourceApacheKafkaParametersSslKeystoreKey getSslKeystoreKey() {
            return this.sslKeystoreKey;
        }

        public UpdateEventStreamingRequestSourceSourceApacheKafkaParameters setSslTruststoreCertificates(String sslTruststoreCertificates) {
            this.sslTruststoreCertificates = sslTruststoreCertificates;
            return this;
        }
        public String getSslTruststoreCertificates() {
            return this.sslTruststoreCertificates;
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

    public static class UpdateEventStreamingRequestSourceSourceApacheRocketMQCheckpointParameters extends TeaModel {
        /**
         * <p>The endpoint of the Apache RocketMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.1:9876</p>
         */
        @NameInMap("InstanceEndpoint")
        public String instanceEndpoint;

        /**
         * <p>The password of the Apache RocketMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("InstancePassword")
        public String instancePassword;

        /**
         * <p>The username of the Apache RocketMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("InstanceUsername")
        public String instanceUsername;

        /**
         * <p>The network type. Valid values:</p>
         * <ul>
         * <li>PublicNetwork</li>
         * <li>PrivateNetwork</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PrivateNetwork</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-mw43*****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The topic of the Apache RocketMQ instance.</p>
         */
        @NameInMap("Topics")
        public java.util.List<String> topics;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-dwaafds****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>VPC ID。</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-adw1awdw*****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static UpdateEventStreamingRequestSourceSourceApacheRocketMQCheckpointParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSourceSourceApacheRocketMQCheckpointParameters self = new UpdateEventStreamingRequestSourceSourceApacheRocketMQCheckpointParameters();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSourceSourceApacheRocketMQCheckpointParameters setInstanceEndpoint(String instanceEndpoint) {
            this.instanceEndpoint = instanceEndpoint;
            return this;
        }
        public String getInstanceEndpoint() {
            return this.instanceEndpoint;
        }

        public UpdateEventStreamingRequestSourceSourceApacheRocketMQCheckpointParameters setInstancePassword(String instancePassword) {
            this.instancePassword = instancePassword;
            return this;
        }
        public String getInstancePassword() {
            return this.instancePassword;
        }

        public UpdateEventStreamingRequestSourceSourceApacheRocketMQCheckpointParameters setInstanceUsername(String instanceUsername) {
            this.instanceUsername = instanceUsername;
            return this;
        }
        public String getInstanceUsername() {
            return this.instanceUsername;
        }

        public UpdateEventStreamingRequestSourceSourceApacheRocketMQCheckpointParameters setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public UpdateEventStreamingRequestSourceSourceApacheRocketMQCheckpointParameters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public UpdateEventStreamingRequestSourceSourceApacheRocketMQCheckpointParameters setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public UpdateEventStreamingRequestSourceSourceApacheRocketMQCheckpointParameters setTopics(java.util.List<String> topics) {
            this.topics = topics;
            return this;
        }
        public java.util.List<String> getTopics() {
            return this.topics;
        }

        public UpdateEventStreamingRequestSourceSourceApacheRocketMQCheckpointParameters setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public UpdateEventStreamingRequestSourceSourceApacheRocketMQCheckpointParameters setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class UpdateEventStreamingRequestSourceSourceCustomizedKafkaConnectorParametersConnectorParameters extends TeaModel {
        /**
         * <p>The connector configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *           &quot;connector.class&quot;: &quot;com.mongodb.kafka.connect.MongoSinkConnector&quot;,
         *           &quot;tasks.max&quot;: &quot;1&quot;,
         *           &quot;topics&quot;: &quot;sourceA,sourceB&quot;
         *         }</p>
         */
        @NameInMap("Config")
        public java.util.Map<String, ?> config;

        /**
         * <p>The connector name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-name</p>
         */
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
        /**
         * <p>The download URL of the OSS resource ZIP package.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;<a href="https://examplebucket.oss-cn-hangzhou.aliyuncs.com/testDoc/Old_Homebrew/2024-06-26%2022%3A34%3A08/opt/homebrew/homebrew/Library/Homebrew/test/support/fixtures/cask/AppWithBinary.zip?OSSAccessKeyId=ri&Expires=1725539627&Signature=rb8q3OpV2i3gZJ">https://examplebucket.oss-cn-hangzhou.aliyuncs.com/testDoc/Old_Homebrew/2024-06-26%2022%3A34%3A08/opt/homebrew/homebrew/Library/Homebrew/test/support/fixtures/cask/AppWithBinary.zip?OSSAccessKeyId=ri&amp;Expires=1725539627&amp;Signature=rb8q3OpV2i3gZJ</a>&quot;</p>
         */
        @NameInMap("ConnectorPackageUrl")
        public String connectorPackageUrl;

        /**
         * <p>The connector parameters.</p>
         */
        @NameInMap("ConnectorParameters")
        public UpdateEventStreamingRequestSourceSourceCustomizedKafkaConnectorParametersConnectorParameters connectorParameters;

        /**
         * <p>The instance configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *         &quot;group.id&quot;: &quot;connect-eb-cluster-KAFKA_CONNECTORC&quot;,
         *         &quot;offset.storage.topic&quot;: &quot;connect-eb-offset-KAFKA_CONNECTOR_yjqC8K5ewC&quot;,
         *         &quot;config.storage.topic&quot;: &quot;connect-eb-config-KAFKA_CONNECTOR_yjqC8K5ewC&quot;,
         *         &quot;status.storage.topic&quot;: &quot;connect-eb-status-KAFKA_CONNECTOR_yjqC8K5ewC&quot;,
         *         &quot;consumer.group.id&quot;: &quot;connector-eb-cluster-KAFKA_CONNECTOR_yjqC8K5ewC-mongo-sink&quot;,
         *         &quot;bootstrap.servers&quot;: &quot;alikafka-post:9092&quot;
         *       }</p>
         */
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
        /**
         * <p>The instance ID of the ApsaraMQ for Kafka instance.</p>
         * 
         * <strong>example:</strong>
         * <p>r-8vb64581862c****</p>
         */
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
         * <p>The network address and port number of the data subscription channel.</p>
         */
        @NameInMap("BrokerUrl")
        public String brokerUrl;

        /**
         * <p>The consumption offset, which is the timestamp when the SDK client consumes the first data record. The value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1620962769</p>
         */
        @NameInMap("InitCheckPoint")
        public Long initCheckPoint;

        /**
         * <p>The password of the consumer group account.</p>
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
         * <p>f86e5814-b223-482c-b768-3b873297****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The subscription topic of the data subscription channel.</p>
         * 
         * <strong>example:</strong>
         * <p>LTC_CACHE_PRD</p>
         */
        @NameInMap("Topic")
        public String topic;

        /**
         * <p>The account of the consumer group.</p>
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

    public static class UpdateEventStreamingRequestSourceSourceEventBusParameters extends TeaModel {
        /**
         * <p>The event bus name.</p>
         * 
         * <strong>example:</strong>
         * <p>my-event-bus</p>
         */
        @NameInMap("EventBusName")
        public String eventBusName;

        /**
         * <p>The event rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>my-event-rule</p>
         */
        @NameInMap("EventRuleName")
        public String eventRuleName;

        public static UpdateEventStreamingRequestSourceSourceEventBusParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSourceSourceEventBusParameters self = new UpdateEventStreamingRequestSourceSourceEventBusParameters();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSourceSourceEventBusParameters setEventBusName(String eventBusName) {
            this.eventBusName = eventBusName;
            return this;
        }
        public String getEventBusName() {
            return this.eventBusName;
        }

        public UpdateEventStreamingRequestSourceSourceEventBusParameters setEventRuleName(String eventRuleName) {
            this.eventRuleName = eventRuleName;
            return this;
        }
        public String getEventRuleName() {
            return this.eventRuleName;
        }

    }

    public static class UpdateEventStreamingRequestSourceSourceKafkaParameters extends TeaModel {
        /**
         * <p>The Group ID of the consumer that subscribes to the topic.</p>
         * 
         * <strong>example:</strong>
         * <p>DEFAULT_GROUP</p>
         */
        @NameInMap("ConsumerGroup")
        public String consumerGroup;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-8vbh4a5b9yfhgkkzm****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The network configuration. Default value: Default. Set to PublicNetwork for VPC networks.</p>
         * 
         * <strong>example:</strong>
         * <p>Default</p>
         */
        @NameInMap("Network")
        public String network;

        /**
         * <p>The offset.</p>
         * 
         * <strong>example:</strong>
         * <p>latest</p>
         */
        @NameInMap("OffsetReset")
        public String offsetReset;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-zhangjiakou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-uf6jcm3y5hcs7hkl****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The topic name.</p>
         * 
         * <strong>example:</strong>
         * <p>topic_empower_1641539400786</p>
         */
        @NameInMap("Topic")
        public String topic;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-wz9t1l1e8eu2om****</p>
         */
        @NameInMap("VSwitchIds")
        public String vSwitchIds;

        /**
         * <p>The encoding and decoding method. Valid values:</p>
         * <ul>
         * <li>Json: decodes bytes into a string by using UTF-8 encoding and parses the string into JSON format.</li>
         * <li>Text: decodes bytes into a string by using UTF-8 encoding and directly places the string into the payload.</li>
         * <li>Binary: encodes bytes into a string by using Base64 encoding and places the string into the payload.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Text</p>
         */
        @NameInMap("ValueDataType")
        public String valueDataType;

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2ze6p0o345nykmekxt****</p>
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
         * <p>Specifies whether to enable Base64 decoding. Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsBase64Decode")
        public Boolean isBase64Decode;

        /**
         * <p>The queue name.</p>
         * 
         * <strong>example:</strong>
         * <p>queue_api_1642474203601</p>
         */
        @NameInMap("QueueName")
        public String queueName;

        /**
         * <p>The region ID.</p>
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
         * <p>The message encoding format. Valid values:</p>
         * <ul>
         * <li>JSON</li>
         * <li>Text</li>
         * <li>Binary</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>JSON</p>
         */
        @NameInMap("BodyDataType")
        public String bodyDataType;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1dsudbecqwt61j****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The network type.</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The security group ID.</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The topic name.</p>
         * 
         * <strong>example:</strong>
         * <p>topic_empower_1642400400779</p>
         */
        @NameInMap("Topic")
        public String topic;

        /**
         * <p>The vSwitch ID.</p>
         */
        @NameInMap("VSwitchIds")
        public String vSwitchIds;

        /**
         * <p>VPC ID。</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static UpdateEventStreamingRequestSourceSourceMQTTParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSourceSourceMQTTParameters self = new UpdateEventStreamingRequestSourceSourceMQTTParameters();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSourceSourceMQTTParameters setBodyDataType(String bodyDataType) {
            this.bodyDataType = bodyDataType;
            return this;
        }
        public String getBodyDataType() {
            return this.bodyDataType;
        }

        public UpdateEventStreamingRequestSourceSourceMQTTParameters setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UpdateEventStreamingRequestSourceSourceMQTTParameters setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public UpdateEventStreamingRequestSourceSourceMQTTParameters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public UpdateEventStreamingRequestSourceSourceMQTTParameters setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public UpdateEventStreamingRequestSourceSourceMQTTParameters setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public UpdateEventStreamingRequestSourceSourceMQTTParameters setVSwitchIds(String vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public String getVSwitchIds() {
            return this.vSwitchIds;
        }

        public UpdateEventStreamingRequestSourceSourceMQTTParameters setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class UpdateEventStreamingRequestSourceSourceOSSParameters extends TeaModel {
        /**
         * <p>The name of the bucket in Object Storage Service (OSS).</p>
         * 
         * <strong>example:</strong>
         * <p>bucket_abc</p>
         */
        @NameInMap("BucketName")
        public String bucketName;

        /**
         * <p>The delimiter. In chunked loading mode, this delimiter is used as the text chunking identifier. The default delimiter is the newline character 
         * .</p>
         * 
         * <strong>example:</strong>
         * <p>\n</p>
         */
        @NameInMap("Delimiter")
        public String delimiter;

        /**
         * <p>The document loader.</p>
         * 
         * <strong>example:</strong>
         * <p>TextLoader</p>
         */
        @NameInMap("LoadFormat")
        public String loadFormat;

        /**
         * <p>The data loading mode. Valid values: single (single document loading) and element (chunked loading). Default value: single.</p>
         * 
         * <strong>example:</strong>
         * <p>single</p>
         */
        @NameInMap("LoadMode")
        public String loadMode;

        /**
         * <p>The file path prefix.</p>
         * 
         * <strong>example:</strong>
         * <p>fun/document/</p>
         */
        @NameInMap("Prefix")
        public String prefix;

        /**
         * <p>The role name used for authorization to allow the event bus EventBridge to read OSS files. The role must have at least read-only permissions on OSS.</p>
         * 
         * <strong>example:</strong>
         * <p>eventbridge_oss_role</p>
         */
        @NameInMap("RoleName")
        public String roleName;

        public static UpdateEventStreamingRequestSourceSourceOSSParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSourceSourceOSSParameters self = new UpdateEventStreamingRequestSourceSourceOSSParameters();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSourceSourceOSSParameters setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public UpdateEventStreamingRequestSourceSourceOSSParameters setDelimiter(String delimiter) {
            this.delimiter = delimiter;
            return this;
        }
        public String getDelimiter() {
            return this.delimiter;
        }

        public UpdateEventStreamingRequestSourceSourceOSSParameters setLoadFormat(String loadFormat) {
            this.loadFormat = loadFormat;
            return this;
        }
        public String getLoadFormat() {
            return this.loadFormat;
        }

        public UpdateEventStreamingRequestSourceSourceOSSParameters setLoadMode(String loadMode) {
            this.loadMode = loadMode;
            return this;
        }
        public String getLoadMode() {
            return this.loadMode;
        }

        public UpdateEventStreamingRequestSourceSourceOSSParameters setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public UpdateEventStreamingRequestSourceSourceOSSParameters setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

    }

    public static class UpdateEventStreamingRequestSourceSourceOpenSourceRabbitMQParameters extends TeaModel {
        /**
         * <p>The authentication type.</p>
         * 
         * <strong>example:</strong>
         * <p>ACL</p>
         */
        @NameInMap("AuthType")
        public String authType;

        /**
         * <p>The message body data type.</p>
         * 
         * <strong>example:</strong>
         * <p>Json</p>
         */
        @NameInMap("BodyDataType")
        public String bodyDataType;

        /**
         * <p>The instance endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.1:9876</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The network type. Valid values:</p>
         * <ul>
         * <li>PublicNetwork</li>
         * <li>PrivateNetwork</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PrivateNetwork</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The password used to connect to the open source RabbitMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The queue name of the open source RabbitMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("QueueName")
        public String queueName;

        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-m5edtu24f12345****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The username used to connect to the open source RabbitMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("Username")
        public String username;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-m5ev8asdc6h12345****</p>
         */
        @NameInMap("VSwitchIds")
        public String vSwitchIds;

        /**
         * <p>The virtual host name of the open source RabbitMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Vhost1</p>
         */
        @NameInMap("VirtualHostName")
        public String virtualHostName;

        /**
         * <p>VPC ID。</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-m5e3sv4b12345****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static UpdateEventStreamingRequestSourceSourceOpenSourceRabbitMQParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSourceSourceOpenSourceRabbitMQParameters self = new UpdateEventStreamingRequestSourceSourceOpenSourceRabbitMQParameters();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSourceSourceOpenSourceRabbitMQParameters setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public UpdateEventStreamingRequestSourceSourceOpenSourceRabbitMQParameters setBodyDataType(String bodyDataType) {
            this.bodyDataType = bodyDataType;
            return this;
        }
        public String getBodyDataType() {
            return this.bodyDataType;
        }

        public UpdateEventStreamingRequestSourceSourceOpenSourceRabbitMQParameters setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public UpdateEventStreamingRequestSourceSourceOpenSourceRabbitMQParameters setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public UpdateEventStreamingRequestSourceSourceOpenSourceRabbitMQParameters setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public UpdateEventStreamingRequestSourceSourceOpenSourceRabbitMQParameters setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public UpdateEventStreamingRequestSourceSourceOpenSourceRabbitMQParameters setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public UpdateEventStreamingRequestSourceSourceOpenSourceRabbitMQParameters setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public UpdateEventStreamingRequestSourceSourceOpenSourceRabbitMQParameters setVSwitchIds(String vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public String getVSwitchIds() {
            return this.vSwitchIds;
        }

        public UpdateEventStreamingRequestSourceSourceOpenSourceRabbitMQParameters setVirtualHostName(String virtualHostName) {
            this.virtualHostName = virtualHostName;
            return this;
        }
        public String getVirtualHostName() {
            return this.virtualHostName;
        }

        public UpdateEventStreamingRequestSourceSourceOpenSourceRabbitMQParameters setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
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
         * <p>Json</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>The external labels appended to the event stream.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;env&quot;:&quot;test&quot;}</p>
         */
        @NameInMap("ExternalLabels")
        public String externalLabels;

        /**
         * <p>The labels.</p>
         * 
         * <strong>example:</strong>
         * <p><strong>name</strong>=.*</p>
         */
        @NameInMap("Labels")
        public String labels;

        /**
         * <p>The region ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The task role name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-role</p>
         */
        @NameInMap("RoleName")
        public String roleName;

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

        public UpdateEventStreamingRequestSourceSourcePrometheusParameters setExternalLabels(String externalLabels) {
            this.externalLabels = externalLabels;
            return this;
        }
        public String getExternalLabels() {
            return this.externalLabels;
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

        public UpdateEventStreamingRequestSourceSourcePrometheusParameters setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
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
         * <p>The name of the queue of the ApsaraMQ for RabbitMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("QueueName")
        public String queueName;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the vhost of the ApsaraMQ for RabbitMQ instance.</p>
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

    public static class UpdateEventStreamingRequestSourceSourceRocketMQCheckpointParameters extends TeaModel {
        /**
         * <p>The instance ID of the ApsaraMQ for RocketMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rmq-cn-jte3w******</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The type of the ApsaraMQ for RocketMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Cloud_5</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The topic of the ApsaraMQ for RocketMQ instance.</p>
         */
        @NameInMap("Topics")
        public java.util.List<String> topics;

        public static UpdateEventStreamingRequestSourceSourceRocketMQCheckpointParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventStreamingRequestSourceSourceRocketMQCheckpointParameters self = new UpdateEventStreamingRequestSourceSourceRocketMQCheckpointParameters();
            return TeaModel.build(map, self);
        }

        public UpdateEventStreamingRequestSourceSourceRocketMQCheckpointParameters setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UpdateEventStreamingRequestSourceSourceRocketMQCheckpointParameters setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public UpdateEventStreamingRequestSourceSourceRocketMQCheckpointParameters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public UpdateEventStreamingRequestSourceSourceRocketMQCheckpointParameters setTopics(java.util.List<String> topics) {
            this.topics = topics;
            return this;
        }
        public java.util.List<String> getTopics() {
            return this.topics;
        }

    }

    public static class UpdateEventStreamingRequestSourceSourceRocketMQParameters extends TeaModel {
        /**
         * <p>The authentication type.</p>
         * 
         * <strong>example:</strong>
         * <p>ACL</p>
         */
        @NameInMap("AuthType")
        public String authType;

        /**
         * <p>The message encoding format. Valid values:</p>
         * <ul>
         * <li>Json</li>
         * <li>Text</li>
         * <li>Binary</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Json</p>
         */
        @NameInMap("BodyDataType")
        public String bodyDataType;

        /**
         * <p>The SQL filter statement.</p>
         * 
         * <strong>example:</strong>
         * <p>index &gt; 10</p>
         */
        @NameInMap("FilterSql")
        public String filterSql;

        /**
         * <p>The message filter type.</p>
         * 
         * <strong>example:</strong>
         * <p>Tag</p>
         */
        @NameInMap("FilterType")
        public String filterType;

        /**
         * <p>The group ID of the ApsaraMQ for RocketMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>GID_test</p>
         */
        @NameInMap("GroupID")
        public String groupID;

        /**
         * <p>The instance endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>reg****-vpc.cn-zhangjiakou.aliyuncs.com</p>
         */
        @NameInMap("InstanceEndpoint")
        public String instanceEndpoint;

        /**
         * <p>The instance ID of the ApsaraMQ for RocketMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-f8z9a9mcgwri1c1id****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The network information of the instance. Valid values:</p>
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
         * <p>The instance password.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("InstancePassword")
        public String instancePassword;

        /**
         * <p>The security group information of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-m5edtu24f12345****</p>
         */
        @NameInMap("InstanceSecurityGroupId")
        public String instanceSecurityGroupId;

        /**
         * <p>The instance type. Valid values:</p>
         * <ul>
         * <li>Cloud_4 (default): Alibaba Cloud RocketMQ 4.0 instance</li>
         * <li>Cloud_5: Alibaba Cloud RocketMQ 5.0 instance</li>
         * <li>SelfBuilt: self-managed Apache RocketMQ instance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Cloud_5</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The instance username.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("InstanceUsername")
        public String instanceUsername;

        /**
         * <p>The vSwitch information of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-m5ev8asdc6h12****</p>
         */
        @NameInMap("InstanceVSwitchIds")
        public String instanceVSwitchIds;

        /**
         * <p>The VPC information of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-m5e3sv4b12345****</p>
         */
        @NameInMap("InstanceVpcId")
        public String instanceVpcId;

        /**
         * <p>The network type. Valid values:</p>
         * <ul>
         * <li>PublicNetwork</li>
         * <li>PrivateNetwork</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PublicNetwork</p>
         */
        @NameInMap("Network")
        public String network;

        /**
         * <p>The consumption offset of the message. Valid values:</p>
         * <ul>
         * <li>CONSUMEFROMLASTOFFSET: Consumption starts from the latest offset.</li>
         * <li>CONSUMEFROMFIRSTOFFSET: Consumption starts from the earliest offset.</li>
         * <li>CONSUMEFROMTIMESTAMP: Consumption starts from the offset at the specified time.</li>
         * </ul>
         * <p>Default value: CONSUMEFROMLAST_OFFSET.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSUMEFROMLASTOFFSET</p>
         */
        @NameInMap("Offset")
        public String offset;

        /**
         * <p>The region ID of the ApsaraMQ for RocketMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-m5edtu24f12345****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The filter tag of the message.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The timestamp. This parameter is valid only when the Offset parameter is set to CONSUMEFROMTIMESTAMP.</p>
         * 
         * <strong>example:</strong>
         * <p>1670656652009</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <p>The topic name.</p>
         * 
         * <strong>example:</strong>
         * <p>TOPIC-cainiao-pcs-order-process-inBoundConditionCheck</p>
         */
        @NameInMap("Topic")
        public String topic;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-m5ev8asdc6h12345****</p>
         */
        @NameInMap("VSwitchIds")
        public String vSwitchIds;

        /**
         * <p>The VPC ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-m5e3sv4b12345****</p>
         */
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
         * <p>The role name used for authorization to allow the event bus EventBridge to read Simple Log Service log content. When you create the role in the Resource Access Management (RAM) console, select &quot;Alibaba Cloud Service&quot; and set &quot;Trusted Service&quot; to &quot;event bus&quot;.</p>
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

        /**
         * <p>The Source RocketMQ Checkpoint source.</p>
         */
        @NameInMap("SourceApacheRocketMQCheckpointParameters")
        public UpdateEventStreamingRequestSourceSourceApacheRocketMQCheckpointParameters sourceApacheRocketMQCheckpointParameters;

        /**
         * <p>The custom connector Apache Kafka event source.</p>
         */
        @NameInMap("SourceCustomizedKafkaConnectorParameters")
        public UpdateEventStreamingRequestSourceSourceCustomizedKafkaConnectorParameters sourceCustomizedKafkaConnectorParameters;

        /**
         * <p>The custom Kafka event source.</p>
         */
        @NameInMap("SourceCustomizedKafkaParameters")
        public UpdateEventStreamingRequestSourceSourceCustomizedKafkaParameters sourceCustomizedKafkaParameters;

        /**
         * <p>The Source DTS source.</p>
         */
        @NameInMap("SourceDTSParameters")
        public UpdateEventStreamingRequestSourceSourceDTSParameters sourceDTSParameters;

        /**
         * <p>The Source EventBus source.</p>
         */
        @NameInMap("SourceEventBusParameters")
        public UpdateEventStreamingRequestSourceSourceEventBusParameters sourceEventBusParameters;

        @NameInMap("SourceFeiShuDocsParameters")
        public SourceFeiShuDocsParameters sourceFeiShuDocsParameters;

        @NameInMap("SourceJDBCParameters")
        public SourceJDBCParameters sourceJDBCParameters;

        /**
         * <p>The Source Kafka source.</p>
         */
        @NameInMap("SourceKafkaParameters")
        public UpdateEventStreamingRequestSourceSourceKafkaParameters sourceKafkaParameters;

        /**
         * <p>The Source Simple Message Queue (formerly</p>
         */
        @NameInMap("SourceMNSParameters")
        public UpdateEventStreamingRequestSourceSourceMNSParameters sourceMNSParameters;

        /**
         * <p>The Source MQTT source.</p>
         */
        @NameInMap("SourceMQTTParameters")
        public UpdateEventStreamingRequestSourceSourceMQTTParameters sourceMQTTParameters;

        /**
         * <p>The Source MySQL source.</p>
         */
        @NameInMap("SourceMySQLParameters")
        public SourceMySQLParameters sourceMySQLParameters;

        /**
         * <p>The Source OSS event source.</p>
         */
        @NameInMap("SourceOSSParameters")
        public UpdateEventStreamingRequestSourceSourceOSSParameters sourceOSSParameters;

        /**
         * <p>The Source Open Source RabbitMQ source.</p>
         */
        @NameInMap("SourceOpenSourceRabbitMQParameters")
        public UpdateEventStreamingRequestSourceSourceOpenSourceRabbitMQParameters sourceOpenSourceRabbitMQParameters;

        @NameInMap("SourcePostgreSQLParameters")
        public SourcePostgreSQLParameters sourcePostgreSQLParameters;

        /**
         * <p>The Source Prometheus event source.</p>
         */
        @NameInMap("SourcePrometheusParameters")
        public UpdateEventStreamingRequestSourceSourcePrometheusParameters sourcePrometheusParameters;

        @NameInMap("SourceRabbitMQMetaParameters")
        public SourceRabbitMQMetaParameters sourceRabbitMQMetaParameters;

        @NameInMap("SourceRabbitMQMsgSyncParameters")
        public SourceRabbitMQMsgSyncParameters sourceRabbitMQMsgSyncParameters;

        /**
         * <p>The Source RabbitMQ source.</p>
         */
        @NameInMap("SourceRabbitMQParameters")
        public UpdateEventStreamingRequestSourceSourceRabbitMQParameters sourceRabbitMQParameters;

        /**
         * <p>The Source RocketMQ Checkpoint source.</p>
         */
        @NameInMap("SourceRocketMQCheckpointParameters")
        public UpdateEventStreamingRequestSourceSourceRocketMQCheckpointParameters sourceRocketMQCheckpointParameters;

        /**
         * <p>The Source RocketMQ source.</p>
         */
        @NameInMap("SourceRocketMQParameters")
        public UpdateEventStreamingRequestSourceSourceRocketMQParameters sourceRocketMQParameters;

        /**
         * <p>The Source SLS source.</p>
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

        public UpdateEventStreamingRequestSource setSourceApacheRocketMQCheckpointParameters(UpdateEventStreamingRequestSourceSourceApacheRocketMQCheckpointParameters sourceApacheRocketMQCheckpointParameters) {
            this.sourceApacheRocketMQCheckpointParameters = sourceApacheRocketMQCheckpointParameters;
            return this;
        }
        public UpdateEventStreamingRequestSourceSourceApacheRocketMQCheckpointParameters getSourceApacheRocketMQCheckpointParameters() {
            return this.sourceApacheRocketMQCheckpointParameters;
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

        public UpdateEventStreamingRequestSource setSourceEventBusParameters(UpdateEventStreamingRequestSourceSourceEventBusParameters sourceEventBusParameters) {
            this.sourceEventBusParameters = sourceEventBusParameters;
            return this;
        }
        public UpdateEventStreamingRequestSourceSourceEventBusParameters getSourceEventBusParameters() {
            return this.sourceEventBusParameters;
        }

        public UpdateEventStreamingRequestSource setSourceFeiShuDocsParameters(SourceFeiShuDocsParameters sourceFeiShuDocsParameters) {
            this.sourceFeiShuDocsParameters = sourceFeiShuDocsParameters;
            return this;
        }
        public SourceFeiShuDocsParameters getSourceFeiShuDocsParameters() {
            return this.sourceFeiShuDocsParameters;
        }

        public UpdateEventStreamingRequestSource setSourceJDBCParameters(SourceJDBCParameters sourceJDBCParameters) {
            this.sourceJDBCParameters = sourceJDBCParameters;
            return this;
        }
        public SourceJDBCParameters getSourceJDBCParameters() {
            return this.sourceJDBCParameters;
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

        public UpdateEventStreamingRequestSource setSourceMySQLParameters(SourceMySQLParameters sourceMySQLParameters) {
            this.sourceMySQLParameters = sourceMySQLParameters;
            return this;
        }
        public SourceMySQLParameters getSourceMySQLParameters() {
            return this.sourceMySQLParameters;
        }

        public UpdateEventStreamingRequestSource setSourceOSSParameters(UpdateEventStreamingRequestSourceSourceOSSParameters sourceOSSParameters) {
            this.sourceOSSParameters = sourceOSSParameters;
            return this;
        }
        public UpdateEventStreamingRequestSourceSourceOSSParameters getSourceOSSParameters() {
            return this.sourceOSSParameters;
        }

        public UpdateEventStreamingRequestSource setSourceOpenSourceRabbitMQParameters(UpdateEventStreamingRequestSourceSourceOpenSourceRabbitMQParameters sourceOpenSourceRabbitMQParameters) {
            this.sourceOpenSourceRabbitMQParameters = sourceOpenSourceRabbitMQParameters;
            return this;
        }
        public UpdateEventStreamingRequestSourceSourceOpenSourceRabbitMQParameters getSourceOpenSourceRabbitMQParameters() {
            return this.sourceOpenSourceRabbitMQParameters;
        }

        public UpdateEventStreamingRequestSource setSourcePostgreSQLParameters(SourcePostgreSQLParameters sourcePostgreSQLParameters) {
            this.sourcePostgreSQLParameters = sourcePostgreSQLParameters;
            return this;
        }
        public SourcePostgreSQLParameters getSourcePostgreSQLParameters() {
            return this.sourcePostgreSQLParameters;
        }

        public UpdateEventStreamingRequestSource setSourcePrometheusParameters(UpdateEventStreamingRequestSourceSourcePrometheusParameters sourcePrometheusParameters) {
            this.sourcePrometheusParameters = sourcePrometheusParameters;
            return this;
        }
        public UpdateEventStreamingRequestSourceSourcePrometheusParameters getSourcePrometheusParameters() {
            return this.sourcePrometheusParameters;
        }

        public UpdateEventStreamingRequestSource setSourceRabbitMQMetaParameters(SourceRabbitMQMetaParameters sourceRabbitMQMetaParameters) {
            this.sourceRabbitMQMetaParameters = sourceRabbitMQMetaParameters;
            return this;
        }
        public SourceRabbitMQMetaParameters getSourceRabbitMQMetaParameters() {
            return this.sourceRabbitMQMetaParameters;
        }

        public UpdateEventStreamingRequestSource setSourceRabbitMQMsgSyncParameters(SourceRabbitMQMsgSyncParameters sourceRabbitMQMsgSyncParameters) {
            this.sourceRabbitMQMsgSyncParameters = sourceRabbitMQMsgSyncParameters;
            return this;
        }
        public SourceRabbitMQMsgSyncParameters getSourceRabbitMQMsgSyncParameters() {
            return this.sourceRabbitMQMsgSyncParameters;
        }

        public UpdateEventStreamingRequestSource setSourceRabbitMQParameters(UpdateEventStreamingRequestSourceSourceRabbitMQParameters sourceRabbitMQParameters) {
            this.sourceRabbitMQParameters = sourceRabbitMQParameters;
            return this;
        }
        public UpdateEventStreamingRequestSourceSourceRabbitMQParameters getSourceRabbitMQParameters() {
            return this.sourceRabbitMQParameters;
        }

        public UpdateEventStreamingRequestSource setSourceRocketMQCheckpointParameters(UpdateEventStreamingRequestSourceSourceRocketMQCheckpointParameters sourceRocketMQCheckpointParameters) {
            this.sourceRocketMQCheckpointParameters = sourceRocketMQCheckpointParameters;
            return this;
        }
        public UpdateEventStreamingRequestSourceSourceRocketMQCheckpointParameters getSourceRocketMQCheckpointParameters() {
            return this.sourceRocketMQCheckpointParameters;
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
         * <p>The ARN of the cloud product, such as the ARN of a function in Function Compute.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:fc:cn-hangzhou:*****:services/demo-service.LATEST/functions/demo-func</p>
         */
        @NameInMap("Arn")
        public String arn;

        @NameInMap("BaiLianAgentTransformParameters")
        public BaiLianAgentTransformParameters baiLianAgentTransformParameters;

        @NameInMap("DashScopeTransformParameters")
        public DashScopeTransformParameters dashScopeTransformParameters;

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

        public UpdateEventStreamingRequestTransforms setBaiLianAgentTransformParameters(BaiLianAgentTransformParameters baiLianAgentTransformParameters) {
            this.baiLianAgentTransformParameters = baiLianAgentTransformParameters;
            return this;
        }
        public BaiLianAgentTransformParameters getBaiLianAgentTransformParameters() {
            return this.baiLianAgentTransformParameters;
        }

        public UpdateEventStreamingRequestTransforms setDashScopeTransformParameters(DashScopeTransformParameters dashScopeTransformParameters) {
            this.dashScopeTransformParameters = dashScopeTransformParameters;
            return this;
        }
        public DashScopeTransformParameters getDashScopeTransformParameters() {
            return this.dashScopeTransformParameters;
        }

    }

}
