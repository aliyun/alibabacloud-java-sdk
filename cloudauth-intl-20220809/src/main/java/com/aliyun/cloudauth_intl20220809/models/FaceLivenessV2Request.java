// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class FaceLivenessV2Request extends TeaModel {
    @NameInMap("FaceAttributeCheck")
    public String faceAttributeCheck;

    /**
     * <p>The Base64-encoded face image.</p>
     * <blockquote>
     * <p><strong>Note</strong></p>
     * </blockquote>
     * <ul>
     * <li>If you use this method to pass in the image, check the image size and do not pass in an excessively large image.</li>
     * <li>Specify one of the following parameters: FacePictureBase64, FacePictureUrl, or FacePictureFile.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Base64</p>
     */
    @NameInMap("FacePictureBase64")
    public String facePictureBase64;

    /**
     * <p>The file stream of the face image.</p>
     * 
     * <strong>example:</strong>
     * <p>InputStream</p>
     */
    @NameInMap("FacePictureFile")
    public String facePictureFile;

    /**
     * <p>The URL of the face image. The URL must be a publicly accessible HTTPS URL.</p>
     * 
     * <strong>example:</strong>
     * <p>https://***</p>
     */
    @NameInMap("FacePictureUrl")
    public String facePictureUrl;

    /**
     * <p>Specifies whether to check the quality of the face image. Valid values:</p>
     * <ul>
     * <li>Y: enabled.</li>
     * <li>N: disabled. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("FaceQualityCheck")
    public String faceQualityCheck;

    /**
     * <p>The merchant-defined unique business ID for subsequent troubleshooting. The value can be a combination of letters and digits with a maximum length of 32 characters. Make sure the value is unique.</p>
     * 
     * <strong>example:</strong>
     * <p>e0c34a***353888</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    /**
     * <p>The custom user ID or another identifier that can identify a specific user, such as a phone number or email address. We strongly recommend that you desensitize the value of this field in advance, for example, by hashing the value.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("MerchantUserId")
    public String merchantUserId;

    /**
     * <p>The product plan to use. Valid values: FACE_LIVENESS_MIN_PRO and FACE_LIVENESS_MIN.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FACE_LIVENESS_MIN_PRO</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    public static FaceLivenessV2Request build(java.util.Map<String, ?> map) throws Exception {
        FaceLivenessV2Request self = new FaceLivenessV2Request();
        return TeaModel.build(map, self);
    }

    public FaceLivenessV2Request setFaceAttributeCheck(String faceAttributeCheck) {
        this.faceAttributeCheck = faceAttributeCheck;
        return this;
    }
    public String getFaceAttributeCheck() {
        return this.faceAttributeCheck;
    }

    public FaceLivenessV2Request setFacePictureBase64(String facePictureBase64) {
        this.facePictureBase64 = facePictureBase64;
        return this;
    }
    public String getFacePictureBase64() {
        return this.facePictureBase64;
    }

    public FaceLivenessV2Request setFacePictureFile(String facePictureFile) {
        this.facePictureFile = facePictureFile;
        return this;
    }
    public String getFacePictureFile() {
        return this.facePictureFile;
    }

    public FaceLivenessV2Request setFacePictureUrl(String facePictureUrl) {
        this.facePictureUrl = facePictureUrl;
        return this;
    }
    public String getFacePictureUrl() {
        return this.facePictureUrl;
    }

    public FaceLivenessV2Request setFaceQualityCheck(String faceQualityCheck) {
        this.faceQualityCheck = faceQualityCheck;
        return this;
    }
    public String getFaceQualityCheck() {
        return this.faceQualityCheck;
    }

    public FaceLivenessV2Request setMerchantBizId(String merchantBizId) {
        this.merchantBizId = merchantBizId;
        return this;
    }
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    public FaceLivenessV2Request setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId;
        return this;
    }
    public String getMerchantUserId() {
        return this.merchantUserId;
    }

    public FaceLivenessV2Request setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
