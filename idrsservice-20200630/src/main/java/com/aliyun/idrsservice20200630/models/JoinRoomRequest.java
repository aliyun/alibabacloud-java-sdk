// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class JoinRoomRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RoomId")
    public String roomId;

    @NameInMap("RoomToken")
    public String roomToken;

    @NameInMap("StreamId")
    public String streamId;

    public static JoinRoomRequest build(java.util.Map<String, ?> map) throws Exception {
        JoinRoomRequest self = new JoinRoomRequest();
        return TeaModel.build(map, self);
    }

    public JoinRoomRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public JoinRoomRequest setRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    public String getRoomId() {
        return this.roomId;
    }

    public JoinRoomRequest setRoomToken(String roomToken) {
        this.roomToken = roomToken;
        return this;
    }
    public String getRoomToken() {
        return this.roomToken;
    }

    public JoinRoomRequest setStreamId(String streamId) {
        this.streamId = streamId;
        return this;
    }
    public String getStreamId() {
        return this.streamId;
    }

}
