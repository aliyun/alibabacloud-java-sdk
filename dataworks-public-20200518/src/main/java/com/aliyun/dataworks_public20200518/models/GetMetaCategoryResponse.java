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

    public GetMetaCategoryResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMetaCategoryResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetMetaCategoryResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetMetaCategoryResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetMetaCategoryResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetMetaCategoryResponse setData(GetMetaCategoryResponseData data) {
        this.data = data;
        return this;
    }
    public GetMetaCategoryResponseData getData() {
        return this.data;
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

        public GetMetaCategoryResponseDataDataEntityList setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public GetMetaCategoryResponseDataDataEntityList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMetaCategoryResponseDataDataEntityList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetMetaCategoryResponseDataDataEntityList setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public GetMetaCategoryResponseDataDataEntityList setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetMetaCategoryResponseDataDataEntityList setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public GetMetaCategoryResponseDataDataEntityList setLastOperatorId(String lastOperatorId) {
            this.lastOperatorId = lastOperatorId;
            return this;
        }
        public String getLastOperatorId() {
            return this.lastOperatorId;
        }

        public GetMetaCategoryResponseDataDataEntityList setParentCategoryId(Long parentCategoryId) {
            this.parentCategoryId = parentCategoryId;
            return this;
        }
        public Long getParentCategoryId() {
            return this.parentCategoryId;
        }

        public GetMetaCategoryResponseDataDataEntityList setDepth(Integer depth) {
            this.depth = depth;
            return this;
        }
        public Integer getDepth() {
            return this.depth;
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

        public GetMetaCategoryResponseData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public GetMetaCategoryResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetMetaCategoryResponseData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public GetMetaCategoryResponseData setDataEntityList(java.util.List<GetMetaCategoryResponseDataDataEntityList> dataEntityList) {
            this.dataEntityList = dataEntityList;
            return this;
        }
        public java.util.List<GetMetaCategoryResponseDataDataEntityList> getDataEntityList() {
            return this.dataEntityList;
        }

    }

}
