// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class FindVersionMessageSendRecordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FindVersionMessageSendRecordsResponseBody body;

    public static FindVersionMessageSendRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        FindVersionMessageSendRecordsResponse self = new FindVersionMessageSendRecordsResponse();
        return TeaModel.build(map, self);
    }

    public FindVersionMessageSendRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FindVersionMessageSendRecordsResponse setBody(FindVersionMessageSendRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public FindVersionMessageSendRecordsResponseBody getBody() {
        return this.body;
    }

}
