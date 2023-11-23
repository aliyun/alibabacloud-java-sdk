// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateEventStreamingRequest extends TeaModel {
    /**
     * <p>The description of the event stream.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the event stream.</p>
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
    public CreateEventStreamingRequestRunOptions runOptions;

    /**
     * <p>The event target. You must and can specify only one event target.</p>
     */
    @NameInMap("Sink")
    public CreateEventStreamingRequestSink sink;

    /**
     * <p>The event provider, which is also known as the event source. You must and can specify only one event source.</p>
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
         */
        @NameInMap("CountBasedWindow")
        public Integer countBasedWindow;

        /**
         * <p>The maximum period of time during which events are allowed in the batch window. Unit: seconds. When this threshold is reached, data in the window is pushed to the downstream service. If multiple batch windows exist, data is pushed if triggering conditions are met in one of the windows.</p>
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

    public static class CreateEventStreamingRequestRunOptionsRetryStrategy extends TeaModel {
        /**
         * <p>The maximum timeout period for a retry.</p>
         */
        @NameInMap("MaximumEventAgeInSeconds")
        public Long maximumEventAgeInSeconds;

        /**
         * <p>The maximum number of retries.</p>
         */
        @NameInMap("MaximumRetryAttempts")
        public Long maximumRetryAttempts;

        /**
         * <p>The retry policy. Valid values:</p>
         * <br>
         * <p>*   BACKOFF_RETRY</p>
         * <p>*   EXPONENTIAL_DECAY_RETRY</p>
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
         * <br>
         * <p>*   NONE: does not tolerate exceptions.</p>
         * <p>*   ALL: tolerates all exceptions.</p>
         */
        @NameInMap("ErrorsTolerance")
        public String errorsTolerance;

        /**
         * <p>The maximum number of concurrent threads.</p>
         */
        @NameInMap("MaximumTasks")
        public Long maximumTasks;

        /**
         * <p>The retry policy that you want to use if events fail to be pushed.</p>
         */
        @NameInMap("RetryStrategy")
        public CreateEventStreamingRequestRunOptionsRetryStrategy retryStrategy;

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

        public CreateEventStreamingRequestRunOptions setMaximumTasks(Long maximumTasks) {
            this.maximumTasks = maximumTasks;
            return this;
        }
        public Long getMaximumTasks() {
            return this.maximumTasks;
        }

        public CreateEventStreamingRequestRunOptions setRetryStrategy(CreateEventStreamingRequestRunOptionsRetryStrategy retryStrategy) {
            this.retryStrategy = retryStrategy;
            return this;
        }
        public CreateEventStreamingRequestRunOptionsRetryStrategy getRetryStrategy() {
            return this.retryStrategy;
        }

    }

    public static class CreateEventStreamingRequestSinkSinkDataHubParametersBody extends TeaModel {
        /**
         * <p>The format into which you want to transform events.</p>
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
         * <p>The format into which you want to transform events. Default value: CONSTANT.</p>
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
         * <p>The format into which you want to transform events. Default value: CONSTANT.</p>
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
         * <p>The format into which you want to transform events. Default value: CONSTANT.</p>
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
         * <p>The format into which you want to transform events.</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which you want to transform events.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The TUBLE topic.</p>
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
         * <p>The format into which you want to transform events. Default value: CONSTANT.</p>
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
         * <br>
         * <p>*   TUPLE</p>
         * <p>*   BLOB</p>
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
         * <br>
         * <p>*   TUPLE</p>
         * <p>*   BLOB</p>
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
         * <p>The format into which you want to transform events.</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which you want to transform events.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value before transformation.</p>
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
         * <p>The format into which you want to transform events. Default value: CONSTANT.</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which you want to transform events.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The delivery concurrency. Minimum value: 1.</p>
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
         * <p>The format into which you want to transform events. Default value: CONSTANT.</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which you want to transform events.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The function name.</p>
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
         * <p>The format into which you want to transform events. Default value: CONSTANT.</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which you want to transform events.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The invocation method. Valid values: Sync and Async.</p>
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
         * <p>The format into which you want to transform events. Default value: CONSTANT.</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which you want to transform events.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The service version.</p>
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
         * <p>The format into which you want to transform events. Default value: CONSTANT.</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which you want to transform events.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The service name.</p>
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
         * <p>The invocation method. Valid values: Sync and Async.</p>
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
         * <p>The format into which you want to transform events. Default value: CONSTANT.</p>
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
         * <p>The format into which you want to transform events. Default value: CONSTANT.</p>
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
         * <p>The format into which you want to transform events. Default value: CONSTANT.</p>
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
         * <p>The format into which you want to transform events. Default value: CONSTANT.</p>
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
         * <p>The format into which you want to transform events. Default value: CONSTANT.</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which you want to transform events.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The ACK mode.</p>
         * <br>
         * <p>*   If you set this parameter to 0, no response is returned from the broker. In this mode, the performance is high, but the risk of data loss is also high.</p>
         * <p>*   If you set this parameter to 1, a response is returned when data is written to the leader. In this mode, the performance and the risk of data loss are moderate. Data loss may occur if a failure occurs on the leader.</p>
         * <p>*   If you set this parameter to all, a response is returned when data is written to the leader and synchronized to the followers. In this mode, the performance is low, but the risk of data loss is also low. Data loss occurs if the leader and the followers fail at the same time.</p>
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
         * <p>The format into which you want to transform events. Default value: CONSTANT.</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which you want to transform events.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The instance ID.</p>
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
         * <p>The format into which you want to transform events. Default value: CONSTANT.</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which you want to transform events.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The message key.</p>
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
         * <p>The format into which you want to transform events. Default value: CONSTANT.</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which you want to transform events.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The topic name.</p>
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
         * <p>The format into which you want to transform events.</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which you want to transform events.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value before transformation.</p>
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
         * <p>The acknowledgement (ACK) mode.</p>
         * <br>
         * <p>*   If you set this parameter to 0, no response is returned from the broker. In this mode, the performance is high, but the risk of data loss is also high.</p>
         * <p>*   If you set this parameter to 1, a response is returned when data is written to the leader. In this mode, the performance and the risk of data loss are moderate. Data loss may occur if a failure occurs on the leader.</p>
         * <p>*   If you set this parameter to all, a response is returned when data is written to the leader and synchronized to the followers. In this mode, the performance is low, but the risk of data loss is also low. Data loss occurs if the leader and the followers fail at the same time.</p>
         */
        @NameInMap("Acks")
        public CreateEventStreamingRequestSinkSinkKafkaParametersAcks acks;

        /**
         * <p>The ID of the Message Queue for Apache Kafka instance.</p>
         */
        @NameInMap("InstanceId")
        public CreateEventStreamingRequestSinkSinkKafkaParametersInstanceId instanceId;

        /**
         * <p>The message key.</p>
         */
        @NameInMap("Key")
        public CreateEventStreamingRequestSinkSinkKafkaParametersKey key;

        /**
         * <p>The topic name.</p>
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
         * <p>The format into which you want to transform events.</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which you want to transform events.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value before transformation.</p>
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
         * <p>The format into which you want to transform events. Default value: CONSTANT.</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which you want to transform events.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>Specifies that Base64 encoding is enabled.</p>
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
         * <p>The format into which you want to transform events. Default value: CONSTANT.</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which you want to transform events.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The name of the MNS queue.</p>
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
         * <p>The message body.</p>
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

    public static class CreateEventStreamingRequestSinkSinkRabbitMQParametersBody extends TeaModel {
        /**
         * <p>The format into which you want to transform events.</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which you want to transform events.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value before transformation.</p>
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
         * <p>The format into which you want to transform events. Default value: CONSTANT.</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which you want to transform events.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The name of the exchange on the Message Queue for RabbitMQ instance.</p>
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
         * <p>The format into which you want to transform events. Default value: CONSTANT.</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which you want to transform events.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The ID of the Message Queue for RabbitMQ instance.</p>
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
         * <p>The format into which you want to transform events.</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which you want to transform events.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value before transformation.</p>
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
         * <p>The format into which you want to transform events.</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which you want to transform events.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value before transformation.</p>
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
         * <p>The format into which you want to transform events. Default value: CONSTANT.</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which you want to transform events.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The name of the queue on the Message Queue for RabbitMQ instance.</p>
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
         * <p>The format into which you want to transform events. Default value: CONSTANT.</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which you want to transform events.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The rule that you want to use to route messages.</p>
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
         * <p>The format into which you want to transform events. Default value: CONSTANT.</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which you want to transform events.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The type of the resource to which you want to deliver events. Valid values:</p>
         * <br>
         * <p>*   Exchange</p>
         * <p>*   Queue</p>
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
         * <p>The format into which you want to transform events. Default value: CONSTANT.</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which you want to transform events.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The name of the vhost of the Message Queue for RabbitMQ instance.</p>
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
         * <p>The message body.</p>
         */
        @NameInMap("Body")
        public CreateEventStreamingRequestSinkSinkRabbitMQParametersBody body;

        /**
         * <p>The exchange to which you want to deliver events. This parameter is available only if you set TargetType to Exchange.</p>
         */
        @NameInMap("Exchange")
        public CreateEventStreamingRequestSinkSinkRabbitMQParametersExchange exchange;

        /**
         * <p>The information about the Message Queue for RabbitMQ instance.</p>
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
         * <p>The queue to which you want to deliver events. This parameter is available only if you set TargetType to Queue.</p>
         */
        @NameInMap("QueueName")
        public CreateEventStreamingRequestSinkSinkRabbitMQParametersQueueName queueName;

        /**
         * <p>The rule that you want to use to route messages. This parameter is available only if you set TargetType to Exchange.</p>
         */
        @NameInMap("RoutingKey")
        public CreateEventStreamingRequestSinkSinkRabbitMQParametersRoutingKey routingKey;

        /**
         * <p>The type of the resource to which you want to deliver events.</p>
         */
        @NameInMap("TargetType")
        public CreateEventStreamingRequestSinkSinkRabbitMQParametersTargetType targetType;

        /**
         * <p>The name of the vhost of the Message Queue for RabbitMQ instance.</p>
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
         * <p>The format into which you want to transform events.</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which you want to transform events.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value before transformation.</p>
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
         * <p>The format into which you want to transform events. Default value: CONSTANT.</p>
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
         * <p>The format into which you want to transform events. Default value: CONSTANT.</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which you want to transform events.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The ID of the Message Queue for Apache RocketMQ instance.</p>
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
         * <p>The format into which you want to transform events. Default value: CONSTANT.</p>
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
         * <p>The format into which you want to transform events. Default value: CONSTANT.</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>None.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The instance type.</p>
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
         * <p>The format into which you want to transform events. Default value: CONSTANT.</p>
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
         * <p>The format into which you want to transform events.</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which you want to transform events.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value before transformation.</p>
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
         * <p>The format into which you want to transform events. Default value: CONSTANT.</p>
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
         * <br>
         * <p>*   PublicNetwork</p>
         * <p>*   PrivateNetwork</p>
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
         * <p>The format into which you want to transform events.</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which you want to transform events.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value before transformation.</p>
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
         * <p>The format into which you want to transform events. Default value: CONSTANT.</p>
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
         * <p>The format into which you want to transform events.</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which you want to transform events.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value before transformation.</p>
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
         * <p>The format into which you want to transform events. Default value: CONSTANT.</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which you want to transform events.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The name of the topic on the Message Queue for Apache RocketMQ instance.</p>
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
         * <p>The format into which you want to transform events. Default value: CONSTANT.</p>
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
         * <p>The format into which you want to transform events. Default value: CONSTANT.</p>
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
         * <p>The message body.</p>
         */
        @NameInMap("Body")
        public CreateEventStreamingRequestSinkSinkRocketMQParametersBody body;

        /**
         * <p>The instance endpoint.</p>
         */
        @NameInMap("InstanceEndpoint")
        public CreateEventStreamingRequestSinkSinkRocketMQParametersInstanceEndpoint instanceEndpoint;

        /**
         * <p>The parameters that are configured if you specify the event target as Message Queue for Apache RocketMQ.</p>
         */
        @NameInMap("InstanceId")
        public CreateEventStreamingRequestSinkSinkRocketMQParametersInstanceId instanceId;

        /**
         * <p>The instance password.</p>
         */
        @NameInMap("InstancePassword")
        public CreateEventStreamingRequestSinkSinkRocketMQParametersInstancePassword instancePassword;

        /**
         * <p>The instance type.</p>
         */
        @NameInMap("InstanceType")
        public CreateEventStreamingRequestSinkSinkRocketMQParametersInstanceType instanceType;

        /**
         * <p>The instance username.</p>
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
         * <br>
         * <p>*   PublicNetwork</p>
         * <p>*   PrivateNetwork</p>
         */
        @NameInMap("Network")
        public CreateEventStreamingRequestSinkSinkRocketMQParametersNetwork network;

        /**
         * <p>The properties that you want to use to filter messages.</p>
         */
        @NameInMap("Properties")
        public CreateEventStreamingRequestSinkSinkRocketMQParametersProperties properties;

        /**
         * <p>The security group ID.</p>
         */
        @NameInMap("SecurityGroupId")
        public CreateEventStreamingRequestSinkSinkRocketMQParametersSecurityGroupId securityGroupId;

        /**
         * <p>The tags that you want to use to filter messages.</p>
         */
        @NameInMap("Tags")
        public CreateEventStreamingRequestSinkSinkRocketMQParametersTags tags;

        /**
         * <p>The topic on the Message Queue for Apache RocketMQ instance.</p>
         */
        @NameInMap("Topic")
        public CreateEventStreamingRequestSinkSinkRocketMQParametersTopic topic;

        /**
         * <p>The vSwitch ID.</p>
         */
        @NameInMap("VSwitchIds")
        public CreateEventStreamingRequestSinkSinkRocketMQParametersVSwitchIds vSwitchIds;

        /**
         * <p>The VPC ID.</p>
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
         * <p>The format into which you want to transform events.</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template based on which you want to transform events.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value before transformation.</p>
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

    public static class CreateEventStreamingRequestSinkSinkSLSParametersLogStore extends TeaModel {
        /**
         * <p>The format into which you want to transform events. Default value: CONSTANT.</p>
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
         * <p>The format into which you want to transform events. Default value: CONSTANT.</p>
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
         * <p>The format into which you want to transform events. Default value: CONSTANT.</p>
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
         * <p>The format into which you want to transform events. Default value: CONSTANT.</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>None.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The topic that you want to use to store logs. This parameter corresponds to the **topic** reserved field in Simple Log Service.</p>
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
         * <p>The role name. If you want to authorize EventBridge to use this role to read logs in Log Service, you must select Alibaba Cloud Service for Selected Trusted Entity and EventBridge for Select Trusted Service when you create the role in the Resource Access Management (RAM) console.</p>
         */
        @NameInMap("RoleName")
        public CreateEventStreamingRequestSinkSinkSLSParametersRoleName roleName;

        /**
         * <p>The topic that you want to use to store logs. This parameter corresponds to the **topic** reserved field in Simple Log Service.</p>
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
        /**
         * <p>The parameters that are configured if you specify the event target as DataHub.</p>
         */
        @NameInMap("SinkDataHubParameters")
        public CreateEventStreamingRequestSinkSinkDataHubParameters sinkDataHubParameters;

        /**
         * <p>The parameters that are configured if you specify the event target as Function Compute.</p>
         */
        @NameInMap("SinkFcParameters")
        public CreateEventStreamingRequestSinkSinkFcParameters sinkFcParameters;

        /**
         * <p>The parameters that are configured if you specify the event target as Serverless Workflow.</p>
         */
        @NameInMap("SinkFnfParameters")
        public CreateEventStreamingRequestSinkSinkFnfParameters sinkFnfParameters;

        /**
         * <p>The parameters that are configured if you specify the event target as Message Queue for Apache Kafka.</p>
         */
        @NameInMap("SinkKafkaParameters")
        public CreateEventStreamingRequestSinkSinkKafkaParameters sinkKafkaParameters;

        /**
         * <p>The parameters that are configured if you specify the event target as MNS.</p>
         */
        @NameInMap("SinkMNSParameters")
        public CreateEventStreamingRequestSinkSinkMNSParameters sinkMNSParameters;

        /**
         * <p>The parameters that are configured if you specify the event target as Message Queue for RabbitMQ.</p>
         */
        @NameInMap("SinkRabbitMQParameters")
        public CreateEventStreamingRequestSinkSinkRabbitMQParameters sinkRabbitMQParameters;

        /**
         * <p>The parameters that are configured if you specify the event target as Message Queue for Apache RocketMQ.</p>
         */
        @NameInMap("SinkRocketMQParameters")
        public CreateEventStreamingRequestSinkSinkRocketMQParameters sinkRocketMQParameters;

        /**
         * <p>The parameters that are configured if you specify the event target as Simple Log Service.</p>
         */
        @NameInMap("SinkSLSParameters")
        public CreateEventStreamingRequestSinkSinkSLSParameters sinkSLSParameters;

        public static CreateEventStreamingRequestSink build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSink self = new CreateEventStreamingRequestSink();
            return TeaModel.build(map, self);
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

    public static class CreateEventStreamingRequestSourceSourceDTSParameters extends TeaModel {
        /**
         * <p>The URL and port number of the data subscription channel.</p>
         */
        @NameInMap("BrokerUrl")
        public String brokerUrl;

        /**
         * <p>The consumer offset. It is the timestamp that indicates when the SDK client consumes the first data record.</p>
         */
        @NameInMap("InitCheckPoint")
        public Long initCheckPoint;

        /**
         * <p>The consumer group password.</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The consumer group ID.</p>
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
         * <p>The consumer group username.</p>
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
         * <p>The network type. Default value: Default. The value PublicNetwork specifies virtual private clouds (VPCs).</p>
         */
        @NameInMap("Network")
        public String network;

        /**
         * <p>The offset.</p>
         */
        @NameInMap("OffsetReset")
        public String offsetReset;

        /**
         * <p>The region ID.</p>
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
         */
        @NameInMap("Topic")
        public String topic;

        /**
         * <p>The vSwitch ID.</p>
         */
        @NameInMap("VSwitchIds")
        public String vSwitchIds;

        /**
         * <p>The VPC ID.</p>
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
         */
        @NameInMap("IsBase64Decode")
        public Boolean isBase64Decode;

        /**
         * <p>The queue name.</p>
         */
        @NameInMap("QueueName")
        public String queueName;

        /**
         * <p>The region ID.</p>
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
        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The region ID.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The topic in which messages are stored.</p>
         */
        @NameInMap("Topic")
        public String topic;

        public static CreateEventStreamingRequestSourceSourceMQTTParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSourceSourceMQTTParameters self = new CreateEventStreamingRequestSourceSourceMQTTParameters();
            return TeaModel.build(map, self);
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

    public static class CreateEventStreamingRequestSourceSourceRabbitMQParameters extends TeaModel {
        /**
         * <p>The ID of the Message Queue for RabbitMQ instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the queue on the Message Queue for RabbitMQ instance.</p>
         */
        @NameInMap("QueueName")
        public String queueName;

        /**
         * <p>The region ID. You can call the [describeregions](~~62010~~) operation to query the most recent region list.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the vhost of the Message Queue for RabbitMQ instance.</p>
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
         */
        @NameInMap("AuthType")
        public String authType;

        /**
         * <p>The SQL statement that is used to filter messages.</p>
         */
        @NameInMap("FilterSql")
        public String filterSql;

        /**
         * <p>The message filter type.</p>
         */
        @NameInMap("FilterType")
        public String filterType;

        /**
         * <p>The ID of the consumer group on the Message Queue for Apache RocketMQ instance.</p>
         */
        @NameInMap("GroupID")
        public String groupID;

        /**
         * <p>The instance endpoint.</p>
         */
        @NameInMap("InstanceEndpoint")
        public String instanceEndpoint;

        /**
         * <p>The region where the Message Queue for Apache RocketMQ instance resides.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The network type of the instance. Valid values:</p>
         * <br>
         * <p>*   PublicNetwork</p>
         * <p>*   PrivateNetwork</p>
         */
        @NameInMap("InstanceNetwork")
        public String instanceNetwork;

        /**
         * <p>The instance password.</p>
         */
        @NameInMap("InstancePassword")
        public String instancePassword;

        /**
         * <p>The security group ID of the instance.</p>
         */
        @NameInMap("InstanceSecurityGroupId")
        public String instanceSecurityGroupId;

        /**
         * <p>The instance type.</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The instance username.</p>
         */
        @NameInMap("InstanceUsername")
        public String instanceUsername;

        /**
         * <p>The vSwitch ID of the instance.</p>
         */
        @NameInMap("InstanceVSwitchIds")
        public String instanceVSwitchIds;

        /**
         * <p>The VPC ID of the instance.</p>
         */
        @NameInMap("InstanceVpcId")
        public String instanceVpcId;

        /**
         * <p>The network type. Valid values: PublicNetwork and PrivateNetwork.</p>
         */
        @NameInMap("Network")
        public String network;

        /**
         * <p>The offset from which message consumption starts. Valid values:</p>
         * <br>
         * <p>*   CONSUME_FROM_LAST_OFFSET: Start message consumption from the latest offset.</p>
         * <p>*   CONSUME_FROM_FIRST_OFFSET: Start message consumption from the earliest offset.</p>
         * <p>*   CONSUME_FROM_TIMESTAMP: Start message consumption from the offset at the specified point in time.</p>
         * <br>
         * <p>Default value: CONSUME_FROM_LAST_OFFSET.</p>
         */
        @NameInMap("Offset")
        public String offset;

        /**
         * <p>The region ID.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The security group of the cross-border task.</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The tag that is used to filter messages.</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The timestamp that specifies the time from which messages are consumed. This parameter is valid only if you set Offset to CONSUME_FROM_TIMESTAMP.</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <p>The name of the topic on the Message Queue for Apache RocketMQ instance.</p>
         */
        @NameInMap("Topic")
        public String topic;

        /**
         * <p>The vSwitch ID of the cross-border task.</p>
         */
        @NameInMap("VSwitchIds")
        public String vSwitchIds;

        /**
         * <p>The VPC ID of the cross-border task.</p>
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
         * <p>The consumer offset. The value begin indicates the earliest offset, and the value end indicates the latest offset. You can also specify a time in seconds to start message consumption.</p>
         */
        @NameInMap("ConsumePosition")
        public String consumePosition;

        /**
         * <p>The Simple Log Service Logstore.</p>
         */
        @NameInMap("LogStore")
        public String logStore;

        /**
         * <p>The Simple Log Service project.</p>
         */
        @NameInMap("Project")
        public String project;

        /**
         * <p>The role name. If you want to authorize EventBridge to use this role to read logs in Simple Log Service, you must select Alibaba Cloud Service for Selected Trusted Entity and EventBridge for Select Trusted Service when you create the role in the Resource Access Management (RAM) console.</p>
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
        /**
         * <p>The parameters that are configured if you specify the event source as Data Transmission Service (DTS).</p>
         */
        @NameInMap("SourceDTSParameters")
        public CreateEventStreamingRequestSourceSourceDTSParameters sourceDTSParameters;

        /**
         * <p>The parameters that are configured if you specify the event source as Message Queue for Apache Kafka.</p>
         */
        @NameInMap("SourceKafkaParameters")
        public CreateEventStreamingRequestSourceSourceKafkaParameters sourceKafkaParameters;

        /**
         * <p>The parameters that are configured if you specify the event source as Message Service (MNS).</p>
         */
        @NameInMap("SourceMNSParameters")
        public CreateEventStreamingRequestSourceSourceMNSParameters sourceMNSParameters;

        /**
         * <p>The parameters that are configured if you specify the event source as Message Queue for MQTT.</p>
         */
        @NameInMap("SourceMQTTParameters")
        public CreateEventStreamingRequestSourceSourceMQTTParameters sourceMQTTParameters;

        /**
         * <p>The parameters that are configured if you specify the event source as Message Queue for RabbitMQ.</p>
         */
        @NameInMap("SourceRabbitMQParameters")
        public CreateEventStreamingRequestSourceSourceRabbitMQParameters sourceRabbitMQParameters;

        /**
         * <p>The parameters that are configured if you specify the event source as Message Queue for Apache RocketMQ.</p>
         */
        @NameInMap("SourceRocketMQParameters")
        public CreateEventStreamingRequestSourceSourceRocketMQParameters sourceRocketMQParameters;

        /**
         * <p>The parameters that are configured if you specify the event source as Simple Log Service.</p>
         */
        @NameInMap("SourceSLSParameters")
        public CreateEventStreamingRequestSourceSourceSLSParameters sourceSLSParameters;

        public static CreateEventStreamingRequestSource build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingRequestSource self = new CreateEventStreamingRequestSource();
            return TeaModel.build(map, self);
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
