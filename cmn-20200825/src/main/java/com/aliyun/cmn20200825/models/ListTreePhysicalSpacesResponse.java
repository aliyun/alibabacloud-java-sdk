// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListTreePhysicalSpacesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListTreePhysicalSpacesResponseBody body;

    public static ListTreePhysicalSpacesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTreePhysicalSpacesResponse self = new ListTreePhysicalSpacesResponse();
        return TeaModel.build(map, self);
    }

    public ListTreePhysicalSpacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTreePhysicalSpacesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTreePhysicalSpacesResponse setBody(ListTreePhysicalSpacesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTreePhysicalSpacesResponseBody getBody() {
        return this.body;
    }

}
