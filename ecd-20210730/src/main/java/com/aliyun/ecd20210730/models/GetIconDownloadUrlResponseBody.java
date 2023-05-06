// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class GetIconDownloadUrlResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetIconDownloadUrlResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetIconDownloadUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIconDownloadUrlResponseBody self = new GetIconDownloadUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIconDownloadUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetIconDownloadUrlResponseBody setData(GetIconDownloadUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetIconDownloadUrlResponseBodyData getData() {
        return this.data;
    }

    public GetIconDownloadUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetIconDownloadUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetIconDownloadUrlResponseBodyData extends TeaModel {
        @NameInMap("Url")
        public String url;

        public static GetIconDownloadUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetIconDownloadUrlResponseBodyData self = new GetIconDownloadUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetIconDownloadUrlResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
