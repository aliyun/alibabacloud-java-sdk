// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class CredentialSubmitIntlV2Request extends TeaModel {
    /**
     * <p>The field validation rule configuration. The value is a JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;address_rule&quot;: &quot;Includes Adrress Hangzhou ***&quot;,
     *     &quot;name_rule&quot;: &quot;Includes Name  Zhang*&quot;,
     *     &quot;date_of_issue_rule&quot;: &quot;Whthin 2026.05.20&quot;
     * }</p>
     */
    @NameInMap("CheckRuleConfig")
    public String checkRuleConfig;

    /**
     * <p>The Base64-encoded image. If you choose this method to submit a photo, check the photo size and do not submit an excessively large photo.</p>
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
     * <li>01: Transaction voucher, which includes electronic bill images for utilities such as water, electricity, gas, and credit cards.</li>
     * <li>02: Vehicle registration certificate.</li>
     * <li>03: Transfer transaction record.</li>
     * <li>04: Proof of address (POA).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>02</p>
     */
    @NameInMap("DocType")
    public String docType;

    /**
     * <p>The type of the input material. Valid values:</p>
     * <ul>
     * <li>IMAGE (default): image.</li>
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
     * <li>true: Enabled.</li>
     * <li>false: Disabled.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
     * <p>The unique identifier of the merchant request. The value is a 32-character alphanumeric string.</p>
     * <p>The first few characters consist of a custom abbreviation defined by the merchant, the middle part can contain a time segment, and the last part can use a random or incremental sequence.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dso932dsjsd22</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    /**
     * <p>The extraction type. Valid values:
     * 0101: electronic bill address and name module (extracts address and name modules through intelligent analysis).
     * 0201: 
     * 0301: transfer transaction amount information.
     * 0401: POA credential extraction information.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0201</p>
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
     * <p>Specifies whether to enable standardization of key fields recognized by OCR. Valid values:</p>
     * <ul>
     * <li>0: Disabled (default). </li>
     * <li>1: Enabled.</li>
     * </ul>
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

    /**
     * <p>The custom verification scenario ID. You can use this scenario ID to query related records in the console. The value is a combination of up to 10 letters, digits, or underscores.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("SceneCode")
    public String sceneCode;

    public static CredentialSubmitIntlV2Request build(java.util.Map<String, ?> map) throws Exception {
        CredentialSubmitIntlV2Request self = new CredentialSubmitIntlV2Request();
        return TeaModel.build(map, self);
    }

    public CredentialSubmitIntlV2Request setCheckRuleConfig(String checkRuleConfig) {
        this.checkRuleConfig = checkRuleConfig;
        return this;
    }
    public String getCheckRuleConfig() {
        return this.checkRuleConfig;
    }

    public CredentialSubmitIntlV2Request setCredentialOcrPictureBase64(String credentialOcrPictureBase64) {
        this.credentialOcrPictureBase64 = credentialOcrPictureBase64;
        return this;
    }
    public String getCredentialOcrPictureBase64() {
        return this.credentialOcrPictureBase64;
    }

    public CredentialSubmitIntlV2Request setCredentialOcrPictureFile(String credentialOcrPictureFile) {
        this.credentialOcrPictureFile = credentialOcrPictureFile;
        return this;
    }
    public String getCredentialOcrPictureFile() {
        return this.credentialOcrPictureFile;
    }

    public CredentialSubmitIntlV2Request setCredentialOcrPictureUrl(String credentialOcrPictureUrl) {
        this.credentialOcrPictureUrl = credentialOcrPictureUrl;
        return this;
    }
    public String getCredentialOcrPictureUrl() {
        return this.credentialOcrPictureUrl;
    }

    public CredentialSubmitIntlV2Request setDocType(String docType) {
        this.docType = docType;
        return this;
    }
    public String getDocType() {
        return this.docType;
    }

    public CredentialSubmitIntlV2Request setFileInputType(String fileInputType) {
        this.fileInputType = fileInputType;
        return this;
    }
    public String getFileInputType() {
        return this.fileInputType;
    }

    public CredentialSubmitIntlV2Request setFraudCheck(String fraudCheck) {
        this.fraudCheck = fraudCheck;
        return this;
    }
    public String getFraudCheck() {
        return this.fraudCheck;
    }

    public CredentialSubmitIntlV2Request setIdQuality(String idQuality) {
        this.idQuality = idQuality;
        return this;
    }
    public String getIdQuality() {
        return this.idQuality;
    }

    public CredentialSubmitIntlV2Request setMerchantBizId(String merchantBizId) {
        this.merchantBizId = merchantBizId;
        return this;
    }
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    public CredentialSubmitIntlV2Request setOcrArea(String ocrArea) {
        this.ocrArea = ocrArea;
        return this;
    }
    public String getOcrArea() {
        return this.ocrArea;
    }

    public CredentialSubmitIntlV2Request setOcrTranslation(String ocrTranslation) {
        this.ocrTranslation = ocrTranslation;
        return this;
    }
    public String getOcrTranslation() {
        return this.ocrTranslation;
    }

    public CredentialSubmitIntlV2Request setOcrValueStandard(String ocrValueStandard) {
        this.ocrValueStandard = ocrValueStandard;
        return this;
    }
    public String getOcrValueStandard() {
        return this.ocrValueStandard;
    }

    public CredentialSubmitIntlV2Request setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public CredentialSubmitIntlV2Request setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

}
