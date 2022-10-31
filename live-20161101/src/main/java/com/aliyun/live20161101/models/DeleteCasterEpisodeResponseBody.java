// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteCasterEpisodeResponseBody extends TeaModel {
    @NameInMap("CasterId")
    public String casterId;

    @NameInMap("EpisodeId")
    public String episodeId;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCasterEpisodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCasterEpisodeResponseBody self = new DeleteCasterEpisodeResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCasterEpisodeResponseBody setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public DeleteCasterEpisodeResponseBody setEpisodeId(String episodeId) {
        this.episodeId = episodeId;
        return this;
    }
    public String getEpisodeId() {
        return this.episodeId;
    }

    public DeleteCasterEpisodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
