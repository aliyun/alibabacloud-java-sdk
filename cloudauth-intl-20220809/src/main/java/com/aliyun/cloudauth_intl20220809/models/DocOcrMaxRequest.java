// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DocOcrMaxRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable authoritative data source verification to enhance the anti-spoofing capability of identity documents. Valid values:</p>
     * <ul>
     * <li><strong>T</strong>: Enabled.</li>
     * <li><strong>F</strong>: Not enabled (default).<blockquote>
     * <ul>
     * <li><strong>Applicable identity document types</strong>: Chinese resident identity card (CHN01001) and Chinese mainland driver\&quot;s license (CHN02001).</li>
     * <li><strong>Data transmission statement</strong>: Enabling this parameter indicates that you agree to transmit the user\&quot;s name and identity document number to an authoritative data source in the Chinese mainland for consistency verification.</li>
     * <li><strong>Performance impact</strong>: After this parameter is enabled, the API response time increases by about 1 to 2 seconds. Adjust the timeout settings accordingly.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>T</p>
     */
    @NameInMap("Authorize")
    public String authorize;

    /**
     * <p>The page to be recognized. Valid values:</p>
     * <ul>
     * <li>01: portrait side of the identity document (default)</li>
     * <li>02: back side of the identity document</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("DocPage")
    public String docPage;

    /**
     * <p>The type of the identity document.</p>
     * <ul>
     * <li>Format: country code + identity document type abbreviation + page (optional).</li>
     * </ul>
     * <p>Note</p>
     * <ul>
     * <li>OcrModel = 0: DocType is required and specifies the identity document type. The existing logic remains unchanged.</li>
     * <li>OcrModel = 1 or 2: DocType must be left empty.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CNSSC01</p>
     */
    @NameInMap("DocType")
    public String docType;

    /**
     * <p>The Base64-encoded image of the identity document. If you choose to pass the identity document image by using the IdOcrPictureBase64 (Base64-encoded image) method, check the image size and do not pass an excessively large image.</p>
     * 
     * <strong>example:</strong>
     * <p>base64</p>
     */
    @NameInMap("IdOcrPictureBase64")
    public String idOcrPictureBase64;

    /**
     * <p>The URL of the identity document image. The URL must be an HTTP or HTTPS link that is accessible over the Internet.</p>
     * 
     * <strong>example:</strong>
     * <p>https://***********.oss-cn-hangzhou.aliyuncs.com/1669520556530-expo/default/face/20221127114236530_w3kx2e6t.jpg</p>
     */
    @NameInMap("IdOcrPictureUrl")
    public String idOcrPictureUrl;

    /**
     * <p>Specifies whether to enable the identity document anti-spoofing feature. Valid values:</p>
     * <ul>
     * <li>T: Enabled.</li>
     * <li>F: Not enabled (default).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>F</p>
     */
    @NameInMap("IdSpoof")
    public String idSpoof;

    /**
     * <p>The custom OCR quality check threshold mode. Valid values:</p>
     * <ul>
     * <li>0: system default</li>
     * <li>1: strict mode</li>
     * <li>2: loose mode</li>
     * <li>3: disable quality check (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IdThreshold")
    public String idThreshold;

    /**
     * <p>The custom unique business identifier, which is used to locate and troubleshoot issues later. The value can be up to 32 characters in length and can contain letters and digits. Make sure that the value is unique.</p>
     * 
     * <strong>example:</strong>
     * <p>e0c34a77f5ac40a5aa5e6ed20c******</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    /**
     * <p>The custom user ID or other identifiers that can identify a specific user, such as a mobile phone number or an email address. Desensitize the value of this field in advance, such as by hashing the value.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("MerchantUserId")
    public String merchantUserId;

    /**
     * <p>The OCR recognition mode. Valid values:</p>
     * <ul>
     * <li>0: general identity document recognition mode (default)</li>
     * <li>1: automatic identity document classification mode</li>
     * <li>2: automatic identity document classification and general recognition mode</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("OcrModel")
    public String ocrModel;

    /**
     * <p>Specifies whether to enable the standardization of key fields in OCR recognition. Valid values:</p>
     * <ul>
     * <li>0: no (default) </li>
     * <li>1: yes</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("OcrValueStandard")
    public String ocrValueStandard;

    /**
     * <p>The product solution to be integrated. Valid value: ID_OCR_MAX.</p>
     * 
     * <strong>example:</strong>
     * <p>ID_OCR_MAX</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p><strong>[Deprecated]</strong></p>
     * 
     * <strong>example:</strong>
     * <p>Deprecated</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <p>The custom authentication scene ID, which is used to query related records by entering this scene ID in the console later. The value can be up to 10 characters in length and can contain letters, digits, and underscores.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("SceneCode")
    public String sceneCode;

    /**
     * <p><strong>[Deprecated]</strong></p>
     * 
     * <strong>example:</strong>
     * <p>Deprecated</p>
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
