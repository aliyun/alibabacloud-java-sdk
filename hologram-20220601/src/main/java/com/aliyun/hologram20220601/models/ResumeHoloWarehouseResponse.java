// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ResumeHoloWarehouseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResumeHoloWarehouseResponseBody body;

    public static ResumeHoloWarehouseResponse build(java.util.Map<String, ?> map) throws Exception {
        ResumeHoloWarehouseResponse self = new ResumeHoloWarehouseResponse();
        return TeaModel.build(map, self);
    }

    public ResumeHoloWarehouseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResumeHoloWarehouseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResumeHoloWarehouseResponse setBody(ResumeHoloWarehouseResponseBody body) {
        this.body = body;
        return this;
    }
    public ResumeHoloWarehouseResponseBody getBody() {
        return this.body;
    }

}
