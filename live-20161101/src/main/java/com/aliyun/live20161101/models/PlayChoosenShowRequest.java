// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class PlayChoosenShowRequest extends TeaModel {
    @NameInMap("CasterId")
    public String casterId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ShowId")
    public String showId;

    public static PlayChoosenShowRequest build(java.util.Map<String, ?> map) throws Exception {
        PlayChoosenShowRequest self = new PlayChoosenShowRequest();
        return TeaModel.build(map, self);
    }

    public PlayChoosenShowRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public PlayChoosenShowRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public PlayChoosenShowRequest setShowId(String showId) {
        this.showId = showId;
        return this;
    }
    public String getShowId() {
        return this.showId;
    }

}
