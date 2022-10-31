// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class RemoveShowFromShowListRequest extends TeaModel {
    @NameInMap("CasterId")
    public String casterId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ShowId")
    public String showId;

    @NameInMap("isBatchMode")
    public Boolean isBatchMode;

    @NameInMap("showIdList")
    public java.util.List<String> showIdList;

    public static RemoveShowFromShowListRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveShowFromShowListRequest self = new RemoveShowFromShowListRequest();
        return TeaModel.build(map, self);
    }

    public RemoveShowFromShowListRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public RemoveShowFromShowListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RemoveShowFromShowListRequest setShowId(String showId) {
        this.showId = showId;
        return this;
    }
    public String getShowId() {
        return this.showId;
    }

    public RemoveShowFromShowListRequest setIsBatchMode(Boolean isBatchMode) {
        this.isBatchMode = isBatchMode;
        return this;
    }
    public Boolean getIsBatchMode() {
        return this.isBatchMode;
    }

    public RemoveShowFromShowListRequest setShowIdList(java.util.List<String> showIdList) {
        this.showIdList = showIdList;
        return this;
    }
    public java.util.List<String> getShowIdList() {
        return this.showIdList;
    }

}
