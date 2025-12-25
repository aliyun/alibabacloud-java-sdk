// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateThreadRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("title")
    public String title;

    @NameInMap("variables")
    public CreateThreadRequestVariables variables;

    public static CreateThreadRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateThreadRequest self = new CreateThreadRequest();
        return TeaModel.build(map, self);
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
         * <strong>example:</strong>
         * <p>az_alipay</p>
         */
        @NameInMap("project")
        public String project;

        /**
         * <strong>example:</strong>
         * <p>rum-monitor-test-aysls-pub-cn-heyuan-monitor</p>
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
