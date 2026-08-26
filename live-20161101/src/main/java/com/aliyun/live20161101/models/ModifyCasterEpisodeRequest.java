// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyCasterEpisodeRequest extends TeaModel {
    /**
     * <p>The ID of the production studio.</p>
     * <ul>
     * <li><p>If you created the production studio by calling the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation, use the CasterId value that is returned in the response.</p>
     * </li>
     * <li><p>If you created the production studio in the LIVE console, find the ID on the Cloud Production Studio page. To go to the page, choose <strong>LIVE Console</strong> &gt; <strong>Production Studio</strong> &gt; <strong>Cloud Production Studio</strong>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The name of a production studio in the list on the Cloud Production Studio page is the production studio ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LIVEPRODUCER_POST-cn-0pp1czt****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    /**
     * <p>The IDs of the components. The components are arranged from bottom to top and are switched in sync with the video source.</p>
     * <ul>
     * <li><p>This parameter is required and takes effect only if EpisodeType is set to <strong>Component</strong>.</p>
     * </li>
     * <li><p>If EpisodeType is set to <strong>Resource</strong>, this parameter specifies the components that are attached to the video source and switched in sync.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>N specifies the Nth component ID. For example, ComponentId.1 specifies the first component ID and ComponentId.2 specifies the second component ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[&quot;16A96B9A-F203-4EC5-8E43-CB92E68F****&quot;]</p>
     */
    @NameInMap("ComponentId")
    public java.util.List<String> componentId;

    /**
     * <p>The end time. The time must be in UTC. The format is <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z.</p>
     * 
     * <strong>example:</strong>
     * <p>2016-06-29T10:20:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the episode.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a2b8e671-2fe5-4642-a2ec-bf938623****</p>
     */
    @NameInMap("EpisodeId")
    public String episodeId;

    /**
     * <p>The name of the episode.</p>
     * 
     * <strong>example:</strong>
     * <p>episode_name_1</p>
     */
    @NameInMap("EpisodeName")
    public String episodeName;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the video source.</p>
     * <ul>
     * <li><p>This parameter is required and takes effect only if EpisodeType is set to <strong>Resource</strong>.</p>
     * </li>
     * <li><p>This parameter is not available if EpisodeType is set to <strong>Component</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E683****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The start time. The time must be in UTC. The format is <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z.</p>
     * 
     * <strong>example:</strong>
     * <p>2016-06-29T09:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The switch policy. This parameter takes effect only if EpisodeType is set to <strong>Resource</strong>.</p>
     * <ul>
     * <li><p><strong>TimeFirst</strong>: time-priority. This is the only policy available for live stream video sources.</p>
     * </li>
     * <li><p><strong>ContentFirst</strong>: content-priority.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>TimeFirst</p>
     */
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

    public ModifyCasterEpisodeRequest setComponentId(java.util.List<String> componentId) {
        this.componentId = componentId;
        return this;
    }
    public java.util.List<String> getComponentId() {
        return this.componentId;
    }

    public ModifyCasterEpisodeRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
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

    public ModifyCasterEpisodeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyCasterEpisodeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyCasterEpisodeRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ModifyCasterEpisodeRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ModifyCasterEpisodeRequest setSwitchType(String switchType) {
        this.switchType = switchType;
        return this;
    }
    public String getSwitchType() {
        return this.switchType;
    }

}
