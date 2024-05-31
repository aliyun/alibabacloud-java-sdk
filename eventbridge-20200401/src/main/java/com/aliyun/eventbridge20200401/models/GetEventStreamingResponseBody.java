// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class GetEventStreamingResponseBody extends TeaModel {
    /**
     * <p>The response code. The value Success indicates that the request is successful. Other values indicate that the request failed. For a list of error codes, see Error codes.</p>
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
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation is successful. The value true indicates that the operation is successful.</p>
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

    public static class GetEventStreamingResponseBodyDataRunOptionsBatchWindow extends TeaModel {
        /**
         * <p>The maximum number of events that are allowed in the batch window. If this threshold is reached, data in the window is pushed downstream. When multiple batch windows exist, data is pushed if triggering conditions are met in one of the windows.</p>
         */
        @NameInMap("CountBasedWindow")
        public Integer countBasedWindow;

        /**
         * <p>The maximum period of time during which events are allowed in the batch window. Unit: seconds. If this threshold is reached, data in the window is pushed downstream. When multiple batch windows exist, data is pushed if triggering conditions are met in one of the windows.</p>
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

    public static class GetEventStreamingResponseBodyDataRunOptionsDeadLetterQueue extends TeaModel {
        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the dead-letter queue.</p>
         */
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
        /**
         * <p>The maximum period of time during which retries are performed.</p>
         */
        @NameInMap("MaximumEventAgeInSeconds")
        public Float maximumEventAgeInSeconds;

        /**
         * <p>The maximum number of retries.</p>
         */
        @NameInMap("MaximumRetryAttempts")
        public Float maximumRetryAttempts;

        /**
         * <p>The retry policy. Valid values: BACKOFFRETRY and EXPONENTIALDECAY_RETRY.</p>
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

        /**
         * <p>Indicates whether dead-letter queues are enabled. By default, dead-letter queues are disabled. Messages that fail to be pushed after allowed retries as specified by the retry policy are discarded.</p>
         */
        @NameInMap("DeadLetterQueue")
        public GetEventStreamingResponseBodyDataRunOptionsDeadLetterQueue deadLetterQueue;

        /**
         * <p>The fault tolerance policy. The value NONE specifies that faults are not tolerated, and the value All specifies that all faults are tolerated.</p>
         */
        @NameInMap("ErrorsTolerance")
        public String errorsTolerance;

        /**
         * <p>The concurrency level.</p>
         */
        @NameInMap("MaximumTasks")
        public Integer maximumTasks;

        /**
         * <p>The information about the retry policy that is used if the event fails to be pushed.</p>
         */
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
        /**
         * <p>The method that is used to transform the event.</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which the event is transformed.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value before the transformation.</p>
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
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template style.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The delivery concurrency. Minimum value: 1.</p>
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

    public static class GetEventStreamingResponseBodyDataSinkSinkFcParametersFunctionName extends TeaModel {
        /**
         * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template style.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The function name.</p>
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
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template style.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The invocation type.</p>
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
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template style.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The alias of the service to which the function belongs.</p>
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
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template style.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The name of the service.</p>
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
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template style.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The acknowledgment information.</p>
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

    public static class GetEventStreamingResponseBodyDataSinkSinkKafkaParametersInstanceId extends TeaModel {
        /**
         * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template style.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The instance ID.</p>
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
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template style.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The message key.</p>
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
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template style.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The topic name.</p>
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
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which the event is transformed.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value before the transformation.</p>
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
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which the event is transformed.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value before the transformation.</p>
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

    public static class GetEventStreamingResponseBodyDataSinkSinkRabbitMQParametersBody extends TeaModel {
        /**
         * <p>The method that is used to transform the event.</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which the event is transformed.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value before the transformation.</p>
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
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template style.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The name of the exchange in the Message Queue for RabbitMQ instance.</p>
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
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template style.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The ID of the Message Queue for RabbitMQ instance.</p>
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
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which the event is transformed.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value before the transformation.</p>
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
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which the event is transformed.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value before the transformation.</p>
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
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template style.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The name of the queue in the Message Queue for RabbitMQ instance.</p>
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
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template style.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The routing rule for the message.</p>
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
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template style.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The type of the resource to which the event is delivered. Valid values: Exchange: exchanges. Queue: queues.</p>
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

    public static class GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersBody extends TeaModel {
        /**
         * <p>The method that is used to transform the event.</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which the event is transformed.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value before the transformation.</p>
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

    public static class GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersInstanceId extends TeaModel {
        /**
         * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template style.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The ID of the Message Queue for Apache RocketMQ instance.</p>
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

    public static class GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersKeys extends TeaModel {
        /**
         * <p>The method that is used to transform the event.</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which the event is transformed.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value before the transformation.</p>
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

    public static class GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersProperties extends TeaModel {
        /**
         * <p>The method that is used to transform the event.</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which the event is transformed.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value before the transformation.</p>
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

    public static class GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersTags extends TeaModel {
        /**
         * <p>The method that is used to transform the event.</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which the event is transformed.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value before the transformation.</p>
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
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template style.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The name of the topic in the Message Queue for Apache RocketMQ instance.</p>
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

    public static class GetEventStreamingResponseBodyDataSinkSinkRocketMQParameters extends TeaModel {
        /**
         * <p>The message content.</p>
         */
        @NameInMap("Body")
        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersBody body;

        /**
         * <p>The target service type is Message Queue for Apache RocketMQ.</p>
         */
        @NameInMap("InstanceId")
        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersInstanceId instanceId;

        /**
         * <p>The tags that are used to filter messages.</p>
         */
        @NameInMap("Keys")
        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersKeys keys;

        /**
         * <p>The tags that are used to filter messages.</p>
         */
        @NameInMap("Properties")
        public GetEventStreamingResponseBodyDataSinkSinkRocketMQParametersProperties properties;

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
        /**
         * <p>The method that is used to transform the event.</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which the event is transformed.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value before the transformation.</p>
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

    public static class GetEventStreamingResponseBodyDataSinkSinkSLSParametersLogStore extends TeaModel {
        /**
         * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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

        /**
         * <p>The parameters that are returned if the event target is Message Queue for RabbitMQ.</p>
         */
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

        public GetEventStreamingResponseBodyDataSink setSinkFnfParameters(GetEventStreamingResponseBodyDataSinkSinkFnfParameters sinkFnfParameters) {
            this.sinkFnfParameters = sinkFnfParameters;
            return this;
        }
        public GetEventStreamingResponseBodyDataSinkSinkFnfParameters getSinkFnfParameters() {
            return this.sinkFnfParameters;
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

    public static class GetEventStreamingResponseBodyDataSourceSourceDTSParameters extends TeaModel {
        /**
         * <p>The URL and port number of the data subscription channel.</p>
         */
        @NameInMap("BrokerUrl")
        public String brokerUrl;

        /**
         * <p>The consumer offset. A consumer offset is a timestamp that indicates when the SDK client consumes the first data record. The value is a UNIX timestamp.</p>
         */
        @NameInMap("InitCheckPoint")
        public String initCheckPoint;

        /**
         * <p>The password of the consumer group.</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The ID of the consumer group.</p>
         */
        @NameInMap("Sid")
        public String sid;

        /**
         * <p>The task ID.</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The topic to which you want to subscribe by using the data subscription channel.</p>
         */
        @NameInMap("Topic")
        public String topic;

        /**
         * <p>The account of the consumer group.</p>
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

    public static class GetEventStreamingResponseBodyDataSourceSourceKafkaParameters extends TeaModel {
        /**
         * <p>The ID of the consumer group that subscribes to the topic.</p>
         */
        @NameInMap("ConsumerGroup")
        public String consumerGroup;

        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The network. Default value: Default. The value PublicNetwork specifies a virtual private cloud (VPC).</p>
         */
        @NameInMap("Network")
        public String network;

        /**
         * <p>The offset.</p>
         */
        @NameInMap("OffsetReset")
        public String offsetReset;

        /**
         * <p>The region ID of the Message Queue for Apache Kafka instance.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The security group ID.</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The name of the topic.</p>
         */
        @NameInMap("Topic")
        public String topic;

        /**
         * <p>The vSwitch ID.</p>
         */
        @NameInMap("VSwitchIds")
        public String vSwitchIds;

        /**
         * <p>The encoding or decoding format. Valid values: Json, Text, and Binary. The value Json indicates that bytes are decoded into UTF-8 strings and then parsed into JSON format. The value Text indicates that bytes are decoded into UTF-8 strings and then put into the payload. The value Binary indicates that bytes are encoded into Base64 strings and put into the payload.</p>
         */
        @NameInMap("ValueDataType")
        public String valueDataType;

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
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
         */
        @NameInMap("IsBase64Decode")
        public Boolean isBase64Decode;

        /**
         * <p>The name of the MNS queue.</p>
         */
        @NameInMap("QueueName")
        public String queueName;

        /**
         * <p>The region ID of the MNS queue.</p>
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
         * <p>The instance ID.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The region ID of the Message Queue for MQTT instance.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the topic in the Message Queue for MQTT instance.</p>
         */
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

    public static class GetEventStreamingResponseBodyDataSourceSourcePrometheusParameters extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("DataType")
        public String dataType;

        @NameInMap("Labels")
        public String labels;

        @NameInMap("RegionId")
        public String regionId;

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

    }

    public static class GetEventStreamingResponseBodyDataSourceSourceRabbitMQParameters extends TeaModel {
        /**
         * <p>The ID of the Message Queue for RabbitMQ instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the queue in the Message Queue for RabbitMQ instance.</p>
         */
        @NameInMap("QueueName")
        public String queueName;

        /**
         * <p>The region ID of the Message Queue for RabbitMQ instance.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The vhost name of the Message Queue for RabbitMQ instance.</p>
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

    public static class GetEventStreamingResponseBodyDataSourceSourceRocketMQParameters extends TeaModel {
        @NameInMap("AuthType")
        public String authType;

        @NameInMap("BodyDataType")
        public String bodyDataType;

        /**
         * <p>The ID of the consumer group in the Message Queue for Apache RocketMQ instance.</p>
         */
        @NameInMap("GroupID")
        public String groupID;

        @NameInMap("InstanceEndpoint")
        public String instanceEndpoint;

        /**
         * <p>The ID of the Message Queue for Apache RocketMQ instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceNetwork")
        public String instanceNetwork;

        @NameInMap("InstancePassword")
        public String instancePassword;

        @NameInMap("InstanceSecurityGroupId")
        public String instanceSecurityGroupId;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("InstanceUsername")
        public String instanceUsername;

        @NameInMap("InstanceVSwitchIds")
        public String instanceVSwitchIds;

        @NameInMap("InstanceVpcId")
        public String instanceVpcId;

        /**
         * <p>The consumer offset of messages. Valid values: CONSUME_FROM_LAST_OFFSET: Start consumption from the latest offset. CONSUME_FROM_FIRST_OFFSET: Start consumption from the earliest offset. CONSUME_FROM_TIMESTAMP: Start consumption from the offset at the specified point in time.</p>
         */
        @NameInMap("Offset")
        public String offset;

        /**
         * <p>The region ID of the Message Queue for Apache RocketMQ instance.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The tags that are used to filter messages.</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The timestamp of the offset from which consumption starts. This parameter is valid only if you set the Offset parameter to CONSUME_FROM_TIMESTAMP.</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <p>The topic to which the message belongs.</p>
         */
        @NameInMap("Topic")
        public String topic;

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
        /**
         * <p>The starting consumer offset. The value begin indicates the earliest offset, and the value end indicates the latest offset. You can also specify a time in seconds to start consumption.</p>
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
         */
        @NameInMap("LogStore")
        public String logStore;

        /**
         * <p>The Log Service project.</p>
         */
        @NameInMap("Project")
        public String project;

        /**
         * <p>The role name. If you want to authorize EventBridge to use this role to read logs in Log Service, you must select Alibaba Cloud Service for Selected Trusted Entity and EventBridge for Select Trusted Service when you create the role in the RAM console.</p>
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
         * <p>The parameters that are returned if the event source is Data Transmission Service (DTS).</p>
         */
        @NameInMap("SourceDTSParameters")
        public GetEventStreamingResponseBodyDataSourceSourceDTSParameters sourceDTSParameters;

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
         * <p>The parameters that are returned if the event source is Message Queue for MQTT.</p>
         */
        @NameInMap("SourceMQTTParameters")
        public GetEventStreamingResponseBodyDataSourceSourceMQTTParameters sourceMQTTParameters;

        @NameInMap("SourcePrometheusParameters")
        public GetEventStreamingResponseBodyDataSourceSourcePrometheusParameters sourcePrometheusParameters;

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

        public GetEventStreamingResponseBodyDataSource setSourcePrometheusParameters(GetEventStreamingResponseBodyDataSourceSourcePrometheusParameters sourcePrometheusParameters) {
            this.sourcePrometheusParameters = sourcePrometheusParameters;
            return this;
        }
        public GetEventStreamingResponseBodyDataSourceSourcePrometheusParameters getSourcePrometheusParameters() {
            return this.sourcePrometheusParameters;
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

    public static class GetEventStreamingResponseBodyDataTransforms extends TeaModel {
        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the cloud service, such as the ARN of a Function Compute function.</p>
         */
        @NameInMap("Arn")
        public String arn;

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

    }

    public static class GetEventStreamingResponseBodyData extends TeaModel {
        /**
         * <p>The description of the event stream that is returned.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the event stream that is returned.</p>
         */
        @NameInMap("EventStreamingName")
        public String eventStreamingName;

        /**
         * <p>The rule that is used to filter events. If you leave this parameter empty, all events are matched.</p>
         */
        @NameInMap("FilterPattern")
        public String filterPattern;

        /**
         * <p>The parameters that are configured for the runtime environment.</p>
         */
        @NameInMap("RunOptions")
        public GetEventStreamingResponseBodyDataRunOptions runOptions;

        /**
         * <p>The event target.</p>
         */
        @NameInMap("Sink")
        public GetEventStreamingResponseBodyDataSink sink;

        /**
         * <p>The event provider, which is also known as the event source.</p>
         */
        @NameInMap("Source")
        public GetEventStreamingResponseBodyDataSource source;

        /**
         * <p>The status of the event stream that is returned.</p>
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
