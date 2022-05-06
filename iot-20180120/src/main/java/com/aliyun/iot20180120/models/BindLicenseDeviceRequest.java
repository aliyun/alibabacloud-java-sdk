// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BindLicenseDeviceRequest extends TeaModel {
    @NameInMap("IotIdList")
    public java.util.List<String> iotIdList;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("LicenseCode")
    public String licenseCode;

    @NameInMap("ProductKey")
    public String productKey;

    public static BindLicenseDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        BindLicenseDeviceRequest self = new BindLicenseDeviceRequest();
        return TeaModel.build(map, self);
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
