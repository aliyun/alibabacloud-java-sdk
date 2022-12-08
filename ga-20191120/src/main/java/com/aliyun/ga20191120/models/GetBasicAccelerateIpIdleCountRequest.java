// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class GetBasicAccelerateIpIdleCountRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("IpSetId")
    public String ipSetId;

    @NameInMap("RegionId")
    public String regionId;

    public static GetBasicAccelerateIpIdleCountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBasicAccelerateIpIdleCountRequest self = new GetBasicAccelerateIpIdleCountRequest();
        return TeaModel.build(map, self);
    }

    public GetBasicAccelerateIpIdleCountRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetBasicAccelerateIpIdleCountRequest setIpSetId(String ipSetId) {
        this.ipSetId = ipSetId;
        return this;
    }
    public String getIpSetId() {
        return this.ipSetId;
    }

    public GetBasicAccelerateIpIdleCountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
