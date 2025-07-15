// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteCasterEpisodeResponseBody extends TeaModel {
    /**
     * <p>The ID of the production studio. You can specify the ID as a parameter in the request to modify the episode in the production studio.</p>
     * 
     * <strong>example:</strong>
     * <p>a2b8e671-2fe5-4642-a2ec-bf93880e****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    /**
     * <p>The ID of the episode. You can specify the ID as a parameter in the request to modify the episode in the production studio.</p>
     * 
     * <strong>example:</strong>
     * <p>a2b8e671-2fe5-4642-a2ec-bf932738****</p>
     */
    @NameInMap("EpisodeId")
    public String episodeId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
     */
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
