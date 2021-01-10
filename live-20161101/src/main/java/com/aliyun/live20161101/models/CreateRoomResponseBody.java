// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateRoomResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("AnchorId")
    public String anchorId;

    @NameInMap("RoomId")
    public String roomId;

    public static CreateRoomResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRoomResponseBody self = new CreateRoomResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRoomResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRoomResponseBody setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateRoomResponseBody setAnchorId(String anchorId) {
        this.anchorId = anchorId;
        return this;
    }
    public String getAnchorId() {
        return this.anchorId;
    }

    public CreateRoomResponseBody setRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    public String getRoomId() {
        return this.roomId;
    }

}
