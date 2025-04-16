// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListPrivateAccessPolicesResponseBody extends TeaModel {
    /**
     * <p>The private access policies.</p>
     */
    @NameInMap("Polices")
    public java.util.List<ListPrivateAccessPolicesResponseBodyPolices> polices;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>748CFDC7-1EB6-5B8B-9405-DA76ED5BB60D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of private access policies.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
        /**
         * <p>The ID of the identity provider (IdP) for the user group. If the value of UserGroupType is <strong>department</strong>, this parameter is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("IdpId")
        public Integer idpId;

        /**
         * <p>The logical operator for the user group. Valid values:</p>
         * <ul>
         * <li><strong>Equal</strong></li>
         * <li><strong>Unequal</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Equal</p>
         */
        @NameInMap("Relation")
        public String relation;

        /**
         * <p>The type of the user group, which is the key of the attribute. Valid values:</p>
         * <ul>
         * <li><strong>username</strong></li>
         * <li><strong>department</strong></li>
         * <li><strong>email</strong></li>
         * <li><strong>telephone</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>department</p>
         */
        @NameInMap("UserGroupType")
        public String userGroupType;

        /**
         * <p>The value of the attribute.</p>
         * <ul>
         * <li>If the value of UserGroupType is <strong>username</strong>, the value of this parameter is a username. The value must be 1 to 128 characters in length and can contain letters, digits, hyphens (-), underscores (_), and periods (.).</li>
         * <li>If the value of UserGroupType is <strong>department</strong>, the value of this parameter is a department. Examples: OU=Department 1, OU=SASE DingTalk.</li>
         * <li>If the value of UserGroupType is <strong>email</strong>, the value of this parameter is an email address. Example: <a href="mailto:username@example.com">username@example.com</a>.</li>
         * <li>If the value of UserGroupType is <strong>telephone</strong>, the value of this parameter is a mobile phone number. Example: 13900001234.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OU=Department 1, OU=SASE DingTalk</p>
         */
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
        /**
         * <p>The IDs of the applications that are specified in the private access policy. If the value of ApplicationType is <strong>Application</strong>, this parameter is returned.</p>
         */
        @NameInMap("ApplicationIds")
        public java.util.List<String> applicationIds;

        /**
         * <p>The application type of the private access policy. Valid values:</p>
         * <ul>
         * <li><strong>Application</strong></li>
         * <li><strong>Tag</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Application</p>
         */
        @NameInMap("ApplicationType")
        public String applicationType;

        /**
         * <p>The creation time of the private access policy.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-10 15:50:23</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The attributes of the custom user group. The attributes of the custom user group are evaluated by using a logical OR. If an attribute is matched, the policy takes effect.</p>
         */
        @NameInMap("CustomUserAttributes")
        public java.util.List<ListPrivateAccessPolicesResponseBodyPolicesCustomUserAttributes> customUserAttributes;

        /**
         * <p>The description of the private access policy.</p>
         * 
         * <strong>example:</strong>
         * <p>a private access policy</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The action that is performed when the security baseline is not met. Valid values:</p>
         * <ul>
         * <li><strong>Block</strong></li>
         * <li><strong>Observe</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Block</p>
         */
        @NameInMap("DeviceAttributeAction")
        public String deviceAttributeAction;

        /**
         * <p>The ID of the security baseline.</p>
         * 
         * <strong>example:</strong>
         * <p>dag-d3f64e8bdd4a****</p>
         */
        @NameInMap("DeviceAttributeId")
        public String deviceAttributeId;

        /**
         * <p>The name of the private access policy.</p>
         * 
         * <strong>example:</strong>
         * <p>private_access_policy_name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The action in the private access policy. Valid values:</p>
         * <ul>
         * <li><strong>Block</strong></li>
         * <li><strong>Allow</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Allow</p>
         */
        @NameInMap("PolicyAction")
        public String policyAction;

        /**
         * <p>The ID of the private access policy.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-policy-63b2f1844b86****</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <p>The priority of the private access policy. The value 1 indicates the highest priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The status of the private access policy. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong></li>
         * <li><strong>Disabled</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The IDs of the tags that are specified in the private access policy. If the value of ApplicationType is <strong>Tag</strong>, this parameter is returned.</p>
         */
        @NameInMap("TagIds")
        public java.util.List<String> tagIds;

        /**
         * <p>The ID of the trigger template.</p>
         * 
         * <strong>example:</strong>
         * <p>dag-d3f64e8bdd4a****</p>
         */
        @NameInMap("TriggerTemplateId")
        public String triggerTemplateId;

        /**
         * <p>The IDs of user groups in the private access policy. If the value of UserGroupMode is <strong>Normal</strong>, this parameter is returned.</p>
         */
        @NameInMap("UserGroupIds")
        public java.util.List<String> userGroupIds;

        /**
         * <p>The type of the user group in the private access policy. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: regular user group.</li>
         * <li><strong>Custom</strong>: custom user group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
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

        public ListPrivateAccessPolicesResponseBodyPolices setDeviceAttributeAction(String deviceAttributeAction) {
            this.deviceAttributeAction = deviceAttributeAction;
            return this;
        }
        public String getDeviceAttributeAction() {
            return this.deviceAttributeAction;
        }

        public ListPrivateAccessPolicesResponseBodyPolices setDeviceAttributeId(String deviceAttributeId) {
            this.deviceAttributeId = deviceAttributeId;
            return this;
        }
        public String getDeviceAttributeId() {
            return this.deviceAttributeId;
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

        public ListPrivateAccessPolicesResponseBodyPolices setTriggerTemplateId(String triggerTemplateId) {
            this.triggerTemplateId = triggerTemplateId;
            return this;
        }
        public String getTriggerTemplateId() {
            return this.triggerTemplateId;
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
