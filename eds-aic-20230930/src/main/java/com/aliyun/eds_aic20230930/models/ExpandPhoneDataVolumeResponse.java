// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ExpandPhoneDataVolumeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExpandPhoneDataVolumeResponseBody body;

    public static ExpandPhoneDataVolumeResponse build(java.util.Map<String, ?> map) throws Exception {
        ExpandPhoneDataVolumeResponse self = new ExpandPhoneDataVolumeResponse();
        return TeaModel.build(map, self);
    }

    public ExpandPhoneDataVolumeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExpandPhoneDataVolumeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExpandPhoneDataVolumeResponse setBody(ExpandPhoneDataVolumeResponseBody body) {
        this.body = body;
        return this;
    }
    public ExpandPhoneDataVolumeResponseBody getBody() {
        return this.body;
    }

}
