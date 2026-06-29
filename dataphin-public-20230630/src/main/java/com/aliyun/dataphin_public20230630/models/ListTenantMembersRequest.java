// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListTenantMembersRequest extends TeaModel {
    /**
     * <p>The request object.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListQuery")
    public ListTenantMembersRequestListQuery listQuery;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static ListTenantMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTenantMembersRequest self = new ListTenantMembersRequest();
        return TeaModel.build(map, self);
    }

    public ListTenantMembersRequest setListQuery(ListTenantMembersRequestListQuery listQuery) {
        this.listQuery = listQuery;
        return this;
    }
    public ListTenantMembersRequestListQuery getListQuery() {
        return this.listQuery;
    }

    public ListTenantMembersRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class ListTenantMembersRequestListQuery extends TeaModel {
        /**
         * <p>The page number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Page")
        public Integer page;

        /**
         * <p>The number of entries per page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The member roles:</p>
         * <ul>
         * <li>SUPER_ADMIN: Dataphin super administrator</li>
         * <li>SYSTEM_ADMIN: system administrator</li>
         * <li>COMMON_USER: Dataphin user</li>
         * <li>DATA_ADMIN: Dataphin data administrator</li>
         * <li>EXPORT_ADMIN: export administrator</li>
         * <li>SECURITY_ADMIN: security administrator</li>
         * <li>DATASOURCE_MANAGER: data source administrator</li>
         * <li>QUALITY_MANAGER: asset quality manager</li>
         * <li>DATA_STANDARD_MANAGER: data standard administrator</li>
         * <li>LABELS_BUSINESS_PLANNER: tag business planner</li>
         * <li>BUSINESS_MEMBER: general business user</li>
         * <li>DATAPRO_OPERATE_SUPER_ADMIN: operations super administrator</li>
         * <li>DATAPRO_OPERATE_ADMIN: operations administrator</li>
         * <li>DATAPRO_OPERATE_MEMBER: operations member</li>
         * <li>DATAPRO_BUSINESS_ANALYST: business analyst</li>
         * <li>LABELS_BUSINESS_MEMBER: tag business member</li>
         * <li>DATAPRO_BUSINESS_MEMBER: DATAPRO general business user</li>
         * </ul>
         */
        @NameInMap("RoleList")
        public java.util.List<String> roleList;

        /**
         * <p>The search keyword.</p>
         * 
         * <strong>example:</strong>
         * <p>测试</p>
         */
        @NameInMap("SearchText")
        public String searchText;

        /**
         * <p>The IDs of the user groups to which the member belongs.</p>
         */
        @NameInMap("UserGroupIdList")
        public java.util.List<String> userGroupIdList;

        public static ListTenantMembersRequestListQuery build(java.util.Map<String, ?> map) throws Exception {
            ListTenantMembersRequestListQuery self = new ListTenantMembersRequestListQuery();
            return TeaModel.build(map, self);
        }

        public ListTenantMembersRequestListQuery setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public ListTenantMembersRequestListQuery setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListTenantMembersRequestListQuery setRoleList(java.util.List<String> roleList) {
            this.roleList = roleList;
            return this;
        }
        public java.util.List<String> getRoleList() {
            return this.roleList;
        }

        public ListTenantMembersRequestListQuery setSearchText(String searchText) {
            this.searchText = searchText;
            return this;
        }
        public String getSearchText() {
            return this.searchText;
        }

        public ListTenantMembersRequestListQuery setUserGroupIdList(java.util.List<String> userGroupIdList) {
            this.userGroupIdList = userGroupIdList;
            return this;
        }
        public java.util.List<String> getUserGroupIdList() {
            return this.userGroupIdList;
        }

    }

}
