// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class TransferDeviceInstanceRequest extends TeaModel {
    /**
     * <p>The list of names of the devices to be transferred. You can specify up to 100 device names.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RepeatList</p>
     */
    @NameInMap("DeviceNameList")
    public java.util.List<String> deviceNameList;

    /**
     * <p>The ProductKey of the product to which the devices belong. IoT Platform generates this unique identifier when the product is created.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a1BwAGV****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The ID of the source instance to which the devices belong:</p>
     * <ul>
     * <li><p>Public instance ID: iotx-oxssharez200.</p>
     * <blockquote>
     * <p>Only the China (Shanghai) region is supported. Enterprise instance ID is iotx-oxssharez200.</p>
     * </blockquote>
     * </li>
     * <li><p>Enterprise Edition instance ID: Log on to the IoT Platform console. On the <strong>Instance Overview</strong> page, click Enterprise instance name. On the <strong>Instance Details</strong> page, view the <strong>Instance ID</strong> in the <strong>Basic Information</strong> section.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>iotx-oxssharez200</p>
     */
    @NameInMap("SourceInstanceId")
    public String sourceInstanceId;

    /**
     * <p>The ID of the target instance to which the devices are transferred. Only Enterprise Edition instances are supported as target instances.</p>
     * <p>You can log on to the IoT Platform console. On the <strong>Instance Overview</strong> page, click the instance name. On the <strong>Instance Details</strong> page, view the <strong>Instance ID</strong> in the <strong>Basic Information</strong> section.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-060***</p>
     */
    @NameInMap("TargetInstanceId")
    public String targetInstanceId;

    public static TransferDeviceInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        TransferDeviceInstanceRequest self = new TransferDeviceInstanceRequest();
        return TeaModel.build(map, self);
    }

    public TransferDeviceInstanceRequest setDeviceNameList(java.util.List<String> deviceNameList) {
        this.deviceNameList = deviceNameList;
        return this;
    }
    public java.util.List<String> getDeviceNameList() {
        return this.deviceNameList;
    }

    public TransferDeviceInstanceRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public TransferDeviceInstanceRequest setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }
    public String getSourceInstanceId() {
        return this.sourceInstanceId;
    }

    public TransferDeviceInstanceRequest setTargetInstanceId(String targetInstanceId) {
        this.targetInstanceId = targetInstanceId;
        return this;
    }
    public String getTargetInstanceId() {
        return this.targetInstanceId;
    }

}
