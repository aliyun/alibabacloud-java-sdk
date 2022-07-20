// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListLiveTranscodeTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListLiveTranscodeTemplatesResponseBody body;

    public static ListLiveTranscodeTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLiveTranscodeTemplatesResponse self = new ListLiveTranscodeTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListLiveTranscodeTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLiveTranscodeTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLiveTranscodeTemplatesResponse setBody(ListLiveTranscodeTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLiveTranscodeTemplatesResponseBody getBody() {
        return this.body;
    }

}
