// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class DeleteCommentRequest extends TeaModel {
    // 应用唯一标识，可以包含小写字母、数字，长度为6个字符。
    @NameInMap("AppId")
    public String appId;

    // 直播间唯一标识，在调用CreateRoom返回。
    @NameInMap("RoomId")
    public String roomId;

    // 删除的操作人ID。
    @NameInMap("UserId")
    public String userId;

    // 需要删除的弹幕id列表
    @NameInMap("CommentIdList")
    public java.util.List<String> commentIdList;

    public static DeleteCommentRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCommentRequest self = new DeleteCommentRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCommentRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteCommentRequest setRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    public String getRoomId() {
        return this.roomId;
    }

    public DeleteCommentRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public DeleteCommentRequest setCommentIdList(java.util.List<String> commentIdList) {
        this.commentIdList = commentIdList;
        return this;
    }
    public java.util.List<String> getCommentIdList() {
        return this.commentIdList;
    }

}
