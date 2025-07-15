// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class RecoverLiveMessageDeletedGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecoverLiveMessageDeletedGroupResponseBody body;

    public static RecoverLiveMessageDeletedGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        RecoverLiveMessageDeletedGroupResponse self = new RecoverLiveMessageDeletedGroupResponse();
        return TeaModel.build(map, self);
    }

    public RecoverLiveMessageDeletedGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecoverLiveMessageDeletedGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecoverLiveMessageDeletedGroupResponse setBody(RecoverLiveMessageDeletedGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public RecoverLiveMessageDeletedGroupResponseBody getBody() {
        return this.body;
    }

}
