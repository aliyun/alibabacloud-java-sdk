// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class EditJobTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EditJobTemplateResponseBody body;

    public static EditJobTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        EditJobTemplateResponse self = new EditJobTemplateResponse();
        return TeaModel.build(map, self);
    }

    public EditJobTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EditJobTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EditJobTemplateResponse setBody(EditJobTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public EditJobTemplateResponseBody getBody() {
        return this.body;
    }

}
