// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class UpdateBatchRequest extends TeaModel {
    @NameInMap("Actions")
    public java.util.List<UpdateBatchRequestActions> actions;

    @NameInMap("Id")
    public String id;

    @NameInMap("Input")
    public Input input;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    public static UpdateBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBatchRequest self = new UpdateBatchRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBatchRequest setActions(java.util.List<UpdateBatchRequestActions> actions) {
        this.actions = actions;
        return this;
    }
    public java.util.List<UpdateBatchRequestActions> getActions() {
        return this.actions;
    }

    public UpdateBatchRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateBatchRequest setInput(Input input) {
        this.input = input;
        return this;
    }
    public Input getInput() {
        return this.input;
    }

    public UpdateBatchRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public UpdateBatchRequest setTags(java.util.Map<String, ?> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    public static class UpdateBatchRequestActions extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Parameters")
        public java.util.List<String> parameters;

        public static UpdateBatchRequestActions build(java.util.Map<String, ?> map) throws Exception {
            UpdateBatchRequestActions self = new UpdateBatchRequestActions();
            return TeaModel.build(map, self);
        }

        public UpdateBatchRequestActions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateBatchRequestActions setParameters(java.util.List<String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.List<String> getParameters() {
            return this.parameters;
        }

    }

}
