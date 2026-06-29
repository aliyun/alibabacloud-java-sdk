// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListTablesRequest extends TeaModel {
    /**
     * <p>The paged query conditions.</p>
     */
    @NameInMap("ListQuery")
    public ListTablesRequestListQuery listQuery;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static ListTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTablesRequest self = new ListTablesRequest();
        return TeaModel.build(map, self);
    }

    public ListTablesRequest setListQuery(ListTablesRequestListQuery listQuery) {
        this.listQuery = listQuery;
        return this;
    }
    public ListTablesRequestListQuery getListQuery() {
        return this.listQuery;
    }

    public ListTablesRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class ListTablesRequestListQuery extends TeaModel {
        /**
         * <p>The asset catalog, such as the project name or business unit name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LD_test01_dev</p>
         */
        @NameInMap("Catalog")
        public String catalog;

        /**
         * <p>The keyword for searching. Table names are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Keyword")
        public String keyword;

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Integer pageNo;

        /**
         * <p>The number of records per page. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        public static ListTablesRequestListQuery build(java.util.Map<String, ?> map) throws Exception {
            ListTablesRequestListQuery self = new ListTablesRequestListQuery();
            return TeaModel.build(map, self);
        }

        public ListTablesRequestListQuery setCatalog(String catalog) {
            this.catalog = catalog;
            return this;
        }
        public String getCatalog() {
            return this.catalog;
        }

        public ListTablesRequestListQuery setKeyword(String keyword) {
            this.keyword = keyword;
            return this;
        }
        public String getKeyword() {
            return this.keyword;
        }

        public ListTablesRequestListQuery setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public ListTablesRequestListQuery setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

}
