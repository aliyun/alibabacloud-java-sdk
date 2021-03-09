// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class EditQualityProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public EditQualityProjectResponse setBody(EditQualityProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public EditQualityProjectResponseBody getBody() {
        return this.body;
    }

}
