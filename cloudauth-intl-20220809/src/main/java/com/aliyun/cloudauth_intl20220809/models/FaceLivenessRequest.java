// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class FaceLivenessRequest extends TeaModel {
    /**
     * <p>Specifies whether to crop the facial image. The default value is F.</p>
     * <ul>
     * <li><p><strong>T</strong>: allows cropping.</p>
     * </li>
     * <li><p><strong>F</strong>: Forbidden</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>T</p>
     */
    @NameInMap("Crop")
    public String crop;

    @NameInMap("FacePictureBase64")
    public String facePictureBase64;

    /**
     * <p>The URL of the portrait image. The URL must be an HTTP or HTTPS link accessible over the Internet.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://digital-face-prod8.oss-cn-hangzhou.aliyuncs.com/1669520556530-expo/default/face/20221127114236530_w3kx2e6t.jpg">https://digital-face-prod8.oss-cn-hangzhou.aliyuncs.com/1669520556530-expo/default/face/20221127114236530_w3kx2e6t.jpg</a></p>
     */
    @NameInMap("FacePictureUrl")
    public String facePictureUrl;

    /**
     * <p>Specifies whether to return the facial image quality score. The default value is F.</p>
     * <ul>
     * <li><p><strong>T</strong>: returns the score.</p>
     * </li>
     * <li><p><strong>F</strong>: does not return the score.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>T</p>
     */
    @NameInMap("FaceQuality")
    public String faceQuality;

    /**
     * <p>A custom unique business identifier. You can use this identifier to track and troubleshoot issues. The identifier can be up to 32 characters in length and can contain letters and digits. Make sure the identifier is unique.</p>
     * <blockquote>
     * <p>Alibaba Cloud servers do not check the uniqueness of this value. For better tracking, ensure this value is unique.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>e0c34a77f5ac40a5aa5e6ed20c353888</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    /**
     * <p>A  custom user ID or another identifier for a specific user, such as a mobile number or email address. For security, desensitize this value in advance, for example, by hashing it.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("MerchantUserId")
    public String merchantUserId;

    /**
     * <p>Specifies whether to enable occlusion detection. The default value is F.</p>
     * <ul>
     * <li><p><strong>T</strong>: enables the feature.</p>
     * </li>
     * <li><p><strong>F</strong>: disables the feature.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>T</p>
     */
    @NameInMap("Occlusion")
    public String occlusion;

    /**
     * <p>The product solution to use. Set the value to <strong>FACE_LIVENESS_MIN</strong> to use the passive liveness detection API.</p>
     * 
     * <strong>example:</strong>
     * <p>FACE_LIVENESS_MIN</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    public static FaceLivenessRequest build(java.util.Map<String, ?> map) throws Exception {
        FaceLivenessRequest self = new FaceLivenessRequest();
        return TeaModel.build(map, self);
    }

    public FaceLivenessRequest setCrop(String crop) {
        this.crop = crop;
        return this;
    }
    public String getCrop() {
        return this.crop;
    }

    public FaceLivenessRequest setFacePictureBase64(String facePictureBase64) {
        this.facePictureBase64 = facePictureBase64;
        return this;
    }
    public String getFacePictureBase64() {
        return this.facePictureBase64;
    }

    public FaceLivenessRequest setFacePictureUrl(String facePictureUrl) {
        this.facePictureUrl = facePictureUrl;
        return this;
    }
    public String getFacePictureUrl() {
        return this.facePictureUrl;
    }

    public FaceLivenessRequest setFaceQuality(String faceQuality) {
        this.faceQuality = faceQuality;
        return this;
    }
    public String getFaceQuality() {
        return this.faceQuality;
    }

    public FaceLivenessRequest setMerchantBizId(String merchantBizId) {
        this.merchantBizId = merchantBizId;
        return this;
    }
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    public FaceLivenessRequest setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId;
        return this;
    }
    public String getMerchantUserId() {
        return this.merchantUserId;
    }

    public FaceLivenessRequest setOcclusion(String occlusion) {
        this.occlusion = occlusion;
        return this;
    }
    public String getOcclusion() {
        return this.occlusion;
    }

    public FaceLivenessRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
