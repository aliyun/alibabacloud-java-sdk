// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ChangeParseSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChangeParseSettingResponseBody body;

    public static ChangeParseSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeParseSettingResponse self = new ChangeParseSettingResponse();
        return TeaModel.build(map, self);
    }

    public ChangeParseSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeParseSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeParseSettingResponse setBody(ChangeParseSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeParseSettingResponseBody getBody() {
        return this.body;
    }

}
