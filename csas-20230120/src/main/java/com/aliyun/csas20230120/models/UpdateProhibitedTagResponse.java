// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateProhibitedTagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateProhibitedTagResponseBody body;

    public static UpdateProhibitedTagResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateProhibitedTagResponse self = new UpdateProhibitedTagResponse();
        return TeaModel.build(map, self);
    }

    public UpdateProhibitedTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateProhibitedTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateProhibitedTagResponse setBody(UpdateProhibitedTagResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateProhibitedTagResponseBody getBody() {
        return this.body;
    }

}
