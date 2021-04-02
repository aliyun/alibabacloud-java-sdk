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

    public GetMetaTableListByCategoryResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMetaTableListByCategoryResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetMetaTableListByCategoryResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetMetaTableListByCategoryResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetMetaTableListByCategoryResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetMetaTableListByCategoryResponse setData(GetMetaTableListByCategoryResponseData data) {
        this.data = data;
        return this;
    }
    public GetMetaTableListByCategoryResponseData getData() {
        return this.data;
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

        public GetMetaTableListByCategoryResponseData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public GetMetaTableListByCategoryResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetMetaTableListByCategoryResponseData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public GetMetaTableListByCategoryResponseData setTableGuidList(java.util.List<String> tableGuidList) {
            this.tableGuidList = tableGuidList;
            return this;
        }
        public java.util.List<String> getTableGuidList() {
            return this.tableGuidList;
        }

    }

}
