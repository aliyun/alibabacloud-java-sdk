// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class CredentialRecognitionIntlRequest extends TeaModel {
    /**
     * <p>Base64 encoded image. If you choose to upload the photo via IdOcrPictureBase64 (photo Base64 encoding), please check the photo size and do not upload overly large photos.</p>
     * 
     * <strong>example:</strong>
     * <p>base64</p>
     */
    @NameInMap("CredentialOcrPictureBase64")
    public String credentialOcrPictureBase64;

    /**
     * <p>Image URL, accessible over the public network via HTTP or HTTPS links.</p>
     * 
     * <strong>example:</strong>
     * <p>https://***</p>
     */
    @NameInMap("CredentialOcrPictureUrl")
    public String credentialOcrPictureUrl;

    /**
     * <p>Voucher type.</p>
     * <ul>
     * <li>Transaction Voucher: 01 (including: water, electricity, gas, credit card, and other types of e-bill images)</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("DocType")
    public String docType;

    /**
     * <p>Whether to enable tampering detection</p>
     * <ul>
     * <li>true: Enable</li>
     * <li>false: Disable</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("FraudCheck")
    public String fraudCheck;

    /**
     * <p>Extraction type:</p>
     * <ul>
     * <li>0101: E-bill Address &amp; Name Module (extracts address and name modules through intelligent analysis)</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0101</p>
     */
    @NameInMap("OcrArea")
    public String ocrArea;

    /**
     * <p>The product solution to be integrated. Value: CREDENTIAL_RECOGNITION.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CREDENTIAL_RECOGNITION</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    public static CredentialRecognitionIntlRequest build(java.util.Map<String, ?> map) throws Exception {
        CredentialRecognitionIntlRequest self = new CredentialRecognitionIntlRequest();
        return TeaModel.build(map, self);
    }

    public CredentialRecognitionIntlRequest setCredentialOcrPictureBase64(String credentialOcrPictureBase64) {
        this.credentialOcrPictureBase64 = credentialOcrPictureBase64;
        return this;
    }
    public String getCredentialOcrPictureBase64() {
        return this.credentialOcrPictureBase64;
    }

    public CredentialRecognitionIntlRequest setCredentialOcrPictureUrl(String credentialOcrPictureUrl) {
        this.credentialOcrPictureUrl = credentialOcrPictureUrl;
        return this;
    }
    public String getCredentialOcrPictureUrl() {
        return this.credentialOcrPictureUrl;
    }

    public CredentialRecognitionIntlRequest setDocType(String docType) {
        this.docType = docType;
        return this;
    }
    public String getDocType() {
        return this.docType;
    }

    public CredentialRecognitionIntlRequest setFraudCheck(String fraudCheck) {
        this.fraudCheck = fraudCheck;
        return this;
    }
    public String getFraudCheck() {
        return this.fraudCheck;
    }

    public CredentialRecognitionIntlRequest setOcrArea(String ocrArea) {
        this.ocrArea = ocrArea;
        return this;
    }
    public String getOcrArea() {
        return this.ocrArea;
    }

    public CredentialRecognitionIntlRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
