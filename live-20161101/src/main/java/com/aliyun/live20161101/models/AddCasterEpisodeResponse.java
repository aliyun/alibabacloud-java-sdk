// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCasterEpisodeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("EpisodeId")
    @Validation(required = true)
    public String episodeId;

    public static AddCasterEpisodeResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCasterEpisodeResponse self = new AddCasterEpisodeResponse();
        return TeaModel.build(map, self);
    }

    public AddCasterEpisodeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddCasterEpisodeResponse setEpisodeId(String episodeId) {
        this.episodeId = episodeId;
        return this;
    }
    public String getEpisodeId() {
        return this.episodeId;
    }

}
