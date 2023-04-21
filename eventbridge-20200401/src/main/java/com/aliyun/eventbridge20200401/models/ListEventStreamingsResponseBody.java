// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListEventStreamingsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListEventStreamingsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CountBasedWindow")
        public Integer countBasedWindow;

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
        @NameInMap("MaximumEventAgeInSeconds")
        public Float maximumEventAgeInSeconds;

        @NameInMap("MaximumRetryAttempts")
        public Float maximumRetryAttempts;

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
        @NameInMap("BatchWindow")
        public ListEventStreamingsResponseBodyDataEventStreamingsRunOptionsBatchWindow batchWindow;

        @NameInMap("DeadLetterQueue")
        public ListEventStreamingsResponseBodyDataEventStreamingsRunOptionsDeadLetterQueue deadLetterQueue;

        @NameInMap("ErrorsTolerance")
        public String errorsTolerance;

        @NameInMap("MaximumTasks")
        public Integer maximumTasks;

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

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersBody extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersFunctionName extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Body")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersBody body;

        @NameInMap("Concurrency")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersConcurrency concurrency;

        @NameInMap("FunctionName")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersFunctionName functionName;

        @NameInMap("InvocationType")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersInvocationType invocationType;

        @NameInMap("Qualifier")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParametersQualifier qualifier;

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

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParametersAcks extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Acks")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParametersAcks acks;

        @NameInMap("InstanceId")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParametersInstanceId instanceId;

        @NameInMap("Key")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParametersKey key;

        @NameInMap("Topic")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParametersTopic topic;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Body")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkMNSParametersBody body;

        @NameInMap("IsBase64Encode")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkMNSParametersIsBase64Encode isBase64Encode;

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

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersBody extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Body")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersBody body;

        @NameInMap("Exchange")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersExchange exchange;

        @NameInMap("InstanceId")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersInstanceId instanceId;

        @NameInMap("MessageId")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersMessageId messageId;

        @NameInMap("Properties")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersProperties properties;

        @NameInMap("QueueName")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersQueueName queueName;

        @NameInMap("RoutingKey")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersRoutingKey routingKey;

        @NameInMap("TargetType")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParametersTargetType targetType;

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

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersBody extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersInstanceId extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersKeys extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersProperties extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersTags extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParameters extends TeaModel {
        @NameInMap("Body")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersBody body;

        @NameInMap("InstanceId")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersInstanceId instanceId;

        @NameInMap("Keys")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersKeys keys;

        @NameInMap("Properties")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersProperties properties;

        @NameInMap("Tags")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersTags tags;

        @NameInMap("Topic")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersTopic topic;

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

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParameters setInstanceId(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersInstanceId instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersInstanceId getInstanceId() {
            return this.instanceId;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParameters setKeys(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersKeys keys) {
            this.keys = keys;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersKeys getKeys() {
            return this.keys;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParameters setProperties(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersProperties properties) {
            this.properties = properties;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParametersProperties getProperties() {
            return this.properties;
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

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersBody extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersLogStore extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Body")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersBody body;

        @NameInMap("LogStore")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersLogStore logStore;

        @NameInMap("Project")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersProject project;

        @NameInMap("RoleName")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParametersRoleName roleName;

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
        @NameInMap("SinkFcParameters")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParameters sinkFcParameters;

        @NameInMap("SinkKafkaParameters")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkKafkaParameters sinkKafkaParameters;

        @NameInMap("SinkMNSParameters")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkMNSParameters sinkMNSParameters;

        @NameInMap("SinkRabbitMQParameters")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParameters sinkRabbitMQParameters;

        /**
         * <p>Sink RocketMQ Parameters</p>
         */
        @NameInMap("SinkRocketMQParameters")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRocketMQParameters sinkRocketMQParameters;

        /**
         * <p>Sink SLS Parameters</p>
         */
        @NameInMap("SinkSLSParameters")
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkSLSParameters sinkSLSParameters;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSink build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSink self = new ListEventStreamingsResponseBodyDataEventStreamingsSink();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSink setSinkFcParameters(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParameters sinkFcParameters) {
            this.sinkFcParameters = sinkFcParameters;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkFcParameters getSinkFcParameters() {
            return this.sinkFcParameters;
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

        public ListEventStreamingsResponseBodyDataEventStreamingsSink setSinkRabbitMQParameters(ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParameters sinkRabbitMQParameters) {
            this.sinkRabbitMQParameters = sinkRabbitMQParameters;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSinkSinkRabbitMQParameters getSinkRabbitMQParameters() {
            return this.sinkRabbitMQParameters;
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

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceDTSParameters extends TeaModel {
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

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceKafkaParameters extends TeaModel {
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

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceKafkaParameters setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceMNSParameters extends TeaModel {
        @NameInMap("IsBase64Decode")
        public Boolean isBase64Decode;

        @NameInMap("QueueName")
        public String queueName;

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
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Topic")
        public String topic;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceMQTTParameters build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceMQTTParameters self = new ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceMQTTParameters();
            return TeaModel.build(map, self);
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

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRabbitMQParameters extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("QueueName")
        public String queueName;

        @NameInMap("RegionId")
        public String regionId;

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

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRocketMQParameters extends TeaModel {
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

        public static ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRocketMQParameters build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRocketMQParameters self = new ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRocketMQParameters();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRocketMQParameters setGroupID(String groupID) {
            this.groupID = groupID;
            return this;
        }
        public String getGroupID() {
            return this.groupID;
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRocketMQParameters setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
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

    }

    public static class ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceSLSParameters extends TeaModel {
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
        @NameInMap("SourceDTSParameters")
        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceDTSParameters sourceDTSParameters;

        /**
         * <p>Source Kafka Parameters</p>
         */
        @NameInMap("SourceKafkaParameters")
        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceKafkaParameters sourceKafkaParameters;

        /**
         * <p>Source MNS Parameters</p>
         */
        @NameInMap("SourceMNSParameters")
        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceMNSParameters sourceMNSParameters;

        @NameInMap("SourceMQTTParameters")
        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceMQTTParameters sourceMQTTParameters;

        /**
         * <p>Source RabbitMQ Parameters</p>
         */
        @NameInMap("SourceRabbitMQParameters")
        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRabbitMQParameters sourceRabbitMQParameters;

        /**
         * <p>Source RocketMQ Parameters</p>
         */
        @NameInMap("SourceRocketMQParameters")
        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRocketMQParameters sourceRocketMQParameters;

        @NameInMap("SourceSLSParameters")
        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceSLSParameters sourceSLSParameters;

        public static ListEventStreamingsResponseBodyDataEventStreamingsSource build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsResponseBodyDataEventStreamingsSource self = new ListEventStreamingsResponseBodyDataEventStreamingsSource();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsResponseBodyDataEventStreamingsSource setSourceDTSParameters(ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceDTSParameters sourceDTSParameters) {
            this.sourceDTSParameters = sourceDTSParameters;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceDTSParameters getSourceDTSParameters() {
            return this.sourceDTSParameters;
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

        public ListEventStreamingsResponseBodyDataEventStreamingsSource setSourceRabbitMQParameters(ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRabbitMQParameters sourceRabbitMQParameters) {
            this.sourceRabbitMQParameters = sourceRabbitMQParameters;
            return this;
        }
        public ListEventStreamingsResponseBodyDataEventStreamingsSourceSourceRabbitMQParameters getSourceRabbitMQParameters() {
            return this.sourceRabbitMQParameters;
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

    public static class ListEventStreamingsResponseBodyDataEventStreamings extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("EventStreamingName")
        public String eventStreamingName;

        @NameInMap("FilterPattern")
        public String filterPattern;

        @NameInMap("RunOptions")
        public ListEventStreamingsResponseBodyDataEventStreamingsRunOptions runOptions;

        @NameInMap("Sink")
        public ListEventStreamingsResponseBodyDataEventStreamingsSink sink;

        @NameInMap("Source")
        public ListEventStreamingsResponseBodyDataEventStreamingsSource source;

        @NameInMap("Status")
        public String status;

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

    }

    public static class ListEventStreamingsResponseBodyData extends TeaModel {
        @NameInMap("EventStreamings")
        public java.util.List<ListEventStreamingsResponseBodyDataEventStreamings> eventStreamings;

        @NameInMap("NextToken")
        public String nextToken;

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
