// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateThreadRequest extends TeaModel {
    @NameInMap("attributes")
    public java.util.Map<String, String> attributes;

    /**
     * <p>The title of the session.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("title")
    public String title;

    /**
     * <p>The properties of the session.</p>
     */
    @NameInMap("variables")
    public CreateThreadRequestVariables variables;

    public static CreateThreadRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateThreadRequest self = new CreateThreadRequest();
        return TeaModel.build(map, self);
    }

    public CreateThreadRequest setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }
    public java.util.Map<String, String> getAttributes() {
        return this.attributes;
    }

    public CreateThreadRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateThreadRequest setVariables(CreateThreadRequestVariables variables) {
        this.variables = variables;
        return this;
    }
    public CreateThreadRequestVariables getVariables() {
        return this.variables;
    }

    public static class CreateThreadRequestVariables extends TeaModel {
        /**
         * <p>The name of the Simple Log Service project.</p>
         * 
         * <strong>example:</strong>
         * <p>project</p>
         */
        @NameInMap("project")
        public String project;

        /**
         * <p>The name of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace</p>
         */
        @NameInMap("workspace")
        public String workspace;

        public static CreateThreadRequestVariables build(java.util.Map<String, ?> map) throws Exception {
            CreateThreadRequestVariables self = new CreateThreadRequestVariables();
            return TeaModel.build(map, self);
        }

        public CreateThreadRequestVariables setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public CreateThreadRequestVariables setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

}
