// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class AuthorizeBaaSRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static AuthorizeBaaSRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeBaaSRequest self = new AuthorizeBaaSRequest();
        return TeaModel.build(map, self);
    }

    public AuthorizeBaaSRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
