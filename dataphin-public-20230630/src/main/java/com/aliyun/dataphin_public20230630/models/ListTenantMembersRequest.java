// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListTenantMembersRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListQuery")
    public ListTenantMembersRequestListQuery listQuery;

    /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Page")
        public Integer page;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("RoleList")
        public java.util.List<String> roleList;

        @NameInMap("SearchText")
        public String searchText;

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
