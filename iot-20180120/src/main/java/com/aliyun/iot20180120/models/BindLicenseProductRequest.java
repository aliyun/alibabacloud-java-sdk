// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BindLicenseProductRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iot-23***</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>480P</p>
     */
    @NameInMap("LicenseCode")
    public String licenseCode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a1BwAGV***</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    public static BindLicenseProductRequest build(java.util.Map<String, ?> map) throws Exception {
        BindLicenseProductRequest self = new BindLicenseProductRequest();
        return TeaModel.build(map, self);
    }

    public BindLicenseProductRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public BindLicenseProductRequest setLicenseCode(String licenseCode) {
        this.licenseCode = licenseCode;
        return this;
    }
    public String getLicenseCode() {
        return this.licenseCode;
    }

    public BindLicenseProductRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
