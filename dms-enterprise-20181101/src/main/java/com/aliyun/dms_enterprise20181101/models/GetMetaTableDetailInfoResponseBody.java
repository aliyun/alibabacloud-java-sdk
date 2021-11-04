// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetMetaTableDetailInfoResponseBody extends TeaModel {
    @NameInMap("DetailInfo")
    public GetMetaTableDetailInfoResponseBodyDetailInfo detailInfo;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AutoIncrement")
        public Boolean autoIncrement;

        @NameInMap("ColumnId")
        public String columnId;

        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("ColumnType")
        public String columnType;

        @NameInMap("DataLength")
        public Long dataLength;

        @NameInMap("DataPrecision")
        public Integer dataPrecision;

        @NameInMap("DataScale")
        public Integer dataScale;

        @NameInMap("Description")
        public String description;

        @NameInMap("Nullable")
        public Boolean nullable;

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
        @NameInMap("IndexColumns")
        public java.util.List<String> indexColumns;

        @NameInMap("IndexId")
        public String indexId;

        @NameInMap("IndexName")
        public String indexName;

        @NameInMap("IndexType")
        public String indexType;

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
        @NameInMap("ColumnList")
        public java.util.List<GetMetaTableDetailInfoResponseBodyDetailInfoColumnList> columnList;

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
