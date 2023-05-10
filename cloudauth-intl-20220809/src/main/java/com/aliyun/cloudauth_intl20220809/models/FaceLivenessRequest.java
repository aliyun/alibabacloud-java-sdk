// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class FaceLivenessRequest extends TeaModel {
    @NameInMap("Crop")
    public String crop;

    @NameInMap("FacePictureBase64")
    public String facePictureBase64;

    @NameInMap("FacePictureUrl")
    public String facePictureUrl;

    @NameInMap("FaceQuality")
    public String faceQuality;

    @NameInMap("MerchantBizId")
    public String merchantBizId;

    @NameInMap("MerchantUserId")
    public String merchantUserId;

    @NameInMap("Occlusion")
    public String occlusion;

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
