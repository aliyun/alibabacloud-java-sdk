// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetMetaTableColumnResponseBody extends TeaModel {
    /**
     * <p>The details about fields in the table.</p>
     */
    @NameInMap("ColumnList")
    public java.util.List<GetMetaTableColumnResponseBodyColumnList> columnList;

    /**
     * <p>The error code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>MissingTableGuid</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>TableGuid is mandatory for this action.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>087DFBA1-378B-5D25-B13B-31F6409F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetMetaTableColumnResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableColumnResponseBody self = new GetMetaTableColumnResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMetaTableColumnResponseBody setColumnList(java.util.List<GetMetaTableColumnResponseBodyColumnList> columnList) {
        this.columnList = columnList;
        return this;
    }
    public java.util.List<GetMetaTableColumnResponseBodyColumnList> getColumnList() {
        return this.columnList;
    }

    public GetMetaTableColumnResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetMetaTableColumnResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetMetaTableColumnResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMetaTableColumnResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMetaTableColumnResponseBodyColumnList extends TeaModel {
        /**
         * <p>Indicates whether the column is an auto-increment column. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The column is an auto-increment column.</li>
         * <li><strong>false</strong>: The column is not an auto-increment column.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AutoIncrement")
        public Boolean autoIncrement;

        /**
         * <p>The ID of the column.</p>
         * 
         * <strong>example:</strong>
         * <p>63513****</p>
         */
        @NameInMap("ColumnId")
        public String columnId;

        /**
         * <p>The name of the column.</p>
         * 
         * <strong>example:</strong>
         * <p>has_promotion</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <p>The data type of the column.</p>
         * <blockquote>
         * <p>The return value of a column is not unique, such as <strong>bigint</strong> or <strong>int</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>bigint(1)</p>
         */
        @NameInMap("ColumnType")
        public String columnType;

        /**
         * <p>The length of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DataLength")
        public Long dataLength;

        /**
         * <p>The precision of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>19</p>
         */
        @NameInMap("DataPrecision")
        public Integer dataPrecision;

        /**
         * <p>The number of decimal places for the field.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DataScale")
        public Integer dataScale;

        /**
         * <p>The description of the column.</p>
         * 
         * <strong>example:</strong>
         * <p>Whether discounts are provided</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the field can be empty. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The field can be empty.</li>
         * <li><strong>false</strong>: The field cannot be empty.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Nullable")
        public Boolean nullable;

        /**
         * <p>The position of the field in the table.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Position")
        public Integer position;

        /**
         * <p>Indicates whether the field is the primary key. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The field is the primary key.</li>
         * <li><strong>false</strong>: The field is not the primary key.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("PrimaryKey")
        public String primaryKey;

        /**
         * <p>The sensitivity level of the column. Valid values:</p>
         * <ul>
         * <li><strong>INNER</strong>: The column is not sensitive.</li>
         * <li><strong>SENSITIVE</strong>: The column is sensitive.</li>
         * <li><strong>CONFIDENTIAL</strong>: The column is confidential.</li>
         * </ul>
         * <blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/66091.html">Sensitivity levels of columns</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>INNER</p>
         */
        @NameInMap("SecurityLevel")
        public String securityLevel;

        public static GetMetaTableColumnResponseBodyColumnList build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableColumnResponseBodyColumnList self = new GetMetaTableColumnResponseBodyColumnList();
            return TeaModel.build(map, self);
        }

        public GetMetaTableColumnResponseBodyColumnList setAutoIncrement(Boolean autoIncrement) {
            this.autoIncrement = autoIncrement;
            return this;
        }
        public Boolean getAutoIncrement() {
            return this.autoIncrement;
        }

        public GetMetaTableColumnResponseBodyColumnList setColumnId(String columnId) {
            this.columnId = columnId;
            return this;
        }
        public String getColumnId() {
            return this.columnId;
        }

        public GetMetaTableColumnResponseBodyColumnList setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public GetMetaTableColumnResponseBodyColumnList setColumnType(String columnType) {
            this.columnType = columnType;
            return this;
        }
        public String getColumnType() {
            return this.columnType;
        }

        public GetMetaTableColumnResponseBodyColumnList setDataLength(Long dataLength) {
            this.dataLength = dataLength;
            return this;
        }
        public Long getDataLength() {
            return this.dataLength;
        }

        public GetMetaTableColumnResponseBodyColumnList setDataPrecision(Integer dataPrecision) {
            this.dataPrecision = dataPrecision;
            return this;
        }
        public Integer getDataPrecision() {
            return this.dataPrecision;
        }

        public GetMetaTableColumnResponseBodyColumnList setDataScale(Integer dataScale) {
            this.dataScale = dataScale;
            return this;
        }
        public Integer getDataScale() {
            return this.dataScale;
        }

        public GetMetaTableColumnResponseBodyColumnList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetMetaTableColumnResponseBodyColumnList setNullable(Boolean nullable) {
            this.nullable = nullable;
            return this;
        }
        public Boolean getNullable() {
            return this.nullable;
        }

        public GetMetaTableColumnResponseBodyColumnList setPosition(Integer position) {
            this.position = position;
            return this;
        }
        public Integer getPosition() {
            return this.position;
        }

        public GetMetaTableColumnResponseBodyColumnList setPrimaryKey(String primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public String getPrimaryKey() {
            return this.primaryKey;
        }

        public GetMetaTableColumnResponseBodyColumnList setSecurityLevel(String securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public String getSecurityLevel() {
            return this.securityLevel;
        }

    }

}
