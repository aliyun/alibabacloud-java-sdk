// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListDigitalEmployeesResponseBody extends TeaModel {
    @NameInMap("digitalEmployees")
    public java.util.List<ListDigitalEmployeesResponseBodyDigitalEmployees> digitalEmployees;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>8FDE2569-626B-5176-9844-28877A*****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>56</p>
     */
    @NameInMap("total")
    public Integer total;

    public static ListDigitalEmployeesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDigitalEmployeesResponseBody self = new ListDigitalEmployeesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDigitalEmployeesResponseBody setDigitalEmployees(java.util.List<ListDigitalEmployeesResponseBodyDigitalEmployees> digitalEmployees) {
        this.digitalEmployees = digitalEmployees;
        return this;
    }
    public java.util.List<ListDigitalEmployeesResponseBodyDigitalEmployees> getDigitalEmployees() {
        return this.digitalEmployees;
    }

    public ListDigitalEmployeesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDigitalEmployeesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDigitalEmployeesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDigitalEmployeesResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListDigitalEmployeesResponseBodyDigitalEmployeesKnowledgesBailian extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("attributes")
        public String attributes;

        /**
         * <strong>example:</strong>
         * <p>index-xxxx</p>
         */
        @NameInMap("indexId")
        public String indexId;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("region")
        public String region;

        /**
         * <strong>example:</strong>
         * <p>llm-xxxx</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static ListDigitalEmployeesResponseBodyDigitalEmployeesKnowledgesBailian build(java.util.Map<String, ?> map) throws Exception {
            ListDigitalEmployeesResponseBodyDigitalEmployeesKnowledgesBailian self = new ListDigitalEmployeesResponseBodyDigitalEmployeesKnowledgesBailian();
            return TeaModel.build(map, self);
        }

        public ListDigitalEmployeesResponseBodyDigitalEmployeesKnowledgesBailian setAttributes(String attributes) {
            this.attributes = attributes;
            return this;
        }
        public String getAttributes() {
            return this.attributes;
        }

        public ListDigitalEmployeesResponseBodyDigitalEmployeesKnowledgesBailian setIndexId(String indexId) {
            this.indexId = indexId;
            return this;
        }
        public String getIndexId() {
            return this.indexId;
        }

        public ListDigitalEmployeesResponseBodyDigitalEmployeesKnowledgesBailian setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListDigitalEmployeesResponseBodyDigitalEmployeesKnowledgesBailian setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class ListDigitalEmployeesResponseBodyDigitalEmployeesKnowledges extends TeaModel {
        @NameInMap("bailian")
        public java.util.List<ListDigitalEmployeesResponseBodyDigitalEmployeesKnowledgesBailian> bailian;

        @NameInMap("sop")
        public java.util.List<java.util.Map<String, ?>> sop;

        public static ListDigitalEmployeesResponseBodyDigitalEmployeesKnowledges build(java.util.Map<String, ?> map) throws Exception {
            ListDigitalEmployeesResponseBodyDigitalEmployeesKnowledges self = new ListDigitalEmployeesResponseBodyDigitalEmployeesKnowledges();
            return TeaModel.build(map, self);
        }

        public ListDigitalEmployeesResponseBodyDigitalEmployeesKnowledges setBailian(java.util.List<ListDigitalEmployeesResponseBodyDigitalEmployeesKnowledgesBailian> bailian) {
            this.bailian = bailian;
            return this;
        }
        public java.util.List<ListDigitalEmployeesResponseBodyDigitalEmployeesKnowledgesBailian> getBailian() {
            return this.bailian;
        }

        public ListDigitalEmployeesResponseBodyDigitalEmployeesKnowledges setSop(java.util.List<java.util.Map<String, ?>> sop) {
            this.sop = sop;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getSop() {
            return this.sop;
        }

    }

    public static class ListDigitalEmployeesResponseBodyDigitalEmployees extends TeaModel {
        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2025-11-04T08:08:57Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("defaultRule")
        public String defaultRule;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("displayName")
        public String displayName;

        @NameInMap("employeeType")
        public String employeeType;

        @NameInMap("knowledges")
        public ListDigitalEmployeesResponseBodyDigitalEmployeesKnowledges knowledges;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>rg-ae******ey</p>
         */
        @NameInMap("resourceGroupId")
        public String resourceGroupId;

        /**
         * <strong>example:</strong>
         * <p>acs:ram::12345678912:role/testrole</p>
         */
        @NameInMap("roleArn")
        public String roleArn;

        @NameInMap("tags")
        public java.util.List<Tag> tags;

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2025-05-07T02:26:01Z</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        public static ListDigitalEmployeesResponseBodyDigitalEmployees build(java.util.Map<String, ?> map) throws Exception {
            ListDigitalEmployeesResponseBodyDigitalEmployees self = new ListDigitalEmployeesResponseBodyDigitalEmployees();
            return TeaModel.build(map, self);
        }

        public ListDigitalEmployeesResponseBodyDigitalEmployees setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListDigitalEmployeesResponseBodyDigitalEmployees setDefaultRule(String defaultRule) {
            this.defaultRule = defaultRule;
            return this;
        }
        public String getDefaultRule() {
            return this.defaultRule;
        }

        public ListDigitalEmployeesResponseBodyDigitalEmployees setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDigitalEmployeesResponseBodyDigitalEmployees setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListDigitalEmployeesResponseBodyDigitalEmployees setEmployeeType(String employeeType) {
            this.employeeType = employeeType;
            return this;
        }
        public String getEmployeeType() {
            return this.employeeType;
        }

        public ListDigitalEmployeesResponseBodyDigitalEmployees setKnowledges(ListDigitalEmployeesResponseBodyDigitalEmployeesKnowledges knowledges) {
            this.knowledges = knowledges;
            return this;
        }
        public ListDigitalEmployeesResponseBodyDigitalEmployeesKnowledges getKnowledges() {
            return this.knowledges;
        }

        public ListDigitalEmployeesResponseBodyDigitalEmployees setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDigitalEmployeesResponseBodyDigitalEmployees setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListDigitalEmployeesResponseBodyDigitalEmployees setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public ListDigitalEmployeesResponseBodyDigitalEmployees setTags(java.util.List<Tag> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<Tag> getTags() {
            return this.tags;
        }

        public ListDigitalEmployeesResponseBodyDigitalEmployees setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
