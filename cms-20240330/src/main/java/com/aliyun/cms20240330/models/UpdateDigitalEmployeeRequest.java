// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateDigitalEmployeeRequest extends TeaModel {
    /**
     * <p>Default rule</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("defaultRule")
    public String defaultRule;

    /**
     * <p>Description</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Digital employee display name</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>List of knowledge bases</p>
     */
    @NameInMap("knowledges")
    public UpdateDigitalEmployeeRequestKnowledges knowledges;

    /**
     * <p>Role ARN</p>
     * 
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
         * <p>Knowledge base attributes</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("attributes")
        public String attributes;

        /**
         * <p>Bailian index ID</p>
         * 
         * <strong>example:</strong>
         * <p>index-xxxx</p>
         */
        @NameInMap("indexId")
        public String indexId;

        /**
         * <p>Region of the Bailian knowledge base</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("region")
        public String region;

        /**
         * <p>Bailian workspace ID</p>
         * 
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
        /**
         * <p>Bailian knowledge base list</p>
         */
        @NameInMap("bailian")
        public java.util.List<UpdateDigitalEmployeeRequestKnowledgesBailian> bailian;

        /**
         * <p>SOP knowledge base list</p>
         */
        @NameInMap("sop")
        public java.util.List<java.util.Map<String, ?>> sop;

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

        public UpdateDigitalEmployeeRequestKnowledges setSop(java.util.List<java.util.Map<String, ?>> sop) {
            this.sop = sop;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getSop() {
            return this.sop;
        }

    }

}
