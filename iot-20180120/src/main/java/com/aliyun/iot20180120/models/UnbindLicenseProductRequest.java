// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UnbindLicenseProductRequest extends TeaModel {
    /**
     * <p>The ID of the Enterprise Edition instance. You can view the **ID** of the instance on the **Overview** page in the IoT Platform console.</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The license type that specifies the audio and video specifications. Valid values: **480P** and **720P**.</p>
     * <br>
     * <p>To view the license type of a product, choose **License Management > Product Authorization** in the **Real-time Communication Service** console.</p>
     */
    @NameInMap("LicenseCode")
    public String licenseCode;

    /**
     * <p>The ProductKey of the product from which you want to unbind the license.</p>
     * <br>
     * <p>You can choose **License Management > Product Authorization** in the **Real-Time Communication Service** console to view the **ProductKey** of the product.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    public static UnbindLicenseProductRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindLicenseProductRequest self = new UnbindLicenseProductRequest();
        return TeaModel.build(map, self);
    }

    public UnbindLicenseProductRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public UnbindLicenseProductRequest setLicenseCode(String licenseCode) {
        this.licenseCode = licenseCode;
        return this;
    }
    public String getLicenseCode() {
        return this.licenseCode;
    }

    public UnbindLicenseProductRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
