// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CreateDeviceRequest extends TeaModel {
    @NameInMap("ModelName")
    public String modelName;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("HardwareId")
    public String hardwareId;

    public static CreateDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDeviceRequest self = new CreateDeviceRequest();
        return TeaModel.build(map, self);
    }

    public CreateDeviceRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public CreateDeviceRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateDeviceRequest setHardwareId(String hardwareId) {
        this.hardwareId = hardwareId;
        return this;
    }
    public String getHardwareId() {
        return this.hardwareId;
    }

}
