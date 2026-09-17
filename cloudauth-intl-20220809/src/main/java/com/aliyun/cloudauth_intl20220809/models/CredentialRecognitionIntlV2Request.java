// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class CredentialRecognitionIntlV2Request extends TeaModel {
    /**
     * <p>The field validation rule configuration, in JSON string format.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;address_rule&quot;: &quot;Includes Adrress Hangzhou***&quot;,
     *     &quot;name_rule&quot;: &quot;Includes Name  Zhang*&quot;,
     *     &quot;date_of_issue_rule&quot;: &quot;Whthin 2026.05.20&quot;
     * }</p>
     */
    @NameInMap("CheckRuleConfig")
    public String checkRuleConfig;

    /**
     * <p>The Base64-encoded image. If you choose to pass in the image by using IdOcrPictureBase64 (Base64-encoded photo), check the photo size and do not pass in an excessively large photo.</p>
     * 
     * <strong>example:</strong>
     * <p>base64</p>
     */
    @NameInMap("CredentialOcrPictureBase64")
    public String credentialOcrPictureBase64;

    /**
     * <p>The image file stream.</p>
     * 
     * <strong>example:</strong>
     * <p>InputStream</p>
     */
    @NameInMap("CredentialOcrPictureFile")
    public String credentialOcrPictureFile;

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
     * <li>01: transaction credential (including electronic bill images for water, electricity, gas, credit cards, and other types)</li>
     * <li>02: vehicle registration certificate</li>
     * <li>03: transfer transaction record</li>
     * <li>04: POA address proof</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("DocType")
    public String docType;

    /**
     * <p>The input material type. Valid values:</p>
     * <ul>
     * <li>IMAGE (default): image</li>
     * <li>PDF: PDF format</li>
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
     * <li>true: Enabled.</li>
     * <li>false: Disabled.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("FraudCheck")
    public String fraudCheck;

    /**
     * <p>Specifies whether to enable quality detection. Valid values: Y (enabled) and N (disabled).</p>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("IdQuality")
    public String idQuality;

    /**
     * <p>The extraction type. Valid values:</p>
     * <ul>
     * <li>0101: electronic bill address and name module (extracts address and name modules through intelligent analysis)</li>
     * <li>0201: Thailand vehicle registration certificate</li>
     * <li>0301: transfer transaction amount information</li>
     * <li>0401: POA credential extraction information</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0101</p>
     */
    @NameInMap("OcrArea")
    public String ocrArea;

    /**
     * <p>Specifies whether to enable translation. Valid values: 0 (disabled) and 1 (enabled).</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("OcrTranslation")
    public String ocrTranslation;

    /**
     * <p>Specifies whether to enable OCR result normalization. Valid values: 0 (disabled) and 1 (enabled).</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("OcrValueStandard")
    public String ocrValueStandard;

    /**
     * <p>The product solution to use. Set the value to CREDENTIAL_RECOGNITION.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CREDENTIAL_RECOGNITION</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    public static CredentialRecognitionIntlV2Request build(java.util.Map<String, ?> map) throws Exception {
        CredentialRecognitionIntlV2Request self = new CredentialRecognitionIntlV2Request();
        return TeaModel.build(map, self);
    }

    public CredentialRecognitionIntlV2Request setCheckRuleConfig(String checkRuleConfig) {
        this.checkRuleConfig = checkRuleConfig;
        return this;
    }
    public String getCheckRuleConfig() {
        return this.checkRuleConfig;
    }

    public CredentialRecognitionIntlV2Request setCredentialOcrPictureBase64(String credentialOcrPictureBase64) {
        this.credentialOcrPictureBase64 = credentialOcrPictureBase64;
        return this;
    }
    public String getCredentialOcrPictureBase64() {
        return this.credentialOcrPictureBase64;
    }

    public CredentialRecognitionIntlV2Request setCredentialOcrPictureFile(String credentialOcrPictureFile) {
        this.credentialOcrPictureFile = credentialOcrPictureFile;
        return this;
    }
    public String getCredentialOcrPictureFile() {
        return this.credentialOcrPictureFile;
    }

    public CredentialRecognitionIntlV2Request setCredentialOcrPictureUrl(String credentialOcrPictureUrl) {
        this.credentialOcrPictureUrl = credentialOcrPictureUrl;
        return this;
    }
    public String getCredentialOcrPictureUrl() {
        return this.credentialOcrPictureUrl;
    }

    public CredentialRecognitionIntlV2Request setDocType(String docType) {
        this.docType = docType;
        return this;
    }
    public String getDocType() {
        return this.docType;
    }

    public CredentialRecognitionIntlV2Request setFileInputType(String fileInputType) {
        this.fileInputType = fileInputType;
        return this;
    }
    public String getFileInputType() {
        return this.fileInputType;
    }

    public CredentialRecognitionIntlV2Request setFraudCheck(String fraudCheck) {
        this.fraudCheck = fraudCheck;
        return this;
    }
    public String getFraudCheck() {
        return this.fraudCheck;
    }

    public CredentialRecognitionIntlV2Request setIdQuality(String idQuality) {
        this.idQuality = idQuality;
        return this;
    }
    public String getIdQuality() {
        return this.idQuality;
    }

    public CredentialRecognitionIntlV2Request setOcrArea(String ocrArea) {
        this.ocrArea = ocrArea;
        return this;
    }
    public String getOcrArea() {
        return this.ocrArea;
    }

    public CredentialRecognitionIntlV2Request setOcrTranslation(String ocrTranslation) {
        this.ocrTranslation = ocrTranslation;
        return this;
    }
    public String getOcrTranslation() {
        return this.ocrTranslation;
    }

    public CredentialRecognitionIntlV2Request setOcrValueStandard(String ocrValueStandard) {
        this.ocrValueStandard = ocrValueStandard;
        return this;
    }
    public String getOcrValueStandard() {
        return this.ocrValueStandard;
    }

    public CredentialRecognitionIntlV2Request setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
