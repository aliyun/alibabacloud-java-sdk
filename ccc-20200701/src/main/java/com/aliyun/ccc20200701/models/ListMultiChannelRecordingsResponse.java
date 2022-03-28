// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListMultiChannelRecordingsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMultiChannelRecordingsResponseBody body;

    public static ListMultiChannelRecordingsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMultiChannelRecordingsResponse self = new ListMultiChannelRecordingsResponse();
        return TeaModel.build(map, self);
    }

    public ListMultiChannelRecordingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMultiChannelRecordingsResponse setBody(ListMultiChannelRecordingsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMultiChannelRecordingsResponseBody getBody() {
        return this.body;
    }

}
