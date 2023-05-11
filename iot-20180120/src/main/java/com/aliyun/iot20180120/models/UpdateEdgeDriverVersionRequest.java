// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateEdgeDriverVersionRequest extends TeaModel {
    /**
     * <p>The Java Virtual Machine (JVM) startup parameter.</p>
     */
    @NameInMap("Argument")
    public String argument;

    /**
     * <p>The rule for verifying configurations. Set this parameter to a JSON string in the following format:</p>
     * <br>
     * <p>`{"deviceConfig":{"required":false},"driverConfig":{"required":false}`</p>
     * <br>
     * <p>The JSON string contains the following parameters:</p>
     * <br>
     * <p>*   driverConfig: the rule for verifying the configuration of the driver when the driver is to be deployed in an edge instance.</p>
     * <p>*   deviceConfig: the rule for verifying the configurations of devices that use the driver when the driver is to be deployed in an edge instance.</p>
     * <br>
     * <p>`required`: A value of true indicates that the corresponding parameter is required. A value of false indicates that the corresponding parameter is optional.</p>
     */
    @NameInMap("ConfigCheckRule")
    public String configCheckRule;

    /**
     * <p>The configuration of the container where the driver runs. Set this parameter to a JSON string. For more information about parameters in the JSON string, see the following parameter description of ContainerConfig.</p>
     */
    @NameInMap("ContainerConfig")
    public String containerConfig;

    /**
     * <p>The description of the driver. The description can be a maximum of 256 bytes in length.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The configuration of the driver. Set this parameter to a JSON string in the following format:</p>
     * <br>
     * <p>`{"format":"JSON","content":"{}"}`</p>
     * <br>
     * <p>The JSON string contains the following parameters:</p>
     * <br>
     * <p>*   format: the format of the driver configuration. Valid values: KV (key-value pair), JSON (JSON string), and FILE (configuration file).</p>
     * <br>
     * <p>*   content: the content of the driver configuration. If you set the format parameter to KV or JSON, set this parameter to the configuration content of the driver. If you set the format parameter to FILE, set this parameter to the URL of the driver configuration file stored in OSS.</p>
     * <br>
     * <p>>To obtain the URL of the driver configuration file stored in OSS, call the [CreateOssPreSignedAddress](~~155858~~) operation.</p>
     */
    @NameInMap("DriverConfig")
    public String driverConfig;

    /**
     * <p>The ID of the driver. To obtain the driver ID, perform the following steps: Log on to the [Link IoT Edge console](https://iot.console.aliyun.com/le/instance/list). On the **Drivers** page, move the pointer over the name of the driver for which you want to update a driver version and obtain the driver ID.</p>
     * <br>
     * <p>You can also call the [QueryEdgeDriver](~~155776~~) operation to query the driver ID.</p>
     */
    @NameInMap("DriverId")
    public String driverId;

    /**
     * <p>The version number of the driver.</p>
     */
    @NameInMap("DriverVersion")
    public String driverVersion;

    /**
     * <p>The earliest version of Link IoT Edge that is supported by the driver. The driver can run on gateways of only this version and later. For example, if you set this parameter to 2.4.0, the driver can run on gateways of only version 2.4.0 and later.</p>
     */
    @NameInMap("EdgeVersion")
    public String edgeVersion;

    /**
     * <p>The ID of the Internet of Things (IoT) service instance. This parameter is not required for the public instance but required for Enterprise Edition instances.</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("SourceConfig")
    public String sourceConfig;

    public static UpdateEdgeDriverVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEdgeDriverVersionRequest self = new UpdateEdgeDriverVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEdgeDriverVersionRequest setArgument(String argument) {
        this.argument = argument;
        return this;
    }
    public String getArgument() {
        return this.argument;
    }

    public UpdateEdgeDriverVersionRequest setConfigCheckRule(String configCheckRule) {
        this.configCheckRule = configCheckRule;
        return this;
    }
    public String getConfigCheckRule() {
        return this.configCheckRule;
    }

    public UpdateEdgeDriverVersionRequest setContainerConfig(String containerConfig) {
        this.containerConfig = containerConfig;
        return this;
    }
    public String getContainerConfig() {
        return this.containerConfig;
    }

    public UpdateEdgeDriverVersionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateEdgeDriverVersionRequest setDriverConfig(String driverConfig) {
        this.driverConfig = driverConfig;
        return this;
    }
    public String getDriverConfig() {
        return this.driverConfig;
    }

    public UpdateEdgeDriverVersionRequest setDriverId(String driverId) {
        this.driverId = driverId;
        return this;
    }
    public String getDriverId() {
        return this.driverId;
    }

    public UpdateEdgeDriverVersionRequest setDriverVersion(String driverVersion) {
        this.driverVersion = driverVersion;
        return this;
    }
    public String getDriverVersion() {
        return this.driverVersion;
    }

    public UpdateEdgeDriverVersionRequest setEdgeVersion(String edgeVersion) {
        this.edgeVersion = edgeVersion;
        return this;
    }
    public String getEdgeVersion() {
        return this.edgeVersion;
    }

    public UpdateEdgeDriverVersionRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public UpdateEdgeDriverVersionRequest setSourceConfig(String sourceConfig) {
        this.sourceConfig = sourceConfig;
        return this;
    }
    public String getSourceConfig() {
        return this.sourceConfig;
    }

}
