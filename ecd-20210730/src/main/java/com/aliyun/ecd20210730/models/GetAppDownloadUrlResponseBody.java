// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class GetAppDownloadUrlResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAppDownloadUrlResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAppDownloadUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppDownloadUrlResponseBody self = new GetAppDownloadUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppDownloadUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAppDownloadUrlResponseBody setData(GetAppDownloadUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAppDownloadUrlResponseBodyData getData() {
        return this.data;
    }

    public GetAppDownloadUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAppDownloadUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAppDownloadUrlResponseBodyData extends TeaModel {
        @NameInMap("Url")
        public String url;

        public static GetAppDownloadUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAppDownloadUrlResponseBodyData self = new GetAppDownloadUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAppDownloadUrlResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
