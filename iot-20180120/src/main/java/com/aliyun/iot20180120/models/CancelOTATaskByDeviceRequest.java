// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CancelOTATaskByDeviceRequest extends TeaModel {
    @NameInMap("DeviceName")
    public java.util.List<String> deviceName;

    /**
     * <p>The unique ID of the OTA update package.</p>
     * <br>
     * <p>An update package ID is returned after you call the [CreateOTAFirmware](~~147311~~) operation to create the update package.</p>
     * <br>
     * <p>You can call the [ListOTAFirmware](~~147450~~) operation and view the update package ID in the response.</p>
     */
    @NameInMap("FirmwareId")
    public String firmwareId;

    /**
     * <p>The ID of the instance. You can view the **ID** of the instance on the **Overview** page in the IoT Platform console.</p>
     * <br>
     * <p>>*   If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.</p>
     * <p>>*   If no **Overview** page or ID is generated for your instance, you do not need to configure this parameter.</p>
     * <br>
     * <p>For more information, see [Overview](~~356505~~).</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The ID of the update batch. If you configure this parameter, only the device update tasks in the specified update batch are deleted.</p>
     * <br>
     * <p>After you call the [CreateOTAVerifyJob](~~147480~~), [CreateOTAStaticUpgradeJob](~~147496~~), or [CreateOTADynamicUpgradeJob](~~147887~~) operation to create a device update task, you can obtain the value of the **JobId** parameter. You can also view the batch ID on the **Firmware Details** page in the IoT Platform console.</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The ProductKey of the product to which the device belongs.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    public static CancelOTATaskByDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelOTATaskByDeviceRequest self = new CancelOTATaskByDeviceRequest();
        return TeaModel.build(map, self);
    }

    public CancelOTATaskByDeviceRequest setDeviceName(java.util.List<String> deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public java.util.List<String> getDeviceName() {
        return this.deviceName;
    }

    public CancelOTATaskByDeviceRequest setFirmwareId(String firmwareId) {
        this.firmwareId = firmwareId;
        return this;
    }
    public String getFirmwareId() {
        return this.firmwareId;
    }

    public CancelOTATaskByDeviceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CancelOTATaskByDeviceRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public CancelOTATaskByDeviceRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
