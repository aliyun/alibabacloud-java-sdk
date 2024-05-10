// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetMeetingRoomsScheduleShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RoomIds")
    public String roomIdsShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static GetMeetingRoomsScheduleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMeetingRoomsScheduleShrinkRequest self = new GetMeetingRoomsScheduleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetMeetingRoomsScheduleShrinkRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetMeetingRoomsScheduleShrinkRequest setRoomIdsShrink(String roomIdsShrink) {
        this.roomIdsShrink = roomIdsShrink;
        return this;
    }
    public String getRoomIdsShrink() {
        return this.roomIdsShrink;
    }

    public GetMeetingRoomsScheduleShrinkRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
