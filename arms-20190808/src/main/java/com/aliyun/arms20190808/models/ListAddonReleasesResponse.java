// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListAddonReleasesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAddonReleasesResponseBody body;

    public static ListAddonReleasesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAddonReleasesResponse self = new ListAddonReleasesResponse();
        return TeaModel.build(map, self);
    }

    public ListAddonReleasesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAddonReleasesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAddonReleasesResponse setBody(ListAddonReleasesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAddonReleasesResponseBody getBody() {
        return this.body;
    }

}
