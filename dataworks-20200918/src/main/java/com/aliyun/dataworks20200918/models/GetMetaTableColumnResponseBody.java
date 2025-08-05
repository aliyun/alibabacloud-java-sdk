// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class GetMetaTableColumnResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetMetaTableColumnResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

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

    public GetMetaTableColumnResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMetaTableColumnResponseBodyDataColumnList extends TeaModel {
        @NameInMap("Caption")
        public String caption;

        @NameInMap("ColumnGuid")
        public String columnGuid;

        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("ColumnType")
        public String columnType;

        @NameInMap("Comment")
        public String comment;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("IsForeignKey")
        public Boolean isForeignKey;

        @NameInMap("IsPartitionColumn")
        public Boolean isPartitionColumn;

        @NameInMap("IsPrimaryKey")
        public Boolean isPrimaryKey;

        @NameInMap("Position")
        public Integer position;

        @NameInMap("RelationCount")
        public String relationCount;

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

        public GetMetaTableColumnResponseBodyDataColumnList setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
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

        public GetMetaTableColumnResponseBodyDataColumnList setRelationCount(String relationCount) {
            this.relationCount = relationCount;
            return this;
        }
        public String getRelationCount() {
            return this.relationCount;
        }

    }

    public static class GetMetaTableColumnResponseBodyData extends TeaModel {
        @NameInMap("ColumnList")
        public java.util.List<GetMetaTableColumnResponseBodyDataColumnList> columnList;

        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

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
