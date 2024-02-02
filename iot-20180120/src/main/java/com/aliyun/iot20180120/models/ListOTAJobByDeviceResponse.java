// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListOTAJobByDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOTAJobByDeviceResponseBody body;

    public static ListOTAJobByDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOTAJobByDeviceResponse self = new ListOTAJobByDeviceResponse();
        return TeaModel.build(map, self);
    }

    public ListOTAJobByDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOTAJobByDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOTAJobByDeviceResponse setBody(ListOTAJobByDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOTAJobByDeviceResponseBody getBody() {
        return this.body;
    }

}
