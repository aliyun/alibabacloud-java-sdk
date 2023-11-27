// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class GetMediaUrlResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetMediaUrlResponseBodyResult result;

    public static GetMediaUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMediaUrlResponseBody self = new GetMediaUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMediaUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMediaUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMediaUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMediaUrlResponseBody setResult(GetMediaUrlResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetMediaUrlResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetMediaUrlResponseBodyResult extends TeaModel {
        @NameInMap("Url")
        public String url;

        public static GetMediaUrlResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetMediaUrlResponseBodyResult self = new GetMediaUrlResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetMediaUrlResponseBodyResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
