// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class SetSchedulerInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetSchedulerInfoResponseBody body;

    public static SetSchedulerInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        SetSchedulerInfoResponse self = new SetSchedulerInfoResponse();
        return TeaModel.build(map, self);
    }

    public SetSchedulerInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetSchedulerInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetSchedulerInfoResponse setBody(SetSchedulerInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public SetSchedulerInfoResponseBody getBody() {
        return this.body;
    }

}
