// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableColumnResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public GetMetaTableColumnResponseData data;

    public static GetMetaTableColumnResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableColumnResponse self = new GetMetaTableColumnResponse();
        return TeaModel.build(map, self);
    }

    public GetMetaTableColumnResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMetaTableColumnResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetMetaTableColumnResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetMetaTableColumnResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetMetaTableColumnResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetMetaTableColumnResponse setData(GetMetaTableColumnResponseData data) {
        this.data = data;
        return this;
    }
    public GetMetaTableColumnResponseData getData() {
        return this.data;
    }

    public static class GetMetaTableColumnResponseDataColumnList extends TeaModel {
        @NameInMap("ColumnName")
        @Validation(required = true)
        public String columnName;

        @NameInMap("ColumnGuid")
        @Validation(required = true)
        public String columnGuid;

        @NameInMap("Comment")
        @Validation(required = true)
        public String comment;

        @NameInMap("IsPrimaryKey")
        @Validation(required = true)
        public Boolean isPrimaryKey;

        @NameInMap("ColumnType")
        @Validation(required = true)
        public String columnType;

        @NameInMap("IsPartitionColumn")
        @Validation(required = true)
        public Boolean isPartitionColumn;

        @NameInMap("IsForeignKey")
        @Validation(required = true)
        public Boolean isForeignKey;

        @NameInMap("Caption")
        @Validation(required = true)
        public String caption;

        @NameInMap("Position")
        @Validation(required = true)
        public Integer position;

        public static GetMetaTableColumnResponseDataColumnList build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableColumnResponseDataColumnList self = new GetMetaTableColumnResponseDataColumnList();
            return TeaModel.build(map, self);
        }

        public GetMetaTableColumnResponseDataColumnList setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public GetMetaTableColumnResponseDataColumnList setColumnGuid(String columnGuid) {
            this.columnGuid = columnGuid;
            return this;
        }
        public String getColumnGuid() {
            return this.columnGuid;
        }

        public GetMetaTableColumnResponseDataColumnList setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetMetaTableColumnResponseDataColumnList setIsPrimaryKey(Boolean isPrimaryKey) {
            this.isPrimaryKey = isPrimaryKey;
            return this;
        }
        public Boolean getIsPrimaryKey() {
            return this.isPrimaryKey;
        }

        public GetMetaTableColumnResponseDataColumnList setColumnType(String columnType) {
            this.columnType = columnType;
            return this;
        }
        public String getColumnType() {
            return this.columnType;
        }

        public GetMetaTableColumnResponseDataColumnList setIsPartitionColumn(Boolean isPartitionColumn) {
            this.isPartitionColumn = isPartitionColumn;
            return this;
        }
        public Boolean getIsPartitionColumn() {
            return this.isPartitionColumn;
        }

        public GetMetaTableColumnResponseDataColumnList setIsForeignKey(Boolean isForeignKey) {
            this.isForeignKey = isForeignKey;
            return this;
        }
        public Boolean getIsForeignKey() {
            return this.isForeignKey;
        }

        public GetMetaTableColumnResponseDataColumnList setCaption(String caption) {
            this.caption = caption;
            return this;
        }
        public String getCaption() {
            return this.caption;
        }

        public GetMetaTableColumnResponseDataColumnList setPosition(Integer position) {
            this.position = position;
            return this;
        }
        public Integer getPosition() {
            return this.position;
        }

    }

    public static class GetMetaTableColumnResponseData extends TeaModel {
        @NameInMap("TotalCount")
        @Validation(required = true)
        public Long totalCount;

        @NameInMap("PageNum")
        @Validation(required = true)
        public Integer pageNum;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("ColumnList")
        @Validation(required = true)
        public java.util.List<GetMetaTableColumnResponseDataColumnList> columnList;

        public static GetMetaTableColumnResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableColumnResponseData self = new GetMetaTableColumnResponseData();
            return TeaModel.build(map, self);
        }

        public GetMetaTableColumnResponseData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public GetMetaTableColumnResponseData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public GetMetaTableColumnResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetMetaTableColumnResponseData setColumnList(java.util.List<GetMetaTableColumnResponseDataColumnList> columnList) {
            this.columnList = columnList;
            return this;
        }
        public java.util.List<GetMetaTableColumnResponseDataColumnList> getColumnList() {
            return this.columnList;
        }

    }

}
