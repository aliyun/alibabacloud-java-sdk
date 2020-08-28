// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableChangeLogResponse extends TeaModel {
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
    public GetMetaTableChangeLogResponseData data;

    public static GetMetaTableChangeLogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableChangeLogResponse self = new GetMetaTableChangeLogResponse();
        return TeaModel.build(map, self);
    }

    public static class GetMetaTableChangeLogResponseDataDataEntityList extends TeaModel {
        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("ModifiedTime")
        @Validation(required = true)
        public Long modifiedTime;

        @NameInMap("ChangeType")
        @Validation(required = true)
        public String changeType;

        @NameInMap("Operator")
        @Validation(required = true)
        public String operator;

        @NameInMap("ObjectType")
        @Validation(required = true)
        public String objectType;

        @NameInMap("ChangeContent")
        @Validation(required = true)
        public String changeContent;

        public static GetMetaTableChangeLogResponseDataDataEntityList build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableChangeLogResponseDataDataEntityList self = new GetMetaTableChangeLogResponseDataDataEntityList();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMetaTableChangeLogResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Long totalCount;

        @NameInMap("DataEntityList")
        @Validation(required = true)
        public java.util.List<GetMetaTableChangeLogResponseDataDataEntityList> dataEntityList;

        public static GetMetaTableChangeLogResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableChangeLogResponseData self = new GetMetaTableChangeLogResponseData();
            return TeaModel.build(map, self);
        }

    }

}
