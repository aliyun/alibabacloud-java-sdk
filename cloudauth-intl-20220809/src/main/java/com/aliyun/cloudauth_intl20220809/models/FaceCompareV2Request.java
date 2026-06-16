// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class FaceCompareV2Request extends TeaModel {
    /**
     * <p>Specifies whether to enable quality check for the input face images.</p>
     * <blockquote>
     * <p>Danger: Deprecated.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>N</p>
     */
    @NameInMap("FacePictureQualityCheck")
    public String facePictureQualityCheck;

    /**
     * <p>Specifies whether to enable face quality check.</p>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("FaceQualityCheck")
    public String faceQualityCheck;

    /**
     * <p>The merchant-defined unique business ID used for subsequent troubleshooting. The value can be a combination of letters and numbers with a maximum length of 32 characters. Ensure that the value is unique.</p>
     * 
     * <strong>example:</strong>
     * <p>e0c34a77f5ac40a5aa5e6ed20c353888</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    /**
     * <p>The Base64-encoded source face image.</p>
     * <blockquote>
     * <p><strong>Note</strong></p>
     * </blockquote>
     * <ul>
     * <li>If you use this method to pass in the image, check the image size and do not pass in an excessively large image.</li>
     * <li>Specify one of the following parameters: SourceFacePicture, SourceFacePictureUrl, or SourceFacePictureFile.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>base64</p>
     */
    @NameInMap("SourceFacePicture")
    public String sourceFacePicture;

    /**
     * <p>The file stream of the source face image.</p>
     * 
     * <strong>example:</strong>
     * <p>InputStream</p>
     */
    @NameInMap("SourceFacePictureFile")
    public String sourceFacePictureFile;

    /**
     * <p>The HTTPS or HTTP URL of the source face image.</p>
     * 
     * <strong>example:</strong>
     * <p>https://***face1.jpeg</p>
     */
    @NameInMap("SourceFacePictureUrl")
    public String sourceFacePictureUrl;

    /**
     * <p>The Base64-encoded reference face image.</p>
     * <blockquote>
     * <p><strong>Note</strong></p>
     * </blockquote>
     * <ul>
     * <li>If you use this method to pass in the image, check the image size and do not pass in an excessively large image.</li>
     * <li>Specify one of the following parameters: TargetFacePicture, TargetFacePictureUrl, or TargetFacePictureFile.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>base64</p>
     */
    @NameInMap("TargetFacePicture")
    public String targetFacePicture;

    /**
     * <p>The file stream of the reference face image.</p>
     * 
     * <strong>example:</strong>
     * <p>InputStream</p>
     */
    @NameInMap("TargetFacePictureFile")
    public String targetFacePictureFile;

    /**
     * <p>The HTTPS or HTTP URL of the reference face image.</p>
     * 
     * <strong>example:</strong>
     * <p>https://***face2.jpeg</p>
     */
    @NameInMap("TargetFacePictureUrl")
    public String targetFacePictureUrl;

    public static FaceCompareV2Request build(java.util.Map<String, ?> map) throws Exception {
        FaceCompareV2Request self = new FaceCompareV2Request();
        return TeaModel.build(map, self);
    }

    public FaceCompareV2Request setFacePictureQualityCheck(String facePictureQualityCheck) {
        this.facePictureQualityCheck = facePictureQualityCheck;
        return this;
    }
    public String getFacePictureQualityCheck() {
        return this.facePictureQualityCheck;
    }

    public FaceCompareV2Request setFaceQualityCheck(String faceQualityCheck) {
        this.faceQualityCheck = faceQualityCheck;
        return this;
    }
    public String getFaceQualityCheck() {
        return this.faceQualityCheck;
    }

    public FaceCompareV2Request setMerchantBizId(String merchantBizId) {
        this.merchantBizId = merchantBizId;
        return this;
    }
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    public FaceCompareV2Request setSourceFacePicture(String sourceFacePicture) {
        this.sourceFacePicture = sourceFacePicture;
        return this;
    }
    public String getSourceFacePicture() {
        return this.sourceFacePicture;
    }

    public FaceCompareV2Request setSourceFacePictureFile(String sourceFacePictureFile) {
        this.sourceFacePictureFile = sourceFacePictureFile;
        return this;
    }
    public String getSourceFacePictureFile() {
        return this.sourceFacePictureFile;
    }

    public FaceCompareV2Request setSourceFacePictureUrl(String sourceFacePictureUrl) {
        this.sourceFacePictureUrl = sourceFacePictureUrl;
        return this;
    }
    public String getSourceFacePictureUrl() {
        return this.sourceFacePictureUrl;
    }

    public FaceCompareV2Request setTargetFacePicture(String targetFacePicture) {
        this.targetFacePicture = targetFacePicture;
        return this;
    }
    public String getTargetFacePicture() {
        return this.targetFacePicture;
    }

    public FaceCompareV2Request setTargetFacePictureFile(String targetFacePictureFile) {
        this.targetFacePictureFile = targetFacePictureFile;
        return this;
    }
    public String getTargetFacePictureFile() {
        return this.targetFacePictureFile;
    }

    public FaceCompareV2Request setTargetFacePictureUrl(String targetFacePictureUrl) {
        this.targetFacePictureUrl = targetFacePictureUrl;
        return this;
    }
    public String getTargetFacePictureUrl() {
        return this.targetFacePictureUrl;
    }

}
