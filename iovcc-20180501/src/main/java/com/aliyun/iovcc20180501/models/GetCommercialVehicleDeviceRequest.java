// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class GetCommercialVehicleDeviceRequest extends TeaModel {
    // 项目ID
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("ClientId")
    public String clientId;

    public static GetCommercialVehicleDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCommercialVehicleDeviceRequest self = new GetCommercialVehicleDeviceRequest();
        return TeaModel.build(map, self);
    }

    public GetCommercialVehicleDeviceRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public GetCommercialVehicleDeviceRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

}
