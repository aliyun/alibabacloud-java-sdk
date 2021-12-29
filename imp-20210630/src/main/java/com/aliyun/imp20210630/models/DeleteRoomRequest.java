// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class DeleteRoomRequest extends TeaModel {
    // 应用唯一标识，由6位小写字母、数字组成。
    @NameInMap("AppId")
    public String appId;

    // 房间唯一标识，由字母、数字、符号.和-组成，最大长度36位。
    @NameInMap("RoomId")
    public String roomId;

    public static DeleteRoomRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRoomRequest self = new DeleteRoomRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRoomRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteRoomRequest setRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    public String getRoomId() {
        return this.roomId;
    }

}
