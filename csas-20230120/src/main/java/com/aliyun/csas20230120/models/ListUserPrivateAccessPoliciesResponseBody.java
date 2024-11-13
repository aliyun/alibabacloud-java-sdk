// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListUserPrivateAccessPoliciesResponseBody extends TeaModel {
    @NameInMap("Polices")
    public java.util.List<ListUserPrivateAccessPoliciesResponseBodyPolices> polices;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>9D852F87-AFB5-51B8-AACD-F7D0EFB8277D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalNum")
    public Integer totalNum;

    public static ListUserPrivateAccessPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserPrivateAccessPoliciesResponseBody self = new ListUserPrivateAccessPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserPrivateAccessPoliciesResponseBody setPolices(java.util.List<ListUserPrivateAccessPoliciesResponseBodyPolices> polices) {
        this.polices = polices;
        return this;
    }
    public java.util.List<ListUserPrivateAccessPoliciesResponseBodyPolices> getPolices() {
        return this.polices;
    }

    public ListUserPrivateAccessPoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserPrivateAccessPoliciesResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class ListUserPrivateAccessPoliciesResponseBodyPolicesCustomUserAttributes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("IdpId")
        public Integer idpId;

        /**
         * <strong>example:</strong>
         * <p>Equal</p>
         */
        @NameInMap("Relation")
        public String relation;

        /**
         * <strong>example:</strong>
         * <p>department</p>
         */
        @NameInMap("UserGroupType")
        public String userGroupType;

        @NameInMap("Value")
        public String value;

        public static ListUserPrivateAccessPoliciesResponseBodyPolicesCustomUserAttributes build(java.util.Map<String, ?> map) throws Exception {
            ListUserPrivateAccessPoliciesResponseBodyPolicesCustomUserAttributes self = new ListUserPrivateAccessPoliciesResponseBodyPolicesCustomUserAttributes();
            return TeaModel.build(map, self);
        }

        public ListUserPrivateAccessPoliciesResponseBodyPolicesCustomUserAttributes setIdpId(Integer idpId) {
            this.idpId = idpId;
            return this;
        }
        public Integer getIdpId() {
            return this.idpId;
        }

        public ListUserPrivateAccessPoliciesResponseBodyPolicesCustomUserAttributes setRelation(String relation) {
            this.relation = relation;
            return this;
        }
        public String getRelation() {
            return this.relation;
        }

        public ListUserPrivateAccessPoliciesResponseBodyPolicesCustomUserAttributes setUserGroupType(String userGroupType) {
            this.userGroupType = userGroupType;
            return this;
        }
        public String getUserGroupType() {
            return this.userGroupType;
        }

        public ListUserPrivateAccessPoliciesResponseBodyPolicesCustomUserAttributes setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListUserPrivateAccessPoliciesResponseBodyPolices extends TeaModel {
        @NameInMap("CustomUserAttributes")
        public java.util.List<ListUserPrivateAccessPoliciesResponseBodyPolicesCustomUserAttributes> customUserAttributes;

        /**
         * <strong>example:</strong>
         * <p>device_attribute_name</p>
         */
        @NameInMap("DeviceAttributeName")
        public String deviceAttributeName;

        /**
         * <strong>example:</strong>
         * <p>user_group_name</p>
         */
        @NameInMap("MatchedUserGroup")
        public String matchedUserGroup;

        /**
         * <strong>example:</strong>
         * <p>private_access_policy_name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>Allow</p>
         */
        @NameInMap("PolicyAction")
        public String policyAction;

        /**
         * <strong>example:</strong>
         * <p>pa-policy-1b0d0e8b4bcf****</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Long priority;

        /**
         * <strong>example:</strong>
         * <p>Custom</p>
         */
        @NameInMap("UserGroupMode")
        public String userGroupMode;

        public static ListUserPrivateAccessPoliciesResponseBodyPolices build(java.util.Map<String, ?> map) throws Exception {
            ListUserPrivateAccessPoliciesResponseBodyPolices self = new ListUserPrivateAccessPoliciesResponseBodyPolices();
            return TeaModel.build(map, self);
        }

        public ListUserPrivateAccessPoliciesResponseBodyPolices setCustomUserAttributes(java.util.List<ListUserPrivateAccessPoliciesResponseBodyPolicesCustomUserAttributes> customUserAttributes) {
            this.customUserAttributes = customUserAttributes;
            return this;
        }
        public java.util.List<ListUserPrivateAccessPoliciesResponseBodyPolicesCustomUserAttributes> getCustomUserAttributes() {
            return this.customUserAttributes;
        }

        public ListUserPrivateAccessPoliciesResponseBodyPolices setDeviceAttributeName(String deviceAttributeName) {
            this.deviceAttributeName = deviceAttributeName;
            return this;
        }
        public String getDeviceAttributeName() {
            return this.deviceAttributeName;
        }

        public ListUserPrivateAccessPoliciesResponseBodyPolices setMatchedUserGroup(String matchedUserGroup) {
            this.matchedUserGroup = matchedUserGroup;
            return this;
        }
        public String getMatchedUserGroup() {
            return this.matchedUserGroup;
        }

        public ListUserPrivateAccessPoliciesResponseBodyPolices setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListUserPrivateAccessPoliciesResponseBodyPolices setPolicyAction(String policyAction) {
            this.policyAction = policyAction;
            return this;
        }
        public String getPolicyAction() {
            return this.policyAction;
        }

        public ListUserPrivateAccessPoliciesResponseBodyPolices setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public ListUserPrivateAccessPoliciesResponseBodyPolices setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public ListUserPrivateAccessPoliciesResponseBodyPolices setUserGroupMode(String userGroupMode) {
            this.userGroupMode = userGroupMode;
            return this;
        }
        public String getUserGroupMode() {
            return this.userGroupMode;
        }

    }

}
