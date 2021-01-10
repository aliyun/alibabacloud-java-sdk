// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateRoomRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("RoomId")
    public String roomId;

    @NameInMap("AnchorId")
    public String anchorId;

    @NameInMap("TemplateIds")
    public String templateIds;

    @NameInMap("UseAppTranscode")
    public Boolean useAppTranscode;

    public static CreateRoomRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRoomRequest self = new CreateRoomRequest();
        return TeaModel.build(map, self);
    }

    public CreateRoomRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateRoomRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateRoomRequest setRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    public String getRoomId() {
        return this.roomId;
    }

    public CreateRoomRequest setAnchorId(String anchorId) {
        this.anchorId = anchorId;
        return this;
    }
    public String getAnchorId() {
        return this.anchorId;
    }

    public CreateRoomRequest setTemplateIds(String templateIds) {
        this.templateIds = templateIds;
        return this;
    }
    public String getTemplateIds() {
        return this.templateIds;
    }

    public CreateRoomRequest setUseAppTranscode(Boolean useAppTranscode) {
        this.useAppTranscode = useAppTranscode;
        return this;
    }
    public Boolean getUseAppTranscode() {
        return this.useAppTranscode;
    }

}
