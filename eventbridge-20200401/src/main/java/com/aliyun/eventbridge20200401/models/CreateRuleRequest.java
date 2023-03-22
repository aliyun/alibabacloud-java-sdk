// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateRuleRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("EventBusName")
    public String eventBusName;

    @NameInMap("EventTargets")
    public java.util.List<CreateRuleRequestEventTargets> eventTargets;

    @NameInMap("FilterPattern")
    public String filterPattern;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("Status")
    public String status;

    public static CreateRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRuleRequest self = new CreateRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateRuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateRuleRequest setEventBusName(String eventBusName) {
        this.eventBusName = eventBusName;
        return this;
    }
    public String getEventBusName() {
        return this.eventBusName;
    }

    public CreateRuleRequest setEventTargets(java.util.List<CreateRuleRequestEventTargets> eventTargets) {
        this.eventTargets = eventTargets;
        return this;
    }
    public java.util.List<CreateRuleRequestEventTargets> getEventTargets() {
        return this.eventTargets;
    }

    public CreateRuleRequest setFilterPattern(String filterPattern) {
        this.filterPattern = filterPattern;
        return this;
    }
    public String getFilterPattern() {
        return this.filterPattern;
    }

    public CreateRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public CreateRuleRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class CreateRuleRequestEventTargetsDeadLetterQueue extends TeaModel {
        @NameInMap("Arn")
        public String arn;

        public static CreateRuleRequestEventTargetsDeadLetterQueue build(java.util.Map<String, ?> map) throws Exception {
            CreateRuleRequestEventTargetsDeadLetterQueue self = new CreateRuleRequestEventTargetsDeadLetterQueue();
            return TeaModel.build(map, self);
        }

        public CreateRuleRequestEventTargetsDeadLetterQueue setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

    }

    public static class CreateRuleRequestEventTargetsParamList extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("ResourceKey")
        public String resourceKey;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static CreateRuleRequestEventTargetsParamList build(java.util.Map<String, ?> map) throws Exception {
            CreateRuleRequestEventTargetsParamList self = new CreateRuleRequestEventTargetsParamList();
            return TeaModel.build(map, self);
        }

        public CreateRuleRequestEventTargetsParamList setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateRuleRequestEventTargetsParamList setResourceKey(String resourceKey) {
            this.resourceKey = resourceKey;
            return this;
        }
        public String getResourceKey() {
            return this.resourceKey;
        }

        public CreateRuleRequestEventTargetsParamList setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateRuleRequestEventTargetsParamList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateRuleRequestEventTargets extends TeaModel {
        @NameInMap("DeadLetterQueue")
        public CreateRuleRequestEventTargetsDeadLetterQueue deadLetterQueue;

        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("ErrorsTolerance")
        public String errorsTolerance;

        @NameInMap("Id")
        public String id;

        @NameInMap("ParamList")
        public java.util.List<CreateRuleRequestEventTargetsParamList> paramList;

        @NameInMap("PushRetryStrategy")
        public String pushRetryStrategy;

        @NameInMap("Type")
        public String type;

        public static CreateRuleRequestEventTargets build(java.util.Map<String, ?> map) throws Exception {
            CreateRuleRequestEventTargets self = new CreateRuleRequestEventTargets();
            return TeaModel.build(map, self);
        }

        public CreateRuleRequestEventTargets setDeadLetterQueue(CreateRuleRequestEventTargetsDeadLetterQueue deadLetterQueue) {
            this.deadLetterQueue = deadLetterQueue;
            return this;
        }
        public CreateRuleRequestEventTargetsDeadLetterQueue getDeadLetterQueue() {
            return this.deadLetterQueue;
        }

        public CreateRuleRequestEventTargets setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public CreateRuleRequestEventTargets setErrorsTolerance(String errorsTolerance) {
            this.errorsTolerance = errorsTolerance;
            return this;
        }
        public String getErrorsTolerance() {
            return this.errorsTolerance;
        }

        public CreateRuleRequestEventTargets setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateRuleRequestEventTargets setParamList(java.util.List<CreateRuleRequestEventTargetsParamList> paramList) {
            this.paramList = paramList;
            return this;
        }
        public java.util.List<CreateRuleRequestEventTargetsParamList> getParamList() {
            return this.paramList;
        }

        public CreateRuleRequestEventTargets setPushRetryStrategy(String pushRetryStrategy) {
            this.pushRetryStrategy = pushRetryStrategy;
            return this;
        }
        public String getPushRetryStrategy() {
            return this.pushRetryStrategy;
        }

        public CreateRuleRequestEventTargets setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
