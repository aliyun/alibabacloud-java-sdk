// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteCasterEpisodeGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteCasterEpisodeGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCasterEpisodeGroupResponse self = new DeleteCasterEpisodeGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCasterEpisodeGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
