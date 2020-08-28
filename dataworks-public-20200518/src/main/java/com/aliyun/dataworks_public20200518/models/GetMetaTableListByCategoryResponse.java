// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableListByCategoryResponse extends TeaModel {
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
    public GetMetaTableListByCategoryResponseData data;

    public static GetMetaTableListByCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableListByCategoryResponse self = new GetMetaTableListByCategoryResponse();
        return TeaModel.build(map, self);
    }

    public static class GetMetaTableListByCategoryResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Long totalCount;

        @NameInMap("TableGuidList")
        @Validation(required = true)
        public java.util.List<String> tableGuidList;

        public static GetMetaTableListByCategoryResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableListByCategoryResponseData self = new GetMetaTableListByCategoryResponseData();
            return TeaModel.build(map, self);
        }

    }

}
