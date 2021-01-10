// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCasterRtcInfoRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("CasterId")
    public String casterId;

    public static DescribeCasterRtcInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCasterRtcInfoRequest self = new DescribeCasterRtcInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCasterRtcInfoRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeCasterRtcInfoRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

}
