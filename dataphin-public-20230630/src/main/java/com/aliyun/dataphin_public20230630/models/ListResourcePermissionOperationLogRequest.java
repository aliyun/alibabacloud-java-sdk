// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListResourcePermissionOperationLogRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListQuery")
    public ListResourcePermissionOperationLogRequestListQuery listQuery;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static ListResourcePermissionOperationLogRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourcePermissionOperationLogRequest self = new ListResourcePermissionOperationLogRequest();
        return TeaModel.build(map, self);
    }

    public ListResourcePermissionOperationLogRequest setListQuery(ListResourcePermissionOperationLogRequestListQuery listQuery) {
        this.listQuery = listQuery;
        return this;
    }
    public ListResourcePermissionOperationLogRequestListQuery getListQuery() {
        return this.listQuery;
    }

    public ListResourcePermissionOperationLogRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class ListResourcePermissionOperationLogRequestListQuery extends TeaModel {
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
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>xx测试</p>
         */
        @NameInMap("SearchText")
        public String searchText;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TABLE</p>
         */
        @NameInMap("TabType")
        public String tabType;

        public static ListResourcePermissionOperationLogRequestListQuery build(java.util.Map<String, ?> map) throws Exception {
            ListResourcePermissionOperationLogRequestListQuery self = new ListResourcePermissionOperationLogRequestListQuery();
            return TeaModel.build(map, self);
        }

        public ListResourcePermissionOperationLogRequestListQuery setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public ListResourcePermissionOperationLogRequestListQuery setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListResourcePermissionOperationLogRequestListQuery setSearchText(String searchText) {
            this.searchText = searchText;
            return this;
        }
        public String getSearchText() {
            return this.searchText;
        }

        public ListResourcePermissionOperationLogRequestListQuery setTabType(String tabType) {
            this.tabType = tabType;
            return this;
        }
        public String getTabType() {
            return this.tabType;
        }

    }

}
