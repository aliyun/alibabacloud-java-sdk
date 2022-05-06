// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BindLicenseProductRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("LicenseCode")
    public String licenseCode;

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
