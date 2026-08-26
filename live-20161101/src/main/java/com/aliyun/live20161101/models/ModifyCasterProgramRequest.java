// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyCasterProgramRequest extends TeaModel {
    /**
     * <p>The ID of the production studio.</p>
     * <ul>
     * <li><p>If you create a production studio by calling the <a href="">CreateCaster</a> operation, use the value of the CasterId parameter that is returned in the response.</p>
     * </li>
     * <li><p>If you create a production studio in the ApsaraVideo Live console, go to the <strong>Production Studio</strong> &gt; <strong>Cloud Production Studio</strong> page to view the ID.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The name of the production studio in the list on the Cloud Production Studio page is the production studio ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a2b8e671-2fe5-4642-a2ec-bf93880e****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    /**
     * <p>The program information.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Episode")
    public java.util.List<ModifyCasterProgramRequestEpisode> episode;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyCasterProgramRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCasterProgramRequest self = new ModifyCasterProgramRequest();
        return TeaModel.build(map, self);
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

    public ModifyCasterProgramRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyCasterProgramRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class ModifyCasterProgramRequestEpisode extends TeaModel {
        /**
         * <p>The list of component IDs. The components are layered from bottom to top in the order they are listed. The components are switched in sync with the video source.</p>
         * <ul>
         * <li><p>This parameter is required and takes effect only when the node type is <strong>Component</strong>.</p>
         * </li>
         * <li><p>If the node type is <strong>Resource</strong>, the components are attached to the video source and switched in sync.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[&quot;a2b8e671-2fe5-4642-a2ec-bf93888****&quot; ]</p>
         */
        @NameInMap("ComponentId")
        public java.util.List<String> componentId;

        /**
         * <p>The end time. The time is in UTC. The format is <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-06-29T10:04:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The program ID. If you add a program for the production studio by calling the <a href="">AddCasterEpisode</a> operation, use the value of the EpisodeId parameter that is returned in the response.</p>
         * 
         * <strong>example:</strong>
         * <p>a2b8e671-2fe5-4642-a2ec-bf938887****</p>
         */
        @NameInMap("EpisodeId")
        public String episodeId;

        /**
         * <p>The program name.</p>
         * 
         * <strong>example:</strong>
         * <p>program_name_2</p>
         */
        @NameInMap("EpisodeName")
        public String episodeName;

        /**
         * <p>The program type. Valid values:</p>
         * <ul>
         * <li><p><strong>Resource</strong>: video source.</p>
         * </li>
         * <li><p><strong>Component</strong>: component.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Resource</p>
         */
        @NameInMap("EpisodeType")
        public String episodeType;

        /**
         * <p>The ID of the video source. If you add a video source for the production studio by calling the <a href="">AddCasterVideoResource</a> operation, use the value of the ResourceId parameter that is returned in the response.</p>
         * 
         * <strong>example:</strong>
         * <p>a2b8e671-2fe5-4642-a2ec-bf938887****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The start time. The time is in UTC. The format is <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-06-29T09:02:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The switch policy. This parameter is valid only when the node type is <strong>Resource</strong>.</p>
         * <ul>
         * <li><p><strong>TimeFirst</strong>: time-first. This is the only valid policy for live stream video sources.</p>
         * </li>
         * <li><p><strong>ContentFirst</strong>: content-first.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TimeFirst</p>
         */
        @NameInMap("SwitchType")
        public String switchType;

        public static ModifyCasterProgramRequestEpisode build(java.util.Map<String, ?> map) throws Exception {
            ModifyCasterProgramRequestEpisode self = new ModifyCasterProgramRequestEpisode();
            return TeaModel.build(map, self);
        }

        public ModifyCasterProgramRequestEpisode setComponentId(java.util.List<String> componentId) {
            this.componentId = componentId;
            return this;
        }
        public java.util.List<String> getComponentId() {
            return this.componentId;
        }

        public ModifyCasterProgramRequestEpisode setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ModifyCasterProgramRequestEpisode setEpisodeId(String episodeId) {
            this.episodeId = episodeId;
            return this;
        }
        public String getEpisodeId() {
            return this.episodeId;
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

        public ModifyCasterProgramRequestEpisode setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ModifyCasterProgramRequestEpisode setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
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
