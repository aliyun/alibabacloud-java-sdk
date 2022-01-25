// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetLiveRecordTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetLiveRecordTemplateResponse setBody(GetLiveRecordTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLiveRecordTemplateResponseBody getBody() {
        return this.body;
    }

}
