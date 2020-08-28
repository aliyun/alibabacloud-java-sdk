// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableFullInfoResponse extends TeaModel {
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
    public GetMetaTableFullInfoResponseData data;

    public static GetMetaTableFullInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableFullInfoResponse self = new GetMetaTableFullInfoResponse();
        return TeaModel.build(map, self);
    }

    public static class GetMetaTableFullInfoResponseDataColumnList extends TeaModel {
        @NameInMap("ColumnGuid")
        @Validation(required = true)
        public String columnGuid;

        @NameInMap("ColumnName")
        @Validation(required = true)
        public String columnName;

        @NameInMap("ColumnType")
        @Validation(required = true)
        public String columnType;

        @NameInMap("IsPrimaryKey")
        @Validation(required = true)
        public Boolean isPrimaryKey;

        @NameInMap("Comment")
        @Validation(required = true)
        public String comment;

        @NameInMap("IsPartitionColumn")
        @Validation(required = true)
        public Boolean isPartitionColumn;

        @NameInMap("IsForeignKey")
        @Validation(required = true)
        public Boolean isForeignKey;

        @NameInMap("Caption")
        @Validation(required = true)
        public String caption;

        public static GetMetaTableFullInfoResponseDataColumnList build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableFullInfoResponseDataColumnList self = new GetMetaTableFullInfoResponseDataColumnList();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMetaTableFullInfoResponseData extends TeaModel {
        @NameInMap("TableName")
        @Validation(required = true)
        public String tableName;

        @NameInMap("TableGuid")
        @Validation(required = true)
        public String tableGuid;

        @NameInMap("OwnerId")
        @Validation(required = true)
        public String ownerId;

        @NameInMap("TenantId")
        @Validation(required = true)
        public Long tenantId;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Long projectId;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("LastModifyTime")
        @Validation(required = true)
        public Long lastModifyTime;

        @NameInMap("LifeCycle")
        @Validation(required = true)
        public Integer lifeCycle;

        @NameInMap("IsVisible")
        @Validation(required = true)
        public Integer isVisible;

        @NameInMap("ProjectName")
        @Validation(required = true)
        public String projectName;

        @NameInMap("DataSize")
        @Validation(required = true)
        public Long dataSize;

        @NameInMap("EnvType")
        @Validation(required = true)
        public Integer envType;

        @NameInMap("Comment")
        @Validation(required = true)
        public String comment;

        @NameInMap("TotalColumnCount")
        @Validation(required = true)
        public Long totalColumnCount;

        @NameInMap("LastDdlTime")
        @Validation(required = true)
        public Long lastDdlTime;

        @NameInMap("LastAccessTime")
        @Validation(required = true)
        public Long lastAccessTime;

        @NameInMap("ColumnList")
        @Validation(required = true)
        public java.util.List<GetMetaTableFullInfoResponseDataColumnList> columnList;

        public static GetMetaTableFullInfoResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableFullInfoResponseData self = new GetMetaTableFullInfoResponseData();
            return TeaModel.build(map, self);
        }

    }

}
