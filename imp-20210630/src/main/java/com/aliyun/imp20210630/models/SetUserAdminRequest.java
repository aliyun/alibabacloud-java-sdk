// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class SetUserAdminRequest extends TeaModel {
    // 应用唯一标识，由6位小写字母、数字组成。
    @NameInMap("AppId")
    public String appId;

    // 房间唯一标识，由字母、数字、符号.和-组成，最大长度36位。
    @NameInMap("RoomId")
    public String roomId;

    // 用户ID
    @NameInMap("UserId")
    public String userId;

    public static SetUserAdminRequest build(java.util.Map<String, ?> map) throws Exception {
        SetUserAdminRequest self = new SetUserAdminRequest();
        return TeaModel.build(map, self);
    }

    public SetUserAdminRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SetUserAdminRequest setRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    public String getRoomId() {
        return this.roomId;
    }

    public SetUserAdminRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
