// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCasterEpisodeResponseBody extends TeaModel {
    @NameInMap("EpisodeId")
    public String episodeId;

    @NameInMap("RequestId")
    public String requestId;

    public static AddCasterEpisodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddCasterEpisodeResponseBody self = new AddCasterEpisodeResponseBody();
        return TeaModel.build(map, self);
    }

    public AddCasterEpisodeResponseBody setEpisodeId(String episodeId) {
        this.episodeId = episodeId;
        return this;
    }
    public String getEpisodeId() {
        return this.episodeId;
    }

    public AddCasterEpisodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
