// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyShowListRequest extends TeaModel {
    @NameInMap("CasterId")
    public String casterId;

    @NameInMap("HighPriorityShowId")
    public String highPriorityShowId;

    @NameInMap("HighPriorityShowStartTime")
    public String highPriorityShowStartTime;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RepeatTimes")
    public Integer repeatTimes;

    @NameInMap("ShowId")
    public String showId;

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
