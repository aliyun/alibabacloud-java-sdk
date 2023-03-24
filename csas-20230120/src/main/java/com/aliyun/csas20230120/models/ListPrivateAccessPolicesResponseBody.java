// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListPrivateAccessPolicesResponseBody extends TeaModel {
    @NameInMap("Polices")
    public java.util.List<ListPrivateAccessPolicesResponseBodyPolices> polices;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalNum")
    public Integer totalNum;

    public static ListPrivateAccessPolicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPrivateAccessPolicesResponseBody self = new ListPrivateAccessPolicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPrivateAccessPolicesResponseBody setPolices(java.util.List<ListPrivateAccessPolicesResponseBodyPolices> polices) {
        this.polices = polices;
        return this;
    }
    public java.util.List<ListPrivateAccessPolicesResponseBodyPolices> getPolices() {
        return this.polices;
    }

    public ListPrivateAccessPolicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPrivateAccessPolicesResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class ListPrivateAccessPolicesResponseBodyPolicesCustomUserAttributes extends TeaModel {
        @NameInMap("IdpId")
        public Integer idpId;

        @NameInMap("Relation")
        public String relation;

        @NameInMap("UserGroupType")
        public String userGroupType;

        @NameInMap("Value")
        public String value;

        public static ListPrivateAccessPolicesResponseBodyPolicesCustomUserAttributes build(java.util.Map<String, ?> map) throws Exception {
            ListPrivateAccessPolicesResponseBodyPolicesCustomUserAttributes self = new ListPrivateAccessPolicesResponseBodyPolicesCustomUserAttributes();
            return TeaModel.build(map, self);
        }

        public ListPrivateAccessPolicesResponseBodyPolicesCustomUserAttributes setIdpId(Integer idpId) {
            this.idpId = idpId;
            return this;
        }
        public Integer getIdpId() {
            return this.idpId;
        }

        public ListPrivateAccessPolicesResponseBodyPolicesCustomUserAttributes setRelation(String relation) {
            this.relation = relation;
            return this;
        }
        public String getRelation() {
            return this.relation;
        }

        public ListPrivateAccessPolicesResponseBodyPolicesCustomUserAttributes setUserGroupType(String userGroupType) {
            this.userGroupType = userGroupType;
            return this;
        }
        public String getUserGroupType() {
            return this.userGroupType;
        }

        public ListPrivateAccessPolicesResponseBodyPolicesCustomUserAttributes setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListPrivateAccessPolicesResponseBodyPolices extends TeaModel {
        @NameInMap("ApplicationIds")
        public java.util.List<String> applicationIds;

        @NameInMap("ApplicationType")
        public String applicationType;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CustomUserAttributes")
        public java.util.List<ListPrivateAccessPolicesResponseBodyPolicesCustomUserAttributes> customUserAttributes;

        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("PolicyAction")
        public String policyAction;

        @NameInMap("PolicyId")
        public String policyId;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("Status")
        public String status;

        @NameInMap("TagIds")
        public java.util.List<String> tagIds;

        @NameInMap("UserGroupIds")
        public java.util.List<String> userGroupIds;

        @NameInMap("UserGroupMode")
        public String userGroupMode;

        public static ListPrivateAccessPolicesResponseBodyPolices build(java.util.Map<String, ?> map) throws Exception {
            ListPrivateAccessPolicesResponseBodyPolices self = new ListPrivateAccessPolicesResponseBodyPolices();
            return TeaModel.build(map, self);
        }

        public ListPrivateAccessPolicesResponseBodyPolices setApplicationIds(java.util.List<String> applicationIds) {
            this.applicationIds = applicationIds;
            return this;
        }
        public java.util.List<String> getApplicationIds() {
            return this.applicationIds;
        }

        public ListPrivateAccessPolicesResponseBodyPolices setApplicationType(String applicationType) {
            this.applicationType = applicationType;
            return this;
        }
        public String getApplicationType() {
            return this.applicationType;
        }

        public ListPrivateAccessPolicesResponseBodyPolices setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListPrivateAccessPolicesResponseBodyPolices setCustomUserAttributes(java.util.List<ListPrivateAccessPolicesResponseBodyPolicesCustomUserAttributes> customUserAttributes) {
            this.customUserAttributes = customUserAttributes;
            return this;
        }
        public java.util.List<ListPrivateAccessPolicesResponseBodyPolicesCustomUserAttributes> getCustomUserAttributes() {
            return this.customUserAttributes;
        }

        public ListPrivateAccessPolicesResponseBodyPolices setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPrivateAccessPolicesResponseBodyPolices setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPrivateAccessPolicesResponseBodyPolices setPolicyAction(String policyAction) {
            this.policyAction = policyAction;
            return this;
        }
        public String getPolicyAction() {
            return this.policyAction;
        }

        public ListPrivateAccessPolicesResponseBodyPolices setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public ListPrivateAccessPolicesResponseBodyPolices setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListPrivateAccessPolicesResponseBodyPolices setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListPrivateAccessPolicesResponseBodyPolices setTagIds(java.util.List<String> tagIds) {
            this.tagIds = tagIds;
            return this;
        }
        public java.util.List<String> getTagIds() {
            return this.tagIds;
        }

        public ListPrivateAccessPolicesResponseBodyPolices setUserGroupIds(java.util.List<String> userGroupIds) {
            this.userGroupIds = userGroupIds;
            return this;
        }
        public java.util.List<String> getUserGroupIds() {
            return this.userGroupIds;
        }

        public ListPrivateAccessPolicesResponseBodyPolices setUserGroupMode(String userGroupMode) {
            this.userGroupMode = userGroupMode;
            return this;
        }
        public String getUserGroupMode() {
            return this.userGroupMode;
        }

    }

}
