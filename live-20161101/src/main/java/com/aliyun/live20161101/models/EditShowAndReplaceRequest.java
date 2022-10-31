// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class EditShowAndReplaceRequest extends TeaModel {
    @NameInMap("CasterId")
    public String casterId;

    @NameInMap("EndTime")
    public Float endTime;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ShowId")
    public String showId;

    @NameInMap("StartTime")
    public Float startTime;

    @NameInMap("StorageInfo")
    public String storageInfo;

    @NameInMap("UserData")
    public String userData;

    public static EditShowAndReplaceRequest build(java.util.Map<String, ?> map) throws Exception {
        EditShowAndReplaceRequest self = new EditShowAndReplaceRequest();
        return TeaModel.build(map, self);
    }

    public EditShowAndReplaceRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public EditShowAndReplaceRequest setEndTime(Float endTime) {
        this.endTime = endTime;
        return this;
    }
    public Float getEndTime() {
        return this.endTime;
    }

    public EditShowAndReplaceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public EditShowAndReplaceRequest setShowId(String showId) {
        this.showId = showId;
        return this;
    }
    public String getShowId() {
        return this.showId;
    }

    public EditShowAndReplaceRequest setStartTime(Float startTime) {
        this.startTime = startTime;
        return this;
    }
    public Float getStartTime() {
        return this.startTime;
    }

    public EditShowAndReplaceRequest setStorageInfo(String storageInfo) {
        this.storageInfo = storageInfo;
        return this;
    }
    public String getStorageInfo() {
        return this.storageInfo;
    }

    public EditShowAndReplaceRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
