// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListRealtimeSkillGroupStatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRealtimeSkillGroupStatesResponseBody body;

    public static ListRealtimeSkillGroupStatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRealtimeSkillGroupStatesResponse self = new ListRealtimeSkillGroupStatesResponse();
        return TeaModel.build(map, self);
    }

    public ListRealtimeSkillGroupStatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRealtimeSkillGroupStatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRealtimeSkillGroupStatesResponse setBody(ListRealtimeSkillGroupStatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRealtimeSkillGroupStatesResponseBody getBody() {
        return this.body;
    }

}
