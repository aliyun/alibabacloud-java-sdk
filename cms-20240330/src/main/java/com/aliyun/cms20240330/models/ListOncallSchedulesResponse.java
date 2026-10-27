// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListOncallSchedulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOncallSchedulesResponseBody body;

    public static ListOncallSchedulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOncallSchedulesResponse self = new ListOncallSchedulesResponse();
        return TeaModel.build(map, self);
    }

    public ListOncallSchedulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOncallSchedulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOncallSchedulesResponse setBody(ListOncallSchedulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOncallSchedulesResponseBody getBody() {
        return this.body;
    }

}
