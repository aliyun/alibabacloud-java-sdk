// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class UpdateBatchRequest extends TeaModel {
    /**
     * <p>The processing templates.</p>
     */
    @NameInMap("Actions")
    public java.util.List<UpdateBatchRequestActions> actions;

    /**
     * <p>The ID of the batch processing task. You can obtain the ID of the batch processing task from the response of the <a href="https://help.aliyun.com/document_detail/606694.html">CreateBatch</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>batch-4eb9223f-3e88-42d3-a578-3f2852******</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The input data source.</p>
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
     * <p>{&quot;key&quot;:&quot;val&quot;}</p>
     */
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
        /**
         * <p>The name of the template.</p>
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
