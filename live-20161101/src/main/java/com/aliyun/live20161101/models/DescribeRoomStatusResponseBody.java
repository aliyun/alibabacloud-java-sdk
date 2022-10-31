// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeRoomStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RoomStatus")
    public Integer roomStatus;

    public static DescribeRoomStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRoomStatusResponseBody self = new DescribeRoomStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRoomStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRoomStatusResponseBody setRoomStatus(Integer roomStatus) {
        this.roomStatus = roomStatus;
        return this;
    }
    public Integer getRoomStatus() {
        return this.roomStatus;
    }

}
