// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CheckBindLicenseDeviceProgressRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>23****</p>
     */
    @NameInMap("CheckProgressId")
    public String checkProgressId;

    /**
     * <strong>example:</strong>
     * <p>iot-2ws****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>720P</p>
     */
    @NameInMap("LicenseCode")
    public String licenseCode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>uhf5****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    public static CheckBindLicenseDeviceProgressRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckBindLicenseDeviceProgressRequest self = new CheckBindLicenseDeviceProgressRequest();
        return TeaModel.build(map, self);
    }

    public CheckBindLicenseDeviceProgressRequest setCheckProgressId(String checkProgressId) {
        this.checkProgressId = checkProgressId;
        return this;
    }
    public String getCheckProgressId() {
        return this.checkProgressId;
    }

    public CheckBindLicenseDeviceProgressRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CheckBindLicenseDeviceProgressRequest setLicenseCode(String licenseCode) {
        this.licenseCode = licenseCode;
        return this;
    }
    public String getLicenseCode() {
        return this.licenseCode;
    }

    public CheckBindLicenseDeviceProgressRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
