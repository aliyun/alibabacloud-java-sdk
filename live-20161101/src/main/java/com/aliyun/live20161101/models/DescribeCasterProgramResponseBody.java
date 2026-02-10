// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCasterProgramResponseBody extends TeaModel {
    /**
     * <p>The ID of the production studio.</p>
     * 
     * <strong>example:</strong>
     * <p>LIVEPRODUCER_POST-cn-0pp1czt****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    @NameInMap("Episodes")
    public DescribeCasterProgramResponseBodyEpisodes episodes;

    /**
     * <p>Indicates whether carousel playback is enabled.</p>
     * <ul>
     * <li><strong>0</strong>: Carousel playback is disabled.</li>
     * <li><strong>1</strong>: Carousel playback is enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ProgramEffect")
    public Integer programEffect;

    /**
     * <p>The name of the episode list.</p>
     * 
     * <strong>example:</strong>
     * <p>programs_name</p>
     */
    @NameInMap("ProgramName")
    public String programName;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static DescribeCasterProgramResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCasterProgramResponseBody self = new DescribeCasterProgramResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCasterProgramResponseBody setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public DescribeCasterProgramResponseBody setEpisodes(DescribeCasterProgramResponseBodyEpisodes episodes) {
        this.episodes = episodes;
        return this;
    }
    public DescribeCasterProgramResponseBodyEpisodes getEpisodes() {
        return this.episodes;
    }

    public DescribeCasterProgramResponseBody setProgramEffect(Integer programEffect) {
        this.programEffect = programEffect;
        return this;
    }
    public Integer getProgramEffect() {
        return this.programEffect;
    }

    public DescribeCasterProgramResponseBody setProgramName(String programName) {
        this.programName = programName;
        return this;
    }
    public String getProgramName() {
        return this.programName;
    }

    public DescribeCasterProgramResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCasterProgramResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
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
        @NameInMap("ComponentIds")
        public DescribeCasterProgramResponseBodyEpisodesEpisodeComponentIds componentIds;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("EpisodeId")
        public String episodeId;

        @NameInMap("EpisodeName")
        public String episodeName;

        @NameInMap("EpisodeType")
        public String episodeType;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("SwitchType")
        public String switchType;

        public static DescribeCasterProgramResponseBodyEpisodesEpisode build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterProgramResponseBodyEpisodesEpisode self = new DescribeCasterProgramResponseBodyEpisodesEpisode();
            return TeaModel.build(map, self);
        }

        public DescribeCasterProgramResponseBodyEpisodesEpisode setComponentIds(DescribeCasterProgramResponseBodyEpisodesEpisodeComponentIds componentIds) {
            this.componentIds = componentIds;
            return this;
        }
        public DescribeCasterProgramResponseBodyEpisodesEpisodeComponentIds getComponentIds() {
            return this.componentIds;
        }

        public DescribeCasterProgramResponseBodyEpisodesEpisode setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeCasterProgramResponseBodyEpisodesEpisode setEpisodeId(String episodeId) {
            this.episodeId = episodeId;
            return this;
        }
        public String getEpisodeId() {
            return this.episodeId;
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

        public DescribeCasterProgramResponseBodyEpisodesEpisode setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeCasterProgramResponseBodyEpisodesEpisode setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeCasterProgramResponseBodyEpisodesEpisode setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeCasterProgramResponseBodyEpisodesEpisode setSwitchType(String switchType) {
            this.switchType = switchType;
            return this;
        }
        public String getSwitchType() {
            return this.switchType;
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
