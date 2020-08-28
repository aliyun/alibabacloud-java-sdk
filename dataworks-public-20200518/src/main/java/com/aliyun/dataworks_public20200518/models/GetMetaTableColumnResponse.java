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

        public static GetMetaTableColumnResponseDataColumnList build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableColumnResponseDataColumnList self = new GetMetaTableColumnResponseDataColumnList();
            return TeaModel.build(map, self);
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

    }

}
