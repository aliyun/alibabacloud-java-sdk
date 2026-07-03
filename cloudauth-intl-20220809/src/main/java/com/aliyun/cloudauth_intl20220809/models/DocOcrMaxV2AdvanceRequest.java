// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DocOcrMaxV2AdvanceRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable authoritative data source verification to enhance document anti-forgery capabilities. Valid values:</p>
     * <ul>
     * <li><p><strong>T</strong>: enabled.</p>
     * </li>
     * <li><p><strong>F</strong> (default): disabled.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><strong>Applicable document types</strong>: China resident identity card (CHN01001) and China mainland driver\&quot;s license (CHN02001).</li>
     * <li><strong>Data transmission statement</strong>: Enabling this parameter indicates consent to transmit the user\&quot;s name and document number to an authoritative data source in the Chinese mainland for consistency verification.</li>
     * <li><strong>Performance impact</strong>: Enabling this parameter increases the API response time by approximately 1 to 2 seconds. Adjust the timeout settings accordingly.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>T</p>
     */
    @NameInMap("Authorize")
    public String authorize;

    /**
     * <p>The expected page to recognize. Valid values:</p>
     * <ul>
     * <li><p>01 (default): the portrait side of the document.</p>
     * </li>
     * <li><p>02: the back side of the document.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("DocPage")
    public String docPage;

    /**
     * <p>The document type.</p>
     * <ul>
     * <li>Format: country code + document type abbreviation + page (optional).</li>
     * </ul>
     * <p>Note:</p>
     * <ul>
     * <li>OcrModel = 0: DocType is required. Specify the document type. The existing logic remains unchanged.</li>
     * <li>OcrModel = 1 or 2: DocType must be left empty.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CHN01001</p>
     */
    @NameInMap("DocType")
    public String docType;

    /**
     * <p>The Base64-encoded image of the identity document.</p>
     * <p>If you use IdOcrPictureBase64 to pass in the document image, check the image size and do not pass in an excessively large image.</p>
     * 
     * <strong>example:</strong>
     * <p>base64</p>
     */
    @NameInMap("IdOcrPictureBase64")
    public String idOcrPictureBase64;

    /**
     * <p>The file stream of the document image.</p>
     * 
     * <strong>example:</strong>
     * <p>InputStream</p>
     */
    @NameInMap("IdOcrPictureFile")
    public java.io.InputStream idOcrPictureFileObject;

    /**
     * <p>The URL of the identity document image. The URL must be a publicly accessible HTTP or HTTPS link.</p>
     * 
     * <strong>example:</strong>
     * <p>https://***********.oss-cn-hangzhou.aliyuncs.com/1669520556530-expo/default/face/20221127114236530_w3kx2e6t.jpg</p>
     */
    @NameInMap("IdOcrPictureUrl")
    public String idOcrPictureUrl;

    /**
     * <p>Specifies whether to enable the document anti-forgery feature. Valid values:</p>
     * <ul>
     * <li><p>T: enabled.</p>
     * </li>
     * <li><p>F (default): disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>F</p>
     */
    @NameInMap("IdSpoof")
    public String idSpoof;

    /**
     * <p>The custom OCR quality detection threshold mode. Valid values:</p>
     * <ul>
     * <li>0: system default.</li>
     * <li>1: strict mode.</li>
     * <li>2: loose mode.</li>
     * <li>3 (default): quality detection disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IdThreshold")
    public String idThreshold;

    /**
     * <p>The merchant-defined unique business identifier, used for subsequent troubleshooting. The value can contain letters and digits, with a maximum length of 32 characters. Make sure the value is unique.</p>
     * 
     * <strong>example:</strong>
     * <p>e0c34a77f5ac40a5aa5e6ed20c353888</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    /**
     * <p>The custom user ID, or another identifier that can identify a specific user, such as a phone number or email address.</p>
     * <p>Hash or otherwise desensitize this field value before passing it in.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("MerchantUserId")
    public String merchantUserId;

    /**
     * <p>The OCR recognition mode. Valid values:</p>
     * <ul>
     * <li><p>0: general document recognition mode (default).</p>
     * </li>
     * <li><p>1: automatic document classification mode.</p>
     * </li>
     * <li><p>2: automatic document classification and general recognition mode.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("OcrModel")
    public String ocrModel;

    /**
     * <p>Specifies whether to enable OCR key field standardization. Valid values:</p>
     * <ul>
     * <li>0 (default): disabled.</li>
     * <li>1: enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("OcrValueStandard")
    public String ocrValueStandard;

    /**
     * <p>The product solution to use.</p>
     * <p>Set this parameter to ID_OCR_MAX.</p>
     * 
     * <strong>example:</strong>
     * <p>ID_OCR_MAX</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The custom verification scenario ID. You can use this scenario ID to query related records in the console.</p>
     * <p>The value can contain letters, digits, and underscores, with a maximum length of 10 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("SceneCode")
    public String sceneCode;

    public static DocOcrMaxV2AdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DocOcrMaxV2AdvanceRequest self = new DocOcrMaxV2AdvanceRequest();
        return TeaModel.build(map, self);
    }

    public DocOcrMaxV2AdvanceRequest setAuthorize(String authorize) {
        this.authorize = authorize;
        return this;
    }
    public String getAuthorize() {
        return this.authorize;
    }

    public DocOcrMaxV2AdvanceRequest setDocPage(String docPage) {
        this.docPage = docPage;
        return this;
    }
    public String getDocPage() {
        return this.docPage;
    }

    public DocOcrMaxV2AdvanceRequest setDocType(String docType) {
        this.docType = docType;
        return this;
    }
    public String getDocType() {
        return this.docType;
    }

    public DocOcrMaxV2AdvanceRequest setIdOcrPictureBase64(String idOcrPictureBase64) {
        this.idOcrPictureBase64 = idOcrPictureBase64;
        return this;
    }
    public String getIdOcrPictureBase64() {
        return this.idOcrPictureBase64;
    }

    public DocOcrMaxV2AdvanceRequest setIdOcrPictureFileObject(java.io.InputStream idOcrPictureFileObject) {
        this.idOcrPictureFileObject = idOcrPictureFileObject;
        return this;
    }
    public java.io.InputStream getIdOcrPictureFileObject() {
        return this.idOcrPictureFileObject;
    }

    public DocOcrMaxV2AdvanceRequest setIdOcrPictureUrl(String idOcrPictureUrl) {
        this.idOcrPictureUrl = idOcrPictureUrl;
        return this;
    }
    public String getIdOcrPictureUrl() {
        return this.idOcrPictureUrl;
    }

    public DocOcrMaxV2AdvanceRequest setIdSpoof(String idSpoof) {
        this.idSpoof = idSpoof;
        return this;
    }
    public String getIdSpoof() {
        return this.idSpoof;
    }

    public DocOcrMaxV2AdvanceRequest setIdThreshold(String idThreshold) {
        this.idThreshold = idThreshold;
        return this;
    }
    public String getIdThreshold() {
        return this.idThreshold;
    }

    public DocOcrMaxV2AdvanceRequest setMerchantBizId(String merchantBizId) {
        this.merchantBizId = merchantBizId;
        return this;
    }
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    public DocOcrMaxV2AdvanceRequest setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId;
        return this;
    }
    public String getMerchantUserId() {
        return this.merchantUserId;
    }

    public DocOcrMaxV2AdvanceRequest setOcrModel(String ocrModel) {
        this.ocrModel = ocrModel;
        return this;
    }
    public String getOcrModel() {
        return this.ocrModel;
    }

    public DocOcrMaxV2AdvanceRequest setOcrValueStandard(String ocrValueStandard) {
        this.ocrValueStandard = ocrValueStandard;
        return this;
    }
    public String getOcrValueStandard() {
        return this.ocrValueStandard;
    }

    public DocOcrMaxV2AdvanceRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DocOcrMaxV2AdvanceRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

}
