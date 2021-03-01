// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class QueryServiceTimeConfigResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public QueryServiceTimeConfigResponseBodyData data;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Success")
    public Boolean success;

    public static QueryServiceTimeConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryServiceTimeConfigResponseBody self = new QueryServiceTimeConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryServiceTimeConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryServiceTimeConfigResponseBody setData(QueryServiceTimeConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryServiceTimeConfigResponseBodyData getData() {
        return this.data;
    }

    public QueryServiceTimeConfigResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryServiceTimeConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryServiceTimeConfigResponseBodyDataResult extends TeaModel {
        @NameInMap("Timeout")
        public String timeout;

        @NameInMap("ConsumerAppName")
        public String consumerAppName;

        @NameInMap("Path")
        public String path;

        @NameInMap("ConsumerAppId")
        public String consumerAppId;

        @NameInMap("Id")
        public Long id;

        public static QueryServiceTimeConfigResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            QueryServiceTimeConfigResponseBodyDataResult self = new QueryServiceTimeConfigResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public QueryServiceTimeConfigResponseBodyDataResult setTimeout(String timeout) {
            this.timeout = timeout;
            return this;
        }
        public String getTimeout() {
            return this.timeout;
        }

        public QueryServiceTimeConfigResponseBodyDataResult setConsumerAppName(String consumerAppName) {
            this.consumerAppName = consumerAppName;
            return this;
        }
        public String getConsumerAppName() {
            return this.consumerAppName;
        }

        public QueryServiceTimeConfigResponseBodyDataResult setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public QueryServiceTimeConfigResponseBodyDataResult setConsumerAppId(String consumerAppId) {
            this.consumerAppId = consumerAppId;
            return this;
        }
        public String getConsumerAppId() {
            return this.consumerAppId;
        }

        public QueryServiceTimeConfigResponseBodyDataResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class QueryServiceTimeConfigResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("Result")
        public java.util.List<QueryServiceTimeConfigResponseBodyDataResult> result;

        @NameInMap("TotalSize")
        public Integer totalSize;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        public static QueryServiceTimeConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryServiceTimeConfigResponseBodyData self = new QueryServiceTimeConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryServiceTimeConfigResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryServiceTimeConfigResponseBodyData setResult(java.util.List<QueryServiceTimeConfigResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<QueryServiceTimeConfigResponseBodyDataResult> getResult() {
            return this.result;
        }

        public QueryServiceTimeConfigResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

        public QueryServiceTimeConfigResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public QueryServiceTimeConfigResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

}
