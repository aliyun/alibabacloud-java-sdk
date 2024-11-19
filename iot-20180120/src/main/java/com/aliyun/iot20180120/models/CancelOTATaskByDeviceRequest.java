// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CancelOTATaskByDeviceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>device1</p>
     */
    @NameInMap("DeviceName")
    public java.util.List<String> deviceName;

    /**
     * <p>The unique ID of the OTA update package.</p>
     * <p>An update package ID is returned after you call the <a href="https://help.aliyun.com/document_detail/147311.html">CreateOTAFirmware</a> operation to create the update package.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/147450.html">ListOTAFirmware</a> operation and view the update package ID in the response.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>T0F5b5tpFnHQrgfk****030100</p>
     */
    @NameInMap("FirmwareId")
    public String firmwareId;

    /**
     * <p>The ID of the instance. You can view the <strong>ID</strong> of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <ul>
     * <li>If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.</li>
     * <li>If no <strong>Overview</strong> page or ID is generated for your instance, you do not need to configure this parameter.</li>
     * </ul>
     * </blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot_instc_pu****_c*-v64********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The ID of the update batch. If you configure this parameter, only the device update tasks in the specified update batch are deleted.</p>
     * <p>After you call the <a href="https://help.aliyun.com/document_detail/147480.html">CreateOTAVerifyJob</a>, <a href="https://help.aliyun.com/document_detail/147496.html">CreateOTAStaticUpgradeJob</a>, or <a href="https://help.aliyun.com/document_detail/147887.html">CreateOTADynamicUpgradeJob</a> operation to create a device update task, you can obtain the value of the <strong>JobId</strong> parameter. You can also view the batch ID on the <strong>Firmware Details</strong> page in the IoT Platform console.</p>
     * 
     * <strong>example:</strong>
     * <p>wahVIzGkCMuAUE2gDERM02****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The ProductKey of the product to which the device belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a1V4kde****</p>
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
