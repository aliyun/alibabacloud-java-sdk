// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyCasterProgramRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("CasterId")
    public String casterId;

    @NameInMap("Episode")
    public java.util.List<ModifyCasterProgramRequestEpisode> episode;

    public static ModifyCasterProgramRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCasterProgramRequest self = new ModifyCasterProgramRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCasterProgramRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyCasterProgramRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public ModifyCasterProgramRequest setEpisode(java.util.List<ModifyCasterProgramRequestEpisode> episode) {
        this.episode = episode;
        return this;
    }
    public java.util.List<ModifyCasterProgramRequestEpisode> getEpisode() {
        return this.episode;
    }

    public static class ModifyCasterProgramRequestEpisode extends TeaModel {
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

        @NameInMap("ComponentId")
        public java.util.List<String> componentId;

        @NameInMap("SwitchType")
        public String switchType;

        public static ModifyCasterProgramRequestEpisode build(java.util.Map<String, ?> map) throws Exception {
            ModifyCasterProgramRequestEpisode self = new ModifyCasterProgramRequestEpisode();
            return TeaModel.build(map, self);
        }

        public ModifyCasterProgramRequestEpisode setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ModifyCasterProgramRequestEpisode setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ModifyCasterProgramRequestEpisode setEpisodeName(String episodeName) {
            this.episodeName = episodeName;
            return this;
        }
        public String getEpisodeName() {
            return this.episodeName;
        }

        public ModifyCasterProgramRequestEpisode setEpisodeType(String episodeType) {
            this.episodeType = episodeType;
            return this;
        }
        public String getEpisodeType() {
            return this.episodeType;
        }

        public ModifyCasterProgramRequestEpisode setEpisodeId(String episodeId) {
            this.episodeId = episodeId;
            return this;
        }
        public String getEpisodeId() {
            return this.episodeId;
        }

        public ModifyCasterProgramRequestEpisode setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ModifyCasterProgramRequestEpisode setComponentId(java.util.List<String> componentId) {
            this.componentId = componentId;
            return this;
        }
        public java.util.List<String> getComponentId() {
            return this.componentId;
        }

        public ModifyCasterProgramRequestEpisode setSwitchType(String switchType) {
            this.switchType = switchType;
            return this;
        }
        public String getSwitchType() {
            return this.switchType;
        }

    }

}
