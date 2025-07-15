// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyCasterEpisodeRequest extends TeaModel {
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
     * <p>The components. Components in the production studio are listed from the bottom to the top in an array. When the production studio switches to another video resource, the components are also switched.</p>
     * <ul>
     * <li>This parameter takes effect and is required only when the EpisodeType parameter is set to <strong>Component</strong>.</li>
     * <li>This parameter is optional when the EpisodeType parameter is set to <strong>Resource</strong>. In this case, if this parameter is specified, the components are bound to and switched together with video resources.</li>
     * </ul>
     * <blockquote>
     * <p> The variable N specifies the sequence number of the component. For example, ComponentId.1 specifies the ID of the first component and ComponentId.2 specifies the ID of the second component.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[&quot;16A96B9A-F203-4EC5-8E43-CB92E68F****&quot;]</p>
     */
    @NameInMap("ComponentId")
    public java.util.List<String> componentId;

    /**
     * <p>The time when the episode ends. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2016-06-29T10:20:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the episode. It is included in the response when you call the <a href="~~94745#doc-api-live-AddCasterEpisode~~" title="Adds an episode to a production studio.">AddCasterEpisode</a> operation.</p>
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

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the video resource. It is included in the response when you call the <a href="~~60250#doc-api-live-AddCasterVideoResource~~" title="Adds a video resource to a production studio.">AddCasterVideoResource</a> operation.</p>
     * <ul>
     * <li>This parameter takes effect and is required only when the EpisodeType is set to <strong>Resource</strong>.</li>
     * <li>If the EpisodeType parameter is set to <strong>Component</strong>, this parameter is invalid.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E683****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The time when the episode starts. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2016-06-29T09:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The policy for switching episodes. This parameter takes effect only when the EpisodeType parameter is set to <strong>Resource</strong>. Valid values:</p>
     * <ul>
     * <li><strong>TimeFirst</strong>: The episode starts when the preceding episode ends and ends when the next episode starts. If no next episode exists, the episode keeps repeating until a new episode is added or the production studio stops. This parameter must be set to TimeFirst when the video resource is a live stream.</li>
     * <li><strong>ContentFirst</strong>: The episode starts and ends as scheduled.</li>
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
