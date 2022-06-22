// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelGetAdapterSettingOfAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelGetAdapterSettingOfAppResponseBody body;

    public static SentinelGetAdapterSettingOfAppResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelGetAdapterSettingOfAppResponse self = new SentinelGetAdapterSettingOfAppResponse();
        return TeaModel.build(map, self);
    }

    public SentinelGetAdapterSettingOfAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelGetAdapterSettingOfAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelGetAdapterSettingOfAppResponse setBody(SentinelGetAdapterSettingOfAppResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelGetAdapterSettingOfAppResponseBody getBody() {
        return this.body;
    }

}
