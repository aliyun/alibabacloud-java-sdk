// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListDeviceValuesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListDeviceValuesResponseBody body;

    public static ListDeviceValuesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceValuesResponse self = new ListDeviceValuesResponse();
        return TeaModel.build(map, self);
    }

    public ListDeviceValuesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDeviceValuesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDeviceValuesResponse setBody(ListDeviceValuesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDeviceValuesResponseBody getBody() {
        return this.body;
    }

}
