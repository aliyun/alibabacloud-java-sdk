// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class SendCommentShrinkRequest extends TeaModel {
    // 应用唯一标识，可以包含小写字母、数字，长度为6个字符。
    @NameInMap("AppId")
    public String appId;

    // 发送的文本内容。最大的长度不超过256个字节。
    @NameInMap("Content")
    public String content;

    // 扩展字段，服务端仅做透传。
    @NameInMap("Extension")
    public String extensionShrink;

    // 直播间唯一标识，在调用CreateRoom返回。
    @NameInMap("RoomId")
    public String roomId;

    // 弹幕发送者的用户ID，最大长度不超过32个字节。
    @NameInMap("SenderId")
    public String senderId;

    public static SendCommentShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SendCommentShrinkRequest self = new SendCommentShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SendCommentShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SendCommentShrinkRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public SendCommentShrinkRequest setExtensionShrink(String extensionShrink) {
        this.extensionShrink = extensionShrink;
        return this;
    }
    public String getExtensionShrink() {
        return this.extensionShrink;
    }

    public SendCommentShrinkRequest setRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    public String getRoomId() {
        return this.roomId;
    }

    public SendCommentShrinkRequest setSenderId(String senderId) {
        this.senderId = senderId;
        return this;
    }
    public String getSenderId() {
        return this.senderId;
    }

}
