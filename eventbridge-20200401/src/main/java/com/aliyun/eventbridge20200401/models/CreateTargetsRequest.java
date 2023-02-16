// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateTargetsRequest extends TeaModel {
    @NameInMap("EventBusName")
    public String eventBusName;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("Targets")
    public java.util.List<CreateTargetsRequestTargets> targets;

    public static CreateTargetsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTargetsRequest self = new CreateTargetsRequest();
        return TeaModel.build(map, self);
    }

    public CreateTargetsRequest setEventBusName(String eventBusName) {
        this.eventBusName = eventBusName;
        return this;
    }
    public String getEventBusName() {
        return this.eventBusName;
    }

    public CreateTargetsRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public CreateTargetsRequest setTargets(java.util.List<CreateTargetsRequestTargets> targets) {
        this.targets = targets;
        return this;
    }
    public java.util.List<CreateTargetsRequestTargets> getTargets() {
        return this.targets;
    }

    public static class CreateTargetsRequestTargetsParamList extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("ResourceKey")
        public String resourceKey;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static CreateTargetsRequestTargetsParamList build(java.util.Map<String, ?> map) throws Exception {
            CreateTargetsRequestTargetsParamList self = new CreateTargetsRequestTargetsParamList();
            return TeaModel.build(map, self);
        }

        public CreateTargetsRequestTargetsParamList setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateTargetsRequestTargetsParamList setResourceKey(String resourceKey) {
            this.resourceKey = resourceKey;
            return this;
        }
        public String getResourceKey() {
            return this.resourceKey;
        }

        public CreateTargetsRequestTargetsParamList setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateTargetsRequestTargetsParamList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateTargetsRequestTargets extends TeaModel {
        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("Id")
        public String id;

        @NameInMap("ParamList")
        public java.util.List<CreateTargetsRequestTargetsParamList> paramList;

        @NameInMap("PushRetryStrategy")
        public String pushRetryStrategy;

        @NameInMap("Type")
        public String type;

        public static CreateTargetsRequestTargets build(java.util.Map<String, ?> map) throws Exception {
            CreateTargetsRequestTargets self = new CreateTargetsRequestTargets();
            return TeaModel.build(map, self);
        }

        public CreateTargetsRequestTargets setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public CreateTargetsRequestTargets setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateTargetsRequestTargets setParamList(java.util.List<CreateTargetsRequestTargetsParamList> paramList) {
            this.paramList = paramList;
            return this;
        }
        public java.util.List<CreateTargetsRequestTargetsParamList> getParamList() {
            return this.paramList;
        }

        public CreateTargetsRequestTargets setPushRetryStrategy(String pushRetryStrategy) {
            this.pushRetryStrategy = pushRetryStrategy;
            return this;
        }
        public String getPushRetryStrategy() {
            return this.pushRetryStrategy;
        }

        public CreateTargetsRequestTargets setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
