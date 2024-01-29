// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListDNAFilesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDNAFilesResponseBody body;

    public static ListDNAFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDNAFilesResponse self = new ListDNAFilesResponse();
        return TeaModel.build(map, self);
    }

    public ListDNAFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDNAFilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDNAFilesResponse setBody(ListDNAFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDNAFilesResponseBody getBody() {
        return this.body;
    }

}
