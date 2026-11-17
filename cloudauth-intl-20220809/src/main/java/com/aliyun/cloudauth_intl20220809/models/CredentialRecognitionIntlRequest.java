// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class CredentialRecognitionIntlRequest extends TeaModel {
    /**
     * <p>The field validation rule configuration. The value is a JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;address_rule&quot;: &quot;Includes Adrress Hangzhou***&quot;,
     *     &quot;name_rule&quot;: &quot;Includes Name Zhang*&quot;,
     *     &quot;date_of_issue_rule&quot;: &quot;Whthin 2026.05.20&quot;
     * }</p>
     */
    @NameInMap("CheckRuleConfig")
    public String checkRuleConfig;

    /**
     * <p>The Base64-encoded image. If you use the IdOcrPictureBase64 parameter to pass the Base64-encoded photo, check the photo size and do not pass oversized photos.</p>
     * 
     * <strong>example:</strong>
     * <p>base64</p>
     */
    @NameInMap("CredentialOcrPictureBase64")
    public String credentialOcrPictureBase64;

    /**
     * <p>The URL of the image. The URL must be a publicly accessible HTTP or HTTPS link.</p>
     * 
     * <strong>example:</strong>
     * <p>https://***</p>
     */
    @NameInMap("CredentialOcrPictureUrl")
    public String credentialOcrPictureUrl;

    /**
     * <p>The credential type. Valid values:</p>
     * <ul>
     * <li>01: transaction credentials, including electronic bills for utilities such as water, electricity, and gas, as well as credit card statements.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("DocType")
    public String docType;

    /**
     * <p>The material input type. Valid values:</p>
     * <ul>
     * <li>IMAGE: image. This is the default value.</li>
     * <li>PDF: PDF format.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>IMAGE</p>
     */
    @NameInMap("FileInputType")
    public String fileInputType;

    /**
     * <p>Specifies whether to enable tampering detection. Valid values:</p>
     * <ul>
     * <li>true: enabled.</li>
     * <li>false: disabled.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("FraudCheck")
    public String fraudCheck;

    /**
     * <p>Specifies whether to enable the quality check. Valid values:</p>
     * <ul>
     * <li>Y: enabled.</li>
     * <li>N: disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("IdQuality")
    public String idQuality;

    /**
     * <p>The extraction type. Valid values:</p>
     * <ul>
     * <li>0101: electronic bill address and name module. The address and name are extracted through intelligent analysis.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0101</p>
     */
    @NameInMap("OcrArea")
    public String ocrArea;

    /**
     * <p>Specifies whether to enable translation. Valid values:</p>
     * <ul>
     * <li>0: disabled.</li>
     * <li>1: enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("OcrTranslation")
    public String ocrTranslation;

    /**
     * <p>Specifies whether to enable OCR result standardization. Valid values:</p>
     * <ul>
     * <li>0: disabled.</li>
     * <li>1: enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("OcrValueStandard")
    public String ocrValueStandard;

    /**
     * <p>The product solution to be integrated. Valid value: CREDENTIAL_RECOGNITION.</p>
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

    public CredentialRecognitionIntlRequest setCheckRuleConfig(String checkRuleConfig) {
        this.checkRuleConfig = checkRuleConfig;
        return this;
    }
    public String getCheckRuleConfig() {
        return this.checkRuleConfig;
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

    public CredentialRecognitionIntlRequest setFileInputType(String fileInputType) {
        this.fileInputType = fileInputType;
        return this;
    }
    public String getFileInputType() {
        return this.fileInputType;
    }

    public CredentialRecognitionIntlRequest setFraudCheck(String fraudCheck) {
        this.fraudCheck = fraudCheck;
        return this;
    }
    public String getFraudCheck() {
        return this.fraudCheck;
    }

    public CredentialRecognitionIntlRequest setIdQuality(String idQuality) {
        this.idQuality = idQuality;
        return this;
    }
    public String getIdQuality() {
        return this.idQuality;
    }

    public CredentialRecognitionIntlRequest setOcrArea(String ocrArea) {
        this.ocrArea = ocrArea;
        return this;
    }
    public String getOcrArea() {
        return this.ocrArea;
    }

    public CredentialRecognitionIntlRequest setOcrTranslation(String ocrTranslation) {
        this.ocrTranslation = ocrTranslation;
        return this;
    }
    public String getOcrTranslation() {
        return this.ocrTranslation;
    }

    public CredentialRecognitionIntlRequest setOcrValueStandard(String ocrValueStandard) {
        this.ocrValueStandard = ocrValueStandard;
        return this;
    }
    public String getOcrValueStandard() {
        return this.ocrValueStandard;
    }

    public CredentialRecognitionIntlRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
