// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListScenarioTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListScenarioTemplatesResponseBody body;

    public static ListScenarioTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListScenarioTemplatesResponse self = new ListScenarioTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListScenarioTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListScenarioTemplatesResponse setBody(ListScenarioTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListScenarioTemplatesResponseBody getBody() {
        return this.body;
    }

}
