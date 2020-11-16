// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCasterProgramRequest extends TeaModel {
    @NameInMap("CasterId")
    @Validation(required = true)
    public String casterId;

    @NameInMap("Episode")
    @Validation(required = true)
    public java.util.List<AddCasterProgramRequestEpisode> episode;

    public static AddCasterProgramRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCasterProgramRequest self = new AddCasterProgramRequest();
        return TeaModel.build(map, self);
    }

    public AddCasterProgramRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public AddCasterProgramRequest setEpisode(java.util.List<AddCasterProgramRequestEpisode> episode) {
        this.episode = episode;
        return this;
    }
    public java.util.List<AddCasterProgramRequestEpisode> getEpisode() {
        return this.episode;
    }

    public static class AddCasterProgramRequestEpisode extends TeaModel {
        @NameInMap("EpisodeType")
        public String episodeType;

        @NameInMap("EpisodeName")
        public String episodeName;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ComponentId")
        public java.util.List<String> componentId;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("SwitchType")
        public String switchType;

        public static AddCasterProgramRequestEpisode build(java.util.Map<String, ?> map) throws Exception {
            AddCasterProgramRequestEpisode self = new AddCasterProgramRequestEpisode();
            return TeaModel.build(map, self);
        }

        public AddCasterProgramRequestEpisode setEpisodeType(String episodeType) {
            this.episodeType = episodeType;
            return this;
        }
        public String getEpisodeType() {
            return this.episodeType;
        }

        public AddCasterProgramRequestEpisode setEpisodeName(String episodeName) {
            this.episodeName = episodeName;
            return this;
        }
        public String getEpisodeName() {
            return this.episodeName;
        }

        public AddCasterProgramRequestEpisode setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public AddCasterProgramRequestEpisode setComponentId(java.util.List<String> componentId) {
            this.componentId = componentId;
            return this;
        }
        public java.util.List<String> getComponentId() {
            return this.componentId;
        }

        public AddCasterProgramRequestEpisode setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public AddCasterProgramRequestEpisode setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public AddCasterProgramRequestEpisode setSwitchType(String switchType) {
            this.switchType = switchType;
            return this;
        }
        public String getSwitchType() {
            return this.switchType;
        }

    }

}
