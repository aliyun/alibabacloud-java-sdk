// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetAccountSummaryResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>81313F5E-3C85-478F-BCC9-E1B70E4556DB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The overview information of the Alibaba Cloud account.</p>
     */
    @NameInMap("SummaryMap")
    public GetAccountSummaryResponseBodySummaryMap summaryMap;

    public static GetAccountSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAccountSummaryResponseBody self = new GetAccountSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAccountSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAccountSummaryResponseBody setSummaryMap(GetAccountSummaryResponseBodySummaryMap summaryMap) {
        this.summaryMap = summaryMap;
        return this;
    }
    public GetAccountSummaryResponseBodySummaryMap getSummaryMap() {
        return this.summaryMap;
    }

    public static class GetAccountSummaryResponseBodySummaryMap extends TeaModel {
        /**
         * <p>The maximum number of AccessKey pairs that a Resource Access Management (RAM) user can have.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AccessKeysPerUserQuota")
        public Integer accessKeysPerUserQuota;

        /**
         * <p>The maximum number of custom policies that can be added to a RAM user group.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("AttachedPoliciesPerGroupQuota")
        public Integer attachedPoliciesPerGroupQuota;

        /**
         * <p>The maximum number of custom policies that can be added to a RAM role.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("AttachedPoliciesPerRoleQuota")
        public Integer attachedPoliciesPerRoleQuota;

        /**
         * <p>The maximum number of custom policies that can be added to a RAM user.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("AttachedPoliciesPerUserQuota")
        public Integer attachedPoliciesPerUserQuota;

        /**
         * <p>The maximum number of system policies that can be added to a RAM user group.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("AttachedSystemPoliciesPerGroupQuota")
        public Integer attachedSystemPoliciesPerGroupQuota;

        /**
         * <p>The maximum number of system policies that can be added to a RAM role.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("AttachedSystemPoliciesPerRoleQuota")
        public Integer attachedSystemPoliciesPerRoleQuota;

        /**
         * <p>The maximum number of system policies that can be added to a RAM user.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("AttachedSystemPoliciesPerUserQuota")
        public Integer attachedSystemPoliciesPerUserQuota;

        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("ConditionsPerAKPolicyQuota")
        public Integer conditionsPerAKPolicyQuota;

        /**
         * <p>The number of RAM user groups.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("Groups")
        public Integer groups;

        /**
         * <p>The maximum number of RAM user groups to which a RAM user can be added.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("GroupsPerUserQuota")
        public Integer groupsPerUserQuota;

        /**
         * <p>The maximum number of RAM user groups that can be created.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("GroupsQuota")
        public Integer groupsQuota;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("IPItemsPerAKPolicyQuota")
        public Integer IPItemsPerAKPolicyQuota;

        /**
         * <p>The number of virtual multi-factor authentication (MFA) devices.</p>
         * 
         * <strong>example:</strong>
         * <p>13</p>
         */
        @NameInMap("MFADevices")
        public Integer MFADevices;

        /**
         * <p>The number of virtual MFA devices in use.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MFADevicesInUse")
        public Integer MFADevicesInUse;

        /**
         * <p>The number of custom policies.</p>
         * 
         * <strong>example:</strong>
         * <p>13</p>
         */
        @NameInMap("Policies")
        public Integer policies;

        /**
         * <p>The maximum number of custom policies that can be created.</p>
         * 
         * <strong>example:</strong>
         * <p>1500</p>
         */
        @NameInMap("PoliciesQuota")
        public Integer policiesQuota;

        /**
         * <p>The maximum length of the policy content.</p>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        @NameInMap("PolicySizeQuota")
        public Integer policySizeQuota;

        /**
         * <p>The number of RAM roles.</p>
         * 
         * <strong>example:</strong>
         * <p>19</p>
         */
        @NameInMap("Roles")
        public Integer roles;

        /**
         * <p>The maximum number of RAM roles that can be created.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("RolesQuota")
        public Integer rolesQuota;

        /**
         * <p>The number of RAM users.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("Users")
        public Integer users;

        /**
         * <p>The maximum number of RAM users that can be created.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("UsersQuota")
        public Integer usersQuota;

        /**
         * <p>The maximum number of policy versions.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("VersionsPerPolicyQuota")
        public Integer versionsPerPolicyQuota;

        /**
         * <p>The maximum number of virtual MFA devices that can be created.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("VirtualMFADevicesQuota")
        public Integer virtualMFADevicesQuota;

        public static GetAccountSummaryResponseBodySummaryMap build(java.util.Map<String, ?> map) throws Exception {
            GetAccountSummaryResponseBodySummaryMap self = new GetAccountSummaryResponseBodySummaryMap();
            return TeaModel.build(map, self);
        }

        public GetAccountSummaryResponseBodySummaryMap setAccessKeysPerUserQuota(Integer accessKeysPerUserQuota) {
            this.accessKeysPerUserQuota = accessKeysPerUserQuota;
            return this;
        }
        public Integer getAccessKeysPerUserQuota() {
            return this.accessKeysPerUserQuota;
        }

        public GetAccountSummaryResponseBodySummaryMap setAttachedPoliciesPerGroupQuota(Integer attachedPoliciesPerGroupQuota) {
            this.attachedPoliciesPerGroupQuota = attachedPoliciesPerGroupQuota;
            return this;
        }
        public Integer getAttachedPoliciesPerGroupQuota() {
            return this.attachedPoliciesPerGroupQuota;
        }

        public GetAccountSummaryResponseBodySummaryMap setAttachedPoliciesPerRoleQuota(Integer attachedPoliciesPerRoleQuota) {
            this.attachedPoliciesPerRoleQuota = attachedPoliciesPerRoleQuota;
            return this;
        }
        public Integer getAttachedPoliciesPerRoleQuota() {
            return this.attachedPoliciesPerRoleQuota;
        }

        public GetAccountSummaryResponseBodySummaryMap setAttachedPoliciesPerUserQuota(Integer attachedPoliciesPerUserQuota) {
            this.attachedPoliciesPerUserQuota = attachedPoliciesPerUserQuota;
            return this;
        }
        public Integer getAttachedPoliciesPerUserQuota() {
            return this.attachedPoliciesPerUserQuota;
        }

        public GetAccountSummaryResponseBodySummaryMap setAttachedSystemPoliciesPerGroupQuota(Integer attachedSystemPoliciesPerGroupQuota) {
            this.attachedSystemPoliciesPerGroupQuota = attachedSystemPoliciesPerGroupQuota;
            return this;
        }
        public Integer getAttachedSystemPoliciesPerGroupQuota() {
            return this.attachedSystemPoliciesPerGroupQuota;
        }

        public GetAccountSummaryResponseBodySummaryMap setAttachedSystemPoliciesPerRoleQuota(Integer attachedSystemPoliciesPerRoleQuota) {
            this.attachedSystemPoliciesPerRoleQuota = attachedSystemPoliciesPerRoleQuota;
            return this;
        }
        public Integer getAttachedSystemPoliciesPerRoleQuota() {
            return this.attachedSystemPoliciesPerRoleQuota;
        }

        public GetAccountSummaryResponseBodySummaryMap setAttachedSystemPoliciesPerUserQuota(Integer attachedSystemPoliciesPerUserQuota) {
            this.attachedSystemPoliciesPerUserQuota = attachedSystemPoliciesPerUserQuota;
            return this;
        }
        public Integer getAttachedSystemPoliciesPerUserQuota() {
            return this.attachedSystemPoliciesPerUserQuota;
        }

        public GetAccountSummaryResponseBodySummaryMap setConditionsPerAKPolicyQuota(Integer conditionsPerAKPolicyQuota) {
            this.conditionsPerAKPolicyQuota = conditionsPerAKPolicyQuota;
            return this;
        }
        public Integer getConditionsPerAKPolicyQuota() {
            return this.conditionsPerAKPolicyQuota;
        }

        public GetAccountSummaryResponseBodySummaryMap setGroups(Integer groups) {
            this.groups = groups;
            return this;
        }
        public Integer getGroups() {
            return this.groups;
        }

        public GetAccountSummaryResponseBodySummaryMap setGroupsPerUserQuota(Integer groupsPerUserQuota) {
            this.groupsPerUserQuota = groupsPerUserQuota;
            return this;
        }
        public Integer getGroupsPerUserQuota() {
            return this.groupsPerUserQuota;
        }

        public GetAccountSummaryResponseBodySummaryMap setGroupsQuota(Integer groupsQuota) {
            this.groupsQuota = groupsQuota;
            return this;
        }
        public Integer getGroupsQuota() {
            return this.groupsQuota;
        }

        public GetAccountSummaryResponseBodySummaryMap setIPItemsPerAKPolicyQuota(Integer IPItemsPerAKPolicyQuota) {
            this.IPItemsPerAKPolicyQuota = IPItemsPerAKPolicyQuota;
            return this;
        }
        public Integer getIPItemsPerAKPolicyQuota() {
            return this.IPItemsPerAKPolicyQuota;
        }

        public GetAccountSummaryResponseBodySummaryMap setMFADevices(Integer MFADevices) {
            this.MFADevices = MFADevices;
            return this;
        }
        public Integer getMFADevices() {
            return this.MFADevices;
        }

        public GetAccountSummaryResponseBodySummaryMap setMFADevicesInUse(Integer MFADevicesInUse) {
            this.MFADevicesInUse = MFADevicesInUse;
            return this;
        }
        public Integer getMFADevicesInUse() {
            return this.MFADevicesInUse;
        }

        public GetAccountSummaryResponseBodySummaryMap setPolicies(Integer policies) {
            this.policies = policies;
            return this;
        }
        public Integer getPolicies() {
            return this.policies;
        }

        public GetAccountSummaryResponseBodySummaryMap setPoliciesQuota(Integer policiesQuota) {
            this.policiesQuota = policiesQuota;
            return this;
        }
        public Integer getPoliciesQuota() {
            return this.policiesQuota;
        }

        public GetAccountSummaryResponseBodySummaryMap setPolicySizeQuota(Integer policySizeQuota) {
            this.policySizeQuota = policySizeQuota;
            return this;
        }
        public Integer getPolicySizeQuota() {
            return this.policySizeQuota;
        }

        public GetAccountSummaryResponseBodySummaryMap setRoles(Integer roles) {
            this.roles = roles;
            return this;
        }
        public Integer getRoles() {
            return this.roles;
        }

        public GetAccountSummaryResponseBodySummaryMap setRolesQuota(Integer rolesQuota) {
            this.rolesQuota = rolesQuota;
            return this;
        }
        public Integer getRolesQuota() {
            return this.rolesQuota;
        }

        public GetAccountSummaryResponseBodySummaryMap setUsers(Integer users) {
            this.users = users;
            return this;
        }
        public Integer getUsers() {
            return this.users;
        }

        public GetAccountSummaryResponseBodySummaryMap setUsersQuota(Integer usersQuota) {
            this.usersQuota = usersQuota;
            return this;
        }
        public Integer getUsersQuota() {
            return this.usersQuota;
        }

        public GetAccountSummaryResponseBodySummaryMap setVersionsPerPolicyQuota(Integer versionsPerPolicyQuota) {
            this.versionsPerPolicyQuota = versionsPerPolicyQuota;
            return this;
        }
        public Integer getVersionsPerPolicyQuota() {
            return this.versionsPerPolicyQuota;
        }

        public GetAccountSummaryResponseBodySummaryMap setVirtualMFADevicesQuota(Integer virtualMFADevicesQuota) {
            this.virtualMFADevicesQuota = virtualMFADevicesQuota;
            return this;
        }
        public Integer getVirtualMFADevicesQuota() {
            return this.virtualMFADevicesQuota;
        }

    }

}
