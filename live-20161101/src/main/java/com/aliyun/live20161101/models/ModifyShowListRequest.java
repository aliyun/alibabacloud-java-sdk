// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyShowListRequest extends TeaModel {
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
     * <p>The episode of the highest priority.</p>
     * <blockquote>
     * <p> You can configure this parameter only before the playback of the episode list starts.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>a2b8e671-2fe5-4642-a2ec-bf93880e****</p>
     */
    @NameInMap("HighPriorityShowId")
    public String highPriorityShowId;

    /**
     * <p>The time at which the episode of the highest priority is played. Format: yyyy-MM-dd\&quot;T\&quot;HH:mm:ss.</p>
     * <blockquote>
     * <p> You can configure this parameter only before the episode list starts playing.\
     * After you configure this parameter, when the specified point in time is reached, any episode that is playing stops and the episode of the highest priority in the episode list starts to play.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-11-23T12:30:00</p>
     */
    @NameInMap("HighPriorityShowStartTime")
    public String highPriorityShowStartTime;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The number of additional times the episode list is played.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>The RepeatTimes parameter specifies the number of repetitions. For example, if you set the value to <strong>0</strong>, the episode list is played <strong>once</strong>. If you set the value to <strong>1</strong>, the episode list is played <strong>twice</strong>.********</p>
     * </li>
     * <li><p>If you set the value to -1, the episode list is repeated indefinitely.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("RepeatTimes")
    public Integer repeatTimes;

    /**
     * <p>The ID of the episode for which you want to change the position in the playlist.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/2848051.html">AddShowIntoShowList</a> or <a href="https://help.aliyun.com/document_detail/2848054.html">DescribeShowList</a> operation and check the value of the response parameter ShowId to obtain the ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>a2b8e671-2fe5-4642-a2ec-bf93880e****</p>
     */
    @NameInMap("ShowId")
    public String showId;

    /**
     * <p>The position of the episode in the episode list. If you want to change the position of an episode in a playlist, place the ID of the episode in <strong>Spot</strong>.</p>
     * <blockquote>
     * <p> The value must be greater than or equal to 0 and less than or equal to the total number of episodes in the playlist.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Spot")
    public Integer spot;

    public static ModifyShowListRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyShowListRequest self = new ModifyShowListRequest();
        return TeaModel.build(map, self);
    }

    public ModifyShowListRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public ModifyShowListRequest setHighPriorityShowId(String highPriorityShowId) {
        this.highPriorityShowId = highPriorityShowId;
        return this;
    }
    public String getHighPriorityShowId() {
        return this.highPriorityShowId;
    }

    public ModifyShowListRequest setHighPriorityShowStartTime(String highPriorityShowStartTime) {
        this.highPriorityShowStartTime = highPriorityShowStartTime;
        return this;
    }
    public String getHighPriorityShowStartTime() {
        return this.highPriorityShowStartTime;
    }

    public ModifyShowListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyShowListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyShowListRequest setRepeatTimes(Integer repeatTimes) {
        this.repeatTimes = repeatTimes;
        return this;
    }
    public Integer getRepeatTimes() {
        return this.repeatTimes;
    }

    public ModifyShowListRequest setShowId(String showId) {
        this.showId = showId;
        return this;
    }
    public String getShowId() {
        return this.showId;
    }

    public ModifyShowListRequest setSpot(Integer spot) {
        this.spot = spot;
        return this;
    }
    public Integer getSpot() {
        return this.spot;
    }

}
