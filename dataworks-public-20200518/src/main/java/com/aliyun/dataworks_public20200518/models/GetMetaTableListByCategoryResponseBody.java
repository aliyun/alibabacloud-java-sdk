// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableListByCategoryResponseBody extends TeaModel {
    /**
     * <p>The business data returned.</p>
     */
    @NameInMap("Data")
    public GetMetaTableListByCategoryResponseBodyData data;

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

    public static GetMetaTableListByCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableListByCategoryResponseBody self = new GetMetaTableListByCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMetaTableListByCategoryResponseBody setData(GetMetaTableListByCategoryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMetaTableListByCategoryResponseBodyData getData() {
        return this.data;
    }

    public GetMetaTableListByCategoryResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetMetaTableListByCategoryResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetMetaTableListByCategoryResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetMetaTableListByCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMetaTableListByCategoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMetaTableListByCategoryResponseBodyData extends TeaModel {
        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries returned per page. Default value: 10. Maximum value: 100.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The returned result.</p>
         */
        @NameInMap("TableGuidList")
        public java.util.List<String> tableGuidList;

        /**
         * <p>The total number of metatables.</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static GetMetaTableListByCategoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableListByCategoryResponseBodyData self = new GetMetaTableListByCategoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMetaTableListByCategoryResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public GetMetaTableListByCategoryResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetMetaTableListByCategoryResponseBodyData setTableGuidList(java.util.List<String> tableGuidList) {
            this.tableGuidList = tableGuidList;
            return this;
        }
        public java.util.List<String> getTableGuidList() {
            return this.tableGuidList;
        }

        public GetMetaTableListByCategoryResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
