// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateEdgeDriverRequest extends TeaModel {
    @NameInMap("CpuArch")
    public String cpuArch;

    @NameInMap("DriverName")
    public String driverName;

    @NameInMap("DriverProtocol")
    public String driverProtocol;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("IsBuiltIn")
    public Boolean isBuiltIn;

    @NameInMap("Runtime")
    public String runtime;

    public static CreateEdgeDriverRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEdgeDriverRequest self = new CreateEdgeDriverRequest();
        return TeaModel.build(map, self);
    }

    public CreateEdgeDriverRequest setCpuArch(String cpuArch) {
        this.cpuArch = cpuArch;
        return this;
    }
    public String getCpuArch() {
        return this.cpuArch;
    }

    public CreateEdgeDriverRequest setDriverName(String driverName) {
        this.driverName = driverName;
        return this;
    }
    public String getDriverName() {
        return this.driverName;
    }

    public CreateEdgeDriverRequest setDriverProtocol(String driverProtocol) {
        this.driverProtocol = driverProtocol;
        return this;
    }
    public String getDriverProtocol() {
        return this.driverProtocol;
    }

    public CreateEdgeDriverRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateEdgeDriverRequest setIsBuiltIn(Boolean isBuiltIn) {
        this.isBuiltIn = isBuiltIn;
        return this;
    }
    public Boolean getIsBuiltIn() {
        return this.isBuiltIn;
    }

    public CreateEdgeDriverRequest setRuntime(String runtime) {
        this.runtime = runtime;
        return this;
    }
    public String getRuntime() {
        return this.runtime;
    }

}
