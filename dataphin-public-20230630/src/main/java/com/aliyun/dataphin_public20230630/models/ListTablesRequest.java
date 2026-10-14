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

    /**
     * <p>The ID of the operator.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

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

    public ListTablesRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public static class ListTablesRequestListQuery extends TeaModel {
        /**
         * <p>The asset catalog: project name and business unit name.</p>
         * 
         * <strong>example:</strong>
         * <p>LD_test01_dev</p>
         */
        @NameInMap("Catalog")
        public String catalog;

        /**
         * <p>The supported keyword: table name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Keyword")
        public String keyword;

        /**
         * <p>The ID of the owner.</p>
         * 
         * <strong>example:</strong>
         * <p>30012011</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Integer pageNo;

        /**
         * <p>The number of entries per page. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The table types. If you do not specify this parameter or pass an empty list, all table types are queried. Valid values:</p>
         * <ul>
         * <li>PHYSICAL_TABLE: Physical table of the compute source.</li>
         * <li>PHYSICAL_VIEW: View of the compute source.</li>
         * <li>PHYSICAL_MATERIALIZED_VIEW: Materialized view of the compute source.</li>
         * <li>STREAM_TABLE: Meta table.</li>
         * <li>MIRROR_TABLE: Mirror table.</li>
         * <li>DIM: Logical dimension table.</li>
         * <li>FACT: Logical fact table.</li>
         * <li>SUM_BIZ_UNIT: Logical aggregate table.</li>
         * <li>LOGIC_VIEW: Logical view.</li>
         * <li>DATASOURCE_TABLE: Data source table.</li>
         * <li>DATASOURCE_VIEW: Data source view.</li>
         * <li>DATASOURCE_MATERIALIZED_VIEW: Data source materialized view.</li>
         * </ul>
         */
        @NameInMap("SubTypes")
        public java.util.List<String> subTypes;

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

        public ListTablesRequestListQuery setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
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

        public ListTablesRequestListQuery setSubTypes(java.util.List<String> subTypes) {
            this.subTypes = subTypes;
            return this;
        }
        public java.util.List<String> getSubTypes() {
            return this.subTypes;
        }

    }

}
