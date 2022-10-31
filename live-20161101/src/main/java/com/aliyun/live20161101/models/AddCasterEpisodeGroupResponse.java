// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCasterEpisodeGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddCasterEpisodeGroupResponseBody body;

    public static AddCasterEpisodeGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCasterEpisodeGroupResponse self = new AddCasterEpisodeGroupResponse();
        return TeaModel.build(map, self);
    }

    public AddCasterEpisodeGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddCasterEpisodeGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddCasterEpisodeGroupResponse setBody(AddCasterEpisodeGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AddCasterEpisodeGroupResponseBody getBody() {
        return this.body;
    }

}
