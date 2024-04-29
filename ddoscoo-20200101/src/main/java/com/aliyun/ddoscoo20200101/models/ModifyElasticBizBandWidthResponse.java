// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyElasticBizBandWidthResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyElasticBizBandWidthResponseBody body;

    public static ModifyElasticBizBandWidthResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyElasticBizBandWidthResponse self = new ModifyElasticBizBandWidthResponse();
        return TeaModel.build(map, self);
    }

    public ModifyElasticBizBandWidthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyElasticBizBandWidthResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyElasticBizBandWidthResponse setBody(ModifyElasticBizBandWidthResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyElasticBizBandWidthResponseBody getBody() {
        return this.body;
    }

}
