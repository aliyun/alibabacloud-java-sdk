// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaDBInfoResponse extends TeaModel {
    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public GetMetaDBInfoResponseData data;

    public static GetMetaDBInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetaDBInfoResponse self = new GetMetaDBInfoResponse();
        return TeaModel.build(map, self);
    }

    public static class GetMetaDBInfoResponseData extends TeaModel {
        @NameInMap("AppGuid")
        @Validation(required = true)
        public String appGuid;

        @NameInMap("TenantId")
        @Validation(required = true)
        public Long tenantId;

        @NameInMap("Endpoint")
        @Validation(required = true)
        public String endpoint;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Long projectId;

        @NameInMap("EnvType")
        @Validation(required = true)
        public Integer envType;

        @NameInMap("ProjectName")
        @Validation(required = true)
        public String projectName;

        @NameInMap("ProjectNameCn")
        @Validation(required = true)
        public String projectNameCn;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("ModifyTime")
        @Validation(required = true)
        public Long modifyTime;

        @NameInMap("OwnerId")
        @Validation(required = true)
        public String ownerId;

        @NameInMap("OwnerName")
        @Validation(required = true)
        public String ownerName;

        public static GetMetaDBInfoResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetMetaDBInfoResponseData self = new GetMetaDBInfoResponseData();
            return TeaModel.build(map, self);
        }

    }

}
