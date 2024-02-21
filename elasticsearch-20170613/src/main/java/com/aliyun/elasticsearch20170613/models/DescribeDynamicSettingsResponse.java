// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeDynamicSettingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDynamicSettingsResponseBody body;

    public static DescribeDynamicSettingsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDynamicSettingsResponse self = new DescribeDynamicSettingsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDynamicSettingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDynamicSettingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDynamicSettingsResponse setBody(DescribeDynamicSettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDynamicSettingsResponseBody getBody() {
        return this.body;
    }

}
