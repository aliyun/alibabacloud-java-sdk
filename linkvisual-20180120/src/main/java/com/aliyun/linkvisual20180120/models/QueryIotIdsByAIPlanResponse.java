// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryIotIdsByAIPlanResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryIotIdsByAIPlanResponseData data;

    public static QueryIotIdsByAIPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIotIdsByAIPlanResponse self = new QueryIotIdsByAIPlanResponse();
        return TeaModel.build(map, self);
    }

    public QueryIotIdsByAIPlanResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryIotIdsByAIPlanResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryIotIdsByAIPlanResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryIotIdsByAIPlanResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryIotIdsByAIPlanResponse setData(QueryIotIdsByAIPlanResponseData data) {
        this.data = data;
        return this;
    }
    public QueryIotIdsByAIPlanResponseData getData() {
        return this.data;
    }

    public static class QueryIotIdsByAIPlanResponseData extends TeaModel {
        @NameInMap("Total")
        @Validation(required = true)
        public Long total;

        @NameInMap("PageCount")
        @Validation(required = true)
        public Integer pageCount;

        @NameInMap("CurrentPage")
        @Validation(required = true)
        public Integer currentPage;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("List")
        @Validation(required = true)
        public java.util.List<String> list;

        public static QueryIotIdsByAIPlanResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryIotIdsByAIPlanResponseData self = new QueryIotIdsByAIPlanResponseData();
            return TeaModel.build(map, self);
        }

        public QueryIotIdsByAIPlanResponseData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public QueryIotIdsByAIPlanResponseData setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

        public QueryIotIdsByAIPlanResponseData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryIotIdsByAIPlanResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryIotIdsByAIPlanResponseData setList(java.util.List<String> list) {
            this.list = list;
            return this;
        }
        public java.util.List<String> getList() {
            return this.list;
        }

    }

}
