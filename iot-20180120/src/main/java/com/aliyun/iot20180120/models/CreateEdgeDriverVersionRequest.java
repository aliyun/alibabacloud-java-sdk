// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateEdgeDriverVersionRequest extends TeaModel {
    /**
     * <p>The Java Virtual Machine (JVM) startup parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>-XX:+PrintGCDetails</p>
     */
    @NameInMap("Argument")
    public String argument;

    /**
     * <p>The rule for verifying configurations. Set this parameter to a JSON string in the following format:</p>
     * <p><code>{&quot;deviceConfig&quot;:{&quot;required&quot;:false},&quot;driverConfig&quot;:{&quot;required&quot;:false}</code></p>
     * <p>The JSON string contains the following parameters:</p>
     * <ul>
     * <li>driverConfig: the rule for verifying the configuration of the driver when the driver is to be deployed in an edge instance.</li>
     * <li>deviceConfig: the rule for verifying the configurations of devices that use the driver when the driver is to be deployed in an edge instance.</li>
     * </ul>
     * <p><code>required</code>: A value of true indicates that the corresponding parameter is required. A value of false indicates that the corresponding parameter is optional.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;deviceConfig&quot;:{&quot;required&quot;:false},&quot;driverConfig&quot;:{&quot;required&quot;:false}}</p>
     */
    @NameInMap("ConfigCheckRule")
    public String configCheckRule;

    /**
     * <p>The configuration of the container where the driver runs. Set this parameter to a JSON string. For more information about parameters in the JSON string, see the following parameter description of <strong>ContainerConfig</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;privileged&quot;:1,&quot;devMappings&quot;:[],&quot;volumeMappings&quot;:[],&quot;hostNetworkMode&quot;:0,&quot;portMappings&quot;:[]}</p>
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
     * <p><code>{&quot;format&quot;:&quot;JSON&quot;,&quot;content&quot;:&quot;{}&quot;}</code></p>
     * <p>The JSON string contains the following parameters:</p>
     * <ul>
     * <li><p>format: the format of the driver configuration. Valid values: KV (key-value pair), JSON (JSON string), and FILE (configuration file).</p>
     * </li>
     * <li><p>content: the content of the driver configuration. If you set the format parameter to KV or JSON, set this parameter to the configuration content of the driver. If you set the format parameter to FILE, set this parameter to the URL of the driver configuration file stored in OSS.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>To obtain the URL of the driver configuration file stored in OSS, call the <a href="https://help.aliyun.com/document_detail/155858.html">CreateOssPreSignedAddress</a> operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;format&quot;:&quot;JSON&quot;,&quot;content&quot;:&quot;{\&quot;defaultConfig\&quot;:\&quot;this is default driver config demo\&quot;}&quot;}]</p>
     */
    @NameInMap("DriverConfig")
    public String driverConfig;

    /**
     * <p>The ID of the driver. To obtain the driver ID, perform the following steps: Log on to the <a href="https://iot.console.aliyun.com/le/instance/list">Link IoT Edge console</a>. On the <strong>Drivers</strong> page, move the pointer over the name of the driver for which you want to create a driver version and obtain the driver ID.</p>
     * <p>You can also call the <a href="https://help.aliyun.com/document_detail/155776.html">QueryEdgeDriver</a> operation to query the driver ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fec565038d7544978d9aed5c1a******</p>
     */
    @NameInMap("DriverId")
    public String driverId;

    /**
     * <p>The version number of the driver. The version number must be unique for the driver. The version number can be up to 64 characters in length and can contain letters, digits, underscores (_), hyphens (-), and periods (.).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1.2.0</p>
     */
    @NameInMap("DriverVersion")
    public String driverVersion;

    /**
     * <p>The earliest version of Link IoT Edge that is supported by the driver. The driver can run on gateways of only this version and later. For example, if you set this parameter to 2.4.0, the driver can run on gateways of only version 2.4.0 and later.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0.0</p>
     */
    @NameInMap("EdgeVersion")
    public String edgeVersion;

    /**
     * <p>The ID of the Internet of Things (IoT) service instance. This parameter is not required for the public instance but required for Enterprise Edition instances.</p>
     * 
     * <strong>example:</strong>
     * <p>iot_instc_pu****_c*-v64********</p>
     */
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
