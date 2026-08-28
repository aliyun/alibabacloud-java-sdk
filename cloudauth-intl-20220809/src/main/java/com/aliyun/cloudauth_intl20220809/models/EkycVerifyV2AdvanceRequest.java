// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class EkycVerifyV2AdvanceRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable authoritative identity verification. Currently, this parameter applies only to second-generation mainland China ID cards.</p>
     * 
     * <strong>example:</strong>
     * <p>T</p>
     */
    @NameInMap("Authorize")
    public String authorize;

    /**
     * <p>Specifies whether cropping is allowed. By default, cropping is not allowed. Valid values:</p>
     * <ul>
     * <li>T: Detection is required.</li>
     * <li>F: Detection is required (default value: F).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>F</p>
     */
    @NameInMap("Crop")
    public String crop;

    /**
     * <p>The real name of the user. When Authorize=\&quot;T\&quot; and the document type is a mainland China ID card, you must provide at least one of the following: key document information (DocName, DocNo) or document images (IdOcrPictureBase64/URL). Note: Supports a combination of Chinese characters with a minimum length of 1 character. No special characters are allowed, except for the middle dot (·) used in ethnic minority names.</p>
     * 
     * <strong>example:</strong>
     * <p>Zhang**</p>
     */
    @NameInMap("DocName")
    public String docName;

    /**
     * <p>The document number of the user. When Authorize=\&quot;T\&quot; and the document type is a mainland China ID card, you must provide at least one of the following: key document information (DocName, DocNo) or document images (IdOcrPictureBase64/URL). Note: Supports a combination of letters and numbers with a length of 18 characters.</p>
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
     * <li>If you choose this method to pass in the face image, check the photo size and do not pass in an excessively large photo.</li>
     * <li>Specify one of the following parameters: FacePictureBase64, FacePictureUrl, or FacePictureFile.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Base64</p>
     */
    @NameInMap("FacePictureBase64")
    public String facePictureBase64;

    /**
     * <p>The file stream of the face photo.</p>
     * 
     * <strong>example:</strong>
     * <p>InputStream</p>
     */
    @NameInMap("FacePictureFile")
    public java.io.InputStream facePictureFileObject;

    /**
     * <p>The URL of the face photo.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://digital-face-prod8.oss-cn-hangzhou.aliyuncs.com/1669520556530-expo/default/face/20221127114236530_w3kx2e6t.jpg">https://digital-face-prod8.oss-cn-hangzhou.aliyuncs.com/1669520556530-expo/default/face/20221127114236530_w3kx2e6t.jpg</a></p>
     */
    @NameInMap("FacePictureUrl")
    public String facePictureUrl;

    /**
     * <p>Specifies whether to enable face quality detection.</p>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("FaceQualityCheck")
    public String faceQualityCheck;

    /**
     * <p>The Base64-encoded identity document image. Note:</p>
     * <ul>
     * <li>If you choose this method to pass in the document image, check the photo size and do not pass in an excessively large photo.</li>
     * <li>Specify one of the following parameters: IdOcrPictureBase64, IdOcrPictureUrl, or IdOcrPictureFile.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>base64</p>
     */
    @NameInMap("IdOcrPictureBase64")
    public String idOcrPictureBase64;

    /**
     * <p>The file stream of the front side of the identity document image.</p>
     * 
     * <strong>example:</strong>
     * <p>InputStream</p>
     */
    @NameInMap("IdOcrPictureFile")
    public java.io.InputStream idOcrPictureFileObject;

    /**
     * <p>The URL of the front side of the identity document image.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://digital-cardocr-prod8.oss-cn-hangzhou.aliyuncs.com/1669520556530-expo/default/face/20221127114236530_w3kx2e6t.jpg">https://digital-cardocr-prod8.oss-cn-hangzhou.aliyuncs.com/1669520556530-expo/default/face/20221127114236530_w3kx2e6t.jpg</a></p>
     */
    @NameInMap("IdOcrPictureUrl")
    public String idOcrPictureUrl;

    /**
     * <p>Specifies whether to enable document anti-spoofing.</p>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
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
     * <p>A custom business unique identifier defined by the merchant, used for subsequent issue tracking and troubleshooting. Supports a combination of letters and numbers up to 32 characters in length. Ensure that this value is unique.</p>
     * 
     * <strong>example:</strong>
     * <p>e0c34a77f5ac40a5aa5e6ed20c353888</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    /**
     * <p>A custom user ID or other identifier that can identify a specific user, such as a phone number or email address. We strongly recommend that you desensitize the value of this field in advance, for example, by hashing the value.</p>
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

    public static EkycVerifyV2AdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        EkycVerifyV2AdvanceRequest self = new EkycVerifyV2AdvanceRequest();
        return TeaModel.build(map, self);
    }

    public EkycVerifyV2AdvanceRequest setAuthorize(String authorize) {
        this.authorize = authorize;
        return this;
    }
    public String getAuthorize() {
        return this.authorize;
    }

    public EkycVerifyV2AdvanceRequest setCrop(String crop) {
        this.crop = crop;
        return this;
    }
    public String getCrop() {
        return this.crop;
    }

    public EkycVerifyV2AdvanceRequest setDocName(String docName) {
        this.docName = docName;
        return this;
    }
    public String getDocName() {
        return this.docName;
    }

    public EkycVerifyV2AdvanceRequest setDocNo(String docNo) {
        this.docNo = docNo;
        return this;
    }
    public String getDocNo() {
        return this.docNo;
    }

    public EkycVerifyV2AdvanceRequest setDocType(String docType) {
        this.docType = docType;
        return this;
    }
    public String getDocType() {
        return this.docType;
    }

    public EkycVerifyV2AdvanceRequest setFacePictureBase64(String facePictureBase64) {
        this.facePictureBase64 = facePictureBase64;
        return this;
    }
    public String getFacePictureBase64() {
        return this.facePictureBase64;
    }

    public EkycVerifyV2AdvanceRequest setFacePictureFileObject(java.io.InputStream facePictureFileObject) {
        this.facePictureFileObject = facePictureFileObject;
        return this;
    }
    public java.io.InputStream getFacePictureFileObject() {
        return this.facePictureFileObject;
    }

    public EkycVerifyV2AdvanceRequest setFacePictureUrl(String facePictureUrl) {
        this.facePictureUrl = facePictureUrl;
        return this;
    }
    public String getFacePictureUrl() {
        return this.facePictureUrl;
    }

    public EkycVerifyV2AdvanceRequest setFaceQualityCheck(String faceQualityCheck) {
        this.faceQualityCheck = faceQualityCheck;
        return this;
    }
    public String getFaceQualityCheck() {
        return this.faceQualityCheck;
    }

    public EkycVerifyV2AdvanceRequest setIdOcrPictureBase64(String idOcrPictureBase64) {
        this.idOcrPictureBase64 = idOcrPictureBase64;
        return this;
    }
    public String getIdOcrPictureBase64() {
        return this.idOcrPictureBase64;
    }

    public EkycVerifyV2AdvanceRequest setIdOcrPictureFileObject(java.io.InputStream idOcrPictureFileObject) {
        this.idOcrPictureFileObject = idOcrPictureFileObject;
        return this;
    }
    public java.io.InputStream getIdOcrPictureFileObject() {
        return this.idOcrPictureFileObject;
    }

    public EkycVerifyV2AdvanceRequest setIdOcrPictureUrl(String idOcrPictureUrl) {
        this.idOcrPictureUrl = idOcrPictureUrl;
        return this;
    }
    public String getIdOcrPictureUrl() {
        return this.idOcrPictureUrl;
    }

    public EkycVerifyV2AdvanceRequest setIdSpoof(String idSpoof) {
        this.idSpoof = idSpoof;
        return this;
    }
    public String getIdSpoof() {
        return this.idSpoof;
    }

    public EkycVerifyV2AdvanceRequest setIdThreshold(String idThreshold) {
        this.idThreshold = idThreshold;
        return this;
    }
    public String getIdThreshold() {
        return this.idThreshold;
    }

    public EkycVerifyV2AdvanceRequest setMerchantBizId(String merchantBizId) {
        this.merchantBizId = merchantBizId;
        return this;
    }
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    public EkycVerifyV2AdvanceRequest setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId;
        return this;
    }
    public String getMerchantUserId() {
        return this.merchantUserId;
    }

    public EkycVerifyV2AdvanceRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
