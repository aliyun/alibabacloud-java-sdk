// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListUserPrivateAccessPoliciesResponseBody extends TeaModel {
    /**
     * <p>List of authorized policies.</p>
     */
    @NameInMap("Polices")
    public java.util.List<ListUserPrivateAccessPoliciesResponseBodyPolices> polices;

    /**
     * <p>ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>9D852F87-AFB5-51B8-AACD-F7D0EFB8277D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total number of authorized policies.</p>
     * 
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
         * <p>The identity provider ID of the user group. This value exists when the custom user group type is <strong>department</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("IdpId")
        public Integer idpId;

        /**
         * <p>Relation of the user group. Values:</p>
         * <ul>
         * <li><strong>Equal</strong>: Equal.</li>
         * <li><strong>Unequal</strong>: Not equal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Equal</p>
         */
        @NameInMap("Relation")
        public String relation;

        /**
         * <p>Type of the user group. Values:</p>
         * <ul>
         * <li><strong>username</strong>: Username.</li>
         * <li><strong>department</strong>: Department.</li>
         * <li><strong>email</strong>: Email.</li>
         * <li><strong>telephone</strong>: Telephone.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>department</p>
         */
        @NameInMap("UserGroupType")
        public String userGroupType;

        /**
         * <p>The value of the user group attribute.</p>
         * <ul>
         * <li>When the user group type is <strong>username</strong>, it represents the value of the username. The length is 1 to 128 characters, supporting Chinese and case-sensitive English letters, and can include numbers, periods (.), underscores (_), and hyphens (-).</li>
         * <li>When the user group type is <strong>department</strong>, it represents the value of the department. For example: OU=Department1,OU=SASE DingTalk.</li>
         * <li>When the user group type is <strong>email</strong>, it represents the value of the email. For example: <a href="mailto:username@example.com">username@example.com</a>.</li>
         * <li>When the user group type is <strong>telephone</strong>, it represents the value of the phone number. For example: 13900001234.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OU=部门1,OU=SASE钉钉</p>
         */
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
        /**
         * <p>Set of custom user group attributes. Multiple custom user group attributes are in an OR relationship, effective as a union.</p>
         */
        @NameInMap("CustomUserAttributes")
        public java.util.List<ListUserPrivateAccessPoliciesResponseBodyPolicesCustomUserAttributes> customUserAttributes;

        /**
         * <p>Associated security baseline.</p>
         * 
         * <strong>example:</strong>
         * <p>device_attribute_name</p>
         */
        @NameInMap("DeviceAttributeName")
        public String deviceAttributeName;

        /**
         * <p>Associated user group.</p>
         * 
         * <strong>example:</strong>
         * <p>user_group_name</p>
         */
        @NameInMap("MatchedUserGroup")
        public String matchedUserGroup;

        /**
         * <p>Intranet access policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>private_access_policy_name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Action of the intranet access policy. Values:</p>
         * <ul>
         * <li><strong>Block</strong>: Block.</li>
         * <li><strong>Allow</strong>: Allow.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Allow</p>
         */
        @NameInMap("PolicyAction")
        public String policyAction;

        /**
         * <p>Intranet access policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-policy-1b0d0e8b4bcf****</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <p>Priority of the intranet access policy. The number 1 indicates the highest priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Long priority;

        /**
         * <p>List of trusted process group IDs.</p>
         */
        @NameInMap("TrustedProcessGroupIds")
        public java.util.List<String> trustedProcessGroupIds;

        /**
         * <p>List of trusted software IDs.</p>
         */
        @NameInMap("TrustedSoftwareIds")
        public java.util.List<String> trustedSoftwareIds;

        /**
         * <p>Type of the user group for the intranet access policy. Values:</p>
         * <ul>
         * <li><strong>Normal</strong>: Normal user group.</li>
         * <li><strong>Custom</strong>: Custom user group.</li>
         * </ul>
         * 
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

        public ListUserPrivateAccessPoliciesResponseBodyPolices setTrustedProcessGroupIds(java.util.List<String> trustedProcessGroupIds) {
            this.trustedProcessGroupIds = trustedProcessGroupIds;
            return this;
        }
        public java.util.List<String> getTrustedProcessGroupIds() {
            return this.trustedProcessGroupIds;
        }

        public ListUserPrivateAccessPoliciesResponseBodyPolices setTrustedSoftwareIds(java.util.List<String> trustedSoftwareIds) {
            this.trustedSoftwareIds = trustedSoftwareIds;
            return this;
        }
        public java.util.List<String> getTrustedSoftwareIds() {
            return this.trustedSoftwareIds;
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
