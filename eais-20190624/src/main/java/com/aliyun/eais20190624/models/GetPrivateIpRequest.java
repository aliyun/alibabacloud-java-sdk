// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class GetPrivateIpRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClientInstanceId")
    public String clientInstanceId;

    public static GetPrivateIpRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPrivateIpRequest self = new GetPrivateIpRequest();
        return TeaModel.build(map, self);
    }

    public GetPrivateIpRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetPrivateIpRequest setClientInstanceId(String clientInstanceId) {
        this.clientInstanceId = clientInstanceId;
        return this;
    }
    public String getClientInstanceId() {
        return this.clientInstanceId;
    }

}
