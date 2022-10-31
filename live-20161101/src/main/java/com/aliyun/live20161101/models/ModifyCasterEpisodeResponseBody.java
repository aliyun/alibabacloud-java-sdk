// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyCasterEpisodeResponseBody extends TeaModel {
    @NameInMap("CasterId")
    public String casterId;

    @NameInMap("EpisodeId")
    public String episodeId;

    @NameInMap("RequestId")
    public String requestId;

    public static ModifyCasterEpisodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCasterEpisodeResponseBody self = new ModifyCasterEpisodeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCasterEpisodeResponseBody setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public ModifyCasterEpisodeResponseBody setEpisodeId(String episodeId) {
        this.episodeId = episodeId;
        return this;
    }
    public String getEpisodeId() {
        return this.episodeId;
    }

    public ModifyCasterEpisodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
