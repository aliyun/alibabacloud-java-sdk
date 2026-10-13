// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ListMetaProfilingSkillJobPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMetaProfilingSkillJobPageResponseBody body;

    public static ListMetaProfilingSkillJobPageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMetaProfilingSkillJobPageResponse self = new ListMetaProfilingSkillJobPageResponse();
        return TeaModel.build(map, self);
    }

    public ListMetaProfilingSkillJobPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMetaProfilingSkillJobPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMetaProfilingSkillJobPageResponse setBody(ListMetaProfilingSkillJobPageResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMetaProfilingSkillJobPageResponseBody getBody() {
        return this.body;
    }

}
