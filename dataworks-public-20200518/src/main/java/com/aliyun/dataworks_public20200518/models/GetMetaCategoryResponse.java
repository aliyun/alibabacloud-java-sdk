// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaCategoryResponse extends TeaModel {
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
    public GetMetaCategoryResponseData data;

    public static GetMetaCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetaCategoryResponse self = new GetMetaCategoryResponse();
        return TeaModel.build(map, self);
    }

    public static class GetMetaCategoryResponseDataDataEntityList extends TeaModel {
        @NameInMap("CategoryId")
        @Validation(required = true)
        public Long categoryId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("ModifiedTime")
        @Validation(required = true)
        public Long modifiedTime;

        @NameInMap("Comment")
        @Validation(required = true)
        public String comment;

        @NameInMap("OwnerId")
        @Validation(required = true)
        public String ownerId;

        @NameInMap("LastOperatorId")
        @Validation(required = true)
        public String lastOperatorId;

        @NameInMap("ParentCategoryId")
        @Validation(required = true)
        public Long parentCategoryId;

        @NameInMap("Depth")
        @Validation(required = true)
        public Integer depth;

        public static GetMetaCategoryResponseDataDataEntityList build(java.util.Map<String, ?> map) throws Exception {
            GetMetaCategoryResponseDataDataEntityList self = new GetMetaCategoryResponseDataDataEntityList();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMetaCategoryResponseData extends TeaModel {
        @NameInMap("PageNum")
        @Validation(required = true)
        public Integer pageNum;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Long totalCount;

        @NameInMap("DataEntityList")
        @Validation(required = true)
        public java.util.List<GetMetaCategoryResponseDataDataEntityList> dataEntityList;

        public static GetMetaCategoryResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetMetaCategoryResponseData self = new GetMetaCategoryResponseData();
            return TeaModel.build(map, self);
        }

    }

}
