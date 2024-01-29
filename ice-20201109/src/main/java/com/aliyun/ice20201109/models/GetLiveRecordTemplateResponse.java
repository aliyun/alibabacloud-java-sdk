// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetLiveRecordTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLiveRecordTemplateResponseBody body;

    public static GetLiveRecordTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLiveRecordTemplateResponse self = new GetLiveRecordTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetLiveRecordTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLiveRecordTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLiveRecordTemplateResponse setBody(GetLiveRecordTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLiveRecordTemplateResponseBody getBody() {
        return this.body;
    }

}
