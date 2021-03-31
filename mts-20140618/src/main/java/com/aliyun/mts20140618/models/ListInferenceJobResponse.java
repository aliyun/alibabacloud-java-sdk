// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ListInferenceJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListInferenceJobResponseBody body;

    public static ListInferenceJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInferenceJobResponse self = new ListInferenceJobResponse();
        return TeaModel.build(map, self);
    }

    public ListInferenceJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInferenceJobResponse setBody(ListInferenceJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInferenceJobResponseBody getBody() {
        return this.body;
    }

}
