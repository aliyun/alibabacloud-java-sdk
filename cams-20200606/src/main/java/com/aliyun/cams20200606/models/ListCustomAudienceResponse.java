// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListCustomAudienceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCustomAudienceResponseBody body;

    public static ListCustomAudienceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCustomAudienceResponse self = new ListCustomAudienceResponse();
        return TeaModel.build(map, self);
    }

    public ListCustomAudienceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCustomAudienceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCustomAudienceResponse setBody(ListCustomAudienceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCustomAudienceResponseBody getBody() {
        return this.body;
    }

}
