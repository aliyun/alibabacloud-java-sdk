// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyCasterEpisodeResponseBody extends TeaModel {
    /**
     * <p>The ID of the production studio. You can use the ID as a request parameter in the API operation that is used to copy the configurations of a scene, update the configurations of a scene, query the scenes of a production studio, query the audio configurations of a scene, start a scene in the production studio, or stop a scene in the production studio.</p>
     * 
     * <strong>example:</strong>
     * <p>LIVEPRODUCER_POST-cn-0pp1czt****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    /**
     * <p>The ID of the episode. You can use the ID as a request parameter in the API operation that is used to delete an episode list from a production studio, add episodes to an episode list, remove episodes from an episode list, query the information about episodes in an episode list, update episodes in an episode list, delete an episode list, query the information about an episode list, start an episode list, or stop an episode list.</p>
     * 
     * <strong>example:</strong>
     * <p>a2b8e671-2fe5-4642-a2ec-bf938623****</p>
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
