// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaCategoryResponseBody extends TeaModel {
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Data")
    public GetMetaCategoryResponseBodyData data;

    public static GetMetaCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMetaCategoryResponseBody self = new GetMetaCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMetaCategoryResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetMetaCategoryResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetMetaCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMetaCategoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetMetaCategoryResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetMetaCategoryResponseBody setData(GetMetaCategoryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMetaCategoryResponseBodyData getData() {
        return this.data;
    }

    public static class GetMetaCategoryResponseBodyDataDataEntityList extends TeaModel {
        @NameInMap("Depth")
        public Integer depth;

        @NameInMap("Comment")
        public String comment;

        @NameInMap("ModifiedTime")
        public Long modifiedTime;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("CategoryId")
        public Long categoryId;

        @NameInMap("LastOperatorId")
        public String lastOperatorId;

        @NameInMap("Name")
        public String name;

        @NameInMap("ParentCategoryId")
        public Long parentCategoryId;

        @NameInMap("OwnerId")
        public String ownerId;

        public static GetMetaCategoryResponseBodyDataDataEntityList build(java.util.Map<String, ?> map) throws Exception {
            GetMetaCategoryResponseBodyDataDataEntityList self = new GetMetaCategoryResponseBodyDataDataEntityList();
            return TeaModel.build(map, self);
        }

        public GetMetaCategoryResponseBodyDataDataEntityList setDepth(Integer depth) {
            this.depth = depth;
            return this;
        }
        public Integer getDepth() {
            return this.depth;
        }

        public GetMetaCategoryResponseBodyDataDataEntityList setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetMetaCategoryResponseBodyDataDataEntityList setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public GetMetaCategoryResponseBodyDataDataEntityList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetMetaCategoryResponseBodyDataDataEntityList setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public GetMetaCategoryResponseBodyDataDataEntityList setLastOperatorId(String lastOperatorId) {
            this.lastOperatorId = lastOperatorId;
            return this;
        }
        public String getLastOperatorId() {
            return this.lastOperatorId;
        }

        public GetMetaCategoryResponseBodyDataDataEntityList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMetaCategoryResponseBodyDataDataEntityList setParentCategoryId(Long parentCategoryId) {
            this.parentCategoryId = parentCategoryId;
            return this;
        }
        public Long getParentCategoryId() {
            return this.parentCategoryId;
        }

        public GetMetaCategoryResponseBodyDataDataEntityList setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

    }

    public static class GetMetaCategoryResponseBodyData extends TeaModel {
        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("DataEntityList")
        public java.util.List<GetMetaCategoryResponseBodyDataDataEntityList> dataEntityList;

        public static GetMetaCategoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMetaCategoryResponseBodyData self = new GetMetaCategoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMetaCategoryResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public GetMetaCategoryResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetMetaCategoryResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public GetMetaCategoryResponseBodyData setDataEntityList(java.util.List<GetMetaCategoryResponseBodyDataDataEntityList> dataEntityList) {
            this.dataEntityList = dataEntityList;
            return this;
        }
        public java.util.List<GetMetaCategoryResponseBodyDataDataEntityList> getDataEntityList() {
            return this.dataEntityList;
        }

    }

}
