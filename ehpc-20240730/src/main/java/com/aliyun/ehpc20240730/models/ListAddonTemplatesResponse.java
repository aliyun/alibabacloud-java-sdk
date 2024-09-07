// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class ListAddonTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAddonTemplatesResponseBody body;

    public static ListAddonTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAddonTemplatesResponse self = new ListAddonTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListAddonTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAddonTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAddonTemplatesResponse setBody(ListAddonTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAddonTemplatesResponseBody getBody() {
        return this.body;
    }

}
