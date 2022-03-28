// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListCustomizedVoiceNavigatorInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListCustomizedVoiceNavigatorInstancesResponseBody body;

    public static ListCustomizedVoiceNavigatorInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCustomizedVoiceNavigatorInstancesResponse self = new ListCustomizedVoiceNavigatorInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListCustomizedVoiceNavigatorInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCustomizedVoiceNavigatorInstancesResponse setBody(ListCustomizedVoiceNavigatorInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCustomizedVoiceNavigatorInstancesResponseBody getBody() {
        return this.body;
    }

}
