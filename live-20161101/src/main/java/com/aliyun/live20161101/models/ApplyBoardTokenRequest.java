// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ApplyBoardTokenRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppUid")
    public String appUid;

    @NameInMap("BoardId")
    public String boardId;

    public static ApplyBoardTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyBoardTokenRequest self = new ApplyBoardTokenRequest();
        return TeaModel.build(map, self);
    }

    public ApplyBoardTokenRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ApplyBoardTokenRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ApplyBoardTokenRequest setAppUid(String appUid) {
        this.appUid = appUid;
        return this;
    }
    public String getAppUid() {
        return this.appUid;
    }

    public ApplyBoardTokenRequest setBoardId(String boardId) {
        this.boardId = boardId;
        return this;
    }
    public String getBoardId() {
        return this.boardId;
    }

}
