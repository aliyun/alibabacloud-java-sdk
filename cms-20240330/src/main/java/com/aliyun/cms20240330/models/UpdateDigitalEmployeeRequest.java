// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateDigitalEmployeeRequest extends TeaModel {
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

    @NameInMap("knowledges")
    public UpdateDigitalEmployeeRequestKnowledges knowledges;

    /**
     * <strong>example:</strong>
     * <p>acs:ram::12345678912:role/testrole</p>
     */
    @NameInMap("roleArn")
    public String roleArn;

    public static UpdateDigitalEmployeeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDigitalEmployeeRequest self = new UpdateDigitalEmployeeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDigitalEmployeeRequest setDefaultRule(String defaultRule) {
        this.defaultRule = defaultRule;
        return this;
    }
    public String getDefaultRule() {
        return this.defaultRule;
    }

    public UpdateDigitalEmployeeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateDigitalEmployeeRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public UpdateDigitalEmployeeRequest setKnowledges(UpdateDigitalEmployeeRequestKnowledges knowledges) {
        this.knowledges = knowledges;
        return this;
    }
    public UpdateDigitalEmployeeRequestKnowledges getKnowledges() {
        return this.knowledges;
    }

    public UpdateDigitalEmployeeRequest setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public static class UpdateDigitalEmployeeRequestKnowledgesBailian extends TeaModel {
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

        public static UpdateDigitalEmployeeRequestKnowledgesBailian build(java.util.Map<String, ?> map) throws Exception {
            UpdateDigitalEmployeeRequestKnowledgesBailian self = new UpdateDigitalEmployeeRequestKnowledgesBailian();
            return TeaModel.build(map, self);
        }

        public UpdateDigitalEmployeeRequestKnowledgesBailian setAttributes(String attributes) {
            this.attributes = attributes;
            return this;
        }
        public String getAttributes() {
            return this.attributes;
        }

        public UpdateDigitalEmployeeRequestKnowledgesBailian setIndexId(String indexId) {
            this.indexId = indexId;
            return this;
        }
        public String getIndexId() {
            return this.indexId;
        }

        public UpdateDigitalEmployeeRequestKnowledgesBailian setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public UpdateDigitalEmployeeRequestKnowledgesBailian setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class UpdateDigitalEmployeeRequestKnowledges extends TeaModel {
        @NameInMap("bailian")
        public java.util.List<UpdateDigitalEmployeeRequestKnowledgesBailian> bailian;

        public static UpdateDigitalEmployeeRequestKnowledges build(java.util.Map<String, ?> map) throws Exception {
            UpdateDigitalEmployeeRequestKnowledges self = new UpdateDigitalEmployeeRequestKnowledges();
            return TeaModel.build(map, self);
        }

        public UpdateDigitalEmployeeRequestKnowledges setBailian(java.util.List<UpdateDigitalEmployeeRequestKnowledgesBailian> bailian) {
            this.bailian = bailian;
            return this;
        }
        public java.util.List<UpdateDigitalEmployeeRequestKnowledgesBailian> getBailian() {
            return this.bailian;
        }

    }

}
