// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ViewOncallScheduleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ViewOncallScheduleResponseBody body;

    public static ViewOncallScheduleResponse build(java.util.Map<String, ?> map) throws Exception {
        ViewOncallScheduleResponse self = new ViewOncallScheduleResponse();
        return TeaModel.build(map, self);
    }

    public ViewOncallScheduleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ViewOncallScheduleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ViewOncallScheduleResponse setBody(ViewOncallScheduleResponseBody body) {
        this.body = body;
        return this;
    }
    public ViewOncallScheduleResponseBody getBody() {
        return this.body;
    }

}
