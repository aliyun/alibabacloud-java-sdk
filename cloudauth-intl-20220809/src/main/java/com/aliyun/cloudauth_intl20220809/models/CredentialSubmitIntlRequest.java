// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class CredentialSubmitIntlRequest extends TeaModel {
    /**
     * <p>The field validation rule configuration in JSON string format.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;address_rule&quot;: &quot;Includes Address Hangzhou***&quot;,
     *     &quot;name_rule&quot;: &quot;Includes Name Zhang*&quot;,
     *     &quot;date_of_issue_rule&quot;: &quot;Whthin 2026.05.20&quot;
     * }</p>
     */
    @NameInMap("CheckRuleConfig")
    public String checkRuleConfig;

    /**
     * <p>The Base64-encoded image. If you use this method to submit a photo, check the photo size and do not submit an excessively large photo.</p>
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
     * <li>02: vehicle registration certificate</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>02</p>
     */
    @NameInMap("DocType")
    public String docType;

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
     * <p>Specifies whether to enable quality detection. Valid values:</p>
     * <ul>
     * <li>Y: Enabled.</li>
     * <li>N: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("IdQuality")
    public String idQuality;

    /**
     * <p>The merchant-defined unique business identifier, used for subsequent troubleshooting. The value can be a combination of letters and numbers with a maximum length of 32 characters. Ensure that the value is unique.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e0c34a***353888</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    /**
     * <p>The extraction type. Valid values:</p>
     * <ul>
     * <li>0201: Thailand vehicle registration certificate</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0201</p>
     */
    @NameInMap("OcrArea")
    public String ocrArea;

    /**
     * <p>Specifies whether to enable translation. Valid values:</p>
     * <ul>
     * <li>0: Disabled.</li>
     * <li>1: Enabled.</li>
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
     * <li>0: Disabled.</li>
     * <li>1: Enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("OcrValueStandard")
    public String ocrValueStandard;

    /**
     * <p>The product solution to use. Set this to CREDENTIAL_RECOGNITION.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CREDENTIAL_RECOGNITION</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The custom authentication scenario ID. You can use this ID to query related records in the console. The value can be a combination of letters, numbers, or underscores with a maximum length of 10 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123****123</p>
     */
    @NameInMap("SceneCode")
    public String sceneCode;

    public static CredentialSubmitIntlRequest build(java.util.Map<String, ?> map) throws Exception {
        CredentialSubmitIntlRequest self = new CredentialSubmitIntlRequest();
        return TeaModel.build(map, self);
    }

    public CredentialSubmitIntlRequest setCheckRuleConfig(String checkRuleConfig) {
        this.checkRuleConfig = checkRuleConfig;
        return this;
    }
    public String getCheckRuleConfig() {
        return this.checkRuleConfig;
    }

    public CredentialSubmitIntlRequest setCredentialOcrPictureBase64(String credentialOcrPictureBase64) {
        this.credentialOcrPictureBase64 = credentialOcrPictureBase64;
        return this;
    }
    public String getCredentialOcrPictureBase64() {
        return this.credentialOcrPictureBase64;
    }

    public CredentialSubmitIntlRequest setCredentialOcrPictureUrl(String credentialOcrPictureUrl) {
        this.credentialOcrPictureUrl = credentialOcrPictureUrl;
        return this;
    }
    public String getCredentialOcrPictureUrl() {
        return this.credentialOcrPictureUrl;
    }

    public CredentialSubmitIntlRequest setDocType(String docType) {
        this.docType = docType;
        return this;
    }
    public String getDocType() {
        return this.docType;
    }

    public CredentialSubmitIntlRequest setFraudCheck(String fraudCheck) {
        this.fraudCheck = fraudCheck;
        return this;
    }
    public String getFraudCheck() {
        return this.fraudCheck;
    }

    public CredentialSubmitIntlRequest setIdQuality(String idQuality) {
        this.idQuality = idQuality;
        return this;
    }
    public String getIdQuality() {
        return this.idQuality;
    }

    public CredentialSubmitIntlRequest setMerchantBizId(String merchantBizId) {
        this.merchantBizId = merchantBizId;
        return this;
    }
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    public CredentialSubmitIntlRequest setOcrArea(String ocrArea) {
        this.ocrArea = ocrArea;
        return this;
    }
    public String getOcrArea() {
        return this.ocrArea;
    }

    public CredentialSubmitIntlRequest setOcrTranslation(String ocrTranslation) {
        this.ocrTranslation = ocrTranslation;
        return this;
    }
    public String getOcrTranslation() {
        return this.ocrTranslation;
    }

    public CredentialSubmitIntlRequest setOcrValueStandard(String ocrValueStandard) {
        this.ocrValueStandard = ocrValueStandard;
        return this;
    }
    public String getOcrValueStandard() {
        return this.ocrValueStandard;
    }

    public CredentialSubmitIntlRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public CredentialSubmitIntlRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

}
