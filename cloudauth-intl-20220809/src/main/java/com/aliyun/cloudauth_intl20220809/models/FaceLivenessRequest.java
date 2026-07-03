// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class FaceLivenessRequest extends TeaModel {
    /**
     * <p>Specifies whether to allow cropping. Default value: F. Valid values:</p>
     * <ul>
     * <li>T: Allow cropping.</li>
     * <li>F: Do not allow cropping.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>T</p>
     */
    @NameInMap("Crop")
    public String crop;

    /**
     * <p>The Base64-encoded face photo.</p>
     * <p>Note:</p>
     * <ul>
     * <li>If you use FacePictureBase64 (Base64-encoded photo) to pass in the face photo, check the photo size and do not pass in an excessively large photo.</li>
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

    /**
     * <p>Specifies whether to output the face quality score. Default value: F. Valid values:</p>
     * <ul>
     * <li>T: Output the face quality score.</li>
     * <li>F: Do not output the face quality score.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>T</p>
     */
    @NameInMap("FaceQuality")
    public String faceQuality;

    /**
     * <p>Specifies whether to perform a face quality check.</p>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("FaceQualityCheck")
    public String faceQualityCheck;

    /**
     * <p>The merchant-defined unique business ID for subsequent troubleshooting. The value supports a combination of letters and numbers with a maximum length of 32 characters. Ensure that the value is unique.</p>
     * 
     * <strong>example:</strong>
     * <p>e0c34a77f5ac40a5aa5e6ed20c353888</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    /**
     * <p>The merchant user ID or other identifier that can be used to identify a specific user, such as a phone number or email address. We strongly recommend that you pre-desensitize the value of the userId field, such as by hashing the value.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("MerchantUserId")
    public String merchantUserId;

    /**
     * <p>Specifies whether to perform occlusion detection. Default value: F. Valid values:</p>
     * <ul>
     * <li>T: Perform occlusion detection.</li>
     * <li>F: Do not perform occlusion detection.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>T</p>
     */
    @NameInMap("Occlusion")
    public String occlusion;

    /**
     * <p>The product code.</p>
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

    public FaceLivenessRequest setFaceQualityCheck(String faceQualityCheck) {
        this.faceQualityCheck = faceQualityCheck;
        return this;
    }
    public String getFaceQualityCheck() {
        return this.faceQualityCheck;
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
