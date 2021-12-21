// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliyunape20210908.models;

import com.aliyun.tea.*;

public class ApeProvinceStationRefResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ApeProvinceStationRefResponseBody body;

    public static ApeProvinceStationRefResponse build(java.util.Map<String, ?> map) throws Exception {
        ApeProvinceStationRefResponse self = new ApeProvinceStationRefResponse();
        return TeaModel.build(map, self);
    }

    public ApeProvinceStationRefResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApeProvinceStationRefResponse setBody(ApeProvinceStationRefResponseBody body) {
        this.body = body;
        return this;
    }
    public ApeProvinceStationRefResponseBody getBody() {
        return this.body;
    }

}
