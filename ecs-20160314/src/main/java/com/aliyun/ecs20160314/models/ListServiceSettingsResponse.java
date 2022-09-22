// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class ListServiceSettingsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListServiceSettingsResponseBody body;

    public static ListServiceSettingsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServiceSettingsResponse self = new ListServiceSettingsResponse();
        return TeaModel.build(map, self);
    }

    public ListServiceSettingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServiceSettingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListServiceSettingsResponse setBody(ListServiceSettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListServiceSettingsResponseBody getBody() {
        return this.body;
    }

}
