// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class FaceLivenessV2AdvanceRequest extends TeaModel {
    /**
     * <p>Specifies whether to detect face attributes.</p>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("FaceAttributeCheck")
    public String faceAttributeCheck;

    /**
     * <p>The Base64-encoded face image.</p>
     * <p>Note</p>
     * <ul>
     * <li>If you choose this method to pass the face image, check the image size and do not pass oversized images.</li>
     * <li>Specify only one of the following parameters: FacePictureBase64, FacePictureUrl, and FacePictureFile.</li>
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
     * <p>The URL of the face photo. The URL must be a publicly accessible HTTPS link.</p>
     * 
     * <strong>example:</strong>
     * <p>https://***</p>
     */
    @NameInMap("FacePictureUrl")
    public String facePictureUrl;

    /**
     * <p>Specifies whether to check the quality of the face image. Valid values:</p>
     * <ul>
     * <li>Y: enabled</li>
     * <li>N: disabled (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("FaceQualityCheck")
    public String faceQualityCheck;

    /**
     * <p>The custom unique business identifier on the merchant side, which is used for subsequent troubleshooting. The value can contain letters and digits and must be up to 32 characters in length. Make sure that the value is unique.</p>
     * 
     * <strong>example:</strong>
     * <p>e0c34a***353888</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    /**
     * <p>The custom user ID or another identifier that can identify a specific user, such as a mobile phone number or an email address. Desensitize the value of this field in advance, such as by hashing the value.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("MerchantUserId")
    public String merchantUserId;

    /**
     * <p>The product solution to be integrated. Valid values: FACE_LIVENESS_MIN_PRO and FACE_LIVENESS_MIN.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FACE_LIVENESS_MIN_PRO</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    public static FaceLivenessV2AdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        FaceLivenessV2AdvanceRequest self = new FaceLivenessV2AdvanceRequest();
        return TeaModel.build(map, self);
    }

    public FaceLivenessV2AdvanceRequest setFaceAttributeCheck(String faceAttributeCheck) {
        this.faceAttributeCheck = faceAttributeCheck;
        return this;
    }
    public String getFaceAttributeCheck() {
        return this.faceAttributeCheck;
    }

    public FaceLivenessV2AdvanceRequest setFacePictureBase64(String facePictureBase64) {
        this.facePictureBase64 = facePictureBase64;
        return this;
    }
    public String getFacePictureBase64() {
        return this.facePictureBase64;
    }

    public FaceLivenessV2AdvanceRequest setFacePictureFileObject(java.io.InputStream facePictureFileObject) {
        this.facePictureFileObject = facePictureFileObject;
        return this;
    }
    public java.io.InputStream getFacePictureFileObject() {
        return this.facePictureFileObject;
    }

    public FaceLivenessV2AdvanceRequest setFacePictureUrl(String facePictureUrl) {
        this.facePictureUrl = facePictureUrl;
        return this;
    }
    public String getFacePictureUrl() {
        return this.facePictureUrl;
    }

    public FaceLivenessV2AdvanceRequest setFaceQualityCheck(String faceQualityCheck) {
        this.faceQualityCheck = faceQualityCheck;
        return this;
    }
    public String getFaceQualityCheck() {
        return this.faceQualityCheck;
    }

    public FaceLivenessV2AdvanceRequest setMerchantBizId(String merchantBizId) {
        this.merchantBizId = merchantBizId;
        return this;
    }
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    public FaceLivenessV2AdvanceRequest setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId;
        return this;
    }
    public String getMerchantUserId() {
        return this.merchantUserId;
    }

    public FaceLivenessV2AdvanceRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
