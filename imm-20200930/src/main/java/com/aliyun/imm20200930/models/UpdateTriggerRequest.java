// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class UpdateTriggerRequest extends TeaModel {
    @NameInMap("Actions")
    public java.util.List<UpdateTriggerRequestActions> actions;

    @NameInMap("Id")
    public String id;

    @NameInMap("Input")
    public Input input;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    public static UpdateTriggerRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTriggerRequest self = new UpdateTriggerRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTriggerRequest setActions(java.util.List<UpdateTriggerRequestActions> actions) {
        this.actions = actions;
        return this;
    }
    public java.util.List<UpdateTriggerRequestActions> getActions() {
        return this.actions;
    }

    public UpdateTriggerRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateTriggerRequest setInput(Input input) {
        this.input = input;
        return this;
    }
    public Input getInput() {
        return this.input;
    }

    public UpdateTriggerRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public UpdateTriggerRequest setTags(java.util.Map<String, ?> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    public static class UpdateTriggerRequestActions extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Parameters")
        public java.util.List<String> parameters;

        public static UpdateTriggerRequestActions build(java.util.Map<String, ?> map) throws Exception {
            UpdateTriggerRequestActions self = new UpdateTriggerRequestActions();
            return TeaModel.build(map, self);
        }

        public UpdateTriggerRequestActions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateTriggerRequestActions setParameters(java.util.List<String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.List<String> getParameters() {
            return this.parameters;
        }

    }

}
