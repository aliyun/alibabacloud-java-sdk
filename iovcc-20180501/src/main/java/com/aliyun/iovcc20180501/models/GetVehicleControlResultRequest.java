// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class GetVehicleControlResultRequest extends TeaModel {
    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("ExecutionId")
    public String executionId;

    @NameInMap("ProjectId")
    public String projectId;

    public static GetVehicleControlResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVehicleControlResultRequest self = new GetVehicleControlResultRequest();
        return TeaModel.build(map, self);
    }

    public GetVehicleControlResultRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public GetVehicleControlResultRequest setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

    public GetVehicleControlResultRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
