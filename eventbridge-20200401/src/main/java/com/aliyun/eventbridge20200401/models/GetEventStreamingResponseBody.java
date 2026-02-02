// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class GetEventStreamingResponseBody extends TeaModel {
    /**
     * <p>The response code. The value Success indicates that the request is successful. Other values indicate that the request failed. For a list of error codes, see Error codes.</p>
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
    public GetEventStreamingResponseBodyData data;

    /**
     * <p>The error message that is returned if the request failed.</p>
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
     * <p>7892F480-58C9-5067-AB35-8A7BEF0F726A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation is successful. The value true indicates that the operation is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetEventStreamingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEventStreamingResponseBody self = new GetEventStreamingResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEventStreamingResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetEventStreamingResponseBody setData(GetEventStreamingResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetEventStreamingResponseBodyData getData() {
        return this.data;
    }

    public GetEventStreamingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetEventStreamingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEventStreamingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetEventStreamingResponseBodyDataDetailedStatus extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("DelayTime")
        public Long delayTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DiffOffset")
        public Long diffOffset;

        /**
         * <strong>example:</strong>
         * <p>{
         *         &quot;test&quot;: &quot;test&quot;,
         *         &quot;test2&quot;: 1
         *       }</p>
         */
        @NameInMap("Extensions")
        public java.util.Map<String, ?> extensions;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TPS")
        public Double TPS;

        public static GetEventStreamingResponseBodyDataDetailedStatus build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataDetailedStatus self = new GetEventStreamingResponseBodyDataDetailedStatus();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataDetailedStatus setDelayTime(Long delayTime) {
            this.delayTime = delayTime;
            return this;
        }
        public Long getDelayTime() {
            return this.delayTime;
        }

        public GetEventStreamingResponseBodyDataDetailedStatus setDiffOffset(Long diffOffset) {
            this.diffOffset = diffOffset;
            return this;
        }
        public Long getDiffOffset() {
            return this.diffOffset;
        }

        public GetEventStreamingResponseBodyDataDetailedStatus setExtensions(java.util.Map<String, ?> extensions) {
            this.extensions = extensions;
            return this;
        }
        public java.util.Map<String, ?> getExtensions() {
            return this.extensions;
        }

        public GetEventStreamingResponseBodyDataDetailedStatus setTPS(Double TPS) {
            this.TPS = TPS;
            return this;
        }
        public Double getTPS() {
            return this.TPS;
        }

    }

    public static class GetEventStreamingResponseBodyDataRunOptionsBatchWindow extends TeaModel {
        /**
         * <p>The maximum number of events that are allowed in the batch window. If this threshold is reached, data in the window is pushed downstream. When multiple batch windows exist, data is pushed if triggering conditions are met in one of the windows.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CountBasedWindow")
        public Integer countBasedWindow;

        /**
         * <p>The maximum period of time during which events are allowed in the batch window. Unit: seconds. If this threshold is reached, data in the window is pushed downstream. When multiple batch windows exist, data is pushed if triggering conditions are met in one of the windows.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TimeBasedWindow")
        public Integer timeBasedWindow;

        public static GetEventStreamingResponseBodyDataRunOptionsBatchWindow build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataRunOptionsBatchWindow self = new GetEventStreamingResponseBodyDataRunOptionsBatchWindow();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataRunOptionsBatchWindow setCountBasedWindow(Integer countBasedWindow) {
            this.countBasedWindow = countBasedWindow;
            return this;
        }
        public Integer getCountBasedWindow() {
            return this.countBasedWindow;
        }

        public GetEventStreamingResponseBodyDataRunOptionsBatchWindow setTimeBasedWindow(Integer timeBasedWindow) {
            this.timeBasedWindow = timeBasedWindow;
            return this;
        }
        public Integer getTimeBasedWindow() {
            return this.timeBasedWindow;
        }

    }

    public static class GetEventStreamingResponseBodyDataRunOptionsBusinessOption extends TeaModel {
        @NameInMap("BusinessMode")
        public String businessMode;

        @NameInMap("MaxCapacityUnitCount")
        public Long maxCapacityUnitCount;

        @NameInMap("MinCapacityUnitCount")
        public Long minCapacityUnitCount;

        public static GetEventStreamingResponseBodyDataRunOptionsBusinessOption build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataRunOptionsBusinessOption self = new GetEventStreamingResponseBodyDataRunOptionsBusinessOption();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataRunOptionsBusinessOption setBusinessMode(String businessMode) {
            this.businessMode = businessMode;
            return this;
        }
        public String getBusinessMode() {
            return this.businessMode;
        }

        public GetEventStreamingResponseBodyDataRunOptionsBusinessOption setMaxCapacityUnitCount(Long maxCapacityUnitCount) {
            this.maxCapacityUnitCount = maxCapacityUnitCount;
            return this;
        }
        public Long getMaxCapacityUnitCount() {
            return this.maxCapacityUnitCount;
        }

        public GetEventStreamingResponseBodyDataRunOptionsBusinessOption setMinCapacityUnitCount(Long minCapacityUnitCount) {
            this.minCapacityUnitCount = minCapacityUnitCount;
            return this;
        }
        public Long getMinCapacityUnitCount() {
            return this.minCapacityUnitCount;
        }

    }

    public static class GetEventStreamingResponseBodyDataRunOptionsDeadLetterQueue extends TeaModel {
        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the dead-letter queue.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::1550203943326350:role/edskmstoecs</p>
         */
        @NameInMap("Arn")
        public String arn;

        /**
         * <strong>example:</strong>
         * <p>PrivateNetwork</p>
         */
        @NameInMap("Network")
        public String network;

        /**
         * <strong>example:</strong>
         * <p>sg-2vcgdxz7o1n9zapp****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <strong>example:</strong>
         * <p>vsw-m5ev8asdc6h12345****</p>
         */
        @NameInMap("VSwitchIds")
        public String vSwitchIds;

        /**
         * <strong>example:</strong>
         * <p>vpc-2zehizpoendb3****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static GetEventStreamingResponseBodyDataRunOptionsDeadLetterQueue build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataRunOptionsDeadLetterQueue self = new GetEventStreamingResponseBodyDataRunOptionsDeadLetterQueue();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataRunOptionsDeadLetterQueue setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public GetEventStreamingResponseBodyDataRunOptionsDeadLetterQueue setNetwork(String network) {
            this.network = network;
            return this;
        }
        public String getNetwork() {
            return this.network;
        }

        public GetEventStreamingResponseBodyDataRunOptionsDeadLetterQueue setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public GetEventStreamingResponseBodyDataRunOptionsDeadLetterQueue setVSwitchIds(String vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public String getVSwitchIds() {
            return this.vSwitchIds;
        }

        public GetEventStreamingResponseBodyDataRunOptionsDeadLetterQueue setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class GetEventStreamingResponseBodyDataRunOptionsRetryStrategy extends TeaModel {
        /**
         * <p>The maximum period of time during which retries are performed.</p>
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
         * <p>The retry policy. Valid values: BACKOFFRETRY and EXPONENTIALDECAY_RETRY.</p>
         * 
         * <strong>example:</strong>
         * <p>BACKOFFRETRY</p>
         */
        @NameInMap("PushRetryStrategy")
        public String pushRetryStrategy;

        public static GetEventStreamingResponseBodyDataRunOptionsRetryStrategy build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataRunOptionsRetryStrategy self = new GetEventStreamingResponseBodyDataRunOptionsRetryStrategy();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataRunOptionsRetryStrategy setMaximumEventAgeInSeconds(Float maximumEventAgeInSeconds) {
            this.maximumEventAgeInSeconds = maximumEventAgeInSeconds;
            return this;
        }
        public Float getMaximumEventAgeInSeconds() {
            return this.maximumEventAgeInSeconds;
        }

        public GetEventStreamingResponseBodyDataRunOptionsRetryStrategy setMaximumRetryAttempts(Float maximumRetryAttempts) {
            this.maximumRetryAttempts = maximumRetryAttempts;
            return this;
        }
        public Float getMaximumRetryAttempts() {
            return this.maximumRetryAttempts;
        }

        public GetEventStreamingResponseBodyDataRunOptionsRetryStrategy setPushRetryStrategy(String pushRetryStrategy) {
            this.pushRetryStrategy = pushRetryStrategy;
            return this;
        }
        public String getPushRetryStrategy() {
            return this.pushRetryStrategy;
        }

    }

    public static class GetEventStreamingResponseBodyDataRunOptions extends TeaModel {
        /**
         * <p>The batch window.</p>
         */
        @NameInMap("BatchWindow")
        public GetEventStreamingResponseBodyDataRunOptionsBatchWindow batchWindow;

        @NameInMap("BusinessOption")
        public GetEventStreamingResponseBodyDataRunOptionsBusinessOption businessOption;

        /**
         * <p>Indicates whether dead-letter queues are enabled. By default, dead-letter queues are disabled. Messages that fail to be pushed after allowed retries as specified by the retry policy are discarded.</p>
         */
        @NameInMap("DeadLetterQueue")
        public GetEventStreamingResponseBodyDataRunOptionsDeadLetterQueue deadLetterQueue;

        /**
         * <p>The fault tolerance policy. The value NONE specifies that faults are not tolerated, and the value All specifies that all faults are tolerated.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("ErrorsTolerance")
        public String errorsTolerance;

        /**
         * <p>The concurrency level.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MaximumTasks")
        public Integer maximumTasks;

        /**
         * <p>The information about the retry policy that is used if the event fails to be pushed.</p>
         */
        @NameInMap("RetryStrategy")
        public GetEventStreamingResponseBodyDataRunOptionsRetryStrategy retryStrategy;

        @NameInMap("Throttling")
        public Integer throttling;

        public static GetEventStreamingResponseBodyDataRunOptions build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataRunOptions self = new GetEventStreamingResponseBodyDataRunOptions();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataRunOptions setBatchWindow(GetEventStreamingResponseBodyDataRunOptionsBatchWindow batchWindow) {
            this.batchWindow = batchWindow;
            return this;
        }
        public GetEventStreamingResponseBodyDataRunOptionsBatchWindow getBatchWindow() {
            return this.batchWindow;
        }

        public GetEventStreamingResponseBodyDataRunOptions setBusinessOption(GetEventStreamingResponseBodyDataRunOptionsBusinessOption businessOption) {
            this.businessOption = businessOption;
            return this;
        }
        public GetEventStreamingResponseBodyDataRunOptionsBusinessOption getBusinessOption() {
            return this.businessOption;
        }

        public GetEventStreamingResponseBodyDataRunOptions setDeadLetterQueue(GetEventStreamingResponseBodyDataRunOptionsDeadLetterQueue deadLetterQueue) {
            this.deadLetterQueue = deadLetterQueue;
            return this;
        }
        public GetEventStreamingResponseBodyDataRunOptionsDeadLetterQueue getDeadLetterQueue() {
            return this.deadLetterQueue;
        }

        public GetEventStreamingResponseBodyDataRunOptions setErrorsTolerance(String errorsTolerance) {
            this.errorsTolerance = errorsTolerance;
            return this;
        }
        public String getErrorsTolerance() {
            return this.errorsTolerance;
        }

        public GetEventStreamingResponseBodyDataRunOptions setMaximumTasks(Integer maximumTasks) {
            this.maximumTasks = maximumTasks;
            return this;
        }
        public Integer getMaximumTasks() {
            return this.maximumTasks;
        }

        public GetEventStreamingResponseBodyDataRunOptions setRetryStrategy(GetEventStreamingResponseBodyDataRunOptionsRetryStrategy retryStrategy) {
            this.retryStrategy = retryStrategy;
            return this;
        }
        public GetEventStreamingResponseBodyDataRunOptionsRetryStrategy getRetryStrategy() {
            return this.retryStrategy;
        }

        public GetEventStreamingResponseBodyDataRunOptions setThrottling(Integer throttling) {
            this.throttling = throttling;
            return this;
        }
        public Integer getThrottling() {
            return this.throttling;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersHeaders extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersHeaders build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersHeaders self = new GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersHeaders();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersHeaders setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersHeaders setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersHeaders setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersKey extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersKey build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersKey self = new GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersKey();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersKey setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersKey setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersKey setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersNetworkType extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersNetworkType build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersNetworkType self = new GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersNetworkType();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersNetworkType setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersNetworkType setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersNetworkType setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersSecurityGroupId extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersSecurityGroupId build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersSecurityGroupId self = new GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersSecurityGroupId();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersSecurityGroupId setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersSecurityGroupId setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersSecurityGroupId setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersVSwitchIds extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersVSwitchIds build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersVSwitchIds self = new GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersVSwitchIds();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersVSwitchIds setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersVSwitchIds setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersVSwitchIds setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersValue extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersValue build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersValue self = new GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersValue();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersValue setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersValue setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersValue setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersVpcId extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersVpcId build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersVpcId self = new GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersVpcId();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersVpcId setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersVpcId setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersVpcId setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParameters extends TeaModel {
        @NameInMap("Acks")
        public String acks;

        @NameInMap("Bootstraps")
        public String bootstraps;

        @NameInMap("CompressionType")
        public String compressionType;

        @NameInMap("Headers")
        public GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersHeaders headers;

        @NameInMap("Key")
        public GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersKey key;

        @NameInMap("NetworkType")
        public GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersNetworkType networkType;

        @NameInMap("SaslMechanism")
        public String saslMechanism;

        @NameInMap("SaslPassword")
        public String saslPassword;

        @NameInMap("SaslUser")
        public String saslUser;

        @NameInMap("SecurityGroupId")
        public GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersSecurityGroupId securityGroupId;

        @NameInMap("SecurityProtocol")
        public String securityProtocol;

        @NameInMap("SslTruststoreCertificates")
        public String sslTruststoreCertificates;

        @NameInMap("Topic")
        public String topic;

        @NameInMap("VSwitchIds")
        public GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersVSwitchIds vSwitchIds;

        @NameInMap("Value")
        public GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersValue value;

        @NameInMap("VpcId")
        public GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersVpcId vpcId;

        public static GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParameters build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParameters self = new GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParameters();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParameters setAcks(String acks) {
            this.acks = acks;
            return this;
        }
        public String getAcks() {
            return this.acks;
        }

        public GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParameters setBootstraps(String bootstraps) {
            this.bootstraps = bootstraps;
            return this;
        }
        public String getBootstraps() {
            return this.bootstraps;
        }

        public GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParameters setCompressionType(String compressionType) {
            this.compressionType = compressionType;
            return this;
        }
        public String getCompressionType() {
            return this.compressionType;
        }

        public GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParameters setHeaders(GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersHeaders headers) {
            this.headers = headers;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersHeaders getHeaders() {
            return this.headers;
        }

        public GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParameters setKey(GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersKey key) {
            this.key = key;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersKey getKey() {
            return this.key;
        }

        public GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParameters setNetworkType(GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersNetworkType networkType) {
            this.networkType = networkType;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersNetworkType getNetworkType() {
            return this.networkType;
        }

        public GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParameters setSaslMechanism(String saslMechanism) {
            this.saslMechanism = saslMechanism;
            return this;
        }
        public String getSaslMechanism() {
            return this.saslMechanism;
        }

        public GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParameters setSaslPassword(String saslPassword) {
            this.saslPassword = saslPassword;
            return this;
        }
        public String getSaslPassword() {
            return this.saslPassword;
        }

        public GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParameters setSaslUser(String saslUser) {
            this.saslUser = saslUser;
            return this;
        }
        public String getSaslUser() {
            return this.saslUser;
        }

        public GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParameters setSecurityGroupId(GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersSecurityGroupId securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersSecurityGroupId getSecurityGroupId() {
            return this.securityGroupId;
        }

        public GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParameters setSecurityProtocol(String securityProtocol) {
            this.securityProtocol = securityProtocol;
            return this;
        }
        public String getSecurityProtocol() {
            return this.securityProtocol;
        }

        public GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParameters setSslTruststoreCertificates(String sslTruststoreCertificates) {
            this.sslTruststoreCertificates = sslTruststoreCertificates;
            return this;
        }
        public String getSslTruststoreCertificates() {
            return this.sslTruststoreCertificates;
        }

        public GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParameters setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParameters setVSwitchIds(GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersVSwitchIds vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersVSwitchIds getVSwitchIds() {
            return this.vSwitchIds;
        }

        public GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParameters setValue(GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersValue value) {
            this.value = value;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersValue getValue() {
            return this.value;
        }

        public GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParameters setVpcId(GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersVpcId vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParametersVpcId getVpcId() {
            return this.vpcId;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkApacheRocketMQCheckpointParametersConsumeTimestamp extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        /**
         * <strong>example:</strong>
         * <p>1570761026400</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkApacheRocketMQCheckpointParametersConsumeTimestamp build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkApacheRocketMQCheckpointParametersConsumeTimestamp self = new GetEventStreamingResponseBodyDataSinkSinkApacheRocketMQCheckpointParametersConsumeTimestamp();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkApacheRocketMQCheckpointParametersConsumeTimestamp setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkApacheRocketMQCheckpointParametersConsumeTimestamp setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkApacheRocketMQCheckpointParametersConsumeTimestamp setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkApacheRocketMQCheckpointParametersGroup extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

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

        public static GetEventStreamingResponseBodyDataSinkSinkApacheRocketMQCheckpointParametersGroup build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkApacheRocketMQCheckpointParametersGroup self = new GetEventStreamingResponseBodyDataSinkSinkApacheRocketMQCheckpointParametersGroup();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkApacheRocketMQCheckpointParametersGroup setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkApacheRocketMQCheckpointParametersGroup setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkApacheRocketMQCheckpointParametersGroup setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkApacheRocketMQCheckpointParametersTopic extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        /**
         * <strong>example:</strong>
         * <p>Mytopic</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkApacheRocketMQCheckpointParametersTopic build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkApacheRocketMQCheckpointParametersTopic self = new GetEventStreamingResponseBodyDataSinkSinkApacheRocketMQCheckpointParametersTopic();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkApacheRocketMQCheckpointParametersTopic setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkApacheRocketMQCheckpointParametersTopic setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkApacheRocketMQCheckpointParametersTopic setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkApacheRocketMQCheckpointParameters extends TeaModel {
        @NameInMap("ConsumeTimestamp")
        public GetEventStreamingResponseBodyDataSinkSinkApacheRocketMQCheckpointParametersConsumeTimestamp consumeTimestamp;

        @NameInMap("Group")
        public GetEventStreamingResponseBodyDataSinkSinkApacheRocketMQCheckpointParametersGroup group;

        /**
         * <strong>example:</strong>
         * <p>192.168.1.1:9876</p>
         */
        @NameInMap("InstanceEndpoint")
        public String instanceEndpoint;

        /**
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("InstancePassword")
        public String instancePassword;

        /**
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("InstanceUsername")
        public String instanceUsername;

        /**
         * <strong>example:</strong>
         * <p>PrivateNetwork</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <strong>example:</strong>
         * <p>sg-2ze5bmpw6adn0q******</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("Topic")
        public GetEventStreamingResponseBodyDataSinkSinkApacheRocketMQCheckpointParametersTopic topic;

        /**
         * <strong>example:</strong>
         * <p>vsw-uf62oqt1twuevrt******</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <strong>example:</strong>
         * <p>vpc-2zeccak5pb0j3ay******</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static GetEventStreamingResponseBodyDataSinkSinkApacheRocketMQCheckpointParameters build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkApacheRocketMQCheckpointParameters self = new GetEventStreamingResponseBodyDataSinkSinkApacheRocketMQCheckpointParameters();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkApacheRocketMQCheckpointParameters setConsumeTimestamp(GetEventStreamingResponseBodyDataSinkSinkApacheRocketMQCheckpointParametersConsumeTimestamp consumeTimestamp) {
            this.consumeTimestamp = consumeTimestamp;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkApacheRocketMQCheckpointParametersConsumeTimestamp getConsumeTimestamp() {
            return this.consumeTimestamp;
        }

        public GetEventStreamingResponseBodyDataSinkSinkApacheRocketMQCheckpointParameters setGroup(GetEventStreamingResponseBodyDataSinkSinkApacheRocketMQCheckpointParametersGroup group) {
            this.group = group;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkApacheRocketMQCheckpointParametersGroup getGroup() {
            return this.group;
        }

        public GetEventStreamingResponseBodyDataSinkSinkApacheRocketMQCheckpointParameters setInstanceEndpoint(String instanceEndpoint) {
            this.instanceEndpoint = instanceEndpoint;
            return this;
        }
        public String getInstanceEndpoint() {
            return this.instanceEndpoint;
        }

        public GetEventStreamingResponseBodyDataSinkSinkApacheRocketMQCheckpointParameters setInstancePassword(String instancePassword) {
            this.instancePassword = instancePassword;
            return this;
        }
        public String getInstancePassword() {
            return this.instancePassword;
        }

        public GetEventStreamingResponseBodyDataSinkSinkApacheRocketMQCheckpointParameters setInstanceUsername(String instanceUsername) {
            this.instanceUsername = instanceUsername;
            return this;
        }
        public String getInstanceUsername() {
            return this.instanceUsername;
        }

        public GetEventStreamingResponseBodyDataSinkSinkApacheRocketMQCheckpointParameters setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public GetEventStreamingResponseBodyDataSinkSinkApacheRocketMQCheckpointParameters setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public GetEventStreamingResponseBodyDataSinkSinkApacheRocketMQCheckpointParameters setTopic(GetEventStreamingResponseBodyDataSinkSinkApacheRocketMQCheckpointParametersTopic topic) {
            this.topic = topic;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkApacheRocketMQCheckpointParametersTopic getTopic() {
            return this.topic;
        }

        public GetEventStreamingResponseBodyDataSinkSinkApacheRocketMQCheckpointParameters setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public GetEventStreamingResponseBodyDataSinkSinkApacheRocketMQCheckpointParameters setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkCustomizedKafkaConnectorParametersConnectorParameters extends TeaModel {
        /**
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
         * <strong>example:</strong>
         * <p>mongo-sink</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetEventStreamingResponseBodyDataSinkSinkCustomizedKafkaConnectorParametersConnectorParameters build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkCustomizedKafkaConnectorParametersConnectorParameters self = new GetEventStreamingResponseBodyDataSinkSinkCustomizedKafkaConnectorParametersConnectorParameters();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkCustomizedKafkaConnectorParametersConnectorParameters setConfig(java.util.Map<String, ?> config) {
            this.config = config;
            return this;
        }
        public java.util.Map<String, ?> getConfig() {
            return this.config;
        }

        public GetEventStreamingResponseBodyDataSinkSinkCustomizedKafkaConnectorParametersConnectorParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkCustomizedKafkaConnectorParameters extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>&quot;<a href="https://examplebucket.oss-cn-hangzhou.aliyuncs.com/testDoc/Old_Homebrew/2024-06-26%2022%3A34%3A08/opt/homebrew/homebrew/Library/Homebrew/test/support/fixtures/cask/AppWithBinary.zip?OSSAccessKeyId=ri&Expires=1725539627&Signature=rb8q3OpV">https://examplebucket.oss-cn-hangzhou.aliyuncs.com/testDoc/Old_Homebrew/2024-06-26%2022%3A34%3A08/opt/homebrew/homebrew/Library/Homebrew/test/support/fixtures/cask/AppWithBinary.zip?OSSAccessKeyId=ri&amp;Expires=1725539627&amp;Signature=rb8q3OpV</a>******&quot;</p>
         */
        @NameInMap("ConnectorPackageUrl")
        public String connectorPackageUrl;

        @NameInMap("ConnectorParameters")
        public GetEventStreamingResponseBodyDataSinkSinkCustomizedKafkaConnectorParametersConnectorParameters connectorParameters;

        /**
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

        public static GetEventStreamingResponseBodyDataSinkSinkCustomizedKafkaConnectorParameters build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkCustomizedKafkaConnectorParameters self = new GetEventStreamingResponseBodyDataSinkSinkCustomizedKafkaConnectorParameters();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkCustomizedKafkaConnectorParameters setConnectorPackageUrl(String connectorPackageUrl) {
            this.connectorPackageUrl = connectorPackageUrl;
            return this;
        }
        public String getConnectorPackageUrl() {
            return this.connectorPackageUrl;
        }

        public GetEventStreamingResponseBodyDataSinkSinkCustomizedKafkaConnectorParameters setConnectorParameters(GetEventStreamingResponseBodyDataSinkSinkCustomizedKafkaConnectorParametersConnectorParameters connectorParameters) {
            this.connectorParameters = connectorParameters;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkCustomizedKafkaConnectorParametersConnectorParameters getConnectorParameters() {
            return this.connectorParameters;
        }

        public GetEventStreamingResponseBodyDataSinkSinkCustomizedKafkaConnectorParameters setWorkerParameters(java.util.Map<String, ?> workerParameters) {
            this.workerParameters = workerParameters;
            return this;
        }
        public java.util.Map<String, ?> getWorkerParameters() {
            return this.workerParameters;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkCustomizedKafkaParameters extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>90be1f96-4229-4535-bb76-34b4f6fb****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        public static GetEventStreamingResponseBodyDataSinkSinkCustomizedKafkaParameters build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkCustomizedKafkaParameters self = new GetEventStreamingResponseBodyDataSinkSinkCustomizedKafkaParameters();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkCustomizedKafkaParameters setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersDashVectorSchemaParametersName extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersDashVectorSchemaParametersName build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersDashVectorSchemaParametersName self = new GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersDashVectorSchemaParametersName();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersDashVectorSchemaParametersName setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersDashVectorSchemaParametersName setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersDashVectorSchemaParametersName setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersDashVectorSchemaParametersType extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersDashVectorSchemaParametersType build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersDashVectorSchemaParametersType self = new GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersDashVectorSchemaParametersType();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersDashVectorSchemaParametersType setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersDashVectorSchemaParametersType setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersDashVectorSchemaParametersType setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersDashVectorSchemaParametersValue extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersDashVectorSchemaParametersValue build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersDashVectorSchemaParametersValue self = new GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersDashVectorSchemaParametersValue();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersDashVectorSchemaParametersValue setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersDashVectorSchemaParametersValue setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersDashVectorSchemaParametersValue setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersDashVectorSchemaParameters extends TeaModel {
        @NameInMap("Name")
        public GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersDashVectorSchemaParametersName name;

        @NameInMap("Type")
        public GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersDashVectorSchemaParametersType type;

        @NameInMap("Value")
        public GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersDashVectorSchemaParametersValue value;

        public static GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersDashVectorSchemaParameters build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersDashVectorSchemaParameters self = new GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersDashVectorSchemaParameters();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersDashVectorSchemaParameters setName(GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersDashVectorSchemaParametersName name) {
            this.name = name;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersDashVectorSchemaParametersName getName() {
            return this.name;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersDashVectorSchemaParameters setType(GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersDashVectorSchemaParametersType type) {
            this.type = type;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersDashVectorSchemaParametersType getType() {
            return this.type;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersDashVectorSchemaParameters setValue(GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersDashVectorSchemaParametersValue value) {
            this.value = value;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersDashVectorSchemaParametersValue getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersPartition extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        /**
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersPartition build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersPartition self = new GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersPartition();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersPartition setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersPartition setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersPartition setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersPrimaryKeyId extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>JSONPATH</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <strong>example:</strong>
         * <p>${ID}</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <strong>example:</strong>
         * <p>$.data.requestId</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersPrimaryKeyId build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersPrimaryKeyId self = new GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersPrimaryKeyId();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersPrimaryKeyId setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersPrimaryKeyId setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersPrimaryKeyId setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersVector extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>JSONPATH</p>
         */
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        /**
         * <strong>example:</strong>
         * <p>$.data.messageBody</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersVector build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersVector self = new GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersVector();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersVector setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersVector setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersVector setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkDashVectorParameters extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Q34nExQH7sQ****</p>
         */
        @NameInMap("ApiKey")
        public String apiKey;

        /**
         * <strong>example:</strong>
         * <p>collection1</p>
         */
        @NameInMap("Collection")
        public String collection;

        @NameInMap("DashVectorSchemaParameters")
        public java.util.List<GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersDashVectorSchemaParameters> dashVectorSchemaParameters;

        /**
         * <strong>example:</strong>
         * <p>vrs-cn-lbj3ru1***</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>PublicNetwork</p>
         */
        @NameInMap("Network")
        public String network;

        /**
         * <strong>example:</strong>
         * <p>Upsert</p>
         */
        @NameInMap("Operation")
        public String operation;

        @NameInMap("Partition")
        public GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersPartition partition;

        @NameInMap("PrimaryKeyId")
        public GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersPrimaryKeyId primaryKeyId;

        @NameInMap("Vector")
        public GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersVector vector;

        public static GetEventStreamingResponseBodyDataSinkSinkDashVectorParameters build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkDashVectorParameters self = new GetEventStreamingResponseBodyDataSinkSinkDashVectorParameters();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkDashVectorParameters setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDashVectorParameters setCollection(String collection) {
            this.collection = collection;
            return this;
        }
        public String getCollection() {
            return this.collection;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDashVectorParameters setDashVectorSchemaParameters(java.util.List<GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersDashVectorSchemaParameters> dashVectorSchemaParameters) {
            this.dashVectorSchemaParameters = dashVectorSchemaParameters;
            return this;
        }
        public java.util.List<GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersDashVectorSchemaParameters> getDashVectorSchemaParameters() {
            return this.dashVectorSchemaParameters;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDashVectorParameters setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDashVectorParameters setNetwork(String network) {
            this.network = network;
            return this;
        }
        public String getNetwork() {
            return this.network;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDashVectorParameters setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDashVectorParameters setPartition(GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersPartition partition) {
            this.partition = partition;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersPartition getPartition() {
            return this.partition;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDashVectorParameters setPrimaryKeyId(GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersPrimaryKeyId primaryKeyId) {
            this.primaryKeyId = primaryKeyId;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersPrimaryKeyId getPrimaryKeyId() {
            return this.primaryKeyId;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDashVectorParameters setVector(GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersVector vector) {
            this.vector = vector;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkDashVectorParametersVector getVector() {
            return this.vector;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkDataHubParametersBody extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ORIGINAL</p>
         */
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkDataHubParametersBody build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkDataHubParametersBody self = new GetEventStreamingResponseBodyDataSinkSinkDataHubParametersBody();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkDataHubParametersBody setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDataHubParametersBody setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDataHubParametersBody setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkDataHubParametersProject extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        /**
         * <strong>example:</strong>
         * <p>demo-project</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkDataHubParametersProject build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkDataHubParametersProject self = new GetEventStreamingResponseBodyDataSinkSinkDataHubParametersProject();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkDataHubParametersProject setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDataHubParametersProject setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDataHubParametersProject setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkDataHubParametersRoleName extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        /**
         * <strong>example:</strong>
         * <p>test-role</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkDataHubParametersRoleName build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkDataHubParametersRoleName self = new GetEventStreamingResponseBodyDataSinkSinkDataHubParametersRoleName();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkDataHubParametersRoleName setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDataHubParametersRoleName setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDataHubParametersRoleName setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkDataHubParametersTopic extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        /**
         * <strong>example:</strong>
         * <p>demo-topic</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkDataHubParametersTopic build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkDataHubParametersTopic self = new GetEventStreamingResponseBodyDataSinkSinkDataHubParametersTopic();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkDataHubParametersTopic setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDataHubParametersTopic setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDataHubParametersTopic setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkDataHubParametersTopicSchema extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <strong>example:</strong>
         * <p>{&quot;k1&quot;:&quot;${k1}&quot;,&quot;k2&quot;:&quot;${k2}&quot;}</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <strong>example:</strong>
         * <p>{&quot;k1&quot;:&quot;value1&quot;,&quot;k2&quot;:&quot;value2&quot;}</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkDataHubParametersTopicSchema build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkDataHubParametersTopicSchema self = new GetEventStreamingResponseBodyDataSinkSinkDataHubParametersTopicSchema();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkDataHubParametersTopicSchema setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDataHubParametersTopicSchema setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDataHubParametersTopicSchema setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkDataHubParametersTopicType extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        /**
         * <strong>example:</strong>
         * <p>TUPLE</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkDataHubParametersTopicType build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkDataHubParametersTopicType self = new GetEventStreamingResponseBodyDataSinkSinkDataHubParametersTopicType();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkDataHubParametersTopicType setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDataHubParametersTopicType setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDataHubParametersTopicType setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkDataHubParameters extends TeaModel {
        @NameInMap("Body")
        public GetEventStreamingResponseBodyDataSinkSinkDataHubParametersBody body;

        @NameInMap("Project")
        public GetEventStreamingResponseBodyDataSinkSinkDataHubParametersProject project;

        @NameInMap("RoleName")
        public GetEventStreamingResponseBodyDataSinkSinkDataHubParametersRoleName roleName;

        @NameInMap("Topic")
        public GetEventStreamingResponseBodyDataSinkSinkDataHubParametersTopic topic;

        @NameInMap("TopicSchema")
        public GetEventStreamingResponseBodyDataSinkSinkDataHubParametersTopicSchema topicSchema;

        @NameInMap("TopicType")
        public GetEventStreamingResponseBodyDataSinkSinkDataHubParametersTopicType topicType;

        public static GetEventStreamingResponseBodyDataSinkSinkDataHubParameters build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkDataHubParameters self = new GetEventStreamingResponseBodyDataSinkSinkDataHubParameters();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkDataHubParameters setBody(GetEventStreamingResponseBodyDataSinkSinkDataHubParametersBody body) {
            this.body = body;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkDataHubParametersBody getBody() {
            return this.body;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDataHubParameters setProject(GetEventStreamingResponseBodyDataSinkSinkDataHubParametersProject project) {
            this.project = project;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkDataHubParametersProject getProject() {
            return this.project;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDataHubParameters setRoleName(GetEventStreamingResponseBodyDataSinkSinkDataHubParametersRoleName roleName) {
            this.roleName = roleName;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkDataHubParametersRoleName getRoleName() {
            return this.roleName;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDataHubParameters setTopic(GetEventStreamingResponseBodyDataSinkSinkDataHubParametersTopic topic) {
            this.topic = topic;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkDataHubParametersTopic getTopic() {
            return this.topic;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDataHubParameters setTopicSchema(GetEventStreamingResponseBodyDataSinkSinkDataHubParametersTopicSchema topicSchema) {
            this.topicSchema = topicSchema;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkDataHubParametersTopicSchema getTopicSchema() {
            return this.topicSchema;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDataHubParameters setTopicType(GetEventStreamingResponseBodyDataSinkSinkDataHubParametersTopicType topicType) {
            this.topicType = topicType;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkDataHubParametersTopicType getTopicType() {
            return this.topicType;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkDorisParametersBeHttpEndpoint extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkDorisParametersBeHttpEndpoint build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkDorisParametersBeHttpEndpoint self = new GetEventStreamingResponseBodyDataSinkSinkDorisParametersBeHttpEndpoint();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersBeHttpEndpoint setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersBeHttpEndpoint setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersBeHttpEndpoint setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkDorisParametersBody extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkDorisParametersBody build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkDorisParametersBody self = new GetEventStreamingResponseBodyDataSinkSinkDorisParametersBody();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersBody setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersBody setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersBody setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkDorisParametersDatabase extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkDorisParametersDatabase build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkDorisParametersDatabase self = new GetEventStreamingResponseBodyDataSinkSinkDorisParametersDatabase();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersDatabase setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersDatabase setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersDatabase setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkDorisParametersFeHttpEndpoint extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkDorisParametersFeHttpEndpoint build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkDorisParametersFeHttpEndpoint self = new GetEventStreamingResponseBodyDataSinkSinkDorisParametersFeHttpEndpoint();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersFeHttpEndpoint setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersFeHttpEndpoint setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersFeHttpEndpoint setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkDorisParametersNetworkType extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkDorisParametersNetworkType build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkDorisParametersNetworkType self = new GetEventStreamingResponseBodyDataSinkSinkDorisParametersNetworkType();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersNetworkType setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersNetworkType setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersNetworkType setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkDorisParametersPassword extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkDorisParametersPassword build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkDorisParametersPassword self = new GetEventStreamingResponseBodyDataSinkSinkDorisParametersPassword();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersPassword setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersPassword setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersPassword setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkDorisParametersQueryEndpoint extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkDorisParametersQueryEndpoint build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkDorisParametersQueryEndpoint self = new GetEventStreamingResponseBodyDataSinkSinkDorisParametersQueryEndpoint();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersQueryEndpoint setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersQueryEndpoint setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersQueryEndpoint setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkDorisParametersSecurityGroupId extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkDorisParametersSecurityGroupId build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkDorisParametersSecurityGroupId self = new GetEventStreamingResponseBodyDataSinkSinkDorisParametersSecurityGroupId();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersSecurityGroupId setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersSecurityGroupId setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersSecurityGroupId setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkDorisParametersTable extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkDorisParametersTable build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkDorisParametersTable self = new GetEventStreamingResponseBodyDataSinkSinkDorisParametersTable();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersTable setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersTable setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersTable setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkDorisParametersUserName extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkDorisParametersUserName build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkDorisParametersUserName self = new GetEventStreamingResponseBodyDataSinkSinkDorisParametersUserName();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersUserName setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersUserName setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersUserName setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkDorisParametersVSwitchIds extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkDorisParametersVSwitchIds build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkDorisParametersVSwitchIds self = new GetEventStreamingResponseBodyDataSinkSinkDorisParametersVSwitchIds();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersVSwitchIds setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersVSwitchIds setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersVSwitchIds setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkDorisParametersVpcId extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkDorisParametersVpcId build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkDorisParametersVpcId self = new GetEventStreamingResponseBodyDataSinkSinkDorisParametersVpcId();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersVpcId setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersVpcId setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersVpcId setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkDorisParameters extends TeaModel {
        @NameInMap("BeHttpEndpoint")
        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersBeHttpEndpoint beHttpEndpoint;

        @NameInMap("Body")
        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersBody body;

        @NameInMap("Database")
        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersDatabase database;

        @NameInMap("FeHttpEndpoint")
        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersFeHttpEndpoint feHttpEndpoint;

        @NameInMap("NetworkType")
        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersNetworkType networkType;

        @NameInMap("Password")
        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersPassword password;

        @NameInMap("QueryEndpoint")
        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersQueryEndpoint queryEndpoint;

        @NameInMap("SecurityGroupId")
        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersSecurityGroupId securityGroupId;

        @NameInMap("Table")
        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersTable table;

        @NameInMap("UserName")
        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersUserName userName;

        @NameInMap("VSwitchIds")
        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersVSwitchIds vSwitchIds;

        @NameInMap("VpcId")
        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersVpcId vpcId;

        public static GetEventStreamingResponseBodyDataSinkSinkDorisParameters build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkDorisParameters self = new GetEventStreamingResponseBodyDataSinkSinkDorisParameters();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkDorisParameters setBeHttpEndpoint(GetEventStreamingResponseBodyDataSinkSinkDorisParametersBeHttpEndpoint beHttpEndpoint) {
            this.beHttpEndpoint = beHttpEndpoint;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersBeHttpEndpoint getBeHttpEndpoint() {
            return this.beHttpEndpoint;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDorisParameters setBody(GetEventStreamingResponseBodyDataSinkSinkDorisParametersBody body) {
            this.body = body;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersBody getBody() {
            return this.body;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDorisParameters setDatabase(GetEventStreamingResponseBodyDataSinkSinkDorisParametersDatabase database) {
            this.database = database;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersDatabase getDatabase() {
            return this.database;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDorisParameters setFeHttpEndpoint(GetEventStreamingResponseBodyDataSinkSinkDorisParametersFeHttpEndpoint feHttpEndpoint) {
            this.feHttpEndpoint = feHttpEndpoint;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersFeHttpEndpoint getFeHttpEndpoint() {
            return this.feHttpEndpoint;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDorisParameters setNetworkType(GetEventStreamingResponseBodyDataSinkSinkDorisParametersNetworkType networkType) {
            this.networkType = networkType;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersNetworkType getNetworkType() {
            return this.networkType;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDorisParameters setPassword(GetEventStreamingResponseBodyDataSinkSinkDorisParametersPassword password) {
            this.password = password;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersPassword getPassword() {
            return this.password;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDorisParameters setQueryEndpoint(GetEventStreamingResponseBodyDataSinkSinkDorisParametersQueryEndpoint queryEndpoint) {
            this.queryEndpoint = queryEndpoint;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersQueryEndpoint getQueryEndpoint() {
            return this.queryEndpoint;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDorisParameters setSecurityGroupId(GetEventStreamingResponseBodyDataSinkSinkDorisParametersSecurityGroupId securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersSecurityGroupId getSecurityGroupId() {
            return this.securityGroupId;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDorisParameters setTable(GetEventStreamingResponseBodyDataSinkSinkDorisParametersTable table) {
            this.table = table;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersTable getTable() {
            return this.table;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDorisParameters setUserName(GetEventStreamingResponseBodyDataSinkSinkDorisParametersUserName userName) {
            this.userName = userName;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersUserName getUserName() {
            return this.userName;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDorisParameters setVSwitchIds(GetEventStreamingResponseBodyDataSinkSinkDorisParametersVSwitchIds vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersVSwitchIds getVSwitchIds() {
            return this.vSwitchIds;
        }

        public GetEventStreamingResponseBodyDataSinkSinkDorisParameters setVpcId(GetEventStreamingResponseBodyDataSinkSinkDorisParametersVpcId vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkDorisParametersVpcId getVpcId() {
            return this.vpcId;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkFcParametersBody extends TeaModel {
        /**
         * <p>The method that is used to transform the event.</p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which the event is transformed.</p>
         * 
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value before the transformation.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;key&quot;: &quot;value&quot;
         * }</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkFcParametersBody build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkFcParametersBody self = new GetEventStreamingResponseBodyDataSinkSinkFcParametersBody();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkFcParametersBody setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkFcParametersBody setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkFcParametersBody setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkFcParametersConcurrency extends TeaModel {
        /**
         * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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

        public static GetEventStreamingResponseBodyDataSinkSinkFcParametersConcurrency build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkFcParametersConcurrency self = new GetEventStreamingResponseBodyDataSinkSinkFcParametersConcurrency();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkFcParametersConcurrency setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkFcParametersConcurrency setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkFcParametersConcurrency setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkFcParametersDataFormat extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>JSONPATH</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <strong>example:</strong>
         * <p>$.data.key</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <strong>example:</strong>
         * <p>{
         *       &quot;key&quot;: &quot;value&quot;
         * }</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkFcParametersDataFormat build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkFcParametersDataFormat self = new GetEventStreamingResponseBodyDataSinkSinkFcParametersDataFormat();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkFcParametersDataFormat setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkFcParametersDataFormat setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkFcParametersDataFormat setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkFcParametersFunctionName extends TeaModel {
        /**
         * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
         * <p>The function name.</p>
         * 
         * <strong>example:</strong>
         * <p>mFunction</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkFcParametersFunctionName build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkFcParametersFunctionName self = new GetEventStreamingResponseBodyDataSinkSinkFcParametersFunctionName();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkFcParametersFunctionName setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkFcParametersFunctionName setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkFcParametersFunctionName setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkFcParametersInvocationType extends TeaModel {
        /**
         * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
         * <p>The invocation type.</p>
         * 
         * <strong>example:</strong>
         * <p>Async</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkFcParametersInvocationType build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkFcParametersInvocationType self = new GetEventStreamingResponseBodyDataSinkSinkFcParametersInvocationType();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkFcParametersInvocationType setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkFcParametersInvocationType setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkFcParametersInvocationType setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkFcParametersQualifier extends TeaModel {
        /**
         * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
         * <p>The alias of the service to which the function belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>LATEST</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkFcParametersQualifier build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkFcParametersQualifier self = new GetEventStreamingResponseBodyDataSinkSinkFcParametersQualifier();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkFcParametersQualifier setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkFcParametersQualifier setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkFcParametersQualifier setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkFcParametersServiceName extends TeaModel {
        /**
         * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
         * <p>The name of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>myService</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkFcParametersServiceName build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkFcParametersServiceName self = new GetEventStreamingResponseBodyDataSinkSinkFcParametersServiceName();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkFcParametersServiceName setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkFcParametersServiceName setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkFcParametersServiceName setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkFcParameters extends TeaModel {
        /**
         * <p>The message body that is sent to the function.</p>
         */
        @NameInMap("Body")
        public GetEventStreamingResponseBodyDataSinkSinkFcParametersBody body;

        /**
         * <p>The delivery concurrency. Minimum value: 1.</p>
         */
        @NameInMap("Concurrency")
        public GetEventStreamingResponseBodyDataSinkSinkFcParametersConcurrency concurrency;

        @NameInMap("DataFormat")
        public GetEventStreamingResponseBodyDataSinkSinkFcParametersDataFormat dataFormat;

        /**
         * <p>The function name.</p>
         */
        @NameInMap("FunctionName")
        public GetEventStreamingResponseBodyDataSinkSinkFcParametersFunctionName functionName;

        /**
         * <p>The invocation type. Valid values: Sync: synchronous Async: asynchronous</p>
         */
        @NameInMap("InvocationType")
        public GetEventStreamingResponseBodyDataSinkSinkFcParametersInvocationType invocationType;

        /**
         * <p>The alias of the service to which the function belongs.</p>
         */
        @NameInMap("Qualifier")
        public GetEventStreamingResponseBodyDataSinkSinkFcParametersQualifier qualifier;

        /**
         * <p>The service name.</p>
         */
        @NameInMap("ServiceName")
        public GetEventStreamingResponseBodyDataSinkSinkFcParametersServiceName serviceName;

        public static GetEventStreamingResponseBodyDataSinkSinkFcParameters build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkFcParameters self = new GetEventStreamingResponseBodyDataSinkSinkFcParameters();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkFcParameters setBody(GetEventStreamingResponseBodyDataSinkSinkFcParametersBody body) {
            this.body = body;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkFcParametersBody getBody() {
            return this.body;
        }

        public GetEventStreamingResponseBodyDataSinkSinkFcParameters setConcurrency(GetEventStreamingResponseBodyDataSinkSinkFcParametersConcurrency concurrency) {
            this.concurrency = concurrency;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkFcParametersConcurrency getConcurrency() {
            return this.concurrency;
        }

        public GetEventStreamingResponseBodyDataSinkSinkFcParameters setDataFormat(GetEventStreamingResponseBodyDataSinkSinkFcParametersDataFormat dataFormat) {
            this.dataFormat = dataFormat;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkFcParametersDataFormat getDataFormat() {
            return this.dataFormat;
        }

        public GetEventStreamingResponseBodyDataSinkSinkFcParameters setFunctionName(GetEventStreamingResponseBodyDataSinkSinkFcParametersFunctionName functionName) {
            this.functionName = functionName;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkFcParametersFunctionName getFunctionName() {
            return this.functionName;
        }

        public GetEventStreamingResponseBodyDataSinkSinkFcParameters setInvocationType(GetEventStreamingResponseBodyDataSinkSinkFcParametersInvocationType invocationType) {
            this.invocationType = invocationType;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkFcParametersInvocationType getInvocationType() {
            return this.invocationType;
        }

        public GetEventStreamingResponseBodyDataSinkSinkFcParameters setQualifier(GetEventStreamingResponseBodyDataSinkSinkFcParametersQualifier qualifier) {
            this.qualifier = qualifier;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkFcParametersQualifier getQualifier() {
            return this.qualifier;
        }

        public GetEventStreamingResponseBodyDataSinkSinkFcParameters setServiceName(GetEventStreamingResponseBodyDataSinkSinkFcParametersServiceName serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkFcParametersServiceName getServiceName() {
            return this.serviceName;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkFnfParametersExecutionName extends TeaModel {
        /**
         * <p>The method that is used to transform events. Default value: CONSTANT.</p>
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

        public static GetEventStreamingResponseBodyDataSinkSinkFnfParametersExecutionName build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkFnfParametersExecutionName self = new GetEventStreamingResponseBodyDataSinkSinkFnfParametersExecutionName();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkFnfParametersExecutionName setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkFnfParametersExecutionName setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkFnfParametersExecutionName setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkFnfParametersFlowName extends TeaModel {
        /**
         * <p>The method that is used to transform events. Default value: CONSTANT.</p>
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

        public static GetEventStreamingResponseBodyDataSinkSinkFnfParametersFlowName build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkFnfParametersFlowName self = new GetEventStreamingResponseBodyDataSinkSinkFnfParametersFlowName();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkFnfParametersFlowName setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkFnfParametersFlowName setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkFnfParametersFlowName setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkFnfParametersInput extends TeaModel {
        /**
         * <p>The method that is used to transform events. Default value: CONSTANT.</p>
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
         * <p>None</p>
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

        public static GetEventStreamingResponseBodyDataSinkSinkFnfParametersInput build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkFnfParametersInput self = new GetEventStreamingResponseBodyDataSinkSinkFnfParametersInput();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkFnfParametersInput setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkFnfParametersInput setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkFnfParametersInput setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkFnfParametersRoleName extends TeaModel {
        /**
         * <p>The method that is used to transform events. Default value: CONSTANT.</p>
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

        public static GetEventStreamingResponseBodyDataSinkSinkFnfParametersRoleName build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkFnfParametersRoleName self = new GetEventStreamingResponseBodyDataSinkSinkFnfParametersRoleName();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkFnfParametersRoleName setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkFnfParametersRoleName setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkFnfParametersRoleName setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkFnfParameters extends TeaModel {
        /**
         * <p>The execution name.</p>
         */
        @NameInMap("ExecutionName")
        public GetEventStreamingResponseBodyDataSinkSinkFnfParametersExecutionName executionName;

        /**
         * <p>The flow name.</p>
         */
        @NameInMap("FlowName")
        public GetEventStreamingResponseBodyDataSinkSinkFnfParametersFlowName flowName;

        /**
         * <p>The execution input information.</p>
         */
        @NameInMap("Input")
        public GetEventStreamingResponseBodyDataSinkSinkFnfParametersInput input;

        /**
         * <p>The role name.</p>
         */
        @NameInMap("RoleName")
        public GetEventStreamingResponseBodyDataSinkSinkFnfParametersRoleName roleName;

        public static GetEventStreamingResponseBodyDataSinkSinkFnfParameters build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkFnfParameters self = new GetEventStreamingResponseBodyDataSinkSinkFnfParameters();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkFnfParameters setExecutionName(GetEventStreamingResponseBodyDataSinkSinkFnfParametersExecutionName executionName) {
            this.executionName = executionName;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkFnfParametersExecutionName getExecutionName() {
            return this.executionName;
        }

        public GetEventStreamingResponseBodyDataSinkSinkFnfParameters setFlowName(GetEventStreamingResponseBodyDataSinkSinkFnfParametersFlowName flowName) {
            this.flowName = flowName;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkFnfParametersFlowName getFlowName() {
            return this.flowName;
        }

        public GetEventStreamingResponseBodyDataSinkSinkFnfParameters setInput(GetEventStreamingResponseBodyDataSinkSinkFnfParametersInput input) {
            this.input = input;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkFnfParametersInput getInput() {
            return this.input;
        }

        public GetEventStreamingResponseBodyDataSinkSinkFnfParameters setRoleName(GetEventStreamingResponseBodyDataSinkSinkFnfParametersRoleName roleName) {
            this.roleName = roleName;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkFnfParametersRoleName getRoleName() {
            return this.roleName;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkKafkaParametersAcks extends TeaModel {
        /**
         * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
         * <p>The acknowledgment information.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkKafkaParametersAcks build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkKafkaParametersAcks self = new GetEventStreamingResponseBodyDataSinkSinkKafkaParametersAcks();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkKafkaParametersAcks setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkKafkaParametersAcks setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkKafkaParametersAcks setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkKafkaParametersHeaders extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <strong>example:</strong>
         * <p>{
         *       &quot;key&quot;: &quot;value&quot;
         * }</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkKafkaParametersHeaders build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkKafkaParametersHeaders self = new GetEventStreamingResponseBodyDataSinkSinkKafkaParametersHeaders();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkKafkaParametersHeaders setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkKafkaParametersHeaders setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkKafkaParametersHeaders setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkKafkaParametersInstanceId extends TeaModel {
        /**
         * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>Defaut_1283278472_sadkj</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkKafkaParametersInstanceId build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkKafkaParametersInstanceId self = new GetEventStreamingResponseBodyDataSinkSinkKafkaParametersInstanceId();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkKafkaParametersInstanceId setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkKafkaParametersInstanceId setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkKafkaParametersInstanceId setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkKafkaParametersKey extends TeaModel {
        /**
         * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
         * <p>The message key.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkKafkaParametersKey build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkKafkaParametersKey self = new GetEventStreamingResponseBodyDataSinkSinkKafkaParametersKey();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkKafkaParametersKey setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkKafkaParametersKey setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkKafkaParametersKey setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkKafkaParametersTopic extends TeaModel {
        /**
         * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
         * <p>The topic name.</p>
         * 
         * <strong>example:</strong>
         * <p>topic-test</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkKafkaParametersTopic build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkKafkaParametersTopic self = new GetEventStreamingResponseBodyDataSinkSinkKafkaParametersTopic();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkKafkaParametersTopic setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkKafkaParametersTopic setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkKafkaParametersTopic setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkKafkaParametersValue extends TeaModel {
        /**
         * <p>The method that is used to transform the event.</p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which the event is transformed.</p>
         * 
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value before the transformation.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;key&quot;: &quot;value&quot;
         * }</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkKafkaParametersValue build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkKafkaParametersValue self = new GetEventStreamingResponseBodyDataSinkSinkKafkaParametersValue();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkKafkaParametersValue setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkKafkaParametersValue setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkKafkaParametersValue setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkKafkaParameters extends TeaModel {
        /**
         * <p>The acknowledgment information.</p>
         */
        @NameInMap("Acks")
        public GetEventStreamingResponseBodyDataSinkSinkKafkaParametersAcks acks;

        @NameInMap("CompressionType")
        public String compressionType;

        @NameInMap("Headers")
        public GetEventStreamingResponseBodyDataSinkSinkKafkaParametersHeaders headers;

        /**
         * <p>The target service type is Message Queue for Apache Kafka.</p>
         */
        @NameInMap("InstanceId")
        public GetEventStreamingResponseBodyDataSinkSinkKafkaParametersInstanceId instanceId;

        /**
         * <p>The message key.</p>
         */
        @NameInMap("Key")
        public GetEventStreamingResponseBodyDataSinkSinkKafkaParametersKey key;

        /**
         * <p>The topic name.</p>
         */
        @NameInMap("Topic")
        public GetEventStreamingResponseBodyDataSinkSinkKafkaParametersTopic topic;

        /**
         * <p>The message content.</p>
         */
        @NameInMap("Value")
        public GetEventStreamingResponseBodyDataSinkSinkKafkaParametersValue value;

        public static GetEventStreamingResponseBodyDataSinkSinkKafkaParameters build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkKafkaParameters self = new GetEventStreamingResponseBodyDataSinkSinkKafkaParameters();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkKafkaParameters setAcks(GetEventStreamingResponseBodyDataSinkSinkKafkaParametersAcks acks) {
            this.acks = acks;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkKafkaParametersAcks getAcks() {
            return this.acks;
        }

        public GetEventStreamingResponseBodyDataSinkSinkKafkaParameters setCompressionType(String compressionType) {
            this.compressionType = compressionType;
            return this;
        }
        public String getCompressionType() {
            return this.compressionType;
        }

        public GetEventStreamingResponseBodyDataSinkSinkKafkaParameters setHeaders(GetEventStreamingResponseBodyDataSinkSinkKafkaParametersHeaders headers) {
            this.headers = headers;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkKafkaParametersHeaders getHeaders() {
            return this.headers;
        }

        public GetEventStreamingResponseBodyDataSinkSinkKafkaParameters setInstanceId(GetEventStreamingResponseBodyDataSinkSinkKafkaParametersInstanceId instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkKafkaParametersInstanceId getInstanceId() {
            return this.instanceId;
        }

        public GetEventStreamingResponseBodyDataSinkSinkKafkaParameters setKey(GetEventStreamingResponseBodyDataSinkSinkKafkaParametersKey key) {
            this.key = key;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkKafkaParametersKey getKey() {
            return this.key;
        }

        public GetEventStreamingResponseBodyDataSinkSinkKafkaParameters setTopic(GetEventStreamingResponseBodyDataSinkSinkKafkaParametersTopic topic) {
            this.topic = topic;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkKafkaParametersTopic getTopic() {
            return this.topic;
        }

        public GetEventStreamingResponseBodyDataSinkSinkKafkaParameters setValue(GetEventStreamingResponseBodyDataSinkSinkKafkaParametersValue value) {
            this.value = value;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkKafkaParametersValue getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkMNSParametersBody extends TeaModel {
        /**
         * <p>The method that is used to transform the event.</p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which the event is transformed.</p>
         * 
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value before the transformation.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;key&quot;: &quot;value&quot;
         * }</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkMNSParametersBody build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkMNSParametersBody self = new GetEventStreamingResponseBodyDataSinkSinkMNSParametersBody();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkMNSParametersBody setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkMNSParametersBody setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkMNSParametersBody setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkMNSParametersIsBase64Encode extends TeaModel {
        /**
         * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
         * <p>Specifies that Base64 encoding is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkMNSParametersIsBase64Encode build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkMNSParametersIsBase64Encode self = new GetEventStreamingResponseBodyDataSinkSinkMNSParametersIsBase64Encode();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkMNSParametersIsBase64Encode setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkMNSParametersIsBase64Encode setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkMNSParametersIsBase64Encode setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkMNSParametersQueueName extends TeaModel {
        /**
         * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
         * <p>The name of the MNS queue.</p>
         * 
         * <strong>example:</strong>
         * <p>MyQueue</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkMNSParametersQueueName build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkMNSParametersQueueName self = new GetEventStreamingResponseBodyDataSinkSinkMNSParametersQueueName();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkMNSParametersQueueName setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkMNSParametersQueueName setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkMNSParametersQueueName setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkMNSParameters extends TeaModel {
        /**
         * <p>The message content.</p>
         */
        @NameInMap("Body")
        public GetEventStreamingResponseBodyDataSinkSinkMNSParametersBody body;

        /**
         * <p>Indicates whether Base64 encoding is enabled.</p>
         */
        @NameInMap("IsBase64Encode")
        public GetEventStreamingResponseBodyDataSinkSinkMNSParametersIsBase64Encode isBase64Encode;

        /**
         * <p>The target service type is MNS.</p>
         */
        @NameInMap("QueueName")
        public GetEventStreamingResponseBodyDataSinkSinkMNSParametersQueueName queueName;

        public static GetEventStreamingResponseBodyDataSinkSinkMNSParameters build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkMNSParameters self = new GetEventStreamingResponseBodyDataSinkSinkMNSParameters();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkMNSParameters setBody(GetEventStreamingResponseBodyDataSinkSinkMNSParametersBody body) {
            this.body = body;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkMNSParametersBody getBody() {
            return this.body;
        }

        public GetEventStreamingResponseBodyDataSinkSinkMNSParameters setIsBase64Encode(GetEventStreamingResponseBodyDataSinkSinkMNSParametersIsBase64Encode isBase64Encode) {
            this.isBase64Encode = isBase64Encode;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkMNSParametersIsBase64Encode getIsBase64Encode() {
            return this.isBase64Encode;
        }

        public GetEventStreamingResponseBodyDataSinkSinkMNSParameters setQueueName(GetEventStreamingResponseBodyDataSinkSinkMNSParametersQueueName queueName) {
            this.queueName = queueName;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkMNSParametersQueueName getQueueName() {
            return this.queueName;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParametersBody extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <strong>example:</strong>
         * <p>{&quot;key&quot;: &quot;value&quot;}</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParametersBody build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParametersBody self = new GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParametersBody();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParametersBody setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParametersBody setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParametersBody setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParametersMessageId extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        /**
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParametersMessageId build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParametersMessageId self = new GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParametersMessageId();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParametersMessageId setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParametersMessageId setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParametersMessageId setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParametersProperties extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <strong>example:</strong>
         * <p>{&quot;env&quot;: &quot;prod&quot;}</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParametersProperties build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParametersProperties self = new GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParametersProperties();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParametersProperties setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParametersProperties setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParametersProperties setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParametersRoutingKey extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <strong>example:</strong>
         * <p>{&quot;Form&quot;: &quot;CONSTANT&quot;, &quot;Value&quot;: &quot;my-routing-key&quot;}</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParametersRoutingKey build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParametersRoutingKey self = new GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParametersRoutingKey();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParametersRoutingKey setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParametersRoutingKey setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParametersRoutingKey setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParameters extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ACL</p>
         */
        @NameInMap("AuthType")
        public String authType;

        @NameInMap("Body")
        public GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParametersBody body;

        /**
         * <strong>example:</strong>
         * <p>192.168.1.1:9876</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <strong>example:</strong>
         * <p>my-exchange</p>
         */
        @NameInMap("Exchange")
        public String exchange;

        @NameInMap("MessageId")
        public GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParametersMessageId messageId;

        /**
         * <strong>example:</strong>
         * <p>PublicNetwork</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Password")
        public String password;

        @NameInMap("Properties")
        public GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParametersProperties properties;

        /**
         * <strong>example:</strong>
         * <p>my-queue</p>
         */
        @NameInMap("QueueName")
        public String queueName;

        @NameInMap("RoutingKey")
        public GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParametersRoutingKey routingKey;

        /**
         * <strong>example:</strong>
         * <p>sg-uf6of9452b2pba82c ****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <strong>example:</strong>
         * <p>Exchange</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        /**
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("Username")
        public String username;

        /**
         * <strong>example:</strong>
         * <p>vsw-uf6of9452b2pba82c ****</p>
         */
        @NameInMap("VSwitchIds")
        public String vSwitchIds;

        /**
         * <strong>example:</strong>
         * <p>vhost1</p>
         */
        @NameInMap("VirtualHostName")
        public String virtualHostName;

        /**
         * <strong>example:</strong>
         * <p>vpc-uf6of9452b2pba82c ****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParameters build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParameters self = new GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParameters();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParameters setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParameters setBody(GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParametersBody body) {
            this.body = body;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParametersBody getBody() {
            return this.body;
        }

        public GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParameters setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParameters setExchange(String exchange) {
            this.exchange = exchange;
            return this;
        }
        public String getExchange() {
            return this.exchange;
        }

        public GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParameters setMessageId(GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParametersMessageId messageId) {
            this.messageId = messageId;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParametersMessageId getMessageId() {
            return this.messageId;
        }

        public GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParameters setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParameters setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParameters setProperties(GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParametersProperties properties) {
            this.properties = properties;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParametersProperties getProperties() {
            return this.properties;
        }

        public GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParameters setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParameters setRoutingKey(GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParametersRoutingKey routingKey) {
            this.routingKey = routingKey;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParametersRoutingKey getRoutingKey() {
            return this.routingKey;
        }

        public GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParameters setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParameters setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParameters setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParameters setVSwitchIds(String vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public String getVSwitchIds() {
            return this.vSwitchIds;
        }

        public GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParameters setVirtualHostName(String virtualHostName) {
            this.virtualHostName = virtualHostName;
            return this;
        }
        public String getVirtualHostName() {
            return this.virtualHostName;
        }

        public GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParameters setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersBody extends TeaModel {
        /**
         * <p>The method that is used to transform the event.</p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which the event is transformed.</p>
         * 
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value before the transformation.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;key&quot;: &quot;value&quot;
         * }</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersBody build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersBody self = new GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersBody();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersBody setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersBody setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersBody setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersExchange extends TeaModel {
        /**
         * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
         * <p>The name of the exchange in the Message Queue for RabbitMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>a_exchange</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersExchange build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersExchange self = new GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersExchange();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersExchange setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersExchange setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersExchange setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersInstanceId extends TeaModel {
        /**
         * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
         * <p>The ID of the Message Queue for RabbitMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>e5c9b727-e06c-4d7e-84d5-f8ce644e00bf</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersInstanceId build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersInstanceId self = new GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersInstanceId();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersInstanceId setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersInstanceId setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersInstanceId setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersMessageId extends TeaModel {
        /**
         * <p>The method that is used to transform the event.</p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which the event is transformed.</p>
         * 
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value before the transformation.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;key&quot;: &quot;value&quot;
         * }</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersMessageId build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersMessageId self = new GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersMessageId();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersMessageId setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersMessageId setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersMessageId setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersProperties extends TeaModel {
        /**
         * <p>The method that is used to transform the event.</p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which the event is transformed.</p>
         * 
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value before the transformation.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;key&quot;: &quot;value&quot;
         * }</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersProperties build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersProperties self = new GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersProperties();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersProperties setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersProperties setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersProperties setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersQueueName extends TeaModel {
        /**
         * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
         * <p>The name of the queue in the Message Queue for RabbitMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>MyQueue</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersQueueName build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersQueueName self = new GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersQueueName();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersQueueName setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersQueueName setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersQueueName setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersRoutingKey extends TeaModel {
        /**
         * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
         * <p>The routing rule for the message.</p>
         * 
         * <strong>example:</strong>
         * <p>housekeeping</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersRoutingKey build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersRoutingKey self = new GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersRoutingKey();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersRoutingKey setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersRoutingKey setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersRoutingKey setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersTargetType extends TeaModel {
        /**
         * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
         * <p>The type of the resource to which the event is delivered. Valid values: Exchange: exchanges. Queue: queues.</p>
         * 
         * <strong>example:</strong>
         * <p>Exchange/Queue</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersTargetType build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersTargetType self = new GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersTargetType();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersTargetType setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersTargetType setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersTargetType setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersVirtualHostName extends TeaModel {
        /**
         * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
         * <p>The vhost name of the Message Queue for RabbitMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rabbit-host</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersVirtualHostName build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersVirtualHostName self = new GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersVirtualHostName();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersVirtualHostName setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersVirtualHostName setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersVirtualHostName setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkRabbitMQParameters extends TeaModel {
        /**
         * <p>The message content.</p>
         */
        @NameInMap("Body")
        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersBody body;

        /**
         * <p>The exchange mode. This parameter is available only if TargetType is set to Exchange.</p>
         */
        @NameInMap("Exchange")
        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersExchange exchange;

        /**
         * <p>The target service type is Message Queue for RabbitMQ instance.</p>
         */
        @NameInMap("InstanceId")
        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersInstanceId instanceId;

        /**
         * <p>The message ID.</p>
         */
        @NameInMap("MessageId")
        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersMessageId messageId;

        /**
         * <p>The tags that are used to filter messages.</p>
         */
        @NameInMap("Properties")
        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersProperties properties;

        /**
         * <p>The queue mode. This parameter is available only if TargetType is set to Queue.</p>
         */
        @NameInMap("QueueName")
        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersQueueName queueName;

        /**
         * <p>The routing rule for the message. This parameter is available only if TargetType is set to Exchange.</p>
         */
        @NameInMap("RoutingKey")
        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersRoutingKey routingKey;

        /**
         * <p>The target type.</p>
         */
        @NameInMap("TargetType")
        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersTargetType targetType;

        /**
         * <p>The name of the vhost of the Message Queue for RabbitMQ instance.</p>
         */
        @NameInMap("VirtualHostName")
        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersVirtualHostName virtualHostName;

        public static GetEventStreamingResponseBodyDataSinkSinkRabbitMQParameters build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkRabbitMQParameters self = new GetEventStreamingResponseBodyDataSinkSinkRabbitMQParameters();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParameters setBody(GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersBody body) {
            this.body = body;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersBody getBody() {
            return this.body;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParameters setExchange(GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersExchange exchange) {
            this.exchange = exchange;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersExchange getExchange() {
            return this.exchange;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParameters setInstanceId(GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersInstanceId instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersInstanceId getInstanceId() {
            return this.instanceId;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParameters setMessageId(GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersMessageId messageId) {
            this.messageId = messageId;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersMessageId getMessageId() {
            return this.messageId;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParameters setProperties(GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersProperties properties) {
            this.properties = properties;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersProperties getProperties() {
            return this.properties;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParameters setQueueName(GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersQueueName queueName) {
            this.queueName = queueName;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersQueueName getQueueName() {
            return this.queueName;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParameters setRoutingKey(GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersRoutingKey routingKey) {
            this.routingKey = routingKey;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersRoutingKey getRoutingKey() {
            return this.routingKey;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParameters setTargetType(GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersTargetType targetType) {
            this.targetType = targetType;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersTargetType getTargetType() {
            return this.targetType;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParameters setVirtualHostName(GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersVirtualHostName virtualHostName) {
            this.virtualHostName = virtualHostName;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersVirtualHostName getVirtualHostName() {
            return this.virtualHostName;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkRocketMQCheckpointParametersConsumeTimestamp extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        /**
         * <strong>example:</strong>
         * <p>1570761026400</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkRocketMQCheckpointParametersConsumeTimestamp build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkRocketMQCheckpointParametersConsumeTimestamp self = new GetEventStreamingResponseBodyDataSinkSinkRocketMQCheckpointParametersConsumeTimestamp();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQCheckpointParametersConsumeTimestamp setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQCheckpointParametersConsumeTimestamp setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQCheckpointParametersConsumeTimestamp setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkRocketMQCheckpointParametersGroup extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

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

        public static GetEventStreamingResponseBodyDataSinkSinkRocketMQCheckpointParametersGroup build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkRocketMQCheckpointParametersGroup self = new GetEventStreamingResponseBodyDataSinkSinkRocketMQCheckpointParametersGroup();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQCheckpointParametersGroup setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQCheckpointParametersGroup setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQCheckpointParametersGroup setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkRocketMQCheckpointParametersTopic extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        /**
         * <strong>example:</strong>
         * <p>Mytopic</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkRocketMQCheckpointParametersTopic build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkRocketMQCheckpointParametersTopic self = new GetEventStreamingResponseBodyDataSinkSinkRocketMQCheckpointParametersTopic();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQCheckpointParametersTopic setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQCheckpointParametersTopic setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQCheckpointParametersTopic setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkRocketMQCheckpointParameters extends TeaModel {
        @NameInMap("ConsumeTimestamp")
        public GetEventStreamingResponseBodyDataSinkSinkRocketMQCheckpointParametersConsumeTimestamp consumeTimestamp;

        @NameInMap("Group")
        public GetEventStreamingResponseBodyDataSinkSinkRocketMQCheckpointParametersGroup group;

        /**
         * <strong>example:</strong>
         * <p>MQ_INST_164901546557****_BAAN****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>Cloud_4</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("Topic")
        public GetEventStreamingResponseBodyDataSinkSinkRocketMQCheckpointParametersTopic topic;

        public static GetEventStreamingResponseBodyDataSinkSinkRocketMQCheckpointParameters build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkRocketMQCheckpointParameters self = new GetEventStreamingResponseBodyDataSinkSinkRocketMQCheckpointParameters();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQCheckpointParameters setConsumeTimestamp(GetEventStreamingResponseBodyDataSinkSinkRocketMQCheckpointParametersConsumeTimestamp consumeTimestamp) {
            this.consumeTimestamp = consumeTimestamp;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkRocketMQCheckpointParametersConsumeTimestamp getConsumeTimestamp() {
            return this.consumeTimestamp;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQCheckpointParameters setGroup(GetEventStreamingResponseBodyDataSinkSinkRocketMQCheckpointParametersGroup group) {
            this.group = group;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkRocketMQCheckpointParametersGroup getGroup() {
            return this.group;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQCheckpointParameters setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQCheckpointParameters setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQCheckpointParameters setTopic(GetEventStreamingResponseBodyDataSinkSinkRocketMQCheckpointParametersTopic topic) {
            this.topic = topic;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkRocketMQCheckpointParametersTopic getTopic() {
            return this.topic;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersBody extends TeaModel {
        /**
         * <p>The method that is used to transform the event.</p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which the event is transformed.</p>
         * 
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value before the transformation.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;key&quot;: &quot;value&quot;
         * }</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersBody build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersBody self = new GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersBody();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersBody setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersBody setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersBody setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersDeliveryOrderType extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        /**
         * <strong>example:</strong>
         * <p>Concurrently</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersDeliveryOrderType build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersDeliveryOrderType self = new GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersDeliveryOrderType();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersDeliveryOrderType setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersDeliveryOrderType setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersDeliveryOrderType setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersInstanceEndpoint extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        /**
         * <strong>example:</strong>
         * <p>vbr-8vbsvkkbpf3vb0zef****</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersInstanceEndpoint build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersInstanceEndpoint self = new GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersInstanceEndpoint();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersInstanceEndpoint setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersInstanceEndpoint setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersInstanceEndpoint setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersInstanceId extends TeaModel {
        /**
         * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
         * <p>The ID of the Message Queue for Apache RocketMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>MQ_INST_164901546557****_BAAN****</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersInstanceId build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersInstanceId self = new GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersInstanceId();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersInstanceId setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersInstanceId setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersInstanceId setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersInstancePassword extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        /**
         * <strong>example:</strong>
         * <p>admin****</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersInstancePassword build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersInstancePassword self = new GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersInstancePassword();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersInstancePassword setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersInstancePassword setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersInstancePassword setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersInstanceType extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        /**
         * <strong>example:</strong>
         * <p>Cloud_4</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersInstanceType build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersInstanceType self = new GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersInstanceType();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersInstanceType setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersInstanceType setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersInstanceType setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersInstanceUsername extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        /**
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersInstanceUsername build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersInstanceUsername self = new GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersInstanceUsername();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersInstanceUsername setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersInstanceUsername setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersInstanceUsername setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersKeys extends TeaModel {
        /**
         * <p>The method that is used to transform the event.</p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which the event is transformed.</p>
         * 
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value before the transformation.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;key&quot;: &quot;value&quot;
         * }</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersKeys build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersKeys self = new GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersKeys();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersKeys setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersKeys setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersKeys setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersNetwork extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        /**
         * <strong>example:</strong>
         * <p>PublicNetwork</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersNetwork build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersNetwork self = new GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersNetwork();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersNetwork setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersNetwork setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersNetwork setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersProperties extends TeaModel {
        /**
         * <p>The method that is used to transform the event.</p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which the event is transformed.</p>
         * 
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value before the transformation.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;key&quot;: &quot;value&quot;
         * }</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersProperties build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersProperties self = new GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersProperties();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersProperties setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersProperties setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersProperties setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersSecurityGroupId extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        /**
         * <strong>example:</strong>
         * <p>b4bf375515f6440f942e3a20c33d****</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersSecurityGroupId build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersSecurityGroupId self = new GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersSecurityGroupId();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersSecurityGroupId setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersSecurityGroupId setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersSecurityGroupId setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersShardingKey extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        /**
         * <strong>example:</strong>
         * <p>order_id</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersShardingKey build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersShardingKey self = new GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersShardingKey();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersShardingKey setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersShardingKey setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersShardingKey setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersTags extends TeaModel {
        /**
         * <p>The method that is used to transform the event.</p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which the event is transformed.</p>
         * 
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value before the transformation.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;key&quot;: &quot;value&quot;
         * }</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersTags build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersTags self = new GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersTags();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersTags setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersTags setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersTopic extends TeaModel {
        /**
         * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
         * <p>The name of the topic in the Message Queue for Apache RocketMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Mytopic</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersTopic build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersTopic self = new GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersTopic();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersTopic setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersTopic setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersTopic setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersVSwitchIds extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        /**
         * <strong>example:</strong>
         * <p>vbr-8vb835n3zf9shwl****mp</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersVSwitchIds build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersVSwitchIds self = new GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersVSwitchIds();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersVSwitchIds setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersVSwitchIds setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersVSwitchIds setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersVpcId extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        /**
         * <strong>example:</strong>
         * <p>vbr-8vb835n3zf9shwlvb****</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersVpcId build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersVpcId self = new GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersVpcId();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersVpcId setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersVpcId setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersVpcId setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkRocketMQParameters extends TeaModel {
        /**
         * <p>The message content.</p>
         */
        @NameInMap("Body")
        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersBody body;

        @NameInMap("DeliveryOrderType")
        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersDeliveryOrderType deliveryOrderType;

        @NameInMap("InstanceEndpoint")
        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersInstanceEndpoint instanceEndpoint;

        /**
         * <p>The target service type is Message Queue for Apache RocketMQ.</p>
         */
        @NameInMap("InstanceId")
        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersInstanceId instanceId;

        @NameInMap("InstancePassword")
        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersInstancePassword instancePassword;

        @NameInMap("InstanceType")
        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersInstanceType instanceType;

        @NameInMap("InstanceUsername")
        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersInstanceUsername instanceUsername;

        /**
         * <p>The tags that are used to filter messages.</p>
         */
        @NameInMap("Keys")
        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersKeys keys;

        @NameInMap("Network")
        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersNetwork network;

        /**
         * <p>The tags that are used to filter messages.</p>
         */
        @NameInMap("Properties")
        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersProperties properties;

        @NameInMap("SecurityGroupId")
        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersSecurityGroupId securityGroupId;

        @NameInMap("ShardingKey")
        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersShardingKey shardingKey;

        /**
         * <p>The tags that are used to filter messages.</p>
         */
        @NameInMap("Tags")
        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersTags tags;

        /**
         * <p>The name of the topic in the Message Queue for Apache RocketMQ instance.</p>
         */
        @NameInMap("Topic")
        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersTopic topic;

        @NameInMap("VSwitchIds")
        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersVSwitchIds vSwitchIds;

        @NameInMap("VpcId")
        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersVpcId vpcId;

        public static GetEventStreamingResponseBodyDataSinkSinkRocketMQParameters build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkRocketMQParameters self = new GetEventStreamingResponseBodyDataSinkSinkRocketMQParameters();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParameters setBody(GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersBody body) {
            this.body = body;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersBody getBody() {
            return this.body;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParameters setDeliveryOrderType(GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersDeliveryOrderType deliveryOrderType) {
            this.deliveryOrderType = deliveryOrderType;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersDeliveryOrderType getDeliveryOrderType() {
            return this.deliveryOrderType;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParameters setInstanceEndpoint(GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersInstanceEndpoint instanceEndpoint) {
            this.instanceEndpoint = instanceEndpoint;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersInstanceEndpoint getInstanceEndpoint() {
            return this.instanceEndpoint;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParameters setInstanceId(GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersInstanceId instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersInstanceId getInstanceId() {
            return this.instanceId;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParameters setInstancePassword(GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersInstancePassword instancePassword) {
            this.instancePassword = instancePassword;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersInstancePassword getInstancePassword() {
            return this.instancePassword;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParameters setInstanceType(GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersInstanceType instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersInstanceType getInstanceType() {
            return this.instanceType;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParameters setInstanceUsername(GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersInstanceUsername instanceUsername) {
            this.instanceUsername = instanceUsername;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersInstanceUsername getInstanceUsername() {
            return this.instanceUsername;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParameters setKeys(GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersKeys keys) {
            this.keys = keys;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersKeys getKeys() {
            return this.keys;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParameters setNetwork(GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersNetwork network) {
            this.network = network;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersNetwork getNetwork() {
            return this.network;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParameters setProperties(GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersProperties properties) {
            this.properties = properties;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersProperties getProperties() {
            return this.properties;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParameters setSecurityGroupId(GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersSecurityGroupId securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersSecurityGroupId getSecurityGroupId() {
            return this.securityGroupId;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParameters setShardingKey(GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersShardingKey shardingKey) {
            this.shardingKey = shardingKey;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersShardingKey getShardingKey() {
            return this.shardingKey;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParameters setTags(GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersTags tags) {
            this.tags = tags;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersTags getTags() {
            return this.tags;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParameters setTopic(GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersTopic topic) {
            this.topic = topic;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersTopic getTopic() {
            return this.topic;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParameters setVSwitchIds(GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersVSwitchIds vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersVSwitchIds getVSwitchIds() {
            return this.vSwitchIds;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParameters setVpcId(GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersVpcId vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersVpcId getVpcId() {
            return this.vpcId;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkSLSParametersBody extends TeaModel {
        /**
         * <p>The method that is used to transform the event.</p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which the event is transformed.</p>
         * 
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value before the transformation.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;key&quot;: &quot;value&quot;
         * }</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkSLSParametersBody build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkSLSParametersBody self = new GetEventStreamingResponseBodyDataSinkSinkSLSParametersBody();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkSLSParametersBody setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkSLSParametersBody setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkSLSParametersBody setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkSLSParametersContentSchema extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        /**
         * <strong>example:</strong>
         * <p>{&quot;Key_1&quot;:{&quot;form&quot;:&quot;CONSTANT&quot;,&quot;value&quot;:&quot;demoKey&quot;},&quot;Value_1&quot;:{&quot;form&quot;:&quot;JSONPATH&quot;,&quot;value&quot;:&quot;$.data.value&quot;}}</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkSLSParametersContentSchema build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkSLSParametersContentSchema self = new GetEventStreamingResponseBodyDataSinkSinkSLSParametersContentSchema();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkSLSParametersContentSchema setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkSLSParametersContentSchema setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkSLSParametersContentSchema setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkSLSParametersContentType extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        /**
         * <strong>example:</strong>
         * <p>JSON</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkSLSParametersContentType build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkSLSParametersContentType self = new GetEventStreamingResponseBodyDataSinkSinkSLSParametersContentType();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkSLSParametersContentType setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkSLSParametersContentType setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkSLSParametersContentType setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkSLSParametersLogStore extends TeaModel {
        /**
         * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
         * <p>The Log Service Logstore.</p>
         * 
         * <strong>example:</strong>
         * <p>test-logstore</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkSLSParametersLogStore build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkSLSParametersLogStore self = new GetEventStreamingResponseBodyDataSinkSinkSLSParametersLogStore();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkSLSParametersLogStore setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkSLSParametersLogStore setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkSLSParametersLogStore setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkSLSParametersProject extends TeaModel {
        /**
         * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
         * <p>The Log Service project.</p>
         * 
         * <strong>example:</strong>
         * <p>test-project</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkSLSParametersProject build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkSLSParametersProject self = new GetEventStreamingResponseBodyDataSinkSinkSLSParametersProject();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkSLSParametersProject setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkSLSParametersProject setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkSLSParametersProject setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkSLSParametersRoleName extends TeaModel {
        /**
         * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
         * <p>The role name. If you want to authorize EventBridge to use this role to read logs in Log Service, you must select Alibaba Cloud Service for Selected Trusted Entity and EventBridge for Select Trusted Service when you create the role in the RAM console.</p>
         * 
         * <strong>example:</strong>
         * <p>testRole</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkSLSParametersRoleName build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkSLSParametersRoleName self = new GetEventStreamingResponseBodyDataSinkSinkSLSParametersRoleName();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkSLSParametersRoleName setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkSLSParametersRoleName setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkSLSParametersRoleName setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkSLSParametersTopic extends TeaModel {
        /**
         * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
         * <p>The name of the topic in which logs are stored. The topic corresponds to the topic reserved field in Log Service.</p>
         * 
         * <strong>example:</strong>
         * <p>testTopic</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEventStreamingResponseBodyDataSinkSinkSLSParametersTopic build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkSLSParametersTopic self = new GetEventStreamingResponseBodyDataSinkSinkSLSParametersTopic();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkSLSParametersTopic setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetEventStreamingResponseBodyDataSinkSinkSLSParametersTopic setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetEventStreamingResponseBodyDataSinkSinkSLSParametersTopic setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkSLSParameters extends TeaModel {
        /**
         * <p>The message content.</p>
         */
        @NameInMap("Body")
        public GetEventStreamingResponseBodyDataSinkSinkSLSParametersBody body;

        @NameInMap("ContentSchema")
        public GetEventStreamingResponseBodyDataSinkSinkSLSParametersContentSchema contentSchema;

        @NameInMap("ContentType")
        public GetEventStreamingResponseBodyDataSinkSinkSLSParametersContentType contentType;

        /**
         * <p>The Simple Log Service Logstore.</p>
         */
        @NameInMap("LogStore")
        public GetEventStreamingResponseBodyDataSinkSinkSLSParametersLogStore logStore;

        /**
         * <p>The Simple Log Service project.</p>
         */
        @NameInMap("Project")
        public GetEventStreamingResponseBodyDataSinkSinkSLSParametersProject project;

        /**
         * <p>The role name. If you want to authorize EventBridge to use this role to read logs in Simple Log Service, you must select Alibaba Cloud Service for Selected Trusted Entity and EventBridge for Select Trusted Service when you create the role in the Resource Access Management (RAM) console.</p>
         */
        @NameInMap("RoleName")
        public GetEventStreamingResponseBodyDataSinkSinkSLSParametersRoleName roleName;

        /**
         * <p>The name of the topic in which logs are stored. The topic corresponds to the topic reserved field in Simple Log Service.</p>
         */
        @NameInMap("Topic")
        public GetEventStreamingResponseBodyDataSinkSinkSLSParametersTopic topic;

        public static GetEventStreamingResponseBodyDataSinkSinkSLSParameters build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSinkSinkSLSParameters self = new GetEventStreamingResponseBodyDataSinkSinkSLSParameters();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSinkSinkSLSParameters setBody(GetEventStreamingResponseBodyDataSinkSinkSLSParametersBody body) {
            this.body = body;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkSLSParametersBody getBody() {
            return this.body;
        }

        public GetEventStreamingResponseBodyDataSinkSinkSLSParameters setContentSchema(GetEventStreamingResponseBodyDataSinkSinkSLSParametersContentSchema contentSchema) {
            this.contentSchema = contentSchema;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkSLSParametersContentSchema getContentSchema() {
            return this.contentSchema;
        }

        public GetEventStreamingResponseBodyDataSinkSinkSLSParameters setContentType(GetEventStreamingResponseBodyDataSinkSinkSLSParametersContentType contentType) {
            this.contentType = contentType;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkSLSParametersContentType getContentType() {
            return this.contentType;
        }

        public GetEventStreamingResponseBodyDataSinkSinkSLSParameters setLogStore(GetEventStreamingResponseBodyDataSinkSinkSLSParametersLogStore logStore) {
            this.logStore = logStore;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkSLSParametersLogStore getLogStore() {
            return this.logStore;
        }

        public GetEventStreamingResponseBodyDataSinkSinkSLSParameters setProject(GetEventStreamingResponseBodyDataSinkSinkSLSParametersProject project) {
            this.project = project;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkSLSParametersProject getProject() {
            return this.project;
        }

        public GetEventStreamingResponseBodyDataSinkSinkSLSParameters setRoleName(GetEventStreamingResponseBodyDataSinkSinkSLSParametersRoleName roleName) {
            this.roleName = roleName;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkSLSParametersRoleName getRoleName() {
            return this.roleName;
        }

        public GetEventStreamingResponseBodyDataSinkSinkSLSParameters setTopic(GetEventStreamingResponseBodyDataSinkSinkSLSParametersTopic topic) {
            this.topic = topic;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkSLSParametersTopic getTopic() {
            return this.topic;
        }

    }

    public static class GetEventStreamingResponseBodyDataSink extends TeaModel {
        @NameInMap("SinkApacheKafkaParameters")
        public GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParameters sinkApacheKafkaParameters;

        /**
         * <p>Sink Apache RocketMQ Checkpoint Parameters</p>
         */
        @NameInMap("SinkApacheRocketMQCheckpointParameters")
        public GetEventStreamingResponseBodyDataSinkSinkApacheRocketMQCheckpointParameters sinkApacheRocketMQCheckpointParameters;

        @NameInMap("SinkApiDestinationParameters")
        public SinkApiDestinationParameters sinkApiDestinationParameters;

        /**
         * <p>Sink BaiLian Parameters</p>
         */
        @NameInMap("SinkBaiLianParameters")
        public SinkBaiLianParameters sinkBaiLianParameters;

        @NameInMap("SinkCustomizedKafkaConnectorParameters")
        public GetEventStreamingResponseBodyDataSinkSinkCustomizedKafkaConnectorParameters sinkCustomizedKafkaConnectorParameters;

        @NameInMap("SinkCustomizedKafkaParameters")
        public GetEventStreamingResponseBodyDataSinkSinkCustomizedKafkaParameters sinkCustomizedKafkaParameters;

        @NameInMap("SinkDashVectorParameters")
        public GetEventStreamingResponseBodyDataSinkSinkDashVectorParameters sinkDashVectorParameters;

        @NameInMap("SinkDataHubParameters")
        public GetEventStreamingResponseBodyDataSinkSinkDataHubParameters sinkDataHubParameters;

        @NameInMap("SinkDataWorksTriggerParameters")
        public SinkDataWorksTriggerParameters sinkDataWorksTriggerParameters;

        @NameInMap("SinkDorisParameters")
        public GetEventStreamingResponseBodyDataSinkSinkDorisParameters sinkDorisParameters;

        /**
         * <p>The parameters that are returned if the event target is Function Compute.</p>
         */
        @NameInMap("SinkFcParameters")
        public GetEventStreamingResponseBodyDataSinkSinkFcParameters sinkFcParameters;

        /**
         * <p>The Sink Fnf parameters.</p>
         */
        @NameInMap("SinkFnfParameters")
        public GetEventStreamingResponseBodyDataSinkSinkFnfParameters sinkFnfParameters;

        @NameInMap("SinkHttpsParameters")
        public SinkHttpsParameters sinkHttpsParameters;

        /**
         * <p>The parameters that are returned if the event target is Message Queue for Apache Kafka.</p>
         */
        @NameInMap("SinkKafkaParameters")
        public GetEventStreamingResponseBodyDataSinkSinkKafkaParameters sinkKafkaParameters;

        /**
         * <p>The parameters that are returned if the event target is Message Service (MNS).</p>
         */
        @NameInMap("SinkMNSParameters")
        public GetEventStreamingResponseBodyDataSinkSinkMNSParameters sinkMNSParameters;

        @NameInMap("SinkMQTTParameters")
        public SinkMQTTParameters sinkMQTTParameters;

        @NameInMap("SinkOSSParameters")
        public SinkOSSParameters sinkOSSParameters;

        /**
         * <p>Sink Open Source RabbitMQ Parameters</p>
         */
        @NameInMap("SinkOpenSourceRabbitMQParameters")
        public GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParameters sinkOpenSourceRabbitMQParameters;

        @NameInMap("SinkRabbitMQMetaParameters")
        public SinkRabbitMQMetaParameters sinkRabbitMQMetaParameters;

        @NameInMap("SinkRabbitMQMsgSyncParameters")
        public SinkRabbitMQMsgSyncParameters sinkRabbitMQMsgSyncParameters;

        /**
         * <p>The parameters that are returned if the event target is Message Queue for RabbitMQ.</p>
         */
        @NameInMap("SinkRabbitMQParameters")
        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParameters sinkRabbitMQParameters;

        /**
         * <p>Sink RocketMQ Checkpoint Parameters</p>
         */
        @NameInMap("SinkRocketMQCheckpointParameters")
        public GetEventStreamingResponseBodyDataSinkSinkRocketMQCheckpointParameters sinkRocketMQCheckpointParameters;

        /**
         * <p>The parameters that are returned if ApsaraMQ for RocketMQ is specified as the event target.</p>
         */
        @NameInMap("SinkRocketMQParameters")
        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParameters sinkRocketMQParameters;

        /**
         * <p>The parameters that are returned if Simple Log Service is specified as the event target.</p>
         */
        @NameInMap("SinkSLSParameters")
        public GetEventStreamingResponseBodyDataSinkSinkSLSParameters sinkSLSParameters;

        public static GetEventStreamingResponseBodyDataSink build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSink self = new GetEventStreamingResponseBodyDataSink();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSink setSinkApacheKafkaParameters(GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParameters sinkApacheKafkaParameters) {
            this.sinkApacheKafkaParameters = sinkApacheKafkaParameters;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkApacheKafkaParameters getSinkApacheKafkaParameters() {
            return this.sinkApacheKafkaParameters;
        }

        public GetEventStreamingResponseBodyDataSink setSinkApacheRocketMQCheckpointParameters(GetEventStreamingResponseBodyDataSinkSinkApacheRocketMQCheckpointParameters sinkApacheRocketMQCheckpointParameters) {
            this.sinkApacheRocketMQCheckpointParameters = sinkApacheRocketMQCheckpointParameters;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkApacheRocketMQCheckpointParameters getSinkApacheRocketMQCheckpointParameters() {
            return this.sinkApacheRocketMQCheckpointParameters;
        }

        public GetEventStreamingResponseBodyDataSink setSinkApiDestinationParameters(SinkApiDestinationParameters sinkApiDestinationParameters) {
            this.sinkApiDestinationParameters = sinkApiDestinationParameters;
            return this;
        }
        public SinkApiDestinationParameters getSinkApiDestinationParameters() {
            return this.sinkApiDestinationParameters;
        }

        public GetEventStreamingResponseBodyDataSink setSinkBaiLianParameters(SinkBaiLianParameters sinkBaiLianParameters) {
            this.sinkBaiLianParameters = sinkBaiLianParameters;
            return this;
        }
        public SinkBaiLianParameters getSinkBaiLianParameters() {
            return this.sinkBaiLianParameters;
        }

        public GetEventStreamingResponseBodyDataSink setSinkCustomizedKafkaConnectorParameters(GetEventStreamingResponseBodyDataSinkSinkCustomizedKafkaConnectorParameters sinkCustomizedKafkaConnectorParameters) {
            this.sinkCustomizedKafkaConnectorParameters = sinkCustomizedKafkaConnectorParameters;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkCustomizedKafkaConnectorParameters getSinkCustomizedKafkaConnectorParameters() {
            return this.sinkCustomizedKafkaConnectorParameters;
        }

        public GetEventStreamingResponseBodyDataSink setSinkCustomizedKafkaParameters(GetEventStreamingResponseBodyDataSinkSinkCustomizedKafkaParameters sinkCustomizedKafkaParameters) {
            this.sinkCustomizedKafkaParameters = sinkCustomizedKafkaParameters;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkCustomizedKafkaParameters getSinkCustomizedKafkaParameters() {
            return this.sinkCustomizedKafkaParameters;
        }

        public GetEventStreamingResponseBodyDataSink setSinkDashVectorParameters(GetEventStreamingResponseBodyDataSinkSinkDashVectorParameters sinkDashVectorParameters) {
            this.sinkDashVectorParameters = sinkDashVectorParameters;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkDashVectorParameters getSinkDashVectorParameters() {
            return this.sinkDashVectorParameters;
        }

        public GetEventStreamingResponseBodyDataSink setSinkDataHubParameters(GetEventStreamingResponseBodyDataSinkSinkDataHubParameters sinkDataHubParameters) {
            this.sinkDataHubParameters = sinkDataHubParameters;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkDataHubParameters getSinkDataHubParameters() {
            return this.sinkDataHubParameters;
        }

        public GetEventStreamingResponseBodyDataSink setSinkDataWorksTriggerParameters(SinkDataWorksTriggerParameters sinkDataWorksTriggerParameters) {
            this.sinkDataWorksTriggerParameters = sinkDataWorksTriggerParameters;
            return this;
        }
        public SinkDataWorksTriggerParameters getSinkDataWorksTriggerParameters() {
            return this.sinkDataWorksTriggerParameters;
        }

        public GetEventStreamingResponseBodyDataSink setSinkDorisParameters(GetEventStreamingResponseBodyDataSinkSinkDorisParameters sinkDorisParameters) {
            this.sinkDorisParameters = sinkDorisParameters;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkDorisParameters getSinkDorisParameters() {
            return this.sinkDorisParameters;
        }

        public GetEventStreamingResponseBodyDataSink setSinkFcParameters(GetEventStreamingResponseBodyDataSinkSinkFcParameters sinkFcParameters) {
            this.sinkFcParameters = sinkFcParameters;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkFcParameters getSinkFcParameters() {
            return this.sinkFcParameters;
        }

        public GetEventStreamingResponseBodyDataSink setSinkFnfParameters(GetEventStreamingResponseBodyDataSinkSinkFnfParameters sinkFnfParameters) {
            this.sinkFnfParameters = sinkFnfParameters;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkFnfParameters getSinkFnfParameters() {
            return this.sinkFnfParameters;
        }

        public GetEventStreamingResponseBodyDataSink setSinkHttpsParameters(SinkHttpsParameters sinkHttpsParameters) {
            this.sinkHttpsParameters = sinkHttpsParameters;
            return this;
        }
        public SinkHttpsParameters getSinkHttpsParameters() {
            return this.sinkHttpsParameters;
        }

        public GetEventStreamingResponseBodyDataSink setSinkKafkaParameters(GetEventStreamingResponseBodyDataSinkSinkKafkaParameters sinkKafkaParameters) {
            this.sinkKafkaParameters = sinkKafkaParameters;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkKafkaParameters getSinkKafkaParameters() {
            return this.sinkKafkaParameters;
        }

        public GetEventStreamingResponseBodyDataSink setSinkMNSParameters(GetEventStreamingResponseBodyDataSinkSinkMNSParameters sinkMNSParameters) {
            this.sinkMNSParameters = sinkMNSParameters;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkMNSParameters getSinkMNSParameters() {
            return this.sinkMNSParameters;
        }

        public GetEventStreamingResponseBodyDataSink setSinkMQTTParameters(SinkMQTTParameters sinkMQTTParameters) {
            this.sinkMQTTParameters = sinkMQTTParameters;
            return this;
        }
        public SinkMQTTParameters getSinkMQTTParameters() {
            return this.sinkMQTTParameters;
        }

        public GetEventStreamingResponseBodyDataSink setSinkOSSParameters(SinkOSSParameters sinkOSSParameters) {
            this.sinkOSSParameters = sinkOSSParameters;
            return this;
        }
        public SinkOSSParameters getSinkOSSParameters() {
            return this.sinkOSSParameters;
        }

        public GetEventStreamingResponseBodyDataSink setSinkOpenSourceRabbitMQParameters(GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParameters sinkOpenSourceRabbitMQParameters) {
            this.sinkOpenSourceRabbitMQParameters = sinkOpenSourceRabbitMQParameters;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkOpenSourceRabbitMQParameters getSinkOpenSourceRabbitMQParameters() {
            return this.sinkOpenSourceRabbitMQParameters;
        }

        public GetEventStreamingResponseBodyDataSink setSinkRabbitMQMetaParameters(SinkRabbitMQMetaParameters sinkRabbitMQMetaParameters) {
            this.sinkRabbitMQMetaParameters = sinkRabbitMQMetaParameters;
            return this;
        }
        public SinkRabbitMQMetaParameters getSinkRabbitMQMetaParameters() {
            return this.sinkRabbitMQMetaParameters;
        }

        public GetEventStreamingResponseBodyDataSink setSinkRabbitMQMsgSyncParameters(SinkRabbitMQMsgSyncParameters sinkRabbitMQMsgSyncParameters) {
            this.sinkRabbitMQMsgSyncParameters = sinkRabbitMQMsgSyncParameters;
            return this;
        }
        public SinkRabbitMQMsgSyncParameters getSinkRabbitMQMsgSyncParameters() {
            return this.sinkRabbitMQMsgSyncParameters;
        }

        public GetEventStreamingResponseBodyDataSink setSinkRabbitMQParameters(GetEventStreamingResponseBodyDataSinkSinkRabbitMQParameters sinkRabbitMQParameters) {
            this.sinkRabbitMQParameters = sinkRabbitMQParameters;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParameters getSinkRabbitMQParameters() {
            return this.sinkRabbitMQParameters;
        }

        public GetEventStreamingResponseBodyDataSink setSinkRocketMQCheckpointParameters(GetEventStreamingResponseBodyDataSinkSinkRocketMQCheckpointParameters sinkRocketMQCheckpointParameters) {
            this.sinkRocketMQCheckpointParameters = sinkRocketMQCheckpointParameters;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkRocketMQCheckpointParameters getSinkRocketMQCheckpointParameters() {
            return this.sinkRocketMQCheckpointParameters;
        }

        public GetEventStreamingResponseBodyDataSink setSinkRocketMQParameters(GetEventStreamingResponseBodyDataSinkSinkRocketMQParameters sinkRocketMQParameters) {
            this.sinkRocketMQParameters = sinkRocketMQParameters;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParameters getSinkRocketMQParameters() {
            return this.sinkRocketMQParameters;
        }

        public GetEventStreamingResponseBodyDataSink setSinkSLSParameters(GetEventStreamingResponseBodyDataSinkSinkSLSParameters sinkSLSParameters) {
            this.sinkSLSParameters = sinkSLSParameters;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkSLSParameters getSinkSLSParameters() {
            return this.sinkSLSParameters;
        }

    }

    public static class GetEventStreamingResponseBodyDataSourceSourceApacheKafkaParameters extends TeaModel {
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

        public static GetEventStreamingResponseBodyDataSourceSourceApacheKafkaParameters build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSourceSourceApacheKafkaParameters self = new GetEventStreamingResponseBodyDataSourceSourceApacheKafkaParameters();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSourceSourceApacheKafkaParameters setBootstraps(String bootstraps) {
            this.bootstraps = bootstraps;
            return this;
        }
        public String getBootstraps() {
            return this.bootstraps;
        }

        public GetEventStreamingResponseBodyDataSourceSourceApacheKafkaParameters setConsumerGroup(String consumerGroup) {
            this.consumerGroup = consumerGroup;
            return this;
        }
        public String getConsumerGroup() {
            return this.consumerGroup;
        }

        public GetEventStreamingResponseBodyDataSourceSourceApacheKafkaParameters setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public GetEventStreamingResponseBodyDataSourceSourceApacheKafkaParameters setOffsetReset(String offsetReset) {
            this.offsetReset = offsetReset;
            return this;
        }
        public String getOffsetReset() {
            return this.offsetReset;
        }

        public GetEventStreamingResponseBodyDataSourceSourceApacheKafkaParameters setSaslMechanism(String saslMechanism) {
            this.saslMechanism = saslMechanism;
            return this;
        }
        public String getSaslMechanism() {
            return this.saslMechanism;
        }

        public GetEventStreamingResponseBodyDataSourceSourceApacheKafkaParameters setSaslPassword(String saslPassword) {
            this.saslPassword = saslPassword;
            return this;
        }
        public String getSaslPassword() {
            return this.saslPassword;
        }

        public GetEventStreamingResponseBodyDataSourceSourceApacheKafkaParameters setSaslUser(String saslUser) {
            this.saslUser = saslUser;
            return this;
        }
        public String getSaslUser() {
            return this.saslUser;
        }

        public GetEventStreamingResponseBodyDataSourceSourceApacheKafkaParameters setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public GetEventStreamingResponseBodyDataSourceSourceApacheKafkaParameters setSecurityProtocol(String securityProtocol) {
            this.securityProtocol = securityProtocol;
            return this;
        }
        public String getSecurityProtocol() {
            return this.securityProtocol;
        }

        public GetEventStreamingResponseBodyDataSourceSourceApacheKafkaParameters setSslTruststoreCertificates(String sslTruststoreCertificates) {
            this.sslTruststoreCertificates = sslTruststoreCertificates;
            return this;
        }
        public String getSslTruststoreCertificates() {
            return this.sslTruststoreCertificates;
        }

        public GetEventStreamingResponseBodyDataSourceSourceApacheKafkaParameters setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public GetEventStreamingResponseBodyDataSourceSourceApacheKafkaParameters setVSwitchIds(String vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public String getVSwitchIds() {
            return this.vSwitchIds;
        }

        public GetEventStreamingResponseBodyDataSourceSourceApacheKafkaParameters setValueDataType(String valueDataType) {
            this.valueDataType = valueDataType;
            return this;
        }
        public String getValueDataType() {
            return this.valueDataType;
        }

        public GetEventStreamingResponseBodyDataSourceSourceApacheKafkaParameters setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class GetEventStreamingResponseBodyDataSourceSourceApacheRocketMQCheckpointParameters extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>registry-vpc.cn-hangzhou.aliyuncs.com</p>
         */
        @NameInMap("InstanceEndpoint")
        public String instanceEndpoint;

        /**
         * <p>The ID of the Apache RocketMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>MQ_INST_164901546557****_BAAN****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("InstancePassword")
        public String instancePassword;

        /**
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("InstanceUsername")
        public String instanceUsername;

        /**
         * <strong>example:</strong>
         * <p>PrivateNetwork</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>sg-mw43*****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("Topics")
        public java.util.List<String> topics;

        /**
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

        public static GetEventStreamingResponseBodyDataSourceSourceApacheRocketMQCheckpointParameters build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSourceSourceApacheRocketMQCheckpointParameters self = new GetEventStreamingResponseBodyDataSourceSourceApacheRocketMQCheckpointParameters();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSourceSourceApacheRocketMQCheckpointParameters setInstanceEndpoint(String instanceEndpoint) {
            this.instanceEndpoint = instanceEndpoint;
            return this;
        }
        public String getInstanceEndpoint() {
            return this.instanceEndpoint;
        }

        public GetEventStreamingResponseBodyDataSourceSourceApacheRocketMQCheckpointParameters setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetEventStreamingResponseBodyDataSourceSourceApacheRocketMQCheckpointParameters setInstancePassword(String instancePassword) {
            this.instancePassword = instancePassword;
            return this;
        }
        public String getInstancePassword() {
            return this.instancePassword;
        }

        public GetEventStreamingResponseBodyDataSourceSourceApacheRocketMQCheckpointParameters setInstanceUsername(String instanceUsername) {
            this.instanceUsername = instanceUsername;
            return this;
        }
        public String getInstanceUsername() {
            return this.instanceUsername;
        }

        public GetEventStreamingResponseBodyDataSourceSourceApacheRocketMQCheckpointParameters setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public GetEventStreamingResponseBodyDataSourceSourceApacheRocketMQCheckpointParameters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetEventStreamingResponseBodyDataSourceSourceApacheRocketMQCheckpointParameters setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public GetEventStreamingResponseBodyDataSourceSourceApacheRocketMQCheckpointParameters setTopics(java.util.List<String> topics) {
            this.topics = topics;
            return this;
        }
        public java.util.List<String> getTopics() {
            return this.topics;
        }

        public GetEventStreamingResponseBodyDataSourceSourceApacheRocketMQCheckpointParameters setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public GetEventStreamingResponseBodyDataSourceSourceApacheRocketMQCheckpointParameters setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class GetEventStreamingResponseBodyDataSourceSourceCustomizedKafkaConnectorParametersConnectorParameters extends TeaModel {
        /**
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
         * <strong>example:</strong>
         * <p>test-name</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetEventStreamingResponseBodyDataSourceSourceCustomizedKafkaConnectorParametersConnectorParameters build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSourceSourceCustomizedKafkaConnectorParametersConnectorParameters self = new GetEventStreamingResponseBodyDataSourceSourceCustomizedKafkaConnectorParametersConnectorParameters();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSourceSourceCustomizedKafkaConnectorParametersConnectorParameters setConfig(java.util.Map<String, ?> config) {
            this.config = config;
            return this;
        }
        public java.util.Map<String, ?> getConfig() {
            return this.config;
        }

        public GetEventStreamingResponseBodyDataSourceSourceCustomizedKafkaConnectorParametersConnectorParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetEventStreamingResponseBodyDataSourceSourceCustomizedKafkaConnectorParameters extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>&quot;<a href="https://examplebucket.oss-cn-hangzhou.aliyuncs.com/testDoc/Old_Homebrew/2024-06-26%2022%3A34%3A08/opt/homebrew/homebrew/Library/Homebrew/test/support/fixtures/cask/AppWithBinary.zip?OSSAccessKeyId=ri&Expires=1725539627&Signature=rb8q3OpV2i3gZJ">https://examplebucket.oss-cn-hangzhou.aliyuncs.com/testDoc/Old_Homebrew/2024-06-26%2022%3A34%3A08/opt/homebrew/homebrew/Library/Homebrew/test/support/fixtures/cask/AppWithBinary.zip?OSSAccessKeyId=ri&amp;Expires=1725539627&amp;Signature=rb8q3OpV2i3gZJ</a>&quot;</p>
         */
        @NameInMap("ConnectorPackageUrl")
        public String connectorPackageUrl;

        @NameInMap("ConnectorParameters")
        public GetEventStreamingResponseBodyDataSourceSourceCustomizedKafkaConnectorParametersConnectorParameters connectorParameters;

        /**
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

        public static GetEventStreamingResponseBodyDataSourceSourceCustomizedKafkaConnectorParameters build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSourceSourceCustomizedKafkaConnectorParameters self = new GetEventStreamingResponseBodyDataSourceSourceCustomizedKafkaConnectorParameters();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSourceSourceCustomizedKafkaConnectorParameters setConnectorPackageUrl(String connectorPackageUrl) {
            this.connectorPackageUrl = connectorPackageUrl;
            return this;
        }
        public String getConnectorPackageUrl() {
            return this.connectorPackageUrl;
        }

        public GetEventStreamingResponseBodyDataSourceSourceCustomizedKafkaConnectorParameters setConnectorParameters(GetEventStreamingResponseBodyDataSourceSourceCustomizedKafkaConnectorParametersConnectorParameters connectorParameters) {
            this.connectorParameters = connectorParameters;
            return this;
        }
        public GetEventStreamingResponseBodyDataSourceSourceCustomizedKafkaConnectorParametersConnectorParameters getConnectorParameters() {
            return this.connectorParameters;
        }

        public GetEventStreamingResponseBodyDataSourceSourceCustomizedKafkaConnectorParameters setWorkerParameters(java.util.Map<String, ?> workerParameters) {
            this.workerParameters = workerParameters;
            return this;
        }
        public java.util.Map<String, ?> getWorkerParameters() {
            return this.workerParameters;
        }

    }

    public static class GetEventStreamingResponseBodyDataSourceSourceCustomizedKafkaParameters extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>r-8vb64581862c****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        public static GetEventStreamingResponseBodyDataSourceSourceCustomizedKafkaParameters build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSourceSourceCustomizedKafkaParameters self = new GetEventStreamingResponseBodyDataSourceSourceCustomizedKafkaParameters();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSourceSourceCustomizedKafkaParameters setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class GetEventStreamingResponseBodyDataSourceSourceDTSParameters extends TeaModel {
        /**
         * <p>The URL and port number of the data subscription channel.</p>
         */
        @NameInMap("BrokerUrl")
        public String brokerUrl;

        /**
         * <p>The consumer offset. A consumer offset is a timestamp that indicates when the SDK client consumes the first data record. The value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1620962769</p>
         */
        @NameInMap("InitCheckPoint")
        public String initCheckPoint;

        /**
         * <p>The password of the consumer group.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The ID of the consumer group.</p>
         * 
         * <strong>example:</strong>
         * <p>HD1</p>
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
         * <p>The topic to which you want to subscribe by using the data subscription channel.</p>
         * 
         * <strong>example:</strong>
         * <p>TP_TEST_UNDERWRITE_ISSUE</p>
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

        public static GetEventStreamingResponseBodyDataSourceSourceDTSParameters build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSourceSourceDTSParameters self = new GetEventStreamingResponseBodyDataSourceSourceDTSParameters();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSourceSourceDTSParameters setBrokerUrl(String brokerUrl) {
            this.brokerUrl = brokerUrl;
            return this;
        }
        public String getBrokerUrl() {
            return this.brokerUrl;
        }

        public GetEventStreamingResponseBodyDataSourceSourceDTSParameters setInitCheckPoint(String initCheckPoint) {
            this.initCheckPoint = initCheckPoint;
            return this;
        }
        public String getInitCheckPoint() {
            return this.initCheckPoint;
        }

        public GetEventStreamingResponseBodyDataSourceSourceDTSParameters setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public GetEventStreamingResponseBodyDataSourceSourceDTSParameters setSid(String sid) {
            this.sid = sid;
            return this;
        }
        public String getSid() {
            return this.sid;
        }

        public GetEventStreamingResponseBodyDataSourceSourceDTSParameters setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetEventStreamingResponseBodyDataSourceSourceDTSParameters setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public GetEventStreamingResponseBodyDataSourceSourceDTSParameters setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class GetEventStreamingResponseBodyDataSourceSourceEventBusParameters extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("EventBusName")
        public String eventBusName;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("EventRuleName")
        public String eventRuleName;

        public static GetEventStreamingResponseBodyDataSourceSourceEventBusParameters build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSourceSourceEventBusParameters self = new GetEventStreamingResponseBodyDataSourceSourceEventBusParameters();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSourceSourceEventBusParameters setEventBusName(String eventBusName) {
            this.eventBusName = eventBusName;
            return this;
        }
        public String getEventBusName() {
            return this.eventBusName;
        }

        public GetEventStreamingResponseBodyDataSourceSourceEventBusParameters setEventRuleName(String eventRuleName) {
            this.eventRuleName = eventRuleName;
            return this;
        }
        public String getEventRuleName() {
            return this.eventRuleName;
        }

    }

    public static class GetEventStreamingResponseBodyDataSourceSourceKafkaParameters extends TeaModel {
        /**
         * <p>The ID of the consumer group that subscribes to the topic.</p>
         * 
         * <strong>example:</strong>
         * <p>GID_TEST</p>
         */
        @NameInMap("ConsumerGroup")
        public String consumerGroup;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1fbtrnqmjvgq66ajdw</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The network. Default value: Default. The value PublicNetwork specifies a virtual private cloud (VPC).</p>
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
         * <p>The region ID of the Message Queue for Apache Kafka instance.</p>
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
         * <p>sg-2vcgdxz7o1n9zappuimt</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The name of the topic.</p>
         * 
         * <strong>example:</strong>
         * <p>topic_empower_1642473600414</p>
         */
        @NameInMap("Topic")
        public String topic;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-wz9qqeovkwjxlu9uc8rst</p>
         */
        @NameInMap("VSwitchIds")
        public String vSwitchIds;

        /**
         * <p>The encoding or decoding format. Valid values: Json, Text, and Binary. The value Json indicates that bytes are decoded into UTF-8 strings and then parsed into JSON format. The value Text indicates that bytes are decoded into UTF-8 strings and then put into the payload. The value Binary indicates that bytes are encoded into Base64 strings and put into the payload.</p>
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
         * <p>vpc-2zehizpoendb3nwwu9w5o</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static GetEventStreamingResponseBodyDataSourceSourceKafkaParameters build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSourceSourceKafkaParameters self = new GetEventStreamingResponseBodyDataSourceSourceKafkaParameters();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSourceSourceKafkaParameters setConsumerGroup(String consumerGroup) {
            this.consumerGroup = consumerGroup;
            return this;
        }
        public String getConsumerGroup() {
            return this.consumerGroup;
        }

        public GetEventStreamingResponseBodyDataSourceSourceKafkaParameters setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetEventStreamingResponseBodyDataSourceSourceKafkaParameters setNetwork(String network) {
            this.network = network;
            return this;
        }
        public String getNetwork() {
            return this.network;
        }

        public GetEventStreamingResponseBodyDataSourceSourceKafkaParameters setOffsetReset(String offsetReset) {
            this.offsetReset = offsetReset;
            return this;
        }
        public String getOffsetReset() {
            return this.offsetReset;
        }

        public GetEventStreamingResponseBodyDataSourceSourceKafkaParameters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetEventStreamingResponseBodyDataSourceSourceKafkaParameters setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public GetEventStreamingResponseBodyDataSourceSourceKafkaParameters setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public GetEventStreamingResponseBodyDataSourceSourceKafkaParameters setVSwitchIds(String vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public String getVSwitchIds() {
            return this.vSwitchIds;
        }

        public GetEventStreamingResponseBodyDataSourceSourceKafkaParameters setValueDataType(String valueDataType) {
            this.valueDataType = valueDataType;
            return this;
        }
        public String getValueDataType() {
            return this.valueDataType;
        }

        public GetEventStreamingResponseBodyDataSourceSourceKafkaParameters setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class GetEventStreamingResponseBodyDataSourceSourceMNSParameters extends TeaModel {
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
         * <p>demo</p>
         */
        @NameInMap("QueueName")
        public String queueName;

        /**
         * <p>The region ID of the MNS queue.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static GetEventStreamingResponseBodyDataSourceSourceMNSParameters build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSourceSourceMNSParameters self = new GetEventStreamingResponseBodyDataSourceSourceMNSParameters();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSourceSourceMNSParameters setIsBase64Decode(Boolean isBase64Decode) {
            this.isBase64Decode = isBase64Decode;
            return this;
        }
        public Boolean getIsBase64Decode() {
            return this.isBase64Decode;
        }

        public GetEventStreamingResponseBodyDataSourceSourceMNSParameters setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public GetEventStreamingResponseBodyDataSourceSourceMNSParameters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class GetEventStreamingResponseBodyDataSourceSourceMQTTParameters extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>JSON</p>
         */
        @NameInMap("BodyDataType")
        public String bodyDataType;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-2ze06wqdwk0uq14krrzv</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The region ID of the Message Queue for MQTT instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the topic in the Message Queue for MQTT instance.</p>
         * 
         * <strong>example:</strong>
         * <p>TOPIC-cainiao-pcs-wms-instock-noPrealertPrintLabel</p>
         */
        @NameInMap("Topic")
        public String topic;

        public static GetEventStreamingResponseBodyDataSourceSourceMQTTParameters build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSourceSourceMQTTParameters self = new GetEventStreamingResponseBodyDataSourceSourceMQTTParameters();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSourceSourceMQTTParameters setBodyDataType(String bodyDataType) {
            this.bodyDataType = bodyDataType;
            return this;
        }
        public String getBodyDataType() {
            return this.bodyDataType;
        }

        public GetEventStreamingResponseBodyDataSourceSourceMQTTParameters setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetEventStreamingResponseBodyDataSourceSourceMQTTParameters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetEventStreamingResponseBodyDataSourceSourceMQTTParameters setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class GetEventStreamingResponseBodyDataSourceSourceOSSParameters extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>bucket_abc</p>
         */
        @NameInMap("BucketName")
        public String bucketName;

        /**
         * <strong>example:</strong>
         * <p>\n</p>
         */
        @NameInMap("Delimiter")
        public String delimiter;

        /**
         * <strong>example:</strong>
         * <p>TextLoader</p>
         */
        @NameInMap("LoadFormat")
        public String loadFormat;

        /**
         * <strong>example:</strong>
         * <p>single</p>
         */
        @NameInMap("LoadMode")
        public String loadMode;

        /**
         * <strong>example:</strong>
         * <p>fun/document/</p>
         */
        @NameInMap("Prefix")
        public String prefix;

        /**
         * <strong>example:</strong>
         * <p>eventbridge_oss_role</p>
         */
        @NameInMap("RoleName")
        public String roleName;

        public static GetEventStreamingResponseBodyDataSourceSourceOSSParameters build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSourceSourceOSSParameters self = new GetEventStreamingResponseBodyDataSourceSourceOSSParameters();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSourceSourceOSSParameters setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public GetEventStreamingResponseBodyDataSourceSourceOSSParameters setDelimiter(String delimiter) {
            this.delimiter = delimiter;
            return this;
        }
        public String getDelimiter() {
            return this.delimiter;
        }

        public GetEventStreamingResponseBodyDataSourceSourceOSSParameters setLoadFormat(String loadFormat) {
            this.loadFormat = loadFormat;
            return this;
        }
        public String getLoadFormat() {
            return this.loadFormat;
        }

        public GetEventStreamingResponseBodyDataSourceSourceOSSParameters setLoadMode(String loadMode) {
            this.loadMode = loadMode;
            return this;
        }
        public String getLoadMode() {
            return this.loadMode;
        }

        public GetEventStreamingResponseBodyDataSourceSourceOSSParameters setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public GetEventStreamingResponseBodyDataSourceSourceOSSParameters setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

    }

    public static class GetEventStreamingResponseBodyDataSourceSourceOpenSourceRabbitMQParameters extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ACL</p>
         */
        @NameInMap("AuthType")
        public String authType;

        /**
         * <strong>example:</strong>
         * <p>Json</p>
         */
        @NameInMap("BodyDataType")
        public String bodyDataType;

        /**
         * <strong>example:</strong>
         * <p>192.168.1.100:5672</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <strong>example:</strong>
         * <p>PrivateNetwork</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("QueueName")
        public String queueName;

        /**
         * <strong>example:</strong>
         * <p>sg-2ze65razphjfz3******</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("Username")
        public String username;

        /**
         * <strong>example:</strong>
         * <p>vsw-uf65zhil5oukof5******</p>
         */
        @NameInMap("VSwitchIds")
        public String vSwitchIds;

        /**
         * <strong>example:</strong>
         * <p>eb-connect</p>
         */
        @NameInMap("VirtualHostName")
        public String virtualHostName;

        /**
         * <strong>example:</strong>
         * <p>vpc-bp1vllc1lnw1v657******</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static GetEventStreamingResponseBodyDataSourceSourceOpenSourceRabbitMQParameters build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSourceSourceOpenSourceRabbitMQParameters self = new GetEventStreamingResponseBodyDataSourceSourceOpenSourceRabbitMQParameters();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSourceSourceOpenSourceRabbitMQParameters setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public GetEventStreamingResponseBodyDataSourceSourceOpenSourceRabbitMQParameters setBodyDataType(String bodyDataType) {
            this.bodyDataType = bodyDataType;
            return this;
        }
        public String getBodyDataType() {
            return this.bodyDataType;
        }

        public GetEventStreamingResponseBodyDataSourceSourceOpenSourceRabbitMQParameters setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public GetEventStreamingResponseBodyDataSourceSourceOpenSourceRabbitMQParameters setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public GetEventStreamingResponseBodyDataSourceSourceOpenSourceRabbitMQParameters setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public GetEventStreamingResponseBodyDataSourceSourceOpenSourceRabbitMQParameters setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public GetEventStreamingResponseBodyDataSourceSourceOpenSourceRabbitMQParameters setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public GetEventStreamingResponseBodyDataSourceSourceOpenSourceRabbitMQParameters setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public GetEventStreamingResponseBodyDataSourceSourceOpenSourceRabbitMQParameters setVSwitchIds(String vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public String getVSwitchIds() {
            return this.vSwitchIds;
        }

        public GetEventStreamingResponseBodyDataSourceSourceOpenSourceRabbitMQParameters setVirtualHostName(String virtualHostName) {
            this.virtualHostName = virtualHostName;
            return this;
        }
        public String getVirtualHostName() {
            return this.virtualHostName;
        }

        public GetEventStreamingResponseBodyDataSourceSourceOpenSourceRabbitMQParameters setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class GetEventStreamingResponseBodyDataSourceSourcePrometheusParameters extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>c83555068b6******ad213f565f209</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <strong>example:</strong>
         * <p>json</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <strong>example:</strong>
         * <p>{&quot;env&quot;:&quot;test&quot;}</p>
         */
        @NameInMap("ExternalLabels")
        public String externalLabels;

        /**
         * <strong>example:</strong>
         * <p><strong>name</strong>=.*</p>
         */
        @NameInMap("Labels")
        public String labels;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>test-role</p>
         */
        @NameInMap("RoleName")
        public String roleName;

        public static GetEventStreamingResponseBodyDataSourceSourcePrometheusParameters build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSourceSourcePrometheusParameters self = new GetEventStreamingResponseBodyDataSourceSourcePrometheusParameters();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSourceSourcePrometheusParameters setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetEventStreamingResponseBodyDataSourceSourcePrometheusParameters setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public GetEventStreamingResponseBodyDataSourceSourcePrometheusParameters setExternalLabels(String externalLabels) {
            this.externalLabels = externalLabels;
            return this;
        }
        public String getExternalLabels() {
            return this.externalLabels;
        }

        public GetEventStreamingResponseBodyDataSourceSourcePrometheusParameters setLabels(String labels) {
            this.labels = labels;
            return this;
        }
        public String getLabels() {
            return this.labels;
        }

        public GetEventStreamingResponseBodyDataSourceSourcePrometheusParameters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetEventStreamingResponseBodyDataSourceSourcePrometheusParameters setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

    }

    public static class GetEventStreamingResponseBodyDataSourceSourceRabbitMQParameters extends TeaModel {
        /**
         * <p>The ID of the Message Queue for RabbitMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-f8z9a9mcgwri1c1idd0z</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the queue in the Message Queue for RabbitMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>comp</p>
         */
        @NameInMap("QueueName")
        public String queueName;

        /**
         * <p>The region ID of the Message Queue for RabbitMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The vhost name of the Message Queue for RabbitMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>eb-connect</p>
         */
        @NameInMap("VirtualHostName")
        public String virtualHostName;

        public static GetEventStreamingResponseBodyDataSourceSourceRabbitMQParameters build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSourceSourceRabbitMQParameters self = new GetEventStreamingResponseBodyDataSourceSourceRabbitMQParameters();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSourceSourceRabbitMQParameters setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetEventStreamingResponseBodyDataSourceSourceRabbitMQParameters setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public GetEventStreamingResponseBodyDataSourceSourceRabbitMQParameters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetEventStreamingResponseBodyDataSourceSourceRabbitMQParameters setVirtualHostName(String virtualHostName) {
            this.virtualHostName = virtualHostName;
            return this;
        }
        public String getVirtualHostName() {
            return this.virtualHostName;
        }

    }

    public static class GetEventStreamingResponseBodyDataSourceSourceRocketMQCheckpointParameters extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>rmp-cn-jte3w******</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>Cloud_4</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Topics")
        public java.util.List<String> topics;

        public static GetEventStreamingResponseBodyDataSourceSourceRocketMQCheckpointParameters build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSourceSourceRocketMQCheckpointParameters self = new GetEventStreamingResponseBodyDataSourceSourceRocketMQCheckpointParameters();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSourceSourceRocketMQCheckpointParameters setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetEventStreamingResponseBodyDataSourceSourceRocketMQCheckpointParameters setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public GetEventStreamingResponseBodyDataSourceSourceRocketMQCheckpointParameters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetEventStreamingResponseBodyDataSourceSourceRocketMQCheckpointParameters setTopics(java.util.List<String> topics) {
            this.topics = topics;
            return this;
        }
        public java.util.List<String> getTopics() {
            return this.topics;
        }

    }

    public static class GetEventStreamingResponseBodyDataSourceSourceRocketMQParameters extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ACL</p>
         */
        @NameInMap("AuthType")
        public String authType;

        /**
         * <strong>example:</strong>
         * <p>Json</p>
         */
        @NameInMap("BodyDataType")
        public String bodyDataType;

        /**
         * <strong>example:</strong>
         * <p>index &gt; 10</p>
         */
        @NameInMap("FilterSql")
        public String filterSql;

        /**
         * <strong>example:</strong>
         * <p>Tag</p>
         */
        @NameInMap("FilterType")
        public String filterType;

        /**
         * <p>The ID of the consumer group in the Message Queue for Apache RocketMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>GID_group1</p>
         */
        @NameInMap("GroupID")
        public String groupID;

        /**
         * <strong>example:</strong>
         * <p>reg****-vpc.cn-zhangjiakou.aliyuncs.com</p>
         */
        @NameInMap("InstanceEndpoint")
        public String instanceEndpoint;

        /**
         * <p>The ID of the Message Queue for Apache RocketMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-f8zbher64dlm58plyfte</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>PublicNetwork</p>
         */
        @NameInMap("InstanceNetwork")
        public String instanceNetwork;

        /**
         * <strong>example:</strong>
         * <p>xxxa</p>
         */
        @NameInMap("InstancePassword")
        public String instancePassword;

        /**
         * <strong>example:</strong>
         * <p>sg-m5edtu24f12345****</p>
         */
        @NameInMap("InstanceSecurityGroupId")
        public String instanceSecurityGroupId;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <strong>example:</strong>
         * <p>xxxa</p>
         */
        @NameInMap("InstanceUsername")
        public String instanceUsername;

        /**
         * <strong>example:</strong>
         * <p>vsw-m5ev8asdc6h12****</p>
         */
        @NameInMap("InstanceVSwitchIds")
        public String instanceVSwitchIds;

        /**
         * <strong>example:</strong>
         * <p>vpc-m5e3sv4b12345****</p>
         */
        @NameInMap("InstanceVpcId")
        public String instanceVpcId;

        /**
         * <strong>example:</strong>
         * <p>PublicNetwork</p>
         */
        @NameInMap("Network")
        public String network;

        /**
         * <p>The consumer offset of messages. Valid values: CONSUME_FROM_LAST_OFFSET: Start consumption from the latest offset. CONSUME_FROM_FIRST_OFFSET: Start consumption from the earliest offset. CONSUME_FROM_TIMESTAMP: Start consumption from the offset at the specified point in time.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSUMEFROMLASTOFFSET</p>
         */
        @NameInMap("Offset")
        public String offset;

        /**
         * <p>The region ID of the Message Queue for Apache RocketMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>sg-m5edtu24f12345****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The tags that are used to filter messages.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The timestamp of the offset from which consumption starts. This parameter is valid only if you set the Offset parameter to CONSUME_FROM_TIMESTAMP.</p>
         * 
         * <strong>example:</strong>
         * <p>1636597951964</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <p>The topic to which the message belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>topic_add_anima</p>
         */
        @NameInMap("Topic")
        public String topic;

        /**
         * <strong>example:</strong>
         * <p>vsw-m5ev8asdc6h12345****</p>
         */
        @NameInMap("VSwitchIds")
        public String vSwitchIds;

        /**
         * <strong>example:</strong>
         * <p>vpc-m5e3sv4b12345****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static GetEventStreamingResponseBodyDataSourceSourceRocketMQParameters build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSourceSourceRocketMQParameters self = new GetEventStreamingResponseBodyDataSourceSourceRocketMQParameters();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSourceSourceRocketMQParameters setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public GetEventStreamingResponseBodyDataSourceSourceRocketMQParameters setBodyDataType(String bodyDataType) {
            this.bodyDataType = bodyDataType;
            return this;
        }
        public String getBodyDataType() {
            return this.bodyDataType;
        }

        public GetEventStreamingResponseBodyDataSourceSourceRocketMQParameters setFilterSql(String filterSql) {
            this.filterSql = filterSql;
            return this;
        }
        public String getFilterSql() {
            return this.filterSql;
        }

        public GetEventStreamingResponseBodyDataSourceSourceRocketMQParameters setFilterType(String filterType) {
            this.filterType = filterType;
            return this;
        }
        public String getFilterType() {
            return this.filterType;
        }

        public GetEventStreamingResponseBodyDataSourceSourceRocketMQParameters setGroupID(String groupID) {
            this.groupID = groupID;
            return this;
        }
        public String getGroupID() {
            return this.groupID;
        }

        public GetEventStreamingResponseBodyDataSourceSourceRocketMQParameters setInstanceEndpoint(String instanceEndpoint) {
            this.instanceEndpoint = instanceEndpoint;
            return this;
        }
        public String getInstanceEndpoint() {
            return this.instanceEndpoint;
        }

        public GetEventStreamingResponseBodyDataSourceSourceRocketMQParameters setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetEventStreamingResponseBodyDataSourceSourceRocketMQParameters setInstanceNetwork(String instanceNetwork) {
            this.instanceNetwork = instanceNetwork;
            return this;
        }
        public String getInstanceNetwork() {
            return this.instanceNetwork;
        }

        public GetEventStreamingResponseBodyDataSourceSourceRocketMQParameters setInstancePassword(String instancePassword) {
            this.instancePassword = instancePassword;
            return this;
        }
        public String getInstancePassword() {
            return this.instancePassword;
        }

        public GetEventStreamingResponseBodyDataSourceSourceRocketMQParameters setInstanceSecurityGroupId(String instanceSecurityGroupId) {
            this.instanceSecurityGroupId = instanceSecurityGroupId;
            return this;
        }
        public String getInstanceSecurityGroupId() {
            return this.instanceSecurityGroupId;
        }

        public GetEventStreamingResponseBodyDataSourceSourceRocketMQParameters setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public GetEventStreamingResponseBodyDataSourceSourceRocketMQParameters setInstanceUsername(String instanceUsername) {
            this.instanceUsername = instanceUsername;
            return this;
        }
        public String getInstanceUsername() {
            return this.instanceUsername;
        }

        public GetEventStreamingResponseBodyDataSourceSourceRocketMQParameters setInstanceVSwitchIds(String instanceVSwitchIds) {
            this.instanceVSwitchIds = instanceVSwitchIds;
            return this;
        }
        public String getInstanceVSwitchIds() {
            return this.instanceVSwitchIds;
        }

        public GetEventStreamingResponseBodyDataSourceSourceRocketMQParameters setInstanceVpcId(String instanceVpcId) {
            this.instanceVpcId = instanceVpcId;
            return this;
        }
        public String getInstanceVpcId() {
            return this.instanceVpcId;
        }

        public GetEventStreamingResponseBodyDataSourceSourceRocketMQParameters setNetwork(String network) {
            this.network = network;
            return this;
        }
        public String getNetwork() {
            return this.network;
        }

        public GetEventStreamingResponseBodyDataSourceSourceRocketMQParameters setOffset(String offset) {
            this.offset = offset;
            return this;
        }
        public String getOffset() {
            return this.offset;
        }

        public GetEventStreamingResponseBodyDataSourceSourceRocketMQParameters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetEventStreamingResponseBodyDataSourceSourceRocketMQParameters setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public GetEventStreamingResponseBodyDataSourceSourceRocketMQParameters setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public GetEventStreamingResponseBodyDataSourceSourceRocketMQParameters setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public GetEventStreamingResponseBodyDataSourceSourceRocketMQParameters setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public GetEventStreamingResponseBodyDataSourceSourceRocketMQParameters setVSwitchIds(String vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public String getVSwitchIds() {
            return this.vSwitchIds;
        }

        public GetEventStreamingResponseBodyDataSourceSourceRocketMQParameters setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class GetEventStreamingResponseBodyDataSourceSourceSLSParameters extends TeaModel {
        /**
         * <p>The starting consumer offset. The value begin indicates the earliest offset, and the value end indicates the latest offset. You can also specify a time in seconds to start consumption.</p>
         * 
         * <strong>example:</strong>
         * <p>begin</p>
         */
        @NameInMap("ConsumePosition")
        public String consumePosition;

        /**
         * <p>The consumer group.</p>
         */
        @NameInMap("ConsumerGroup")
        public String consumerGroup;

        /**
         * <p>The Log Service Logstore.</p>
         * 
         * <strong>example:</strong>
         * <p>waf-logstore</p>
         */
        @NameInMap("LogStore")
        public String logStore;

        /**
         * <p>The Log Service project.</p>
         * 
         * <strong>example:</strong>
         * <p>dmmzk</p>
         */
        @NameInMap("Project")
        public String project;

        /**
         * <p>The role name. If you want to authorize EventBridge to use this role to read logs in Log Service, you must select Alibaba Cloud Service for Selected Trusted Entity and EventBridge for Select Trusted Service when you create the role in the RAM console.</p>
         * 
         * <strong>example:</strong>
         * <p>testRole</p>
         */
        @NameInMap("RoleName")
        public String roleName;

        public static GetEventStreamingResponseBodyDataSourceSourceSLSParameters build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSourceSourceSLSParameters self = new GetEventStreamingResponseBodyDataSourceSourceSLSParameters();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSourceSourceSLSParameters setConsumePosition(String consumePosition) {
            this.consumePosition = consumePosition;
            return this;
        }
        public String getConsumePosition() {
            return this.consumePosition;
        }

        public GetEventStreamingResponseBodyDataSourceSourceSLSParameters setConsumerGroup(String consumerGroup) {
            this.consumerGroup = consumerGroup;
            return this;
        }
        public String getConsumerGroup() {
            return this.consumerGroup;
        }

        public GetEventStreamingResponseBodyDataSourceSourceSLSParameters setLogStore(String logStore) {
            this.logStore = logStore;
            return this;
        }
        public String getLogStore() {
            return this.logStore;
        }

        public GetEventStreamingResponseBodyDataSourceSourceSLSParameters setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public GetEventStreamingResponseBodyDataSourceSourceSLSParameters setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

    }

    public static class GetEventStreamingResponseBodyDataSource extends TeaModel {
        @NameInMap("SourceApacheKafkaParameters")
        public GetEventStreamingResponseBodyDataSourceSourceApacheKafkaParameters sourceApacheKafkaParameters;

        /**
         * <p>The parameters that are returned if Apache RocketMQ (Offset Data) is specified as the event source.</p>
         */
        @NameInMap("SourceApacheRocketMQCheckpointParameters")
        public GetEventStreamingResponseBodyDataSourceSourceApacheRocketMQCheckpointParameters sourceApacheRocketMQCheckpointParameters;

        @NameInMap("SourceCustomizedKafkaConnectorParameters")
        public GetEventStreamingResponseBodyDataSourceSourceCustomizedKafkaConnectorParameters sourceCustomizedKafkaConnectorParameters;

        @NameInMap("SourceCustomizedKafkaParameters")
        public GetEventStreamingResponseBodyDataSourceSourceCustomizedKafkaParameters sourceCustomizedKafkaParameters;

        /**
         * <p>The parameters that are returned if the event source is Data Transmission Service (DTS).</p>
         */
        @NameInMap("SourceDTSParameters")
        public GetEventStreamingResponseBodyDataSourceSourceDTSParameters sourceDTSParameters;

        @NameInMap("SourceEventBusParameters")
        public GetEventStreamingResponseBodyDataSourceSourceEventBusParameters sourceEventBusParameters;

        /**
         * <p>The parameters that are returned if ApsaraMQ for Kafka is specified as the event source.</p>
         */
        @NameInMap("SourceKafkaParameters")
        public GetEventStreamingResponseBodyDataSourceSourceKafkaParameters sourceKafkaParameters;

        /**
         * <p>Source MNS Parameters</p>
         */
        @NameInMap("SourceMNSParameters")
        public GetEventStreamingResponseBodyDataSourceSourceMNSParameters sourceMNSParameters;

        /**
         * <p>The parameters that are returned if ApsaraMQ for MQTT is specified as the event source.</p>
         */
        @NameInMap("SourceMQTTParameters")
        public GetEventStreamingResponseBodyDataSourceSourceMQTTParameters sourceMQTTParameters;

        @NameInMap("SourceMySQLParameters")
        public SourceMySQLParameters sourceMySQLParameters;

        @NameInMap("SourceOSSParameters")
        public GetEventStreamingResponseBodyDataSourceSourceOSSParameters sourceOSSParameters;

        @NameInMap("SourceOpenSourceRabbitMQParameters")
        public GetEventStreamingResponseBodyDataSourceSourceOpenSourceRabbitMQParameters sourceOpenSourceRabbitMQParameters;

        @NameInMap("SourcePostgreSQLParameters")
        public SourcePostgreSQLParameters sourcePostgreSQLParameters;

        @NameInMap("SourcePrometheusParameters")
        public GetEventStreamingResponseBodyDataSourceSourcePrometheusParameters sourcePrometheusParameters;

        @NameInMap("SourceRabbitMQMetaParameters")
        public SourceRabbitMQMetaParameters sourceRabbitMQMetaParameters;

        @NameInMap("SourceRabbitMQMsgSyncParameters")
        public SourceRabbitMQMsgSyncParameters sourceRabbitMQMsgSyncParameters;

        /**
         * <p>Source RabbitMQ Parameters</p>
         */
        @NameInMap("SourceRabbitMQParameters")
        public GetEventStreamingResponseBodyDataSourceSourceRabbitMQParameters sourceRabbitMQParameters;

        @NameInMap("SourceRocketMQCheckpointParameters")
        public GetEventStreamingResponseBodyDataSourceSourceRocketMQCheckpointParameters sourceRocketMQCheckpointParameters;

        /**
         * <p>The parameters that are returned if ApsaraMQ for RocketMQ is specified as the event source.</p>
         */
        @NameInMap("SourceRocketMQParameters")
        public GetEventStreamingResponseBodyDataSourceSourceRocketMQParameters sourceRocketMQParameters;

        /**
         * <p>The parameters that are returned if the event provider is Simple Log Service.</p>
         */
        @NameInMap("SourceSLSParameters")
        public GetEventStreamingResponseBodyDataSourceSourceSLSParameters sourceSLSParameters;

        public static GetEventStreamingResponseBodyDataSource build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSource self = new GetEventStreamingResponseBodyDataSource();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSource setSourceApacheKafkaParameters(GetEventStreamingResponseBodyDataSourceSourceApacheKafkaParameters sourceApacheKafkaParameters) {
            this.sourceApacheKafkaParameters = sourceApacheKafkaParameters;
            return this;
        }
        public GetEventStreamingResponseBodyDataSourceSourceApacheKafkaParameters getSourceApacheKafkaParameters() {
            return this.sourceApacheKafkaParameters;
        }

        public GetEventStreamingResponseBodyDataSource setSourceApacheRocketMQCheckpointParameters(GetEventStreamingResponseBodyDataSourceSourceApacheRocketMQCheckpointParameters sourceApacheRocketMQCheckpointParameters) {
            this.sourceApacheRocketMQCheckpointParameters = sourceApacheRocketMQCheckpointParameters;
            return this;
        }
        public GetEventStreamingResponseBodyDataSourceSourceApacheRocketMQCheckpointParameters getSourceApacheRocketMQCheckpointParameters() {
            return this.sourceApacheRocketMQCheckpointParameters;
        }

        public GetEventStreamingResponseBodyDataSource setSourceCustomizedKafkaConnectorParameters(GetEventStreamingResponseBodyDataSourceSourceCustomizedKafkaConnectorParameters sourceCustomizedKafkaConnectorParameters) {
            this.sourceCustomizedKafkaConnectorParameters = sourceCustomizedKafkaConnectorParameters;
            return this;
        }
        public GetEventStreamingResponseBodyDataSourceSourceCustomizedKafkaConnectorParameters getSourceCustomizedKafkaConnectorParameters() {
            return this.sourceCustomizedKafkaConnectorParameters;
        }

        public GetEventStreamingResponseBodyDataSource setSourceCustomizedKafkaParameters(GetEventStreamingResponseBodyDataSourceSourceCustomizedKafkaParameters sourceCustomizedKafkaParameters) {
            this.sourceCustomizedKafkaParameters = sourceCustomizedKafkaParameters;
            return this;
        }
        public GetEventStreamingResponseBodyDataSourceSourceCustomizedKafkaParameters getSourceCustomizedKafkaParameters() {
            return this.sourceCustomizedKafkaParameters;
        }

        public GetEventStreamingResponseBodyDataSource setSourceDTSParameters(GetEventStreamingResponseBodyDataSourceSourceDTSParameters sourceDTSParameters) {
            this.sourceDTSParameters = sourceDTSParameters;
            return this;
        }
        public GetEventStreamingResponseBodyDataSourceSourceDTSParameters getSourceDTSParameters() {
            return this.sourceDTSParameters;
        }

        public GetEventStreamingResponseBodyDataSource setSourceEventBusParameters(GetEventStreamingResponseBodyDataSourceSourceEventBusParameters sourceEventBusParameters) {
            this.sourceEventBusParameters = sourceEventBusParameters;
            return this;
        }
        public GetEventStreamingResponseBodyDataSourceSourceEventBusParameters getSourceEventBusParameters() {
            return this.sourceEventBusParameters;
        }

        public GetEventStreamingResponseBodyDataSource setSourceKafkaParameters(GetEventStreamingResponseBodyDataSourceSourceKafkaParameters sourceKafkaParameters) {
            this.sourceKafkaParameters = sourceKafkaParameters;
            return this;
        }
        public GetEventStreamingResponseBodyDataSourceSourceKafkaParameters getSourceKafkaParameters() {
            return this.sourceKafkaParameters;
        }

        public GetEventStreamingResponseBodyDataSource setSourceMNSParameters(GetEventStreamingResponseBodyDataSourceSourceMNSParameters sourceMNSParameters) {
            this.sourceMNSParameters = sourceMNSParameters;
            return this;
        }
        public GetEventStreamingResponseBodyDataSourceSourceMNSParameters getSourceMNSParameters() {
            return this.sourceMNSParameters;
        }

        public GetEventStreamingResponseBodyDataSource setSourceMQTTParameters(GetEventStreamingResponseBodyDataSourceSourceMQTTParameters sourceMQTTParameters) {
            this.sourceMQTTParameters = sourceMQTTParameters;
            return this;
        }
        public GetEventStreamingResponseBodyDataSourceSourceMQTTParameters getSourceMQTTParameters() {
            return this.sourceMQTTParameters;
        }

        public GetEventStreamingResponseBodyDataSource setSourceMySQLParameters(SourceMySQLParameters sourceMySQLParameters) {
            this.sourceMySQLParameters = sourceMySQLParameters;
            return this;
        }
        public SourceMySQLParameters getSourceMySQLParameters() {
            return this.sourceMySQLParameters;
        }

        public GetEventStreamingResponseBodyDataSource setSourceOSSParameters(GetEventStreamingResponseBodyDataSourceSourceOSSParameters sourceOSSParameters) {
            this.sourceOSSParameters = sourceOSSParameters;
            return this;
        }
        public GetEventStreamingResponseBodyDataSourceSourceOSSParameters getSourceOSSParameters() {
            return this.sourceOSSParameters;
        }

        public GetEventStreamingResponseBodyDataSource setSourceOpenSourceRabbitMQParameters(GetEventStreamingResponseBodyDataSourceSourceOpenSourceRabbitMQParameters sourceOpenSourceRabbitMQParameters) {
            this.sourceOpenSourceRabbitMQParameters = sourceOpenSourceRabbitMQParameters;
            return this;
        }
        public GetEventStreamingResponseBodyDataSourceSourceOpenSourceRabbitMQParameters getSourceOpenSourceRabbitMQParameters() {
            return this.sourceOpenSourceRabbitMQParameters;
        }

        public GetEventStreamingResponseBodyDataSource setSourcePostgreSQLParameters(SourcePostgreSQLParameters sourcePostgreSQLParameters) {
            this.sourcePostgreSQLParameters = sourcePostgreSQLParameters;
            return this;
        }
        public SourcePostgreSQLParameters getSourcePostgreSQLParameters() {
            return this.sourcePostgreSQLParameters;
        }

        public GetEventStreamingResponseBodyDataSource setSourcePrometheusParameters(GetEventStreamingResponseBodyDataSourceSourcePrometheusParameters sourcePrometheusParameters) {
            this.sourcePrometheusParameters = sourcePrometheusParameters;
            return this;
        }
        public GetEventStreamingResponseBodyDataSourceSourcePrometheusParameters getSourcePrometheusParameters() {
            return this.sourcePrometheusParameters;
        }

        public GetEventStreamingResponseBodyDataSource setSourceRabbitMQMetaParameters(SourceRabbitMQMetaParameters sourceRabbitMQMetaParameters) {
            this.sourceRabbitMQMetaParameters = sourceRabbitMQMetaParameters;
            return this;
        }
        public SourceRabbitMQMetaParameters getSourceRabbitMQMetaParameters() {
            return this.sourceRabbitMQMetaParameters;
        }

        public GetEventStreamingResponseBodyDataSource setSourceRabbitMQMsgSyncParameters(SourceRabbitMQMsgSyncParameters sourceRabbitMQMsgSyncParameters) {
            this.sourceRabbitMQMsgSyncParameters = sourceRabbitMQMsgSyncParameters;
            return this;
        }
        public SourceRabbitMQMsgSyncParameters getSourceRabbitMQMsgSyncParameters() {
            return this.sourceRabbitMQMsgSyncParameters;
        }

        public GetEventStreamingResponseBodyDataSource setSourceRabbitMQParameters(GetEventStreamingResponseBodyDataSourceSourceRabbitMQParameters sourceRabbitMQParameters) {
            this.sourceRabbitMQParameters = sourceRabbitMQParameters;
            return this;
        }
        public GetEventStreamingResponseBodyDataSourceSourceRabbitMQParameters getSourceRabbitMQParameters() {
            return this.sourceRabbitMQParameters;
        }

        public GetEventStreamingResponseBodyDataSource setSourceRocketMQCheckpointParameters(GetEventStreamingResponseBodyDataSourceSourceRocketMQCheckpointParameters sourceRocketMQCheckpointParameters) {
            this.sourceRocketMQCheckpointParameters = sourceRocketMQCheckpointParameters;
            return this;
        }
        public GetEventStreamingResponseBodyDataSourceSourceRocketMQCheckpointParameters getSourceRocketMQCheckpointParameters() {
            return this.sourceRocketMQCheckpointParameters;
        }

        public GetEventStreamingResponseBodyDataSource setSourceRocketMQParameters(GetEventStreamingResponseBodyDataSourceSourceRocketMQParameters sourceRocketMQParameters) {
            this.sourceRocketMQParameters = sourceRocketMQParameters;
            return this;
        }
        public GetEventStreamingResponseBodyDataSourceSourceRocketMQParameters getSourceRocketMQParameters() {
            return this.sourceRocketMQParameters;
        }

        public GetEventStreamingResponseBodyDataSource setSourceSLSParameters(GetEventStreamingResponseBodyDataSourceSourceSLSParameters sourceSLSParameters) {
            this.sourceSLSParameters = sourceSLSParameters;
            return this;
        }
        public GetEventStreamingResponseBodyDataSourceSourceSLSParameters getSourceSLSParameters() {
            return this.sourceSLSParameters;
        }

    }

    public static class GetEventStreamingResponseBodyDataTransforms extends TeaModel {
        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the cloud service, such as the ARN of a Function Compute function.</p>
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

        public static GetEventStreamingResponseBodyDataTransforms build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataTransforms self = new GetEventStreamingResponseBodyDataTransforms();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataTransforms setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public GetEventStreamingResponseBodyDataTransforms setBaiLianAgentTransformParameters(BaiLianAgentTransformParameters baiLianAgentTransformParameters) {
            this.baiLianAgentTransformParameters = baiLianAgentTransformParameters;
            return this;
        }
        public BaiLianAgentTransformParameters getBaiLianAgentTransformParameters() {
            return this.baiLianAgentTransformParameters;
        }

        public GetEventStreamingResponseBodyDataTransforms setDashScopeTransformParameters(DashScopeTransformParameters dashScopeTransformParameters) {
            this.dashScopeTransformParameters = dashScopeTransformParameters;
            return this;
        }
        public DashScopeTransformParameters getDashScopeTransformParameters() {
            return this.dashScopeTransformParameters;
        }

    }

    public static class GetEventStreamingResponseBodyData extends TeaModel {
        /**
         * <p>The description of the event stream that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>RocketMQ-to-RocketMQ</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("DetailedStatus")
        public GetEventStreamingResponseBodyDataDetailedStatus detailedStatus;

        /**
         * <p>The name of the event stream that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>rocketmq-sync</p>
         */
        @NameInMap("EventStreamingName")
        public String eventStreamingName;

        /**
         * <p>The rule that is used to filter events. If you leave this parameter empty, all events are matched.</p>
         */
        @NameInMap("FilterPattern")
        public String filterPattern;

        /**
         * <p>The runtime environment-related configurations.</p>
         */
        @NameInMap("RunOptions")
        public GetEventStreamingResponseBodyDataRunOptions runOptions;

        /**
         * <p>The event target.</p>
         */
        @NameInMap("Sink")
        public GetEventStreamingResponseBodyDataSink sink;

        /**
         * <p>The event source.</p>
         */
        @NameInMap("Source")
        public GetEventStreamingResponseBodyDataSource source;

        /**
         * <p>The status of the event stream that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("Transforms")
        public java.util.List<GetEventStreamingResponseBodyDataTransforms> transforms;

        public static GetEventStreamingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyData self = new GetEventStreamingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetEventStreamingResponseBodyData setDetailedStatus(GetEventStreamingResponseBodyDataDetailedStatus detailedStatus) {
            this.detailedStatus = detailedStatus;
            return this;
        }
        public GetEventStreamingResponseBodyDataDetailedStatus getDetailedStatus() {
            return this.detailedStatus;
        }

        public GetEventStreamingResponseBodyData setEventStreamingName(String eventStreamingName) {
            this.eventStreamingName = eventStreamingName;
            return this;
        }
        public String getEventStreamingName() {
            return this.eventStreamingName;
        }

        public GetEventStreamingResponseBodyData setFilterPattern(String filterPattern) {
            this.filterPattern = filterPattern;
            return this;
        }
        public String getFilterPattern() {
            return this.filterPattern;
        }

        public GetEventStreamingResponseBodyData setRunOptions(GetEventStreamingResponseBodyDataRunOptions runOptions) {
            this.runOptions = runOptions;
            return this;
        }
        public GetEventStreamingResponseBodyDataRunOptions getRunOptions() {
            return this.runOptions;
        }

        public GetEventStreamingResponseBodyData setSink(GetEventStreamingResponseBodyDataSink sink) {
            this.sink = sink;
            return this;
        }
        public GetEventStreamingResponseBodyDataSink getSink() {
            return this.sink;
        }

        public GetEventStreamingResponseBodyData setSource(GetEventStreamingResponseBodyDataSource source) {
            this.source = source;
            return this;
        }
        public GetEventStreamingResponseBodyDataSource getSource() {
            return this.source;
        }

        public GetEventStreamingResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetEventStreamingResponseBodyData setTransforms(java.util.List<GetEventStreamingResponseBodyDataTransforms> transforms) {
            this.transforms = transforms;
            return this;
        }
        public java.util.List<GetEventStreamingResponseBodyDataTransforms> getTransforms() {
            return this.transforms;
        }

    }

}
