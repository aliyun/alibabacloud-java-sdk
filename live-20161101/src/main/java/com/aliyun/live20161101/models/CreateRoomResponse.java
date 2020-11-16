// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateRoomResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("RoomId")
    @Validation(required = true)
    public String roomId;

    @NameInMap("AnchorId")
    @Validation(required = true)
    public String anchorId;

    public static CreateRoomResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRoomResponse self = new CreateRoomResponse();
        return TeaModel.build(map, self);
    }

    public CreateRoomResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRoomResponse setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateRoomResponse setRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    public String getRoomId() {
        return this.roomId;
    }

    public CreateRoomResponse setAnchorId(String anchorId) {
        this.anchorId = anchorId;
        return this;
    }
    public String getAnchorId() {
        return this.anchorId;
    }

}
