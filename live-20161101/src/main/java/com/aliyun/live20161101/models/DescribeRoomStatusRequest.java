// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeRoomStatusRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RoomId")
    public String roomId;

    public static DescribeRoomStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRoomStatusRequest self = new DescribeRoomStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRoomStatusRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeRoomStatusRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeRoomStatusRequest setRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    public String getRoomId() {
        return this.roomId;
    }

}
