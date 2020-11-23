// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetAccountSummaryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SummaryMap")
    @Validation(required = true)
    public GetAccountSummaryResponseSummaryMap summaryMap;

    public static GetAccountSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccountSummaryResponse self = new GetAccountSummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetAccountSummaryResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAccountSummaryResponse setSummaryMap(GetAccountSummaryResponseSummaryMap summaryMap) {
        this.summaryMap = summaryMap;
        return this;
    }
    public GetAccountSummaryResponseSummaryMap getSummaryMap() {
        return this.summaryMap;
    }

    public static class GetAccountSummaryResponseSummaryMap extends TeaModel {
        @NameInMap("UsersQuota")
        @Validation(required = true)
        public Integer usersQuota;

        @NameInMap("Users")
        @Validation(required = true)
        public Integer users;

        @NameInMap("AccessKeysPerUserQuota")
        @Validation(required = true)
        public Integer accessKeysPerUserQuota;

        @NameInMap("VirtualMFADevicesQuota")
        @Validation(required = true)
        public Integer virtualMFADevicesQuota;

        @NameInMap("MFADevices")
        @Validation(required = true)
        public Integer MFADevices;

        @NameInMap("MFADevicesInUse")
        @Validation(required = true)
        public Integer MFADevicesInUse;

        @NameInMap("GroupsQuota")
        @Validation(required = true)
        public Integer groupsQuota;

        @NameInMap("Groups")
        @Validation(required = true)
        public Integer groups;

        @NameInMap("GroupsPerUserQuota")
        @Validation(required = true)
        public Integer groupsPerUserQuota;

        @NameInMap("RolesQuota")
        @Validation(required = true)
        public Integer rolesQuota;

        @NameInMap("Roles")
        @Validation(required = true)
        public Integer roles;

        @NameInMap("PoliciesQuota")
        @Validation(required = true)
        public Integer policiesQuota;

        @NameInMap("Policies")
        @Validation(required = true)
        public Integer policies;

        @NameInMap("PolicySizeQuota")
        @Validation(required = true)
        public Integer policySizeQuota;

        @NameInMap("VersionsPerPolicyQuota")
        @Validation(required = true)
        public Integer versionsPerPolicyQuota;

        @NameInMap("AttachedPoliciesPerUserQuota")
        @Validation(required = true)
        public Integer attachedPoliciesPerUserQuota;

        @NameInMap("AttachedPoliciesPerGroupQuota")
        @Validation(required = true)
        public Integer attachedPoliciesPerGroupQuota;

        @NameInMap("AttachedPoliciesPerRoleQuota")
        @Validation(required = true)
        public Integer attachedPoliciesPerRoleQuota;

        @NameInMap("AttachedSystemPoliciesPerUserQuota")
        @Validation(required = true)
        public Integer attachedSystemPoliciesPerUserQuota;

        @NameInMap("AttachedSystemPoliciesPerGroupQuota")
        @Validation(required = true)
        public Integer attachedSystemPoliciesPerGroupQuota;

        @NameInMap("AttachedSystemPoliciesPerRoleQuota")
        @Validation(required = true)
        public Integer attachedSystemPoliciesPerRoleQuota;

        public static GetAccountSummaryResponseSummaryMap build(java.util.Map<String, ?> map) throws Exception {
            GetAccountSummaryResponseSummaryMap self = new GetAccountSummaryResponseSummaryMap();
            return TeaModel.build(map, self);
        }

        public GetAccountSummaryResponseSummaryMap setUsersQuota(Integer usersQuota) {
            this.usersQuota = usersQuota;
            return this;
        }
        public Integer getUsersQuota() {
            return this.usersQuota;
        }

        public GetAccountSummaryResponseSummaryMap setUsers(Integer users) {
            this.users = users;
            return this;
        }
        public Integer getUsers() {
            return this.users;
        }

        public GetAccountSummaryResponseSummaryMap setAccessKeysPerUserQuota(Integer accessKeysPerUserQuota) {
            this.accessKeysPerUserQuota = accessKeysPerUserQuota;
            return this;
        }
        public Integer getAccessKeysPerUserQuota() {
            return this.accessKeysPerUserQuota;
        }

        public GetAccountSummaryResponseSummaryMap setVirtualMFADevicesQuota(Integer virtualMFADevicesQuota) {
            this.virtualMFADevicesQuota = virtualMFADevicesQuota;
            return this;
        }
        public Integer getVirtualMFADevicesQuota() {
            return this.virtualMFADevicesQuota;
        }

        public GetAccountSummaryResponseSummaryMap setMFADevices(Integer MFADevices) {
            this.MFADevices = MFADevices;
            return this;
        }
        public Integer getMFADevices() {
            return this.MFADevices;
        }

        public GetAccountSummaryResponseSummaryMap setMFADevicesInUse(Integer MFADevicesInUse) {
            this.MFADevicesInUse = MFADevicesInUse;
            return this;
        }
        public Integer getMFADevicesInUse() {
            return this.MFADevicesInUse;
        }

        public GetAccountSummaryResponseSummaryMap setGroupsQuota(Integer groupsQuota) {
            this.groupsQuota = groupsQuota;
            return this;
        }
        public Integer getGroupsQuota() {
            return this.groupsQuota;
        }

        public GetAccountSummaryResponseSummaryMap setGroups(Integer groups) {
            this.groups = groups;
            return this;
        }
        public Integer getGroups() {
            return this.groups;
        }

        public GetAccountSummaryResponseSummaryMap setGroupsPerUserQuota(Integer groupsPerUserQuota) {
            this.groupsPerUserQuota = groupsPerUserQuota;
            return this;
        }
        public Integer getGroupsPerUserQuota() {
            return this.groupsPerUserQuota;
        }

        public GetAccountSummaryResponseSummaryMap setRolesQuota(Integer rolesQuota) {
            this.rolesQuota = rolesQuota;
            return this;
        }
        public Integer getRolesQuota() {
            return this.rolesQuota;
        }

        public GetAccountSummaryResponseSummaryMap setRoles(Integer roles) {
            this.roles = roles;
            return this;
        }
        public Integer getRoles() {
            return this.roles;
        }

        public GetAccountSummaryResponseSummaryMap setPoliciesQuota(Integer policiesQuota) {
            this.policiesQuota = policiesQuota;
            return this;
        }
        public Integer getPoliciesQuota() {
            return this.policiesQuota;
        }

        public GetAccountSummaryResponseSummaryMap setPolicies(Integer policies) {
            this.policies = policies;
            return this;
        }
        public Integer getPolicies() {
            return this.policies;
        }

        public GetAccountSummaryResponseSummaryMap setPolicySizeQuota(Integer policySizeQuota) {
            this.policySizeQuota = policySizeQuota;
            return this;
        }
        public Integer getPolicySizeQuota() {
            return this.policySizeQuota;
        }

        public GetAccountSummaryResponseSummaryMap setVersionsPerPolicyQuota(Integer versionsPerPolicyQuota) {
            this.versionsPerPolicyQuota = versionsPerPolicyQuota;
            return this;
        }
        public Integer getVersionsPerPolicyQuota() {
            return this.versionsPerPolicyQuota;
        }

        public GetAccountSummaryResponseSummaryMap setAttachedPoliciesPerUserQuota(Integer attachedPoliciesPerUserQuota) {
            this.attachedPoliciesPerUserQuota = attachedPoliciesPerUserQuota;
            return this;
        }
        public Integer getAttachedPoliciesPerUserQuota() {
            return this.attachedPoliciesPerUserQuota;
        }

        public GetAccountSummaryResponseSummaryMap setAttachedPoliciesPerGroupQuota(Integer attachedPoliciesPerGroupQuota) {
            this.attachedPoliciesPerGroupQuota = attachedPoliciesPerGroupQuota;
            return this;
        }
        public Integer getAttachedPoliciesPerGroupQuota() {
            return this.attachedPoliciesPerGroupQuota;
        }

        public GetAccountSummaryResponseSummaryMap setAttachedPoliciesPerRoleQuota(Integer attachedPoliciesPerRoleQuota) {
            this.attachedPoliciesPerRoleQuota = attachedPoliciesPerRoleQuota;
            return this;
        }
        public Integer getAttachedPoliciesPerRoleQuota() {
            return this.attachedPoliciesPerRoleQuota;
        }

        public GetAccountSummaryResponseSummaryMap setAttachedSystemPoliciesPerUserQuota(Integer attachedSystemPoliciesPerUserQuota) {
            this.attachedSystemPoliciesPerUserQuota = attachedSystemPoliciesPerUserQuota;
            return this;
        }
        public Integer getAttachedSystemPoliciesPerUserQuota() {
            return this.attachedSystemPoliciesPerUserQuota;
        }

        public GetAccountSummaryResponseSummaryMap setAttachedSystemPoliciesPerGroupQuota(Integer attachedSystemPoliciesPerGroupQuota) {
            this.attachedSystemPoliciesPerGroupQuota = attachedSystemPoliciesPerGroupQuota;
            return this;
        }
        public Integer getAttachedSystemPoliciesPerGroupQuota() {
            return this.attachedSystemPoliciesPerGroupQuota;
        }

        public GetAccountSummaryResponseSummaryMap setAttachedSystemPoliciesPerRoleQuota(Integer attachedSystemPoliciesPerRoleQuota) {
            this.attachedSystemPoliciesPerRoleQuota = attachedSystemPoliciesPerRoleQuota;
            return this;
        }
        public Integer getAttachedSystemPoliciesPerRoleQuota() {
            return this.attachedSystemPoliciesPerRoleQuota;
        }

    }

}
