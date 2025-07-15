// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCasterEpisodeResponseBody extends TeaModel {
    /**
     * <p>The ID of the episode. You can use the ID as a request parameter in the API operation that is used to query the information about the episode list, modify the configurations of the episode, and delete the episode.</p>
     * 
     * <strong>example:</strong>
     * <p>21926b36-7dd2-4fde-ae25-51b5bc8e****</p>
     */
    @NameInMap("EpisodeId")
    public String episodeId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F****</p>
     */
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
