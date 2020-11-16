// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteCasterEpisodeRequest extends TeaModel {
    @NameInMap("CasterId")
    @Validation(required = true)
    public String casterId;

    @NameInMap("EpisodeId")
    @Validation(required = true)
    public String episodeId;

    public static DeleteCasterEpisodeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCasterEpisodeRequest self = new DeleteCasterEpisodeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCasterEpisodeRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public DeleteCasterEpisodeRequest setEpisodeId(String episodeId) {
        this.episodeId = episodeId;
        return this;
    }
    public String getEpisodeId() {
        return this.episodeId;
    }

}
