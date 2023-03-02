// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaCategoryResponseBody extends TeaModel {
    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public GetMetaCategoryResponseBodyData data;

    /**
     * <p>The error code returned.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetMetaCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMetaCategoryResponseBody self = new GetMetaCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMetaCategoryResponseBody setData(GetMetaCategoryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMetaCategoryResponseBodyData getData() {
        return this.data;
    }

    public GetMetaCategoryResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetMetaCategoryResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetMetaCategoryResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    public static class GetMetaCategoryResponseBodyDataDataEntityList extends TeaModel {
        /**
         * <p>The ID of the category.</p>
         */
        @NameInMap("CategoryId")
        public Long categoryId;

        /**
         * <p>The remarks of the category.</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The time when the category was created.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The number of category levels.</p>
         */
        @NameInMap("Depth")
        public Integer depth;

        /**
         * <p>The ID of the user that performed the last operation.</p>
         */
        @NameInMap("LastOperatorId")
        public String lastOperatorId;

        /**
         * <p>The time when the category was last modified.</p>
         */
        @NameInMap("ModifiedTime")
        public Long modifiedTime;

        /**
         * <p>The name of the category.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the category owner.</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <p>The ID of the parent category.</p>
         */
        @NameInMap("ParentCategoryId")
        public Long parentCategoryId;

        public static GetMetaCategoryResponseBodyDataDataEntityList build(java.util.Map<String, ?> map) throws Exception {
            GetMetaCategoryResponseBodyDataDataEntityList self = new GetMetaCategoryResponseBodyDataDataEntityList();
            return TeaModel.build(map, self);
        }

        public GetMetaCategoryResponseBodyDataDataEntityList setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public GetMetaCategoryResponseBodyDataDataEntityList setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetMetaCategoryResponseBodyDataDataEntityList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetMetaCategoryResponseBodyDataDataEntityList setDepth(Integer depth) {
            this.depth = depth;
            return this;
        }
        public Integer getDepth() {
            return this.depth;
        }

        public GetMetaCategoryResponseBodyDataDataEntityList setLastOperatorId(String lastOperatorId) {
            this.lastOperatorId = lastOperatorId;
            return this;
        }
        public String getLastOperatorId() {
            return this.lastOperatorId;
        }

        public GetMetaCategoryResponseBodyDataDataEntityList setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public GetMetaCategoryResponseBodyDataDataEntityList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMetaCategoryResponseBodyDataDataEntityList setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public GetMetaCategoryResponseBodyDataDataEntityList setParentCategoryId(Long parentCategoryId) {
            this.parentCategoryId = parentCategoryId;
            return this;
        }
        public Long getParentCategoryId() {
            return this.parentCategoryId;
        }

    }

    public static class GetMetaCategoryResponseBodyData extends TeaModel {
        /**
         * <p>The information about the category tree.</p>
         */
        @NameInMap("DataEntityList")
        public java.util.List<GetMetaCategoryResponseBodyDataDataEntityList> dataEntityList;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <p>The number of entries returned per page. Default value: 10. Maximum value: 100.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of categories.</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static GetMetaCategoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMetaCategoryResponseBodyData self = new GetMetaCategoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMetaCategoryResponseBodyData setDataEntityList(java.util.List<GetMetaCategoryResponseBodyDataDataEntityList> dataEntityList) {
            this.dataEntityList = dataEntityList;
            return this;
        }
        public java.util.List<GetMetaCategoryResponseBodyDataDataEntityList> getDataEntityList() {
            return this.dataEntityList;
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

    }

}
