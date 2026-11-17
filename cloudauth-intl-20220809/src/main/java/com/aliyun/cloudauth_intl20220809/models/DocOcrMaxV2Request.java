// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DocOcrMaxV2Request extends TeaModel {
    /**
     * <p>Specifies whether to enable authoritative data source verification to enhance the ID document anti-counterfeiting capability. Valid values:</p>
     * <ul>
     * <li><strong>T</strong>: enabled.</li>
     * <li><strong>F</strong>: disabled (default).</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><strong>Applicable ID document types</strong>: Chinese resident identity card (CHN01001) and Chinese mainland driver\&quot;s license (CHN02001).</li>
     * <li><strong>Data transmission statement</strong>: Enabling this parameter indicates that you agree to transmit the user\&quot;s name and ID document number to an authoritative data source in the Chinese mainland for consistency verification.</li>
     * <li><strong>Performance impact</strong>: After this parameter is enabled, the API response time increases by about 1 to 2 seconds. Adjust the timeout settings accordingly.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>T</p>
     */
    @NameInMap("Authorize")
    public String authorize;

    /**
     * <p>The page to be recognized. Valid values:</p>
     * <ul>
     * <li>01: the portrait side of the ID document (default).</li>
     * <li>02: the back side of the ID document.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("DocPage")
    public String docPage;

    /**
     * <p>The type of the ID document.</p>
     * <ul>
     * <li>Format: country code + ID document type abbreviation + page (optional).</li>
     * </ul>
     * <p>Note</p>
     * <ul>
     * <li>If OcrModel is set to 0, DocType is required and specifies the ID document type. The existing logic remains unchanged.</li>
     * <li>If OcrModel is set to 1 or 2, DocType must be left empty.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CHN01001</p>
     */
    @NameInMap("DocType")
    public String docType;

    /**
     * <p>The Base64-encoded image of the ID document. If you use the IdOcrPictureBase64 parameter to pass the Base64-encoded photo of the ID document, check the photo size and do not upload excessively large photos.</p>
     * 
     * <strong>example:</strong>
     * <p>base64</p>
     */
    @NameInMap("IdOcrPictureBase64")
    public String idOcrPictureBase64;

    /**
     * <p>The file stream of the ID document image.</p>
     * 
     * <strong>example:</strong>
     * <p>InputStream</p>
     */
    @NameInMap("IdOcrPictureFile")
    public String idOcrPictureFile;

    /**
     * <p>The URL of the ID document image. The URL must be a publicly accessible HTTP or HTTPS link.</p>
     * 
     * <strong>example:</strong>
     * <p>https://***********.oss-cn-hangzhou.aliyuncs.com/1669520556530-expo/default/face/20221127114236530_w3kx2e6t.jpg</p>
     */
    @NameInMap("IdOcrPictureUrl")
    public String idOcrPictureUrl;

    /**
     * <p>Specifies whether to enable the ID document anti-counterfeiting feature. Valid values:</p>
     * <ul>
     * <li>T: enabled.</li>
     * <li>F: disabled (default).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>F</p>
     */
    @NameInMap("IdSpoof")
    public String idSpoof;

    /**
     * <p>The custom threshold mode for OCR quality detection. Valid values:</p>
     * <ul>
     * <li>0: system default.</li>
     * <li>1: strict mode.</li>
     * <li>2: loose mode.</li>
     * <li>3: disable quality detection (default).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IdThreshold")
    public String idThreshold;

    /**
     * <p>The custom unique business identifier on the merchant side, which is used for subsequent troubleshooting. The value can be up to 32 characters in length and can contain letters and digits. Make sure that the value is unique.</p>
     * 
     * <strong>example:</strong>
     * <p>e0c34a77f5ac40a5aa5e6ed20c353888</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    /**
     * <p>The custom user ID or other identifier that can identify a specific user, such as a mobile phone number or an email address. Desensitize the value of this field in advance, for example, by hashing the value.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("MerchantUserId")
    public String merchantUserId;

    /**
     * <p>The OCR recognition mode. Valid values:</p>
     * <ul>
     * <li>0: general ID document recognition mode (default).</li>
     * <li>1: automatic ID document classification mode.</li>
     * <li>2: automatic ID document classification and general recognition mode.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("OcrModel")
    public String ocrModel;

    /**
     * <p>Specifies whether to enable standardization for key OCR fields. Valid values:</p>
     * <ul>
     * <li>0: disabled (default).</li>
     * <li>1: enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("OcrValueStandard")
    public String ocrValueStandard;

    /**
     * <p>The product solution to access. Valid value: ID_OCR_MAX.</p>
     * 
     * <strong>example:</strong>
     * <p>ID_OCR_MAX</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The custom authentication scene ID, which is used to query related records by entering this scene ID in the console later. The value can be up to 10 characters in length and can contain letters, digits, and underscores.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("SceneCode")
    public String sceneCode;

    public static DocOcrMaxV2Request build(java.util.Map<String, ?> map) throws Exception {
        DocOcrMaxV2Request self = new DocOcrMaxV2Request();
        return TeaModel.build(map, self);
    }

    public DocOcrMaxV2Request setAuthorize(String authorize) {
        this.authorize = authorize;
        return this;
    }
    public String getAuthorize() {
        return this.authorize;
    }

    public DocOcrMaxV2Request setDocPage(String docPage) {
        this.docPage = docPage;
        return this;
    }
    public String getDocPage() {
        return this.docPage;
    }

    public DocOcrMaxV2Request setDocType(String docType) {
        this.docType = docType;
        return this;
    }
    public String getDocType() {
        return this.docType;
    }

    public DocOcrMaxV2Request setIdOcrPictureBase64(String idOcrPictureBase64) {
        this.idOcrPictureBase64 = idOcrPictureBase64;
        return this;
    }
    public String getIdOcrPictureBase64() {
        return this.idOcrPictureBase64;
    }

    public DocOcrMaxV2Request setIdOcrPictureFile(String idOcrPictureFile) {
        this.idOcrPictureFile = idOcrPictureFile;
        return this;
    }
    public String getIdOcrPictureFile() {
        return this.idOcrPictureFile;
    }

    public DocOcrMaxV2Request setIdOcrPictureUrl(String idOcrPictureUrl) {
        this.idOcrPictureUrl = idOcrPictureUrl;
        return this;
    }
    public String getIdOcrPictureUrl() {
        return this.idOcrPictureUrl;
    }

    public DocOcrMaxV2Request setIdSpoof(String idSpoof) {
        this.idSpoof = idSpoof;
        return this;
    }
    public String getIdSpoof() {
        return this.idSpoof;
    }

    public DocOcrMaxV2Request setIdThreshold(String idThreshold) {
        this.idThreshold = idThreshold;
        return this;
    }
    public String getIdThreshold() {
        return this.idThreshold;
    }

    public DocOcrMaxV2Request setMerchantBizId(String merchantBizId) {
        this.merchantBizId = merchantBizId;
        return this;
    }
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    public DocOcrMaxV2Request setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId;
        return this;
    }
    public String getMerchantUserId() {
        return this.merchantUserId;
    }

    public DocOcrMaxV2Request setOcrModel(String ocrModel) {
        this.ocrModel = ocrModel;
        return this;
    }
    public String getOcrModel() {
        return this.ocrModel;
    }

    public DocOcrMaxV2Request setOcrValueStandard(String ocrValueStandard) {
        this.ocrValueStandard = ocrValueStandard;
        return this;
    }
    public String getOcrValueStandard() {
        return this.ocrValueStandard;
    }

    public DocOcrMaxV2Request setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DocOcrMaxV2Request setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

}
