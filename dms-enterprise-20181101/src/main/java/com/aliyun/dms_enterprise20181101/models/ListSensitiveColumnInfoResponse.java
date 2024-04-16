// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListSensitiveColumnInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSensitiveColumnInfoResponseBody body;

    public static ListSensitiveColumnInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSensitiveColumnInfoResponse self = new ListSensitiveColumnInfoResponse();
        return TeaModel.build(map, self);
    }

    public ListSensitiveColumnInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSensitiveColumnInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSensitiveColumnInfoResponse setBody(ListSensitiveColumnInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSensitiveColumnInfoResponseBody getBody() {
        return this.body;
    }

}
