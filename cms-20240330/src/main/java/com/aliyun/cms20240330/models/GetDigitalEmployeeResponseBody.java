// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetDigitalEmployeeResponseBody extends TeaModel {
    /**
     * <p>The time when the digital employee was created.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
     * 
     * <strong>example:</strong>
     * <p>2025-03-11T08:21:58Z</p>
     */
    @NameInMap("createTime")
    public String createTime;

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
     * <p>test</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The display name of the digital employee.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>The type of the digital employee.</p>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("employeeType")
    public String employeeType;

    /**
     * <p>A list of knowledge bases.</p>
     */
    @NameInMap("knowledges")
    public GetDigitalEmployeeResponseBodyKnowledges knowledges;

    /**
     * <p>The name of the digital employee.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0B9377D9-C56B-5C2E-A8A4-************</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-ae******ey</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the role.</p>
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

    /**
     * <p>The time when the digital employee was last updated.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
     * 
     * <strong>example:</strong>
     * <p>2025-02-18T02:25:06Z</p>
     */
    @NameInMap("updateTime")
    public String updateTime;

    public static GetDigitalEmployeeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDigitalEmployeeResponseBody self = new GetDigitalEmployeeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDigitalEmployeeResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetDigitalEmployeeResponseBody setDefaultRule(String defaultRule) {
        this.defaultRule = defaultRule;
        return this;
    }
    public String getDefaultRule() {
        return this.defaultRule;
    }

    public GetDigitalEmployeeResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetDigitalEmployeeResponseBody setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public GetDigitalEmployeeResponseBody setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
        return this;
    }
    public String getEmployeeType() {
        return this.employeeType;
    }

    public GetDigitalEmployeeResponseBody setKnowledges(GetDigitalEmployeeResponseBodyKnowledges knowledges) {
        this.knowledges = knowledges;
        return this;
    }
    public GetDigitalEmployeeResponseBodyKnowledges getKnowledges() {
        return this.knowledges;
    }

    public GetDigitalEmployeeResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetDigitalEmployeeResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetDigitalEmployeeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDigitalEmployeeResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public GetDigitalEmployeeResponseBody setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public GetDigitalEmployeeResponseBody setTags(java.util.List<Tag> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<Tag> getTags() {
        return this.tags;
    }

    public GetDigitalEmployeeResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static class GetDigitalEmployeeResponseBodyKnowledgesBailian extends TeaModel {
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

        public static GetDigitalEmployeeResponseBodyKnowledgesBailian build(java.util.Map<String, ?> map) throws Exception {
            GetDigitalEmployeeResponseBodyKnowledgesBailian self = new GetDigitalEmployeeResponseBodyKnowledgesBailian();
            return TeaModel.build(map, self);
        }

        public GetDigitalEmployeeResponseBodyKnowledgesBailian setAttributes(String attributes) {
            this.attributes = attributes;
            return this;
        }
        public String getAttributes() {
            return this.attributes;
        }

        public GetDigitalEmployeeResponseBodyKnowledgesBailian setIndexId(String indexId) {
            this.indexId = indexId;
            return this;
        }
        public String getIndexId() {
            return this.indexId;
        }

        public GetDigitalEmployeeResponseBodyKnowledgesBailian setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetDigitalEmployeeResponseBodyKnowledgesBailian setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class GetDigitalEmployeeResponseBodyKnowledges extends TeaModel {
        /**
         * <p>A list of Bailian knowledge bases.</p>
         */
        @NameInMap("bailian")
        public java.util.List<GetDigitalEmployeeResponseBodyKnowledgesBailian> bailian;

        /**
         * <p>A list of Standard Operating Procedure (SOP) knowledge bases.</p>
         */
        @NameInMap("sop")
        public java.util.List<java.util.Map<String, ?>> sop;

        public static GetDigitalEmployeeResponseBodyKnowledges build(java.util.Map<String, ?> map) throws Exception {
            GetDigitalEmployeeResponseBodyKnowledges self = new GetDigitalEmployeeResponseBodyKnowledges();
            return TeaModel.build(map, self);
        }

        public GetDigitalEmployeeResponseBodyKnowledges setBailian(java.util.List<GetDigitalEmployeeResponseBodyKnowledgesBailian> bailian) {
            this.bailian = bailian;
            return this;
        }
        public java.util.List<GetDigitalEmployeeResponseBodyKnowledgesBailian> getBailian() {
            return this.bailian;
        }

        public GetDigitalEmployeeResponseBodyKnowledges setSop(java.util.List<java.util.Map<String, ?>> sop) {
            this.sop = sop;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getSop() {
            return this.sop;
        }

    }

}
