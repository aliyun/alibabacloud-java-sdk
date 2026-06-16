// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DocOcrRequest extends TeaModel {
    /**
     * <p>Specifies the side of the certificate to distinguish between the national emblem side and the portrait side. If this parameter is not specified, the portrait side is used by default. Valid values:</p>
     * <ul>
     * <li><p>OCR_ID_FACE (default): portrait side</p>
     * </li>
     * <li><p>OCR_ID_NATIONAL_EMBLEM: national emblem side.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OCR_ID_FACE</p>
     */
    @NameInMap("CardSide")
    public String cardSide;

    /**
     * <p>The certificate type.</p>
     * 
     * <strong>example:</strong>
     * <p>00000006</p>
     */
    @NameInMap("DocType")
    public String docType;

    /**
     * <p>Specifies whether to perform certificate face quality detection. Valid values:</p>
     * <ul>
     * <li>T: Detection is required.</li>
     * <li>F: Detection is not required. (Default value: F).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>F</p>
     */
    @NameInMap("IdFaceQuality")
    public String idFaceQuality;

    /**
     * <p>The Base64-encoded card or certificate image.</p>
     * <p>If you use IdOcrPictureBase64 (Base64-encoded photo) to submit the certificate photo, check the photo size and do not submit an excessively large photo.</p>
     * 
     * <strong>example:</strong>
     * <p>base64</p>
     */
    @NameInMap("IdOcrPictureBase64")
    public String idOcrPictureBase64;

    /**
     * <p>The URL of the front side of the certificate image.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://digital-cardocr-prod8.oss-cn-hangzhou.aliyuncs.com/1669520556530-expo/default/face/20221127114236530_w3kx2e6t.jpg">https://digital-cardocr-prod8.oss-cn-hangzhou.aliyuncs.com/1669520556530-expo/default/face/20221127114236530_w3kx2e6t.jpg</a></p>
     */
    @NameInMap("IdOcrPictureUrl")
    public String idOcrPictureUrl;

    /**
     * <p>The custom OCR quality detection threshold mode. Valid values:</p>
     * <ul>
     * <li>0: system default</li>
     * <li>1: strict mode</li>
     * <li>2: loose mode</li>
     * <li>3 (default): quality detection disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IdThreshold")
    public String idThreshold;

    /**
     * <p>The custom business unique identifier on the merchant side, used for subsequent issue tracking and troubleshooting. The value can be a combination of letters and digits with a maximum length of 32 characters. Ensure that the value is unique.</p>
     * 
     * <strong>example:</strong>
     * <p>dso9322***dsjsd22</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    /**
     * <p>The custom user ID in the business. Ensure that the value is unique.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("MerchantUserId")
    public String merchantUserId;

    /**
     * <p>Specifies whether to perform certificate OCR. Valid values:</p>
     * <ul>
     * <li>T: OCR is required.</li>
     * <li>F: OCR is not required.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>T</p>
     */
    @NameInMap("Ocr")
    public String ocr;

    /**
     * <p>The product code.</p>
     * 
     * <strong>example:</strong>
     * <p>产品方案类型ID_OCR_MIN</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>Specifies whether to enable anti-spoofing detection. Valid values:</p>
     * <ul>
     * <li>T: Anti-spoofing is enabled.</li>
     * <li>F: Anti-spoofing is disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>F</p>
     */
    @NameInMap("Spoof")
    public String spoof;

    public static DocOcrRequest build(java.util.Map<String, ?> map) throws Exception {
        DocOcrRequest self = new DocOcrRequest();
        return TeaModel.build(map, self);
    }

    public DocOcrRequest setCardSide(String cardSide) {
        this.cardSide = cardSide;
        return this;
    }
    public String getCardSide() {
        return this.cardSide;
    }

    public DocOcrRequest setDocType(String docType) {
        this.docType = docType;
        return this;
    }
    public String getDocType() {
        return this.docType;
    }

    public DocOcrRequest setIdFaceQuality(String idFaceQuality) {
        this.idFaceQuality = idFaceQuality;
        return this;
    }
    public String getIdFaceQuality() {
        return this.idFaceQuality;
    }

    public DocOcrRequest setIdOcrPictureBase64(String idOcrPictureBase64) {
        this.idOcrPictureBase64 = idOcrPictureBase64;
        return this;
    }
    public String getIdOcrPictureBase64() {
        return this.idOcrPictureBase64;
    }

    public DocOcrRequest setIdOcrPictureUrl(String idOcrPictureUrl) {
        this.idOcrPictureUrl = idOcrPictureUrl;
        return this;
    }
    public String getIdOcrPictureUrl() {
        return this.idOcrPictureUrl;
    }

    public DocOcrRequest setIdThreshold(String idThreshold) {
        this.idThreshold = idThreshold;
        return this;
    }
    public String getIdThreshold() {
        return this.idThreshold;
    }

    public DocOcrRequest setMerchantBizId(String merchantBizId) {
        this.merchantBizId = merchantBizId;
        return this;
    }
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    public DocOcrRequest setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId;
        return this;
    }
    public String getMerchantUserId() {
        return this.merchantUserId;
    }

    public DocOcrRequest setOcr(String ocr) {
        this.ocr = ocr;
        return this;
    }
    public String getOcr() {
        return this.ocr;
    }

    public DocOcrRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DocOcrRequest setSpoof(String spoof) {
        this.spoof = spoof;
        return this;
    }
    public String getSpoof() {
        return this.spoof;
    }

}
