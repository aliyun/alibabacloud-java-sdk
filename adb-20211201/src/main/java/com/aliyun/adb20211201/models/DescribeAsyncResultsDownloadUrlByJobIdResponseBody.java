// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAsyncResultsDownloadUrlByJobIdResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Url")
    public String url;

    public static DescribeAsyncResultsDownloadUrlByJobIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAsyncResultsDownloadUrlByJobIdResponseBody self = new DescribeAsyncResultsDownloadUrlByJobIdResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAsyncResultsDownloadUrlByJobIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAsyncResultsDownloadUrlByJobIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAsyncResultsDownloadUrlByJobIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeAsyncResultsDownloadUrlByJobIdResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
