// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCasterProgramResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("CasterId")
    @Validation(required = true)
    public String casterId;

    @NameInMap("ProgramName")
    @Validation(required = true)
    public String programName;

    @NameInMap("ProgramEffect")
    @Validation(required = true)
    public Integer programEffect;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("Episodes")
    @Validation(required = true)
    public DescribeCasterProgramResponseEpisodes episodes;

    public static DescribeCasterProgramResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCasterProgramResponse self = new DescribeCasterProgramResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCasterProgramResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCasterProgramResponse setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public DescribeCasterProgramResponse setProgramName(String programName) {
        this.programName = programName;
        return this;
    }
    public String getProgramName() {
        return this.programName;
    }

    public DescribeCasterProgramResponse setProgramEffect(Integer programEffect) {
        this.programEffect = programEffect;
        return this;
    }
    public Integer getProgramEffect() {
        return this.programEffect;
    }

    public DescribeCasterProgramResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribeCasterProgramResponse setEpisodes(DescribeCasterProgramResponseEpisodes episodes) {
        this.episodes = episodes;
        return this;
    }
    public DescribeCasterProgramResponseEpisodes getEpisodes() {
        return this.episodes;
    }

    public static class DescribeCasterProgramResponseEpisodesEpisodeComponentIds extends TeaModel {
        // ComponentId
        @NameInMap("ComponentId")
        @Validation(required = true)
        public java.util.List<String> componentId;

        public static DescribeCasterProgramResponseEpisodesEpisodeComponentIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterProgramResponseEpisodesEpisodeComponentIds self = new DescribeCasterProgramResponseEpisodesEpisodeComponentIds();
            return TeaModel.build(map, self);
        }

        public DescribeCasterProgramResponseEpisodesEpisodeComponentIds setComponentId(java.util.List<String> componentId) {
            this.componentId = componentId;
            return this;
        }
        public java.util.List<String> getComponentId() {
            return this.componentId;
        }

    }

    public static class DescribeCasterProgramResponseEpisodesEpisode extends TeaModel {
        @NameInMap("EpisodeId")
        @Validation(required = true)
        public String episodeId;

        @NameInMap("EpisodeType")
        @Validation(required = true)
        public String episodeType;

        @NameInMap("EpisodeName")
        @Validation(required = true)
        public String episodeName;

        @NameInMap("ResourceId")
        @Validation(required = true)
        public String resourceId;

        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public String endTime;

        @NameInMap("SwitchType")
        @Validation(required = true)
        public String switchType;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        @NameInMap("ComponentIds")
        @Validation(required = true)
        public DescribeCasterProgramResponseEpisodesEpisodeComponentIds componentIds;

        public static DescribeCasterProgramResponseEpisodesEpisode build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterProgramResponseEpisodesEpisode self = new DescribeCasterProgramResponseEpisodesEpisode();
            return TeaModel.build(map, self);
        }

        public DescribeCasterProgramResponseEpisodesEpisode setEpisodeId(String episodeId) {
            this.episodeId = episodeId;
            return this;
        }
        public String getEpisodeId() {
            return this.episodeId;
        }

        public DescribeCasterProgramResponseEpisodesEpisode setEpisodeType(String episodeType) {
            this.episodeType = episodeType;
            return this;
        }
        public String getEpisodeType() {
            return this.episodeType;
        }

        public DescribeCasterProgramResponseEpisodesEpisode setEpisodeName(String episodeName) {
            this.episodeName = episodeName;
            return this;
        }
        public String getEpisodeName() {
            return this.episodeName;
        }

        public DescribeCasterProgramResponseEpisodesEpisode setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeCasterProgramResponseEpisodesEpisode setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeCasterProgramResponseEpisodesEpisode setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeCasterProgramResponseEpisodesEpisode setSwitchType(String switchType) {
            this.switchType = switchType;
            return this;
        }
        public String getSwitchType() {
            return this.switchType;
        }

        public DescribeCasterProgramResponseEpisodesEpisode setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeCasterProgramResponseEpisodesEpisode setComponentIds(DescribeCasterProgramResponseEpisodesEpisodeComponentIds componentIds) {
            this.componentIds = componentIds;
            return this;
        }
        public DescribeCasterProgramResponseEpisodesEpisodeComponentIds getComponentIds() {
            return this.componentIds;
        }

    }

    public static class DescribeCasterProgramResponseEpisodes extends TeaModel {
        @NameInMap("Episode")
        @Validation(required = true)
        public java.util.List<DescribeCasterProgramResponseEpisodesEpisode> episode;

        public static DescribeCasterProgramResponseEpisodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterProgramResponseEpisodes self = new DescribeCasterProgramResponseEpisodes();
            return TeaModel.build(map, self);
        }

        public DescribeCasterProgramResponseEpisodes setEpisode(java.util.List<DescribeCasterProgramResponseEpisodesEpisode> episode) {
            this.episode = episode;
            return this;
        }
        public java.util.List<DescribeCasterProgramResponseEpisodesEpisode> getEpisode() {
            return this.episode;
        }

    }

}
