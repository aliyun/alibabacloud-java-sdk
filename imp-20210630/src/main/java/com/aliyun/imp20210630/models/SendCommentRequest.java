// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class SendCommentRequest extends TeaModel {
    // 应用唯一标识，可以包含小写字母、数字，长度为6个字符。
    @NameInMap("AppId")
    public String appId;

    // 发送的文本内容。最大的长度不超过256个字节。
    @NameInMap("Content")
    public String content;

    // 扩展字段，服务端仅做透传。
    @NameInMap("Extension")
    public java.util.Map<String, String> extension;

    // 直播间唯一标识，在调用CreateRoom返回。
    @NameInMap("RoomId")
    public String roomId;

    // 弹幕发送者的用户ID，最大长度不超过32个字节。
    @NameInMap("SenderId")
    public String senderId;

    public static SendCommentRequest build(java.util.Map<String, ?> map) throws Exception {
        SendCommentRequest self = new SendCommentRequest();
        return TeaModel.build(map, self);
    }

    public SendCommentRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SendCommentRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public SendCommentRequest setExtension(java.util.Map<String, String> extension) {
        this.extension = extension;
        return this;
    }
    public java.util.Map<String, String> getExtension() {
        return this.extension;
    }

    public SendCommentRequest setRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    public String getRoomId() {
        return this.roomId;
    }

    public SendCommentRequest setSenderId(String senderId) {
        this.senderId = senderId;
        return this;
    }
    public String getSenderId() {
        return this.senderId;
    }

}
