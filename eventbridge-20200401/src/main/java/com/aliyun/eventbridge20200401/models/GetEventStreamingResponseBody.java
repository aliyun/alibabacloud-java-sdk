// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class GetEventStreamingResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetEventStreamingResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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

    public static class GetEventStreamingResponseBodyDataRunOptionsBatchWindow extends TeaModel {
        @NameInMap("CountBasedWindow")
        public Integer countBasedWindow;

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

    public static class GetEventStreamingResponseBodyDataRunOptionsDeadLetterQueue extends TeaModel {
        @NameInMap("Arn")
        public String arn;

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

    }

    public static class GetEventStreamingResponseBodyDataRunOptionsRetryStrategy extends TeaModel {
        @NameInMap("MaximumEventAgeInSeconds")
        public Float maximumEventAgeInSeconds;

        @NameInMap("MaximumRetryAttempts")
        public Float maximumRetryAttempts;

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
        @NameInMap("BatchWindow")
        public GetEventStreamingResponseBodyDataRunOptionsBatchWindow batchWindow;

        @NameInMap("DeadLetterQueue")
        public GetEventStreamingResponseBodyDataRunOptionsDeadLetterQueue deadLetterQueue;

        @NameInMap("ErrorsTolerance")
        public String errorsTolerance;

        @NameInMap("MaximumTasks")
        public Integer maximumTasks;

        @NameInMap("RetryStrategy")
        public GetEventStreamingResponseBodyDataRunOptionsRetryStrategy retryStrategy;

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

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkFcParametersBody extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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

    public static class GetEventStreamingResponseBodyDataSinkSinkFcParametersFunctionName extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Body")
        public GetEventStreamingResponseBodyDataSinkSinkFcParametersBody body;

        @NameInMap("Concurrency")
        public GetEventStreamingResponseBodyDataSinkSinkFcParametersConcurrency concurrency;

        @NameInMap("FunctionName")
        public GetEventStreamingResponseBodyDataSinkSinkFcParametersFunctionName functionName;

        @NameInMap("InvocationType")
        public GetEventStreamingResponseBodyDataSinkSinkFcParametersInvocationType invocationType;

        @NameInMap("Qualifier")
        public GetEventStreamingResponseBodyDataSinkSinkFcParametersQualifier qualifier;

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

    public static class GetEventStreamingResponseBodyDataSinkSinkKafkaParametersAcks extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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

    public static class GetEventStreamingResponseBodyDataSinkSinkKafkaParametersInstanceId extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Acks")
        public GetEventStreamingResponseBodyDataSinkSinkKafkaParametersAcks acks;

        @NameInMap("InstanceId")
        public GetEventStreamingResponseBodyDataSinkSinkKafkaParametersInstanceId instanceId;

        @NameInMap("Key")
        public GetEventStreamingResponseBodyDataSinkSinkKafkaParametersKey key;

        @NameInMap("Topic")
        public GetEventStreamingResponseBodyDataSinkSinkKafkaParametersTopic topic;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Body")
        public GetEventStreamingResponseBodyDataSinkSinkMNSParametersBody body;

        @NameInMap("IsBase64Encode")
        public GetEventStreamingResponseBodyDataSinkSinkMNSParametersIsBase64Encode isBase64Encode;

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

    public static class GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersBody extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Body")
        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersBody body;

        @NameInMap("Exchange")
        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersExchange exchange;

        @NameInMap("InstanceId")
        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersInstanceId instanceId;

        @NameInMap("MessageId")
        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersMessageId messageId;

        @NameInMap("Properties")
        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersProperties properties;

        @NameInMap("QueueName")
        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersQueueName queueName;

        @NameInMap("RoutingKey")
        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersRoutingKey routingKey;

        @NameInMap("TargetType")
        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersTargetType targetType;

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

    public static class GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersBody extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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

    public static class GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersInstanceId extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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

    public static class GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersKeys extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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

    public static class GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersProperties extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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

    public static class GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersTags extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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

    public static class GetEventStreamingResponseBodyDataSinkSinkRocketMQParameters extends TeaModel {
        @NameInMap("Body")
        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersBody body;

        @NameInMap("InstanceId")
        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersInstanceId instanceId;

        @NameInMap("Keys")
        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersKeys keys;

        @NameInMap("Properties")
        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersProperties properties;

        @NameInMap("Tags")
        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersTags tags;

        @NameInMap("Topic")
        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersTopic topic;

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

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParameters setInstanceId(GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersInstanceId instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersInstanceId getInstanceId() {
            return this.instanceId;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParameters setKeys(GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersKeys keys) {
            this.keys = keys;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersKeys getKeys() {
            return this.keys;
        }

        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParameters setProperties(GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersProperties properties) {
            this.properties = properties;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersProperties getProperties() {
            return this.properties;
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

    }

    public static class GetEventStreamingResponseBodyDataSinkSinkSLSParametersBody extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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

    public static class GetEventStreamingResponseBodyDataSinkSinkSLSParametersLogStore extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Body")
        public GetEventStreamingResponseBodyDataSinkSinkSLSParametersBody body;

        @NameInMap("LogStore")
        public GetEventStreamingResponseBodyDataSinkSinkSLSParametersLogStore logStore;

        @NameInMap("Project")
        public GetEventStreamingResponseBodyDataSinkSinkSLSParametersProject project;

        @NameInMap("RoleName")
        public GetEventStreamingResponseBodyDataSinkSinkSLSParametersRoleName roleName;

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
        @NameInMap("SinkFcParameters")
        public GetEventStreamingResponseBodyDataSinkSinkFcParameters sinkFcParameters;

        @NameInMap("SinkKafkaParameters")
        public GetEventStreamingResponseBodyDataSinkSinkKafkaParameters sinkKafkaParameters;

        @NameInMap("SinkMNSParameters")
        public GetEventStreamingResponseBodyDataSinkSinkMNSParameters sinkMNSParameters;

        @NameInMap("SinkRabbitMQParameters")
        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParameters sinkRabbitMQParameters;

        /**
         * <p>Sink RocketMQ Parameters</p>
         */
        @NameInMap("SinkRocketMQParameters")
        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParameters sinkRocketMQParameters;

        /**
         * <p>Sink SLS Parameters</p>
         */
        @NameInMap("SinkSLSParameters")
        public GetEventStreamingResponseBodyDataSinkSinkSLSParameters sinkSLSParameters;

        public static GetEventStreamingResponseBodyDataSink build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSink self = new GetEventStreamingResponseBodyDataSink();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSink setSinkFcParameters(GetEventStreamingResponseBodyDataSinkSinkFcParameters sinkFcParameters) {
            this.sinkFcParameters = sinkFcParameters;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkFcParameters getSinkFcParameters() {
            return this.sinkFcParameters;
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

        public GetEventStreamingResponseBodyDataSink setSinkRabbitMQParameters(GetEventStreamingResponseBodyDataSinkSinkRabbitMQParameters sinkRabbitMQParameters) {
            this.sinkRabbitMQParameters = sinkRabbitMQParameters;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkRabbitMQParameters getSinkRabbitMQParameters() {
            return this.sinkRabbitMQParameters;
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

    public static class GetEventStreamingResponseBodyDataSourceSourceDTSParameters extends TeaModel {
        @NameInMap("BrokerUrl")
        public String brokerUrl;

        @NameInMap("InitCheckPoint")
        public String initCheckPoint;

        @NameInMap("Password")
        public String password;

        @NameInMap("Sid")
        public String sid;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("Topic")
        public String topic;

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

    public static class GetEventStreamingResponseBodyDataSourceSourceKafkaParameters extends TeaModel {
        @NameInMap("ConsumerGroup")
        public String consumerGroup;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Network")
        public String network;

        @NameInMap("OffsetReset")
        public String offsetReset;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("Topic")
        public String topic;

        @NameInMap("VSwitchIds")
        public String vSwitchIds;

        /**
         * <p>VPC ID。</p>
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

        public GetEventStreamingResponseBodyDataSourceSourceKafkaParameters setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class GetEventStreamingResponseBodyDataSourceSourceMNSParameters extends TeaModel {
        @NameInMap("IsBase64Decode")
        public Boolean isBase64Decode;

        @NameInMap("QueueName")
        public String queueName;

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
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Topic")
        public String topic;

        public static GetEventStreamingResponseBodyDataSourceSourceMQTTParameters build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSourceSourceMQTTParameters self = new GetEventStreamingResponseBodyDataSourceSourceMQTTParameters();
            return TeaModel.build(map, self);
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

    public static class GetEventStreamingResponseBodyDataSourceSourceRabbitMQParameters extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("QueueName")
        public String queueName;

        @NameInMap("RegionId")
        public String regionId;

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

    public static class GetEventStreamingResponseBodyDataSourceSourceRocketMQParameters extends TeaModel {
        @NameInMap("GroupID")
        public String groupID;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Offset")
        public String offset;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Topic")
        public String topic;

        public static GetEventStreamingResponseBodyDataSourceSourceRocketMQParameters build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSourceSourceRocketMQParameters self = new GetEventStreamingResponseBodyDataSourceSourceRocketMQParameters();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSourceSourceRocketMQParameters setGroupID(String groupID) {
            this.groupID = groupID;
            return this;
        }
        public String getGroupID() {
            return this.groupID;
        }

        public GetEventStreamingResponseBodyDataSourceSourceRocketMQParameters setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
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

    }

    public static class GetEventStreamingResponseBodyDataSourceSourceSLSParameters extends TeaModel {
        @NameInMap("ConsumePosition")
        public String consumePosition;

        @NameInMap("ConsumerGroup")
        public String consumerGroup;

        @NameInMap("LogStore")
        public String logStore;

        @NameInMap("Project")
        public String project;

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
        @NameInMap("SourceDTSParameters")
        public GetEventStreamingResponseBodyDataSourceSourceDTSParameters sourceDTSParameters;

        /**
         * <p>Source Kafka Parameters</p>
         */
        @NameInMap("SourceKafkaParameters")
        public GetEventStreamingResponseBodyDataSourceSourceKafkaParameters sourceKafkaParameters;

        /**
         * <p>Source MNS Parameters</p>
         */
        @NameInMap("SourceMNSParameters")
        public GetEventStreamingResponseBodyDataSourceSourceMNSParameters sourceMNSParameters;

        @NameInMap("SourceMQTTParameters")
        public GetEventStreamingResponseBodyDataSourceSourceMQTTParameters sourceMQTTParameters;

        /**
         * <p>Source RabbitMQ Parameters</p>
         */
        @NameInMap("SourceRabbitMQParameters")
        public GetEventStreamingResponseBodyDataSourceSourceRabbitMQParameters sourceRabbitMQParameters;

        /**
         * <p>Source RocketMQ Parameters</p>
         */
        @NameInMap("SourceRocketMQParameters")
        public GetEventStreamingResponseBodyDataSourceSourceRocketMQParameters sourceRocketMQParameters;

        @NameInMap("SourceSLSParameters")
        public GetEventStreamingResponseBodyDataSourceSourceSLSParameters sourceSLSParameters;

        public static GetEventStreamingResponseBodyDataSource build(java.util.Map<String, ?> map) throws Exception {
            GetEventStreamingResponseBodyDataSource self = new GetEventStreamingResponseBodyDataSource();
            return TeaModel.build(map, self);
        }

        public GetEventStreamingResponseBodyDataSource setSourceDTSParameters(GetEventStreamingResponseBodyDataSourceSourceDTSParameters sourceDTSParameters) {
            this.sourceDTSParameters = sourceDTSParameters;
            return this;
        }
        public GetEventStreamingResponseBodyDataSourceSourceDTSParameters getSourceDTSParameters() {
            return this.sourceDTSParameters;
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

        public GetEventStreamingResponseBodyDataSource setSourceRabbitMQParameters(GetEventStreamingResponseBodyDataSourceSourceRabbitMQParameters sourceRabbitMQParameters) {
            this.sourceRabbitMQParameters = sourceRabbitMQParameters;
            return this;
        }
        public GetEventStreamingResponseBodyDataSourceSourceRabbitMQParameters getSourceRabbitMQParameters() {
            return this.sourceRabbitMQParameters;
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

    public static class GetEventStreamingResponseBodyData extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("EventStreamingName")
        public String eventStreamingName;

        @NameInMap("FilterPattern")
        public String filterPattern;

        @NameInMap("RunOptions")
        public GetEventStreamingResponseBodyDataRunOptions runOptions;

        @NameInMap("Sink")
        public GetEventStreamingResponseBodyDataSink sink;

        @NameInMap("Source")
        public GetEventStreamingResponseBodyDataSource source;

        @NameInMap("Status")
        public String status;

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

    }

}
