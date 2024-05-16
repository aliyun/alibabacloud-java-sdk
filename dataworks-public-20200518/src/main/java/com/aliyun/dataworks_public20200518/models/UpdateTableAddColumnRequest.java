// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateTableAddColumnRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Column")
    public java.util.List<UpdateTableAddColumnRequestColumn> column;

    /**
     * <p>The globally unique identifier (GUID) of the MaxCompute table. Specify the GUID in the odps.projectName.tableName format.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TableGuid")
    public String tableGuid;

    public static UpdateTableAddColumnRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTableAddColumnRequest self = new UpdateTableAddColumnRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTableAddColumnRequest setColumn(java.util.List<UpdateTableAddColumnRequestColumn> column) {
        this.column = column;
        return this;
    }
    public java.util.List<UpdateTableAddColumnRequestColumn> getColumn() {
        return this.column;
    }

    public UpdateTableAddColumnRequest setTableGuid(String tableGuid) {
        this.tableGuid = tableGuid;
        return this;
    }
    public String getTableGuid() {
        return this.tableGuid;
    }

    public static class UpdateTableAddColumnRequestColumn extends TeaModel {
        /**
         * <p>The name of the field.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <p>The display name of the field.</p>
         */
        @NameInMap("ColumnNameCn")
        public String columnNameCn;

        /**
         * <p>The type of the field. For more information, see MaxCompute field types.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ColumnType")
        public String columnType;

        /**
         * <p>The comment of the field.</p>
         */
        @NameInMap("Comment")
        public String comment;

        public static UpdateTableAddColumnRequestColumn build(java.util.Map<String, ?> map) throws Exception {
            UpdateTableAddColumnRequestColumn self = new UpdateTableAddColumnRequestColumn();
            return TeaModel.build(map, self);
        }

        public UpdateTableAddColumnRequestColumn setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public UpdateTableAddColumnRequestColumn setColumnNameCn(String columnNameCn) {
            this.columnNameCn = columnNameCn;
            return this;
        }
        public String getColumnNameCn() {
            return this.columnNameCn;
        }

        public UpdateTableAddColumnRequestColumn setColumnType(String columnType) {
            this.columnType = columnType;
            return this;
        }
        public String getColumnType() {
            return this.columnType;
        }

        public UpdateTableAddColumnRequestColumn setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

    }

}
