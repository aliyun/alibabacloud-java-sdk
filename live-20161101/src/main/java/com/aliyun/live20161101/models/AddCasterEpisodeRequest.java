// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCasterEpisodeRequest extends TeaModel {
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
     * <p>The components. Components in the production studio are listed from the bottom to the top in an array.</p>
     * <p>If a component was added by calling the <a href="https://help.aliyun.com/document_detail/2848030.html">AddCasterComponent</a> operation, check the value of the response parameter ComponentId to obtain the component ID.</p>
     * <ul>
     * <li>This parameter takes effect and is required when the EpisodeType parameter is set to <strong>Component</strong>.</li>
     * <li>This parameter is optional when the EpisodeType parameter is set to <strong>Resource</strong>. In this case, if this parameter is specified, the components are bound to and switched together with video resources.</li>
     * </ul>
     * <blockquote>
     * <p> The variable N specifies the sequence number of the component. For example, <strong>ComponentId.1</strong> specifies the ID of the first component and <strong>ComponentId.2</strong> specifies the ID of the second component.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[&quot;a2b8e671-2fe5-4642-a2ec-bf93880e****&quot;]</p>
     */
    @NameInMap("ComponentId")
    public java.util.List<String> componentId;

    /**
     * <p>The time when the episode ends. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2016-06-29T09:10:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The name of the episode.</p>
     * 
     * <strong>example:</strong>
     * <p>episode_1</p>
     */
    @NameInMap("EpisodeName")
    public String episodeName;

    /**
     * <p>The type of the episode. Valid values:</p>
     * <ul>
     * <li><strong>Resource</strong>: a video resource.</li>
     * <li><strong>Component</strong>: a component.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Resource</p>
     */
    @NameInMap("EpisodeType")
    public String episodeType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the video resource.</p>
     * <blockquote>
     * <p> This parameter takes effect and is required when the EpisodeType parameter is set to Resource.</p>
     * </blockquote>
     * <p>\
     * If the video resource was added by calling the <a href="https://help.aliyun.com/document_detail/2848020.html">AddCasterVideoResource</a> operation, check the value of the response parameter ResourceId to obtain the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>a2b8e671-2fe5-4642-a2ec-bf93880e****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The time when the episode starts. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2016-06-29T08:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The policy for switching episodes. Valid values:</p>
     * <ul>
     * <li><strong>TimeFirst</strong>: The episode starts when the preceding episode ends and ends when the next episode starts. If no next episode exists, the episode keeps repeating until a new episode is added or the production studio stops.</li>
     * <li><strong>ContentFirst</strong>: The episode starts and ends as scheduled.</li>
     * </ul>
     * <p>This parameter takes effect only when the EpisodeType parameter is set to Resource.</p>
     * <blockquote>
     * <p> This parameter must be set to TimeFirst when the video resource is a live stream.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TimeFirst</p>
     */
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

    public AddCasterEpisodeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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
