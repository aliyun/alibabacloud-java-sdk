// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class OpenIoTCloudConnectorServiceRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static OpenIoTCloudConnectorServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenIoTCloudConnectorServiceRequest self = new OpenIoTCloudConnectorServiceRequest();
        return TeaModel.build(map, self);
    }

    public OpenIoTCloudConnectorServiceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
