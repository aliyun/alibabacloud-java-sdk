// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetAttributePassingSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAttributePassingSettingResponseBody body;

    public static GetAttributePassingSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAttributePassingSettingResponse self = new GetAttributePassingSettingResponse();
        return TeaModel.build(map, self);
    }

    public GetAttributePassingSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAttributePassingSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAttributePassingSettingResponse setBody(GetAttributePassingSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAttributePassingSettingResponseBody getBody() {
        return this.body;
    }

}
