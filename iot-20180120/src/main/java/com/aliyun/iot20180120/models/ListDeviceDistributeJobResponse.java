// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListDeviceDistributeJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDeviceDistributeJobResponseBody body;

    public static ListDeviceDistributeJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceDistributeJobResponse self = new ListDeviceDistributeJobResponse();
        return TeaModel.build(map, self);
    }

    public ListDeviceDistributeJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDeviceDistributeJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDeviceDistributeJobResponse setBody(ListDeviceDistributeJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDeviceDistributeJobResponseBody getBody() {
        return this.body;
    }

}
