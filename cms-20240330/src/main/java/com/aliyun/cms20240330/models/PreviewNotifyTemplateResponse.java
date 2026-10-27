// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class PreviewNotifyTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PreviewNotifyTemplateResponseBody body;

    public static PreviewNotifyTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        PreviewNotifyTemplateResponse self = new PreviewNotifyTemplateResponse();
        return TeaModel.build(map, self);
    }

    public PreviewNotifyTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PreviewNotifyTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PreviewNotifyTemplateResponse setBody(PreviewNotifyTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public PreviewNotifyTemplateResponseBody getBody() {
        return this.body;
    }

}
