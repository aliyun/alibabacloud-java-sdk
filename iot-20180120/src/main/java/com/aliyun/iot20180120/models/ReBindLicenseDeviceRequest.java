// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ReBindLicenseDeviceRequest extends TeaModel {
    /**
     * <p>The <strong>DeviceNames</strong> of all devices to which you want to rebind a license.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/69905.html">QueryDevice</a> operation to query the <strong>DeviceNames</strong> of all devices that belong to a specific product.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DeviceNameList")
    public java.util.List<String> deviceNameList;

    /**
     * <p>The instance ID. You can view the <strong>ID</strong> of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <p> You must specify the ID of a public instance of the new version or an Enterprise Edition instance. Otherwise, the request fails. You do not need to specify the ID of a public instance of the previous version.</p>
     * </blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a> of IoT instances.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-e3***</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The license type. Set the value to <strong>LINK_SPEECH_COMMON_LICENSE</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LINK_SPEECH_COMMON_LICENSE</p>
     */
    @NameInMap("LicenseCode")
    public String licenseCode;

    /**
     * <p>The <strong>ProductKey</strong> of the product to which the devices belong.</p>
     * <p>You can go to the IoT Platform console or call the <a href="https://help.aliyun.com/document_detail/69271.html">QueryProductList</a> operation to view the information about all products of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a2YwD23***</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    public static ReBindLicenseDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        ReBindLicenseDeviceRequest self = new ReBindLicenseDeviceRequest();
        return TeaModel.build(map, self);
    }

    public ReBindLicenseDeviceRequest setDeviceNameList(java.util.List<String> deviceNameList) {
        this.deviceNameList = deviceNameList;
        return this;
    }
    public java.util.List<String> getDeviceNameList() {
        return this.deviceNameList;
    }

    public ReBindLicenseDeviceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public ReBindLicenseDeviceRequest setLicenseCode(String licenseCode) {
        this.licenseCode = licenseCode;
        return this;
    }
    public String getLicenseCode() {
        return this.licenseCode;
    }

    public ReBindLicenseDeviceRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
