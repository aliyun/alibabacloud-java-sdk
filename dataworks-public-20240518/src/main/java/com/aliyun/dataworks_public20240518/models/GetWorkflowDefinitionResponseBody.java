// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetWorkflowDefinitionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>F2BDD628-8A21-5BD1-B930-1A2D5989XXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("WorkflowDefinition")
    public GetWorkflowDefinitionResponseBodyWorkflowDefinition workflowDefinition;

    public static GetWorkflowDefinitionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkflowDefinitionResponseBody self = new GetWorkflowDefinitionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkflowDefinitionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorkflowDefinitionResponseBody setWorkflowDefinition(GetWorkflowDefinitionResponseBodyWorkflowDefinition workflowDefinition) {
        this.workflowDefinition = workflowDefinition;
        return this;
    }
    public GetWorkflowDefinitionResponseBodyWorkflowDefinition getWorkflowDefinition() {
        return this.workflowDefinition;
    }

    public static class GetWorkflowDefinitionResponseBodyWorkflowDefinition extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1708481905000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>463497880880954XXXX</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>1708481905000</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>110755000425XXXX</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <strong>example:</strong>
         * <p>307XXX</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("Spec")
        public String spec;

        public static GetWorkflowDefinitionResponseBodyWorkflowDefinition build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowDefinitionResponseBodyWorkflowDefinition self = new GetWorkflowDefinitionResponseBodyWorkflowDefinition();
            return TeaModel.build(map, self);
        }

        public GetWorkflowDefinitionResponseBodyWorkflowDefinition setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetWorkflowDefinitionResponseBodyWorkflowDefinition setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetWorkflowDefinitionResponseBodyWorkflowDefinition setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public GetWorkflowDefinitionResponseBodyWorkflowDefinition setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetWorkflowDefinitionResponseBodyWorkflowDefinition setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetWorkflowDefinitionResponseBodyWorkflowDefinition setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public GetWorkflowDefinitionResponseBodyWorkflowDefinition setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

    }

}
