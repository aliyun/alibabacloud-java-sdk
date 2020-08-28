// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableBasicInfoResponse extends TeaModel {
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
    public GetMetaTableBasicInfoResponseData data;

    public static GetMetaTableBasicInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableBasicInfoResponse self = new GetMetaTableBasicInfoResponse();
        return TeaModel.build(map, self);
    }

    public static class GetMetaTableBasicInfoResponseData extends TeaModel {
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

        @NameInMap("LastDdlTime")
        @Validation(required = true)
        public Long lastDdlTime;

        @NameInMap("LastAccessTime")
        @Validation(required = true)
        public Long lastAccessTime;

        @NameInMap("EnvType")
        @Validation(required = true)
        public Integer envType;

        @NameInMap("DataSize")
        @Validation(required = true)
        public Long dataSize;

        @NameInMap("Comment")
        @Validation(required = true)
        public String comment;

        @NameInMap("ProjectName")
        @Validation(required = true)
        public String projectName;

        public static GetMetaTableBasicInfoResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableBasicInfoResponseData self = new GetMetaTableBasicInfoResponseData();
            return TeaModel.build(map, self);
        }

    }

}
