// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteLiveRecordTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteLiveRecordTemplateResponseBody body;

    public static DeleteLiveRecordTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveRecordTemplateResponse self = new DeleteLiveRecordTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveRecordTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLiveRecordTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLiveRecordTemplateResponse setBody(DeleteLiveRecordTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLiveRecordTemplateResponseBody getBody() {
        return this.body;
    }

}
