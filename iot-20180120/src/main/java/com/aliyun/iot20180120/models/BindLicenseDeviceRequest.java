// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BindLicenseDeviceRequest extends TeaModel {
    @NameInMap("DeviceNameList")
    public java.util.List<String> deviceNameList;

    @NameInMap("IotIdList")
    public java.util.List<String> iotIdList;

    /**
     * <p>The ID of the Enterprise Edition instance. You can view the **ID** of the instance on the **Overview** page in the IoT Platform console.</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The license type that specifies the audio and video specifications. Valid values: **480P** and **720P**.</p>
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

    public static BindLicenseDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        BindLicenseDeviceRequest self = new BindLicenseDeviceRequest();
        return TeaModel.build(map, self);
    }

    public BindLicenseDeviceRequest setDeviceNameList(java.util.List<String> deviceNameList) {
        this.deviceNameList = deviceNameList;
        return this;
    }
    public java.util.List<String> getDeviceNameList() {
        return this.deviceNameList;
    }

    public BindLicenseDeviceRequest setIotIdList(java.util.List<String> iotIdList) {
        this.iotIdList = iotIdList;
        return this;
    }
    public java.util.List<String> getIotIdList() {
        return this.iotIdList;
    }

    public BindLicenseDeviceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public BindLicenseDeviceRequest setLicenseCode(String licenseCode) {
        this.licenseCode = licenseCode;
        return this;
    }
    public String getLicenseCode() {
        return this.licenseCode;
    }

    public BindLicenseDeviceRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
