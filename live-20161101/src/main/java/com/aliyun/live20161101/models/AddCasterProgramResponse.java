// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCasterProgramResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("EpisodeIds")
    @Validation(required = true)
    public AddCasterProgramResponseEpisodeIds episodeIds;

    public static AddCasterProgramResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCasterProgramResponse self = new AddCasterProgramResponse();
        return TeaModel.build(map, self);
    }

    public AddCasterProgramResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddCasterProgramResponse setEpisodeIds(AddCasterProgramResponseEpisodeIds episodeIds) {
        this.episodeIds = episodeIds;
        return this;
    }
    public AddCasterProgramResponseEpisodeIds getEpisodeIds() {
        return this.episodeIds;
    }

    public static class AddCasterProgramResponseEpisodeIdsEpisodeId extends TeaModel {
        @NameInMap("EpisodeId")
        @Validation(required = true)
        public String episodeId;

        public static AddCasterProgramResponseEpisodeIdsEpisodeId build(java.util.Map<String, ?> map) throws Exception {
            AddCasterProgramResponseEpisodeIdsEpisodeId self = new AddCasterProgramResponseEpisodeIdsEpisodeId();
            return TeaModel.build(map, self);
        }

        public AddCasterProgramResponseEpisodeIdsEpisodeId setEpisodeId(String episodeId) {
            this.episodeId = episodeId;
            return this;
        }
        public String getEpisodeId() {
            return this.episodeId;
        }

    }

    public static class AddCasterProgramResponseEpisodeIds extends TeaModel {
        @NameInMap("EpisodeId")
        @Validation(required = true)
        public java.util.List<AddCasterProgramResponseEpisodeIdsEpisodeId> episodeId;

        public static AddCasterProgramResponseEpisodeIds build(java.util.Map<String, ?> map) throws Exception {
            AddCasterProgramResponseEpisodeIds self = new AddCasterProgramResponseEpisodeIds();
            return TeaModel.build(map, self);
        }

        public AddCasterProgramResponseEpisodeIds setEpisodeId(java.util.List<AddCasterProgramResponseEpisodeIdsEpisodeId> episodeId) {
            this.episodeId = episodeId;
            return this;
        }
        public java.util.List<AddCasterProgramResponseEpisodeIdsEpisodeId> getEpisodeId() {
            return this.episodeId;
        }

    }

}
