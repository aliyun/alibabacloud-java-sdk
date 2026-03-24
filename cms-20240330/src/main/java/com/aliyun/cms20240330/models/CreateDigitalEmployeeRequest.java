// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateDigitalEmployeeRequest extends TeaModel {
    /**
     * <p>The default rule.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("defaultRule")
    public String defaultRule;

    /**
     * <p>The description of the digital employee.</p>
     * 
     * <strong>example:</strong>
     * <p>aaa</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The display name of the digital employee.</p>
     * 
     * <strong>example:</strong>
     * <p>digial-employee-test</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>The list of knowledge bases.</p>
     */
    @NameInMap("knowledges")
    public CreateDigitalEmployeeRequestKnowledges knowledges;

    /**
     * <p>The name of the digital employee.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-ae******ey</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::12345678912:role/testrole</p>
     */
    @NameInMap("roleArn")
    public String roleArn;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("tags")
    public java.util.List<Tag> tags;

    public static CreateDigitalEmployeeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDigitalEmployeeRequest self = new CreateDigitalEmployeeRequest();
        return TeaModel.build(map, self);
    }

    public CreateDigitalEmployeeRequest setDefaultRule(String defaultRule) {
        this.defaultRule = defaultRule;
        return this;
    }
    public String getDefaultRule() {
        return this.defaultRule;
    }

    public CreateDigitalEmployeeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDigitalEmployeeRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateDigitalEmployeeRequest setKnowledges(CreateDigitalEmployeeRequestKnowledges knowledges) {
        this.knowledges = knowledges;
        return this;
    }
    public CreateDigitalEmployeeRequestKnowledges getKnowledges() {
        return this.knowledges;
    }

    public CreateDigitalEmployeeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDigitalEmployeeRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateDigitalEmployeeRequest setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public CreateDigitalEmployeeRequest setTags(java.util.List<Tag> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<Tag> getTags() {
        return this.tags;
    }

    public static class CreateDigitalEmployeeRequestKnowledgesBailian extends TeaModel {
        /**
         * <p>The properties of the knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("attributes")
        public String attributes;

        /**
         * <p>The ID of the Bailian index.</p>
         * 
         * <strong>example:</strong>
         * <p>index-xxxx</p>
         */
        @NameInMap("indexId")
        public String indexId;

        /**
         * <p>The region of the Bailian knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("region")
        public String region;

        /**
         * <p>The ID of the Bailian workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-xxxxx</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static CreateDigitalEmployeeRequestKnowledgesBailian build(java.util.Map<String, ?> map) throws Exception {
            CreateDigitalEmployeeRequestKnowledgesBailian self = new CreateDigitalEmployeeRequestKnowledgesBailian();
            return TeaModel.build(map, self);
        }

        public CreateDigitalEmployeeRequestKnowledgesBailian setAttributes(String attributes) {
            this.attributes = attributes;
            return this;
        }
        public String getAttributes() {
            return this.attributes;
        }

        public CreateDigitalEmployeeRequestKnowledgesBailian setIndexId(String indexId) {
            this.indexId = indexId;
            return this;
        }
        public String getIndexId() {
            return this.indexId;
        }

        public CreateDigitalEmployeeRequestKnowledgesBailian setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public CreateDigitalEmployeeRequestKnowledgesBailian setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class CreateDigitalEmployeeRequestKnowledges extends TeaModel {
        /**
         * <p>The list of Bailian knowledge bases.</p>
         */
        @NameInMap("bailian")
        public java.util.List<CreateDigitalEmployeeRequestKnowledgesBailian> bailian;

        /**
         * <p>The list of Standard Operating Procedure (SOP) knowledge bases.</p>
         */
        @NameInMap("sop")
        public java.util.List<java.util.Map<String, ?>> sop;

        public static CreateDigitalEmployeeRequestKnowledges build(java.util.Map<String, ?> map) throws Exception {
            CreateDigitalEmployeeRequestKnowledges self = new CreateDigitalEmployeeRequestKnowledges();
            return TeaModel.build(map, self);
        }

        public CreateDigitalEmployeeRequestKnowledges setBailian(java.util.List<CreateDigitalEmployeeRequestKnowledgesBailian> bailian) {
            this.bailian = bailian;
            return this;
        }
        public java.util.List<CreateDigitalEmployeeRequestKnowledgesBailian> getBailian() {
            return this.bailian;
        }

        public CreateDigitalEmployeeRequestKnowledges setSop(java.util.List<java.util.Map<String, ?>> sop) {
            this.sop = sop;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getSop() {
            return this.sop;
        }

    }

}
