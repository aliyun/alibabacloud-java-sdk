// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCasterProgramResponseBody extends TeaModel {
    @NameInMap("EpisodeIds")
    public AddCasterProgramResponseBodyEpisodeIds episodeIds;

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
