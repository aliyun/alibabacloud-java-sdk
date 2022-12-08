// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryRecordDownloadUrlResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryRecordDownloadUrlResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryRecordDownloadUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRecordDownloadUrlResponseBody self = new QueryRecordDownloadUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRecordDownloadUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryRecordDownloadUrlResponseBody setData(QueryRecordDownloadUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryRecordDownloadUrlResponseBodyData getData() {
        return this.data;
    }

    public QueryRecordDownloadUrlResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryRecordDownloadUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRecordDownloadUrlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryRecordDownloadUrlResponseBodyData extends TeaModel {
        @NameInMap("Progress")
        public Integer progress;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Url")
        public String url;

        public static QueryRecordDownloadUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryRecordDownloadUrlResponseBodyData self = new QueryRecordDownloadUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryRecordDownloadUrlResponseBodyData setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public QueryRecordDownloadUrlResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryRecordDownloadUrlResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
