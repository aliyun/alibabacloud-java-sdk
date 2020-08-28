// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaColumnLineageResponse extends TeaModel {
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
    public GetMetaColumnLineageResponseData data;

    public static GetMetaColumnLineageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetaColumnLineageResponse self = new GetMetaColumnLineageResponse();
        return TeaModel.build(map, self);
    }

    public static class GetMetaColumnLineageResponseDataDataEntityList extends TeaModel {
        @NameInMap("ColumnName")
        @Validation(required = true)
        public String columnName;

        @NameInMap("ColumnGuid")
        @Validation(required = true)
        public String columnGuid;

        public static GetMetaColumnLineageResponseDataDataEntityList build(java.util.Map<String, ?> map) throws Exception {
            GetMetaColumnLineageResponseDataDataEntityList self = new GetMetaColumnLineageResponseDataDataEntityList();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMetaColumnLineageResponseData extends TeaModel {
        @NameInMap("TotalCount")
        @Validation(required = true)
        public Long totalCount;

        @NameInMap("PageNum")
        @Validation(required = true)
        public Integer pageNum;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("DataEntityList")
        @Validation(required = true)
        public java.util.List<GetMetaColumnLineageResponseDataDataEntityList> dataEntityList;

        public static GetMetaColumnLineageResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetMetaColumnLineageResponseData self = new GetMetaColumnLineageResponseData();
            return TeaModel.build(map, self);
        }

    }

}
