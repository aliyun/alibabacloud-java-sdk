// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteBasicAccelerateIpRequest extends TeaModel {
    @NameInMap("AccelerateIpId")
    public String accelerateIpId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteBasicAccelerateIpRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBasicAccelerateIpRequest self = new DeleteBasicAccelerateIpRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBasicAccelerateIpRequest setAccelerateIpId(String accelerateIpId) {
        this.accelerateIpId = accelerateIpId;
        return this;
    }
    public String getAccelerateIpId() {
        return this.accelerateIpId;
    }

    public DeleteBasicAccelerateIpRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteBasicAccelerateIpRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
