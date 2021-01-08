// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class ListDevopsScenarioFieldConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDevopsScenarioFieldConfigResponseBody body;

    public static ListDevopsScenarioFieldConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDevopsScenarioFieldConfigResponse self = new ListDevopsScenarioFieldConfigResponse();
        return TeaModel.build(map, self);
    }

    public ListDevopsScenarioFieldConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDevopsScenarioFieldConfigResponse setBody(ListDevopsScenarioFieldConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDevopsScenarioFieldConfigResponseBody getBody() {
        return this.body;
    }

}
