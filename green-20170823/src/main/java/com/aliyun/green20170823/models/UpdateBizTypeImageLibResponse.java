// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class UpdateBizTypeImageLibResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateBizTypeImageLibResponseBody body;

    public static UpdateBizTypeImageLibResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBizTypeImageLibResponse self = new UpdateBizTypeImageLibResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBizTypeImageLibResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBizTypeImageLibResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateBizTypeImageLibResponse setBody(UpdateBizTypeImageLibResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBizTypeImageLibResponseBody getBody() {
        return this.body;
    }

}
