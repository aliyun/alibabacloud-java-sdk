// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListAddableUsersRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListQuery")
    public ListAddableUsersRequestListQuery listQuery;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static ListAddableUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAddableUsersRequest self = new ListAddableUsersRequest();
        return TeaModel.build(map, self);
    }

    public ListAddableUsersRequest setListQuery(ListAddableUsersRequestListQuery listQuery) {
        this.listQuery = listQuery;
        return this;
    }
    public ListAddableUsersRequestListQuery getListQuery() {
        return this.listQuery;
    }

    public ListAddableUsersRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class ListAddableUsersRequestListQuery extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Page")
        public Integer page;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("SearchText")
        public String searchText;

        public static ListAddableUsersRequestListQuery build(java.util.Map<String, ?> map) throws Exception {
            ListAddableUsersRequestListQuery self = new ListAddableUsersRequestListQuery();
            return TeaModel.build(map, self);
        }

        public ListAddableUsersRequestListQuery setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public ListAddableUsersRequestListQuery setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListAddableUsersRequestListQuery setSearchText(String searchText) {
            this.searchText = searchText;
            return this;
        }
        public String getSearchText() {
            return this.searchText;
        }

    }

}
