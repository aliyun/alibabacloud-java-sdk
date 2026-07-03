// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class EkycVerifyRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable authoritative identity verification. This feature currently applies only to second-generation ID cards issued in the Chinese mainland.</p>
     * 
     * <strong>example:</strong>
     * <p>T</p>
     */
    @NameInMap("Authorize")
    public String authorize;

    /**
     * <p>Specifies whether cropping is allowed. By default, cropping is not allowed. Valid values:</p>
     * <ul>
     * <li>T: Cropping is required.</li>
     * <li>F: Cropping is not required. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>F</p>
     */
    @NameInMap("Crop")
    public String crop;

    /**
     * <p>The real name of the user. If Authorize is set to T and the document type is a Chinese mainland ID card, you must provide at least one of the following: the key document information (DocName and DocNo) or the document image (IdOcrPictureBase64 or IdOcrPictureURL).
     * Note: The value must contain at least one Chinese character and cannot contain special characters, except for the middle dot (·) used in ethnic minority names.</p>
     * 
     * <strong>example:</strong>
     * <p>张**</p>
     */
    @NameInMap("DocName")
    public String docName;

    /**
     * <p>The document number of the user. If Authorize is set to T and the document type is a Chinese mainland ID card, you must provide at least one of the following: the key document information (DocName and DocNo) or the document image (IdOcrPictureBase64 or IdOcrPictureURL).
     * Note: The value is a combination of letters and digits up to 18 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>410***************</p>
     */
    @NameInMap("DocNo")
    public String docNo;

    /**
     * <p>The document type.</p>
     * 
     * <strong>example:</strong>
     * <p>00000001</p>
     */
    @NameInMap("DocType")
    public String docType;

    /**
     * <p>The Base64-encoded face image.</p>
     * <p>Note:</p>
     * <ul>
     * <li>If you use this method to pass the face image, check the image size and do not pass an excessively large image.</li>
     * <li>Specify either FacePictureBase64 or FacePictureUrl.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Base64</p>
     */
    @NameInMap("FacePictureBase64")
    public String facePictureBase64;

    /**
     * <p>The URL of the face photo.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://digital-face-prod8.oss-cn-hangzhou.aliyuncs.com/1669520556530-expo/default/face/20221127114236530_w3kx2e6t.jpg">https://digital-face-prod8.oss-cn-hangzhou.aliyuncs.com/1669520556530-expo/default/face/20221127114236530_w3kx2e6t.jpg</a></p>
     */
    @NameInMap("FacePictureUrl")
    public String facePictureUrl;

    @NameInMap("FaceQualityCheck")
    public String faceQualityCheck;

    /**
     * <p>The Base64-encoded document image.
     * Note:</p>
     * <ul>
     * <li>If you use this method to pass the document image, check the image size and do not pass an excessively large image.</li>
     * <li>Specify either IdOcrPictureBase64 or IdOcrPictureUrl.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>base64</p>
     */
    @NameInMap("IdOcrPictureBase64")
    public String idOcrPictureBase64;

    /**
     * <p>The URL of the front side of the document image.</p>
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
     * <p>The merchant-defined unique business identifier, used for subsequent troubleshooting. The value is a combination of letters and digits up to 32 characters in length. Ensure that the value is unique.</p>
     * 
     * <strong>example:</strong>
     * <p>e0c34a77f5ac40a5aa5e6ed20c353888</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    /**
     * <p>The custom user ID or other identifier that can identify a specific user, such as a phone number or email address. We strongly recommend that you mask the value of this field in advance, for example, by hashing the value.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("MerchantUserId")
    public String merchantUserId;

    /**
     * <p>The product code.</p>
     * 
     * <strong>example:</strong>
     * <p>eKYC_MIN</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    public static EkycVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        EkycVerifyRequest self = new EkycVerifyRequest();
        return TeaModel.build(map, self);
    }

    public EkycVerifyRequest setAuthorize(String authorize) {
        this.authorize = authorize;
        return this;
    }
    public String getAuthorize() {
        return this.authorize;
    }

    public EkycVerifyRequest setCrop(String crop) {
        this.crop = crop;
        return this;
    }
    public String getCrop() {
        return this.crop;
    }

    public EkycVerifyRequest setDocName(String docName) {
        this.docName = docName;
        return this;
    }
    public String getDocName() {
        return this.docName;
    }

    public EkycVerifyRequest setDocNo(String docNo) {
        this.docNo = docNo;
        return this;
    }
    public String getDocNo() {
        return this.docNo;
    }

    public EkycVerifyRequest setDocType(String docType) {
        this.docType = docType;
        return this;
    }
    public String getDocType() {
        return this.docType;
    }

    public EkycVerifyRequest setFacePictureBase64(String facePictureBase64) {
        this.facePictureBase64 = facePictureBase64;
        return this;
    }
    public String getFacePictureBase64() {
        return this.facePictureBase64;
    }

    public EkycVerifyRequest setFacePictureUrl(String facePictureUrl) {
        this.facePictureUrl = facePictureUrl;
        return this;
    }
    public String getFacePictureUrl() {
        return this.facePictureUrl;
    }

    public EkycVerifyRequest setFaceQualityCheck(String faceQualityCheck) {
        this.faceQualityCheck = faceQualityCheck;
        return this;
    }
    public String getFaceQualityCheck() {
        return this.faceQualityCheck;
    }

    public EkycVerifyRequest setIdOcrPictureBase64(String idOcrPictureBase64) {
        this.idOcrPictureBase64 = idOcrPictureBase64;
        return this;
    }
    public String getIdOcrPictureBase64() {
        return this.idOcrPictureBase64;
    }

    public EkycVerifyRequest setIdOcrPictureUrl(String idOcrPictureUrl) {
        this.idOcrPictureUrl = idOcrPictureUrl;
        return this;
    }
    public String getIdOcrPictureUrl() {
        return this.idOcrPictureUrl;
    }

    public EkycVerifyRequest setIdThreshold(String idThreshold) {
        this.idThreshold = idThreshold;
        return this;
    }
    public String getIdThreshold() {
        return this.idThreshold;
    }

    public EkycVerifyRequest setMerchantBizId(String merchantBizId) {
        this.merchantBizId = merchantBizId;
        return this;
    }
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    public EkycVerifyRequest setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId;
        return this;
    }
    public String getMerchantUserId() {
        return this.merchantUserId;
    }

    public EkycVerifyRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
