// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelUpdateGeneralSettingOfAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelUpdateGeneralSettingOfAppResponseBody body;

    public static SentinelUpdateGeneralSettingOfAppResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelUpdateGeneralSettingOfAppResponse self = new SentinelUpdateGeneralSettingOfAppResponse();
        return TeaModel.build(map, self);
    }

    public SentinelUpdateGeneralSettingOfAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelUpdateGeneralSettingOfAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelUpdateGeneralSettingOfAppResponse setBody(SentinelUpdateGeneralSettingOfAppResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelUpdateGeneralSettingOfAppResponseBody getBody() {
        return this.body;
    }

}
