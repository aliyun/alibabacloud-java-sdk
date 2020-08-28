// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaDBTableListResponse extends TeaModel {
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
    public GetMetaDBTableListResponseData data;

    public static GetMetaDBTableListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetaDBTableListResponse self = new GetMetaDBTableListResponse();
        return TeaModel.build(map, self);
    }

    public static class GetMetaDBTableListResponseDataTableEntityList extends TeaModel {
        @NameInMap("TableName")
        @Validation(required = true)
        public String tableName;

        @NameInMap("TableGuid")
        @Validation(required = true)
        public String tableGuid;

        public static GetMetaDBTableListResponseDataTableEntityList build(java.util.Map<String, ?> map) throws Exception {
            GetMetaDBTableListResponseDataTableEntityList self = new GetMetaDBTableListResponseDataTableEntityList();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMetaDBTableListResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Long totalCount;

        @NameInMap("TableEntityList")
        @Validation(required = true)
        public java.util.List<GetMetaDBTableListResponseDataTableEntityList> tableEntityList;

        public static GetMetaDBTableListResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetMetaDBTableListResponseData self = new GetMetaDBTableListResponseData();
            return TeaModel.build(map, self);
        }

    }

}
