// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListVirusFileStatusesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVirusFileStatusesResponseBody body;

    public static ListVirusFileStatusesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVirusFileStatusesResponse self = new ListVirusFileStatusesResponse();
        return TeaModel.build(map, self);
    }

    public ListVirusFileStatusesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVirusFileStatusesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVirusFileStatusesResponse setBody(ListVirusFileStatusesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVirusFileStatusesResponseBody getBody() {
        return this.body;
    }

}
