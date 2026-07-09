// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListServiceRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListServiceRecordsResponseBody body;

    public static ListServiceRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServiceRecordsResponse self = new ListServiceRecordsResponse();
        return TeaModel.build(map, self);
    }

    public ListServiceRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServiceRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListServiceRecordsResponse setBody(ListServiceRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListServiceRecordsResponseBody getBody() {
        return this.body;
    }

}
