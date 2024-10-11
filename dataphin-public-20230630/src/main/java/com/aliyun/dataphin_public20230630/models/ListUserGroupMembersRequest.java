// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListUserGroupMembersRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListQuery")
    public ListUserGroupMembersRequestListQuery listQuery;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static ListUserGroupMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserGroupMembersRequest self = new ListUserGroupMembersRequest();
        return TeaModel.build(map, self);
    }

    public ListUserGroupMembersRequest setListQuery(ListUserGroupMembersRequestListQuery listQuery) {
        this.listQuery = listQuery;
        return this;
    }
    public ListUserGroupMembersRequestListQuery getListQuery() {
        return this.listQuery;
    }

    public ListUserGroupMembersRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class ListUserGroupMembersRequestListQuery extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>a</p>
         */
        @NameInMap("Keyword")
        public String keyword;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Integer pageNo;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>232231</p>
         */
        @NameInMap("UserGroupId")
        public String userGroupId;

        @NameInMap("UserIdList")
        public java.util.List<String> userIdList;

        public static ListUserGroupMembersRequestListQuery build(java.util.Map<String, ?> map) throws Exception {
            ListUserGroupMembersRequestListQuery self = new ListUserGroupMembersRequestListQuery();
            return TeaModel.build(map, self);
        }

        public ListUserGroupMembersRequestListQuery setKeyword(String keyword) {
            this.keyword = keyword;
            return this;
        }
        public String getKeyword() {
            return this.keyword;
        }

        public ListUserGroupMembersRequestListQuery setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public ListUserGroupMembersRequestListQuery setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListUserGroupMembersRequestListQuery setUserGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public String getUserGroupId() {
            return this.userGroupId;
        }

        public ListUserGroupMembersRequestListQuery setUserIdList(java.util.List<String> userIdList) {
            this.userIdList = userIdList;
            return this;
        }
        public java.util.List<String> getUserIdList() {
            return this.userIdList;
        }

    }

}
