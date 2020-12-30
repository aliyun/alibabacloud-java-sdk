// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListEmrAvailableConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListEmrAvailableConfigResponseBody body;

    public static ListEmrAvailableConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEmrAvailableConfigResponse self = new ListEmrAvailableConfigResponse();
        return TeaModel.build(map, self);
    }

    public ListEmrAvailableConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEmrAvailableConfigResponse setBody(ListEmrAvailableConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEmrAvailableConfigResponseBody getBody() {
        return this.body;
    }

}
