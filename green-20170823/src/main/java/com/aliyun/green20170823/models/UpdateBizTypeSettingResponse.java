// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class UpdateBizTypeSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateBizTypeSettingResponseBody body;

    public static UpdateBizTypeSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBizTypeSettingResponse self = new UpdateBizTypeSettingResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBizTypeSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBizTypeSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateBizTypeSettingResponse setBody(UpdateBizTypeSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBizTypeSettingResponseBody getBody() {
        return this.body;
    }

}
