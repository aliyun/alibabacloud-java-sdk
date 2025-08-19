// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CredentialProductVerifyV2Request extends TeaModel {
    /**
     * <p>Credential name: Only supports value 0501 (product image).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0501</p>
     */
    @NameInMap("CredName")
    public String credName;

    /**
     * <p>Credential type: Only supports value 05 (product image).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>05</p>
     */
    @NameInMap("CredType")
    public String credType;

    /**
     * <p>InputStream object of the image.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://aliyundoc.com/picture*****.jpeg">https://aliyundoc.com/picture*****.jpeg</a></p>
     */
    @NameInMap("ImageFile")
    public String imageFile;

    /**
     * <p>URL of the image.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://aliyundoc.com/picture*****.jpeg">https://aliyundoc.com/picture*****.jpeg</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>Merchant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>无。</p>
     */
    @NameInMap("MerchantId")
    public String merchantId;

    /**
     * <p>Invocation mode:
     * Only supports value ANTI_FAKE_CHECK.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ANTI_FAKE_CHECK</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    public static CredentialProductVerifyV2Request build(java.util.Map<String, ?> map) throws Exception {
        CredentialProductVerifyV2Request self = new CredentialProductVerifyV2Request();
        return TeaModel.build(map, self);
    }

    public CredentialProductVerifyV2Request setCredName(String credName) {
        this.credName = credName;
        return this;
    }
    public String getCredName() {
        return this.credName;
    }

    public CredentialProductVerifyV2Request setCredType(String credType) {
        this.credType = credType;
        return this;
    }
    public String getCredType() {
        return this.credType;
    }

    public CredentialProductVerifyV2Request setImageFile(String imageFile) {
        this.imageFile = imageFile;
        return this;
    }
    public String getImageFile() {
        return this.imageFile;
    }

    public CredentialProductVerifyV2Request setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public CredentialProductVerifyV2Request setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public CredentialProductVerifyV2Request setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
