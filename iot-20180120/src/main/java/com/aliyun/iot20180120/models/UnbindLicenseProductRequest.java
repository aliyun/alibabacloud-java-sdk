// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UnbindLicenseProductRequest extends TeaModel {
    /**
     * <p>The ID of the Enterprise Edition instance. You can view the <strong>ID</strong> of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-s3***</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The license type that specifies the audio and video specifications. Valid values: <strong>480P</strong> and <strong>720P</strong>.</p>
     * <p>To view the license type of a product, choose <strong>License Management &gt; Product Authorization</strong> in the <strong>Real-time Communication Service</strong> console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>480P</p>
     */
    @NameInMap("LicenseCode")
    public String licenseCode;

    /**
     * <p>The ProductKey of the product from which you want to unbind the license.</p>
     * <p>You can choose <strong>License Management &gt; Product Authorization</strong> in the <strong>Real-Time Communication Service</strong> console to view the <strong>ProductKey</strong> of the product.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gq62z***</p>
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
