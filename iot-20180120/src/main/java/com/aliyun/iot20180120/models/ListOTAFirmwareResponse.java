// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListOTAFirmwareResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOTAFirmwareResponseBody body;

    public static ListOTAFirmwareResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOTAFirmwareResponse self = new ListOTAFirmwareResponse();
        return TeaModel.build(map, self);
    }

    public ListOTAFirmwareResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOTAFirmwareResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOTAFirmwareResponse setBody(ListOTAFirmwareResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOTAFirmwareResponseBody getBody() {
        return this.body;
    }

}
