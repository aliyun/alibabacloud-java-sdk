// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyCasterEpisodeRequest extends TeaModel {
    @NameInMap("CasterId")
    @Validation(required = true)
    public String casterId;

    @NameInMap("EpisodeId")
    @Validation(required = true)
    public String episodeId;

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

    public static ModifyCasterEpisodeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCasterEpisodeRequest self = new ModifyCasterEpisodeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCasterEpisodeRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public ModifyCasterEpisodeRequest setEpisodeId(String episodeId) {
        this.episodeId = episodeId;
        return this;
    }
    public String getEpisodeId() {
        return this.episodeId;
    }

    public ModifyCasterEpisodeRequest setEpisodeName(String episodeName) {
        this.episodeName = episodeName;
        return this;
    }
    public String getEpisodeName() {
        return this.episodeName;
    }

    public ModifyCasterEpisodeRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ModifyCasterEpisodeRequest setComponentId(java.util.List<String> componentId) {
        this.componentId = componentId;
        return this;
    }
    public java.util.List<String> getComponentId() {
        return this.componentId;
    }

    public ModifyCasterEpisodeRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ModifyCasterEpisodeRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ModifyCasterEpisodeRequest setSwitchType(String switchType) {
        this.switchType = switchType;
        return this;
    }
    public String getSwitchType() {
        return this.switchType;
    }

}
