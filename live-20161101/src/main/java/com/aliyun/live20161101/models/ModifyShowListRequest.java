// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyShowListRequest extends TeaModel {
    /**
     * <p>The ID of the production studio.</p>
     * <ul>
     * <li><p>If you created the production studio by calling the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation, use the CasterId value returned in the response.</p>
     * </li>
     * <li><p>If you created the production studio in the LIVE console, find the production studio name on the Cloud Production Studio page. To go to the page, choose <strong>LIVE Console</strong> &gt; <strong>Production Studio</strong> &gt; <strong>Cloud Production Studio</strong>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The name of the production studio on the Cloud Production Studio page is the production studio ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LIVEPRODUCER_POST-cn-0pp1czt****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    /**
     * <p>The highest-priority show.</p>
     * <blockquote>
     * <p>This parameter can be configured only before the playlist starts.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>a2b8e671-2fe5-4642-a2ec-bf93880e****</p>
     */
    @NameInMap("HighPriorityShowId")
    public String highPriorityShowId;

    /**
     * <p>The time to play the highest-priority show. The format is yyyy-MM-dd\&quot;T\&quot;HH:mm:ss.</p>
     * <blockquote>
     * <p>This parameter can be configured only before the playlist starts.<br>
     * After this parameter is configured, the system switches from the currently playing show to the highest-priority show at the specified time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-11-23T12:30:00</p>
     */
    @NameInMap("HighPriorityShowStartTime")
    public String highPriorityShowStartTime;

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
     * <p>The number of times the playlist loops.</p>
     * <blockquote>
     * <ul>
     * <li><p>RepeatTimes specifies the number of repetitions. For example, a value of <strong>0</strong> means the playlist is played once without repetition. A value of <strong>1</strong> means the playlist is played twice (one initial playback and one repetition).</p>
     * </li>
     * <li><p>A value of -1 indicates that the playlist loops indefinitely.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("RepeatTimes")
    public Integer repeatTimes;

    /**
     * <p>The ID of the show whose position in the playlist you want to modify.</p>
     * <blockquote>
     * <p>Obtain the ShowId value from the response of the <a href="https://help.aliyun.com/document_detail/2848051.html">AddShowIntoShowList</a> or <a href="https://help.aliyun.com/document_detail/2848054.html">DescribeShowList</a> operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>a2b8e671-2fe5-4642-a2ec-bf93880e****</p>
     */
    @NameInMap("ShowId")
    public String showId;

    /**
     * <p>The new position of the show in the playlist. The show specified by ShowId is moved to the position specified by <strong>Spot</strong>.</p>
     * <blockquote>
     * <p>The value must be greater than or equal to 0 and less than or equal to the total number of shows in the playlist.</p>
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
