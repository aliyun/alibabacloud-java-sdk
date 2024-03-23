// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListServiceTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListServiceTemplatesResponseBody body;

    public static ListServiceTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServiceTemplatesResponse self = new ListServiceTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListServiceTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServiceTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListServiceTemplatesResponse setBody(ListServiceTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListServiceTemplatesResponseBody getBody() {
        return this.body;
    }

}
