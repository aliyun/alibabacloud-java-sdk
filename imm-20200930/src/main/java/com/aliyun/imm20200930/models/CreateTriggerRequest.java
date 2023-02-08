// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateTriggerRequest extends TeaModel {
    @NameInMap("Actions")
    public java.util.List<CreateTriggerRequestActions> actions;

    @NameInMap("Input")
    public Input input;

    @NameInMap("Notification")
    public CreateTriggerRequestNotification notification;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("ServiceRole")
    public String serviceRole;

    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    public static CreateTriggerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTriggerRequest self = new CreateTriggerRequest();
        return TeaModel.build(map, self);
    }

    public CreateTriggerRequest setActions(java.util.List<CreateTriggerRequestActions> actions) {
        this.actions = actions;
        return this;
    }
    public java.util.List<CreateTriggerRequestActions> getActions() {
        return this.actions;
    }

    public CreateTriggerRequest setInput(Input input) {
        this.input = input;
        return this;
    }
    public Input getInput() {
        return this.input;
    }

    public CreateTriggerRequest setNotification(CreateTriggerRequestNotification notification) {
        this.notification = notification;
        return this;
    }
    public CreateTriggerRequestNotification getNotification() {
        return this.notification;
    }

    public CreateTriggerRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateTriggerRequest setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
        return this;
    }
    public String getServiceRole() {
        return this.serviceRole;
    }

    public CreateTriggerRequest setTags(java.util.Map<String, ?> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    public static class CreateTriggerRequestActions extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Parameters")
        public java.util.List<String> parameters;

        public static CreateTriggerRequestActions build(java.util.Map<String, ?> map) throws Exception {
            CreateTriggerRequestActions self = new CreateTriggerRequestActions();
            return TeaModel.build(map, self);
        }

        public CreateTriggerRequestActions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateTriggerRequestActions setParameters(java.util.List<String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.List<String> getParameters() {
            return this.parameters;
        }

    }

    public static class CreateTriggerRequestNotification extends TeaModel {
        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("Topic")
        public String topic;

        public static CreateTriggerRequestNotification build(java.util.Map<String, ?> map) throws Exception {
            CreateTriggerRequestNotification self = new CreateTriggerRequestNotification();
            return TeaModel.build(map, self);
        }

        public CreateTriggerRequestNotification setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public CreateTriggerRequestNotification setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

}
