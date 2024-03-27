// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetClassificationTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetClassificationTemplateResponseBody body;

    public static GetClassificationTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClassificationTemplateResponse self = new GetClassificationTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetClassificationTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClassificationTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetClassificationTemplateResponse setBody(GetClassificationTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClassificationTemplateResponseBody getBody() {
        return this.body;
    }

}
