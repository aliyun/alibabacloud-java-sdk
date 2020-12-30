// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListEmrAvailableResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListEmrAvailableResourceResponseBody body;

    public static ListEmrAvailableResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEmrAvailableResourceResponse self = new ListEmrAvailableResourceResponse();
        return TeaModel.build(map, self);
    }

    public ListEmrAvailableResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEmrAvailableResourceResponse setBody(ListEmrAvailableResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEmrAvailableResourceResponseBody getBody() {
        return this.body;
    }

}
