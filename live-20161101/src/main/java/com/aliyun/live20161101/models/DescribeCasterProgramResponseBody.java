// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCasterProgramResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ProgramEffect")
    public Integer programEffect;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("Episodes")
    public DescribeCasterProgramResponseBodyEpisodes episodes;

    @NameInMap("ProgramName")
    public String programName;

    @NameInMap("CasterId")
    public String casterId;

    public static DescribeCasterProgramResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCasterProgramResponseBody self = new DescribeCasterProgramResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCasterProgramResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCasterProgramResponseBody setProgramEffect(Integer programEffect) {
        this.programEffect = programEffect;
        return this;
    }
    public Integer getProgramEffect() {
        return this.programEffect;
    }

    public DescribeCasterProgramResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribeCasterProgramResponseBody setEpisodes(DescribeCasterProgramResponseBodyEpisodes episodes) {
        this.episodes = episodes;
        return this;
    }
    public DescribeCasterProgramResponseBodyEpisodes getEpisodes() {
        return this.episodes;
    }

    public DescribeCasterProgramResponseBody setProgramName(String programName) {
        this.programName = programName;
        return this;
    }
    public String getProgramName() {
        return this.programName;
    }

    public DescribeCasterProgramResponseBody setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public static class DescribeCasterProgramResponseBodyEpisodesEpisodeComponentIds extends TeaModel {
        @NameInMap("ComponentId")
        public java.util.List<String> componentId;

        public static DescribeCasterProgramResponseBodyEpisodesEpisodeComponentIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterProgramResponseBodyEpisodesEpisodeComponentIds self = new DescribeCasterProgramResponseBodyEpisodesEpisodeComponentIds();
            return TeaModel.build(map, self);
        }

        public DescribeCasterProgramResponseBodyEpisodesEpisodeComponentIds setComponentId(java.util.List<String> componentId) {
            this.componentId = componentId;
            return this;
        }
        public java.util.List<String> getComponentId() {
            return this.componentId;
        }

    }

    public static class DescribeCasterProgramResponseBodyEpisodesEpisode extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("EpisodeName")
        public String episodeName;

        @NameInMap("EpisodeType")
        public String episodeType;

        @NameInMap("EpisodeId")
        public String episodeId;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("SwitchType")
        public String switchType;

        @NameInMap("ComponentIds")
        public DescribeCasterProgramResponseBodyEpisodesEpisodeComponentIds componentIds;

        public static DescribeCasterProgramResponseBodyEpisodesEpisode build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterProgramResponseBodyEpisodesEpisode self = new DescribeCasterProgramResponseBodyEpisodesEpisode();
            return TeaModel.build(map, self);
        }

        public DescribeCasterProgramResponseBodyEpisodesEpisode setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeCasterProgramResponseBodyEpisodesEpisode setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeCasterProgramResponseBodyEpisodesEpisode setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeCasterProgramResponseBodyEpisodesEpisode setEpisodeName(String episodeName) {
            this.episodeName = episodeName;
            return this;
        }
        public String getEpisodeName() {
            return this.episodeName;
        }

        public DescribeCasterProgramResponseBodyEpisodesEpisode setEpisodeType(String episodeType) {
            this.episodeType = episodeType;
            return this;
        }
        public String getEpisodeType() {
            return this.episodeType;
        }

        public DescribeCasterProgramResponseBodyEpisodesEpisode setEpisodeId(String episodeId) {
            this.episodeId = episodeId;
            return this;
        }
        public String getEpisodeId() {
            return this.episodeId;
        }

        public DescribeCasterProgramResponseBodyEpisodesEpisode setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeCasterProgramResponseBodyEpisodesEpisode setSwitchType(String switchType) {
            this.switchType = switchType;
            return this;
        }
        public String getSwitchType() {
            return this.switchType;
        }

        public DescribeCasterProgramResponseBodyEpisodesEpisode setComponentIds(DescribeCasterProgramResponseBodyEpisodesEpisodeComponentIds componentIds) {
            this.componentIds = componentIds;
            return this;
        }
        public DescribeCasterProgramResponseBodyEpisodesEpisodeComponentIds getComponentIds() {
            return this.componentIds;
        }

    }

    public static class DescribeCasterProgramResponseBodyEpisodes extends TeaModel {
        @NameInMap("Episode")
        public java.util.List<DescribeCasterProgramResponseBodyEpisodesEpisode> episode;

        public static DescribeCasterProgramResponseBodyEpisodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterProgramResponseBodyEpisodes self = new DescribeCasterProgramResponseBodyEpisodes();
            return TeaModel.build(map, self);
        }

        public DescribeCasterProgramResponseBodyEpisodes setEpisode(java.util.List<DescribeCasterProgramResponseBodyEpisodesEpisode> episode) {
            this.episode = episode;
            return this;
        }
        public java.util.List<DescribeCasterProgramResponseBodyEpisodesEpisode> getEpisode() {
            return this.episode;
        }

    }

}
