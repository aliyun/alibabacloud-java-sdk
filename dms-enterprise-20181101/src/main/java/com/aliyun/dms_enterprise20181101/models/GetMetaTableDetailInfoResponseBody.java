// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetMetaTableDetailInfoResponseBody extends TeaModel {
    /**
     * <p>The details of the table.</p>
     */
    @NameInMap("DetailInfo")
    public GetMetaTableDetailInfoResponseBodyDetailInfo detailInfo;

    /**
     * <p>The error code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E881CB2F-DE42-42E5-90EB-8B3173DCB9B9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetMetaTableDetailInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableDetailInfoResponseBody self = new GetMetaTableDetailInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMetaTableDetailInfoResponseBody setDetailInfo(GetMetaTableDetailInfoResponseBodyDetailInfo detailInfo) {
        this.detailInfo = detailInfo;
        return this;
    }
    public GetMetaTableDetailInfoResponseBodyDetailInfo getDetailInfo() {
        return this.detailInfo;
    }

    public GetMetaTableDetailInfoResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetMetaTableDetailInfoResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetMetaTableDetailInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMetaTableDetailInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMetaTableDetailInfoResponseBodyDetailInfoColumnList extends TeaModel {
        /**
         * <p>Indicates whether the column is an auto-increment column. Valid values:</p>
         * <ul>
         * <li>true: The column is an auto-increment column.</li>
         * <li>false: The column is not an auto-increment column.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoIncrement")
        public Boolean autoIncrement;

        /**
         * <p>The ID of the column.</p>
         * 
         * <strong>example:</strong>
         * <p>191234849</p>
         */
        @NameInMap("ColumnId")
        public String columnId;

        /**
         * <p>The name of the column.</p>
         * 
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <p>The data type of the column. Examples: Bigint, Int, and Varchar.</p>
         * 
         * <strong>example:</strong>
         * <p>bigint(20) unsigned</p>
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
         * <p>0</p>
         */
        @NameInMap("DataPrecision")
        public Integer dataPrecision;

        /**
         * <p>The scale of the column.</p>
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
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the column is nullable. Valid values:</p>
         * <ul>
         * <li>true: The column is nullable.</li>
         * <li>false: The column is not nullable.</li>
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
        public String position;

        public static GetMetaTableDetailInfoResponseBodyDetailInfoColumnList build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableDetailInfoResponseBodyDetailInfoColumnList self = new GetMetaTableDetailInfoResponseBodyDetailInfoColumnList();
            return TeaModel.build(map, self);
        }

        public GetMetaTableDetailInfoResponseBodyDetailInfoColumnList setAutoIncrement(Boolean autoIncrement) {
            this.autoIncrement = autoIncrement;
            return this;
        }
        public Boolean getAutoIncrement() {
            return this.autoIncrement;
        }

        public GetMetaTableDetailInfoResponseBodyDetailInfoColumnList setColumnId(String columnId) {
            this.columnId = columnId;
            return this;
        }
        public String getColumnId() {
            return this.columnId;
        }

        public GetMetaTableDetailInfoResponseBodyDetailInfoColumnList setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public GetMetaTableDetailInfoResponseBodyDetailInfoColumnList setColumnType(String columnType) {
            this.columnType = columnType;
            return this;
        }
        public String getColumnType() {
            return this.columnType;
        }

        public GetMetaTableDetailInfoResponseBodyDetailInfoColumnList setDataLength(Long dataLength) {
            this.dataLength = dataLength;
            return this;
        }
        public Long getDataLength() {
            return this.dataLength;
        }

        public GetMetaTableDetailInfoResponseBodyDetailInfoColumnList setDataPrecision(Integer dataPrecision) {
            this.dataPrecision = dataPrecision;
            return this;
        }
        public Integer getDataPrecision() {
            return this.dataPrecision;
        }

        public GetMetaTableDetailInfoResponseBodyDetailInfoColumnList setDataScale(Integer dataScale) {
            this.dataScale = dataScale;
            return this;
        }
        public Integer getDataScale() {
            return this.dataScale;
        }

        public GetMetaTableDetailInfoResponseBodyDetailInfoColumnList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetMetaTableDetailInfoResponseBodyDetailInfoColumnList setNullable(Boolean nullable) {
            this.nullable = nullable;
            return this;
        }
        public Boolean getNullable() {
            return this.nullable;
        }

        public GetMetaTableDetailInfoResponseBodyDetailInfoColumnList setPosition(String position) {
            this.position = position;
            return this;
        }
        public String getPosition() {
            return this.position;
        }

    }

    public static class GetMetaTableDetailInfoResponseBodyDetailInfoIndexList extends TeaModel {
        /**
         * <p>The index column.</p>
         */
        @NameInMap("IndexColumns")
        public java.util.List<String> indexColumns;

        /**
         * <p>The ID of the index.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("IndexId")
        public String indexId;

        /**
         * <p>The name of the index.</p>
         * 
         * <strong>example:</strong>
         * <p>PRIMARY</p>
         */
        @NameInMap("IndexName")
        public String indexName;

        /**
         * <p>The type of the index. Examples: Primary, Unique, and Normal.</p>
         * 
         * <strong>example:</strong>
         * <p>Primary</p>
         */
        @NameInMap("IndexType")
        public String indexType;

        /**
         * <p>Indicates whether the index is unique. Valid values:</p>
         * <ul>
         * <li>true: The index is unique.</li>
         * <li>false: The index is not unique.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Unique")
        public Boolean unique;

        public static GetMetaTableDetailInfoResponseBodyDetailInfoIndexList build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableDetailInfoResponseBodyDetailInfoIndexList self = new GetMetaTableDetailInfoResponseBodyDetailInfoIndexList();
            return TeaModel.build(map, self);
        }

        public GetMetaTableDetailInfoResponseBodyDetailInfoIndexList setIndexColumns(java.util.List<String> indexColumns) {
            this.indexColumns = indexColumns;
            return this;
        }
        public java.util.List<String> getIndexColumns() {
            return this.indexColumns;
        }

        public GetMetaTableDetailInfoResponseBodyDetailInfoIndexList setIndexId(String indexId) {
            this.indexId = indexId;
            return this;
        }
        public String getIndexId() {
            return this.indexId;
        }

        public GetMetaTableDetailInfoResponseBodyDetailInfoIndexList setIndexName(String indexName) {
            this.indexName = indexName;
            return this;
        }
        public String getIndexName() {
            return this.indexName;
        }

        public GetMetaTableDetailInfoResponseBodyDetailInfoIndexList setIndexType(String indexType) {
            this.indexType = indexType;
            return this;
        }
        public String getIndexType() {
            return this.indexType;
        }

        public GetMetaTableDetailInfoResponseBodyDetailInfoIndexList setUnique(Boolean unique) {
            this.unique = unique;
            return this;
        }
        public Boolean getUnique() {
            return this.unique;
        }

    }

    public static class GetMetaTableDetailInfoResponseBodyDetailInfo extends TeaModel {
        /**
         * <p>The columns in the table.</p>
         */
        @NameInMap("ColumnList")
        public java.util.List<GetMetaTableDetailInfoResponseBodyDetailInfoColumnList> columnList;

        /**
         * <p>The list of indexes.</p>
         */
        @NameInMap("IndexList")
        public java.util.List<GetMetaTableDetailInfoResponseBodyDetailInfoIndexList> indexList;

        public static GetMetaTableDetailInfoResponseBodyDetailInfo build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableDetailInfoResponseBodyDetailInfo self = new GetMetaTableDetailInfoResponseBodyDetailInfo();
            return TeaModel.build(map, self);
        }

        public GetMetaTableDetailInfoResponseBodyDetailInfo setColumnList(java.util.List<GetMetaTableDetailInfoResponseBodyDetailInfoColumnList> columnList) {
            this.columnList = columnList;
            return this;
        }
        public java.util.List<GetMetaTableDetailInfoResponseBodyDetailInfoColumnList> getColumnList() {
            return this.columnList;
        }

        public GetMetaTableDetailInfoResponseBodyDetailInfo setIndexList(java.util.List<GetMetaTableDetailInfoResponseBodyDetailInfoIndexList> indexList) {
            this.indexList = indexList;
            return this;
        }
        public java.util.List<GetMetaTableDetailInfoResponseBodyDetailInfoIndexList> getIndexList() {
            return this.indexList;
        }

    }

}
