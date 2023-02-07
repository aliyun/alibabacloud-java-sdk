// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class EditQualityProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EditQualityProjectResponseBody body;

    public static EditQualityProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        EditQualityProjectResponse self = new EditQualityProjectResponse();
        return TeaModel.build(map, self);
    }

    public EditQualityProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EditQualityProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EditQualityProjectResponse setBody(EditQualityProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public EditQualityProjectResponseBody getBody() {
        return this.body;
    }

}
