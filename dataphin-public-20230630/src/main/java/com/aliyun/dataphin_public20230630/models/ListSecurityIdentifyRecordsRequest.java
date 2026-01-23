// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListSecurityIdentifyRecordsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListQuery")
    public ListSecurityIdentifyRecordsRequestListQuery listQuery;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static ListSecurityIdentifyRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSecurityIdentifyRecordsRequest self = new ListSecurityIdentifyRecordsRequest();
        return TeaModel.build(map, self);
    }

    public ListSecurityIdentifyRecordsRequest setListQuery(ListSecurityIdentifyRecordsRequestListQuery listQuery) {
        this.listQuery = listQuery;
        return this;
    }
    public ListSecurityIdentifyRecordsRequestListQuery getListQuery() {
        return this.listQuery;
    }

    public ListSecurityIdentifyRecordsRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class ListSecurityIdentifyRecordsRequestListQuery extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("DatasourceEnv")
        public String datasourceEnv;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DatasourceName")
        public String datasourceName;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>col1</p>
         */
        @NameInMap("FieldName")
        public String fieldName;

        @NameInMap("IsDatasourceTable")
        public Boolean isDatasourceTable;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Keyword")
        public String keyword;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Integer pageNo;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TableCatalog")
        public String tableCatalog;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>t_test</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static ListSecurityIdentifyRecordsRequestListQuery build(java.util.Map<String, ?> map) throws Exception {
            ListSecurityIdentifyRecordsRequestListQuery self = new ListSecurityIdentifyRecordsRequestListQuery();
            return TeaModel.build(map, self);
        }

        public ListSecurityIdentifyRecordsRequestListQuery setDatasourceEnv(String datasourceEnv) {
            this.datasourceEnv = datasourceEnv;
            return this;
        }
        public String getDatasourceEnv() {
            return this.datasourceEnv;
        }

        public ListSecurityIdentifyRecordsRequestListQuery setDatasourceName(String datasourceName) {
            this.datasourceName = datasourceName;
            return this;
        }
        public String getDatasourceName() {
            return this.datasourceName;
        }

        public ListSecurityIdentifyRecordsRequestListQuery setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

        public ListSecurityIdentifyRecordsRequestListQuery setIsDatasourceTable(Boolean isDatasourceTable) {
            this.isDatasourceTable = isDatasourceTable;
            return this;
        }
        public Boolean getIsDatasourceTable() {
            return this.isDatasourceTable;
        }

        public ListSecurityIdentifyRecordsRequestListQuery setKeyword(String keyword) {
            this.keyword = keyword;
            return this;
        }
        public String getKeyword() {
            return this.keyword;
        }

        public ListSecurityIdentifyRecordsRequestListQuery setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public ListSecurityIdentifyRecordsRequestListQuery setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListSecurityIdentifyRecordsRequestListQuery setTableCatalog(String tableCatalog) {
            this.tableCatalog = tableCatalog;
            return this;
        }
        public String getTableCatalog() {
            return this.tableCatalog;
        }

        public ListSecurityIdentifyRecordsRequestListQuery setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

}
