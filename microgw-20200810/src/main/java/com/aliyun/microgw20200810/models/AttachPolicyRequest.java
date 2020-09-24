// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class AttachPolicyRequest extends TeaModel {
    // data
    @NameInMap("data")
    public java.util.List<AttachPolicyRequestData> data;

    public static AttachPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachPolicyRequest self = new AttachPolicyRequest();
        return TeaModel.build(map, self);
    }

    public AttachPolicyRequest setData(java.util.List<AttachPolicyRequestData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AttachPolicyRequestData> getData() {
        return this.data;
    }

    public static class AttachPolicyRequestData extends TeaModel {
        // creationDateTime
        @NameInMap("creationDateTime")
        public String creationDateTime;

        // direction
        @NameInMap("direction")
        public String direction;

        // policyAliasName
        @NameInMap("policyAliasName")
        public String policyAliasName;

        // policyContent
        @NameInMap("policyContent")
        public String policyContent;

        // policyGroup
        @NameInMap("policyGroup")
        public String policyGroup;

        // policyId
        @NameInMap("policyId")
        public Long policyId;

        // policyName
        @NameInMap("policyName")
        public String policyName;

        // priority
        @NameInMap("priority")
        public Long priority;

        // scope
        @NameInMap("scope")
        public String scope;

        // status
        @NameInMap("status")
        public Boolean status;

        // type
        @NameInMap("type")
        public Long type;

        public static AttachPolicyRequestData build(java.util.Map<String, ?> map) throws Exception {
            AttachPolicyRequestData self = new AttachPolicyRequestData();
            return TeaModel.build(map, self);
        }

        public AttachPolicyRequestData setCreationDateTime(String creationDateTime) {
            this.creationDateTime = creationDateTime;
            return this;
        }
        public String getCreationDateTime() {
            return this.creationDateTime;
        }

        public AttachPolicyRequestData setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public AttachPolicyRequestData setPolicyAliasName(String policyAliasName) {
            this.policyAliasName = policyAliasName;
            return this;
        }
        public String getPolicyAliasName() {
            return this.policyAliasName;
        }

        public AttachPolicyRequestData setPolicyContent(String policyContent) {
            this.policyContent = policyContent;
            return this;
        }
        public String getPolicyContent() {
            return this.policyContent;
        }

        public AttachPolicyRequestData setPolicyGroup(String policyGroup) {
            this.policyGroup = policyGroup;
            return this;
        }
        public String getPolicyGroup() {
            return this.policyGroup;
        }

        public AttachPolicyRequestData setPolicyId(Long policyId) {
            this.policyId = policyId;
            return this;
        }
        public Long getPolicyId() {
            return this.policyId;
        }

        public AttachPolicyRequestData setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public AttachPolicyRequestData setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public AttachPolicyRequestData setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public AttachPolicyRequestData setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public AttachPolicyRequestData setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

    }

}
