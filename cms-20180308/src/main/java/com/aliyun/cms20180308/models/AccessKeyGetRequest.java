// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class AccessKeyGetRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("UserId")
    public Long userId;

    public static AccessKeyGetRequest build(java.util.Map<String, ?> map) throws Exception {
        AccessKeyGetRequest self = new AccessKeyGetRequest();
        return TeaModel.build(map, self);
    }

    public AccessKeyGetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AccessKeyGetRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
