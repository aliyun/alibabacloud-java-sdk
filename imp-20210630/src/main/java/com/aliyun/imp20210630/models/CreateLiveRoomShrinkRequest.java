// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class CreateLiveRoomShrinkRequest extends TeaModel {
    // 应用唯一标识，由6位小写字母、数字组成。
    @NameInMap("AppId")
    public String appId;

    // 标题，支持中英文，最大长度32位。
    @NameInMap("Title")
    public String title;

    // 公告，支持中英文，最大长度256位。
    @NameInMap("Notice")
    public String notice;

    // 封面，支持图片地址链接格式
    @NameInMap("CoverUrl")
    public String coverUrl;

    // 拓展字段，按需传递，需要额外记录的房间属性。
    @NameInMap("Extension")
    public String extensionShrink;

    // 主播id，仅支持英文和数字，最大长度36位。
    @NameInMap("AnchorId")
    public String anchorId;

    // 主播昵称。
    @NameInMap("AnchorNick")
    public String anchorNick;

    public static CreateLiveRoomShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveRoomShrinkRequest self = new CreateLiveRoomShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateLiveRoomShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateLiveRoomShrinkRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateLiveRoomShrinkRequest setNotice(String notice) {
        this.notice = notice;
        return this;
    }
    public String getNotice() {
        return this.notice;
    }

    public CreateLiveRoomShrinkRequest setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
        return this;
    }
    public String getCoverUrl() {
        return this.coverUrl;
    }

    public CreateLiveRoomShrinkRequest setExtensionShrink(String extensionShrink) {
        this.extensionShrink = extensionShrink;
        return this;
    }
    public String getExtensionShrink() {
        return this.extensionShrink;
    }

    public CreateLiveRoomShrinkRequest setAnchorId(String anchorId) {
        this.anchorId = anchorId;
        return this;
    }
    public String getAnchorId() {
        return this.anchorId;
    }

    public CreateLiveRoomShrinkRequest setAnchorNick(String anchorNick) {
        this.anchorNick = anchorNick;
        return this;
    }
    public String getAnchorNick() {
        return this.anchorNick;
    }

}
