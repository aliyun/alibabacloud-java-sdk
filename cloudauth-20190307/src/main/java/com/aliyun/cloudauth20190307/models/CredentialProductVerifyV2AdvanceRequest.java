// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CredentialProductVerifyV2AdvanceRequest extends TeaModel {
    /**
     * <p>The credential name. Only the following value is supported: 0501 (product image).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0501</p>
     */
    @NameInMap("CredName")
    public String credName;

    /**
     * <p>The credential type. Only the following value is supported: 05 (product image).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>05</p>
     */
    @NameInMap("CredType")
    public String credType;

    /**
     * <p>The InputStream object of the image.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://aliyundoc.com/picture*****.jpeg">https://aliyundoc.com/picture*****.jpeg</a></p>
     */
    @NameInMap("ImageFile")
    public java.io.InputStream imageFileObject;

    /**
     * <p>The URL of the image.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://aliyundoc.com/picture*****.jpeg">https://aliyundoc.com/picture*****.jpeg</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>The merchant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>无。</p>
     */
    @NameInMap("MerchantId")
    public String merchantId;

    /**
     * <p>The call mode. Only the following value is supported: ANTI_FAKE_CHECK.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ANTI_FAKE_CHECK</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    public static CredentialProductVerifyV2AdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CredentialProductVerifyV2AdvanceRequest self = new CredentialProductVerifyV2AdvanceRequest();
        return TeaModel.build(map, self);
    }

    public CredentialProductVerifyV2AdvanceRequest setCredName(String credName) {
        this.credName = credName;
        return this;
    }
    public String getCredName() {
        return this.credName;
    }

    public CredentialProductVerifyV2AdvanceRequest setCredType(String credType) {
        this.credType = credType;
        return this;
    }
    public String getCredType() {
        return this.credType;
    }

    public CredentialProductVerifyV2AdvanceRequest setImageFileObject(java.io.InputStream imageFileObject) {
        this.imageFileObject = imageFileObject;
        return this;
    }
    public java.io.InputStream getImageFileObject() {
        return this.imageFileObject;
    }

    public CredentialProductVerifyV2AdvanceRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public CredentialProductVerifyV2AdvanceRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public CredentialProductVerifyV2AdvanceRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
