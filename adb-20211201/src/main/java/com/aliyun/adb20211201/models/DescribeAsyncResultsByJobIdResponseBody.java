// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAsyncResultsByJobIdResponseBody extends TeaModel {
    @NameInMap("Engine")
    public String engine;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultDataList")
    public java.util.List<?> resultDataList;

    @NameInMap("ResultHeaders")
    public java.util.List<String> resultHeaders;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeAsyncResultsByJobIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAsyncResultsByJobIdResponseBody self = new DescribeAsyncResultsByJobIdResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAsyncResultsByJobIdResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeAsyncResultsByJobIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAsyncResultsByJobIdResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAsyncResultsByJobIdResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeAsyncResultsByJobIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAsyncResultsByJobIdResponseBody setResultDataList(java.util.List<?> resultDataList) {
        this.resultDataList = resultDataList;
        return this;
    }
    public java.util.List<?> getResultDataList() {
        return this.resultDataList;
    }

    public DescribeAsyncResultsByJobIdResponseBody setResultHeaders(java.util.List<String> resultHeaders) {
        this.resultHeaders = resultHeaders;
        return this;
    }
    public java.util.List<String> getResultHeaders() {
        return this.resultHeaders;
    }

    public DescribeAsyncResultsByJobIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
