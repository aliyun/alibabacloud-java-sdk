// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCasterEpisodeRequest extends TeaModel {
    /**
     * <p>The ID of the production studio.</p>
     * <ul>
     * <li><p>If you create a production studio by calling the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation, check the value of the CasterId parameter that is returned.</p>
     * </li>
     * <li><p>If you create a production studio in the LIVE console, go to the <strong>LIVE Console</strong>&gt; <strong>Production Studio</strong> &gt; <strong>Production Studio</strong> page to view the ID.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The name of the production studio in the production studio list serves as the production studio ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LIVEPRODUCER_POST-cn-0pp1czt****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    /**
     * <p>A list of component IDs. The components are layered from bottom to top in the specified order.</p>
     * <p>If you add a component by calling the <a href="https://help.aliyun.com/document_detail/2848030.html">AddCasterComponent</a> operation, check the value of the ComponentId parameter that is returned.</p>
     * <ul>
     * <li><p>This parameter is required and applies only when the resource type is <strong>Component</strong>.</p>
     * </li>
     * <li><p>This parameter is optional when the resource type is <strong>Resource</strong>. If you specify this parameter, the component is attached to the video source and they are switched synchronously.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>N specifies the sequence number of a component ID. For example, <strong>ComponentId.1</strong> specifies the first component ID and <strong>ComponentId.2</strong> specifies the second component ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[&quot;a2b8e671-2fe5-4642-a2ec-bf93880e****&quot;]</p>
     */
    @NameInMap("ComponentId")
    public java.util.List<String> componentId;

    /**
     * <p>The end time. The time is in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
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
     * <p>The node type. Valid values:</p>
     * <ul>
     * <li><p><strong>Resource</strong>: A video source. If you set this parameter to Resource, you must also specify the ResourceId and SwitchType parameters.</p>
     * </li>
     * <li><p><strong>Component</strong>: A component.</p>
     * </li>
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

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the video source.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>This parameter is required and applies only when EpisodeType is set to Resource.</p>
     * <p>If you add a video source by calling the <a href="https://help.aliyun.com/document_detail/2848020.html">AddCasterVideoResource</a> operation, check the value of the ResourceId parameter that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>a2b8e671-2fe5-4642-a2ec-bf93880e****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The start time. The time is in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2016-06-29T08:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The switch policy. Valid values:</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>This parameter applies only when EpisodeType is set to Resource.</p>
     * <ul>
     * <li><p><strong>TimeFirst</strong>: Time first.</p>
     * </li>
     * <li><p><strong>ContentFirst</strong>: Content first.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>For more information about video sources, see <a href="https://help.aliyun.com/document_detail/66094.html">Add a video source</a>.</p>
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
