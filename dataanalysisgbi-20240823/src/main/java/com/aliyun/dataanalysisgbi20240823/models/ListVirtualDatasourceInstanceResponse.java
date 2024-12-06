// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class ListVirtualDatasourceInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVirtualDatasourceInstanceResponseBody body;

    public static ListVirtualDatasourceInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVirtualDatasourceInstanceResponse self = new ListVirtualDatasourceInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ListVirtualDatasourceInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVirtualDatasourceInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVirtualDatasourceInstanceResponse setBody(ListVirtualDatasourceInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVirtualDatasourceInstanceResponseBody getBody() {
        return this.body;
    }

}
