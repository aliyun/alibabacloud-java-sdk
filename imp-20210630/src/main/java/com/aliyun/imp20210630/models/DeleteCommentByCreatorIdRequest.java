// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class DeleteCommentByCreatorIdRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("CommentIdList")
    public java.util.List<String> commentIdList;

    @NameInMap("CreatorId")
    public String creatorId;

    @NameInMap("RoomId")
    public String roomId;

    @NameInMap("UserId")
    public String userId;

    public static DeleteCommentByCreatorIdRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCommentByCreatorIdRequest self = new DeleteCommentByCreatorIdRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCommentByCreatorIdRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteCommentByCreatorIdRequest setCommentIdList(java.util.List<String> commentIdList) {
        this.commentIdList = commentIdList;
        return this;
    }
    public java.util.List<String> getCommentIdList() {
        return this.commentIdList;
    }

    public DeleteCommentByCreatorIdRequest setCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public String getCreatorId() {
        return this.creatorId;
    }

    public DeleteCommentByCreatorIdRequest setRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    public String getRoomId() {
        return this.roomId;
    }

    public DeleteCommentByCreatorIdRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
