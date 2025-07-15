// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteCasterEpisodeGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCasterEpisodeGroupResponseBody body;

    public static DeleteCasterEpisodeGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCasterEpisodeGroupResponse self = new DeleteCasterEpisodeGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCasterEpisodeGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCasterEpisodeGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCasterEpisodeGroupResponse setBody(DeleteCasterEpisodeGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCasterEpisodeGroupResponseBody getBody() {
        return this.body;
    }

}
