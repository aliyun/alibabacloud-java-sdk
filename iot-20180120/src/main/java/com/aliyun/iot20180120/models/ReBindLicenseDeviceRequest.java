// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ReBindLicenseDeviceRequest extends TeaModel {
    /**
     * <p>The **DeviceNames** of all devices to which you want to rebind a license.</p>
     * <br>
     * <p>You can call the [QueryDevice](~~69905~~) operation to query the **DeviceNames** of all devices that belong to a specific product.</p>
     */
    @NameInMap("DeviceNameList")
    public java.util.List<String> deviceNameList;

    /**
     * <p>The instance ID. You can view the **ID** of the instance on the **Overview** page in the IoT Platform console.</p>
     * <br>
     * <p>>  You must specify the ID of a public instance of the new version or an Enterprise Edition instance. Otherwise, the request fails. You do not need to specify the ID of a public instance of the previous version.</p>
     * <br>
     * <p>For more information, see [Overview](~~356505~~) of IoT instances.</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The license type. Set the value to **LINK_SPEECH_COMMON_LICENSE**.</p>
     */
    @NameInMap("LicenseCode")
    public String licenseCode;

    /**
     * <p>The **ProductKey** of the product to which the devices belong.</p>
     * <br>
     * <p>You can go to the IoT Platform console or call the [QueryProductList](~~69271~~) operation to view the information about all products of the instance.</p>
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
