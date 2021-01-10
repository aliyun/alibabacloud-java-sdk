// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class EditHtmlResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EditHtmlResourceResponseBody body;

    public static EditHtmlResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        EditHtmlResourceResponse self = new EditHtmlResourceResponse();
        return TeaModel.build(map, self);
    }

    public EditHtmlResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EditHtmlResourceResponse setBody(EditHtmlResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public EditHtmlResourceResponseBody getBody() {
        return this.body;
    }

}
