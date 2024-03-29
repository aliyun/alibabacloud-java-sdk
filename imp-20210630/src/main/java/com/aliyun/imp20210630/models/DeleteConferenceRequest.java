// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class DeleteConferenceRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ConferenceId")
    public String conferenceId;

    @NameInMap("RoomId")
    public String roomId;

    @NameInMap("UserId")
    public String userId;

    public static DeleteConferenceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteConferenceRequest self = new DeleteConferenceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteConferenceRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteConferenceRequest setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

    public DeleteConferenceRequest setRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    public String getRoomId() {
        return this.roomId;
    }

    public DeleteConferenceRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
