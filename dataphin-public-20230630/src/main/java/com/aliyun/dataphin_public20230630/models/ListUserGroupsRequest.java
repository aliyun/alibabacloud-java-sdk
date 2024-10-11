// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListUserGroupsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListQuery")
    public ListUserGroupsRequestListQuery listQuery;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static ListUserGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserGroupsRequest self = new ListUserGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListUserGroupsRequest setListQuery(ListUserGroupsRequestListQuery listQuery) {
        this.listQuery = listQuery;
        return this;
    }
    public ListUserGroupsRequestListQuery getListQuery() {
        return this.listQuery;
    }

    public ListUserGroupsRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class ListUserGroupsRequestListQuery extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Active")
        public Boolean active;

        @NameInMap("AdminIdList")
        public java.util.List<String> adminIdList;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("FilterMine")
        public Boolean filterMine;

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

        public static ListUserGroupsRequestListQuery build(java.util.Map<String, ?> map) throws Exception {
            ListUserGroupsRequestListQuery self = new ListUserGroupsRequestListQuery();
            return TeaModel.build(map, self);
        }

        public ListUserGroupsRequestListQuery setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public ListUserGroupsRequestListQuery setAdminIdList(java.util.List<String> adminIdList) {
            this.adminIdList = adminIdList;
            return this;
        }
        public java.util.List<String> getAdminIdList() {
            return this.adminIdList;
        }

        public ListUserGroupsRequestListQuery setFilterMine(Boolean filterMine) {
            this.filterMine = filterMine;
            return this;
        }
        public Boolean getFilterMine() {
            return this.filterMine;
        }

        public ListUserGroupsRequestListQuery setKeyword(String keyword) {
            this.keyword = keyword;
            return this;
        }
        public String getKeyword() {
            return this.keyword;
        }

        public ListUserGroupsRequestListQuery setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public ListUserGroupsRequestListQuery setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

}
