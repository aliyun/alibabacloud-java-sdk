// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyCasterProgramRequest extends TeaModel {
    /**
     * <p>The ID of the production studio.</p>
     * <ul>
     * <li>If the production studio was created by calling the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation, check the value of the response parameter CasterId to obtain the ID.</li>
     * <li>If the production studio was created by using the ApsaraVideo Live console, obtain the ID on the <strong>Production Studio Management</strong> page. To go to the page, log on to the <strong>ApsaraVideo Live console</strong> and click <strong>Production Studios</strong> in the left-side navigation pane.</li>
     * </ul>
     * <blockquote>
     * <p> You can find the ID of the production studio in the Instance ID/Name column.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a2b8e671-2fe5-4642-a2ec-bf93880e****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    /**
     * <p>The episodes.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Episode")
    public java.util.List<ModifyCasterProgramRequestEpisode> episode;

    @NameInMap("OwnerId")
    public Long ownerId;

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
         * <p>The components. Components in the production studio are listed from the bottom to the top in an array. When the production studio switches to another video resource, the components are also switched.</p>
         * <ul>
         * <li>This parameter is required and available only when EpisodeType is set to <strong>Component</strong>.</li>
         * <li>This parameter is optional when EpisodeType is set to <strong>Resource</strong>. This indicates that the components are bound to and switched together with video resources.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[&quot;a2b8e671-2fe5-4642-a2ec-bf93888****&quot; ]</p>
         */
        @NameInMap("ComponentId")
        public java.util.List<String> componentId;

        /**
         * <p>The end time of the episode. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-06-29T10:04:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The ID of the episode. If the episode was added by calling the <a href="https://help.aliyun.com/document_detail/2848068.html">AddCasterEpisode</a> operation, check the value of the response parameter EpisodeId to obtain the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>a2b8e671-2fe5-4642-a2ec-bf938887****</p>
         */
        @NameInMap("EpisodeId")
        public String episodeId;

        /**
         * <p>The name of the episode.</p>
         * 
         * <strong>example:</strong>
         * <p>program_name_2</p>
         */
        @NameInMap("EpisodeName")
        public String episodeName;

        /**
         * <p>The type of the episode. Valid values:</p>
         * <ul>
         * <li><strong>Resource</strong>: a video resource</li>
         * <li><strong>Component</strong>: a component</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Resource</p>
         */
        @NameInMap("EpisodeType")
        public String episodeType;

        /**
         * <p>The ID of the video resource. If the video resource was added by calling the <a href="https://help.aliyun.com/document_detail/2848020.html">AddCasterVideoResource</a> operation, check the value of the response parameter ResourceId to obtain the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>a2b8e671-2fe5-4642-a2ec-bf938887****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The start time of the episode. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-06-29T09:02:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The policy for switching episodes. This parameter takes effect only when EpisodeType is set to <strong>Resource</strong>. Valid values:</p>
         * <ul>
         * <li><strong>TimeFirst</strong>: The episode starts when the previous episode ends and ends when the next episode starts. If no next episode exists, the episode keeps repeating until a new episode is added or the production studio stops. This value is required for live video resources.</li>
         * <li><strong>ContentFirst</strong>: The episode starts and ends as scheduled.</li>
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
