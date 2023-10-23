// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class QueryDevicesDownloadUrlResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryDevicesDownloadUrlResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryDevicesDownloadUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicesDownloadUrlResponseBody self = new QueryDevicesDownloadUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDevicesDownloadUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDevicesDownloadUrlResponseBody setData(QueryDevicesDownloadUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDevicesDownloadUrlResponseBodyData getData() {
        return this.data;
    }

    public QueryDevicesDownloadUrlResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDevicesDownloadUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDevicesDownloadUrlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDevicesDownloadUrlResponseBodyData extends TeaModel {
        @NameInMap("OssDownloadUrl")
        public String ossDownloadUrl;

        public static QueryDevicesDownloadUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicesDownloadUrlResponseBodyData self = new QueryDevicesDownloadUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDevicesDownloadUrlResponseBodyData setOssDownloadUrl(String ossDownloadUrl) {
            this.ossDownloadUrl = ossDownloadUrl;
            return this;
        }
        public String getOssDownloadUrl() {
            return this.ossDownloadUrl;
        }

    }

}
