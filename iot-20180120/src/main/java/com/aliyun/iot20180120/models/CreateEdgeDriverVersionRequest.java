// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateEdgeDriverVersionRequest extends TeaModel {
    @NameInMap("Argument")
    public String argument;

    @NameInMap("ConfigCheckRule")
    public String configCheckRule;

    @NameInMap("ContainerConfig")
    public String containerConfig;

    @NameInMap("Description")
    public String description;

    @NameInMap("DriverConfig")
    public String driverConfig;

    @NameInMap("DriverId")
    public String driverId;

    @NameInMap("DriverVersion")
    public String driverVersion;

    @NameInMap("EdgeVersion")
    public String edgeVersion;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("SourceConfig")
    public String sourceConfig;

    public static CreateEdgeDriverVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEdgeDriverVersionRequest self = new CreateEdgeDriverVersionRequest();
        return TeaModel.build(map, self);
    }

    public CreateEdgeDriverVersionRequest setArgument(String argument) {
        this.argument = argument;
        return this;
    }
    public String getArgument() {
        return this.argument;
    }

    public CreateEdgeDriverVersionRequest setConfigCheckRule(String configCheckRule) {
        this.configCheckRule = configCheckRule;
        return this;
    }
    public String getConfigCheckRule() {
        return this.configCheckRule;
    }

    public CreateEdgeDriverVersionRequest setContainerConfig(String containerConfig) {
        this.containerConfig = containerConfig;
        return this;
    }
    public String getContainerConfig() {
        return this.containerConfig;
    }

    public CreateEdgeDriverVersionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateEdgeDriverVersionRequest setDriverConfig(String driverConfig) {
        this.driverConfig = driverConfig;
        return this;
    }
    public String getDriverConfig() {
        return this.driverConfig;
    }

    public CreateEdgeDriverVersionRequest setDriverId(String driverId) {
        this.driverId = driverId;
        return this;
    }
    public String getDriverId() {
        return this.driverId;
    }

    public CreateEdgeDriverVersionRequest setDriverVersion(String driverVersion) {
        this.driverVersion = driverVersion;
        return this;
    }
    public String getDriverVersion() {
        return this.driverVersion;
    }

    public CreateEdgeDriverVersionRequest setEdgeVersion(String edgeVersion) {
        this.edgeVersion = edgeVersion;
        return this;
    }
    public String getEdgeVersion() {
        return this.edgeVersion;
    }

    public CreateEdgeDriverVersionRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateEdgeDriverVersionRequest setSourceConfig(String sourceConfig) {
        this.sourceConfig = sourceConfig;
        return this;
    }
    public String getSourceConfig() {
        return this.sourceConfig;
    }

}
