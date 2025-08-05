// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class GetWorkflowDefinitionResponseBody extends TeaModel {
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
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ModifyTime")
        public Long modifyTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("Spec")
        public String spec;

        @NameInMap("WorkflowId")
        public Long workflowId;

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

        public GetWorkflowDefinitionResponseBodyWorkflowDefinition setWorkflowId(Long workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public Long getWorkflowId() {
            return this.workflowId;
        }

    }

}
