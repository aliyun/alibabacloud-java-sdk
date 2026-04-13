// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class AddTableRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>connector-d51861492df64257</p>
     */
    @NameInMap("ConnectorId")
    public String connectorId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TableColumns")
    public java.util.List<AddTableRequestTableColumns> tableColumns;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ads_wjjr_basc_enterprise_di</p>
     */
    @NameInMap("TableName")
    public String tableName;

    public static AddTableRequest build(java.util.Map<String, ?> map) throws Exception {
        AddTableRequest self = new AddTableRequest();
        return TeaModel.build(map, self);
    }

    public AddTableRequest setConnectorId(String connectorId) {
        this.connectorId = connectorId;
        return this;
    }
    public String getConnectorId() {
        return this.connectorId;
    }

    public AddTableRequest setTableColumns(java.util.List<AddTableRequestTableColumns> tableColumns) {
        this.tableColumns = tableColumns;
        return this;
    }
    public java.util.List<AddTableRequestTableColumns> getTableColumns() {
        return this.tableColumns;
    }

    public AddTableRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public static class AddTableRequestTableColumns extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>desc</p>
         */
        @NameInMap("ColumnDesc")
        public String columnDesc;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>column1</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("DataType")
        public String dataType;

        public static AddTableRequestTableColumns build(java.util.Map<String, ?> map) throws Exception {
            AddTableRequestTableColumns self = new AddTableRequestTableColumns();
            return TeaModel.build(map, self);
        }

        public AddTableRequestTableColumns setColumnDesc(String columnDesc) {
            this.columnDesc = columnDesc;
            return this;
        }
        public String getColumnDesc() {
            return this.columnDesc;
        }

        public AddTableRequestTableColumns setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public AddTableRequestTableColumns setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

    }

}
