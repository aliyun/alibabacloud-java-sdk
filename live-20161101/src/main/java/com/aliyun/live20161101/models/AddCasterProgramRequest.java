// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCasterProgramRequest extends TeaModel {
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
     * <p>LIVEPRODUCER_POST-cn-0pp1czt****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    /**
     * <p>The information about episodes in the episode list.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Episode")
    public java.util.List<AddCasterProgramRequestEpisode> episode;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

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

    public AddCasterProgramRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddCasterProgramRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class AddCasterProgramRequestEpisode extends TeaModel {
        /**
         * <p>The components. Components in the production studio are listed from the bottom to the top in an array.</p>
         * <blockquote>
         * <p> This parameter is required and takes effect when the Episode.N.EpisodeType parameter is set to Component.</p>
         * </blockquote>
         * <p>This parameter is optional when the Episode.N.EpisodeType parameter is set to <strong>Resource</strong>. In this case, if this parameter is specified, the components are bound to and switched together with video resources.</p>
         * 
         * <strong>example:</strong>
         * <p>[ &quot;a2b8e671-2fe5-4642-a2ec-bf931826****&quot;,  &quot;a2b8e671-2fe5-4642-a2ec-28374657****&quot;]</p>
         */
        @NameInMap("ComponentId")
        public java.util.List<String> componentId;

        /**
         * <p>The end time of the episode. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-06-29T10:02:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The name of the episode.</p>
         * 
         * <strong>example:</strong>
         * <p>program_name_1</p>
         */
        @NameInMap("EpisodeName")
        public String episodeName;

        /**
         * <p>The type of the episode.</p>
         * <ul>
         * <li><strong>Resource</strong>: a video resource If you set this parameter to Resource, you must specify the Episode.N.ResourceId and Episode.N.SwitchType parameters.</li>
         * <li><strong>Component</strong>: a component If you set this parameter to Component, you must specify the Episode.N.ComponentId.N parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Resource</p>
         */
        @NameInMap("EpisodeType")
        public String episodeType;

        /**
         * <p>The ID of the video resource.</p>
         * <blockquote>
         * <p> This parameter takes effect and is required when the Episode.N.EpisodeType parameter is set to Resource.</p>
         * </blockquote>
         * <p>\
         * This parameter is invalid if you set the Episode.N.EpisodeType parameter to <strong>Component</strong>.</p>
         * <p>If the video resource was added by calling the <a href="https://help.aliyun.com/document_detail/60250.html">AddCasterVideoResource</a> operation, check the value of the response parameter ResourceId to obtain the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>a2b8e671-2fe5-4642-a2ec-bf93880e****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The start time of the episode. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-06-29T09:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The policy for switching episodes. Valid values:</p>
         * <blockquote>
         * <p> This parameter takes effect only when the Episode.N.EpisodeType parameter is set to Resource.</p>
         * </blockquote>
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

        public static AddCasterProgramRequestEpisode build(java.util.Map<String, ?> map) throws Exception {
            AddCasterProgramRequestEpisode self = new AddCasterProgramRequestEpisode();
            return TeaModel.build(map, self);
        }

        public AddCasterProgramRequestEpisode setComponentId(java.util.List<String> componentId) {
            this.componentId = componentId;
            return this;
        }
        public java.util.List<String> getComponentId() {
            return this.componentId;
        }

        public AddCasterProgramRequestEpisode setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public AddCasterProgramRequestEpisode setEpisodeName(String episodeName) {
            this.episodeName = episodeName;
            return this;
        }
        public String getEpisodeName() {
            return this.episodeName;
        }

        public AddCasterProgramRequestEpisode setEpisodeType(String episodeType) {
            this.episodeType = episodeType;
            return this;
        }
        public String getEpisodeType() {
            return this.episodeType;
        }

        public AddCasterProgramRequestEpisode setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public AddCasterProgramRequestEpisode setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
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
