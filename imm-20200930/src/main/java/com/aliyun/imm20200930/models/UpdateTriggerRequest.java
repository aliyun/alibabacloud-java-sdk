// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class UpdateTriggerRequest extends TeaModel {
    /**
     * <p>The processing templates.</p>
     */
    @NameInMap("Actions")
    public java.util.List<UpdateTriggerRequestActions> actions;

    /**
     * <p>The ID of the trigger. You can obtain the ID of the trigger from the response of the <a href="https://help.aliyun.com/document_detail/479912.html">CreateTrigger</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>trigger-9f72636a-0f0c-4baf-ae78-38b27b******</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The data source configurations.</p>
     */
    @NameInMap("Input")
    public Input input;

    /**
     * <p>The name of the project. You can obtain the name of the project from the response of the <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The custom tags. You can search for or filter asynchronous tasks by custom tag.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;test&quot;: &quot;val1&quot;}</p>
     */
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
        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>doc/convert</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The template parameters.</p>
         */
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
