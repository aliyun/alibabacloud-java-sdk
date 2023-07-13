// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListInfraredRemoteControllersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListInfraredRemoteControllersResponseBody body;

    public static ListInfraredRemoteControllersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInfraredRemoteControllersResponse self = new ListInfraredRemoteControllersResponse();
        return TeaModel.build(map, self);
    }

    public ListInfraredRemoteControllersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInfraredRemoteControllersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInfraredRemoteControllersResponse setBody(ListInfraredRemoteControllersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInfraredRemoteControllersResponseBody getBody() {
        return this.body;
    }

}
