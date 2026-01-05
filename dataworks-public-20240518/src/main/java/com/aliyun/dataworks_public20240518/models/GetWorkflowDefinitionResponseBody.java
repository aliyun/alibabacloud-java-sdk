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
        public String id;

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
         * 
         * <strong>example:</strong>
         * <p>OpenAPI test workflow Demo</p>
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
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;metadata&quot;: {
         *         &quot;tenantId&quot;: &quot;52425742456XXXX&quot;,
         *         &quot;projectId&quot;: &quot;307XXXX&quot;,
         *         &quot;uuid&quot;: &quot;463497880880954XXXX&quot;
         *     },
         *     &quot;kind&quot;: &quot;CycleWorkflow&quot;,
         *     &quot;version&quot;: &quot;1.1.0&quot;,
         *     &quot;spec&quot;: {
         *         &quot;name&quot;: &quot;OpenAPI_Test_Workflow_Demo&quot;,
         *         &quot;id&quot;: &quot;463497880880954XXXX&quot;,
         *         &quot;type&quot;: &quot;CycleWorkflow&quot;,
         *         &quot;owner&quot;: &quot;110755000425XXXX&quot;,
         *         &quot;workflows&quot;: [
         *             {
         *                 &quot;script&quot;: {
         *                     &quot;path&quot;: &quot;XX/OpenAPI_Test/Workflow_Test/OpenAPI_Test_Workflow_Demo&quot;,
         *                     &quot;runtime&quot;: {
         *                         &quot;command&quot;: &quot;WORKFLOW&quot;
         *                     },
         *                     &quot;id&quot;: &quot;698002781368644XXXX&quot;
         *                 },
         *                 &quot;id&quot;: &quot;463497880880954XXXX&quot;,
         *                 &quot;trigger&quot;: {
         *                     &quot;type&quot;: &quot;Scheduler&quot;,
         *                     &quot;id&quot;: &quot;652567824470354XXXX&quot;,
         *                     &quot;cron&quot;: &quot;00 02 00 * * ?&quot;,
         *                     &quot;startTime&quot;: &quot;1970-01-01 00:00:00&quot;,
         *                     &quot;endTime&quot;: &quot;9999-01-01 00:00:00&quot;,
         *                     &quot;timezone&quot;: &quot;Asia/Shanghai&quot;,
         *                     &quot;delaySeconds&quot;: 0
         *                 },
         *                 &quot;strategy&quot;: {
         *                     &quot;timeout&quot;: 0,
         *                     &quot;instanceMode&quot;: &quot;T+1&quot;,
         *                     &quot;rerunMode&quot;: &quot;Allowed&quot;,
         *                     &quot;rerunTimes&quot;: 3,
         *                     &quot;rerunInterval&quot;: 180000,
         *                     &quot;failureStrategy&quot;: &quot;Break&quot;
         *                 },
         *                 &quot;name&quot;: &quot;OpenAPI_Test_Workflow_Demo&quot;,
         *                 &quot;owner&quot;: &quot;110755000425XXXX&quot;,
         *                 &quot;metadata&quot;: {
         *                     &quot;owner&quot;: &quot;110755000425XXXX&quot;,
         *                     &quot;ownerName&quot;: &quot;<a href="mailto:XXXX@test.XXXX.com">XXXX@test.XXXX.com</a>&quot;,
         *                     &quot;tenantId&quot;: &quot;52425742456XXXX&quot;,
         *                     &quot;project&quot;: {
         *                         &quot;mode&quot;: &quot;STANDARD&quot;,
         *                         &quot;projectId&quot;: &quot;307303&quot;,
         *                         &quot;projectIdentifier&quot;: &quot;lwttest_standard&quot;,
         *                         &quot;projectName&quot;: &quot;XXXX&quot;,
         *                         &quot;projectOwnerId&quot;: &quot;110755000425XXXX&quot;,
         *                         &quot;simple&quot;: false,
         *                         &quot;tenantId&quot;: &quot;52425742456XXXX&quot;
         *                     },
         *                     &quot;projectId&quot;: &quot;307XXXX&quot;
         *                 },
         *                 &quot;inputs&quot;: {},
         *                 &quot;outputs&quot;: {
         *                     &quot;nodeOutputs&quot;: [
         *                         {
         *                             &quot;data&quot;: &quot;463497880880954XXXX&quot;,
         *                             &quot;artifactType&quot;: &quot;NodeOutput&quot;,
         *                             &quot;refTableName&quot;: &quot;OpenAPI_Test_Workflow_Demo&quot;,
         *                             &quot;isDefault&quot;: true
         *                         }
         *                     ]
         *                 },
         *                 &quot;nodes&quot;: [],
         *                 &quot;dependencies&quot;: []
         *             }
         *         ]
         *     }
         * }</p>
         */
        @NameInMap("Spec")
        public String spec;

        /**
         * <p>The ID of the workflow on the scheduling side after publishing.</p>
         * 
         * <strong>example:</strong>
         * <p>700006657495</p>
         */
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
