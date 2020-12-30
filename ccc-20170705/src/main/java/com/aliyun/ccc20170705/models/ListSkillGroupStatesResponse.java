// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListSkillGroupStatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSkillGroupStatesResponseBody body;

    public static ListSkillGroupStatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSkillGroupStatesResponse self = new ListSkillGroupStatesResponse();
        return TeaModel.build(map, self);
    }

    public ListSkillGroupStatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSkillGroupStatesResponse setBody(ListSkillGroupStatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSkillGroupStatesResponseBody getBody() {
        return this.body;
    }

}
