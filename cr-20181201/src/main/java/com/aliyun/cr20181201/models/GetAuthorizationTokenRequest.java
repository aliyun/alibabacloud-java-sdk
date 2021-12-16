// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetAuthorizationTokenRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static GetAuthorizationTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAuthorizationTokenRequest self = new GetAuthorizationTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetAuthorizationTokenRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetAuthorizationTokenRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
