// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DocOcrMaxRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable verification with an authoritative data source to enhance document anti-spoofing capabilities.</p>
     * <ul>
     * <li><p><strong>T</strong>: Enable</p>
     * </li>
     * <li><p><strong>F</strong>: Disable (default)</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><strong>Applicable document types</strong>: Chinese resident ID cards (CHN01001) and Chinese mainland driver\&quot;s licenses (CHN02001).</li>
     * <li><strong>Data transfer declaration</strong>: If you enable this parameter, you agree to transfer the user\&quot;s name and certificate number to an authoritative data source in the Chinese mainland for consistency verification.</li>
     * <li><strong>Performance impact:</strong> After you enable this feature, the response time of the API operation increases by 1 to 2 seconds. Adjust the timeout setting.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>T</p>
     */
    @NameInMap("Authorize")
    public String authorize;

    /**
     * <p>Page expected to be recognized</p>
     * <ul>
     * <li><p>01 (default): ID portrait.</p>
     * </li>
     * <li><p>02: Back of the certificate</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("DocPage")
    public String docPage;

    /**
     * <p>Document type.
     * Format: Country (region) code + document type abbreviation + page (optional)
     * Note: If provided, it will automatically check if it matches the model recognition result; if empty, the document type will be returned after model recognition.</p>
     * 
     * <strong>example:</strong>
     * <p>CNSSC01</p>
     */
    @NameInMap("DocType")
    public String docType;

    /**
     * <p>Document image, base64 encoded binary stream</p>
     * 
     * <strong>example:</strong>
     * <p>base64</p>
     */
    @NameInMap("IdOcrPictureBase64")
    public String idOcrPictureBase64;

    /**
     * <p>Document image URL</p>
     * 
     * <strong>example:</strong>
     * <p>https://***********.oss-cn-hangzhou.aliyuncs.com/1669520556530-expo/default/face/20221127114236530_w3kx2e6t.jpg</p>
     */
    @NameInMap("IdOcrPictureUrl")
    public String idOcrPictureUrl;

    /**
     * <p>Whether to turn on the certificate anti-counterfeiting function:</p>
     * <ul>
     * <li><p>T: open</p>
     * </li>
     * <li><p>F (default): not turned on.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>F</p>
     */
    @NameInMap("IdSpoof")
    public String idSpoof;

    /**
     * <p>Custom OCR quality detection threshold mode:</p>
     * <ul>
     * <li>0: System default</li>
     * <li>1: Strict mode</li>
     * <li>2: Lenient mode</li>
     * <li>3 (default): Disable quality detection</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IdThreshold")
    public String idThreshold;

    /**
     * <p>A unique business identifier defined by the merchant, used for subsequent problem localization and troubleshooting. It supports a combination of letters and numbers, with a maximum length of 32 characters. Please ensure its uniqueness.</p>
     * 
     * <strong>example:</strong>
     * <p>e0c34a77f5ac40a5aa5e6ed20c******</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    /**
     * <p>Your custom user ID or other identifiers that can uniquely identify a specific user, such as a phone number or email address. It is strongly recommended to pre-desensitize the value of this field, for example, by hashing it.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("MerchantUserId")
    public String merchantUserId;

    /**
     * <p>OCR recognition mode.
     * 0: General document mode.
     * 1: Custom mode.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("OcrModel")
    public String ocrModel;

    /**
     * <p>Specifies whether to return additional OCR fields in a standardized format:</p>
     * <ul>
     * <li><p><strong>0</strong>: No (default)</p>
     * </li>
     * <li><p><strong>1</strong>: Yes</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("OcrValueStandard")
    public String ocrValueStandard;

    /**
     * <p>The product solution to be integrated.</p>
     * <p>Value: ID_OCR_MAX</p>
     * 
     * <strong>example:</strong>
     * <p>ID_OCR_MAX</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>Prompt (for custom mode)</p>
     * 
     * <strong>example:</strong>
     * <p>xxxocr识别</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <p>Custom scene code, used to distinguish business scenarios, a 10-digit number.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("SceneCode")
    public String sceneCode;

    /**
     * <p>Whether to enable document anti-counterfeiting function, default is not enabled.</p>
     * <ul>
     * <li>T: Enable document anti-counterfeiting function.</li>
     * <li>F: Do not enable.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>F</p>
     */
    @NameInMap("Spoof")
    public String spoof;

    public static DocOcrMaxRequest build(java.util.Map<String, ?> map) throws Exception {
        DocOcrMaxRequest self = new DocOcrMaxRequest();
        return TeaModel.build(map, self);
    }

    public DocOcrMaxRequest setAuthorize(String authorize) {
        this.authorize = authorize;
        return this;
    }
    public String getAuthorize() {
        return this.authorize;
    }

    public DocOcrMaxRequest setDocPage(String docPage) {
        this.docPage = docPage;
        return this;
    }
    public String getDocPage() {
        return this.docPage;
    }

    public DocOcrMaxRequest setDocType(String docType) {
        this.docType = docType;
        return this;
    }
    public String getDocType() {
        return this.docType;
    }

    public DocOcrMaxRequest setIdOcrPictureBase64(String idOcrPictureBase64) {
        this.idOcrPictureBase64 = idOcrPictureBase64;
        return this;
    }
    public String getIdOcrPictureBase64() {
        return this.idOcrPictureBase64;
    }

    public DocOcrMaxRequest setIdOcrPictureUrl(String idOcrPictureUrl) {
        this.idOcrPictureUrl = idOcrPictureUrl;
        return this;
    }
    public String getIdOcrPictureUrl() {
        return this.idOcrPictureUrl;
    }

    public DocOcrMaxRequest setIdSpoof(String idSpoof) {
        this.idSpoof = idSpoof;
        return this;
    }
    public String getIdSpoof() {
        return this.idSpoof;
    }

    public DocOcrMaxRequest setIdThreshold(String idThreshold) {
        this.idThreshold = idThreshold;
        return this;
    }
    public String getIdThreshold() {
        return this.idThreshold;
    }

    public DocOcrMaxRequest setMerchantBizId(String merchantBizId) {
        this.merchantBizId = merchantBizId;
        return this;
    }
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    public DocOcrMaxRequest setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId;
        return this;
    }
    public String getMerchantUserId() {
        return this.merchantUserId;
    }

    public DocOcrMaxRequest setOcrModel(String ocrModel) {
        this.ocrModel = ocrModel;
        return this;
    }
    public String getOcrModel() {
        return this.ocrModel;
    }

    public DocOcrMaxRequest setOcrValueStandard(String ocrValueStandard) {
        this.ocrValueStandard = ocrValueStandard;
        return this;
    }
    public String getOcrValueStandard() {
        return this.ocrValueStandard;
    }

    public DocOcrMaxRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DocOcrMaxRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public DocOcrMaxRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public DocOcrMaxRequest setSpoof(String spoof) {
        this.spoof = spoof;
        return this;
    }
    public String getSpoof() {
        return this.spoof;
    }

}
