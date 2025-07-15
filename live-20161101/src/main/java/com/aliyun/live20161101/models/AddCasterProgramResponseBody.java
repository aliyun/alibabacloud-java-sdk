// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCasterProgramResponseBody extends TeaModel {
    /**
     * <p>The IDs of the episodes. The episode IDs are listed in the same order as specified by the variable N.</p>
     */
    @NameInMap("EpisodeIds")
    public AddCasterProgramResponseBodyEpisodeIds episodeIds;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddCasterProgramResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddCasterProgramResponseBody self = new AddCasterProgramResponseBody();
        return TeaModel.build(map, self);
    }

    public AddCasterProgramResponseBody setEpisodeIds(AddCasterProgramResponseBodyEpisodeIds episodeIds) {
        this.episodeIds = episodeIds;
        return this;
    }
    public AddCasterProgramResponseBodyEpisodeIds getEpisodeIds() {
        return this.episodeIds;
    }

    public AddCasterProgramResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddCasterProgramResponseBodyEpisodeIdsEpisodeId extends TeaModel {
        /**
         * <p>The ID of the episode. You can use the ID as a request parameter in the API operation that is used to modify the episode list, query the information about the episode list, delete the episode, or modify the configurations of the episode.</p>
         * 
         * <strong>example:</strong>
         * <p>16A96B9A-F203-4EC5-8E43-CB92E68F****</p>
         */
        @NameInMap("EpisodeId")
        public String episodeId;

        public static AddCasterProgramResponseBodyEpisodeIdsEpisodeId build(java.util.Map<String, ?> map) throws Exception {
            AddCasterProgramResponseBodyEpisodeIdsEpisodeId self = new AddCasterProgramResponseBodyEpisodeIdsEpisodeId();
            return TeaModel.build(map, self);
        }

        public AddCasterProgramResponseBodyEpisodeIdsEpisodeId setEpisodeId(String episodeId) {
            this.episodeId = episodeId;
            return this;
        }
        public String getEpisodeId() {
            return this.episodeId;
        }

    }

    public static class AddCasterProgramResponseBodyEpisodeIds extends TeaModel {
        @NameInMap("EpisodeId")
        public java.util.List<AddCasterProgramResponseBodyEpisodeIdsEpisodeId> episodeId;

        public static AddCasterProgramResponseBodyEpisodeIds build(java.util.Map<String, ?> map) throws Exception {
            AddCasterProgramResponseBodyEpisodeIds self = new AddCasterProgramResponseBodyEpisodeIds();
            return TeaModel.build(map, self);
        }

        public AddCasterProgramResponseBodyEpisodeIds setEpisodeId(java.util.List<AddCasterProgramResponseBodyEpisodeIdsEpisodeId> episodeId) {
            this.episodeId = episodeId;
            return this;
        }
        public java.util.List<AddCasterProgramResponseBodyEpisodeIdsEpisodeId> getEpisodeId() {
            return this.episodeId;
        }

    }

}
