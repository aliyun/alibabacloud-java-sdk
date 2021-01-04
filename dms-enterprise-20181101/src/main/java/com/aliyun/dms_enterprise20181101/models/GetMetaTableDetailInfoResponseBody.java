// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetMetaTableDetailInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DetailInfo")
    public GetMetaTableDetailInfoResponseBodyDetailInfo detailInfo;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    public static GetMetaTableDetailInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableDetailInfoResponseBody self = new GetMetaTableDetailInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMetaTableDetailInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public GetMetaTableDetailInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMetaTableDetailInfoResponseBodyDetailInfoIndexList extends TeaModel {
        @NameInMap("IndexColumns")
        public java.util.List<String> indexColumns;

        @NameInMap("IndexName")
        public String indexName;

        @NameInMap("Unique")
        public Boolean unique;

        @NameInMap("IndexType")
        public String indexType;

        @NameInMap("IndexId")
        public String indexId;

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

        public GetMetaTableDetailInfoResponseBodyDetailInfoIndexList setIndexName(String indexName) {
            this.indexName = indexName;
            return this;
        }
        public String getIndexName() {
            return this.indexName;
        }

        public GetMetaTableDetailInfoResponseBodyDetailInfoIndexList setUnique(Boolean unique) {
            this.unique = unique;
            return this;
        }
        public Boolean getUnique() {
            return this.unique;
        }

        public GetMetaTableDetailInfoResponseBodyDetailInfoIndexList setIndexType(String indexType) {
            this.indexType = indexType;
            return this;
        }
        public String getIndexType() {
            return this.indexType;
        }

        public GetMetaTableDetailInfoResponseBodyDetailInfoIndexList setIndexId(String indexId) {
            this.indexId = indexId;
            return this;
        }
        public String getIndexId() {
            return this.indexId;
        }

    }

    public static class GetMetaTableDetailInfoResponseBodyDetailInfoColumnList extends TeaModel {
        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("Description")
        public String description;

        @NameInMap("DataScale")
        public Integer dataScale;

        @NameInMap("DataPrecision")
        public Integer dataPrecision;

        @NameInMap("ColumnType")
        public String columnType;

        @NameInMap("AutoIncrement")
        public Boolean autoIncrement;

        @NameInMap("Position")
        public String position;

        @NameInMap("Nullable")
        public Boolean nullable;

        @NameInMap("ColumnId")
        public String columnId;

        @NameInMap("DataLength")
        public Integer dataLength;

        public static GetMetaTableDetailInfoResponseBodyDetailInfoColumnList build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableDetailInfoResponseBodyDetailInfoColumnList self = new GetMetaTableDetailInfoResponseBodyDetailInfoColumnList();
            return TeaModel.build(map, self);
        }

        public GetMetaTableDetailInfoResponseBodyDetailInfoColumnList setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public GetMetaTableDetailInfoResponseBodyDetailInfoColumnList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetMetaTableDetailInfoResponseBodyDetailInfoColumnList setDataScale(Integer dataScale) {
            this.dataScale = dataScale;
            return this;
        }
        public Integer getDataScale() {
            return this.dataScale;
        }

        public GetMetaTableDetailInfoResponseBodyDetailInfoColumnList setDataPrecision(Integer dataPrecision) {
            this.dataPrecision = dataPrecision;
            return this;
        }
        public Integer getDataPrecision() {
            return this.dataPrecision;
        }

        public GetMetaTableDetailInfoResponseBodyDetailInfoColumnList setColumnType(String columnType) {
            this.columnType = columnType;
            return this;
        }
        public String getColumnType() {
            return this.columnType;
        }

        public GetMetaTableDetailInfoResponseBodyDetailInfoColumnList setAutoIncrement(Boolean autoIncrement) {
            this.autoIncrement = autoIncrement;
            return this;
        }
        public Boolean getAutoIncrement() {
            return this.autoIncrement;
        }

        public GetMetaTableDetailInfoResponseBodyDetailInfoColumnList setPosition(String position) {
            this.position = position;
            return this;
        }
        public String getPosition() {
            return this.position;
        }

        public GetMetaTableDetailInfoResponseBodyDetailInfoColumnList setNullable(Boolean nullable) {
            this.nullable = nullable;
            return this;
        }
        public Boolean getNullable() {
            return this.nullable;
        }

        public GetMetaTableDetailInfoResponseBodyDetailInfoColumnList setColumnId(String columnId) {
            this.columnId = columnId;
            return this;
        }
        public String getColumnId() {
            return this.columnId;
        }

        public GetMetaTableDetailInfoResponseBodyDetailInfoColumnList setDataLength(Integer dataLength) {
            this.dataLength = dataLength;
            return this;
        }
        public Integer getDataLength() {
            return this.dataLength;
        }

    }

    public static class GetMetaTableDetailInfoResponseBodyDetailInfo extends TeaModel {
        @NameInMap("IndexList")
        public java.util.List<GetMetaTableDetailInfoResponseBodyDetailInfoIndexList> indexList;

        @NameInMap("ColumnList")
        public java.util.List<GetMetaTableDetailInfoResponseBodyDetailInfoColumnList> columnList;

        public static GetMetaTableDetailInfoResponseBodyDetailInfo build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableDetailInfoResponseBodyDetailInfo self = new GetMetaTableDetailInfoResponseBodyDetailInfo();
            return TeaModel.build(map, self);
        }

        public GetMetaTableDetailInfoResponseBodyDetailInfo setIndexList(java.util.List<GetMetaTableDetailInfoResponseBodyDetailInfoIndexList> indexList) {
            this.indexList = indexList;
            return this;
        }
        public java.util.List<GetMetaTableDetailInfoResponseBodyDetailInfoIndexList> getIndexList() {
            return this.indexList;
        }

        public GetMetaTableDetailInfoResponseBodyDetailInfo setColumnList(java.util.List<GetMetaTableDetailInfoResponseBodyDetailInfoColumnList> columnList) {
            this.columnList = columnList;
            return this;
        }
        public java.util.List<GetMetaTableDetailInfoResponseBodyDetailInfoColumnList> getColumnList() {
            return this.columnList;
        }

    }

}
