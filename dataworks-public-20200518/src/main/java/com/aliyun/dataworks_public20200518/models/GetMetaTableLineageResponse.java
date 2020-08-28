// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableLineageResponse extends TeaModel {
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
    public GetMetaTableLineageResponseData data;

    public static GetMetaTableLineageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableLineageResponse self = new GetMetaTableLineageResponse();
        return TeaModel.build(map, self);
    }

    public static class GetMetaTableLineageResponseDataDataEntityList extends TeaModel {
        @NameInMap("TableName")
        @Validation(required = true)
        public String tableName;

        @NameInMap("TableGuid")
        @Validation(required = true)
        public String tableGuid;

        public static GetMetaTableLineageResponseDataDataEntityList build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableLineageResponseDataDataEntityList self = new GetMetaTableLineageResponseDataDataEntityList();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMetaTableLineageResponseData extends TeaModel {
        @NameInMap("HasNext")
        @Validation(required = true)
        public Boolean hasNext;

        @NameInMap("NextPrimaryKey")
        @Validation(required = true)
        public String nextPrimaryKey;

        @NameInMap("DataEntityList")
        @Validation(required = true)
        public java.util.List<GetMetaTableLineageResponseDataDataEntityList> dataEntityList;

        public static GetMetaTableLineageResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableLineageResponseData self = new GetMetaTableLineageResponseData();
            return TeaModel.build(map, self);
        }

    }

}
