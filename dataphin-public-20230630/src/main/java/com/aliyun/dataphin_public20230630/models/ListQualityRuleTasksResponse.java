// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListQualityRuleTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListQualityRuleTasksResponseBody body;

    public static ListQualityRuleTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListQualityRuleTasksResponse self = new ListQualityRuleTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListQualityRuleTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListQualityRuleTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListQualityRuleTasksResponse setBody(ListQualityRuleTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListQualityRuleTasksResponseBody getBody() {
        return this.body;
    }

}
