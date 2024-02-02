// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListOTAModuleVersionsByDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOTAModuleVersionsByDeviceResponseBody body;

    public static ListOTAModuleVersionsByDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOTAModuleVersionsByDeviceResponse self = new ListOTAModuleVersionsByDeviceResponse();
        return TeaModel.build(map, self);
    }

    public ListOTAModuleVersionsByDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOTAModuleVersionsByDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOTAModuleVersionsByDeviceResponse setBody(ListOTAModuleVersionsByDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOTAModuleVersionsByDeviceResponseBody getBody() {
        return this.body;
    }

}
