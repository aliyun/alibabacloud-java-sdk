// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DocOcrV2AdvanceRequest extends TeaModel {
    /**
     * <p>Specifies the side of the ID card, which can be the national emblem side or the portrait side. If you do not specify this parameter, the portrait side is used by default. Valid values:</p>
     * <ul>
     * <li>OCR_ID_FACE: the portrait side. Default value.</li>
     * <li>OCR_ID_NATIONAL_EMBLEM: the national emblem side.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OCR_ID_FACE</p>
     */
    @NameInMap("CardSide")
    public String cardSide;

    /**
     * <p>The type of the ID card.</p>
     * 
     * <strong>example:</strong>
     * <p>00000006</p>
     */
    @NameInMap("DocType")
    public String docType;

    /**
     * <p>Specifies whether to perform face quality check for the ID card. Valid values:</p>
     * <ul>
     * <li>T: Face quality check is performed.</li>
     * <li>F: Face quality check is not performed. Default value: F.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>F</p>
     */
    @NameInMap("IdFaceQuality")
    public String idFaceQuality;

    /**
     * <p>The Base64-encoded image of the ID card.</p>
     * <p>If you choose to pass the ID card photo by using the Base64-encoded image (IdOcrPictureBase64), check the photo size and do not pass oversized photos.</p>
     * 
     * <strong>example:</strong>
     * <p>base64</p>
     */
    @NameInMap("IdOcrPictureBase64")
    public String idOcrPictureBase64;

    /**
     * <p>The file stream of the front image of the ID card.</p>
     * 
     * <strong>example:</strong>
     * <p>InputStream</p>
     */
    @NameInMap("IdOcrPictureFile")
    public java.io.InputStream idOcrPictureFileObject;

    /**
     * <p>The URL of the front image of the ID card.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://digital-cardocr-prod8.oss-cn-hangzhou.aliyuncs.com/1669520556530-expo/default/face/20221127114236530_w3kx2e6t.jpg">https://digital-cardocr-prod8.oss-cn-hangzhou.aliyuncs.com/1669520556530-expo/default/face/20221127114236530_w3kx2e6t.jpg</a></p>
     */
    @NameInMap("IdOcrPictureUrl")
    public String idOcrPictureUrl;

    /**
     * <p>The custom threshold mode for OCR quality check. Valid values:</p>
     * <ul>
     * <li>0: system default.</li>
     * <li>1: strict mode.</li>
     * <li>2: loose mode.</li>
     * <li>3: disables quality check. Default value: 3.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IdThreshold")
    public String idThreshold;

    /**
     * <p>The custom unique business identifier on the merchant side, which is used for subsequent troubleshooting. It supports a combination of letters and digits, with a maximum length of 32 characters. Make sure that the identifier is unique.</p>
     * 
     * <strong>example:</strong>
     * <p>dso9322***dsjsd22</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    /**
     * <p>The custom user ID in the business. Make sure that the ID is unique.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("MerchantUserId")
    public String merchantUserId;

    /**
     * <p>Specifies whether to perform OCR on the ID card. Valid values:</p>
     * <ul>
     * <li>T: OCR is performed on the ID card.</li>
     * <li>F: OCR is not performed on the ID card.</li>
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
     * <p>Product solution type ID_OCR_MIN</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>Specifies whether to enable anti-spoofing check. Valid values:</p>
     * <ul>
     * <li>T: Anti-spoofing check is enabled.</li>
     * <li>F: Anti-spoofing check is disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>F</p>
     */
    @NameInMap("Spoof")
    public String spoof;

    public static DocOcrV2AdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DocOcrV2AdvanceRequest self = new DocOcrV2AdvanceRequest();
        return TeaModel.build(map, self);
    }

    public DocOcrV2AdvanceRequest setCardSide(String cardSide) {
        this.cardSide = cardSide;
        return this;
    }
    public String getCardSide() {
        return this.cardSide;
    }

    public DocOcrV2AdvanceRequest setDocType(String docType) {
        this.docType = docType;
        return this;
    }
    public String getDocType() {
        return this.docType;
    }

    public DocOcrV2AdvanceRequest setIdFaceQuality(String idFaceQuality) {
        this.idFaceQuality = idFaceQuality;
        return this;
    }
    public String getIdFaceQuality() {
        return this.idFaceQuality;
    }

    public DocOcrV2AdvanceRequest setIdOcrPictureBase64(String idOcrPictureBase64) {
        this.idOcrPictureBase64 = idOcrPictureBase64;
        return this;
    }
    public String getIdOcrPictureBase64() {
        return this.idOcrPictureBase64;
    }

    public DocOcrV2AdvanceRequest setIdOcrPictureFileObject(java.io.InputStream idOcrPictureFileObject) {
        this.idOcrPictureFileObject = idOcrPictureFileObject;
        return this;
    }
    public java.io.InputStream getIdOcrPictureFileObject() {
        return this.idOcrPictureFileObject;
    }

    public DocOcrV2AdvanceRequest setIdOcrPictureUrl(String idOcrPictureUrl) {
        this.idOcrPictureUrl = idOcrPictureUrl;
        return this;
    }
    public String getIdOcrPictureUrl() {
        return this.idOcrPictureUrl;
    }

    public DocOcrV2AdvanceRequest setIdThreshold(String idThreshold) {
        this.idThreshold = idThreshold;
        return this;
    }
    public String getIdThreshold() {
        return this.idThreshold;
    }

    public DocOcrV2AdvanceRequest setMerchantBizId(String merchantBizId) {
        this.merchantBizId = merchantBizId;
        return this;
    }
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    public DocOcrV2AdvanceRequest setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId;
        return this;
    }
    public String getMerchantUserId() {
        return this.merchantUserId;
    }

    public DocOcrV2AdvanceRequest setOcr(String ocr) {
        this.ocr = ocr;
        return this;
    }
    public String getOcr() {
        return this.ocr;
    }

    public DocOcrV2AdvanceRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DocOcrV2AdvanceRequest setSpoof(String spoof) {
        this.spoof = spoof;
        return this;
    }
    public String getSpoof() {
        return this.spoof;
    }

}
