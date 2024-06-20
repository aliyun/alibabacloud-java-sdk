// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class FaceLivenessRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>T</p>
     */
    @NameInMap("Crop")
    public String crop;

    @NameInMap("FacePictureBase64")
    public String facePictureBase64;

    /**
     * <strong>example:</strong>
     * <p><a href="https://digital-face-prod8.oss-cn-hangzhou.aliyuncs.com/1669520556530-expo/default/face/20221127114236530_w3kx2e6t.jpg">https://digital-face-prod8.oss-cn-hangzhou.aliyuncs.com/1669520556530-expo/default/face/20221127114236530_w3kx2e6t.jpg</a></p>
     */
    @NameInMap("FacePictureUrl")
    public String facePictureUrl;

    /**
     * <strong>example:</strong>
     * <p>T</p>
     */
    @NameInMap("FaceQuality")
    public String faceQuality;

    /**
     * <strong>example:</strong>
     * <p>e0c34a77f5ac40a5aa5e6ed20c353888</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    /**
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("MerchantUserId")
    public String merchantUserId;

    /**
     * <strong>example:</strong>
     * <p>T</p>
     */
    @NameInMap("Occlusion")
    public String occlusion;

    /**
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
