// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetWorkflowDefinitionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F2BDD628-8A21-5BD1-B930-1A2D5989XXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the workflow.</p>
     */
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
         * <p>The time when the workflow was created. This value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1708481905000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The ID of the workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>463497880880954XXXX</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The time when the workflow was last modified. This value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1708481905000</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The name of the workflow.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The owner of the workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>110755000425XXXX</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The ID of the workspace to which the workflow belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>307XXX</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The FlowSpec field information about the workflow. For more information, see <a href="https://github.com/aliyun/alibabacloud-dataworks-tool-dflow/">FlowSpec</a>.</p>
         */
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

        public GetWorkflowDefinitionResponseBodyWorkflowDefinition setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
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

        public GetWorkflowDefinitionResponseBodyWorkflowDefinition setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
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
