// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ExecuteVehicleControlRequest extends TeaModel {
    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("Command")
    public String command;

    @NameInMap("CommandParam")
    public String commandParam;

    @NameInMap("Vin")
    public String vin;

    @NameInMap("ProjectId")
    public String projectId;

    public static ExecuteVehicleControlRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteVehicleControlRequest self = new ExecuteVehicleControlRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteVehicleControlRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public ExecuteVehicleControlRequest setCommand(String command) {
        this.command = command;
        return this;
    }
    public String getCommand() {
        return this.command;
    }

    public ExecuteVehicleControlRequest setCommandParam(String commandParam) {
        this.commandParam = commandParam;
        return this;
    }
    public String getCommandParam() {
        return this.commandParam;
    }

    public ExecuteVehicleControlRequest setVin(String vin) {
        this.vin = vin;
        return this;
    }
    public String getVin() {
        return this.vin;
    }

    public ExecuteVehicleControlRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
