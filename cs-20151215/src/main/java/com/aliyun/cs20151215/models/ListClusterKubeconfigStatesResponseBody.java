// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ListClusterKubeconfigStatesResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("page")
    public ListClusterKubeconfigStatesResponseBodyPage page;

    /**
     * <p>The status list of the kubeconfig files associated with the cluster.</p>
     */
    @NameInMap("states")
    public java.util.List<ListClusterKubeconfigStatesResponseBodyStates> states;

    public static ListClusterKubeconfigStatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterKubeconfigStatesResponseBody self = new ListClusterKubeconfigStatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterKubeconfigStatesResponseBody setPage(ListClusterKubeconfigStatesResponseBodyPage page) {
        this.page = page;
        return this;
    }
    public ListClusterKubeconfigStatesResponseBodyPage getPage() {
        return this.page;
    }

    public ListClusterKubeconfigStatesResponseBody setStates(java.util.List<ListClusterKubeconfigStatesResponseBodyStates> states) {
        this.states = states;
        return this;
    }
    public java.util.List<ListClusterKubeconfigStatesResponseBodyStates> getStates() {
        return this.states;
    }

    public static class ListClusterKubeconfigStatesResponseBodyPage extends TeaModel {
        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("page_number")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("page_size")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("total_count")
        public Integer totalCount;

        public static ListClusterKubeconfigStatesResponseBodyPage build(java.util.Map<String, ?> map) throws Exception {
            ListClusterKubeconfigStatesResponseBodyPage self = new ListClusterKubeconfigStatesResponseBodyPage();
            return TeaModel.build(map, self);
        }

        public ListClusterKubeconfigStatesResponseBodyPage setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListClusterKubeconfigStatesResponseBodyPage setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListClusterKubeconfigStatesResponseBodyPage setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class ListClusterKubeconfigStatesResponseBodyStatesCloudServiceRoles extends TeaModel {
        @NameInMap("is_default_template")
        public Boolean isDefaultTemplate;

        @NameInMap("role_name")
        public String roleName;

        @NameInMap("role_namespace")
        public String roleNamespace;

        @NameInMap("type")
        public String type;

        public static ListClusterKubeconfigStatesResponseBodyStatesCloudServiceRoles build(java.util.Map<String, ?> map) throws Exception {
            ListClusterKubeconfigStatesResponseBodyStatesCloudServiceRoles self = new ListClusterKubeconfigStatesResponseBodyStatesCloudServiceRoles();
            return TeaModel.build(map, self);
        }

        public ListClusterKubeconfigStatesResponseBodyStatesCloudServiceRoles setIsDefaultTemplate(Boolean isDefaultTemplate) {
            this.isDefaultTemplate = isDefaultTemplate;
            return this;
        }
        public Boolean getIsDefaultTemplate() {
            return this.isDefaultTemplate;
        }

        public ListClusterKubeconfigStatesResponseBodyStatesCloudServiceRoles setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public ListClusterKubeconfigStatesResponseBodyStatesCloudServiceRoles setRoleNamespace(String roleNamespace) {
            this.roleNamespace = roleNamespace;
            return this;
        }
        public String getRoleNamespace() {
            return this.roleNamespace;
        }

        public ListClusterKubeconfigStatesResponseBodyStatesCloudServiceRoles setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListClusterKubeconfigStatesResponseBodyStates extends TeaModel {
        /**
         * <p>The displayed name or role name of the RAM user.</p>
         * 
         * <strong>example:</strong>
         * <p>tom</p>
         */
        @NameInMap("account_display_name")
        public String accountDisplayName;

        /**
         * <p>The ID of an Alibaba Cloud account, RAM user, or RAM role.</p>
         * 
         * <strong>example:</strong>
         * <p>22855*****************</p>
         */
        @NameInMap("account_id")
        public String accountId;

        /**
         * <p>The logon name or role name of the RAM user.</p>
         * 
         * <strong>example:</strong>
         * <p>tom</p>
         */
        @NameInMap("account_name")
        public String accountName;

        /**
         * <p>The status of the account.</p>
         * <ul>
         * <li>Active: The account is active.</li>
         * <li>InActive: The account is locked.</li>
         * <li>Deleted: The account is deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("account_state")
        public String accountState;

        /**
         * <p>The type of the account.</p>
         * <ul>
         * <li>RootAccount: Alibaba Cloud account.</li>
         * <li>RamUser: RAM user.</li>
         * <li>RamRole: RAM role.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RamUser</p>
         */
        @NameInMap("account_type")
        public String accountType;

        /**
         * <p>The expiration time of the client certificate for the kubeconfig file.</p>
         * 
         * <strong>example:</strong>
         * <p>2027-07-15T01:32:20Z</p>
         */
        @NameInMap("cert_expire_time")
        public String certExpireTime;

        /**
         * <p>The status of the client certificate for the kubeconfig file.</p>
         * <ul>
         * <li>Unexpired: The certificate is not expired.</li>
         * <li>Expired: The certificate is expired.</li>
         * <li>Unknown: The status of the certificate is unknown.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Expired</p>
         */
        @NameInMap("cert_state")
        public String certState;

        @NameInMap("cloud_service_roles")
        public java.util.List<ListClusterKubeconfigStatesResponseBodyStatesCloudServiceRoles> cloudServiceRoles;

        /**
         * <p>Indicates whether the client certificate for the kubeconfig file can be revoked.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("revokable")
        public Boolean revokable;

        public static ListClusterKubeconfigStatesResponseBodyStates build(java.util.Map<String, ?> map) throws Exception {
            ListClusterKubeconfigStatesResponseBodyStates self = new ListClusterKubeconfigStatesResponseBodyStates();
            return TeaModel.build(map, self);
        }

        public ListClusterKubeconfigStatesResponseBodyStates setAccountDisplayName(String accountDisplayName) {
            this.accountDisplayName = accountDisplayName;
            return this;
        }
        public String getAccountDisplayName() {
            return this.accountDisplayName;
        }

        public ListClusterKubeconfigStatesResponseBodyStates setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListClusterKubeconfigStatesResponseBodyStates setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public ListClusterKubeconfigStatesResponseBodyStates setAccountState(String accountState) {
            this.accountState = accountState;
            return this;
        }
        public String getAccountState() {
            return this.accountState;
        }

        public ListClusterKubeconfigStatesResponseBodyStates setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public ListClusterKubeconfigStatesResponseBodyStates setCertExpireTime(String certExpireTime) {
            this.certExpireTime = certExpireTime;
            return this;
        }
        public String getCertExpireTime() {
            return this.certExpireTime;
        }

        public ListClusterKubeconfigStatesResponseBodyStates setCertState(String certState) {
            this.certState = certState;
            return this;
        }
        public String getCertState() {
            return this.certState;
        }

        public ListClusterKubeconfigStatesResponseBodyStates setCloudServiceRoles(java.util.List<ListClusterKubeconfigStatesResponseBodyStatesCloudServiceRoles> cloudServiceRoles) {
            this.cloudServiceRoles = cloudServiceRoles;
            return this;
        }
        public java.util.List<ListClusterKubeconfigStatesResponseBodyStatesCloudServiceRoles> getCloudServiceRoles() {
            return this.cloudServiceRoles;
        }

        public ListClusterKubeconfigStatesResponseBodyStates setRevokable(Boolean revokable) {
            this.revokable = revokable;
            return this;
        }
        public Boolean getRevokable() {
            return this.revokable;
        }

    }

}
