// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class GetEditingJobInfoRequest extends TeaModel {
    @NameInMap("CasterId")
    public String casterId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ShowId")
    public String showId;

    public static GetEditingJobInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEditingJobInfoRequest self = new GetEditingJobInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetEditingJobInfoRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public GetEditingJobInfoRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetEditingJobInfoRequest setShowId(String showId) {
        this.showId = showId;
        return this;
    }
    public String getShowId() {
        return this.showId;
    }

}
