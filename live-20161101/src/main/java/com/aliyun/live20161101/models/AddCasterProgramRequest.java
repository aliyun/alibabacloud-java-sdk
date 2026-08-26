// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCasterProgramRequest extends TeaModel {
    /**
     * <p>The production studio ID.</p>
     * <ul>
     * <li><p>If you created the production studio by calling the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster operation</a>, check the CasterId value returned by the CreateCaster operation.</p>
     * </li>
     * <li><p>If you created the production studio in the ApsaraVideo Live console, navigate to <strong>ApsaraVideo Live console</strong> &gt; <strong>Production Studio</strong> &gt; <strong>Cloud Production Studio</strong> to view the production studio name.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The production studio name in the production studio list on the Cloud Production Studio page is the production studio ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LIVEPRODUCER_POST-cn-0pp1czt****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    /**
     * <p>The program list information.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Episode")
    public java.util.List<AddCasterProgramRequestEpisode> episode;

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
         * <p>The component list. Elements are arranged from bottom to top in order.</p>
         * <blockquote>
         * <p>Notice: This parameter is valid and required when Episode.N.EpisodeType is set to <strong>Component</strong>.</p>
         * </blockquote>
         * <p> When the node type is <strong>Resource</strong>, this indicates that the component is bound to the video source and switches synchronously.</p>
         * 
         * <strong>example:</strong>
         * <p>[ &quot;a2b8e671-2fe5-4642-a2ec-bf931826****&quot;,  &quot;a2b8e671-2fe5-4642-a2ec-28374657****&quot;]</p>
         */
        @NameInMap("ComponentId")
        public java.util.List<String> componentId;

        /**
         * <p>The end time. Format: <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC). This parameter is required. If not specified, MissingParameter is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-06-29T10:02:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The program name.</p>
         * 
         * <strong>example:</strong>
         * <p>program_name_1</p>
         */
        @NameInMap("EpisodeName")
        public String episodeName;

        /**
         * <p>The node type. Valid values: </p>
         * <ul>
         * <li><strong>Resource</strong>: video source. If you select Resource, you must also set the request parameters Episode.N.ResourceId and Episode.N.SwitchType.</li>
         * <li><strong>Component</strong>: component. If you select Component, you must also set the request parameter Episode.N.ComponentId.N.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>When Resource is selected and the referenced resource contains a VodUrl (video-on-demand file), EndTime - StartTime cannot exceed the actual playback duration (in seconds) of the VOD file. Otherwise, InvalidParameter.EndTime is returned.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Resource</p>
         */
        @NameInMap("EpisodeType")
        public String episodeType;

        /**
         * <p>The video source ID.</p>
         * <blockquote>
         * <p>Notice: This parameter is valid and required when Episode.N.EpisodeType is set to <strong>Resource</strong>.</p>
         * </blockquote>
         * <p> This parameter is not applicable when Episode.N.EpisodeType is set to <strong>Component</strong>.</p>
         * <p>If you added the video source by calling the <a href="https://help.aliyun.com/document_detail/60250.html">AddCasterVideoResource operation</a>, check the ResourceId value returned by the AddCasterVideoResource operation.</p>
         * 
         * <strong>example:</strong>
         * <p>a2b8e671-2fe5-4642-a2ec-bf93880e****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The start time. Format: <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC). This parameter is required. If not specified, MissingParameter is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-06-29T09:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The switch policy. Valid values:</p>
         * <blockquote>
         * <p>Notice: This parameter is valid only when Episode.N.EpisodeType is set to <strong>Resource</strong>.</p>
         * </blockquote>
         * <ul>
         * <li><strong>TimeFirst</strong>: time first. Live video sources can only use the time first policy. </li>
         * <li><strong>ContentFirst</strong>: content first.</li>
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
