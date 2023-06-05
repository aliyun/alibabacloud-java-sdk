// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableColumnResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned per page. Default value: 10. Maximum value: 100.</p>
     */
    @NameInMap("Data")
    public GetMetaTableColumnResponseBodyData data;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request. You can locate logs and troubleshoot issues based on the ID.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error code.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The business data.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetMetaTableColumnResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableColumnResponseBody self = new GetMetaTableColumnResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMetaTableColumnResponseBody setData(GetMetaTableColumnResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMetaTableColumnResponseBodyData getData() {
        return this.data;
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

    public GetMetaTableColumnResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    public static class GetMetaTableColumnResponseBodyDataColumnList extends TeaModel {
        /**
         * <p>The number of times the field is read.</p>
         */
        @NameInMap("Caption")
        public String caption;

        /**
         * <p>Indicates whether the field is a partition field. Valid values:</p>
         * <br>
         * <p>*   true: The field is a partition field.</p>
         * <p>*   false: The field is not a partition field.</p>
         */
        @NameInMap("ColumnGuid")
        public String columnGuid;

        /**
         * <p>The remarks of the field.</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <p>The ordinal number of the field.</p>
         */
        @NameInMap("ColumnType")
        public String columnType;

        /**
         * <p>Indicates whether the field is the primary key. Valid values:</p>
         * <br>
         * <p>*   true: The field is the primary key.</p>
         * <p>*   false: The field is not the primary key.</p>
         */
        @NameInMap("Comment")
        public String comment;

        @NameInMap("IsForeignKey")
        public Boolean isForeignKey;

        /**
         * <p>The data type of the field.</p>
         */
        @NameInMap("IsPartitionColumn")
        public Boolean isPartitionColumn;

        /**
         * <p>The description of the field.</p>
         */
        @NameInMap("IsPrimaryKey")
        public Boolean isPrimaryKey;

        /**
         * <p>Indicates whether the field is a foreign key. Valid values:</p>
         * <br>
         * <p>*   true: The field is a foreign key.</p>
         * <p>*   false: The field is not a foreign key.</p>
         */
        @NameInMap("Position")
        public Integer position;

        @NameInMap("RelationCount")
        public Long relationCount;

        public static GetMetaTableColumnResponseBodyDataColumnList build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableColumnResponseBodyDataColumnList self = new GetMetaTableColumnResponseBodyDataColumnList();
            return TeaModel.build(map, self);
        }

        public GetMetaTableColumnResponseBodyDataColumnList setCaption(String caption) {
            this.caption = caption;
            return this;
        }
        public String getCaption() {
            return this.caption;
        }

        public GetMetaTableColumnResponseBodyDataColumnList setColumnGuid(String columnGuid) {
            this.columnGuid = columnGuid;
            return this;
        }
        public String getColumnGuid() {
            return this.columnGuid;
        }

        public GetMetaTableColumnResponseBodyDataColumnList setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public GetMetaTableColumnResponseBodyDataColumnList setColumnType(String columnType) {
            this.columnType = columnType;
            return this;
        }
        public String getColumnType() {
            return this.columnType;
        }

        public GetMetaTableColumnResponseBodyDataColumnList setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetMetaTableColumnResponseBodyDataColumnList setIsForeignKey(Boolean isForeignKey) {
            this.isForeignKey = isForeignKey;
            return this;
        }
        public Boolean getIsForeignKey() {
            return this.isForeignKey;
        }

        public GetMetaTableColumnResponseBodyDataColumnList setIsPartitionColumn(Boolean isPartitionColumn) {
            this.isPartitionColumn = isPartitionColumn;
            return this;
        }
        public Boolean getIsPartitionColumn() {
            return this.isPartitionColumn;
        }

        public GetMetaTableColumnResponseBodyDataColumnList setIsPrimaryKey(Boolean isPrimaryKey) {
            this.isPrimaryKey = isPrimaryKey;
            return this;
        }
        public Boolean getIsPrimaryKey() {
            return this.isPrimaryKey;
        }

        public GetMetaTableColumnResponseBodyDataColumnList setPosition(Integer position) {
            this.position = position;
            return this;
        }
        public Integer getPosition() {
            return this.position;
        }

        public GetMetaTableColumnResponseBodyDataColumnList setRelationCount(Long relationCount) {
            this.relationCount = relationCount;
            return this;
        }
        public Long getRelationCount() {
            return this.relationCount;
        }

    }

    public static class GetMetaTableColumnResponseBodyData extends TeaModel {
        /**
         * <p>The name of the field.</p>
         */
        @NameInMap("ColumnList")
        public java.util.List<GetMetaTableColumnResponseBodyDataColumnList> columnList;

        /**
         * <p>The total number of fields.</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <p>The information of fields.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The GUID of the field.</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static GetMetaTableColumnResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableColumnResponseBodyData self = new GetMetaTableColumnResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMetaTableColumnResponseBodyData setColumnList(java.util.List<GetMetaTableColumnResponseBodyDataColumnList> columnList) {
            this.columnList = columnList;
            return this;
        }
        public java.util.List<GetMetaTableColumnResponseBodyDataColumnList> getColumnList() {
            return this.columnList;
        }

        public GetMetaTableColumnResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public GetMetaTableColumnResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetMetaTableColumnResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
