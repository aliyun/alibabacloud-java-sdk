// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListCommonAreasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCommonAreasResponseBody body;

    public static ListCommonAreasResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCommonAreasResponse self = new ListCommonAreasResponse();
        return TeaModel.build(map, self);
    }

    public ListCommonAreasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCommonAreasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCommonAreasResponse setBody(ListCommonAreasResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCommonAreasResponseBody getBody() {
        return this.body;
    }

}
