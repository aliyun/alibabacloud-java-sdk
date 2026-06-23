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
     * <p>The list of KubeConfig states associated with the cluster.</p>
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
         * <p>The maximum number of records per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("page_size")
        public Integer pageSize;

        /**
         * <p>The total number of results.</p>
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
        /**
         * <p>Indicates whether the content matches the default cluster role template. Valid values:</p>
         * <ul>
         * <li>true: The content matches the default template.</li>
         * <li>false: The content does not match the default template.</li>
         * </ul>
         */
        @NameInMap("is_default_template")
        public Boolean isDefaultTemplate;

        /**
         * <p>The name of the cluster role associated with the cloud service role.</p>
         * 
         * <strong>example:</strong>
         * <p>cluster-admin</p>
         */
        @NameInMap("role_name")
        public String roleName;

        /**
         * <p>The namespace of the cluster role associated with the cloud service role.</p>
         * 
         * <strong>example:</strong>
         * <p>kube-system</p>
         */
        @NameInMap("role_namespace")
        public String roleNamespace;

        /**
         * <p>The type of the cluster role associated with the cloud service role.</p>
         * 
         * <strong>example:</strong>
         * <p>ClusterRole</p>
         */
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
         * <p>The display name of the Resource Access Management (RAM) user or the role name.</p>
         * 
         * <strong>example:</strong>
         * <p>tom</p>
         */
        @NameInMap("account_display_name")
        public String accountDisplayName;

        /**
         * <p>The Alibaba Cloud account, Resource Access Management (RAM) user, or role ID.</p>
         * 
         * <strong>example:</strong>
         * <p>22855*****************</p>
         */
        @NameInMap("account_id")
        public String accountId;

        /**
         * <p>The logon name of the Resource Access Management (RAM) user or the role name.</p>
         * 
         * <strong>example:</strong>
         * <p>tom</p>
         */
        @NameInMap("account_name")
        public String accountName;

        /**
         * <p>The account status. Valid values:</p>
         * <ul>
         * <li><p>Active: The account is active.</p>
         * </li>
         * <li><p>InActive: The account is frozen.</p>
         * </li>
         * <li><p>Deleted: The account is deleted.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("account_state")
        public String accountState;

        /**
         * <p>The account type. Valid values:</p>
         * <ul>
         * <li>RootAccount: Alibaba Cloud account.</li>
         * <li>RamUser: Resource Access Management (RAM) user.</li>
         * <li>RamRole: RAM role.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RamUser</p>
         */
        @NameInMap("account_type")
        public String accountType;

        /**
         * <p>The expiration time of the KubeConfig client certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>2027-07-15T01:32:20Z</p>
         */
        @NameInMap("cert_expire_time")
        public String certExpireTime;

        /**
         * <p>The status of the KubeConfig client certificate. Valid values:</p>
         * <ul>
         * <li><p>Unexpired: The certificate has not expired.</p>
         * </li>
         * <li><p>Expired: The certificate has expired.</p>
         * </li>
         * <li><p>Unknown: The certificate status is unknown (abnormal state).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Expired</p>
         */
        @NameInMap("cert_state")
        public String certState;

        /**
         * <p>The name of the cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>cs/ecs/sls</p>
         */
        @NameInMap("cloud_service_name")
        public String cloudServiceName;

        /**
         * <p>The list of cluster roles associated with the cloud service role.</p>
         */
        @NameInMap("cloud_service_roles")
        public java.util.List<ListClusterKubeconfigStatesResponseBodyStatesCloudServiceRoles> cloudServiceRoles;

        /**
         * <p>Indicates whether the KubeConfig client certificate can be revoked.</p>
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

        public ListClusterKubeconfigStatesResponseBodyStates setCloudServiceName(String cloudServiceName) {
            this.cloudServiceName = cloudServiceName;
            return this;
        }
        public String getCloudServiceName() {
            return this.cloudServiceName;
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
