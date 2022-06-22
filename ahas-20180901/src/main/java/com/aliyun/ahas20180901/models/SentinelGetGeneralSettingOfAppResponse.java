// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelGetGeneralSettingOfAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelGetGeneralSettingOfAppResponseBody body;

    public static SentinelGetGeneralSettingOfAppResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelGetGeneralSettingOfAppResponse self = new SentinelGetGeneralSettingOfAppResponse();
        return TeaModel.build(map, self);
    }

    public SentinelGetGeneralSettingOfAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelGetGeneralSettingOfAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelGetGeneralSettingOfAppResponse setBody(SentinelGetGeneralSettingOfAppResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelGetGeneralSettingOfAppResponseBody getBody() {
        return this.body;
    }

}
