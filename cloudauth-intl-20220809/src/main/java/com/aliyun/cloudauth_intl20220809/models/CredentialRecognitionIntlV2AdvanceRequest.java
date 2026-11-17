// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class CredentialRecognitionIntlV2AdvanceRequest extends TeaModel {
    /**
     * <p>The field validation rule configuration. The value is a JSON string.</p>
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
     * <p>The Base64-encoded image. If you choose to pass the photo by using IdOcrPictureBase64, check the photo size and do not pass excessively large photos.</p>
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
    public java.io.InputStream credentialOcrPictureFileObject;

    /**
     * <p>The image URL. The URL must be a publicly accessible HTTP or HTTPS link.</p>
     * 
     * <strong>example:</strong>
     * <p>https://***</p>
     */
    @NameInMap("CredentialOcrPictureUrl")
    public String credentialOcrPictureUrl;

    /**
     * <p>The credential type. Valid values:</p>
     * <ul>
     * <li>01: transaction receipt, including electronic bills for utilities and credit cards</li>
     * <li>02: vehicle registration certificate</li>
     * <li>03: transfer transaction record</li>
     * <li>04: proof of address (POA)</li>
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
     * <li>IMAGE: image</li>
     * <li>PDF: PDF format
     * Default value: IMAGE.</li>
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
     * <li>true: enables tampering detection.</li>
     * <li>false: disables tampering detection.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("FraudCheck")
    public String fraudCheck;

    /**
     * <p>Specifies whether to enable quality detection. Valid values:</p>
     * <ul>
     * <li>Y: enables quality detection.</li>
     * <li>N: disables quality detection.</li>
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
     * <li>0101: electronic bill address and name module, which extracts the address and name module through intelligent analysis</li>
     * <li>0201: Thailand vehicle registration certificate</li>
     * <li>0301: transfer transaction record amount information</li>
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
     * <p>Specifies whether to enable translation. Valid values:</p>
     * <ul>
     * <li>0: disables translation.</li>
     * <li>1: enables translation.</li>
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
     * <li>0: disables OCR result standardization.</li>
     * <li>1: enables OCR result standardization.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
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

    public static CredentialRecognitionIntlV2AdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CredentialRecognitionIntlV2AdvanceRequest self = new CredentialRecognitionIntlV2AdvanceRequest();
        return TeaModel.build(map, self);
    }

    public CredentialRecognitionIntlV2AdvanceRequest setCheckRuleConfig(String checkRuleConfig) {
        this.checkRuleConfig = checkRuleConfig;
        return this;
    }
    public String getCheckRuleConfig() {
        return this.checkRuleConfig;
    }

    public CredentialRecognitionIntlV2AdvanceRequest setCredentialOcrPictureBase64(String credentialOcrPictureBase64) {
        this.credentialOcrPictureBase64 = credentialOcrPictureBase64;
        return this;
    }
    public String getCredentialOcrPictureBase64() {
        return this.credentialOcrPictureBase64;
    }

    public CredentialRecognitionIntlV2AdvanceRequest setCredentialOcrPictureFileObject(java.io.InputStream credentialOcrPictureFileObject) {
        this.credentialOcrPictureFileObject = credentialOcrPictureFileObject;
        return this;
    }
    public java.io.InputStream getCredentialOcrPictureFileObject() {
        return this.credentialOcrPictureFileObject;
    }

    public CredentialRecognitionIntlV2AdvanceRequest setCredentialOcrPictureUrl(String credentialOcrPictureUrl) {
        this.credentialOcrPictureUrl = credentialOcrPictureUrl;
        return this;
    }
    public String getCredentialOcrPictureUrl() {
        return this.credentialOcrPictureUrl;
    }

    public CredentialRecognitionIntlV2AdvanceRequest setDocType(String docType) {
        this.docType = docType;
        return this;
    }
    public String getDocType() {
        return this.docType;
    }

    public CredentialRecognitionIntlV2AdvanceRequest setFileInputType(String fileInputType) {
        this.fileInputType = fileInputType;
        return this;
    }
    public String getFileInputType() {
        return this.fileInputType;
    }

    public CredentialRecognitionIntlV2AdvanceRequest setFraudCheck(String fraudCheck) {
        this.fraudCheck = fraudCheck;
        return this;
    }
    public String getFraudCheck() {
        return this.fraudCheck;
    }

    public CredentialRecognitionIntlV2AdvanceRequest setIdQuality(String idQuality) {
        this.idQuality = idQuality;
        return this;
    }
    public String getIdQuality() {
        return this.idQuality;
    }

    public CredentialRecognitionIntlV2AdvanceRequest setOcrArea(String ocrArea) {
        this.ocrArea = ocrArea;
        return this;
    }
    public String getOcrArea() {
        return this.ocrArea;
    }

    public CredentialRecognitionIntlV2AdvanceRequest setOcrTranslation(String ocrTranslation) {
        this.ocrTranslation = ocrTranslation;
        return this;
    }
    public String getOcrTranslation() {
        return this.ocrTranslation;
    }

    public CredentialRecognitionIntlV2AdvanceRequest setOcrValueStandard(String ocrValueStandard) {
        this.ocrValueStandard = ocrValueStandard;
        return this;
    }
    public String getOcrValueStandard() {
        return this.ocrValueStandard;
    }

    public CredentialRecognitionIntlV2AdvanceRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
