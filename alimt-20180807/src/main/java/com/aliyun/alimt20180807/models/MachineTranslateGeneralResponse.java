// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20180807.models;

import com.aliyun.tea.*;

public class MachineTranslateGeneralResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MachineTranslateGeneralResponseBody body;

    public static MachineTranslateGeneralResponse build(java.util.Map<String, ?> map) throws Exception {
        MachineTranslateGeneralResponse self = new MachineTranslateGeneralResponse();
        return TeaModel.build(map, self);
    }

    public MachineTranslateGeneralResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MachineTranslateGeneralResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MachineTranslateGeneralResponse setBody(MachineTranslateGeneralResponseBody body) {
        this.body = body;
        return this;
    }
    public MachineTranslateGeneralResponseBody getBody() {
        return this.body;
    }

}
