// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeSmsSignStatusRequest extends TeaModel {
    @NameInMap("SpaceId")
    public String spaceId;

    @NameInMap("SignIds")
    public String signIds;

    public static DescribeSmsSignStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSmsSignStatusRequest self = new DescribeSmsSignStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSmsSignStatusRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public DescribeSmsSignStatusRequest setSignIds(String signIds) {
        this.signIds = signIds;
        return this;
    }
    public String getSignIds() {
        return this.signIds;
    }

}
