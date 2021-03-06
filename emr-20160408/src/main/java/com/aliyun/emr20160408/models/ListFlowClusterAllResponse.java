// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListFlowClusterAllResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListFlowClusterAllResponseBody body;

    public static ListFlowClusterAllResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFlowClusterAllResponse self = new ListFlowClusterAllResponse();
        return TeaModel.build(map, self);
    }

    public ListFlowClusterAllResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFlowClusterAllResponse setBody(ListFlowClusterAllResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFlowClusterAllResponseBody getBody() {
        return this.body;
    }

}
