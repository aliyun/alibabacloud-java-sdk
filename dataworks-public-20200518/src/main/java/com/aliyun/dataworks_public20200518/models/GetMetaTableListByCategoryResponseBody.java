// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableListByCategoryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Data")
    public GetMetaTableListByCategoryResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    public static GetMetaTableListByCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableListByCategoryResponseBody self = new GetMetaTableListByCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMetaTableListByCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMetaTableListByCategoryResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    public GetMetaTableListByCategoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMetaTableListByCategoryResponseBodyData extends TeaModel {
        @NameInMap("TableGuidList")
        public java.util.List<String> tableGuidList;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static GetMetaTableListByCategoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableListByCategoryResponseBodyData self = new GetMetaTableListByCategoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMetaTableListByCategoryResponseBodyData setTableGuidList(java.util.List<String> tableGuidList) {
            this.tableGuidList = tableGuidList;
            return this;
        }
        public java.util.List<String> getTableGuidList() {
            return this.tableGuidList;
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

        public GetMetaTableListByCategoryResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
