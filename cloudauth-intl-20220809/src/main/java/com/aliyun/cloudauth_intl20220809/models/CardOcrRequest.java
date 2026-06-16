// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class CardOcrRequest extends TeaModel {
    /**
     * <p>The document type.</p>
     * 
     * <strong>example:</strong>
     * <p>00000006</p>
     */
    @NameInMap("DocType")
    public String docType;

    /**
     * <p>Specifies whether to perform face quality detection on the ID document. Valid values:</p>
     * <ul>
     * <li>T: Perform face quality detection.</li>
     * <li>F: Do not perform face quality detection. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>F</p>
     */
    @NameInMap("IdFaceQuality")
    public String idFaceQuality;

    /**
     * <p>The Base64-encoded image of the front side of the ID document. The value is a Base64 encoding of the image.</p>
     * 
     * <strong>example:</strong>
     * <p>base64</p>
     */
    @NameInMap("IdOcrPictureBase64")
    public String idOcrPictureBase64;

    /**
     * <p>The URL of the front-side image of the ID document.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://digital-cardocr-prod8.oss-cn-hangzhou.aliyuncs.com/1669520556530-expo/default/face/20221127114236530_w3kx2e6t.jpg">https://digital-cardocr-prod8.oss-cn-hangzhou.aliyuncs.com/1669520556530-expo/default/face/20221127114236530_w3kx2e6t.jpg</a></p>
     */
    @NameInMap("IdOcrPictureUrl")
    public String idOcrPictureUrl;

    /**
     * <p>The merchant-defined unique business ID used for subsequent troubleshooting. The value can be a combination of letters and digits with a maximum length of 32 characters. Ensure that the value is unique.</p>
     * 
     * <strong>example:</strong>
     * <p>dso9322***dsjsd22</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    /**
     * <p>The merchant user ID or another identifier that can be used to identify a specific user, such as a phone number or email address. We strongly recommend that you pre-desensitize the value of the userId field, for example, by hashing the value.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("MerchantUserId")
    public String merchantUserId;

    /**
     * <p>Specifies whether to perform OCR on the ID document. Valid values:</p>
     * <ul>
     * <li>T: Perform OCR on the ID document. This is the default value.</li>
     * <li>F: Do not perform OCR.</li>
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
     * <p>ID_OCR_MIN</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>Specifies whether to enable anti-spoofing detection. Valid values:</p>
     * <ul>
     * <li>T: Enable anti-spoofing detection.</li>
     * <li>F: Disable anti-spoofing detection. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>F</p>
     */
    @NameInMap("Spoof")
    public String spoof;

    public static CardOcrRequest build(java.util.Map<String, ?> map) throws Exception {
        CardOcrRequest self = new CardOcrRequest();
        return TeaModel.build(map, self);
    }

    public CardOcrRequest setDocType(String docType) {
        this.docType = docType;
        return this;
    }
    public String getDocType() {
        return this.docType;
    }

    public CardOcrRequest setIdFaceQuality(String idFaceQuality) {
        this.idFaceQuality = idFaceQuality;
        return this;
    }
    public String getIdFaceQuality() {
        return this.idFaceQuality;
    }

    public CardOcrRequest setIdOcrPictureBase64(String idOcrPictureBase64) {
        this.idOcrPictureBase64 = idOcrPictureBase64;
        return this;
    }
    public String getIdOcrPictureBase64() {
        return this.idOcrPictureBase64;
    }

    public CardOcrRequest setIdOcrPictureUrl(String idOcrPictureUrl) {
        this.idOcrPictureUrl = idOcrPictureUrl;
        return this;
    }
    public String getIdOcrPictureUrl() {
        return this.idOcrPictureUrl;
    }

    public CardOcrRequest setMerchantBizId(String merchantBizId) {
        this.merchantBizId = merchantBizId;
        return this;
    }
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    public CardOcrRequest setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId;
        return this;
    }
    public String getMerchantUserId() {
        return this.merchantUserId;
    }

    public CardOcrRequest setOcr(String ocr) {
        this.ocr = ocr;
        return this;
    }
    public String getOcr() {
        return this.ocr;
    }

    public CardOcrRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public CardOcrRequest setSpoof(String spoof) {
        this.spoof = spoof;
        return this;
    }
    public String getSpoof() {
        return this.spoof;
    }

}
