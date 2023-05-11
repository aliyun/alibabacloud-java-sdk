// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateEdgeDriverRequest extends TeaModel {
    /**
     * <p>The CPU architecture that the driver supports. Valid values:</p>
     * <br>
     * <p>*   ARMv7</p>
     * <p>*   ARMv7-HF</p>
     * <p>*   AArch64</p>
     * <p>*   x86-64</p>
     * <p>*   x86</p>
     */
    @NameInMap("CpuArch")
    public String cpuArch;

    /**
     * <p>The name of the driver to create. The name cannot exceed 20 characters in length and can contain only uppercase letters, lowercase letters, digits, and underscores (\_). It must start with a letter.</p>
     */
    @NameInMap("DriverName")
    public String driverName;

    /**
     * <p>The communications protocol that the driver uses. Valid values:</p>
     * <br>
     * <p>*   modbus: Modbus protocol</p>
     * <p>*   opc-ua: OPC UA protocol</p>
     * <p>*   customize: custom protocol</p>
     */
    @NameInMap("DriverProtocol")
    public String driverProtocol;

    /**
     * <p>The ID of the Internet of Things (IoT) service instance. This parameter is not required for public instances. However, this parameter is required for the instances that you have purchased.</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>Specifies whether the driver is a built-in driver.</p>
     * <br>
     * <p>*   true: indicates that the driver is a built-in driver, that is, the driver code is pre-configured on the gateway device.</p>
     * <br>
     * <p>*   false: indicates that the driver is not a built-in driver and you must upload the driver code. Default value: false.</p>
     * <br>
     * <p>> If the driver is not a built-in driver, you must upload the driver code.</p>
     */
    @NameInMap("IsBuiltIn")
    public Boolean isBuiltIn;

    /**
     * <p>The language in which the driver is programmed. Valid values:</p>
     * <br>
     * <p>*   nodejs8: Node.js v8</p>
     * <p>*   python3: Python v3.5</p>
     * <p>*   c: C</p>
     */
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
