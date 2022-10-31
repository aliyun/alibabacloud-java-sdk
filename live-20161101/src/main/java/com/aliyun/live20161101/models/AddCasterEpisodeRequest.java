// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCasterEpisodeRequest extends TeaModel {
    @NameInMap("CasterId")
    public String casterId;

    @NameInMap("ComponentId")
    public java.util.List<String> componentId;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("EpisodeName")
    public String episodeName;

    @NameInMap("EpisodeType")
    public String episodeType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("SwitchType")
    public String switchType;

    public static AddCasterEpisodeRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCasterEpisodeRequest self = new AddCasterEpisodeRequest();
        return TeaModel.build(map, self);
    }

    public AddCasterEpisodeRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public AddCasterEpisodeRequest setComponentId(java.util.List<String> componentId) {
        this.componentId = componentId;
        return this;
    }
    public java.util.List<String> getComponentId() {
        return this.componentId;
    }

    public AddCasterEpisodeRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public AddCasterEpisodeRequest setEpisodeName(String episodeName) {
        this.episodeName = episodeName;
        return this;
    }
    public String getEpisodeName() {
        return this.episodeName;
    }

    public AddCasterEpisodeRequest setEpisodeType(String episodeType) {
        this.episodeType = episodeType;
        return this;
    }
    public String getEpisodeType() {
        return this.episodeType;
    }

    public AddCasterEpisodeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddCasterEpisodeRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public AddCasterEpisodeRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public AddCasterEpisodeRequest setSwitchType(String switchType) {
        this.switchType = switchType;
        return this;
    }
    public String getSwitchType() {
        return this.switchType;
    }

}
