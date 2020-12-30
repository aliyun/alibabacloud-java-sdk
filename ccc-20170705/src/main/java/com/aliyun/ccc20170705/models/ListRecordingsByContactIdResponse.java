// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListRecordingsByContactIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListRecordingsByContactIdResponseBody body;

    public static ListRecordingsByContactIdResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRecordingsByContactIdResponse self = new ListRecordingsByContactIdResponse();
        return TeaModel.build(map, self);
    }

    public ListRecordingsByContactIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRecordingsByContactIdResponse setBody(ListRecordingsByContactIdResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRecordingsByContactIdResponseBody getBody() {
        return this.body;
    }

}
