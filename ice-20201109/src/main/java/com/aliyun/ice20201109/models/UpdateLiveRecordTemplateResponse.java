// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateLiveRecordTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateLiveRecordTemplateResponseBody body;

    public static UpdateLiveRecordTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveRecordTemplateResponse self = new UpdateLiveRecordTemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLiveRecordTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLiveRecordTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLiveRecordTemplateResponse setBody(UpdateLiveRecordTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLiveRecordTemplateResponseBody getBody() {
        return this.body;
    }

}
