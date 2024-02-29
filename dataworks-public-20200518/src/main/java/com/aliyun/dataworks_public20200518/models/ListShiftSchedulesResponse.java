// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListShiftSchedulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListShiftSchedulesResponseBody body;

    public static ListShiftSchedulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListShiftSchedulesResponse self = new ListShiftSchedulesResponse();
        return TeaModel.build(map, self);
    }

    public ListShiftSchedulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListShiftSchedulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListShiftSchedulesResponse setBody(ListShiftSchedulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListShiftSchedulesResponseBody getBody() {
        return this.body;
    }

}
