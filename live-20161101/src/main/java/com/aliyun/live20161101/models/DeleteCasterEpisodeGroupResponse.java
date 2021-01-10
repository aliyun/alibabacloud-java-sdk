// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteCasterEpisodeGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteCasterEpisodeGroupResponse setBody(DeleteCasterEpisodeGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCasterEpisodeGroupResponseBody getBody() {
        return this.body;
    }

}
