// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class ListInstalledSoftwaresResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInstalledSoftwaresResponseBody body;

    public static ListInstalledSoftwaresResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstalledSoftwaresResponse self = new ListInstalledSoftwaresResponse();
        return TeaModel.build(map, self);
    }

    public ListInstalledSoftwaresResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstalledSoftwaresResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstalledSoftwaresResponse setBody(ListInstalledSoftwaresResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstalledSoftwaresResponseBody getBody() {
        return this.body;
    }

}
