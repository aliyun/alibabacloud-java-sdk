// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivision20190308.models;

import com.aliyun.tea.*;

public class UnregisterFaceRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ShowLog")
    public String showLog;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("FaceToken")
    public String faceToken;

    public static UnregisterFaceRequest build(java.util.Map<String, ?> map) throws Exception {
        UnregisterFaceRequest self = new UnregisterFaceRequest();
        return TeaModel.build(map, self);
    }

    public UnregisterFaceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UnregisterFaceRequest setShowLog(String showLog) {
        this.showLog = showLog;
        return this;
    }
    public String getShowLog() {
        return this.showLog;
    }

    public UnregisterFaceRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public UnregisterFaceRequest setFaceToken(String faceToken) {
        this.faceToken = faceToken;
        return this;
    }
    public String getFaceToken() {
        return this.faceToken;
    }

}
