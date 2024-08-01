// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class Personalizedtxt2imgQueryImageAssetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Object body;

    public static Personalizedtxt2imgQueryImageAssetResponse build(java.util.Map<String, ?> map) throws Exception {
        Personalizedtxt2imgQueryImageAssetResponse self = new Personalizedtxt2imgQueryImageAssetResponse();
        return TeaModel.build(map, self);
    }

    public Personalizedtxt2imgQueryImageAssetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public Personalizedtxt2imgQueryImageAssetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public Personalizedtxt2imgQueryImageAssetResponse setBody(Object body) {
        this.body = body;
        return this;
    }
    public Object getBody() {
        return this.body;
    }

}
