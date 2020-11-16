// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeRoomStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RoomStatus")
    @Validation(required = true)
    public Integer roomStatus;

    public static DescribeRoomStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRoomStatusResponse self = new DescribeRoomStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRoomStatusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRoomStatusResponse setRoomStatus(Integer roomStatus) {
        this.roomStatus = roomStatus;
        return this;
    }
    public Integer getRoomStatus() {
        return this.roomStatus;
    }

}
