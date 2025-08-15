// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DocOcrRequest extends TeaModel {
    /**
     * <p>CardSide</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CardSide")
    public String cardSide;

    /**
     * <p>Document type</p>
     * 
     * <strong>example:</strong>
     * <p>00000006</p>
     */
    @NameInMap("DocType")
    public String docType;

    /**
     * <p>Whether to perform ID face quality detection</p>
     * <ul>
     * <li>T: Indicates that detection is required</li>
     * <li>F: Indicates that detection is not required (default F)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>F</p>
     */
    @NameInMap("IdFaceQuality")
    public String idFaceQuality;

    /**
     * <p>Base64 of the front side of the document image</p>
     * 
     * <strong>example:</strong>
     * <p>base64</p>
     */
    @NameInMap("IdOcrPictureBase64")
    public String idOcrPictureBase64;

    /**
     * <p>URL of the front side of the document image</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://digital-cardocr-prod8.oss-cn-hangzhou.aliyuncs.com/1669520556530-expo/default/face/20221127114236530_w3kx2e6t.jpg">https://digital-cardocr-prod8.oss-cn-hangzhou.aliyuncs.com/1669520556530-expo/default/face/20221127114236530_w3kx2e6t.jpg</a></p>
     */
    @NameInMap("IdOcrPictureUrl")
    public String idOcrPictureUrl;

    /**
     * <p>IdThreshold</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IdThreshold")
    public String idThreshold;

    /**
     * <p>A unique business identifier defined by the merchant, used for subsequent troubleshooting. It supports a combination of letters and numbers, with a maximum length of 32 characters. Please ensure uniqueness.</p>
     * 
     * <strong>example:</strong>
     * <p>dso9322***dsjsd22</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    /**
     * <p>A custom user ID in the business, please keep it unique.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("MerchantUserId")
    public String merchantUserId;

    /**
     * <p>Whether to perform document OCR</p>
     * <ul>
     * <li>T: Indicates that document OCR is required</li>
     * <li>F: Indicates that document OCR is not required</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>T</p>
     */
    @NameInMap("Ocr")
    public String ocr;

    /**
     * <p>Product code</p>
     * 
     * <strong>example:</strong>
     * <p>产品方案类型ID_OCR_MIN</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>Whether to enable anti-counterfeiting detection</p>
     * <ul>
     * <li>T: Indicates that anti-counterfeiting is enabled</li>
     * <li>F: Indicates that anti-counterfeiting is disabled</li>
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
