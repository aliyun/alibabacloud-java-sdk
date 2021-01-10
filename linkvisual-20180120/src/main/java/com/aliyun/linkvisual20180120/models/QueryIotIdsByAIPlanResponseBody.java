// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryIotIdsByAIPlanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryIotIdsByAIPlanResponseBodyData data;

    public static QueryIotIdsByAIPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryIotIdsByAIPlanResponseBody self = new QueryIotIdsByAIPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryIotIdsByAIPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryIotIdsByAIPlanResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryIotIdsByAIPlanResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryIotIdsByAIPlanResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryIotIdsByAIPlanResponseBody setData(QueryIotIdsByAIPlanResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryIotIdsByAIPlanResponseBodyData getData() {
        return this.data;
    }

    public static class QueryIotIdsByAIPlanResponseBodyData extends TeaModel {
        @NameInMap("Total")
        public Long total;

        @NameInMap("PageCount")
        public Integer pageCount;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("List")
        public java.util.List<String> list;

        public static QueryIotIdsByAIPlanResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryIotIdsByAIPlanResponseBodyData self = new QueryIotIdsByAIPlanResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryIotIdsByAIPlanResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public QueryIotIdsByAIPlanResponseBodyData setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

        public QueryIotIdsByAIPlanResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryIotIdsByAIPlanResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryIotIdsByAIPlanResponseBodyData setList(java.util.List<String> list) {
            this.list = list;
            return this;
        }
        public java.util.List<String> getList() {
            return this.list;
        }

    }

}
