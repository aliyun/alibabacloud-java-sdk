// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListEventCenterRuleNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListEventCenterRuleNameResponseBody body;

    public static ListEventCenterRuleNameResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEventCenterRuleNameResponse self = new ListEventCenterRuleNameResponse();
        return TeaModel.build(map, self);
    }

    public ListEventCenterRuleNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEventCenterRuleNameResponse setBody(ListEventCenterRuleNameResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEventCenterRuleNameResponseBody getBody() {
        return this.body;
    }

}
